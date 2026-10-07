package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.h9;
import com.cmaster.cloner.md1;
import com.cmaster.cloner.nz;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ScatterZipOutputStream implements Closeable {
    private final md1 backingStore;
    private final Queue<CompressedEntry> items = new ConcurrentLinkedQueue();
    private final StreamCompressor streamCompressor;

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static class CompressedEntry {
        final long compressedSize;
        final long crc;
        final long size;
        final ZipArchiveEntryRequest zipArchiveEntryRequest;

        public CompressedEntry(ZipArchiveEntryRequest zipArchiveEntryRequest, long j, long j2, long j3) {
            this.zipArchiveEntryRequest = zipArchiveEntryRequest;
            this.crc = j;
            this.compressedSize = j2;
            this.size = j3;
        }

        public ZipArchiveEntry transferToArchiveEntry() {
            ZipArchiveEntry zipArchiveEntry = this.zipArchiveEntryRequest.getZipArchiveEntry();
            zipArchiveEntry.setCompressedSize(this.compressedSize);
            zipArchiveEntry.setSize(this.size);
            zipArchiveEntry.setCrc(this.crc);
            zipArchiveEntry.setMethod(this.zipArchiveEntryRequest.getMethod());
            return zipArchiveEntry;
        }
    }

    public ScatterZipOutputStream(md1 md1Var, StreamCompressor streamCompressor) {
        this.backingStore = md1Var;
        this.streamCompressor = streamCompressor;
    }

    public static ScatterZipOutputStream fileBased(File file, int i) {
        nz nzVar = new nz(file);
        return new ScatterZipOutputStream(nzVar, StreamCompressor.create(i, nzVar));
    }

    public void addArchiveEntry(ZipArchiveEntryRequest zipArchiveEntryRequest) throws IOException {
        InputStream payloadStream = zipArchiveEntryRequest.getPayloadStream();
        try {
            this.streamCompressor.deflate(payloadStream, zipArchiveEntryRequest.getMethod());
            payloadStream.close();
            this.items.add(new CompressedEntry(zipArchiveEntryRequest, this.streamCompressor.getCrc32(), this.streamCompressor.getBytesWrittenForLastEntry(), this.streamCompressor.getBytesRead()));
        } catch (Throwable th) {
            payloadStream.close();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((nz) this.backingStore).close();
    }

    public void writeTo(ZipArchiveOutputStream zipArchiveOutputStream) throws IOException {
        nz nzVar = (nz) this.backingStore;
        if (!nzVar.OooO0o) {
            nzVar.OooO0o0.close();
            nzVar.OooO0o = true;
        }
        nz nzVar2 = (nz) this.backingStore;
        nzVar2.getClass();
        FileInputStream fileInputStream = new FileInputStream(nzVar2.OooO0Oo);
        for (CompressedEntry compressedEntry : this.items) {
            zipArchiveOutputStream.addRawArchiveEntry(compressedEntry.transferToArchiveEntry(), new h9(fileInputStream, compressedEntry.compressedSize));
        }
        fileInputStream.close();
    }

    public static ScatterZipOutputStream fileBased(File file) {
        return fileBased(file, -1);
    }
}

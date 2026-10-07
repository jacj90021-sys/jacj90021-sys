package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.md1;
import com.cmaster.cloner.nz;
import java.io.Closeable;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class StreamCompressor implements Closeable {
    private static final int DEFLATER_BLOCK_SIZE = 8192;
    private static final int bufferSize = 4096;
    private final Deflater def;
    private final CRC32 crc = new CRC32();
    private long writtenToOutputStreamForLastEntry = 0;
    private long sourcePayloadLength = 0;
    private long totalWrittenToOutputStream = 0;
    private final byte[] outputBuffer = new byte[bufferSize];
    private final byte[] readerBuf = new byte[bufferSize];

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class DataOutputCompressor extends StreamCompressor {
        private final DataOutput raf;

        public DataOutputCompressor(Deflater deflater, DataOutput dataOutput) {
            super(deflater);
            this.raf = dataOutput;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.raf.write(bArr, i, i2);
        }
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class OutputStreamCompressor extends StreamCompressor {
        private final OutputStream os;

        public OutputStreamCompressor(Deflater deflater, OutputStream outputStream) {
            super(deflater);
            this.os = outputStream;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            this.os.write(bArr, i, i2);
        }
    }

    /* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
    public static final class ScatterGatherBackingStoreCompressor extends StreamCompressor {
        private final md1 bs;

        public ScatterGatherBackingStoreCompressor(Deflater deflater, md1 md1Var) {
            super(deflater);
            this.bs = md1Var;
        }

        @Override // org.apache.commons.compress.archivers.zip.StreamCompressor
        public final void writeOut(byte[] bArr, int i, int i2) throws IOException {
            ((nz) this.bs).OooO0o0.write(bArr, i, i2);
        }
    }

    public StreamCompressor(Deflater deflater) {
        this.def = deflater;
    }

    public static StreamCompressor create(OutputStream outputStream) {
        return create(outputStream, new Deflater(-1, true));
    }

    private void deflateUntilInputIsNeeded() {
        while (!this.def.needsInput()) {
            deflate();
        }
    }

    private void writeDeflated(byte[] bArr, int i, int i2) {
        if (i2 <= 0 || this.def.finished()) {
            return;
        }
        if (i2 <= DEFLATER_BLOCK_SIZE) {
            this.def.setInput(bArr, i, i2);
            deflateUntilInputIsNeeded();
            return;
        }
        int i3 = i2 / DEFLATER_BLOCK_SIZE;
        for (int i4 = 0; i4 < i3; i4++) {
            this.def.setInput(bArr, (i4 * DEFLATER_BLOCK_SIZE) + i, DEFLATER_BLOCK_SIZE);
            deflateUntilInputIsNeeded();
        }
        int i5 = i3 * DEFLATER_BLOCK_SIZE;
        if (i5 < i2) {
            this.def.setInput(bArr, i + i5, i2 - i5);
            deflateUntilInputIsNeeded();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.def.end();
    }

    public void deflate(InputStream inputStream, int i) throws IOException {
        reset();
        while (true) {
            byte[] bArr = this.readerBuf;
            int i2 = inputStream.read(bArr, 0, bArr.length);
            if (i2 < 0) {
                break;
            } else {
                write(this.readerBuf, 0, i2, i);
            }
        }
        if (i == 8) {
            flushDeflater();
        }
    }

    public void flushDeflater() {
        this.def.finish();
        while (!this.def.finished()) {
            deflate();
        }
    }

    public long getBytesRead() {
        return this.sourcePayloadLength;
    }

    public long getBytesWrittenForLastEntry() {
        return this.writtenToOutputStreamForLastEntry;
    }

    public long getCrc32() {
        return this.crc.getValue();
    }

    public long getTotalBytesWritten() {
        return this.totalWrittenToOutputStream;
    }

    public void reset() {
        this.crc.reset();
        this.def.reset();
        this.sourcePayloadLength = 0L;
        this.writtenToOutputStreamForLastEntry = 0L;
    }

    public long write(byte[] bArr, int i, int i2, int i3) {
        long j = this.writtenToOutputStreamForLastEntry;
        this.crc.update(bArr, i, i2);
        if (i3 == 8) {
            writeDeflated(bArr, i, i2);
        } else {
            writeCounted(bArr, i, i2);
        }
        this.sourcePayloadLength += i2;
        return this.writtenToOutputStreamForLastEntry - j;
    }

    public void writeCounted(byte[] bArr, int i, int i2) {
        writeOut(bArr, i, i2);
        long j = i2;
        this.writtenToOutputStreamForLastEntry += j;
        this.totalWrittenToOutputStream += j;
    }

    public abstract void writeOut(byte[] bArr, int i, int i2);

    public static StreamCompressor create(OutputStream outputStream, Deflater deflater) {
        return new OutputStreamCompressor(deflater, outputStream);
    }

    public static StreamCompressor create(DataOutput dataOutput, Deflater deflater) {
        return new DataOutputCompressor(deflater, dataOutput);
    }

    public static StreamCompressor create(int i, md1 md1Var) {
        return new ScatterGatherBackingStoreCompressor(new Deflater(i, true), md1Var);
    }

    public void writeCounted(byte[] bArr) {
        writeCounted(bArr, 0, bArr.length);
    }

    public static StreamCompressor create(md1 md1Var) {
        return create(-1, md1Var);
    }

    public void deflate() {
        Deflater deflater = this.def;
        byte[] bArr = this.outputBuffer;
        int iDeflate = deflater.deflate(bArr, 0, bArr.length);
        if (iDeflate > 0) {
            writeCounted(this.outputBuffer, 0, iDeflate);
        }
    }
}

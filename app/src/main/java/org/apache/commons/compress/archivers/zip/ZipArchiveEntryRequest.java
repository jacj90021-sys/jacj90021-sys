package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.xg0;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ZipArchiveEntryRequest {
    private final int method;
    private final xg0 payloadSupplier;
    private final ZipArchiveEntry zipArchiveEntry;

    private ZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, xg0 xg0Var) {
        this.zipArchiveEntry = zipArchiveEntry;
        this.method = zipArchiveEntry.getMethod();
    }

    public static ZipArchiveEntryRequest createZipArchiveEntryRequest(ZipArchiveEntry zipArchiveEntry, xg0 xg0Var) {
        return new ZipArchiveEntryRequest(zipArchiveEntry, xg0Var);
    }

    public int getMethod() {
        return this.method;
    }

    public InputStream getPayloadStream() {
        throw null;
    }

    public ZipArchiveEntry getZipArchiveEntry() {
        return this.zipArchiveEntry;
    }
}

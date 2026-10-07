package org.apache.commons.compress.archivers.zip;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class ScatterStatistics {
    private final long compressionElapsed;
    private final long mergingElapsed;

    public ScatterStatistics(long j, long j2) {
        this.compressionElapsed = j;
        this.mergingElapsed = j2;
    }

    public long getCompressionElapsed() {
        return this.compressionElapsed;
    }

    public long getMergingElapsed() {
        return this.mergingElapsed;
    }

    public String toString() {
        return "compressionElapsed=" + this.compressionElapsed + "ms, mergingElapsed=" + this.mergingElapsed + "ms";
    }
}

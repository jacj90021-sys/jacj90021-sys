package com.cmaster.cloner;

import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a3 extends InputStream {
    private static final int BYTE_MASK = 255;
    private final byte[] SINGLE = new byte[1];
    private long bytesRead = 0;

    public void count(long j) {
        if (j != -1) {
            this.bytesRead += j;
        }
    }

    public long getBytesRead() {
        return this.bytesRead;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesRead;
    }

    public void pushedBackBytes(long j) {
        this.bytesRead -= j;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.SINGLE, 0, 1) == -1) {
            return -1;
        }
        return this.SINGLE[0] & 255;
    }

    public void count(int i) {
        count(i);
    }
}

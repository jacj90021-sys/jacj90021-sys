package com.cmaster.cloner;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class b3 extends OutputStream {
    static final int BYTE_MASK = 255;
    private final byte[] oneByte = new byte[1];
    private long bytesWritten = 0;

    public void count(long j) {
        if (j != -1) {
            this.bytesWritten += j;
        }
    }

    public long getBytesWritten() {
        return this.bytesWritten;
    }

    @Deprecated
    public int getCount() {
        return (int) this.bytesWritten;
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.oneByte;
        bArr[0] = (byte) (i & BYTE_MASK);
        write(bArr, 0, 1);
    }

    public void count(int i) {
        count(i);
    }
}

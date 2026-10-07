package com.cmaster.cloner;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class si extends FilterInputStream {
    public final long OooO0Oo;
    public int OooO0o0;

    public si(InputStream inputStream, long j) {
        super(inputStream);
        this.OooO0Oo = j;
    }

    public final void OooO0OO(int i) throws IOException {
        int i2 = this.OooO0o0;
        if (i >= 0) {
            this.OooO0o0 = i2 + i;
            return;
        }
        long j = this.OooO0Oo;
        if (j - i2 <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.OooO0o0);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.OooO0Oo - this.OooO0o0, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        OooO0OO(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        OooO0OO(i3);
        return i3;
    }
}

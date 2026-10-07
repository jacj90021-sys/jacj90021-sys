package com.cmaster.cloner;

import java.io.FilterInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yp0 extends FilterInputStream {
    public int OooO0Oo;

    public yp0(cx cxVar) {
        super(cxVar);
        this.OooO0Oo = Integer.MIN_VALUE;
    }

    public final long OooO0OO(long j) {
        int i = this.OooO0Oo;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void OooO0o(long j) {
        int i = this.OooO0Oo;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.OooO0Oo = (int) (i - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.OooO0Oo;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.OooO0Oo = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (OooO0OO(1L) == -1) {
            return -1;
        }
        int i = super.read();
        OooO0o(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.OooO0Oo = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jOooO0OO = OooO0OO(j);
        if (jOooO0OO == -1) {
            return 0L;
        }
        long jSkip = super.skip(jOooO0OO);
        OooO0o(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iOooO0OO = (int) OooO0OO(i2);
        if (iOooO0OO == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iOooO0OO);
        OooO0o(i3);
        return i3;
    }
}

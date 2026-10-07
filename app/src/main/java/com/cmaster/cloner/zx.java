package com.cmaster.cloner;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zx extends FilterInputStream {
    public static final byte[] OooO0o = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int OooO0oO = 31;
    public final byte OooO0Oo;
    public int OooO0o0;

    public zx(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            ra.OooOOO(px0.OooOOO(i, "Cannot add invalid orientation: "));
            throw null;
        }
        this.OooO0Oo = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.OooO0o0;
        int i5 = OooO0oO;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.OooO0Oo;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(OooO0o, this.OooO0o0 - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.OooO0o0 += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.OooO0o0 = (int) (this.OooO0o0 + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.OooO0o0;
        if (i3 < 2 || i3 > (i2 = OooO0oO)) {
            i = super.read();
        } else if (i3 == i2) {
            i = this.OooO0Oo;
        } else {
            i = OooO0o[i3 - 2] & 255;
        }
        if (i != -1) {
            this.OooO0o0++;
        }
        return i;
    }
}

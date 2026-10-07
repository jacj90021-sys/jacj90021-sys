package com.cmaster.cloner;

import java.io.OutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e42 extends OutputStream {
    public final /* synthetic */ int OooO0Oo;
    public long OooO0o0;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int length;
        int i3;
        int length2;
        int i4;
        switch (this.OooO0Oo) {
            case 0:
                if (i < 0 || i > (length = bArr.length) || i2 < 0 || (i3 = i + i2) > length || i3 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.OooO0o0 += i2;
                return;
            default:
                if (i < 0 || i > (length2 = bArr.length) || i2 < 0 || (i4 = i + i2) > length2 || i4 < 0) {
                    throw new IndexOutOfBoundsException();
                }
                this.OooO0o0 += i2;
                return;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        switch (this.OooO0Oo) {
            case 0:
                this.OooO0o0 += bArr.length;
                break;
            default:
                this.OooO0o0 += bArr.length;
                break;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        switch (this.OooO0Oo) {
            case 0:
                this.OooO0o0++;
                break;
            default:
                this.OooO0o0++;
                break;
        }
    }
}

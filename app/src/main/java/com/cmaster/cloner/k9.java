package com.cmaster.cloner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k9 extends OutputStream {
    public final FileOutputStream OooO0Oo;
    public final jp0 OooO0o;
    public byte[] OooO0o0;
    public int OooO0oO;

    public k9(FileOutputStream fileOutputStream, jp0 jp0Var) {
        this.OooO0Oo = fileOutputStream;
        this.OooO0o = jp0Var;
        this.OooO0o0 = (byte[]) jp0Var.OooO0OO(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.OooO0Oo;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.OooO0o0;
            if (bArr != null) {
                this.OooO0o.OooO0oO(bArr);
                this.OooO0o0 = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.OooO0oO;
        FileOutputStream fileOutputStream = this.OooO0Oo;
        if (i > 0) {
            fileOutputStream.write(this.OooO0o0, 0, i);
            this.OooO0oO = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.OooO0oO;
            FileOutputStream fileOutputStream = this.OooO0Oo;
            if (i6 == 0 && i4 >= this.OooO0o0.length) {
                fileOutputStream.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.OooO0o0.length - i6);
            System.arraycopy(bArr, i5, this.OooO0o0, this.OooO0oO, iMin);
            int i7 = this.OooO0oO + iMin;
            this.OooO0oO = i7;
            i3 += iMin;
            byte[] bArr2 = this.OooO0o0;
            if (i7 == bArr2.length && i7 > 0) {
                fileOutputStream.write(bArr2, 0, i7);
                this.OooO0oO = 0;
            }
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.OooO0o0;
        int i2 = this.OooO0oO;
        int i3 = i2 + 1;
        this.OooO0oO = i3;
        bArr[i2] = (byte) i;
        if (i3 != bArr.length || i3 <= 0) {
            return;
        }
        this.OooO0Oo.write(bArr, 0, i3);
        this.OooO0oO = 0;
    }
}

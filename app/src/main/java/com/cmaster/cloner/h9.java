package com.cmaster.cloner;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h9 extends InputStream {
    public final FileInputStream OooO0Oo;
    public long OooO0o0;

    public h9(FileInputStream fileInputStream, long j) {
        this.OooO0Oo = fileInputStream;
        this.OooO0o0 = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.OooO0o0;
        if (j == 0) {
            return -1;
        }
        if (i2 > j) {
            i2 = (int) j;
        }
        int i3 = this.OooO0Oo.read(bArr, i, i2);
        if (i3 >= 0) {
            this.OooO0o0 -= i3;
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.OooO0o0;
        if (j <= 0) {
            return -1;
        }
        this.OooO0o0 = j - 1;
        return this.OooO0Oo.read();
    }
}

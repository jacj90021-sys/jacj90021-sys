package com.cmaster.cloner;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cx extends InputStream {
    public static final ArrayDeque OooO0o;
    public w61 OooO0Oo;
    public IOException OooO0o0;

    static {
        char[] cArr = pr1.OooO00o;
        OooO0o = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO0Oo.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.OooO0Oo.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.OooO0Oo.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.OooO0Oo.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.OooO0Oo.read();
        } catch (IOException e) {
            this.OooO0o0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.OooO0Oo.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.OooO0Oo.skip(j);
        } catch (IOException e) {
            this.OooO0o0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.OooO0Oo.read(bArr);
        } catch (IOException e) {
            this.OooO0o0 = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.OooO0Oo.read(bArr, i, i2);
        } catch (IOException e) {
            this.OooO0o0 = e;
            throw e;
        }
    }
}

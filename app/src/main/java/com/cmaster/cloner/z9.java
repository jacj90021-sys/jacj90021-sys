package com.cmaster.cloner;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z9 extends InputStream {
    public final ByteBuffer OooO0Oo;
    public int OooO0o0 = -1;

    public z9(ByteBuffer byteBuffer) {
        this.OooO0Oo = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO0Oo.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.OooO0o0 = this.OooO0Oo.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.OooO0Oo;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.OooO0o0;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.OooO0Oo.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.OooO0Oo;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (byteBuffer.position() + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.OooO0Oo;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }
}

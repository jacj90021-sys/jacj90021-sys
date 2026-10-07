package com.cmaster.cloner;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w61 extends FilterInputStream {
    public final jp0 OooO;
    public volatile byte[] OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    public w61(InputStream inputStream, jp0 jp0Var) {
        super(inputStream);
        this.OooO0oO = -1;
        this.OooO = jp0Var;
        this.OooO0Oo = (byte[]) jp0Var.OooO0OO(65536, byte[].class);
    }

    public static void OooO0oo() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int OooO0OO(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.OooO0oO;
        if (i != -1) {
            int i2 = this.OooO0oo - i;
            int i3 = this.OooO0o;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.OooO0o0 == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.OooO.OooO0OO(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.OooO0Oo = bArr2;
                    this.OooO.OooO0oO(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i4 = this.OooO0oo - this.OooO0oO;
                this.OooO0oo = i4;
                this.OooO0oO = 0;
                this.OooO0o0 = 0;
                int i5 = inputStream.read(bArr, i4, bArr.length - i4);
                int i6 = this.OooO0oo;
                if (i5 > 0) {
                    i6 += i5;
                }
                this.OooO0o0 = i6;
                return i5;
            }
        }
        int i7 = inputStream.read(bArr);
        if (i7 > 0) {
            this.OooO0oO = -1;
            this.OooO0oo = 0;
            this.OooO0o0 = i7;
        }
        return i7;
    }

    public final synchronized void OooO0o() {
        if (this.OooO0Oo != null) {
            this.OooO.OooO0oO(this.OooO0Oo);
            this.OooO0Oo = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.OooO0Oo == null || inputStream == null) {
            OooO0oo();
            throw null;
        }
        return (this.OooO0o0 - this.OooO0oo) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.OooO0Oo != null) {
            this.OooO.OooO0oO(this.OooO0Oo);
            this.OooO0Oo = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.OooO0o = Math.max(this.OooO0o, i);
        this.OooO0oO = this.OooO0oo;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.OooO0Oo;
        if (bArr2 == null) {
            OooO0oo();
            throw null;
        }
        if (i2 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            OooO0oo();
            throw null;
        }
        int i5 = this.OooO0oo;
        int i6 = this.OooO0o0;
        if (i5 < i6) {
            int i7 = i6 - i5;
            if (i7 >= i2) {
                i7 = i2;
            }
            System.arraycopy(bArr2, i5, bArr, i, i7);
            this.OooO0oo += i7;
            if (i7 == i2 || inputStream.available() == 0) {
                return i7;
            }
            i += i7;
            i3 = i2 - i7;
        } else {
            i3 = i2;
        }
        while (true) {
            if (this.OooO0oO == -1 && i3 >= bArr2.length) {
                i4 = inputStream.read(bArr, i, i3);
                if (i4 == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
            } else {
                if (OooO0OO(inputStream, bArr2) == -1) {
                    return i3 != i2 ? i2 - i3 : -1;
                }
                if (bArr2 != this.OooO0Oo && (bArr2 = this.OooO0Oo) == null) {
                    OooO0oo();
                    throw null;
                }
                int i8 = this.OooO0o0;
                int i9 = this.OooO0oo;
                i4 = i8 - i9;
                if (i4 >= i3) {
                    i4 = i3;
                }
                System.arraycopy(bArr2, i9, bArr, i, i4);
                this.OooO0oo += i4;
            }
            i3 -= i4;
            if (i3 == 0) {
                return i2;
            }
            if (inputStream.available() == 0) {
                return i2 - i3;
            }
            i += i4;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.OooO0Oo == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.OooO0oO;
        if (-1 == i) {
            throw new t80("Mark has been invalidated, pos: " + this.OooO0oo + " markLimit: " + this.OooO0o);
        }
        this.OooO0oo = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.OooO0Oo;
        if (bArr == null) {
            OooO0oo();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            OooO0oo();
            throw null;
        }
        int i = this.OooO0o0;
        int i2 = this.OooO0oo;
        if (i - i2 >= j) {
            this.OooO0oo = (int) (i2 + j);
            return j;
        }
        long j2 = i - i2;
        this.OooO0oo = i;
        if (this.OooO0oO == -1 || j > this.OooO0o) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.OooO0oO = -1;
            }
            return j2 + jSkip;
        }
        if (OooO0OO(inputStream, bArr) == -1) {
            return j2;
        }
        int i3 = this.OooO0o0;
        int i4 = this.OooO0oo;
        if (i3 - i4 >= j - j2) {
            this.OooO0oo = (int) ((i4 + j) - j2);
            return j;
        }
        long j3 = (j2 + i3) - i4;
        this.OooO0oo = i3;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.OooO0Oo;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr != null && inputStream != null) {
            if (this.OooO0oo >= this.OooO0o0 && OooO0OO(inputStream, bArr) == -1) {
                return -1;
            }
            if (bArr != this.OooO0Oo && (bArr = this.OooO0Oo) == null) {
                OooO0oo();
                throw null;
            }
            int i = this.OooO0o0;
            int i2 = this.OooO0oo;
            if (i - i2 <= 0) {
                return -1;
            }
            this.OooO0oo = i2 + 1;
            return bArr[i2] & 255;
        }
        OooO0oo();
        throw null;
    }
}

package com.cmaster.cloner;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class qx extends InputStream implements DataInput {
    public final DataInputStream OooO0Oo;
    public int OooO0o;
    public ByteOrder OooO0o0;
    public byte[] OooO0oO;
    public static final ByteOrder OooO0oo = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder OooO = ByteOrder.BIG_ENDIAN;

    public qx(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.OooO0o0 = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.OooO0Oo = dataInputStream;
        dataInputStream.mark(0);
        this.OooO0o = 0;
        this.OooO0o0 = byteOrder;
    }

    public final void OooO0OO(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.OooO0Oo;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.OooO0oO == null) {
                    this.OooO0oO = new byte[8192];
                }
                iSkip = dataInputStream.read(this.OooO0oO, 0, Math.min(8192, i3));
                if (iSkip == -1) {
                    throw new EOFException(rj.OooO00o(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.OooO0o += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO0Oo.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.OooO0o++;
        return this.OooO0Oo.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.OooO0o++;
        return this.OooO0Oo.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.OooO0o++;
        int i = this.OooO0Oo.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.OooO0o += 2;
        return this.OooO0Oo.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.OooO0o += bArr.length;
        this.OooO0Oo.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.OooO0o += 4;
        DataInputStream dataInputStream = this.OooO0Oo;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.OooO0o0;
        if (byteOrder == OooO0oo) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == OooO) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        sa.OooO0o0(this.OooO0o0, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.OooO0o += 8;
        DataInputStream dataInputStream = this.OooO0Oo;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.OooO0o0;
        if (byteOrder == OooO0oo) {
            return (i8 << 56) + (i7 << 48) + (i6 << 40) + (i5 << 32) + (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == OooO) {
            return (i << 56) + (i2 << 48) + (i3 << 40) + (i4 << 32) + (i5 << 24) + (i6 << 16) + (i7 << 8) + i8;
        }
        sa.OooO0o0(this.OooO0o0, "Invalid byte order: ");
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.OooO0o += 2;
        DataInputStream dataInputStream = this.OooO0Oo;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.OooO0o0;
        if (byteOrder == OooO0oo) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == OooO) {
            return (short) ((i << 8) + i2);
        }
        sa.OooO0o0(this.OooO0o0, "Invalid byte order: ");
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.OooO0o += 2;
        return this.OooO0Oo.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.OooO0o++;
        return this.OooO0Oo.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.OooO0o += 2;
        DataInputStream dataInputStream = this.OooO0Oo;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.OooO0o0;
        if (byteOrder == OooO0oo) {
            return (i2 << 8) + i;
        }
        if (byteOrder == OooO) {
            return (i << 8) + i2;
        }
        sa.OooO0o0(this.OooO0o0, "Invalid byte order: ");
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.OooO0o += i2;
        this.OooO0Oo.readFully(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.OooO0Oo.read(bArr, i, i2);
        this.OooO0o += i3;
        return i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qx(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public qx(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }
}

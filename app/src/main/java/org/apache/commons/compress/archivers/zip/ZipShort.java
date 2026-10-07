package org.apache.commons.compress.archivers.zip;

import com.cmaster.cloner.sa;
import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ZipShort implements Cloneable, Serializable {
    private static final int BYTE_1_MASK = 65280;
    private static final int BYTE_1_SHIFT = 8;
    private static final long serialVersionUID = 1;
    private final int value;

    public ZipShort(byte[] bArr, int i) {
        this.value = getValue(bArr, i);
    }

    public static int getValue(byte[] bArr, int i) {
        return ((bArr[i + 1] << 8) & BYTE_1_MASK) + (bArr[i] & 255);
    }

    public static void putShort(int i, byte[] bArr, int i2) {
        bArr[i2] = (byte) (i & 255);
        bArr[i2 + 1] = (byte) ((i & BYTE_1_MASK) >> 8);
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof ZipShort) && this.value == ((ZipShort) obj).getValue();
    }

    public byte[] getBytes() {
        int i = this.value;
        return new byte[]{(byte) (i & 255), (byte) ((i & BYTE_1_MASK) >> 8)};
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return "ZipShort value: " + this.value;
    }

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static int getValue(byte[] bArr) {
        return getValue(bArr, 0);
    }

    public static byte[] getBytes(int i) {
        byte[] bArr = new byte[2];
        putShort(i, bArr, 0);
        return bArr;
    }
}

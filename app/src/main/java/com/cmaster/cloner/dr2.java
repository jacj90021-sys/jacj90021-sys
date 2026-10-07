package com.cmaster.cloner;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dr2 {
    public static byte[] OooO00o(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] OooO0O0(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                qa.OooO0o(px0.OooOOO(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += i3;
        }
        return bArr;
    }

    public static byte[] OooO0OO(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static long OooO0Oo(InputStream inputStream, int i) throws IOException {
        byte[] bArrOooO0O0 = OooO0O0(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (bArrOooO0O0[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static void OooO0o(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        OooO0o0(byteArrayOutputStream, i, 2);
    }

    public static void OooO0o0(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }
}

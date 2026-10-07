package com.cmaster.cloner;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ho implements wf0 {
    public static final byte[] OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] OooO0O0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static ImageHeaderParser$ImageType OooO0o(go goVar) {
        try {
            int iOooO0oo = goVar.OooO0oo();
            if (iOooO0oo == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iOooOOoo = (iOooO0oo << 8) | goVar.OooOOoo();
            if (iOooOOoo == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iOooOOoo2 = (iOooOOoo << 8) | goVar.OooOOoo();
            if (iOooOOoo2 == -1991225785) {
                goVar.skip(21L);
                try {
                    return goVar.OooOOoo() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (fo unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iOooOOoo2 == 1380533830) {
                goVar.skip(4L);
                if (((goVar.OooO0oo() << 16) | goVar.OooO0oo()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iOooO0oo2 = (goVar.OooO0oo() << 16) | goVar.OooO0oo();
                if ((iOooO0oo2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iOooO0oo2 & 255;
                if (i == 88) {
                    goVar.skip(4L);
                    short sOooOOoo = goVar.OooOOoo();
                    return (sOooOOoo & 2) != 0 ? ImageHeaderParser$ImageType.ANIMATED_WEBP : (sOooOOoo & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                }
                goVar.skip(4L);
                return (goVar.OooOOoo() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((goVar.OooO0oo() << 16) | goVar.OooO0oo()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iOooO0oo3 = (goVar.OooO0oo() << 16) | goVar.OooO0oo();
            if (iOooO0oo3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iOooO0oo3 == 1635150182;
            goVar.skip(4L);
            int i3 = iOooOOoo2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iOooO0oo4 = (goVar.OooO0oo() << 16) | goVar.OooO0oo();
                    if (iOooO0oo4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iOooO0oo4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (fo unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int OooO0o0(go goVar, jp0 jp0Var) {
        try {
            int iOooO0oo = goVar.OooO0oo();
            if ((iOooO0oo & 65496) == 65496 || iOooO0oo == 19789 || iOooO0oo == 18761) {
                int iOooO0oO = OooO0oO(goVar);
                if (iOooO0oO != -1) {
                    byte[] bArr = (byte[]) jp0Var.OooO0OO(iOooO0oO, byte[].class);
                    try {
                        return OooO0oo(goVar, bArr, iOooO0oO);
                    } finally {
                        jp0Var.OooO0oO(bArr);
                    }
                }
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                    return -1;
                }
            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Parser doesn't handle magic number: " + iOooO0oo);
                return -1;
            }
        } catch (fo unused) {
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO0oO(com.cmaster.cloner.go r9) {
        /*
        L0:
            short r0 = r9.OooOOoo()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 3
            r3 = -1
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r0 == r1) goto L24
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown segmentId="
            r9.<init>(r1)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
            return r3
        L24:
            short r0 = r9.OooOOoo()
            r1 = 218(0xda, float:3.05E-43)
            if (r0 != r1) goto L2d
            goto L6a
        L2d:
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 != r1) goto L3d
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = "Found MARKER_EOI in exif segment"
            android.util.Log.d(r4, r9)
            return r3
        L3d:
            int r1 = r9.OooO0oo()
            int r1 = r1 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r0 == r5) goto L6b
            long r5 = (long) r1
            long r7 = r9.skip(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 == 0) goto L0
            boolean r9 = android.util.Log.isLoggable(r4, r2)
            if (r9 == 0) goto L6a
            java.lang.String r9 = ", wanted to skip: "
            java.lang.String r2 = ", but actually skipped: "
            java.lang.String r5 = "Unable to skip enough data, type: "
            java.lang.StringBuilder r9 = com.cmaster.cloner.rj.OooO(r0, r1, r5, r9, r2)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r4, r9)
        L6a:
            return r3
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ho.OooO0oO(com.cmaster.cloner.go):int");
    }

    public static int OooO0oo(go goVar, byte[] bArr, int i) {
        ByteOrder byteOrder;
        short s;
        int iOooOoO0 = goVar.OooOoO0(i, bArr);
        short s2 = -1;
        if (iOooOoO0 == i) {
            int i2 = 0;
            byte[] bArr2 = OooO00o;
            boolean z = bArr != null && i > bArr2.length;
            if (z) {
                int i3 = 0;
                while (true) {
                    if (i3 >= bArr2.length) {
                        break;
                    }
                    if (bArr[i3] != bArr2[i3]) {
                        z = false;
                        break;
                    }
                    i3++;
                }
            }
            if (!z) {
                if (!Log.isLoggable("DfltImageHeaderParser", 3)) {
                    return -1;
                }
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
                return -1;
            }
            ByteBuffer byteBuffer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
            short s3 = byteBuffer.remaining() - 6 >= 2 ? byteBuffer.getShort(6) : (short) -1;
            if (s3 != 18761) {
                if (s3 != 19789 && Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Unknown endianness = " + ((int) s3));
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            byteBuffer.order(byteOrder);
            int i4 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
            int i5 = i4 + 6;
            short s4 = byteBuffer.remaining() - i5 >= 2 ? byteBuffer.getShort(i5) : (short) -1;
            while (i2 < s4) {
                int i6 = (i2 * 12) + i4 + 8;
                short s5 = byteBuffer.remaining() - i6 >= 2 ? byteBuffer.getShort(i6) : s2;
                if (s5 != 274) {
                    s = s2;
                } else {
                    int i7 = i6 + 2;
                    short s6 = byteBuffer.remaining() - i7 >= 2 ? byteBuffer.getShort(i7) : s2;
                    if (s6 < 1 || s6 > 12) {
                        s = s2;
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            Log.d("DfltImageHeaderParser", "Got invalid format code = " + ((int) s6));
                        }
                    } else {
                        int i8 = i6 + 4;
                        int i9 = byteBuffer.remaining() - i8 >= 4 ? byteBuffer.getInt(i8) : s2;
                        if (i9 < 0) {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Negative tiff component count");
                            }
                            s = s2;
                        } else {
                            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                s = s2;
                                StringBuilder sbOooO = rj.OooO(i2, s5, "Got tagIndex=", " tagType=", " formatCode=");
                                sbOooO.append((int) s6);
                                sbOooO.append(" componentCount=");
                                sbOooO.append(i9);
                                Log.d("DfltImageHeaderParser", sbOooO.toString());
                            } else {
                                s = s2;
                            }
                            int i10 = i9 + OooO0O0[s6];
                            if (i10 <= 4) {
                                int i11 = i6 + 8;
                                if (i11 < 0 || i11 > byteBuffer.remaining()) {
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i11 + " tagType=" + ((int) s5));
                                    }
                                } else {
                                    if (i10 >= 0 && i10 + i11 <= byteBuffer.remaining()) {
                                        return byteBuffer.remaining() - i11 >= 2 ? byteBuffer.getShort(i11) : s;
                                    }
                                    if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                        Log.d("DfltImageHeaderParser", "Illegal number of bytes for TI tag data tagType=" + ((int) s5));
                                    }
                                }
                            } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                Log.d("DfltImageHeaderParser", "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) s6));
                            }
                        }
                    }
                }
                i2++;
                s2 = s;
            }
        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i + ", actually read: " + iOooOoO0);
            return -1;
        }
        return s2;
    }

    @Override // com.cmaster.cloner.wf0
    public final ImageHeaderParser$ImageType OooO00o(ByteBuffer byteBuffer) {
        zx2.OooO0OO(byteBuffer, "Argument must not be null");
        return OooO0o(new xb1(byteBuffer));
    }

    @Override // com.cmaster.cloner.wf0
    public final int OooO0O0(InputStream inputStream, jp0 jp0Var) {
        o00OO000 o00oo000 = new o00OO000(inputStream, 11);
        zx2.OooO0OO(jp0Var, "Argument must not be null");
        return OooO0o0(o00oo000, jp0Var);
    }

    @Override // com.cmaster.cloner.wf0
    public final ImageHeaderParser$ImageType OooO0OO(InputStream inputStream) {
        return OooO0o(new o00OO000(inputStream, 11));
    }

    @Override // com.cmaster.cloner.wf0
    public final int OooO0Oo(ByteBuffer byteBuffer, jp0 jp0Var) {
        xb1 xb1Var = new xb1(byteBuffer);
        zx2.OooO0OO(jp0Var, "Argument must not be null");
        return OooO0o0(xb1Var, jp0Var);
    }
}

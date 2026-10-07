package com.cmaster.cloner;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i5 extends rg {
    public int OooO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public boolean OooO0oO;
    public int OooO0oo;
    public final ep0 OooOO0;
    public int OooOO0O;
    public InputStream OooOO0o;
    public int OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public int OooOOoo;
    public int OooOo;
    public int OooOo0;
    public int OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public h5 OooOoO;
    public char OooOoO0;

    public i5(InputStream inputStream) throws IOException {
        ep0 ep0Var = new ep0();
        ep0Var.OooO0Oo = -1;
        this.OooOO0 = ep0Var;
        this.OooOOO0 = 1;
        this.OooOO0o = inputStream;
        InputStream inputStream2 = this.OooOO0o;
        if (inputStream2 != null) {
            int i = inputStream2.read();
            int i2 = this.OooOO0o.read();
            int i3 = this.OooOO0o.read();
            if (i != 66 || i2 != 90 || i3 != 104) {
                throw new IOException("Stream is not in the BZip2 format");
            }
            int i4 = this.OooOO0o.read();
            if (i4 < 49 || i4 > 57) {
                qa.OooOOOO("BZip2 block size is invalid");
            } else {
                this.OooO0o = i4 - 48;
                this.OooO = 0;
                this.OooOOOo = 0;
            }
        } else {
            qa.OooOOOO("No InputStream");
        }
        OooO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v13, types: [int] */
    /* JADX WARN: Type inference failed for: r8v20, types: [int] */
    public final void OooO() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        char c;
        int i3;
        char cOooO0OO = OooO0OO();
        char cOooO0OO2 = OooO0OO();
        char cOooO0OO3 = OooO0OO();
        char cOooO0OO4 = OooO0OO();
        char cOooO0OO5 = OooO0OO();
        char cOooO0OO6 = OooO0OO();
        char c2 = 0;
        if (cOooO0OO == 23 && cOooO0OO2 == 'r' && cOooO0OO3 == 'E' && cOooO0OO4 == '8' && cOooO0OO5 == 'P' && cOooO0OO6 == 144) {
            int iOooO0o = (((((OooO0o(8) << 8) | OooO0o(8)) << 8) | OooO0o(8)) << 8) | OooO0o(8);
            this.OooOOOO = iOooO0o;
            this.OooOOO0 = 0;
            this.OooOoO = null;
            if (iOooO0o == this.OooOOOo) {
                return;
            }
            qa.OooOOOO("BZip2 CRC error");
            return;
        }
        if (cOooO0OO != '1' || cOooO0OO2 != 'A' || cOooO0OO3 != 'Y' || cOooO0OO4 != '&' || cOooO0OO5 != 'S' || cOooO0OO6 != 'Y') {
            this.OooOOO0 = 0;
            qa.OooOOOO("bad block header");
            return;
        }
        this.OooOOO = (((((OooO0o(8) << 8) | OooO0o(8)) << 8) | OooO0o(8)) << 8) | OooO0o(8);
        int i4 = 1;
        this.OooO0oO = OooO0o(1) == 1;
        if (this.OooOoO == null) {
            this.OooOoO = new h5(this.OooO0o);
        }
        this.OooO0o0 = OooO0o(24);
        h5 h5Var = this.OooOoO;
        boolean[] zArr = h5Var.OooO00o;
        byte[] bArr2 = h5Var.OooOOO0;
        byte[] bArr3 = h5Var.OooO0OO;
        byte[] bArr4 = h5Var.OooO0Oo;
        int i5 = 0;
        for (int i6 = 0; i6 < 16; i6++) {
            if (OooO0o(1) != 0) {
                i5 |= 1 << i6;
            }
        }
        int i7 = 256;
        while (true) {
            i = -1;
            i7--;
            if (i7 < 0) {
                break;
            } else {
                zArr[i7] = false;
            }
        }
        for (int i8 = 0; i8 < 16; i8++) {
            if (((1 << i8) & i5) != 0) {
                int i9 = i8 << 4;
                for (int i10 = 0; i10 < 16; i10++) {
                    if (OooO0o(1) != 0) {
                        zArr[i9 + i10] = true;
                    }
                }
            }
        }
        h5 h5Var2 = this.OooOoO;
        boolean[] zArr2 = h5Var2.OooO00o;
        byte[] bArr5 = h5Var2.OooO0O0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 256; i11 < i13; i13 = 256) {
            if (zArr2[i11]) {
                bArr5[i12] = (byte) i11;
                i12++;
            }
            i11++;
        }
        this.OooOO0O = i12;
        int i14 = i12 + 2;
        int iOooO0o2 = OooO0o(3);
        int iOooO0o3 = OooO0o(15);
        for (int i15 = 0; i15 < iOooO0o3; i15++) {
            int i16 = 0;
            while (OooO0o(1) != 0) {
                i16++;
            }
            bArr4[i15] = (byte) i16;
        }
        int i17 = iOooO0o2;
        while (true) {
            i17--;
            if (i17 < 0) {
                break;
            } else {
                bArr2[i17] = (byte) i17;
            }
        }
        for (int i18 = 0; i18 < iOooO0o3; i18++) {
            int i19 = bArr4[i18] & 255;
            byte b = bArr2[i19];
            while (i19 > 0) {
                bArr2[i19] = bArr2[i19 - 1];
                i19--;
            }
            bArr2[0] = b;
            bArr3[i18] = b;
        }
        char[][] cArr = h5Var.OooOO0o;
        for (int i20 = 0; i20 < iOooO0o2; i20++) {
            int iOooO0o4 = OooO0o(5);
            char[] cArr2 = cArr[i20];
            for (int i21 = 0; i21 < i14; i21++) {
                while (OooO0o(1) != 0) {
                    iOooO0o4 += OooO0o(1) != 0 ? -1 : 1;
                }
                cArr2[i21] = (char) iOooO0o4;
            }
        }
        h5 h5Var3 = this.OooOoO;
        char[][] cArr3 = h5Var3.OooOO0o;
        int[] iArr = h5Var3.OooO;
        int[][] iArr2 = h5Var3.OooO0o;
        int[][] iArr3 = h5Var3.OooO0oO;
        int[][] iArr4 = h5Var3.OooO0oo;
        int i22 = 0;
        while (i22 < iOooO0o2) {
            char[] cArr4 = cArr3[i22];
            char c3 = ' ';
            int i23 = i14;
            int i24 = i;
            char c4 = c2;
            while (true) {
                i23--;
                if (i23 < 0) {
                    break;
                }
                char c5 = c2;
                char c6 = cArr4[i23];
                if (c6 > c4) {
                    c4 = c6;
                }
                if (c6 < c3) {
                    c3 = c6;
                }
                c2 = c5;
            }
            char c7 = c2;
            int[] iArr5 = iArr2[i22];
            int[] iArr6 = iArr3[i22];
            int[] iArr7 = iArr4[i22];
            char[] cArr5 = cArr3[i22];
            int i25 = c3;
            char c8 = c7;
            while (i25 <= c4) {
                int i26 = i4;
                for (int i27 = c7; i27 < i14; i27++) {
                    if (cArr5[i27] == i25) {
                        iArr7[c8] = i27;
                        c8++;
                    }
                }
                i25++;
                i4 = i26;
            }
            int i28 = i4;
            int i29 = 23;
            while (true) {
                i29--;
                if (i29 <= 0) {
                    break;
                }
                iArr6[i29] = c7;
                iArr5[i29] = c7;
            }
            for (int i30 = c7; i30 < i14; i30++) {
                int i31 = cArr5[i30] + 1;
                iArr6[i31] = iArr6[i31] + 1;
            }
            int i32 = iArr6[c7];
            for (int i33 = i28; i33 < 23; i33++) {
                i32 += iArr6[i33];
                iArr6[i33] = i32;
            }
            int i34 = iArr6[c3];
            char c9 = c3;
            int i35 = c7;
            while (c9 <= c4) {
                int r17 = c9 + 1;
                int i36 = iArr6[r17];
                int i37 = (i36 - i34) + i35;
                iArr5[c9] = i37 - 1;
                i35 = i37 << 1;
                c9 = (char) r17;
                i34 = i36;
            }
            for (int i38 = c3 + 1; i38 <= c4; i38++) {
                iArr6[i38] = ((iArr5[i38 - 1] + 1) << 1) - iArr6[i38];
            }
            iArr[i22] = c3;
            i22++;
            i = i24;
            c2 = c7;
            i4 = i28;
        }
        int i39 = i4;
        char c10 = c2;
        int i40 = i;
        InputStream inputStream = this.OooOO0o;
        h5 h5Var4 = this.OooOoO;
        byte[] bArr6 = h5Var4.OooOOOO;
        int[] iArr8 = h5Var4.OooO0o0;
        byte[] bArr7 = h5Var4.OooO0OO;
        byte[] bArr8 = h5Var4.OooO0O0;
        char[] cArr6 = h5Var4.OooOO0O;
        int[] iArr9 = h5Var4.OooO;
        int[][] iArr10 = h5Var4.OooO0o;
        int[][] iArr11 = h5Var4.OooO0oO;
        int[][] iArr12 = h5Var4.OooO0oo;
        int i41 = this.OooO0o * 100000;
        int i42 = 256;
        while (true) {
            int i43 = i42 - 1;
            if (i43 < 0) {
                break;
            }
            cArr6[i43] = (char) i43;
            iArr8[i43] = c10;
            i42 = i43;
        }
        int i44 = this.OooOO0O + 1;
        InputStream inputStream2 = this.OooOO0o;
        h5 h5Var5 = this.OooOoO;
        int i45 = h5Var5.OooO0OO[c10] & 255;
        int[] iArr13 = h5Var5.OooO0o[i45];
        int i46 = h5Var5.OooO[i45];
        int iOooO0o5 = OooO0o(i46);
        int i47 = this.OooO;
        int i48 = this.OooO0oo;
        int i49 = i47;
        int i50 = iOooO0o5;
        int i51 = i46;
        while (i50 > iArr13[i51]) {
            i51++;
            for (int i52 = i39; i49 < i52; i52 = 1) {
                int i53 = inputStream2.read();
                if (i53 < 0) {
                    qa.OooOOOO("unexpected end of stream");
                    return;
                } else {
                    i48 = (i48 << 8) | i53;
                    i49 += 8;
                }
            }
            i49--;
            i50 = (i50 << 1) | ((i48 >> i49) & 1);
            i39 = 1;
        }
        this.OooO = i49;
        this.OooO0oo = i48;
        int i54 = h5Var5.OooO0oo[i45][i50 - h5Var5.OooO0oO[i45][i51]];
        int i55 = bArr7[c10] & 255;
        int[] iArr14 = iArr11[i55];
        int[] iArr15 = iArr10[i55];
        int[] iArr16 = iArr12[i55];
        int i56 = iArr9[i55];
        int i57 = i40;
        int i58 = c10;
        int i59 = 49;
        while (i54 != i44) {
            byte[] bArr9 = bArr7;
            if (i54 == 0 || i54 == 1) {
                bArr = bArr8;
                int i60 = i40;
                int i61 = 1;
                while (true) {
                    if (i54 == 0) {
                        i60 += i61;
                        i2 = i49;
                    } else {
                        i2 = i49;
                        if (i54 == 1) {
                            i60 += i61 << 1;
                        } else {
                            byte b2 = bArr[cArr6[0]];
                            int i62 = b2 & 255;
                            iArr8[i62] = i60 + 1 + iArr8[i62];
                            while (true) {
                                int i63 = i60 - 1;
                                if (i60 < 0) {
                                    break;
                                }
                                i57++;
                                bArr6[i57] = b2;
                                i60 = i63;
                            }
                            if (i57 >= i41) {
                                qa.OooOOOO("block overrun");
                                return;
                            } else {
                                bArr7 = bArr9;
                                i49 = i2;
                            }
                        }
                    }
                    if (i59 == 0) {
                        i58++;
                        int i64 = bArr9[i58] & 255;
                        iArr14 = iArr11[i64];
                        iArr15 = iArr10[i64];
                        iArr16 = iArr12[i64];
                        i56 = iArr9[i64];
                        i59 = 49;
                    } else {
                        i59--;
                    }
                    int i65 = i56;
                    int i66 = i48;
                    int i67 = i2;
                    while (i67 < i65) {
                        int i68 = inputStream.read();
                        if (i68 < 0) {
                            qa.OooOOOO("unexpected end of stream");
                            return;
                        } else {
                            i66 = (i66 << 8) | i68;
                            i67 += 8;
                        }
                    }
                    int i69 = i67 - i65;
                    int i70 = i69;
                    int i71 = (i66 >> i69) & ((1 << i65) - 1);
                    int i72 = i65;
                    while (i71 > iArr15[i72]) {
                        i72++;
                        int i73 = i71;
                        int i74 = i70;
                        while (i74 < 1) {
                            int i75 = inputStream.read();
                            if (i75 < 0) {
                                qa.OooOOOO("unexpected end of stream");
                                return;
                            } else {
                                i66 = (i66 << 8) | i75;
                                i74 += 8;
                            }
                        }
                        i70 = i74 - 1;
                        i71 = (i73 << 1) | ((i66 >> i70) & 1);
                    }
                    int i76 = iArr16[i71 - iArr14[i72]];
                    i61 <<= 1;
                    i48 = i66;
                    i56 = i65;
                    i54 = i76;
                    i49 = i70;
                }
            } else {
                int i77 = i57 + 1;
                if (i77 >= i41) {
                    qa.OooOOOO("block overrun");
                    return;
                }
                int i78 = i54 - 1;
                char c11 = cArr6[i78];
                byte b3 = bArr8[c11];
                bArr = bArr8;
                int i79 = b3 & 255;
                iArr8[i79] = iArr8[i79] + 1;
                bArr6[i77] = b3;
                if (i54 <= 16) {
                    while (i78 > 0) {
                        int i80 = i78 - 1;
                        cArr6[i78] = cArr6[i80];
                        i78 = i80;
                    }
                    c = c10;
                } else {
                    c = c10;
                    System.arraycopy(cArr6, c, cArr6, 1, i78);
                }
                cArr6[c] = c11;
                if (i59 == 0) {
                    i58++;
                    int i81 = bArr9[i58] & 255;
                    int[] iArr17 = iArr11[i81];
                    int[] iArr18 = iArr10[i81];
                    int[] iArr19 = iArr12[i81];
                    i3 = iArr9[i81];
                    iArr15 = iArr18;
                    iArr16 = iArr19;
                    i59 = 49;
                    iArr14 = iArr17;
                } else {
                    i59--;
                    i3 = i56;
                }
                while (i49 < i3) {
                    int i82 = inputStream.read();
                    if (i82 < 0) {
                        qa.OooOOOO("unexpected end of stream");
                        return;
                    } else {
                        i48 = (i48 << 8) | i82;
                        i49 += 8;
                    }
                }
                i49 -= i3;
                int i83 = 1;
                int i84 = (i48 >> i49) & ((1 << i3) - 1);
                int i85 = i3;
                while (i84 > iArr15[i85]) {
                    i85++;
                    while (i49 < i83) {
                        int i86 = inputStream.read();
                        if (i86 < 0) {
                            qa.OooOOOO("unexpected end of stream");
                            return;
                        } else {
                            i48 = (i48 << 8) | i86;
                            i49 += 8;
                            i83 = 1;
                        }
                    }
                    i49--;
                    i84 = (i84 << 1) | ((i48 >> i49) & 1);
                    i83 = 1;
                }
                int i87 = iArr16[i84 - iArr14[i85]];
                i56 = i3;
                i54 = i87;
                bArr7 = bArr9;
                i57 = i77;
            }
            bArr8 = bArr;
            c10 = 0;
        }
        this.OooO0Oo = i57;
        this.OooO = i49;
        this.OooO0oo = i48;
        this.OooOO0.OooO0Oo = i40;
        this.OooOOO0 = 1;
    }

    public final char OooO0OO() {
        return (char) OooO0o(8);
    }

    public final int OooO0o(int i) throws IOException {
        int i2 = this.OooO;
        int i3 = this.OooO0oo;
        if (i2 < i) {
            InputStream inputStream = this.OooOO0o;
            do {
                int i4 = inputStream.read();
                if (i4 < 0) {
                    qa.OooOOOO("unexpected end of stream");
                    return 0;
                }
                i3 = (i3 << 8) | i4;
                i2 += 8;
            } while (i2 < i);
            this.OooO0oo = i3;
        }
        int i5 = i2 - i;
        this.OooO = i5;
        return (i3 >> i5) & ((1 << i) - 1);
    }

    public final void OooO0oo() throws IOException {
        int i = ~this.OooOO0.OooO0Oo;
        int i2 = this.OooOOO;
        if (i2 == i) {
            int i3 = this.OooOOOo;
            this.OooOOOo = i ^ ((i3 >>> 31) | (i3 << 1));
        } else {
            int i4 = this.OooOOOO;
            this.OooOOOo = ((i4 >>> 31) | (i4 << 1)) ^ i2;
            qa.OooOOOO("BZip2 CRC error");
        }
    }

    public final int OooOOO() {
        switch (this.OooOOO0) {
            case 0:
                return -1;
            case 1:
                return OooOOOO();
            case 2:
                ra.OooO0O0();
                return 0;
            case 3:
                if (this.OooOOo != this.OooOOoo) {
                    this.OooOOO0 = 2;
                    this.OooOOo0 = 1;
                    return OooOo00();
                }
                int i = this.OooOOo0 + 1;
                this.OooOOo0 = i;
                if (i < 4) {
                    this.OooOOO0 = 2;
                    return OooOo00();
                }
                h5 h5Var = this.OooOoO;
                byte[] bArr = h5Var.OooOOOO;
                int i2 = this.OooOo;
                char c = (char) (bArr[i2] & 255);
                this.OooOoO0 = c;
                this.OooOo = h5Var.OooOOO[i2];
                int i3 = this.OooOo0O;
                if (i3 == 0) {
                    int i4 = this.OooOo0o;
                    this.OooOo0O = a82.OooO00o[i4] - 1;
                    int i5 = i4 + 1;
                    this.OooOo0o = i5;
                    if (i5 == 512) {
                        this.OooOo0o = 0;
                    }
                } else {
                    this.OooOo0O = i3 - 1;
                }
                this.OooOo0 = 0;
                this.OooOOO0 = 4;
                if (this.OooOo0O == 1) {
                    this.OooOoO0 = (char) (c ^ 1);
                }
                return OooOo0();
            case 4:
                return OooOo0();
            case 5:
                ra.OooO0O0();
                return 0;
            case 6:
                if (this.OooOOo != this.OooOOoo) {
                    this.OooOOo0 = 1;
                    return OooOOo();
                }
                int i6 = this.OooOOo0 + 1;
                this.OooOOo0 = i6;
                if (i6 < 4) {
                    return OooOOo();
                }
                h5 h5Var2 = this.OooOoO;
                byte[] bArr2 = h5Var2.OooOOOO;
                int i7 = this.OooOo;
                this.OooOoO0 = (char) (bArr2[i7] & 255);
                this.OooOo = h5Var2.OooOOO[i7];
                this.OooOo0 = 0;
                return OooOOoo();
            case 7:
                return OooOOoo();
            default:
                ra.OooO0O0();
                return 0;
        }
    }

    public final int OooOOOO() throws IOException {
        h5 h5Var;
        if (this.OooOOO0 == 0 || (h5Var = this.OooOoO) == null) {
            return -1;
        }
        int[] iArr = h5Var.OooOO0;
        int i = this.OooO0Oo + 1;
        int[] iArr2 = h5Var.OooOOO;
        if (iArr2 == null || iArr2.length < i) {
            iArr2 = new int[i];
            h5Var.OooOOO = iArr2;
        }
        byte[] bArr = h5Var.OooOOOO;
        iArr[0] = 0;
        System.arraycopy(h5Var.OooO0o0, 0, iArr, 1, 256);
        int i2 = iArr[0];
        for (int i3 = 1; i3 <= 256; i3++) {
            i2 += iArr[i3];
            iArr[i3] = i2;
        }
        int i4 = this.OooO0Oo;
        for (int i5 = 0; i5 <= i4; i5++) {
            int i6 = bArr[i5] & 255;
            int i7 = iArr[i6];
            iArr[i6] = i7 + 1;
            iArr2[i7] = i5;
        }
        int i8 = this.OooO0o0;
        if (i8 < 0 || i8 >= iArr2.length) {
            qa.OooOOOO("stream corrupted");
            return 0;
        }
        this.OooOo = iArr2[i8];
        this.OooOOo0 = 0;
        this.OooOo00 = 0;
        this.OooOOo = 256;
        if (!this.OooO0oO) {
            return OooOOo();
        }
        this.OooOo0O = 0;
        this.OooOo0o = 0;
        return OooOo00();
    }

    public final int OooOOo() throws IOException {
        int i = this.OooOo00;
        if (i > this.OooO0Oo) {
            this.OooOOO0 = 5;
            OooO0oo();
            OooO();
            return OooOOOO();
        }
        this.OooOOoo = this.OooOOo;
        h5 h5Var = this.OooOoO;
        byte[] bArr = h5Var.OooOOOO;
        int i2 = this.OooOo;
        int i3 = bArr[i2] & 255;
        this.OooOOo = i3;
        this.OooOo = h5Var.OooOOO[i2];
        this.OooOo00 = i + 1;
        this.OooOOO0 = 6;
        this.OooOO0.OooOO0(i3);
        return i3;
    }

    public final int OooOOoo() {
        if (this.OooOo0 >= this.OooOoO0) {
            this.OooOo00++;
            this.OooOOo0 = 0;
            return OooOOo();
        }
        int i = this.OooOOo;
        this.OooOO0.OooOO0(i);
        this.OooOo0++;
        this.OooOOO0 = 7;
        return i;
    }

    public final int OooOo0() {
        if (this.OooOo0 < this.OooOoO0) {
            this.OooOO0.OooOO0(this.OooOOo);
            this.OooOo0++;
            return this.OooOOo;
        }
        this.OooOOO0 = 2;
        this.OooOo00++;
        this.OooOOo0 = 0;
        return OooOo00();
    }

    public final int OooOo00() throws IOException {
        int i = this.OooOo00;
        if (i > this.OooO0Oo) {
            OooO0oo();
            OooO();
            return OooOOOO();
        }
        this.OooOOoo = this.OooOOo;
        h5 h5Var = this.OooOoO;
        byte[] bArr = h5Var.OooOOOO;
        int i2 = this.OooOo;
        int i3 = bArr[i2] & 255;
        this.OooOo = h5Var.OooOOO[i2];
        int i4 = this.OooOo0O;
        if (i4 == 0) {
            int i5 = this.OooOo0o;
            this.OooOo0O = a82.OooO00o[i5] - 1;
            int i6 = i5 + 1;
            this.OooOo0o = i6;
            if (i6 == 512) {
                this.OooOo0o = 0;
            }
        } else {
            this.OooOo0O = i4 - 1;
        }
        int i7 = i3 ^ (this.OooOo0O == 1 ? 1 : 0);
        this.OooOOo = i7;
        this.OooOo00 = i + 1;
        this.OooOOO0 = 3;
        this.OooOO0.OooOO0(i7);
        return i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream inputStream = this.OooOO0o;
        if (inputStream != null) {
            try {
                if (inputStream != System.in) {
                    inputStream.close();
                }
            } finally {
                this.OooOoO = null;
                this.OooOO0o = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0) {
            ra.OooO0oO(rj.OooO00o(i, "offs(", ") < 0."));
            return 0;
        }
        if (i2 < 0) {
            ra.OooO0oO(rj.OooO00o(i2, "len(", ") < 0."));
            return 0;
        }
        int i3 = i + i2;
        if (i3 > bArr.length) {
            ra.OooO0oO(rj.OooO0o(rj.OooO(i, i2, "offs(", ") + len(", ") > dest.length("), bArr.length, ")."));
            return 0;
        }
        if (this.OooOO0o == null) {
            qa.OooOOOO("stream closed");
            return 0;
        }
        if (i2 == 0) {
            return 0;
        }
        int i4 = i;
        while (i4 < i3) {
            int iOooOOO = OooOOO();
            if (iOooOOO < 0) {
                break;
            }
            bArr[i4] = (byte) iOooOOO;
            count(1);
            i4++;
        }
        if (i4 == i) {
            return -1;
        }
        return i4 - i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.OooOO0o != null) {
            int iOooOOO = OooOOO();
            count(iOooOOO < 0 ? -1 : 1);
            return iOooOOO;
        }
        qa.OooOOOO("stream closed");
        return 0;
    }
}

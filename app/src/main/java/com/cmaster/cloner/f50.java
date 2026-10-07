package com.cmaster.cloner;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f50 {
    public ByteBuffer OooO0O0;
    public e50 OooO0OO;
    public final byte[] OooO00o = new byte[256];
    public int OooO0Oo = 0;

    public final boolean OooO00o() {
        return this.OooO0OO.OooO0O0 != 0;
    }

    public final e50 OooO0O0() {
        byte[] bArr;
        if (this.OooO0O0 == null) {
            qa.OooO0o("You must call setData() before parseHeader()");
            return null;
        }
        if (OooO00o()) {
            return this.OooO0OO;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) OooO0OO());
        }
        boolean zStartsWith = sb.toString().startsWith("GIF");
        e50 e50Var = this.OooO0OO;
        if (zStartsWith) {
            e50Var.OooO0o = this.OooO0O0.getShort();
            this.OooO0OO.OooO0oO = this.OooO0O0.getShort();
            int iOooO0OO = OooO0OO();
            e50 e50Var2 = this.OooO0OO;
            e50Var2.OooO0oo = (iOooO0OO & 128) != 0;
            e50Var2.OooO = (int) Math.pow(2.0d, (iOooO0OO & 7) + 1);
            this.OooO0OO.OooOO0 = OooO0OO();
            e50 e50Var3 = this.OooO0OO;
            OooO0OO();
            e50Var3.getClass();
            if (this.OooO0OO.OooO0oo && !OooO00o()) {
                e50 e50Var4 = this.OooO0OO;
                e50Var4.OooO00o = OooO0o0(e50Var4.OooO);
                e50 e50Var5 = this.OooO0OO;
                e50Var5.OooOO0O = e50Var5.OooO00o[e50Var5.OooOO0];
            }
        } else {
            e50Var.OooO0O0 = 1;
        }
        if (!OooO00o()) {
            boolean z = false;
            while (!z && !OooO00o() && this.OooO0OO.OooO0OO <= Integer.MAX_VALUE) {
                int iOooO0OO2 = OooO0OO();
                if (iOooO0OO2 == 33) {
                    int iOooO0OO3 = OooO0OO();
                    if (iOooO0OO3 == 1) {
                        OooO0o();
                    } else if (iOooO0OO3 == 249) {
                        this.OooO0OO.OooO0Oo = new a50();
                        OooO0OO();
                        int iOooO0OO4 = OooO0OO();
                        a50 a50Var = this.OooO0OO.OooO0Oo;
                        int i2 = (iOooO0OO4 & 28) >> 2;
                        a50Var.OooO0oO = i2;
                        if (i2 == 0) {
                            a50Var.OooO0oO = 1;
                        }
                        a50Var.OooO0o = (iOooO0OO4 & 1) != 0;
                        short s = this.OooO0O0.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        a50 a50Var2 = this.OooO0OO.OooO0Oo;
                        a50Var2.OooO = s * 10;
                        a50Var2.OooO0oo = OooO0OO();
                        OooO0OO();
                    } else if (iOooO0OO3 == 254) {
                        OooO0o();
                    } else if (iOooO0OO3 != 255) {
                        OooO0o();
                    } else {
                        OooO0Oo();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.OooO00o;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                OooO0Oo();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.OooO0OO.getClass();
                                }
                                if (this.OooO0Oo > 0) {
                                }
                            } while (!OooO00o());
                        } else {
                            OooO0o();
                        }
                    }
                } else if (iOooO0OO2 == 44) {
                    e50 e50Var6 = this.OooO0OO;
                    if (e50Var6.OooO0Oo == null) {
                        e50Var6.OooO0Oo = new a50();
                    }
                    e50Var6.OooO0Oo.OooO00o = this.OooO0O0.getShort();
                    this.OooO0OO.OooO0Oo.OooO0O0 = this.OooO0O0.getShort();
                    this.OooO0OO.OooO0Oo.OooO0OO = this.OooO0O0.getShort();
                    this.OooO0OO.OooO0Oo.OooO0Oo = this.OooO0O0.getShort();
                    int iOooO0OO5 = OooO0OO();
                    boolean z2 = (iOooO0OO5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iOooO0OO5 & 7) + 1);
                    a50 a50Var3 = this.OooO0OO.OooO0Oo;
                    a50Var3.OooO0o0 = (iOooO0OO5 & 64) != 0;
                    if (z2) {
                        a50Var3.OooOO0O = OooO0o0(iPow);
                    } else {
                        a50Var3.OooOO0O = null;
                    }
                    this.OooO0OO.OooO0Oo.OooOO0 = this.OooO0O0.position();
                    OooO0OO();
                    OooO0o();
                    if (!OooO00o()) {
                        e50 e50Var7 = this.OooO0OO;
                        e50Var7.OooO0OO++;
                        e50Var7.OooO0o0.add(e50Var7.OooO0Oo);
                    }
                } else if (iOooO0OO2 != 59) {
                    this.OooO0OO.OooO0O0 = 1;
                } else {
                    z = true;
                }
            }
            e50 e50Var8 = this.OooO0OO;
            if (e50Var8.OooO0OO < 0) {
                e50Var8.OooO0O0 = 1;
            }
        }
        return this.OooO0OO;
    }

    public final int OooO0OO() {
        try {
            return this.OooO0O0.get() & 255;
        } catch (Exception unused) {
            this.OooO0OO.OooO0O0 = 1;
            return 0;
        }
    }

    public final void OooO0Oo() {
        int iOooO0OO = OooO0OO();
        this.OooO0Oo = iOooO0OO;
        if (iOooO0OO <= 0) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                i2 = this.OooO0Oo;
                if (i >= i2) {
                    return;
                }
                i2 -= i;
                this.OooO0O0.get(this.OooO00o, i, i2);
                i += i2;
            } catch (Exception e) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder sbOooO = rj.OooO(i, i2, "Error Reading Block n: ", " count: ", " blockSize: ");
                    sbOooO.append(this.OooO0Oo);
                    Log.d("GifHeaderParser", sbOooO.toString(), e);
                }
                this.OooO0OO.OooO0O0 = 1;
                return;
            }
        }
    }

    public final void OooO0o() {
        int iOooO0OO;
        do {
            iOooO0OO = OooO0OO();
            this.OooO0O0.position(Math.min(this.OooO0O0.position() + iOooO0OO, this.OooO0O0.limit()));
        } while (iOooO0OO > 0);
    }

    public final int[] OooO0o0(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.OooO0O0.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
            return iArr;
        } catch (BufferUnderflowException e) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e);
            }
            this.OooO0OO.OooO0O0 = 1;
            return iArr;
        }
    }
}

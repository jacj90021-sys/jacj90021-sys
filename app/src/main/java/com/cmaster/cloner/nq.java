package com.cmaster.cloner;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.Adler32;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nq {
    public final vt0 OooO;
    public final zt0 OooO00o;
    public final zt0 OooO0O0;
    public final zt0 OooO0OO;
    public final zt0 OooO0Oo;
    public final o51 OooO0o;
    public final o51 OooO0o0;
    public final o51 OooO0oO;
    public final mz OooO0oo;
    public final qd OooOO0;
    public final zt0 OooOO0O;
    public final zt0 OooOO0o;
    public final he1[] OooOOO;
    public final o51 OooOOO0;
    public int OooOOOO;

    public nq(im2 im2Var) {
        o51 o51Var = new o51(this, 3);
        this.OooOOO0 = o51Var;
        yt0 yt0Var = yt0.OooO0Oo;
        zt0 zt0Var = new zt0(null, this, 4, yt0Var);
        this.OooO0O0 = zt0Var;
        String strOooO00o = u7.OooO00o(new byte[]{43, 66, 8, -30, -106, 100, -115, -90, 61}, new byte[]{92, 45, 122, -122, -55, 0, -20, -46});
        yt0 yt0Var2 = yt0.OooO0o0;
        zt0 zt0Var2 = new zt0(strOooO00o, this, 4, yt0Var2);
        this.OooO00o = zt0Var2;
        zt0 zt0Var3 = new zt0(u7.OooO00o(new byte[]{-4, 55, 35, -121, -86, -105, -13, 109, -18, 55, 48}, new byte[]{-113, 67, 81, -18, -60, -16, -84, 9}), this, 1, yt0.OooO0o);
        this.OooO0Oo = zt0Var3;
        zt0 zt0Var4 = new zt0(null, this, 1, yt0Var);
        this.OooOO0O = zt0Var4;
        zt0 zt0Var5 = new zt0(u7.OooO00o(new byte[]{-91, -114, 112, 88, 111, -122, -72, 83, -90}, new byte[]{-57, -9, 4, 61, 48, -30, -39, 39}), this, 1, yt0Var2);
        this.OooOO0o = zt0Var5;
        o51 o51Var2 = new o51(this, 1);
        this.OooO0o0 = o51Var2;
        o51 o51Var3 = new o51(this, 2);
        this.OooO0o = o51Var3;
        o51 o51Var4 = new o51(this, 0);
        this.OooO0oO = o51Var4;
        mz mzVar = new mz(this);
        this.OooO0oo = mzVar;
        vt0 vt0Var = new vt0(this);
        this.OooO = vt0Var;
        qd qdVar = new qd(this);
        this.OooOO0 = qdVar;
        zt0 zt0Var6 = new zt0(u7.OooO00o(new byte[]{60, -29, -42}, new byte[]{81, -126, -90, 41, -69, 87, -126, -62}), this, 4, yt0Var);
        this.OooO0OO = zt0Var6;
        this.OooOOO = new he1[]{o51Var, o51Var2, o51Var3, o51Var4, mzVar, vt0Var, qdVar, zt0Var2, zt0Var, zt0Var3, zt0Var5, zt0Var4, zt0Var6};
        this.OooOOOO = -1;
    }

    public final int OooO00o() {
        int i = this.OooOOOO;
        if (i >= 0) {
            return i;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-8, -15, -85, -103, 97, -61, 33, -81, -5, -72, -87, -109, 53, -112, 49, -80, -22, -72, -84, -110, 46, -57, 38}, new byte[]{-98, -104, -57, -4, 65, -80, 72, -43}));
        return 0;
    }

    public final void OooO0O0(oh ohVar) {
        if (ohVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-69, -14, -105, 95, 5, -58, -123, 111, -83, -19, -113}, new byte[]{-40, -127, -29, 127, 56, -5, -91, 1}));
            return;
        }
        if (ohVar instanceof ml) {
            this.OooO0o0.OooOOo0((ml) ohVar);
            return;
        }
        if (ohVar instanceof nl) {
            this.OooO0o.OooOOo((nl) ohVar);
        } else if (ohVar instanceof jl) {
            this.OooO.OooOOOO((jl) ohVar);
        } else if (ohVar instanceof yk) {
            this.OooO0oo.OooOOOO((yk) ohVar);
        }
    }

    public final byte[] OooO0OO() throws NoSuchAlgorithmException, DigestException {
        this.OooOO0.OooO0o0();
        this.OooOO0O.OooO0o0();
        this.OooO00o.OooO0o0();
        this.OooOO0o.OooO0o0();
        this.OooO.OooO0o0();
        this.OooO0oo.OooO0o0();
        this.OooO0oO.OooO0o0();
        this.OooO0O0.OooO0o0();
        this.OooO0o.OooO0o0();
        this.OooO0o0.OooO0o0();
        this.OooO0Oo.OooO0o0();
        this.OooOOO0.OooO0o0();
        he1[] he1VarArr = this.OooOOO;
        int length = he1VarArr.length;
        int iOooOO0 = 0;
        for (int i = 0; i < length; i++) {
            he1 he1Var = he1VarArr[i];
            if ((he1Var != null && he1Var != null) || !he1Var.OooO0Oo().isEmpty()) {
                if (iOooOO0 < 0) {
                    he1Var.getClass();
                    ra.OooOOO(u7.OooO00o(new byte[]{-55, -39, 64, 123, -116, 92, 17, 43, -54, -60, 12, 34, -29, 10}, new byte[]{-81, -80, 44, 30, -61, 58, 119, 88}));
                    return null;
                }
                if (he1Var.OooO0Oo >= 0) {
                    ra.OooOOO0(u7.OooO00o(new byte[]{-6, -19, 81, -87, -89, -58, 30, 68, -7, -16, 29, -83, -124, -46, 29, 86, -8, -3, 29, -65, -115, -44}, new byte[]{-100, -124, 61, -52, -24, -96, 120, 55}));
                    return null;
                }
                int i2 = he1Var.OooO0OO - 1;
                int i3 = (~i2) & (iOooOO0 + i2);
                he1Var.OooO0Oo = i3;
                if (i3 < iOooOO0) {
                    ra.OooOOO0(px0.OooOOOo(new byte[]{-10, 29, 54, 3, 5, -72, 31, 47, -11, 17, 52, 27, 19, -10, 27, 99, -14, 29, 35, 86, 5, -3, 12, 55, -3, 29, 63, 86}, new byte[]{-108, 114, 81, 118, 118, -104, 111, 67}, new StringBuilder(), i));
                    return null;
                }
                zt0 zt0Var = this.OooO0OO;
                if (he1Var == zt0Var) {
                    try {
                        wp0.OooOO0o(he1VarArr, zt0Var);
                        zt0Var.OooO0o0();
                    } catch (RuntimeException e) {
                        throw dx.OooO0O0(u7.OooO00o(new byte[]{-127, 27, 1, 119, -30, -51, -46, -45, -113, 66, 93, 105, -2, -51, -48, -47, -113, 70, 74, 99, -2, -51, -47, -40, -113}, new byte[]{-81, 53, 47, 0, -118, -92, -66, -74}) + i, e);
                    }
                }
                if (he1Var instanceof zt0) {
                    ((zt0) he1Var).OooOOOO();
                }
                iOooOO0 = he1Var.OooOO0() + i3;
            }
        }
        this.OooOOOO = iOooOO0;
        byte[] bArr = new byte[iOooOO0];
        q9 q9Var = new q9(bArr, false);
        for (int i4 = 0; i4 < length; i4++) {
            try {
                he1 he1Var2 = he1VarArr[i4];
                if ((he1Var2 != null && he1Var2 != null) || !he1Var2.OooO0Oo().isEmpty()) {
                    int iOooO0OO = he1Var2.OooO0OO() - q9Var.OooO0OO;
                    if (iOooO0OO < 0) {
                        throw new dx(u7.OooO00o(new byte[]{-93, 109, 20, 48, 112, 56, 17, 122, -76, 124, 3, 48, 35, 36, 87, 45}, new byte[]{-58, 21, 119, 85, 3, 75, 49, 13}) + (-iOooO0OO), null);
                    }
                    q9Var.OooOOOO(iOooO0OO);
                    he1Var2.OooOO0O(q9Var);
                }
            } catch (RuntimeException e2) {
                dx dxVar = e2 instanceof dx ? (dx) e2 : new dx(null, e2);
                dxVar.OooO00o(u7.OooO00o(new byte[]{-74, 67, -28, -98, 86, -113, 87, 43, -72, 26, -72, -128, 74, -113, 85, 41, -72, 30, -81, -118, 74, -113, 84, 32, -72}, new byte[]{-104, 109, -54, -23, 62, -26, 59, 78}) + i4);
                throw dxVar;
            }
        }
        int i5 = q9Var.OooO0OO;
        if (i5 != this.OooOOOO) {
            ra.OooOOO0(u7.OooO00o(new byte[]{-6, -6, 116, -82, -53, 29, 3, -114, -24, -16, 104, -82, -36, 85, 27, -114, -11, -31, 99}, new byte[]{-100, -107, 6, -53, -72, 117, 108, -4}));
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(u7.OooO00o(new byte[]{84, 79, 113, -68, -9}, new byte[]{7, 7, 48, -111, -58, -2, 109, -22}));
            messageDigest.update(bArr, 32, i5 - 32);
            try {
                int iDigest = messageDigest.digest(bArr, 12, 20);
                if (iDigest != 20) {
                    throw new RuntimeException(u7.OooO00o(new byte[]{-5, -105, -118, -118, 58, 22, 92, -19, -21, -99, -49, -106, 35, 20, 90, -22, -6, -39, -104, -128, 35, 7, 90, -93, -82}, new byte[]{-114, -7, -17, -14, 74, 115, 63, -103}) + iDigest + u7.OooO00o(new byte[]{47, 93, 72, -117, 16, 43}, new byte[]{15, 63, 49, -1, 117, 88, 47, 3}));
                }
                int i6 = q9Var.OooO0OO;
                Adler32 adler32 = new Adler32();
                adler32.update(bArr, 12, i6 - 12);
                int value = (int) adler32.getValue();
                bArr[8] = (byte) value;
                bArr[9] = (byte) (value >> 8);
                bArr[10] = (byte) (value >> 16);
                bArr[11] = (byte) (value >> 24);
                return q9Var.OooO0O0;
            } catch (DigestException e3) {
                sa.OooOO0(e3);
                return null;
            }
        } catch (NoSuchAlgorithmException e4) {
            sa.OooOO0(e4);
            return null;
        }
    }
}

package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i7 {
    public final int OooO00o;
    public final dh0 OooO0O0;
    public final ti0 OooO0OO;
    public final int OooO0Oo;

    public i7(int i, dh0 dh0Var, ti0 ti0Var, int i2) {
        int i3;
        int i4;
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-67, -85, 36, 93, -64, 76, 27, -15, -31}, new byte[]{-47, -54, 70, 56, -84, 108, 39, -47}));
            throw null;
        }
        try {
            dh0Var.OooO0Oo();
            int length = dh0Var.OooO0o0.length;
            if (length == 0) {
                ra.OooOOO(u7.OooO00o(new byte[]{-128, -123, 24, 122, -30, -86, 1, 89, -109, -114, 67, 61, -79, -71, 79, 16, -39}, new byte[]{-23, -21, 107, 20, -111, -124, 114, 48}));
                throw null;
            }
            int i5 = length - 2;
            while (true) {
                if (i5 < 0) {
                    if (((ch0) dh0Var.OooO0o0(length - 1)).OooO0Oo.OooO0o0 == 1) {
                        ra.OooOOO(u7.OooO00o(new byte[]{-69, -23, -61, -85, 23, 86, -15, 98, -73, -12, -112, -85, 11, 2, -75, 104, -68, -29, -112, -78, 13, 2, -3, 45, -77, -89, -46, -73, 5, 24, -10, 101, -14, -24, -62, -27, 16, 30, -25, 98, -91, -18, -34, -94, 68, 31, -5, 126, -90, -11, -59, -90, 16, 31, -6, 99}, new byte[]{-46, -121, -80, -59, 100, 118, -107, 13}));
                        throw null;
                    }
                    try {
                        ti0Var.OooO0Oo();
                        if (i2 < -1) {
                            ra.OooOOO(u7.OooO00o(new byte[]{-98, -19, -114, -86, 93, 63, 41, 87, -101, -4, -124, -94, 79, 62, 63, 118, -50, -93, -57, -22, 13}, new byte[]{-18, -97, -25, -57, 60, 77, 80, 4}));
                            throw null;
                        }
                        if (i2 >= 0) {
                            int i6 = ti0Var.OooO0o;
                            if (!ti0Var.OooO0oO) {
                                i3 = 0;
                                while (true) {
                                    if (i3 >= i6) {
                                        i3 = -i6;
                                        break;
                                    } else if (ti0Var.OooO0o0[i3] == i2) {
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            } else {
                                int i7 = -1;
                                i3 = i6;
                                while (i3 > i7 + 1) {
                                    int i8 = ((i3 - i7) >> 1) + i7;
                                    if (i2 <= ti0Var.OooO0o0[i8]) {
                                        i3 = i8;
                                    } else {
                                        i7 = i8;
                                    }
                                }
                                if (i3 == i6) {
                                    i4 = -i6;
                                } else if (i2 != ti0Var.OooO0o0[i3]) {
                                    i4 = -i3;
                                }
                                i3 = i4 - 1;
                            }
                            if (!((i3 >= 0 ? i3 : -1) >= 0)) {
                                StringBuilder sb = new StringBuilder();
                                rj.OooOOOo(new byte[]{-25, -16, 33, 1, -110, 12, 27, -77, -30, -31, 43, 9, -128, 13, 13, -110, -73}, new byte[]{-105, -126, 72, 108, -13, 126, 98, -32}, sb, i2);
                                qa.OooO0oo(sb, u7.OooO00o(new byte[]{44, 82, -87, 105, 76, 4, 59, -83, 127, 73, -91, 126, 9, 30, 38, -30, 126, 79, -26}, new byte[]{12, 60, -58, 29, 108, 109, 85, -115}), ti0Var);
                                throw null;
                            }
                        }
                        this.OooO00o = i;
                        this.OooO0O0 = dh0Var;
                        this.OooO0OO = ti0Var;
                        this.OooO0Oo = i2;
                        return;
                    } catch (NullPointerException unused) {
                        qa.OooOOO0(u7.OooO00o(new byte[]{11, -48, 66, 5, -32, 61, 20, 22, 10, -42, 1, 91, -72, 110, 9, 12, 20, -55}, new byte[]{120, -91, 33, 102, -123, 78, 103, 121}));
                        throw null;
                    }
                }
                if (((ch0) dh0Var.OooO0o0(i5)).OooO0Oo.OooO0o0 != 1) {
                    StringBuilder sb2 = new StringBuilder();
                    rj.OooOOOo(new byte[]{71, -104, 59, -24, -64, 119}, new byte[]{46, -10, 72, -122, -77, 44, -56, 79}, sb2, i5);
                    ra.OooOOO(rj.OooO0oo(new byte[]{-94, 77, 12, -3, 55, 120, 36, -68, -115, 12, 11, -19, 127, 57, 107, -84, -33, 14, 4, -32, 55, 109, 108, -84, -112, 26}, new byte[]{-1, 109, 101, -114, 23, 25, 4, -34}, sb2));
                    throw null;
                }
                i5--;
            }
        } catch (NullPointerException unused2) {
            qa.OooOOO0(u7.OooO00o(new byte[]{33, 34, -71, -104, 19, -42, 96, -5, 104, 34, -65, -102, 12}, new byte[]{72, 76, -54, -10, 96, -10, 93, -58}));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "{" + js2.OooO0O0(this.OooO00o) + '}';
    }
}

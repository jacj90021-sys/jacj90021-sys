package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class os {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final au2 OooO0Oo;
    public final boolean OooO0o0;

    public os(int i, int i2, int i3, au2 au2Var, boolean z) {
        if (!ww2.OooO00o(i)) {
            ra.OooOOO(u7.OooO00o(new byte[]{114, -26, 126, -30, 12, 62, -75, -88, 115, -26, 125, -14}, new byte[]{16, -119, 25, -105, 127, 30, -38, -40}));
            throw null;
        }
        if (!ww2.OooO00o(i2)) {
            ra.OooOOO(u7.OooO00o(new byte[]{56, 89, 72, -87, -118, -18, 43, -102, 55, 95, 67, -91}, new byte[]{90, 54, 47, -36, -7, -50, 77, -5}));
            throw null;
        }
        if (!ww2.OooO00o(i3)) {
            ra.OooOOO(u7.OooO00o(new byte[]{7, -82, 49, -93, -6, -125, -74, 119, 29, -75, 25, -90, -22, -52, -68, 119}, new byte[]{101, -63, 86, -42, -119, -93, -40, 18}));
            throw null;
        }
        if (au2Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{37, -70, 119, 36, 3, -46, -12, -89, 126, -11, 107, 60, 14, -54}, new byte[]{67, -43, 5, 73, 98, -90, -44, -102}));
            throw null;
        }
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = i3;
        this.OooO0Oo = au2Var;
        this.OooO0o0 = z;
    }

    public final String OooO00o() {
        int i = this.OooO00o;
        try {
            i10 i10Var = oz0.OooO00o[i + 1];
            if (i10Var != null) {
                return i10Var.OooO0OO;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException(u7.OooO00o(new byte[]{113, 26, 126, 122, 17, 11, -69, -104, 112, 26, 125, 106, 88, 11}, new byte[]{19, 117, 25, 15, 98, 43, -44, -24}).concat(i == ((char) i) ? js2.OooO0O0(i) : js2.OooO0OO(i)));
    }

    public final String toString() {
        return OooO00o();
    }
}

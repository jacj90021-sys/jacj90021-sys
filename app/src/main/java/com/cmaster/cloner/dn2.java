package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class dn2 {
    public static final int OooO00o(m3 m3Var, Object obj, int i) {
        int i2 = m3Var.OooO0o;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iOooO00o = tf0.OooO00o(m3Var.OooO0Oo, i2, i);
            if (iOooO00o < 0 || ij0.OooO00o(obj, m3Var.OooO0o0[iOooO00o])) {
                return iOooO00o;
            }
            int i3 = iOooO00o + 1;
            while (i3 < i2 && m3Var.OooO0Oo[i3] == i) {
                if (ij0.OooO00o(obj, m3Var.OooO0o0[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iOooO00o - 1; i4 >= 0 && m3Var.OooO0Oo[i4] == i; i4--) {
                if (ij0.OooO00o(obj, m3Var.OooO0o0[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            sa.OooO0O0();
            return 0;
        }
    }
}

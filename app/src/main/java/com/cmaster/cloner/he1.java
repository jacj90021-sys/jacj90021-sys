package com.cmaster.cloner;

import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class he1 {
    public final String OooO00o;
    public final nq OooO0O0;
    public final int OooO0OO;
    public int OooO0Oo;
    public boolean OooO0o0;

    public he1(String str, nq nqVar, int i) {
        if (nqVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{18, 22, -39, 75, -60, -117, -112, 41, 26, 10, -39, 66}, new byte[]{116, 127, -75, 46, -28, -74, -83, 9}));
            throw null;
        }
        OooO(i);
        this.OooO00o = str;
        this.OooO0O0 = nqVar;
        this.OooO0OO = i;
        this.OooO0Oo = -1;
        this.OooO0o0 = false;
    }

    public static void OooO(int i) {
        if (i <= 0 || (i & (i - 1)) != 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{103, 13, -34, -36, -3, -47, -28, 94, 111, 15, -63, -38, -1, -43, -27, 16, 122}, new byte[]{14, 99, -88, -67, -111, -72, -128, 126}));
        }
    }

    public abstract int OooO00o(pj0 pj0Var);

    public final int OooO0O0(int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{46, 86, -60, 82, 30, -2, 101, -7, 124, 15, -120, 3}, new byte[]{92, 51, -88, 51, 106, -105, 19, -100}));
            return 0;
        }
        int i2 = this.OooO0Oo;
        if (i2 >= 0) {
            return i2 + i;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-64, 48, -2, 73, 66, -100, 12, -92, -61, 45, -78, 66, 98, -114, 74, -82, -61, 45, -78, 95, 104, -114}, new byte[]{-90, 89, -110, 44, 13, -6, 106, -41}));
        return 0;
    }

    public final int OooO0OO() {
        int i = this.OooO0Oo;
        if (i >= 0) {
            return i;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-114, 82, -33, 63, 1, -118, -30, -116, -115, 79, -109, 52, 33, -104, -92, -116, -115, 79}, new byte[]{-24, 59, -77, 90, 78, -20, -124, -1}));
        return 0;
    }

    public abstract Collection OooO0Oo();

    public abstract void OooO0o();

    public final void OooO0o0() {
        OooO0oo();
        OooO0o();
        this.OooO0o0 = true;
    }

    public final void OooO0oO() {
        if (this.OooO0o0) {
            return;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{115, 34, -127, 32, -101, -123, -113, -57, 124, 63, -112, 100}, new byte[]{29, 77, -11, 0, -21, -9, -22, -73}));
    }

    public final void OooO0oo() {
        if (this.OooO0o0) {
            ra.OooOOO0(u7.OooO00o(new byte[]{-43, -121, 26, -15, -52, -52, 120, 9, -60, -103, 13, -28, -52, -38, 100, 77}, new byte[]{-76, -21, 104, -108, -83, -88, 1, 41}));
        }
    }

    public abstract int OooOO0();

    public final void OooOO0O(q9 q9Var) {
        OooO0oO();
        q9Var.OooO00o(this.OooO0OO);
        int i = q9Var.OooO0OO;
        int i2 = this.OooO0Oo;
        if (i2 < 0) {
            this.OooO0Oo = i;
        } else if (i2 != i) {
            StringBuilder sb = new StringBuilder();
            sb.append(u7.OooO00o(new byte[]{29, 116, -58, 83, -26, 124, 85, -67, 8, 56, -62, 93, -5, 124, 81, -89, 31, 112, -107, 20, -18, 126, 66, -13}, new byte[]{124, 24, -81, 52, -120, 17, 48, -45}));
            sb.append(this);
            rj.OooOOOo(new byte[]{84, -128, -37, 71, 117}, new byte[]{120, -96, -70, 51, 85, -32, -32, 40}, sb, i);
            sb.append(u7.OooO00o(new byte[]{-108, 101, -77, 24, -15, -4, -88, 109, -56, 32, -78, 25, -32, -72, -19}, new byte[]{-72, 69, -47, 109, -123, -36, -51, 21}));
            sb.append(this.OooO0Oo);
            throw new RuntimeException(sb.toString());
        }
        if (q9Var.OooO0Oo()) {
            String str = this.OooO00o;
            if (str != null) {
                q9Var.OooO0O0(0, "\n" + str + u7.OooO00o(new byte[]{81}, new byte[]{107, -128, 45, 29, -6, -104, 46, -110}));
            } else if (i != 0) {
                q9Var.OooO0O0(0, "\n");
            }
        }
        OooOO0o(q9Var);
    }

    public abstract void OooOO0o(q9 q9Var);
}

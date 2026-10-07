package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w81 extends ev0 {
    public int OooO0o;
    public final u81[] OooO0o0;

    static {
        new w81(0);
    }

    public w81(int i) {
        super(i != 0);
        this.OooO0o0 = new u81[i];
        this.OooO0o = 0;
    }

    public final int OooO0o() {
        int i = this.OooO0o;
        if (i >= 0) {
            return i;
        }
        int i2 = 0;
        for (u81 u81Var : this.OooO0o0) {
            if (u81Var != null) {
                i2++;
            }
        }
        this.OooO0o = i2;
        return i2;
    }

    public final u81 OooO0o0(int i) {
        try {
            return this.OooO0o0[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            ra.OooOOO(u7.OooO00o(new byte[]{-122, -21, 47, -69, -111, -85, -36, 22, -125}, new byte[]{-28, -124, 72, -50, -30, -117, -82, 115}));
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w81) {
            w81 w81Var = (w81) obj;
            u81[] u81VarArr = w81Var.OooO0o0;
            u81[] u81VarArr2 = this.OooO0o0;
            int length = u81VarArr2.length;
            if (length == u81VarArr.length && OooO0o() == w81Var.OooO0o()) {
                for (int i = 0; i < length; i++) {
                    u81 u81Var = u81VarArr2[i];
                    Object obj2 = u81VarArr[i];
                    if (u81Var == obj2 || (u81Var != null && u81Var.equals(obj2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        u81[] u81VarArr = this.OooO0o0;
        int length = u81VarArr.length;
        int iHashCode = 0;
        for (int i = 0; i < length; i++) {
            u81 u81Var = u81VarArr[i];
            iHashCode = (iHashCode * 31) + (u81Var == null ? 0 : u81Var.hashCode());
        }
        return iHashCode;
    }

    public final String toString() {
        u81[] u81VarArr = this.OooO0o0;
        StringBuilder sb = new StringBuilder(u81VarArr.length * 25);
        sb.append('{');
        boolean z = false;
        for (u81 u81Var : u81VarArr) {
            if (u81Var != null) {
                if (z) {
                    sb.append(u7.OooO00o(new byte[]{-41, 42}, new byte[]{-5, 10, -13, 12, 86, -3, -2, -16}));
                } else {
                    z = true;
                }
                sb.append(u81Var);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

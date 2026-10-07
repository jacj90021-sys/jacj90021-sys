package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ph1 {
    public final int OooO00o;
    public final int OooO0O0;

    public ph1(int i, int i2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }

    public static ph1 OooO00o(String str) {
        if (str == null) {
            ra.OooOOO("string must not be null");
            return null;
        }
        int iIndexOf = str.indexOf(42);
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(120);
        }
        if (iIndexOf < 0) {
            throw new NumberFormatException(px0.OooOOOO("Invalid Size: \"", str, "\""));
        }
        try {
            return new ph1(Integer.parseInt(str.substring(0, iIndexOf)), Integer.parseInt(str.substring(iIndexOf + 1)));
        } catch (NumberFormatException unused) {
            throw new NumberFormatException(px0.OooOOOO("Invalid Size: \"", str, "\""));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ph1) {
            ph1 ph1Var = (ph1) obj;
            if (this.OooO00o == ph1Var.OooO00o && this.OooO0O0 == ph1Var.OooO0O0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.OooO00o;
        return this.OooO0O0 ^ ((i >>> 16) | (i << 16));
    }

    public final String toString() {
        return this.OooO00o + "x" + this.OooO0O0;
    }
}

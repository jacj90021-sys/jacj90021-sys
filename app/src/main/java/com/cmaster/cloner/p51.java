package com.cmaster.cloner;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p51 implements Comparable {
    public static final ConcurrentHashMap OooO0oo = new ConcurrentHashMap(10000, 0.75f);
    public final String OooO0Oo;
    public final bj1 OooO0o;
    public final vp1 OooO0o0;
    public bj1 OooO0oO;

    public p51(String str, vp1 vp1Var, bj1 bj1Var) {
        if (str == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{80, -22, -57, -91, -85, -66, -111, 63, 91, -3, -108, -5, -28, -9, -113, 62, 88, -29}, new byte[]{52, -113, -76, -58, -39, -41, -31, 75}));
            throw null;
        }
        if (vp1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{118, -6, -117, 70, -69, 14, 60, 56, 116, -6, -33, 14, -12, 64, 6, 52, 104, -13}, new byte[]{4, -97, -1, 51, -55, 96, 104, 65}));
            throw null;
        }
        this.OooO0Oo = str;
        this.OooO0o0 = vp1Var;
        this.OooO0o = bj1Var;
        this.OooO0oO = null;
    }

    public static p51 OooO0O0(String str) {
        int i;
        p51 p51Var = (p51) OooO0oo.get(str);
        if (p51Var != null) {
            return p51Var;
        }
        int length = str.length();
        if (str.charAt(0) != '(') {
            ra.OooOOO(u7.OooO00o(new byte[]{104, -88, 107, -25, 47, 52, 67, -5, 120, -96, 127, -77, 36, 35}, new byte[]{10, -55, 15, -57, 75, 81, 48, -104}));
            return null;
        }
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i3 >= length) {
                i3 = 0;
                break;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt >= 'A' && cCharAt <= 'Z') {
                i2++;
            }
            i3++;
        }
        if (i3 == 0 || i3 == length - 1) {
            ra.OooOOO(u7.OooO00o(new byte[]{-15, -8, 105, 108, -116, -2, -90, -76, -31, -16, 125, 56, -121, -23}, new byte[]{-109, -103, 13, 76, -24, -101, -43, -41}));
            return null;
        }
        if (str.indexOf(41, i3 + 1) != -1) {
            ra.OooOOO(u7.OooO00o(new byte[]{126, -37, -24, 87, -23, -55, -127, 40, 110, -45, -4, 3, -30, -34}, new byte[]{28, -70, -116, 119, -115, -84, -14, 75}));
            return null;
        }
        vp1[] vp1VarArr = new vp1[i2];
        int i4 = 0;
        int i5 = 1;
        while (true) {
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == ')') {
                vp1 vp1VarOooO0oO = vp1.OooO0oO(str.substring(i5 + 1));
                bj1 bj1Var = new bj1(i4);
                for (int i6 = 0; i6 < i4; i6++) {
                    bj1Var.OooO0o(i6, vp1VarArr[i6]);
                }
                return new p51(str, vp1VarOooO0oO, bj1Var);
            }
            int i7 = i5;
            while (cCharAt2 == '[') {
                i7++;
                cCharAt2 = str.charAt(i7);
            }
            if (cCharAt2 == 'L') {
                int iIndexOf = str.indexOf(59, i7);
                if (iIndexOf == -1) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-42, -42, -122, 88, -30, -55, 48, 65, -58, -34, -110, 12, -23, -34}, new byte[]{-76, -73, -30, 120, -122, -84, 67, 34}));
                    return null;
                }
                i = iIndexOf + 1;
            } else {
                i = i7 + 1;
            }
            vp1VarArr[i4] = vp1.OooO0o(str.substring(i5, i));
            i4++;
            i5 = i;
        }
    }

    public static p51 OooO0Oo(String str) {
        if (str == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{123, -2, 6, -61, 98, -128, -84, -28, 112, -23, 85, -99, 45, -55, -78, -27, 115, -9}, new byte[]{31, -101, 117, -96, 16, -23, -36, -112}));
            return null;
        }
        ConcurrentHashMap concurrentHashMap = OooO0oo;
        p51 p51Var = (p51) concurrentHashMap.get(str);
        if (p51Var != null) {
            return p51Var;
        }
        p51 p51VarOooO0O0 = OooO0O0(str);
        p51 p51Var2 = (p51) concurrentHashMap.putIfAbsent(p51VarOooO0O0.OooO0Oo, p51VarOooO0O0);
        return p51Var2 != null ? p51Var2 : p51VarOooO0O0;
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(p51 p51Var) {
        if (this != p51Var) {
            vp1 vp1Var = p51Var.OooO0o0;
            bj1 bj1Var = p51Var.OooO0o;
            int iCompareTo = this.OooO0o0.OooO0Oo.compareTo(vp1Var.OooO0Oo);
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            bj1 bj1Var2 = this.OooO0o;
            int length = bj1Var2.OooO0o0.length;
            int length2 = bj1Var.OooO0o0.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo2 = ((vp1) bj1Var2.OooO0o0(i)).OooO0Oo.compareTo(((vp1) bj1Var.OooO0o0(i)).OooO0Oo);
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }

    public final bj1 OooO0OO() {
        if (this.OooO0oO == null) {
            bj1 bj1Var = this.OooO0o;
            int length = bj1Var.OooO0o0.length;
            bj1 bj1Var2 = new bj1(length);
            boolean z = false;
            for (int i = 0; i < length; i++) {
                vp1 vp1Var = (vp1) bj1Var.OooO0o0(i);
                int i2 = vp1Var.OooO0o0;
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 6 || i2 == 8) {
                    vp1Var = vp1.OooOOOO;
                    z = true;
                }
                bj1Var2.OooO0o(i, vp1Var);
            }
            if (z) {
                bj1Var = bj1Var2;
            }
            this.OooO0oO = bj1Var;
        }
        return this.OooO0oO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p51)) {
            return false;
        }
        return this.OooO0Oo.equals(((p51) obj).OooO0Oo);
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode();
    }

    public final String toString() {
        return this.OooO0Oo;
    }
}

package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h00 extends ev0 implements ln1 {
    public final Object[] OooO0o0;

    public h00(int i) {
        super(i != 0);
        try {
            this.OooO0o0 = new Object[i];
        } catch (NegativeArraySizeException unused) {
            ra.OooOOO(u7.OooO00o(new byte[]{90, -99, 113, -128, -123, -127, -57, 67}, new byte[]{41, -12, 11, -27, -91, -67, -25, 115}));
            throw null;
        }
    }

    public static void OooO0oO(int i) {
        if (i >= 0) {
            throw new IndexOutOfBoundsException(u7.OooO00o(new byte[]{-70, 3, -114, 90, 96, 110, 80, -53, -79, 11, -103}, new byte[]{-44, 35, -80, 103, 64, 29, 57, -79}));
        }
        throw new IndexOutOfBoundsException(u7.OooO00o(new byte[]{-84, -91, 125, -52, -33}, new byte[]{-62, -123, 65, -20, -17, -89, -89, -73}));
    }

    @Override // com.cmaster.cloner.ln1
    public String OooO00o() {
        String name = getClass().getName();
        return OooO0oo(name.substring(name.lastIndexOf(46) + 1).concat("{"), u7.OooO00o(new byte[]{49, -116}, new byte[]{29, -84, 69, 66, 13, -87, 122, 14}), u7.OooO00o(new byte[]{35}, new byte[]{94, 1, 112, -67, -88, 66, 52, -98}), true);
    }

    public final void OooO0o(int i, Object obj) {
        OooO0OO();
        try {
            this.OooO0o0[i] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            OooO0oO(i);
            throw null;
        }
    }

    public final Object OooO0o0(int i) {
        try {
            Object obj = this.OooO0o0[i];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException(u7.OooO00o(new byte[]{-15, -99, 127, 7, 119, 12, 104}, new byte[]{-124, -13, 12, 98, 3, 54, 72, 19}) + i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            OooO0oO(i);
            throw null;
        }
    }

    public final String OooO0oo(String str, String str2, String str3, boolean z) {
        Object[] objArr = this.OooO0o0;
        int length = objArr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        sb.append(str);
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(str2);
            }
            if (z) {
                sb.append(((ln1) objArr[i]).OooO00o());
            } else {
                sb.append(objArr[i]);
            }
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.OooO0o0, ((h00) obj).OooO0o0);
    }

    public vp1 getType(int i) {
        return (vp1) OooO0o0(i);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.OooO0o0);
    }

    public final String toString() {
        String name = getClass().getName();
        return OooO0oo(name.substring(name.lastIndexOf(46) + 1).concat("{"), u7.OooO00o(new byte[]{27, 121}, new byte[]{55, 89, 79, 105, -42, 104, 85, 121}), u7.OooO00o(new byte[]{-76}, new byte[]{-55, -112, 117, 53, -10, 57, -79, 41}), false);
    }
}

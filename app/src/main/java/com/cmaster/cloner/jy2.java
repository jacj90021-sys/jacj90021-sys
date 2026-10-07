package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class jy2 {
    public static Class OooO00o(String str) {
        if (str.equals(u7.OooO00o(new byte[]{-75, -114, 55}, new byte[]{-36, -32, 67, 75, -124, 26, -115, -35}))) {
            return Integer.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{-111, -75, 37, 85}, new byte[]{-3, -38, 75, 50, -34, 18, -83, -87}))) {
            return Long.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{-123, -116, -22, 86, -95, 127, -114}, new byte[]{-25, -29, -123, 58, -60, 30, -32, 0}))) {
            return Boolean.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{95, -79, 93, -99}, new byte[]{61, -56, 41, -8, 47, -125, 32, -65}))) {
            return Byte.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{-22, 1, 71, -102, 3}, new byte[]{-103, 105, 40, -24, 119, 94, 25, -9}))) {
            return Short.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{-100, 58, 5, -43}, new byte[]{-1, 82, 100, -89, -19, -70, 106, -124}))) {
            return Character.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{30, 96, 90, -65, 107}, new byte[]{120, 12, 53, -34, 31, 38, -82, -66}))) {
            return Float.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{40, 115, 48, -127, 114, 78}, new byte[]{76, 28, 69, -29, 30, 43, 93, -37}))) {
            return Double.TYPE;
        }
        if (str.equals(u7.OooO00o(new byte[]{-17, -77, -100, 21}, new byte[]{-103, -36, -11, 113, -37, 118, -48, -100}))) {
            return Void.TYPE;
        }
        return null;
    }

    public static Class[] OooO0O0(ClassLoader classLoader, Object[] objArr) throws ClassNotFoundException {
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj instanceof Class) {
                clsArr[i] = (Class) obj;
            } else {
                String str = (String) obj;
                Class<?> clsOooO00o = OooO00o(str);
                if (clsOooO00o == null) {
                    if (objArr[i].equals(u7.OooO00o(new byte[]{-79, 34, 42, -103, -41, -104, 116, 115, -73, 109, 20, -103, -118, -123, 83, 127, -81}, new byte[]{-37, 67, 92, -8, -7, -19, 0, 26}))) {
                        try {
                            clsOooO00o = Class.forName(u7.OooO00o(new byte[]{-111, 25, 80, -78, 98, -18, -72, -119, -123, 3, 93, -84, 35, -58, -82, -43, -111, 14, 103, -91, 121}, new byte[]{-16, 119, 52, -64, 13, -121, -36, -89}));
                        } catch (Throwable unused) {
                            clsOooO00o = classLoader.loadClass(str);
                        }
                    } else {
                        clsOooO00o = classLoader.loadClass(str);
                    }
                }
                clsArr[i] = clsOooO00o;
            }
        }
        return clsArr;
    }

    public static Class[] OooO0OO(ClassLoader classLoader, String... strArr) throws ClassNotFoundException {
        Class[] clsArr = new Class[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            Class<?> clsOooO00o = OooO00o(strArr[i]);
            if (clsOooO00o == null) {
                if (strArr[i].equals(u7.OooO00o(new byte[]{-98, -62, -91, -9, 114, -114, 16, -87, -104, -115, -101, -9, 47, -109, 55, -91, -128}, new byte[]{-12, -93, -45, -106, 92, -5, 100, -64}))) {
                    try {
                        clsOooO00o = Class.forName(u7.OooO00o(new byte[]{22, -74, 92, 37, -33, 97, 91, 50, 2, -84, 81, 59, -98, 73, 77, 110, 22, -95, 107, 50, -60}, new byte[]{119, -40, 56, 87, -80, 8, 63, 28}));
                    } catch (Throwable unused) {
                        clsOooO00o = classLoader.loadClass(strArr[i]);
                    }
                } else {
                    clsOooO00o = classLoader.loadClass(strArr[i]);
                }
            }
            clsArr[i] = clsOooO00o;
        }
        return clsArr;
    }
}

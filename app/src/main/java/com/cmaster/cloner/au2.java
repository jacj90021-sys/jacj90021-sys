package com.cmaster.cloner;

import java.util.BitSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class au2 {
    public static String OooO00o(g00 g00Var) {
        int iOooOOO0 = ((ul1) g00Var).OooOOO0();
        int i = 0;
        if (iOooOOO0 == ((short) iOooOOO0)) {
            char[] cArr = new char[5];
            if (iOooOOO0 < 0) {
                cArr[0] = '-';
                iOooOOO0 = -iOooOOO0;
            } else {
                cArr[0] = '+';
            }
            while (i < 4) {
                cArr[4 - i] = Character.forDigit(iOooOOO0 & 15, 16);
                iOooOOO0 >>= 4;
                i++;
            }
            return new String(cArr);
        }
        char[] cArr2 = new char[9];
        if (iOooOOO0 < 0) {
            cArr2[0] = '-';
            iOooOOO0 = -iOooOOO0;
        } else {
            cArr2[0] = '+';
        }
        while (i < 8) {
            cArr2[8 - i] = Character.forDigit(iOooOOO0 & 15, 16);
            iOooOOO0 >>= 4;
            i++;
        }
        return new String(cArr2);
    }

    public static String OooO0OO(g00 g00Var) {
        int iOooO0o0 = ((ul1) g00Var).OooO0o0.OooO0o0();
        return iOooO0o0 == ((char) iOooO0o0) ? js2.OooO0O0(iOooO0o0) : js2.OooO0OO(iOooO0o0);
    }

    public static short OooO0o0(int i, int i2) {
        if ((i & 255) != i) {
            ra.OooOOO(u7.OooO00o(new byte[]{113, 23, 81, 93, -51, -24, -127, -27, 114, 30, 6, 15, -61, -13, -110, -96, 61, 72, 8, 83, -112, -88, -64}, new byte[]{29, 120, 38, 125, -94, -99, -11, -59}));
            return (short) 0;
        }
        if ((i2 & 255) == i2) {
            return (short) (i | (i2 << 8));
        }
        ra.OooOOO(u7.OooO00o(new byte[]{-92, 19, -115, 70, 4, 38, -16, 33, -20, 21, -116, 14, 86, 40, -21, 50, -87, 90, -38, 0, 10, 123, -80, 96}, new byte[]{-52, 122, -22, 46, 36, 73, -123, 85}));
        return (short) 0;
    }

    public static String OooOO0(gl glVar, int i) {
        StringBuilder sb = new StringBuilder(20);
        sb.append(u7.OooO00o(new byte[]{63}, new byte[]{28, -73, -19, 111, 87, -31, 68, -89}));
        long jOooO0oO = glVar instanceof fl ? ((fl) glVar).OooO0Oo : glVar.OooO0oO();
        if (i == 4) {
            sb.append(new String(new char[]{Character.forDigit(((int) jOooO0oO) & 15, 16)}));
        } else if (i == 8) {
            sb.append(js2.OooO00o((int) jOooO0oO));
        } else if (i == 16) {
            sb.append(js2.OooO0O0((int) jOooO0oO));
        } else if (i == 32) {
            sb.append(js2.OooO0OO((int) jOooO0oO));
        } else {
            if (i != 64) {
                ra.OooOOO0(u7.OooO00o(new byte[]{47, -82, 105, 108, -83, 4, -29, 87, 40, -26, 110, 120, -79, 16, -24, 30}, new byte[]{92, -58, 6, 25, -63, 96, -115, 112}));
                return null;
            }
            sb.append(js2.OooO0Oo(jOooO0oO));
        }
        return sb.toString();
    }

    public static String OooOO0O(gl glVar) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (glVar instanceof dl) {
            sb.append(u7.OooO00o(new byte[]{-30, -95, 14, 15}, new byte[]{-116, -44, 98, 99, -6, 66, 70, 121}));
        } else {
            sb.append(glVar.OooO0o0());
            sb.append(' ');
            sb.append(glVar.OooO00o());
        }
        return sb.toString();
    }

    public static int OooOO0o(int i, int i2) {
        if ((i & 15) != i) {
            ra.OooOOO(u7.OooO00o(new byte[]{-84, -29, 109, -59, -117, -1, 16, -22, -81, -22, 58, -105, -123, -28, 3, -81, -32, -68, 52, -53, -43, -65}, new byte[]{-64, -116, 26, -27, -28, -118, 100, -54}));
            return 0;
        }
        if ((i2 & 15) == i2) {
            return i | (i2 << 4);
        }
        ra.OooOOO(u7.OooO00o(new byte[]{-118, 82, -26, 114, 46, -112, -117, 89, -62, 84, -25, 58, 124, -98, -112, 74, -121, 27, -79, 52, 32, -50, -53}, new byte[]{-30, 59, -127, 26, 14, -1, -2, 45}));
        return 0;
    }

    public static String OooOOO(v81 v81Var) {
        int length = v81Var.OooO0o0.length;
        StringBuilder sb = new StringBuilder((length * 5) + 2);
        sb.append('{');
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(u7.OooO00o(new byte[]{11, 55}, new byte[]{39, 23, -5, 106, -4, 7, -120, 86}));
            }
            sb.append(((u81) v81Var.OooO0o0(i)).OooO0o());
        }
        sb.append('}');
        return sb.toString();
    }

    public static short OooOOO0(zm zmVar, int i) {
        if ((i & 255) != i) {
            ra.OooOOO(u7.OooO00o(new byte[]{49, -15, -99, -48, -23, 54, 50, -14, 63, -27, -38, -126, -25, 45, 33, -73, 112, -77, -44, -34, -76, 118, 115}, new byte[]{80, -125, -6, -16, -122, 67, 70, -46}));
            return (short) 0;
        }
        int i2 = zmVar.OooO0O0.OooO00o;
        if ((i2 & 255) == i2) {
            return (short) (i2 | (i << 8));
        }
        ra.OooOOO(u7.OooO00o(new byte[]{116, -127, 77, 65, -91, 14, 47, 120, 110, -123, 14, 65, -89, 75, 125, 118, 117, -106, 75, 14, -15, 69, 33, 37, 46, -60}, new byte[]{27, -15, 46, 46, -63, 107, 15, 23}));
        return (short) 0;
    }

    public static String OooOOOO(v81 v81Var) {
        int i;
        int i2;
        int length = v81Var.OooO0o0.length;
        StringBuilder sb = new StringBuilder(30);
        sb.append(u7.OooO00o(new byte[]{49}, new byte[]{74, -65, -52, 43, 4, -52, -95, 13}));
        if (length != 0) {
            if (length != 1) {
                u81 u81VarOooO0Oo = (u81) v81Var.OooO0o0(length - 1);
                if (u81VarOooO0Oo.OooO0OO() == 2 && i != (i2 = (i = u81VarOooO0Oo.OooO0Oo) + 1)) {
                    u81VarOooO0Oo = u81.OooO0Oo(i2, u81VarOooO0Oo.OooO0o0);
                }
                sb.append(((u81) v81Var.OooO0o0(0)).OooO0o());
                sb.append(u7.OooO00o(new byte[]{-112, 67}, new byte[]{-66, 109, 2, 33, 80, 2, -86, 62}));
                sb.append(u81VarOooO0Oo.OooO0o());
            } else {
                sb.append(((u81) v81Var.OooO0o0(0)).OooO0o());
            }
        }
        return rj.OooO0oo(new byte[]{-6}, new byte[]{-121, 110, 115, 5, 101, -84, 71, -37}, sb);
    }

    public static boolean OooOOOo(int i) {
        return i == (i & 255);
    }

    public static boolean OooOOo(int i) {
        return i == (65535 & i);
    }

    public static boolean OooOOo0(int i) {
        return i == (i & 15);
    }

    public abstract boolean OooO(zm zmVar);

    public boolean OooO0O0(ul1 ul1Var) {
        return this instanceof h10;
    }

    public abstract int OooO0Oo();

    public BitSet OooO0o(zm zmVar) {
        return new BitSet();
    }

    public abstract String OooO0oO(g00 g00Var);

    public abstract String OooO0oo(g00 g00Var);

    public abstract void OooOOoo(q9 q9Var, g00 g00Var);
}

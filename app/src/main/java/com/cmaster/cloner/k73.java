package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k73 {
    public static int OooO00o(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iOooO00o = m73.OooO00o(obj);
        int i4 = iOooO00o & i;
        int iOooO0O0 = OooO0O0(obj3, i4);
        if (iOooO0O0 != 0) {
            int i5 = ~i;
            int i6 = iOooO00o & i5;
            int i7 = -1;
            while (true) {
                i2 = iOooO0O0 - 1;
                int i8 = iArr[i2];
                i3 = i8 & i;
                if ((i8 & i5) != i6 || !e73.OooO00o(obj, objArr[i2]) || (objArr2 != null && !e73.OooO00o(obj2, objArr2[i2]))) {
                    if (i3 == 0) {
                        break;
                    }
                    i7 = i2;
                    iOooO0O0 = i3;
                } else {
                    break;
                }
            }
            if (i7 == -1) {
                OooO0Oo(obj3, i4, i3);
                return i2;
            }
            iArr[i7] = (iArr[i7] & i5) | (i3 & i);
            return i2;
        }
        return -1;
    }

    public static int OooO0O0(Object obj, int i) {
        return obj instanceof byte[] ? ((byte[]) obj)[i] & 255 : obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    public static Object OooO0OO(int i) {
        if (i >= 2 && i <= 1073741824 && Integer.highestOneBit(i) == i) {
            return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
        }
        ra.OooOOO(px0.OooOOO(i, "must be power of 2 between 2^1 and 2^30: "));
        return null;
    }

    public static void OooO0Oo(Object obj, int i, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}

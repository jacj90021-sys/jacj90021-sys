package com.cmaster.cloner;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bn {
    public final HashMap OooO00o;

    public bn(int i) {
        switch (i) {
            case 1:
                this.OooO00o = new HashMap();
                break;
            case 2:
                this.OooO00o = new HashMap();
                break;
            default:
                this.OooO00o = new HashMap();
                break;
        }
    }

    public String OooO00o(Class cls) {
        String str = (String) this.OooO00o.get(cls);
        if (str != null) {
            return str;
        }
        return cls.getName().replace(u7.OooO00o(new byte[]{27, -75, 21, 92, -59, -113, 60}, new byte[]{122, -37, 113, 46, -86, -26, 88, -116}), u7.OooO00o(new byte[]{-46, 6, -109, -127}, new byte[]{-105, 84, -61, -61, -95, -93, -48, -46})).replace(u7.OooO00o(new byte[]{-34}, new byte[]{-16, -67, 64, 7, 9, 53, 77, 112}), u7.OooO00o(new byte[]{30}, new byte[]{49, 87, -22, 99, 64, -80, 7, -31})) + y7.OooO0Oo;
    }

    public void OooO0O0(HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            HashMap map2 = this.OooO00o;
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else {
                    int i = 0;
                    if (cls == boolean[].class) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = cn.OooO0O0;
                        Boolean[] boolArr = new Boolean[zArr.length];
                        while (i < zArr.length) {
                            boolArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        map2.put(str, boolArr);
                    } else if (cls == byte[].class) {
                        byte[] bArr = (byte[]) value;
                        String str3 = cn.OooO0O0;
                        Byte[] bArr2 = new Byte[bArr.length];
                        while (i < bArr.length) {
                            bArr2[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                        map2.put(str, bArr2);
                    } else if (cls == int[].class) {
                        int[] iArr = (int[]) value;
                        String str4 = cn.OooO0O0;
                        Integer[] numArr = new Integer[iArr.length];
                        while (i < iArr.length) {
                            numArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        map2.put(str, numArr);
                    } else if (cls == long[].class) {
                        long[] jArr = (long[]) value;
                        String str5 = cn.OooO0O0;
                        Long[] lArr = new Long[jArr.length];
                        while (i < jArr.length) {
                            lArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        map2.put(str, lArr);
                    } else if (cls == float[].class) {
                        float[] fArr = (float[]) value;
                        String str6 = cn.OooO0O0;
                        Float[] fArr2 = new Float[fArr.length];
                        while (i < fArr.length) {
                            fArr2[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                        map2.put(str, fArr2);
                    } else {
                        if (cls != double[].class) {
                            ra.OooO0oo("Key ", str, " has invalid type ", cls);
                            return;
                        }
                        double[] dArr = (double[]) value;
                        String str7 = cn.OooO0O0;
                        Double[] dArr2 = new Double[dArr.length];
                        while (i < dArr.length) {
                            dArr2[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                        map2.put(str, dArr2);
                    }
                }
            }
        }
    }
}

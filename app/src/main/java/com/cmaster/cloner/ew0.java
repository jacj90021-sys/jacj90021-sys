package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ew0 {
    public static final /* synthetic */ int OooO00o = 0;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(u7.OooO00o(new byte[]{12, 109, 64, 17, 60, 37, 105, 118, 12, 72, 79, 1, 47}, new byte[]{35, 44, 46, 117, 78, 74, 0, 18}));
        hashSet.add(u7.OooO00o(new byte[]{124, -67, -96, 57, 14, 81, 12, 23, 124, -111, -85, 57, 21, 95}, new byte[]{83, -4, -50, 93, 124, 62, 101, 115}));
        hashSet.add(u7.OooO00o(new byte[]{6, -56, -3, 80, 63, 111, 98, 55, 6, -26, -15, 86}, new byte[]{41, -119, -109, 52, 77, 0, 11, 83}));
    }

    public static void OooO00o(String str, String str2) {
        String strOooO0OO = OooO0OO(str);
        String strOooO0OO2 = OooO0OO(str2);
        int i = d02.OooO00o;
        PAM.CAXY(strOooO0OO, strOooO0OO2, 8);
    }

    public static void OooO0O0(ApplicationInfo applicationInfo, String str, String str2) {
        p2 p2Var = qx1.OooO0Oo;
        if (i21.OooO0o0(p2Var != null ? p2Var.OooOOOO : 0, applicationInfo) || i21.OooO.contains(str)) {
            String strOooO0OO = OooO0OO(str2);
            int i = d02.OooO00o;
            PAM.CAXY(strOooO0OO, null, 16);
        }
    }

    public static String OooO0OO(String str) {
        return !str.endsWith(u7.OooO00o(new byte[]{85}, new byte[]{122, 10, -26, 83, 115, -13, -26, -25})) ? str.concat(u7.OooO00o(new byte[]{-20}, new byte[]{-61, -78, 38, 110, 69, -45, -87, 96})) : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0Oo(int i, ApplicationInfo applicationInfo) {
        String strReplace;
        int i2;
        byte b;
        int i3;
        String str;
        i01 i01VarO000Oo;
        ir1 ir1VarOooo0oO;
        String str2 = applicationInfo.packageName;
        ir1 ir1VarOooO0o = qx1.OooO0o();
        int i4 = 4;
        if (!qx1.OooOO0.OooO0Oo) {
            String absolutePath = ir1VarOooO0o.OooO().getAbsolutePath();
            String strOooO0OO = OooO0OO(absolutePath);
            int i5 = d02.OooO00o;
            PAM.CAXY(strOooO0OO, null, 1);
            String str3 = ir1.OooOOO;
            if (absolutePath.startsWith(str3)) {
                strReplace = absolutePath.replace(str3, ir1.OooOOOO);
            } else {
                String str4 = ir1.OooOOOO;
                strReplace = absolutePath.startsWith(str4) ? absolutePath.replace(str4, str3) : null;
            }
            if (strReplace != null) {
                PAM.CAXY(OooO0OO(strReplace), null, 1);
            }
            i2 = 0;
        } else {
            if (!m63.OooO00o()) {
                ra.OooOOO0(u7.OooO00o(new byte[]{-115, -67, 126, 7, 34, -51, -10, -84, -105, -70, 99, 84, 99, -44, -11, -84, -119, -89, 120, 23, 103, -41, -10}, new byte[]{-7, -43, 23, 116, 2, -92, -123, -116}));
                return;
            }
            ir1 ir1VarOooO0o2 = qx1.OooO0o();
            ir1VarOooO0o2.getClass();
            StringBuilder sb = new StringBuilder();
            String str5 = File.separator;
            sb.append(str5);
            rj.OooOOo0(new byte[]{-18, -41, 70, -65}, new byte[]{-118, -74, 50, -34, 14, 102, 55, 11}, sb, str5);
            sb.append(u7.OooO00o(new byte[]{85, 22, -13}, new byte[]{52, 102, -125, -58, -71, -63, -125, 68}));
            sb.append(str5);
            OooO00o(new File(sb.toString(), ir1.OooO0oo(ir1VarOooO0o2.OooO0o0)).getAbsolutePath(), ir1VarOooO0o.OooO0Oo().getAbsolutePath());
            i2 = 1;
        }
        File fileOooO0o = ir1VarOooO0o.OooO0o();
        int i6 = ir1VarOooO0o.OooO0o;
        String path = fileOooO0o.getPath();
        String path2 = ir1VarOooO0o.OooO0o0().getPath();
        OooO00o(ir1.OooOOOO + str2, path);
        OooO00o(ir1.OooOOO + str2, path);
        HashSet hashSet = x01.OooO00o;
        if (hashSet.contains(str2)) {
            File file = new File(ir1VarOooO0o.OooOO0o(), String.valueOf(i6));
            zz.OooOO0(file, false);
            File file2 = new File(file, u7.OooO00o(new byte[]{63, 99, -69, 76, 43, 21, 10}, new byte[]{82, 10, -56, 47, 116, 118, 111, -95}));
            zz.OooOO0(file2, false);
            zz.OooOO0(new File(file2, u7.OooO00o(new byte[]{-48, -16, 40, 101, 23, 52, 78}, new byte[]{-77, -104, 77, 6, 124, 93, 32, 93})), false);
            OooO00o(ir1.OooOOOo, file2.getPath());
        }
        OooO00o(ir1.OooOOo0 + str2, path2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str6 = (String) it.next();
            if (!TextUtils.equals(str6, qx1.OooO00o()) && mx1.OooO0oO().OooOO0O(i, str6)) {
                mx1 mx1VarOooO0oO = mx1.OooO0oO();
                mx1VarOooO0oO.getClass();
                try {
                    ir1VarOooo0oO = mx1VarOooO0oO.OooO00o.Oooo0oO(i, str6);
                } catch (Exception e) {
                    mx1.OooO00o(e);
                    ir1VarOooo0oO = null;
                }
                if (ir1VarOooo0oO != null) {
                    OooO00o(rj.OooO0oO(new StringBuilder(), ir1.OooOOo0, str6), ir1VarOooo0oO.OooO0o0().getPath());
                }
            }
        }
        HashSet hashSet2 = ir1VarOooO0o.OooOO0;
        String str7 = ir1VarOooO0o.OooO0o0;
        if (fn2.OooO0Oo(ir1VarOooO0o.OooO)) {
            b = 55;
            str = null;
            i3 = 11;
        } else {
            HashSet hashSet3 = new HashSet();
            b = 55;
            HashMap map = new HashMap();
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String str8 = (String) it2.next();
                String absolutePath2 = new File(str8, u7.OooO00o(new byte[]{61, -20, -80, -110, -21, 23, 116, 100, 61, -55, -65, -126, -8}, new byte[]{18, -83, -34, -10, -103, 120, 29, 0})).getAbsolutePath();
                String absolutePath3 = new File(absolutePath2, str2).getAbsolutePath();
                byte[] bArr = new byte[i4];
                // fill-array-data instruction
                bArr[0] = 11;
                bArr[1] = -63;
                bArr[2] = -58;
                bArr[3] = 52;
                File file3 = new File(new File(new File(new File(new File(hashSet2.contains(str8) ? ir1VarOooO0o.OooOO0O : new File(absolutePath2, ir1VarOooO0o.OooO0Oo), u7.OooO00o(bArr, new byte[]{78, -109, -106, 118, 33, 6, 107, -74})), u7.OooO00o(new byte[]{98, -24, -53, -117, -50, 21, 106, 121, 98, -2, -46, -111, -48, 21, 121, 121, 41}, new byte[]{77, -101, -65, -28, -68, 116, 13, 28})), String.valueOf(i6)), u7.OooO00o(new byte[]{-8, -7, 60, 69, 121, -37, 45, 32, -8, -36, 51, 85, 106}, new byte[]{-41, -72, 82, 33, 11, -76, 68, 68})), str7);
                zz.OooOO0(file3, false);
                map.put(absolutePath3, file3.getAbsolutePath());
                String absolutePath4 = new File(str8, u7.OooO00o(new byte[]{123, -10, -13, -17, 117, 53, -26, 108, 123, -38, -8, -17, 110, 59}, new byte[]{84, -73, -99, -117, 7, 90, -113, 8})).getAbsolutePath();
                String absolutePath5 = new File(absolutePath4, str2).getAbsolutePath();
                File file4 = new File(new File(new File(new File(new File(hashSet2.contains(str8) ? ir1VarOooO0o.OooOO0o : new File(absolutePath4, ir1VarOooO0o.OooO0Oo), u7.OooO00o(new byte[]{24, 2, -113, -124}, new byte[]{93, 80, -33, -58, -14, -125, 118, -58})), u7.OooO00o(new byte[]{-122, 127, 60, 100, -102, -81, 125, -26, -122, 105, 37, 126, -124, -81, 110, -26, -51}, new byte[]{-87, 12, 72, 11, -24, -50, 26, -125})), String.valueOf(i6)), u7.OooO00o(new byte[]{-104, 38, -43, 42, -21, -1, -48, 15, -104, 10, -34, 42, -16, -15}, new byte[]{-73, 103, -69, 78, -103, -112, -71, 107})), str7);
                zz.OooOO0(file4, false);
                map.put(absolutePath5, file4.getAbsolutePath());
                String absolutePath6 = new File(str8, u7.OooO00o(new byte[]{108, -90, -108, 99, 114, -96, -128, 75, 108, -120, -104, 101}, new byte[]{67, -25, -6, 7, 0, -49, -23, 47})).getAbsolutePath();
                String absolutePath7 = new File(absolutePath6, str2).getAbsolutePath();
                if (yn2.OooO0o0()) {
                    File file5 = new File(new File(new File(new File(hashSet2.contains(str8) ? ir1VarOooO0o.OooOOO0 : new File(absolutePath6, ir1VarOooO0o.OooO0Oo), u7.OooO00o(new byte[]{-40, 127, 96, -54}, new byte[]{-99, 45, 48, -120, -119, -52, 96, -40})), u7.OooO00o(new byte[]{-16, 33, 18, -29, -50, 85, -52, 101, -16, 55, 11, -7, -48, 85, -33, 101, -69}, new byte[]{-33, 82, 102, -116, -68, 52, -85, 0})), u7.OooO00o(new byte[]{-11, -33, 33, 44, 42, -113, 70, -17, -11, -15, 45, 42}, new byte[]{-38, -98, 79, 72, 88, -32, 47, -117})), str7);
                    zz.OooOO0(file5, false);
                    map.put(absolutePath7, file5.getAbsolutePath());
                } else {
                    hashSet3.add(absolutePath7);
                }
                i4 = 4;
            }
            i3 = 11;
            OooO0O0(applicationInfo, str2, ir1VarOooO0o.OooO0Oo + u7.OooO00o(new byte[]{55}, new byte[]{24, -119, -82, -38, -52, -80, -54, -45}) + u7.OooO00o(new byte[]{-71, -84, -82, 3}, new byte[]{-4, -2, -2, 65, -87, -27, -32, -54}) + u7.OooO00o(new byte[]{6, -50, -42, -49, 8, -1, -104, 102, 6, -40, -49, -43, 22, -1, -117, 102, 77, -110, -29, -50, 30, -20, -112, 106, 77, -110, -51, -62, 24, -79}, new byte[]{41, -67, -94, -96, 122, -98, -1, 3}));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(ir1VarOooO0o.OooO0Oo);
            sb2.append(u7.OooO00o(new byte[]{-77}, new byte[]{-100, 100, 93, 71, 105, 120, -1, 21}));
            sb2.append(u7.OooO00o(new byte[]{40, 57, -60, 20}, new byte[]{109, 107, -108, 86, -14, 116, -87, -38}));
            rj.OooOOOo(new byte[]{107, -43, -127, 70, -116, 38, 3, -60, 107, -61, -104, 92, -110, 38, 16, -60, 32, -119}, new byte[]{68, -90, -11, 41, -2, 71, 100, -95}, sb2, i6);
            sb2.append(u7.OooO00o(new byte[]{-24, 13, -108, -22, -61, -78, -21, -55, -24, 40, -101, -6, -48, -14}, new byte[]{-57, 76, -6, -114, -79, -35, -126, -83}));
            OooO0O0(applicationInfo, str2, sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ir1VarOooO0o.OooO0Oo);
            sb3.append(u7.OooO00o(new byte[]{11}, new byte[]{36, 89, -29, 113, 11, 24, 119, -68}));
            sb3.append(u7.OooO00o(new byte[]{-40, -45, 95, -102}, new byte[]{-99, -127, 15, -40, -111, 24, 118, -25}));
            rj.OooOOOo(new byte[]{-25, 81, -81, 125, 23, 86, 0, 12, -25, 71, -74, 103, 9, 86, 19, 12, -84, 13}, new byte[]{-56, 34, -37, 18, 101, 55, 103, 105}, sb3, i6);
            sb3.append(u7.OooO00o(new byte[]{-58, 24, 10, -64, 17, 68, 116, 126, -58, 52, 1, -64, 10, 74, 50}, new byte[]{-23, 89, 100, -92, 99, 43, 29, 26}));
            OooO0O0(applicationInfo, str2, sb3.toString());
            Iterator it3 = hashSet3.iterator();
            while (it3.hasNext()) {
                String strOooO0OO2 = OooO0OO((String) it3.next());
                int i7 = d02.OooO00o;
                PAM.CAXY(strOooO0OO2, null, 1);
            }
            str = null;
            for (Map.Entry entry : map.entrySet()) {
                OooO00o((String) entry.getKey(), (String) entry.getValue());
            }
        }
        ApplicationInfo applicationInfo2 = qx1.OooO0oO;
        String absolutePath8 = new File(applicationInfo2 != null ? applicationInfo2.nativeLibraryDir : str, u7.OooO00o(new byte[]{13, 95, 113, -121, -22, 90, -109, 119, 48, 24, 96, -72}, new byte[]{97, 54, 19, -41, -70, 20, -41, 45})).getAbsolutePath();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(ir1VarOooO0o.OooO0Oo);
        sb4.append(u7.OooO00o(new byte[]{-41}, new byte[]{-8, 67, -77, -52, -70, 25, -50, -106}));
        sb4.append(u7.OooO00o(new byte[]{17, 81, 91, 65}, new byte[]{84, 3, 11, 3, -36, -83, 6, 118}));
        byte[] bArr2 = new byte[i3];
        // fill-array-data instruction
        bArr2[0] = 18;
        bArr2[1] = -43;
        bArr2[2] = 55;
        bArr2[3] = 34;
        bArr2[4] = 127;
        bArr2[5] = 97;
        bArr2[6] = -26;
        bArr2[7] = -91;
        bArr2[8] = 88;
        bArr2[9] = -61;
        bArr2[10] = 121;
        rj.OooOOOo(bArr2, new byte[]{61, -79, 86, 86, 30, 78, -109, -42}, sb4, i6);
        sb4.append(u7.OooO00o(new byte[]{-29}, new byte[]{-52, -117, 56, -36, -71, 35, -68, 86}));
        OooO0O0(applicationInfo, str2, sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(ir1VarOooO0o.OooO0Oo);
        sb5.append(u7.OooO00o(new byte[]{b}, new byte[]{24, -60, 113, 38, 30, 100, 57, 24}));
        sb5.append(u7.OooO00o(new byte[]{119, -53, 9, 86}, new byte[]{50, -103, 89, 20, -35, 86, -48, -39}));
        rj.OooOOOo(new byte[]{-98, -124, -23, 112, 92, 25, -29, -77, -44, -110, -41, 96, 88, 25}, new byte[]{-79, -32, -120, 4, 61, 54, -106, -64}, sb5, i6);
        sb5.append(u7.OooO00o(new byte[]{-10}, new byte[]{-39, -14, 42, 78, -2, 48, -79, 96}));
        OooO0O0(applicationInfo, str2, sb5.toString());
        mx1 mx1VarOooO0oO2 = mx1.OooO0oO();
        mx1VarOooO0oO2.getClass();
        try {
            i01VarO000Oo = mx1VarOooO0oO2.OooO00o.o000Oo(qx1.OooO0oO(), str2);
        } catch (Exception e2) {
            mx1.OooO00o(e2);
            i01VarO000Oo = str;
        }
        long j = i01VarO000Oo.OooO0Oo;
        if ((2 & j) != 0) {
            i2 |= 2;
        }
        if ((64 & j) != 0) {
            i2 |= 64;
        }
        if ((j & 4) != 0 || i21.OooOO0o.contains(str2)) {
            i2 |= 4;
        }
        if ((i01VarO000Oo.OooO0Oo & 16) != 0 || i21.OooOOO.contains(str2)) {
            i2 |= 16;
        }
        p2 p2Var = qx1.OooO0Oo;
        if (i21.OooO0o(p2Var != null ? p2Var.OooOOOO : 0, str2)) {
            i2 |= 32;
        }
        int i8 = d02.OooO00o;
        PAM.YYHK(qx1.OooO0Oo(), qx1.OooO00o(), absolutePath8, i2);
    }
}

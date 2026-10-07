package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.VersionedPackage;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class nc0 implements jo1 {
    public final /* synthetic */ int OooO00o;

    private final void OooO0O0(yq yqVar) throws IllegalAccessException, IllegalArgumentException {
        Object objOooO0oO;
        o00OO000 o00oo000;
        o00OO000 o00oo0002;
        String str = (String) yqVar.OooO0o[yqVar.OooO0Oo(String.class)];
        try {
            objOooO0oO = yqVar.OooO0oO();
        } catch (Exception unused) {
            objOooO0oO = null;
        }
        if (objOooO0oO == null) {
            IBinder iBinderOooo00O = rx1.OooO00o().Oooo00O(str);
            if (iBinderOooo00O != null) {
                yqVar.OooO0oo(iBinderOooo00O);
                return;
            }
            return;
        }
        Class cls = lf1.OooO00o;
        Class<?> cls2 = objOooO0oO.getClass();
        Class<?> cls3 = lf1.OooO00o;
        if (cls2 == cls3 && (o00oo0002 = lf1.OooO0O0) != null && ((IBinder) o00oo0002.OooOooo(objOooO0oO, new Object[0])) == null) {
            IBinder iBinderOooo00O2 = rx1.OooO00o().Oooo00O(str);
            if (iBinderOooo00O2 != null) {
                o00OO000 o00oo0003 = lf1.OooO0OO;
                if (o00oo0003 != null) {
                }
                yqVar.OooO0oo(objOooO0oO);
                return;
            }
            if (jd0.OooOO0(str)) {
                o00OO000 o00oo0004 = lf1.OooO0OO;
                if (o00oo0004 != null) {
                }
                yqVar.OooO0oo(objOooO0oO);
                return;
            }
            return;
        }
        if (objOooO0oO.getClass() != cls3 || (o00oo000 = lf1.OooO0Oo) == null) {
            if ((objOooO0oO instanceof IBinder) && jd0.OooOO0(str)) {
                yqVar.OooO0oo(null);
                return;
            }
            return;
        }
        IBinder iBinderOooo00O3 = rx1.OooO00o().Oooo00O(str);
        if (iBinderOooo00O3 != null) {
            Object objOooOooo = o00oo000 != null ? o00oo000.OooOooo(objOooO0oO, new Object[0]) : null;
            if (objOooOooo != null) {
                l81 l81Var = pf1.OooO00o;
                if ((l81Var != null ? (IBinder) l81Var.OooO0O0(objOooOooo) : null) != null || l81Var == null) {
                    return;
                }
                l81Var.OooO0oo(objOooOooo, iBinderOooo00O3);
                return;
            }
            return;
        }
        if (jd0.OooOO0(str)) {
            Object objOooOooo2 = o00oo000 != null ? o00oo000.OooOooo(objOooO0oO, new Object[0]) : null;
            if (objOooOooo2 != null) {
                l81 l81Var2 = pf1.OooO00o;
                if ((l81Var2 != null ? (IBinder) l81Var2.OooO0O0(objOooOooo2) : null) != null) {
                    if (l81Var2 != null) {
                        l81Var2.OooO0oo(objOooOooo2, null);
                    }
                    yqVar.OooO0oo(objOooO0oO);
                }
            }
        }
    }

    @Override // com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) throws Exception {
        ArrayList arrayList;
        Object objOooO0oO;
        int iO0000Oo;
        String[] strArrO000Oo0;
        String[] strArrO000Oo02;
        ArrayList arrayList2;
        ApplicationInfo applicationInfo;
        ProviderInfo providerInfoO000o0Oo;
        ResolveInfo resolveInfoO000O0;
        int iO0000Oo0 = -1;
        Object objOooO0OO = null;
        Object objO000OO0o = null;
        String strOooO00o = null;
        String strO000OO00 = null;
        Object objOooo00o = null;
        str = null;
        String str = null;
        switch (this.OooO00o) {
            case 0:
                Object[] objArr = yqVar.OooO0o;
                Object obj = objArr[0];
                if (obj instanceof Integer) {
                    objArr[0] = Integer.valueOf(((Integer) obj).intValue() & (-4194305));
                } else if (obj instanceof Long) {
                    objArr[0] = Long.valueOf(((Long) obj).longValue() & (-4194305));
                }
                int iOooO0OO = (int) fn2.OooO0OO(objArr[0]);
                mx1 mx1VarOooO0oO = mx1.OooO0oO();
                int iOooO0oO = qx1.OooO0oO();
                mx1VarOooO0oO.getClass();
                try {
                    arrayList = mx1VarOooO0oO.OooO00o.OooOooo(iOooO0OO, iOooO0oO);
                } catch (Exception e) {
                    mx1.OooO00o(e);
                    arrayList = new ArrayList(0);
                }
                if (!fn2.OooO0Oo(arrayList)) {
                    try {
                        objOooO0oO = yqVar.OooO0oO();
                    } catch (Exception unused) {
                        objOooO0oO = null;
                    }
                    if (yqVar.OooO0O0()) {
                        objOooO0oO = null;
                    }
                    if (objOooO0oO != null) {
                        Class<?> returnType = yqVar.OooO0o0.getReturnType();
                        Class cls = m21.OooO00o;
                        List<PackageInfo> listOooO00o = (cls == null || !cls.isAssignableFrom(returnType)) ? (List) objOooO0oO : m21.OooO00o(objOooO0oO);
                        if (listOooO00o != null) {
                            for (PackageInfo packageInfo : listOooO00o) {
                                if (i21.OooO0oO(packageInfo.applicationInfo)) {
                                    int size = arrayList.size();
                                    int i = 0;
                                    while (true) {
                                        if (i < size) {
                                            Object obj2 = arrayList.get(i);
                                            i++;
                                            if (TextUtils.equals(packageInfo.packageName, ((PackageInfo) obj2).packageName)) {
                                                break;
                                            }
                                        } else {
                                            arrayList.add(packageInfo);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (i21.OooO00o(((PackageInfo) it.next()).packageName)) {
                            it.remove();
                        }
                    }
                    Class<?> returnType2 = yqVar.OooO0o0.getReturnType();
                    Class<?> cls2 = j01.OooO00o;
                    if (cls2 == null || returnType2 == null || cls2 != returnType2) {
                        objOooO0OO = m21.OooO0O0(returnType2) ? m21.OooO0OO(arrayList) : arrayList;
                    } else {
                        xb1 xb1Var = j01.OooO0O0;
                        if (xb1Var != null) {
                            objOooO0OO = xb1Var.Oooo000(arrayList);
                        }
                    }
                    yqVar.OooO0oo(objOooO0OO);
                    break;
                }
                break;
            case 1:
                Object[] objArr2 = yqVar.OooO0o;
                Object obj3 = objArr2[0];
                if (obj3 != null && (obj3 instanceof String) && !i21.OooO0OO((String) obj3)) {
                    mx1 mx1VarOooO0oO2 = mx1.OooO0oO();
                    String str2 = (String) objArr2[0];
                    int iOooO0oO2 = qx1.OooO0oO();
                    mx1VarOooO0oO2.getClass();
                    try {
                        objO000OO0o = mx1VarOooO0oO2.OooO00o.o000OO0o(iOooO0oO2, str2);
                    } catch (Exception e2) {
                        mx1.OooO00o(e2);
                    }
                    yqVar.OooO0oo(objO000OO0o);
                    break;
                } else {
                    yqVar.OooO0oo(u7.OooO00o(new byte[]{-7, -89, -111, 42, 108, -49, 30, -34, -11, -95, -104, 42, 123, -60, 20, -56, -13, -90, -101}, new byte[]{-102, -56, -4, 4, 13, -95, 122, -84}));
                    break;
                }
                break;
            case 2:
                int iIntValue = ((Integer) yqVar.OooO0o[0]).intValue();
                lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                int callingPid = Binder.getCallingPid();
                lw1VarOooO0O0.getClass();
                try {
                    strOooO00o = lw1VarOooO0O0.OooO00o.o000OO00(callingPid);
                } catch (Exception e3) {
                    lw1.OooO00o(e3);
                }
                if (TextUtils.isEmpty(strOooO00o)) {
                    strOooO00o = qx1.OooO00o();
                }
                if (iIntValue == qx1.OooO0o || iIntValue == 99992) {
                    yqVar.OooO0oo(strOooO00o);
                    break;
                }
                break;
            case 3:
                Object[] objArr3 = yqVar.OooO0o;
                t43.OooO0Oo(objArr3, true);
                t43.OooO0o(2, objArr3);
                break;
            case 4:
                Object[] objArr4 = yqVar.OooO0o;
                objArr4[1] = pc0.OooOO0(objArr4[1]);
                PackageInfo packageInfoOooO0oo = mx1.OooO0oO().OooO0oo(qx1.OooO0oO(), (int) fn2.OooO0OO(objArr4[1]), (String) objArr4[0]);
                if (packageInfoOooO0oo != null && !i21.OooO00o(packageInfoOooO0oo.packageName)) {
                    yqVar.OooO0oo(packageInfoOooO0oo);
                    break;
                } else {
                    int iIntValue2 = ((Integer) objArr4[2]).intValue();
                    int iOooO00o = jr1.OooO00o();
                    if (iIntValue2 != iOooO00o) {
                        objArr4[2] = Integer.valueOf(iOooO00o);
                    }
                    Object objOooO0oO2 = yqVar.OooO0oO();
                    if ((objOooO0oO2 instanceof PackageInfo) && !i21.OooO0oO(((PackageInfo) objOooO0oO2).applicationInfo)) {
                        yqVar.OooO0oo(null);
                        break;
                    }
                }
                break;
            case 5:
                int iOooO0Oo = yqVar.OooO0Oo(c60.OooOO0());
                if (iOooO0Oo >= 0) {
                    Object[] objArr5 = yqVar.OooO0o;
                    VersionedPackage versionedPackageOooO0o = c60.OooO0o(objArr5[iOooO0Oo]);
                    if (versionedPackageOooO0o != null) {
                        objArr5[1] = pc0.OooOO0(objArr5[1]);
                        PackageInfo packageInfoOooO0oo2 = mx1.OooO0oO().OooO0oo(qx1.OooO0oO(), (int) fn2.OooO0OO(objArr5[1]), versionedPackageOooO0o.getPackageName());
                        if (packageInfoOooO0oo2 != null && !i21.OooO00o(packageInfoOooO0oo2.packageName)) {
                            int i2 = Build.VERSION.SDK_INT;
                            long longVersionCode = i2 >= 28 ? versionedPackageOooO0o.getLongVersionCode() : versionedPackageOooO0o.getVersionCode();
                            if (longVersionCode != -1) {
                                if ((i2 >= 28 ? packageInfoOooO0oo2.getLongVersionCode() : packageInfoOooO0oo2.versionCode) != longVersionCode) {
                                    yqVar.OooO0oo(null);
                                    break;
                                }
                            }
                            yqVar.OooO0oo(packageInfoOooO0oo2);
                            break;
                        } else {
                            int iIntValue3 = ((Integer) objArr5[2]).intValue();
                            int iOooO00o2 = jr1.OooO00o();
                            if (iIntValue3 != iOooO00o2) {
                                objArr5[2] = Integer.valueOf(iOooO00o2);
                            }
                            Object objOooO0oO3 = yqVar.OooO0oO();
                            if ((objOooO0oO3 instanceof PackageInfo) && !i21.OooO0oO(((PackageInfo) objOooO0oO3).applicationInfo)) {
                                yqVar.OooO0oo(null);
                                break;
                            }
                        }
                    }
                }
                break;
            case 6:
                Object[] objArr6 = yqVar.OooO0o;
                String str3 = (String) objArr6[0];
                if (!TextUtils.equals(str3, qx1.OooO00o()) && !TextUtils.equals(str3, qx1.OooO0Oo())) {
                    HashSet hashSet = i21.OooO00o;
                    if (i21.OooO0Oo(qx1.OooO00o(), str3)) {
                        iO0000Oo = 99992;
                    } else {
                        mx1 mx1VarOooO0oO3 = mx1.OooO0oO();
                        mx1VarOooO0oO3.getClass();
                        try {
                            iO0000Oo = mx1VarOooO0oO3.OooO00o.o0000Oo(qx1.OooO0oO(), str3);
                        } catch (Exception e4) {
                            mx1.OooO00o(e4);
                            iO0000Oo = -1;
                        }
                    }
                    if (iO0000Oo != -10000) {
                        yqVar.OooO0oo(Integer.valueOf(iO0000Oo));
                        break;
                    } else if (i21.OooO0oo(str3)) {
                        t43.OooO0o(2, objArr6);
                        break;
                    } else {
                        yqVar.OooO0oo(-1);
                        break;
                    }
                } else {
                    yqVar.OooO0oo(Integer.valueOf(Process.myUid()));
                    break;
                }
            case 7:
                int iIntValue4 = ((Integer) yqVar.OooO0o[0]).intValue();
                int i3 = qx1.OooO0o;
                String[] strArr = dx1.OooO0o0;
                if (iIntValue4 == i3) {
                    mx1 mx1VarOooO0oO4 = mx1.OooO0oO();
                    int iOooO0oO3 = qx1.OooO0oO();
                    int callingPid2 = Binder.getCallingPid();
                    mx1VarOooO0oO4.getClass();
                    try {
                        strArrO000Oo02 = mx1VarOooO0oO4.OooO00o.o000Oo0(iIntValue4, iOooO0oO3, callingPid2);
                    } catch (Exception e5) {
                        mx1.OooO00o(e5);
                        strArrO000Oo02 = strArr;
                    }
                    if (i21.OooO0OO(qx1.OooO00o())) {
                        ArrayList arrayList3 = new ArrayList(Arrays.asList(strArrO000Oo02));
                        String strOooO00o2 = qx1.OooO00o();
                        if (!fn2.OooO0Oo(arrayList3)) {
                            if (!TextUtils.isEmpty(strOooO00o2) && arrayList3.remove(strOooO00o2)) {
                                arrayList3.add(0, strOooO00o2);
                            }
                            strArrO000Oo02 = (String[]) arrayList3.toArray(new String[0]);
                        }
                    } else {
                        int callingPid3 = Binder.getCallingPid();
                        if (callingPid3 != 0 && callingPid3 != Process.myPid()) {
                            lw1 lw1VarOooO0O02 = lw1.OooO0O0();
                            lw1VarOooO0O02.getClass();
                            try {
                                strO000OO00 = lw1VarOooO0O02.OooO00o.o000OO00(callingPid3);
                            } catch (Exception e6) {
                                lw1.OooO00o(e6);
                            }
                            if (!TextUtils.isEmpty(strO000OO00)) {
                                ArrayList arrayList4 = new ArrayList(Arrays.asList(strArrO000Oo02));
                                arrayList4.removeAll(Arrays.asList(u7.OooO00o(new byte[]{73, 18, 62, 32, -25, 72, -66, -26, 70, 24, 125, 111, -18, 67, -93, -18, 67, 25, 125, 105, -19, 84}, new byte[]{42, 125, 83, 14, -128, 39, -47, -127}), u7.OooO00o(new byte[]{-85, 123, -16, -68, 20, 12, -71, 41, -92, 113, -77, -13, 29, 7, -92, 33, -95, 112, -77, -11, 0, 5}, new byte[]{-56, 20, -99, -110, 115, 99, -42, 78}), u7.OooO00o(new byte[]{-64, -58, 10, -128, 82, 112, -41, -87, -52, -64, 3, -128, 69, 123, -35, -65, -54, -57, 0}, new byte[]{-93, -87, 103, -82, 51, 30, -77, -37})));
                                if (!arrayList4.contains(strO000OO00)) {
                                    arrayList4.add(0, strO000OO00);
                                }
                                strArrO000Oo02 = (String[]) arrayList4.toArray(strArr);
                            }
                        }
                    }
                    yqVar.OooO0oo(strArrO000Oo02);
                    break;
                } else if (iIntValue4 == 99991) {
                    yqVar.OooO0oo(new String[]{u7.OooO00o(new byte[]{106, -76, -125, 71, 50, -82, 65, 79, 101, -66, -64, 8, 59, -91, 92, 71, 96, -65, -64, 14, 56, -78}, new byte[]{9, -37, -18, 105, 85, -63, 46, 40})});
                    break;
                } else if (iIntValue4 == 99992) {
                    mx1 mx1VarOooO0oO5 = mx1.OooO0oO();
                    int iOooO0oO4 = qx1.OooO0oO();
                    int callingPid4 = Binder.getCallingPid();
                    mx1VarOooO0oO5.getClass();
                    try {
                        strArrO000Oo0 = mx1VarOooO0oO5.OooO00o.o000Oo0(iIntValue4, iOooO0oO4, callingPid4);
                    } catch (Exception e7) {
                        mx1.OooO00o(e7);
                        strArrO000Oo0 = strArr;
                    }
                    ArrayList arrayList5 = new ArrayList(Arrays.asList(strArrO000Oo0));
                    Iterator it2 = arrayList5.iterator();
                    while (it2.hasNext()) {
                        String str4 = (String) it2.next();
                        HashSet hashSet2 = i21.OooO00o;
                        if (!i21.OooO0Oo(qx1.OooO00o(), str4)) {
                            it2.remove();
                        }
                    }
                    String strOooO00o3 = qx1.OooO00o();
                    arrayList5.remove(strOooO00o3);
                    if (i21.OooO0OO(strOooO00o3)) {
                        arrayList5.add(strOooO00o3);
                    }
                    yqVar.OooO0oo((String[]) arrayList5.toArray(strArr));
                    break;
                }
                break;
            case 8:
                Object[] objArr7 = yqVar.OooO0o;
                mx1 mx1VarOooO0oO6 = mx1.OooO0oO();
                String str5 = (String) objArr7[0];
                int iIntValue5 = ((Integer) objArr7[objArr7.length - 1]).intValue();
                mx1VarOooO0oO6.getClass();
                try {
                    objOooo00o = mx1VarOooO0oO6.OooO00o.oooo00o(iIntValue5, qx1.OooO0oO(), str5);
                } catch (Exception e8) {
                    mx1.OooO00o(e8);
                }
                if (objOooo00o != null) {
                    yqVar.OooO0oo(objOooo00o);
                    break;
                } else if (objArr7[1] instanceof String) {
                    objArr7[1] = qx1.OooO0Oo();
                    break;
                }
                break;
            case 9:
                Object[] objArr8 = yqVar.OooO0o;
                String strOooO0Oo = qx1.OooO0Oo();
                int iOooO00o3 = fn2.OooO00o(objArr8, String.class, 0);
                if (iOooO00o3 >= 0) {
                    objArr8[iOooO00o3] = strOooO0Oo;
                }
                int i4 = iOooO00o3 + 1;
                Object obj4 = objArr8[i4];
                if (obj4 instanceof Integer) {
                    objArr8[i4] = Integer.valueOf(((Integer) obj4).intValue() & (-4194305));
                } else if (obj4 instanceof Long) {
                    objArr8[i4] = Long.valueOf(((Long) obj4).longValue() & (-4194305));
                }
                mx1 mx1VarOooO0oO7 = mx1.OooO0oO();
                String strOooO00o4 = qx1.OooO00o();
                int iOooO0oO5 = qx1.OooO0oO();
                mx1VarOooO0oO7.getClass();
                try {
                    arrayList2 = mx1VarOooO0oO7.OooO00o.o000O00(iOooO0oO5, strOooO00o4);
                } catch (Exception e9) {
                    mx1.OooO00o(e9);
                    arrayList2 = new ArrayList(0);
                }
                if (!fn2.OooO0Oo(arrayList2)) {
                    Object objOooO0oO4 = yqVar.OooO0oO();
                    if (objOooO0oO4 != null) {
                        List listOooO00o2 = m21.OooO00o(objOooO0oO4);
                        if (!fn2.OooO0Oo(listOooO00o2)) {
                            arrayList2.addAll(listOooO00o2);
                        }
                    }
                    yqVar.OooO0oo(m21.OooO0OO(arrayList2));
                    break;
                }
                break;
            case 10:
                Object[] objArr9 = yqVar.OooO0o;
                int iOooO00o4 = fn2.OooO00o(objArr9, String.class, 0);
                if (iOooO00o4 >= 0) {
                    PackageInfo packageInfoOooO0oo3 = mx1.OooO0oO().OooO0oo(qx1.OooO0oO(), 0, (String) objArr9[iOooO00o4]);
                    if (packageInfoOooO0oo3 != null && (applicationInfo = packageInfoOooO0oo3.applicationInfo) != null) {
                        yqVar.OooO0oo(Integer.valueOf(applicationInfo.targetSdkVersion));
                        break;
                    }
                }
                break;
            case 11:
                Object[] objArr10 = yqVar.OooO0o;
                String str6 = (String) objArr10[0];
                if (mx1.OooO0oO().OooOO0(str6)) {
                    yqVar.OooO0oo(Boolean.TRUE);
                    break;
                } else if (i21.OooO0oo(str6)) {
                    t43.OooO0o(1, objArr10);
                    break;
                } else {
                    yqVar.OooO0oo(Boolean.FALSE);
                    break;
                }
            case 12:
                Object[] objArr11 = yqVar.OooO0o;
                String str7 = (String) objArr11[0];
                int iIntValue6 = ((Integer) objArr11[1]).intValue();
                int iOooO0OO2 = (int) fn2.OooO0OO(objArr11[2]);
                if (objArr11.length > 3) {
                    Object obj5 = objArr11[3];
                    if (obj5 instanceof String) {
                        str = (String) obj5;
                    }
                }
                if (str7 == null && str == null && iOooO0OO2 == 0) {
                    if (objArr11[2] instanceof Long) {
                        objArr11[2] = 1048576L;
                    } else {
                        objArr11[2] = 1048576;
                    }
                }
                List listOooOOO0 = mx1.OooO0oO().OooOOO0(iIntValue6, iOooO0OO2, str7, qx1.OooO0oO());
                if (!fn2.OooO0Oo(listOooOOO0)) {
                    Object objOooO0oO5 = yqVar.OooO0oO();
                    if (objOooO0oO5 != null) {
                        List<ProviderInfo> listOooO00o3 = m21.OooO0O0(yqVar.OooO0o0.getReturnType()) ? m21.OooO00o(objOooO0oO5) : (List) objOooO0oO5;
                        if (listOooO00o3 != null) {
                            for (ProviderInfo providerInfo : listOooO00o3) {
                                if (i21.OooO0oO(providerInfo.applicationInfo)) {
                                    Iterator it3 = listOooOOO0.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            ProviderInfo providerInfo2 = (ProviderInfo) it3.next();
                                            if (!TextUtils.equals(providerInfo.packageName, providerInfo2.packageName) || !TextUtils.equals(providerInfo.name, providerInfo2.name)) {
                                            }
                                        } else {
                                            listOooOOO0.add(providerInfo);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    yqVar.OooO0oo(m21.OooO0OO(listOooOOO0));
                    break;
                }
                break;
            case 13:
                Object[] objArr12 = yqVar.OooO0o;
                String str8 = (String) objArr12[0];
                int iOooO0OO3 = (int) fn2.OooO0OO(objArr12[1]);
                mx1 mx1VarOooO0oO8 = mx1.OooO0oO();
                int iOooO0oO6 = qx1.OooO0oO();
                mx1VarOooO0oO8.getClass();
                try {
                    providerInfoO000o0Oo = mx1VarOooO0oO8.OooO00o.o000o0Oo(iOooO0OO3, iOooO0oO6, qx1.OooO00o(), str8);
                    mx1.OooO0OO(providerInfoO000o0Oo, iOooO0oO6);
                } catch (Exception e10) {
                    mx1.OooO00o(e10);
                    providerInfoO000o0Oo = null;
                }
                if (providerInfoO000o0Oo != null && !i21.OooO00o(providerInfoO000o0Oo.packageName)) {
                    yqVar.OooO0oo(providerInfoO000o0Oo);
                    break;
                } else {
                    Object objOooO0oO6 = yqVar.OooO0oO();
                    if ((objOooO0oO6 instanceof ProviderInfo) && !i21.OooO0oO(((ProviderInfo) objOooO0oO6).applicationInfo)) {
                        yqVar.OooO0oo(null);
                        break;
                    }
                }
                break;
            case 14:
                Object[] objArr13 = yqVar.OooO0o;
                int iOooO00o5 = fn2.OooO00o(objArr13, Intent.class, 0);
                if (iOooO00o5 >= 0) {
                    Intent intent = (Intent) objArr13[iOooO00o5];
                    mx1 mx1VarOooO0oO9 = mx1.OooO0oO();
                    String str9 = (String) objArr13[1];
                    int iOooO0OO4 = (int) fn2.OooO0OO(objArr13[2]);
                    int iOooO0oO7 = qx1.OooO0oO();
                    mx1VarOooO0oO9.getClass();
                    try {
                        resolveInfoO000O0 = mx1VarOooO0oO9.OooO00o.o000O0(qx1.OooO00o(), intent, str9, iOooO0OO4, iOooO0oO7);
                        mx1.OooO0o0(iOooO0oO7, resolveInfoO000O0);
                    } catch (Exception e11) {
                        mx1.OooO00o(e11);
                        resolveInfoO000O0 = null;
                    }
                    if (resolveInfoO000O0 != null) {
                        yqVar.OooO0oo(resolveInfoO000O0);
                        break;
                    }
                }
                Object objOooO0oO7 = yqVar.OooO0oO();
                if ((objOooO0oO7 instanceof ResolveInfo) && !i21.OooO0oO(ny2.OooO0O0((ResolveInfo) objOooO0oO7))) {
                    yqVar.OooO0oo(null);
                    break;
                }
                break;
            case 15:
                Object[] objArr14 = yqVar.OooO0o;
                Intent intent2 = (Intent) objArr14[0];
                ResolveInfo resolveInfoOooOOOo = mx1.OooO0oO().OooOOOo(intent2, (String) objArr14[1], (int) fn2.OooO0OO(objArr14[2]), qx1.OooO0oO());
                if (resolveInfoOooOOOo != null) {
                    if (intent2 != null && Binder.getCallingPid() != Process.myPid() && TextUtils.equals(qx1.OooO00o(), u7.OooO00o(new byte[]{119, -20, -27, 66, 110, -62, -57, -110, 120, -26, -90, 13, 103, -55, -38, -102, 125, -25, -90, 11, 100, -34}, new byte[]{20, -125, -120, 108, 9, -83, -88, -11}))) {
                        ComponentName component = intent2.getComponent();
                        ServiceInfo serviceInfo = resolveInfoOooOOOo.serviceInfo;
                        if (serviceInfo != null && component != null && serviceInfo.applicationInfo != null && TextUtils.equals(component.getClassName(), u7.OooO00o(new byte[]{62, -14, -45, -108, 39, 59, -106, -41, 49, -8, -112, -37, 46, 48, -117, -33, 52, -7, -112, -35, 45, 39, -41, -47, 40, -23, -42, -108, 33, 55, -102, -33, 40, -13, -54, -108, 33, 33, -115, -40, 56, -13, -54, -45, 35, 53, -115, -33, 47, -77, -6, -33, 38, 53, -116, -36, 41, -36, -53, -50, 40, 16, -100, -36, 56, -6, -33, -50, 37, 7, -100, -62, 43, -12, -35, -33}, new byte[]{93, -99, -66, -70, 64, 84, -7, -80}))) {
                            resolveInfoOooOOOo.serviceInfo.applicationInfo.uid = 99991;
                        }
                    }
                    yqVar.OooO0oo(resolveInfoOooOOOo);
                    break;
                } else {
                    Object objOooO0oO8 = yqVar.OooO0oO();
                    if ((objOooO0oO8 instanceof ResolveInfo) && !i21.OooO0oO(ny2.OooO0O0((ResolveInfo) objOooO0oO8))) {
                        yqVar.OooO0oo(null);
                        break;
                    }
                }
                break;
            case 16:
                Object[] objArr15 = yqVar.OooO0o;
                String str10 = (String) objArr15[0];
                if (str10 != null) {
                    int iIntValue7 = ((Integer) objArr15[1]).intValue();
                    int iIntValue8 = ((Integer) objArr15[2]).intValue();
                    mx1 mx1VarOooO0oO10 = mx1.OooO0oO();
                    int iOooO0oO8 = qx1.OooO0oO();
                    mx1VarOooO0oO10.getClass();
                    try {
                        mx1VarOooO0oO10.OooO00o.OoooOO0(iOooO0oO8, iIntValue7, str10, iIntValue8);
                    } catch (Exception e12) {
                        mx1.OooO00o(e12);
                    }
                }
                yqVar.OooO0oo(null);
                break;
            case 17:
                Object[] objArr16 = yqVar.OooO0o;
                ComponentName componentName = (ComponentName) objArr16[0];
                int iIntValue9 = ((Integer) objArr16[1]).intValue();
                int iIntValue10 = ((Integer) objArr16[2]).intValue();
                mx1 mx1VarOooO0oO11 = mx1.OooO0oO();
                int iOooO0oO9 = qx1.OooO0oO();
                mx1VarOooO0oO11.getClass();
                try {
                    mx1VarOooO0oO11.OooO00o.oo0o0Oo(componentName, iIntValue9, iIntValue10, iOooO0oO9);
                } catch (Exception e13) {
                    mx1.OooO00o(e13);
                }
                yqVar.OooO0oo(null);
                break;
            case 18:
                Iterator it4 = ((List) yqVar.OooO0o[0]).iterator();
                while (it4.hasNext()) {
                    PackageManager.ComponentEnabledSetting componentEnabledSettingOooO0o0 = o0000OO0.OooO0o0(it4.next());
                    mx1 mx1VarOooO0oO12 = mx1.OooO0oO();
                    ComponentName componentName2 = componentEnabledSettingOooO0o0.getComponentName();
                    int enabledState = componentEnabledSettingOooO0o0.getEnabledState();
                    int enabledFlags = componentEnabledSettingOooO0o0.getEnabledFlags();
                    int iOooO0oO10 = qx1.OooO0oO();
                    mx1VarOooO0oO12.getClass();
                    try {
                        mx1VarOooO0oO12.OooO00o.oo0o0Oo(componentName2, enabledState, enabledFlags, iOooO0oO10);
                    } catch (Exception e14) {
                        mx1.OooO00o(e14);
                    }
                }
                yqVar.OooO0oo(null);
                break;
            case 19:
                Object obj6 = yqVar.OooO0o[0];
                yqVar.OooO0oo(0);
                break;
            case 20:
                yqVar.OooO0oo(null);
                break;
            case zzbcj.zzt.zzm /* 21 */:
                yqVar.OooO0oo(0);
                break;
            case 22:
                Object[] objArr17 = yqVar.OooO0o;
                String str11 = (String) objArr17[0];
                String str12 = (String) objArr17[1];
                int iOooO0oO11 = qx1.OooO0oO();
                if (yn2.OooO0oo() && TextUtils.equals(str11, qx1.OooO00o())) {
                    str11 = (String) objArr17[1];
                    str12 = (String) objArr17[0];
                }
                mx1 mx1VarOooO0oO13 = mx1.OooO0oO();
                mx1VarOooO0oO13.getClass();
                try {
                    iO0000Oo0 = mx1VarOooO0oO13.OooO00o.o0000Oo0(str11, str12, iOooO0oO11, qx1.OooO0Oo());
                } catch (Exception e15) {
                    mx1.OooO00o(e15);
                }
                yqVar.OooO0oo(Integer.valueOf(iO0000Oo0));
                break;
            case 23:
                try {
                    Integer num = qx1.OooO00o;
                    Context context = e92.OooO00o;
                    if (context != null) {
                        int iCheckCallingPermission = context.checkCallingPermission(u7.OooO00o(new byte[]{-66, 2, -108, 35, 53, -17, -45, 103, -81, 9, -126, 60, 51, -11, -60, 32, -80, 2, -34, 3, 31, -57, -13, 22, -113, 36, -65, 31, 31, -39, -7, 28, -110, 46, -75, 3, 9}, new byte[]{-33, 108, -16, 81, 90, -122, -73, 73}));
                        int iCheckCallingPermission2 = context.checkCallingPermission(u7.OooO00o(new byte[]{-88, -78, -117, -112, -8, 38, 93, -96, -71, -71, -99, -113, -2, 60, 74, -25, -90, -78, -63, -80, -46, 14, 125, -47, -102, -111, -68}, new byte[]{-55, -36, -17, -30, -105, 79, 57, -114}));
                        int iCheckCallingPermission3 = context.checkCallingPermission(u7.OooO00o(new byte[]{-15, -25, 120, -68, -28, 37, -103, 82, -32, -20, 110, -93, -30, 63, -114, 21, -1, -25, 50, -100, -50, 13, -71, 35, -64, -63, 83, -128, -50, 19, -82, 40, -47, -35, 89}, new byte[]{-112, -119, 28, -50, -117, 76, -3, 124}));
                        if (iCheckCallingPermission == -1 && iCheckCallingPermission2 == -1 && iCheckCallingPermission3 == -1) {
                            yqVar.OooO0oo(null);
                            break;
                        }
                    }
                } catch (Throwable unused2) {
                    yqVar.OooO0oo(null);
                    return;
                }
                break;
            case 24:
                Object[] objArr18 = yqVar.OooO0o;
                if (((ComponentName) objArr18[0]) != null) {
                    String strOooO0Oo2 = qx1.OooO0Oo();
                    p2 p2Var = qx1.OooO0Oo;
                    objArr18[0] = new ComponentName(strOooO0Oo2, jx1.OooO00o(p2Var != null ? p2Var.OooO : 0));
                    break;
                }
                break;
            case 25:
                OooO0O0(yqVar);
                break;
            case 26:
                fn2.OooO00o(yqVar.OooO0o, ComponentName.class, 0);
                yqVar.OooO0oo(null);
                break;
            case 27:
                fn2.OooO00o(yqVar.OooO0o, ComponentName.class, 0);
                yqVar.OooO0oo(new ArrayList());
                break;
            case 28:
                yqVar.OooO00o();
                if (yqVar.OooO != null) {
                    t43.OooO0OO(yqVar);
                    break;
                }
                break;
            default:
                Object[] objArr19 = yqVar.OooO0o;
                int iOooO0o = fn2.OooO0o(objArr19, String.class);
                if (iOooO0o >= 3) {
                    objArr19[iOooO0o] = qx1.OooO0Oo();
                    int i5 = iOooO0o - 2;
                    if (objArr19[i5] instanceof String) {
                        objArr19[i5] = qx1.OooO0Oo();
                        break;
                    }
                }
                break;
        }
    }
}

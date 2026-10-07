package com.cmaster.cloner;

import android.content.AttributionSource;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Parcel;
import android.os.Process;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class qx1 {
    public static final LinkedHashMap OooO;
    public static final Integer OooO00o;
    public static final Integer OooO0O0;
    public static final Integer OooO0OO;
    public static p2 OooO0Oo;
    public static final int OooO0o;
    public static lq OooO0o0;
    public static ApplicationInfo OooO0oO;
    public static boolean OooO0oo;
    public static w50 OooOO0;
    public static aq OooOO0O;
    public static ir1 OooOO0o;

    static {
        u7.OooO00o(new byte[]{-63, 56, -106, -55, -92, -26, 22, 71, -46, 43, -115, -51, -92, -17, 1, 0, -57, 42}, new byte[]{-94, 89, -28, -69, -51, -125, 100, 103});
        OooO00o = 1;
        OooO0O0 = 2;
        OooO0OO = 0;
        OooO0o = Process.myUid();
        OooO = new LinkedHashMap();
    }

    public static String OooO00o() {
        ApplicationInfo applicationInfo;
        p2 p2Var = OooO0Oo;
        if (p2Var == null || (applicationInfo = p2Var.OooO0o0) == null) {
            return null;
        }
        return applicationInfo.packageName;
    }

    public static int OooO0O0() {
        ApplicationInfo applicationInfo;
        p2 p2Var = OooO0Oo;
        if (p2Var == null || (applicationInfo = p2Var.OooO0o0) == null) {
            return -1;
        }
        return applicationInfo.targetSdkVersion;
    }

    public static int OooO0OO(String str) {
        Integer num = (Integer) OooO.get(str);
        Integer num2 = OooO00o;
        if (num == null && !lo0.OooO00o.contains(str)) {
            return num2.intValue();
        }
        if (i21.OooO0OO(OooO00o())) {
            return num2.intValue();
        }
        if (num == null) {
            num = OooO0OO;
        }
        return num.intValue();
    }

    public static String OooO0Oo() {
        Context context = e92.OooO00o;
        if (context != null) {
            return context.getPackageName();
        }
        return null;
    }

    public static ir1 OooO0o() {
        ir1 ir1VarOooo0oO;
        if (OooOO0o == null) {
            mx1 mx1VarOooO0oO = mx1.OooO0oO();
            String strOooO00o = OooO00o();
            int iOooO0oO = OooO0oO();
            mx1VarOooO0oO.getClass();
            try {
                ir1VarOooo0oO = mx1VarOooO0oO.OooO00o.Oooo0oO(iOooO0oO, strOooO00o);
            } catch (Exception e) {
                mx1.OooO00o(e);
                ir1VarOooo0oO = null;
            }
            OooOO0o = ir1VarOooo0oO;
        }
        return OooOO0o;
    }

    public static int OooO0o0() {
        ApplicationInfo applicationInfo = OooO0oO;
        if (applicationInfo != null) {
            return applicationInfo.targetSdkVersion;
        }
        return -1;
    }

    public static int OooO0oO() {
        p2 p2Var = OooO0Oo;
        if (p2Var != null) {
            return p2Var.OooO0oO;
        }
        return 0;
    }

    public static Parcel OooO0oo() {
        l81 l81Var;
        if (yn2.OooO0o()) {
            AttributionSource attributionSource = e92.OooO00o.getAttributionSource();
            o00OO000 o00oo000 = d4.OooO0OO;
            Object objOooOooo = o00oo000 != null ? o00oo000.OooOooo(attributionSource, new Object[0]) : null;
            if (objOooOooo != null && (l81Var = c4.OooO00o) != null) {
                return (Parcel) l81Var.OooO0O0(objOooOooo);
            }
        }
        return null;
    }
}

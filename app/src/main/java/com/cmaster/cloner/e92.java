package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Build;
import android.os.Bundle;
import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class e92 {
    public static Context OooO00o;
    public static File OooO0O0;
    public static ay1 OooO0OO;
    public static String OooO0Oo;
    public static File OooO0o;
    public static final oO00OOOo OooO0o0 = new oO00OOOo(24);
    public static InvocationHandler OooO0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(Context context, ProviderInfo providerInfo, InvocationHandler invocationHandler) throws IllegalAccessException, PackageManager.NameNotFoundException, IllegalArgumentException {
        OooO00o = context.getApplicationContext();
        OooO0oO = invocationHandler;
        String parent = context.getFilesDir().getParent();
        int i = jx1.OooO00o;
        int i2 = 4;
        OooO0O0 = new File(parent, u7.OooO00o(new byte[]{13, 9, -25, 112}, new byte[]{72, 91, -73, 50, 26, 35, 32, 85}));
        File file = OooO0O0;
        StringBuilder sb = new StringBuilder();
        sb.append(OooO0O0.getName());
        OooO0o = new File(file, rj.OooO0oo(new byte[]{3, -126, 57, -7, 25}, new byte[]{45, -18, 86, -102, 114, -96, 8, 56}, sb));
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 128);
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (applicationInfo.metaData == null) {
            applicationInfo.metaData = Bundle.EMPTY;
        }
        StringBuilder sbOooOO0 = rj.OooOO0(u7.OooO00o(new byte[]{-15, -7, 92, 37, -114, -46, -68, -123, -26, -13, 67, 37, -114, -45, -78, -104, -9, -28}, new byte[]{-110, -106, 49, 11, -19, -65, -35, -10}));
        sbOooOO0.append(u7.OooO00o(new byte[]{15}, new byte[]{33, 91, -64, 114, -19, -121, -91, 78}));
        m63.OooO00o = rj.OooO0oo(new byte[]{-49, -119, -51, 72, -118, -110, -32, 17, -40, -125, -46, 72, -118, -109, -18, 12, -55, -108, -114, 32, -96, -70, -51, 70, -1, -125, -46, 16, -128, -100, -28}, new byte[]{-84, -26, -96, 102, -23, -1, -127, 98}, sbOooOO0);
        StringBuilder sbOooOO02 = rj.OooOO0(packageInfo.applicationInfo.packageName);
        sbOooOO02.append(u7.OooO00o(new byte[]{77}, new byte[]{99, 65, 66, -37, 84, -59, -114, 86}));
        m63.OooO0O0 = rj.OooO0oo(new byte[]{113, -46, 103, 87, -110, 27, -52, -71, 102, -40, 120, 87, -110, 26, -62, -92, 119, -49, 36, 63, -72, 51, -31, -18, 65, -40, 120, 15, -104, 21, -56}, new byte[]{18, -67, 10, 121, -15, 118, -83, -54}, sbOooOO02);
        if (providerInfo.authority.equals(m63.OooO00o)) {
            m63.OooO0OO = 2;
        } else if (providerInfo.authority.equals(m63.OooO0O0)) {
            m63.OooO0OO = 3;
        } else {
            String str = packageInfo.packageName;
            String str2 = providerInfo.authority;
            StringBuilder sbOooOO03 = rj.OooOO0(str);
            sbOooOO03.append(u7.OooO00o(new byte[]{9}, new byte[]{39, -7, -4, 87, 61, -54, 118, -40}));
            sbOooOO03.append(u7.OooO00o(new byte[]{27, 126, 84, -126, 72, -12, -41, -126, 12, 116, 75, -126, 72, -11, -39, -97, 29, 99, 23, -22, 98, -36, -6, -43, 40}, new byte[]{120, 17, 57, -84, 43, -103, -74, -15}));
            if (str2.contains(sbOooOO03.toString())) {
                m63.OooO0OO = 1;
            }
        }
        ay1 ay1Var = new ay1(i2, (boolean) (null == true ? 1 : 0));
        ay1Var.OooO0o0 = providerInfo;
        OooO0OO = ay1Var;
        ((Map) OooO0oO).put(u7.OooO00o(new byte[]{-87, 111, 37, -6, 14, -125, -81, 72, -125, 84, 20, -37, 60, -14, -85, 67, -100, 82}, new byte[]{-52, 23, 81, -120, 111, -83, -1, 26}), Integer.valueOf(m63.OooO0OO));
        Integer num = qx1.OooO00o;
        int i3 = ac1.OooO0o0;
        zb1 zb1Var = new zb1();
        Thread.setDefaultUncaughtExceptionHandler(zb1Var);
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        if (threadGroup != null) {
            while (threadGroup.getParent() != null) {
                threadGroup = threadGroup.getParent();
            }
            Object ac1Var = new ac1(threadGroup, zb1Var);
            l81 l81Var = tm1.OooO0O0;
            ThreadGroup[] threadGroupArr = (ThreadGroup[]) l81Var.OooO0O0(threadGroup);
            synchronized (threadGroupArr) {
                try {
                    Object[] objArr = (ThreadGroup[]) threadGroupArr.clone();
                    l81Var.OooO0oo(ac1Var, objArr);
                    l81Var.OooO0oo(threadGroup, new ThreadGroup[]{ac1Var});
                    for (Object obj : objArr) {
                        if (obj != null && obj != ac1Var) {
                            tm1.OooO0OO.OooO0oo(obj, ac1Var);
                        }
                    }
                    tm1.OooO00o.OooO0oo(threadGroup, 1);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i4 = d02.OooO00o;
        if (m63.OooO00o()) {
            PAM.SW();
        }
        if (m63.OooO00o()) {
            if (Build.VERSION.SDK_INT == 29) {
                n81 n81Var = ur1.OooO00o;
                if ((n81Var != null ? n81Var.OooO00o() : null) != null && n81Var != null) {
                    n81Var.OooO0Oo(null);
                }
                n81 n81Var2 = r21.OooO00o;
                if ((n81Var2 != null ? n81Var2.OooO00o() : null) != null && n81Var2 != null) {
                    n81Var2.OooO0Oo(null);
                }
            }
            o0OO000o o0oo000o = o0OO00o0.OooOOo0.OooO0Oo;
            o0oo000o.sendMessageAtFrontOfQueue(o0oo000o.obtainMessage(109, null));
        } else if (m63.OooO0O0()) {
            String str3 = o0O0o000.OooO0o0;
        }
        if (m63.OooO0OO == 0) {
            rx1.OooO00o();
        }
    }

    public static void OooO0O0(Object... objArr) {
        try {
            OooO0oO.invoke(100, null, objArr);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}

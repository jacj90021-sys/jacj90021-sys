package com.cmaster.cloner;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class z21 {
    public static volatile z21 OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.cmaster.cloner.vh1[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.cmaster.cloner.mi1] */
    static {
        z21 oo0o000;
        int i = 0;
        try {
            for (Map.Entry entry : oO0O00oO.OooO0O0.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Logger logger = Logger.getLogger(str);
                if (oO0O00oO.OooO00o.add(logger)) {
                    logger.setUseParentHandlers(false);
                    logger.setLevel(Log.isLoggable(str2, 3) ? Level.FINE : Log.isLoggable(str2, 4) ? Level.INFO : Level.WARNING);
                    logger.addHandler(oO0O0.OooO00o);
                }
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        int i2 = 2;
        int i3 = 1;
        z21 mi1Var = null;
        if (oO0O000.OooO0O0) {
            oo0o000 = new oO0O000();
            mi1 mi1Var2 = Build.VERSION.SDK_INT >= 29 ? new mi1(i3) : null;
            mi1 mi1Var3 = new mi1(i2);
            int i4 = nh.OooO00o;
            mi1 mi1Var4 = new mi1(i2);
            int i5 = e9.OooO00o;
            ArrayList arrayListOooO0o0 = o3.OooO0o0(new vh1[]{mi1Var2, mi1Var3, mi1Var4, new mi1(i2)});
            ArrayList arrayList = new ArrayList();
            int size = arrayListOooO0o0.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayListOooO0o0.get(i6);
                i6++;
                if (((vh1) obj).OooO00o()) {
                    arrayList.add(obj);
                }
            }
        } else {
            oo0o000 = null;
        }
        if (oo0o000 == null) {
            if (oO0O0O00.OooO0O0) {
                z21 oo0o0o00 = new oO0O0O00();
                try {
                    Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
                    Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
                    Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
                    mi1Var = new mi1(cls);
                } catch (Exception e2) {
                    CopyOnWriteArraySet copyOnWriteArraySet = oO0O00oO.OooO00o;
                    oO0O00oO.OooO00o(ly0.class.getName(), 5, "unable to load android socket classes", e2);
                }
                mi1 mi1Var5 = new mi1(i2);
                int i7 = nh.OooO00o;
                mi1 mi1Var6 = new mi1(i2);
                int i8 = e9.OooO00o;
                ArrayList arrayListOooO0o02 = o3.OooO0o0(new vh1[]{mi1Var, mi1Var5, mi1Var6, new mi1(i2)});
                ArrayList arrayList2 = new ArrayList();
                int size2 = arrayListOooO0o02.size();
                while (i < size2) {
                    Object obj2 = arrayListOooO0o02.get(i);
                    i++;
                    if (((vh1) obj2).OooO00o()) {
                        arrayList2.add(obj2);
                    }
                }
                mi1Var = oo0o0o00;
            }
            oo0o000 = mi1Var;
        }
        if (oo0o000 == null) {
            throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
        }
        OooO00o = oo0o000;
        Logger.getLogger(ly0.class.getName());
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}

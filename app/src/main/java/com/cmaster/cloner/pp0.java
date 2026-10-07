package com.cmaster.cloner;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pp0 {
    public static final f70 OooO00o;

    static {
        String property;
        int i = kl1.OooO00o;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new oO0O00()).iterator();
            it.getClass();
            Iterator it2 = we1.OooO00o(new ph(new xe1(it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((oO0O00) next).getClass();
                    do {
                        ((oO0O00) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((oO0O00) next) == null) {
                qa.OooO0o("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                OooO00o = new f70(g70.OooO00o(mainLooper), false);
            } else {
                qa.OooO0o("The main looper is not available");
            }
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

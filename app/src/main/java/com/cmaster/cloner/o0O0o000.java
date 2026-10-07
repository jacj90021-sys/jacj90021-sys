package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0o000 extends m30 {
    public static final String OooO0o;
    public static final String OooO0o0;
    public static final o0O0o000 OooO0oO;
    public final CopyOnWriteArrayList OooO0Oo;

    static {
        u7.OooO00o(new byte[]{-29, 54, 26, 97, 110, 47, 52, -71, -82, 43, 24, 58, 109, 35, 53, -1, -31, 58, 3, 38, 118, 40, 105, -104, -50, 13, 50, 1, 77, 25, 2, -125, -46, 22, 37}, new byte[]{-128, 89, 119, 79, 25, 70, 71, -47});
        u7.OooO00o(new byte[]{42, 32, -65, -92, 100, -89, 70, -7, 103, 61, -67, -1, 103, -85, 71, -65, 40, 44, -90, -29, 124, -96, 27, -46, 5, 10, -109, -40, 76, -102, 122, -63}, new byte[]{73, 79, -46, -118, 19, -50, 53, -111});
        u7.OooO00o(new byte[]{49, 51, -6, 79, 45, 37, 19, -8, 124, 53, -7, 21, 63, 62, 14, -15, 62, 114, -27, 14, 47, 56, 5, -30, 124, 61, -12, 21, 51, 35, 14}, new byte[]{82, 92, -105, 97, 90, 76, 96, -112});
        u7.OooO00o(new byte[]{113, 64, 42, 22, 6, 34, 20, -80, 60, 70, 41, 76, 20, 37, 19, -10, 119, 87, 51, 74, 16, 101, 55, -103, 64, 110, 10}, new byte[]{18, 47, 71, 56, 113, 75, 103, -40});
        u7.OooO00o(new byte[]{-88, 4, 8, 58, 15, 121, -114, 58, -27, 2, 11, 96, 29, 126, -119, 124, -82, 19, 17, 102, 25, 62, -81, 23, -104, 62, 41, 64, 39, 68, -78}, new byte[]{-53, 107, 101, 20, 120, 16, -3, 82});
        u7.OooO00o(new byte[]{-115, 91, -78, -37, -102, -40, -125, -53, -64, 93, -79, -127, -120, -33, -124, -115, -117, 76, -85, -121, -116, -97, -94, -26, -67, 97, -109, -95, -78, -26, -72, -20}, new byte[]{-18, 52, -33, -11, -19, -79, -16, -93});
        u7.OooO00o(new byte[]{0, -26, -33, -95, -31, -115, 38, 8, 77, -32, -36, -5, -13, -118, 33, 78, 6, -15, -58, -3, -9, -54, 1, 47, 40, -52, -4}, new byte[]{99, -119, -78, -113, -106, -28, 85, 96});
        u7.OooO00o(new byte[]{-40, -41, 86, -115, -23, 41, -14, 83, -107, -47, 85, -41, -5, 46, -11, 21, -34, -64, 79, -47, -1, 110, -50, 107, -17, -15, 116, -19, -51}, new byte[]{-69, -72, 59, -93, -98, 64, -127, 59});
        u7.OooO00o(new byte[]{-5, -42, -85, -25, 73, 51, 71, 118, -74, -48, -88, -67, 91, 52, 64, 48, -3, -63, -78, -69, 95, 116, 96, 95, -53, -14}, new byte[]{-104, -71, -58, -55, 62, 90, 52, 30});
        u7.OooO00o(new byte[]{22, -34, -37, -50, -119, -10, -18, 112, 91, -40, -40, -108, -101, -15, -23, 54, 16, -55, -62, -110, -97, -79, -49, 93, 36, -28, -13, -77, -86, -64, -34, 87, 49, -12}, new byte[]{117, -79, -74, -32, -2, -97, -99, 24});
        u7.OooO00o(new byte[]{40, -42, -54, -114, -62, 65, 65, -89, 101, -48, -55, -44, -48, 70, 70, -31, 46, -63, -45, -46, -44, 6, 123, -127, 31, -4, -23, -12}, new byte[]{75, -71, -89, -96, -75, 40, 50, -49});
        u7.OooO00o(new byte[]{26, 76, -76, 26, -37, -41, -96, -64, 87, 74, -73, 64, -55, -48, -89, -122, 28, 91, -83, 70, -51, -112, -97, -23, 44, 109, -102, 124, -13, -22, -118, -8, 60}, new byte[]{121, 35, -39, 52, -84, -66, -45, -88});
        u7.OooO00o(new byte[]{26, -2, 70, 82, -74, 52, 103, 86, 87, -8, 69, 8, -92, 51, 96, 16, 28, -23, 95, 14, -96, 115, 70, 123, 42, -60, 103, 40, -98, 15, 81, 125, 60, -40, 125, 57, -109}, new byte[]{121, -111, 43, 124, -63, 93, 20, 62});
        OooO0o0 = jx1.OooO0oO();
        jx1.OooO0o0();
        OooO0o = u7.OooO00o(new byte[]{127, -35, 45, -45, -14, 125, 86, -78, 104, -41, 50, -45, -14, 124, 88, -81, 121, -64, 110, -69, -40, 85, 123, -27, 72, -64, 53, -112, -31}, new byte[]{28, -78, 64, -3, -111, 16, 55, -63});
        OooO0oO = new o0O0o000();
    }

    public o0O0o000() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.OooO0Oo = copyOnWriteArrayList;
        ((Application) e92.OooO00o.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        copyOnWriteArrayList.add(new te1(1));
        copyOnWriteArrayList.add(new te1(3));
    }

    @Override // com.cmaster.cloner.m30
    public final void OooO0O0(Activity activity, Intent intent) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.OooO0O0(activity, intent);
            }
        }
    }

    @Override // com.cmaster.cloner.m30
    public final void OooO0OO(Activity activity, int i, int i2, Intent intent) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.OooO0OO(activity, i, i2, intent);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            l82.OooO0O0();
        } catch (Throwable unused) {
        }
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityDestroyed(activity);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityPaused(activity);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityResumed(activity);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivitySaveInstanceState(activity, bundle);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityStarted(activity);
            }
        }
    }

    @Override // com.cmaster.cloner.m30, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Iterator it = this.OooO0Oo.iterator();
        while (it.hasNext()) {
            m30 m30Var = (m30) it.next();
            if (m30Var.OooO00o(activity)) {
                m30Var.onActivityStopped(activity);
            }
        }
    }
}

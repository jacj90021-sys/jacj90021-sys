package com.cmaster.cloner;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.cmaster.cloner.l91;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j91 {
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO00o(Activity activity, wl0 wl0Var) {
        jm0 jm0VarOooO0o;
        wl0Var.getClass();
        if (!(activity instanceof hm0) || (jm0VarOooO0o = ((hm0) activity).OooO0o()) == null) {
            return;
        }
        jm0VarOooO0o.OooO(wl0Var);
    }

    public static void OooO0O0(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            l91.OooO00o.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new l91.OooO00o());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new l91(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}

package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y91 implements Handler.Callback {
    public static final oOO0OO OooO0oo = new oOO0OO();
    public volatile x91 OooO0Oo;
    public final x20 OooO0o;
    public final k3 OooO0o0 = new k3(0);
    public final o0O000O OooO0oO = new o0O000O(OooO0oo);

    public y91() {
        this.OooO0o = (h70.OooO0o && h70.OooO0o0) ? new c00() : new d83(5);
    }

    public static Activity OooO00o(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void OooO0O0(List list, k3 k3Var) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o10 o10Var = (o10) it.next();
            if (o10Var != null && (obj = o10Var.Oooo0) != null) {
                k3Var.put(obj, o10Var);
                OooO0O0(o10Var.OooO().OooO0OO.OooOo(), k3Var);
            }
        }
    }

    public final x91 OooO0OO(Context context) {
        if (context == null) {
            ra.OooOOO("You cannot start a load on a null Context");
            return null;
        }
        char[] cArr = pr1.OooO00o;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof oOOO00) {
                return OooO0Oo((oOOO00) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return OooO0OO(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.OooO0Oo == null) {
            synchronized (this) {
                try {
                    if (this.OooO0Oo == null) {
                        this.OooO0Oo = new x91(com.bumptech.glide.OooO00o.OooO00o(context.getApplicationContext()), new vu0(3), new vu0(6), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.OooO0Oo;
    }

    public final x91 OooO0Oo(oOOO00 oooo00) {
        char[] cArr = pr1.OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return OooO0OO(oooo00.getApplicationContext());
        }
        if (oooo00.isDestroyed()) {
            ra.OooOOO("You cannot start a load for a destroyed activity");
            return null;
        }
        this.OooO0o.OooO0OO(oooo00);
        Activity activityOooO00o = OooO00o(oooo00);
        return this.OooO0oO.OooOooo(oooo00, com.bumptech.glide.OooO00o.OooO00o(oooo00.getApplicationContext()), oooo00.OooO0oO, oooo00.OooOOO(), activityOooO00o == null || !activityOooO00o.isFinishing());
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}

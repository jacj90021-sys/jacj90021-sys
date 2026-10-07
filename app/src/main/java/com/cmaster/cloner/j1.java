package com.cmaster.cloner;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class j1 {
    public static final ArrayList OooO00o = new ArrayList(10);
    public static final gv0 OooO0O0 = new gv0();
    public static final i1 OooO0OO = new i1();
    public static final k3 OooO0Oo = new k3(0);
    public static ComponentName OooO0o0;

    public static final Activity OooO00o(Context context) {
        context.getClass();
        Activity activity = null;
        while (activity == null && context != null) {
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        if (activity != null) {
            return activity;
        }
        return null;
    }

    public static final o10 OooO0O0(View view) {
        o10 o10Var;
        view.getClass();
        k3 k3Var = OooO0Oo;
        k3Var.clear();
        Context context = view.getContext();
        context.getClass();
        Activity activityOooO00o = OooO00o(context);
        oOOO00 oooo00 = activityOooO00o instanceof oOOO00 ? (oOOO00) activityOooO00o : null;
        if (oooo00 == null) {
            o10Var = null;
        } else {
            k20 k20VarOooOOO = oooo00.OooOOO();
            k20VarOooOOO.getClass();
            OooO0OO(k20VarOooOOO, k3Var);
            View viewFindViewById = oooo00.findViewById(android.R.id.content);
            o10Var = null;
            while (!view.equals(viewFindViewById) && (o10Var = (o10) k3Var.get(view)) == null && (view.getParent() instanceof View)) {
                Object parent = view.getParent();
                parent.getClass();
                view = (View) parent;
            }
            k3Var.clear();
        }
        if (o10Var != null) {
            return o10Var;
        }
        return null;
    }

    public static final void OooO0OO(k20 k20Var, k3 k3Var) {
        for (o10 o10Var : k20Var.OooO0OO.OooOo()) {
            View view = o10Var.Oooo0;
            if (view != null) {
                k3Var.put(view, o10Var);
                k20 k20VarOooO = o10Var.OooO();
                k20VarOooO.getClass();
                OooO0OO(k20VarOooO, k3Var);
            }
        }
    }

    public static final void OooO0Oo(Context context, Class cls, Bundle bundle) {
        context.getClass();
        if (OooO0o0 == null) {
            ra.OooOOO0("launch error");
            return;
        }
        Intent intent = new Intent();
        intent.setComponent(OooO0o0);
        intent.setData(Uri.fromParts("Fragment", cls.getName(), null));
        intent.putExtra("android.intent.extra.REFERRER_NAME", cls.getName());
        intent.putExtra("android.intent.extra.REFERRER", bundle);
        if (OooO00o(context) == null) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }

    public static final o0O0O0O OooO0o(Context context, Class cls) {
        Bundle bundle = Bundle.EMPTY;
        context.getClass();
        if (OooO0o0 == null) {
            ra.OooOOO0("launch error");
            return null;
        }
        Activity activityOooO00o = OooO00o(context);
        activityOooO00o.getClass();
        Intent intent = new Intent();
        intent.setComponent(OooO0o0);
        intent.setData(Uri.fromParts("Fragment", cls.getName(), null));
        intent.putExtra("android.intent.extra.REFERRER_NAME", cls.getName());
        intent.putExtra("android.intent.extra.REFERRER", bundle);
        return ((m1) activityOooO00o).OooOo(intent);
    }

    public static void OooO0o0(g80 g80Var, Class cls) {
        OooO0Oo(g80Var.Oooo(), cls, null);
    }
}

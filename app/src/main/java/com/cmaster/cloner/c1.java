package com.cmaster.cloner;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c1 implements View.OnClickListener {
    public final View OooO0Oo;
    public Method OooO0o;
    public final String OooO0o0;
    public Context OooO0oO;

    public c1(View view, String str) {
        this.OooO0Oo = view;
        this.OooO0o0 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Method method;
        if (this.OooO0o == null) {
            View view2 = this.OooO0Oo;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.OooO0o0;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    sa.OooO0oo("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ", view2.getClass(), str);
                    return;
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.OooO0o = method;
                        this.OooO0oO = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.OooO0o.invoke(this.OooO0oO, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}

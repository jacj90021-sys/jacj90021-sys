package com.cmaster.cloner;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gg extends Dialog implements hm0, jd1 {
    public jm0 OooO0Oo;
    public final xy0 OooO0o;
    public final e81 OooO0o0;

    public gg(Context context, int i) {
        super(context, i);
        this.OooO0o0 = new e81(new id1(this, new wf(this, 5)));
        this.OooO0o = new xy0(new o00OOOOo(this, 7));
    }

    public static void OooO00o(gg ggVar) {
        super.onBackPressed();
    }

    public final void OooO0O0() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.cmaster.cloner.jd1
    public final o0O000O OooO0Oo() {
        return (o0O000O) this.OooO0o0.OooO0o;
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        jm0 jm0Var = this.OooO0Oo;
        if (jm0Var != null) {
            return jm0Var;
        }
        jm0 jm0Var2 = new jm0(this);
        this.OooO0Oo = jm0Var2;
        return jm0Var2;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        OooO0O0();
        super.addContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.OooO0o.OooO00o();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            xy0 xy0Var = this.OooO0o;
            xy0Var.getClass();
            xy0Var.OooO0o0 = onBackInvokedDispatcher;
            xy0Var.OooO0O0(xy0Var.OooO0oO);
        }
        this.OooO0o0.OooOo0(bundle);
        jm0 jm0Var = this.OooO0Oo;
        if (jm0Var == null) {
            jm0Var = new jm0(this);
            this.OooO0Oo = jm0Var;
        }
        jm0Var.OooO(wl0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.OooO0o0.OooOo0O(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        jm0 jm0Var = this.OooO0Oo;
        if (jm0Var == null) {
            jm0Var = new jm0(this);
            this.OooO0Oo = jm0Var;
        }
        jm0Var.OooO(wl0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        jm0 jm0Var = this.OooO0Oo;
        if (jm0Var == null) {
            jm0Var = new jm0(this);
            this.OooO0Oo = jm0Var;
        }
        jm0Var.OooO(wl0.ON_DESTROY);
        this.OooO0Oo = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        OooO0O0();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        OooO0O0();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        OooO0O0();
        super.setContentView(view, layoutParams);
    }
}

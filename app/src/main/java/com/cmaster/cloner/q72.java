package com.cmaster.cloner;

import android.app.Application;
import android.app.Dialog;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q72 {
    public final Application OooO00o;
    public final qa2 OooO0O0;
    public final s52 OooO0OO;
    public final o92 OooO0Oo;
    public Dialog OooO0o;
    public final vr1 OooO0o0;
    public ha2 OooO0oO;
    public final AtomicBoolean OooO0oo = new AtomicBoolean();
    public final AtomicReference OooO = new AtomicReference();
    public final AtomicReference OooOO0 = new AtomicReference();
    public final AtomicReference OooOO0O = new AtomicReference();
    public boolean OooOO0o = false;

    public q72(Application application, qa2 qa2Var, s52 s52Var, o92 o92Var, vr1 vr1Var) {
        this.OooO00o = application;
        this.OooO0O0 = qa2Var;
        this.OooO0OO = s52Var;
        this.OooO0Oo = o92Var;
        this.OooO0o0 = vr1Var;
    }

    public final void OooO00o(nr1 nr1Var, mr1 mr1Var) {
        vr1 vr1Var = this.OooO0o0;
        qa2 qa2Var = (qa2) ((zf2) vr1Var.OooO0o0).zza();
        Handler handler = kd2.OooO00o;
        u73.OooO00o(handler);
        ha2 ha2Var = new ha2(qa2Var, handler, ((oO0Ooooo) vr1Var.OooO0o).OooOO0());
        this.OooO0oO = ha2Var;
        ha2Var.setBackgroundColor(0);
        ha2Var.getSettings().setJavaScriptEnabled(true);
        ha2Var.getSettings().setAllowFileAccess(false);
        ha2Var.getSettings().setAllowContentAccess(false);
        ha2Var.setWebViewClient(new aa2(ha2Var, 0));
        this.OooO.set(new j72(nr1Var, mr1Var));
        ha2 ha2Var2 = this.OooO0oO;
        o92 o92Var = this.OooO0Oo;
        ha2Var2.loadDataWithBaseURL(o92Var.OooO00o, o92Var.OooO0O0, "text/html", "UTF-8", null);
        handler.postDelayed(new u91(this, 21), 10000L);
    }
}

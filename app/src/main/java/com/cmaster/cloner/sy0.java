package com.cmaster.cloner;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sy0 implements OnBackAnimationCallback {
    public final /* synthetic */ a40 OooO00o;
    public final /* synthetic */ a40 OooO0O0;
    public final /* synthetic */ p30 OooO0OO;
    public final /* synthetic */ p30 OooO0Oo;

    public sy0(a40 a40Var, a40 a40Var2, p30 p30Var, p30 p30Var2) {
        this.OooO00o = a40Var;
        this.OooO0O0 = a40Var2;
        this.OooO0OO = p30Var;
        this.OooO0Oo = p30Var2;
    }

    public final void onBackCancelled() {
        this.OooO0Oo.OooO00o();
    }

    public final void onBackInvoked() {
        this.OooO0OO.OooO00o();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        this.OooO0O0.OooO0o(new j5(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        this.OooO00o.OooO0o(new j5(backEvent));
    }
}

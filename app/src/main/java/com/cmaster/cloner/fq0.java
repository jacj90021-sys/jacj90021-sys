package com.cmaster.cloner;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fq0 implements OnBackAnimationCallback {
    public final /* synthetic */ dq0 OooO00o;
    public final /* synthetic */ gq0 OooO0O0;

    public fq0(gq0 gq0Var, dq0 dq0Var) {
        this.OooO0O0 = gq0Var;
        this.OooO00o = dq0Var;
    }

    public final void onBackCancelled() {
        if (this.OooO0O0.OooO00o != null) {
            this.OooO00o.OooO0Oo();
        }
    }

    public final void onBackInvoked() {
        this.OooO00o.OooO0OO();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.OooO0O0.OooO00o != null) {
            this.OooO00o.OooO00o(new j5(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.OooO0O0.OooO00o != null) {
            this.OooO00o.OooO0O0(new j5(backEvent));
        }
    }
}

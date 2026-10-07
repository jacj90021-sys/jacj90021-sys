package com.cmaster.cloner;

import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vc3 {
    public final /* synthetic */ f63 OooO00o;
    public final /* synthetic */ float OooO0O0;
    public final /* synthetic */ tc3 OooO0OO;
    public final /* synthetic */ float OooO0Oo;
    public final /* synthetic */ wc3 OooO0o0;

    public vc3(wc3 wc3Var, f63 f63Var, float f, tc3 tc3Var, float f2) {
        this.OooO00o = f63Var;
        this.OooO0O0 = f;
        this.OooO0OO = tc3Var;
        this.OooO0Oo = f2;
        this.OooO0o0 = wc3Var;
    }

    public final void OooO00o(Throwable th) {
        o0O000O o0o000o = wc3.OooOOoo;
        String str = "Unable to set zoom to " + this.OooO0Oo;
        if (Log.isLoggable((String) o0o000o.OooO0o0, 5)) {
            Log.w("AutoZoom", o0o000o.OoooOoo(str), th);
        }
        this.OooO0o0.OooO0O0.set(false);
    }
}

package com.cmaster.cloner;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q10 extends ds2 implements eu1, hm0, jd1, o20 {
    public final oOOO00 OooO0Oo;
    public final Handler OooO0o;
    public final oOOO00 OooO0o0;
    public final k20 OooO0oO;
    public final /* synthetic */ oOOO00 OooO0oo;

    public q10(oOOO00 oooo00) {
        this.OooO0oo = oooo00;
        Handler handler = new Handler();
        this.OooO0oO = new k20();
        this.OooO0Oo = oooo00;
        this.OooO0o0 = oooo00;
        this.OooO0o = handler;
    }

    @Override // com.cmaster.cloner.o20
    public final void OooO00o() {
    }

    @Override // com.cmaster.cloner.ds2
    public final View OooO0O0(int i) {
        return this.OooO0oo.findViewById(i);
    }

    @Override // com.cmaster.cloner.eu1
    public final du1 OooO0OO() {
        return this.OooO0oo.OooO0OO();
    }

    @Override // com.cmaster.cloner.jd1
    public final o0O000O OooO0Oo() {
        return (o0O000O) this.OooO0oo.OooO0oo.OooO0o;
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return this.OooO0oo.OooOo;
    }

    @Override // com.cmaster.cloner.ds2
    public final boolean OooO0o0() {
        Window window = this.OooO0oo.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}

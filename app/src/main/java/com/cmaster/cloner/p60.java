package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p60 extends j60 {
    public static final String OooOO0o = r60.class.getSimpleName();

    @Override // com.cmaster.cloner.cr0
    public final void OooO0Oo() {
        jb1.load(e2.OooO.OooO00o, this.OooO0o0.OooO00o, new oO000(new oO0000o0(0)), new o60(this));
    }

    @Override // com.cmaster.cloner.cr0
    public final void OooO0o0(View view, Object obj) {
        jb1 jb1Var = (jb1) ((lr0) obj).OooO00o;
        jb1Var.setImmersiveMode(true);
        jb1Var.setFullScreenContentCallback(this.OooOO0O);
        jb1Var.setOnPaidEventListener(this);
        jb1Var.show(j1.OooO00o(view.getContext()), this);
    }
}

package com.cmaster.cloner;

import android.view.Choreographer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qt1 implements Choreographer.FrameCallback {
    public final /* synthetic */ rt1 OooO0Oo;

    public qt1(rt1 rt1Var) {
        this.OooO0Oo = rt1Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.OooO0Oo.OooO0o0.run();
    }
}

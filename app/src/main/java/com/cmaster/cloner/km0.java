package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class km0 implements fm0 {
    public final /* synthetic */ jm0 OooO0Oo;
    public final /* synthetic */ o0O000O OooO0o0;

    public km0(o0O000O o0o000o, jm0 jm0Var) {
        this.OooO0o0 = o0o000o;
        this.OooO0Oo = jm0Var;
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
        ((HashMap) this.OooO0o0.OooO0o0).remove(this.OooO0Oo);
    }
}

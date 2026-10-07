package com.cmaster.cloner;

import android.content.res.Resources;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f8 implements qa1, ju0 {
    public final Resources OooO0Oo;

    public /* synthetic */ f8(Resources resources) {
        this.OooO0Oo = resources;
    }

    @Override // com.cmaster.cloner.qa1
    public fa1 OooOO0(fa1 fa1Var, xz0 xz0Var) {
        if (fa1Var == null) {
            return null;
        }
        return new l8(this.OooO0Oo, fa1Var);
    }

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        return new t3(this.OooO0Oo, wq1.OooO0O0);
    }
}

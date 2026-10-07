package com.cmaster.cloner;

import android.app.Dialog;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dr extends ds2 {
    public final /* synthetic */ m10 OooO0Oo;
    public final /* synthetic */ er OooO0o0;

    public dr(er erVar, m10 m10Var) {
        this.OooO0o0 = erVar;
        this.OooO0Oo = m10Var;
    }

    @Override // com.cmaster.cloner.ds2
    public final View OooO0O0(int i) {
        m10 m10Var = this.OooO0Oo;
        if (m10Var.OooO0o0()) {
            return m10Var.OooO0O0(i);
        }
        Dialog dialog = this.OooO0o0.OoooooO;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // com.cmaster.cloner.ds2
    public final boolean OooO0o0() {
        return this.OooO0Oo.OooO0o0() || this.OooO0o0.o00O0O;
    }
}

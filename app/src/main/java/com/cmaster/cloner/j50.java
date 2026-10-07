package com.cmaster.cloner;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j50 extends ContextWrapper {
    public static final q40 OooOO0O;
    public final int OooO;
    public final jp0 OooO00o;
    public final bj OooO0O0;
    public final gu0 OooO0OO;
    public final qc3 OooO0Oo;
    public final k3 OooO0o;
    public final List OooO0o0;
    public final kw OooO0oO;
    public final o00OO000 OooO0oo;
    public aa1 OooOO0;

    static {
        q40 q40Var = new q40();
        q40Var.OooO0Oo = ax0.OooO00o;
        OooOO0O = q40Var;
    }

    public j50(Context context, jp0 jp0Var, oh1 oh1Var, gu0 gu0Var, qc3 qc3Var, k3 k3Var, List list, kw kwVar, o00OO000 o00oo000) {
        super(context.getApplicationContext());
        this.OooO00o = jp0Var;
        this.OooO0OO = gu0Var;
        this.OooO0Oo = qc3Var;
        this.OooO0o0 = list;
        this.OooO0o = k3Var;
        this.OooO0oO = kwVar;
        this.OooO0oo = o00oo000;
        this.OooO = 4;
        this.OooO0O0 = new bj(oh1Var);
    }

    public final y81 OooO00o() {
        return (y81) this.OooO0O0.get();
    }
}

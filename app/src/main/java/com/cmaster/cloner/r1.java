package com.cmaster.cloner;

import android.view.View;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r1 extends sv {
    public final /* synthetic */ int OooO0o;
    public final /* synthetic */ qe OooO0oO;
    public final /* synthetic */ o1 OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r1(o1 o1Var, Integer num, qe qeVar, int i) {
        super(num);
        this.OooO0o = i;
        this.OooO0oo = o1Var;
        this.OooO0oO = qeVar;
    }

    @Override // com.cmaster.cloner.sv, com.cmaster.cloner.g7, android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0o;
        o1 o1Var = this.OooO0oo;
        qe qeVar = this.OooO0oO;
        switch (i) {
            case 0:
                s1 s1Var = (s1) qeVar;
                s1Var.OooO.OooOO0O = null;
                s1Var.OooOOOO(Collections.EMPTY_LIST);
                s1Var.OooO.OooOO0O = this;
                ((t1) o1Var).Ooooo0o.OooO0O0();
                break;
            default:
                s1 s1Var2 = (s1) qeVar;
                s1Var2.OooO.OooOO0O = null;
                s1Var2.OooOOOO(Collections.EMPTY_LIST);
                s1Var2.OooO.OooOO0O = this;
                ((m80) o1Var).Ooooo0o.OooO0O0();
                break;
        }
    }
}

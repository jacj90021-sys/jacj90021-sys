package com.cmaster.cloner;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r60 extends j60 {
    public final /* synthetic */ int OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r60(int i, er0 er0Var) {
        super(er0Var);
        this.OooOO0o = i;
    }

    @Override // com.cmaster.cloner.cr0
    public final void OooO0Oo() {
        int i = this.OooOO0o;
        er0 er0Var = this.OooO0o0;
        switch (i) {
            case 0:
                String str = er0Var.OooO00o;
                oO0000o0 oo0000o0 = new oO0000o0(0);
                ((s0) oo0000o0.OooO0Oo).OooO0OO = 10000;
                hb1.load(e2.OooO.OooO00o, er0Var.OooO00o, new oO000(oo0000o0), new q60(this));
                break;
            case 1:
                oO0000o0 oo0000o02 = new oO0000o0(0);
                ((s0) oo0000o02.OooO0Oo).OooO0OO = 10000;
                gj0.load(e2.OooO.OooO00o, er0Var.OooO00o, new oO000(oo0000o02), new k60(this));
                break;
            default:
                z1.load(e2.OooO.OooO00o, er0Var.OooO00o, new oO000(new oO0000o0(0)), new l60(this));
                break;
        }
    }

    @Override // com.cmaster.cloner.cr0
    public final void OooO0o0(View view, Object obj) {
        int i = this.OooOO0o;
        i60 i60Var = this.OooOO0O;
        switch (i) {
            case 0:
                hb1 hb1Var = (hb1) ((kr0) obj).OooO00o;
                hb1Var.setFullScreenContentCallback(i60Var);
                hb1Var.setOnPaidEventListener(this);
                hb1Var.setImmersiveMode(true);
                ArrayList arrayList = j1.OooO00o;
                view.getClass();
                Context context = view.getContext();
                context.getClass();
                Activity activityOooO00o = j1.OooO00o(context);
                if (activityOooO00o == null) {
                    OooO00o(new o0O0O0Oo(String.valueOf(activityOooO00o), 1));
                    break;
                } else {
                    hb1Var.show(activityOooO00o, this);
                    break;
                }
            case 1:
                gj0 gj0Var = (gj0) ((jr0) obj).OooO00o;
                gj0Var.setFullScreenContentCallback(i60Var);
                gj0Var.setOnPaidEventListener(this);
                gj0Var.setImmersiveMode(true);
                gj0Var.show(j1.OooO00o(view.getContext()));
                break;
            default:
                z1 z1Var = (z1) ((hr0) obj).OooO00o;
                z1Var.setFullScreenContentCallback(i60Var);
                z1Var.setImmersiveMode(true);
                z1Var.setOnPaidEventListener(this);
                z1Var.show(j1.OooO00o(view.getContext()));
                break;
        }
    }
}

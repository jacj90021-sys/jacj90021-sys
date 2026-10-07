package com.cmaster.cloner;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0oOO implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo = 0;
    public final /* synthetic */ Object OooO0o;
    public final Object OooO0o0;

    public o0oOO(un1 un1Var) {
        this.OooO0o = un1Var;
        Context context = un1Var.OooO00o.getContext();
        CharSequence charSequence = un1Var.OooO0oo;
        o00O0O00 o00o0o00 = new o00O0O00();
        o00o0o00.OooO0oo = 4096;
        o00o0o00.OooOO0 = 4096;
        o00o0o00.OooOOOO = null;
        o00o0o00.OooOOOo = null;
        o00o0o00.OooOOo0 = false;
        o00o0o00.OooOOo = false;
        o00o0o00.OooOOoo = 16;
        o00o0o00.OooOO0o = context;
        o00o0o00.OooO0Oo = charSequence;
        this.OooO0o0 = o00o0o00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        Object obj2 = this.OooO0o;
        switch (i) {
            case 0:
                v5.OooO0O0(((oo00oO) obj2).OooO0o0, ((s5) obj).OooO0Oo);
                break;
            default:
                un1 un1Var = (un1) obj2;
                Window.Callback callback = un1Var.OooOO0O;
                if (callback != null && un1Var.OooOO0o) {
                    callback.onMenuItemSelected(0, (o00O0O00) obj);
                    break;
                }
                break;
        }
    }

    public o0oOO(oo00oO oo00oo, s5 s5Var) {
        this.OooO0o = oo00oo;
        this.OooO0o0 = s5Var;
    }
}

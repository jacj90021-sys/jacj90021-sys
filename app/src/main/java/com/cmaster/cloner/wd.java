package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class wd implements View.OnFocusChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ jw OooO0O0;

    public /* synthetic */ wd(jw jwVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = jwVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.OooO00o;
        jw jwVar = this.OooO0O0;
        switch (i) {
            case 0:
                zd zdVar = (zd) jwVar;
                zdVar.OooOOoo(zdVar.OooOo00());
                break;
            default:
                tt ttVar = (tt) jwVar;
                ttVar.OooOO0o = z;
                ttVar.OooOOOo();
                if (!z) {
                    ttVar.OooOOoo(false);
                    ttVar.OooOOO0 = false;
                    break;
                }
                break;
        }
    }
}

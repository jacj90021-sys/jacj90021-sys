package com.cmaster.cloner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class Oo0000 extends q53 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ Oo0000(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.q53, com.cmaster.cloner.iu1
    public void OooO0O0() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                ((O0O0) obj).OooO0o0.OooOo.setVisibility(0);
                break;
            case 1:
                k kVar = (k) obj;
                kVar.OooOo.setVisibility(0);
                if (kVar.OooOo.getParent() instanceof View) {
                    View view = (View) kVar.OooOo.getParent();
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    dt1.OooO0OO(view);
                    break;
                }
                break;
        }
    }

    @Override // com.cmaster.cloner.iu1
    public final void OooO0OO() {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                k kVar = ((O0O0) obj).OooO0o0;
                kVar.OooOo.setAlpha(1.0f);
                kVar.OooOoOO.OooO0Oo(null);
                kVar.OooOoOO = null;
                break;
            case 1:
                k kVar2 = (k) obj;
                kVar2.OooOo.setAlpha(1.0f);
                kVar2.OooOoOO.OooO0Oo(null);
                kVar2.OooOoOO = null;
                break;
            default:
                k kVar3 = (k) ((o0O000O) obj).OooO0o;
                kVar3.OooOo.setVisibility(8);
                PopupWindow popupWindow = kVar3.OooOoO0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar3.OooOo.getParent() instanceof View) {
                    View view = (View) kVar3.OooOo.getParent();
                    WeakHashMap weakHashMap = nt1.OooO00o;
                    dt1.OooO0OO(view);
                }
                kVar3.OooOo.OooO0o0();
                kVar3.OooOoOO.OooO0Oo(null);
                kVar3.OooOoOO = null;
                ViewGroup viewGroup = kVar3.OooOooO;
                WeakHashMap weakHashMap2 = nt1.OooO00o;
                dt1.OooO0OO(viewGroup);
                break;
        }
    }
}

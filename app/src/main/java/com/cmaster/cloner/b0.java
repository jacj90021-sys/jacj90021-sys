package com.cmaster.cloner;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b0 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ b0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                k0 k0Var = (k0) obj;
                if (!k0Var.getInternalPopup().OooO00o()) {
                    k0Var.OooO.OooOOO0(k0Var.getTextDirection(), k0Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = k0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                h0 h0Var = (h0) obj;
                k0 k0Var2 = h0Var.Oooo0O0;
                if (!k0Var2.isAttachedToWindow() || !k0Var2.getGlobalVisibleRect(h0Var.Oooo00o)) {
                    h0Var.dismiss();
                    break;
                } else {
                    h0Var.OooOOo();
                    h0Var.OooO();
                    break;
                }
                break;
            case 2:
                ub ubVar = (ub) obj;
                ArrayList arrayList = ubVar.OooOO0O;
                if (ubVar.OooO00o() && arrayList.size() > 0) {
                    int i2 = 0;
                    if (!((tb) arrayList.get(0)).OooO00o.OooOoo0) {
                        View view = ubVar.OooOOo;
                        if (view != null && view.isShown()) {
                            int size = arrayList.size();
                            while (i2 < size) {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                ((tb) obj2).OooO00o.OooO();
                            }
                            break;
                        } else {
                            ubVar.dismiss();
                            break;
                        }
                    }
                }
                break;
            default:
                oi1 oi1Var = (oi1) obj;
                gt0 gt0Var = oi1Var.OooOO0O;
                if (oi1Var.OooO00o() && !gt0Var.OooOoo0) {
                    View view2 = oi1Var.OooOOOo;
                    if (view2 != null && view2.isShown()) {
                        gt0Var.OooO();
                        break;
                    } else {
                        oi1Var.dismiss();
                        break;
                    }
                }
                break;
        }
    }
}

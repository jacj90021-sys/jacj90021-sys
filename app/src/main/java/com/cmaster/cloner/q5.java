package com.cmaster.cloner;

import android.app.Dialog;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q5 implements iy0 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ q5(gr0 gr0Var, ViewGroup viewGroup, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = gr0Var;
        this.OooO0o = viewGroup;
    }

    @Override // com.cmaster.cloner.iy0
    public final void OooO00o(Object obj) {
        int i = this.OooO0Oo;
        Object obj2 = this.OooO0o;
        Object obj3 = this.OooO0o0;
        switch (i) {
            case 0:
                c81 c81Var = (c81) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                gr0 gr0Var = (gr0) obj3;
                if (System.currentTimeMillis() < c81Var.OooO0oo && System.currentTimeMillis() > c81Var.OooO0o) {
                    if (gr0Var.OooO0oO != -1) {
                        gr0Var.OooO0Oo();
                        break;
                    }
                } else if (gr0Var.OooO0oO != -1) {
                    gr0Var.OooO0oo(viewGroup);
                    break;
                } else {
                    gr0Var.OooO0oO();
                    gr0Var.OooO0oo(viewGroup);
                    break;
                }
                break;
            case 1:
                c81 c81Var2 = (c81) obj;
                TextView textView = ((x10) obj3).OooOo0O;
                l30 l30Var = (l30) obj2;
                xx0 xx0Var = l30Var.OooooO0;
                int i2 = c81Var2.OooO0OO;
                TextView textView2 = xx0Var.OooO0o;
                if (i2 < 0) {
                    i2 = 0;
                }
                xx0Var.OooO0Oo = i2;
                textView2.removeCallbacks(xx0Var);
                int i3 = i2 + 1;
                xx0Var.OooO0o0 = i3;
                if (i3 > 5) {
                    xx0Var.OooO0o0 = 5;
                }
                long j = 200 / xx0Var.OooO0o0;
                xx0Var.OooO0oO = j;
                if (xx0Var.OooO0oo) {
                    xx0Var.OooO0oo = false;
                    textView2.postDelayed(xx0Var, j);
                } else {
                    textView2.setText(String.valueOf(i2));
                }
                if (System.currentTimeMillis() >= c81Var2.OooO0o) {
                    if (System.currentTimeMillis() >= c81Var2.OooO0oo) {
                        textView.setText(R.string.banner_vip_expired_status);
                        break;
                    } else {
                        textView.setText(DateUtils.formatDateTime(l30Var.Oooo(), c81Var2.OooO0oo, 0));
                        break;
                    }
                } else {
                    String dateTime = DateUtils.formatDateTime(l30Var.Oooo(), c81Var2.OooO0o, 0);
                    String dateTime2 = DateUtils.formatDateTime(l30Var.Oooo(), c81Var2.OooO0oo, 0);
                    StringBuilder sbOooOO0 = rj.OooOO0(dateTime);
                    sbOooOO0.append(sn2.OooO00o("vg==\n", "wKIdfBvxspI=\n"));
                    sbOooOO0.append(dateTime2);
                    textView.setText(sbOooOO0.toString());
                    break;
                }
            case 2:
                wa1 wa1Var = (wa1) obj;
                l30 l30Var2 = (l30) obj2;
                ((Dialog) obj3).dismiss();
                if (!wa1Var.OooO0Oo()) {
                    if (wa1Var.OooO00o != -8000) {
                        Log.e(sn2.OooO00o("e4ok\n", "L8tj0fJabrc=\n"), sn2.OooO00o("bh27oIJCmdk=\n", "DHzVzucwo/k=\n") + wa1Var);
                        e2.OooO0Oo(l30Var2.OooOOO().getString(R.string.error_network));
                        break;
                    } else {
                        e2.OooO0Oo(l30Var2.OooOOO().getString(R.string.error_network_timeout));
                        break;
                    }
                }
                break;
            case 3:
                if (((wa1) obj).OooO0Oo()) {
                    ((y50) obj3).OooO((ViewGroup) obj2);
                    break;
                }
                break;
            case 4:
                Boolean bool = (Boolean) obj;
                ((cz) obj3).setVisibility(bool.booleanValue() ? 0 : 8);
                ((LinearLayout) ((m80) obj2).Ooooo00.OooO0oo).setVisibility(bool.booleanValue() ? 8 : 0);
                break;
            case 5:
                cr0 cr0Var = (cr0) obj2;
                ((gv0) obj3).OooOO0O(this);
                if (!((Boolean) obj).booleanValue()) {
                    cr0Var.OooO0O0(wa1.OooO00o(-1, new o0O0O0Oo("not initialize", 1), null));
                    break;
                } else {
                    cr0Var.OooO0o0.getClass();
                    o0OOOO0o.OooO0OO.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0 || jCurrentTimeMillis >= 86400000) {
                        System.currentTimeMillis();
                        cr0Var.OooO0Oo();
                        break;
                    } else {
                        cr0Var.OooO0O0(wa1.OooO00o(-1, new o0O0O0Oo("current can not show", 1), null));
                        break;
                    }
                }
                break;
            default:
                ((fv1) obj3).OooOOo0(((hv1) obj2).OooO0O0);
                break;
        }
    }

    public /* synthetic */ q5(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
        this.OooO0o0 = obj2;
    }
}

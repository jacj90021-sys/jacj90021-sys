package com.cmaster.cloner;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hu1 {
    public Interpolator OooO0OO;
    public iu1 OooO0Oo;
    public boolean OooO0o0;
    public long OooO0O0 = -1;
    public final tn1 OooO0o = new tn1(this);
    public final ArrayList OooO00o = new ArrayList();

    public final void OooO00o() {
        if (this.OooO0o0) {
            ArrayList arrayList = this.OooO00o;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((gu1) obj).OooO0O0();
            }
            this.OooO0o0 = false;
        }
    }

    public final void OooO0O0() {
        View view;
        if (this.OooO0o0) {
            return;
        }
        ArrayList arrayList = this.OooO00o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gu1 gu1Var = (gu1) obj;
            long j = this.OooO0O0;
            if (j >= 0) {
                gu1Var.OooO0OO(j);
            }
            Interpolator interpolator = this.OooO0OO;
            if (interpolator != null && (view = (View) gu1Var.OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.OooO0Oo != null) {
                gu1Var.OooO0Oo(this.OooO0o);
            }
            View view2 = (View) gu1Var.OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.OooO0o0 = true;
    }
}

package com.cmaster.cloner;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xx2 {
    public static final void OooO00o(View view) {
        view.getClass();
        ve1 ve1Var = new ve1();
        xt1 xt1Var = new xt1(view, ve1Var);
        xt1Var.OooO0oO = ve1Var;
        ve1Var.OooO0oO = xt1Var;
        while (ve1Var.hasNext()) {
            View view2 = (View) ve1Var.next();
            q31 q31Var = (q31) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (q31Var == null) {
                q31Var = new q31();
                view2.setTag(R.id.pooling_container_listener_holder_tag, q31Var);
            }
            ArrayList arrayList = q31Var.OooO00o;
            arrayList.getClass();
            int size = arrayList.size() - 1;
            if (-1 < size) {
                arrayList.get(size).getClass();
                ra.OooOO0o();
                return;
            }
        }
    }
}

package com.cmaster.cloner;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class z01 extends b11 {
    public final ActivityInfo OooO0o;

    public z01(d11 d11Var, Object obj) {
        l81 l81Var;
        super(d11Var, obj);
        Class cls = l11.OooO00o;
        this.OooO0o = (ActivityInfo) ((cls == null || !cls.isInstance(obj) || (l81Var = l11.OooO0O0) == null) ? null : l81Var.OooO0O0(obj));
        l81 l81Var2 = n11.OooO0O0;
        List list = l81Var2 != null ? (List) l81Var2.OooO0O0(obj) : null;
        if (fn2.OooO0Oo(list)) {
            return;
        }
        this.OooO0O0 = new ArrayList(list.size());
        for (Object obj2 : list) {
            ArrayList arrayList = this.OooO0O0;
            a11 a11Var = new a11(obj2);
            a11Var.OooO0oo = this;
            arrayList.add(a11Var);
        }
    }
}

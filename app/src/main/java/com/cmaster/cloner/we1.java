package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class we1 extends b43 {
    public static List OooO00o(ue1 ue1Var) {
        Iterator it = ue1Var.iterator();
        if (!it.hasNext()) {
            return nv.OooO0Oo;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return te.OooO0O0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

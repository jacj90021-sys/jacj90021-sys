package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cw {
    public final ArrayList OooO00o;

    public cw(int i) {
        switch (i) {
            case 1:
                this.OooO00o = new ArrayList();
                break;
            case 2:
                this.OooO00o = new ArrayList();
                break;
            case 3:
                this.OooO00o = new ArrayList();
                break;
            default:
                this.OooO00o = new ArrayList();
                break;
        }
    }

    public synchronized la1 OooO00o(Class cls) {
        int size = this.OooO00o.size();
        for (int i = 0; i < size; i++) {
            ma1 ma1Var = (ma1) this.OooO00o.get(i);
            if (ma1Var.OooO00o.isAssignableFrom(cls)) {
                return ma1Var.OooO0O0;
            }
        }
        return null;
    }

    public synchronized ArrayList OooO0O0(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        ArrayList arrayList2 = this.OooO00o;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            mo1 mo1Var = (mo1) obj;
            if ((mo1Var.OooO00o.isAssignableFrom(cls) && cls2.isAssignableFrom(mo1Var.OooO0O0)) && !arrayList.contains(mo1Var.OooO0O0)) {
                arrayList.add(mo1Var.OooO0O0);
            }
        }
        return arrayList;
    }
}

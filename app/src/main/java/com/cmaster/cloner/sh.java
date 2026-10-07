package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sh {
    public final ArrayList OooO00o = new ArrayList();
    public Object OooO0O0;
    public final gi OooO0OO;
    public g02 OooO0Oo;

    public sh(gi giVar) {
        this.OooO0OO = giVar;
    }

    public abstract boolean OooO00o(w02 w02Var);

    public abstract boolean OooO0O0(Object obj);

    public final void OooO0OO(Iterable iterable) {
        this.OooO00o.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            w02 w02Var = (w02) it.next();
            if (OooO00o(w02Var)) {
                this.OooO00o.add(w02Var.OooO00o);
            }
        }
        boolean zIsEmpty = this.OooO00o.isEmpty();
        gi giVar = this.OooO0OO;
        if (zIsEmpty) {
            giVar.OooO0O0(this);
        } else {
            synchronized (giVar.OooO0OO) {
                try {
                    if (giVar.OooO0Oo.add(this)) {
                        if (giVar.OooO0Oo.size() == 1) {
                            giVar.OooO0o0 = giVar.OooO00o();
                            ep0.OooO0oO().OooO0Oo(gi.OooO0o, String.format("%s: initial state = %s", giVar.getClass().getSimpleName(), giVar.OooO0o0), new Throwable[0]);
                            giVar.OooO0Oo();
                        }
                        Object obj = giVar.OooO0o0;
                        this.OooO0O0 = obj;
                        OooO0Oo(this.OooO0Oo, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        OooO0Oo(this.OooO0Oo, this.OooO0O0);
    }

    public final void OooO0Oo(g02 g02Var, Object obj) {
        if (this.OooO00o.isEmpty() || g02Var == null) {
            return;
        }
        if (obj == null || OooO0O0(obj)) {
            ArrayList arrayList = this.OooO00o;
            synchronized (g02Var.OooO0OO) {
                try {
                    f02 f02Var = g02Var.OooO00o;
                    if (f02Var != null) {
                        f02Var.OooO0Oo(arrayList);
                    }
                } finally {
                }
            }
            return;
        }
        ArrayList arrayList2 = this.OooO00o;
        synchronized (g02Var.OooO0OO) {
            try {
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    String str = (String) obj2;
                    if (g02Var.OooO00o(str)) {
                        ep0.OooO0oO().OooO0Oo(g02.OooO0Oo, "Constraints met for " + str, new Throwable[0]);
                        arrayList3.add(str);
                    }
                }
                f02 f02Var2 = g02Var.OooO00o;
                if (f02Var2 != null) {
                    f02Var2.OooO0o(arrayList3);
                }
            } finally {
            }
        }
    }
}

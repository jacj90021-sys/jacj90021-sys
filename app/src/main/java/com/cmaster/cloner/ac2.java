package com.cmaster.cloner;

import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ac2 extends x92 {
    public final Object OooO0Oo;
    public final /* synthetic */ fc2 OooO0o;
    public int OooO0o0;

    public ac2(fc2 fc2Var, int i) {
        this.OooO0o = fc2Var;
        Object obj = fc2.OooOOO0;
        this.OooO0Oo = fc2Var.OooO0O0()[i];
        this.OooO0o0 = i;
    }

    public final void OooO00o() {
        int i = this.OooO0o0;
        Object obj = this.OooO0Oo;
        fc2 fc2Var = this.OooO0o;
        if (i != -1 && i < fc2Var.size()) {
            if (e73.OooO00o(obj, fc2Var.OooO0O0()[this.OooO0o0])) {
                return;
            }
        }
        Object obj2 = fc2.OooOOO0;
        this.OooO0o0 = fc2Var.OooO0oo(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.OooO0Oo;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        fc2 fc2Var = this.OooO0o;
        Map mapOooO0Oo = fc2Var.OooO0Oo();
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.get(this.OooO0Oo);
        }
        OooO00o();
        int i = this.OooO0o0;
        if (i == -1) {
            return null;
        }
        return fc2Var.OooO0OO()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        fc2 fc2Var = this.OooO0o;
        Map mapOooO0Oo = fc2Var.OooO0Oo();
        Object obj2 = this.OooO0Oo;
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.put(obj2, obj);
        }
        OooO00o();
        int i = this.OooO0o0;
        if (i == -1) {
            fc2Var.put(obj2, obj);
            return null;
        }
        Object obj3 = fc2Var.OooO0OO()[i];
        fc2Var.OooO0OO()[this.OooO0o0] = obj;
        return obj3;
    }
}

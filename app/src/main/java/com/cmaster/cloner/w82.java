package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class w82 {
    public static final uk1 OooO00o = new uk1("NO_THREAD_ELEMENTS", 0);

    public static final void OooO00o(vj vjVar, Object obj) {
        if (obj == OooO00o) {
            return;
        }
        if (!(obj instanceof ym1)) {
            Object objOooO0o = vjVar.OooO0o(null, wj.OooO);
            objOooO0o.getClass();
            ((um1) objOooO0o).OooO0o0.set(obj);
            return;
        }
        ym1 ym1Var = (ym1) obj;
        um1[] um1VarArr = ym1Var.OooO0OO;
        int length = um1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            um1 um1Var = um1VarArr[length];
            um1Var.getClass();
            um1Var.OooO0o0.set(ym1Var.OooO0O0[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final Object OooO0O0(vj vjVar, Object obj) {
        if (obj == null) {
            obj = vjVar.OooO0o(0, wj.OooO0oo);
            obj.getClass();
        }
        if (obj == 0) {
            return OooO00o;
        }
        if (obj instanceof Integer) {
            return vjVar.OooO0o(new ym1(vjVar, ((Number) obj).intValue()), wj.OooOO0);
        }
        um1 um1Var = (um1) obj;
        ThreadLocal threadLocal = um1Var.OooO0o0;
        Object obj2 = threadLocal.get();
        threadLocal.set(um1Var.OooO0Oo);
        return obj2;
    }
}

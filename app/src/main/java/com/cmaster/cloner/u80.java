package com.cmaster.cloner;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u80 implements iu0 {
    public static final tz0 OooO0O0 = tz0.OooO00o(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final o00OO000 OooO00o;

    public u80(o00OO000 o00oo000) {
        this.OooO00o = o00oo000;
    }

    @Override // com.cmaster.cloner.iu0
    public final /* bridge */ /* synthetic */ boolean OooO00o(Object obj) {
        return true;
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        s50 s50Var = (s50) obj;
        o00OO000 o00oo000 = this.OooO00o;
        if (o00oo000 != null) {
            eu0 eu0Var = (eu0) o00oo000.OooO0o0;
            fu0 fu0VarOooO00o = fu0.OooO00o(s50Var);
            Object objOooO00o = eu0Var.OooO00o(fu0VarOooO00o);
            ArrayDeque arrayDeque = fu0.OooO0O0;
            synchronized (arrayDeque) {
                arrayDeque.offer(fu0VarOooO00o);
            }
            s50 s50Var2 = (s50) objOooO00o;
            if (s50Var2 == null) {
                eu0Var.OooO0Oo(fu0.OooO00o(s50Var), s50Var);
            } else {
                s50Var = s50Var2;
            }
        }
        return new hu0(s50Var, new v80(s50Var, ((Integer) xz0Var.OooO0OO(OooO0O0)).intValue()));
    }
}

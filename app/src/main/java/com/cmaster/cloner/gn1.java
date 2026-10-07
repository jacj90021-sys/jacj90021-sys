package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gn1 extends td1 implements Runnable {
    public final long OooO0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public gn1(long j, e31 e31Var) {
        vj vjVar = e31Var.OooO0o0;
        vjVar.getClass();
        super(vjVar, e31Var);
        this.OooO0oo = j;
    }

    @Override // com.cmaster.cloner.nk0
    public final String Oooo0O0() {
        return super.Oooo0O0() + "(timeMillis=" + this.OooO0oo + ')';
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        tj tjVarOooO0oo = this.OooO0o.OooO0oo(oOO0OO.OooO0o0);
        if ((tjVarOooO0oo instanceof ip ? (ip) tjVarOooO0oo : null) == null) {
            ip ipVar = co.OooO00o;
        }
        OooOOOO(new fn1("Timed out waiting for " + this.OooO0oo + " ms", this));
    }
}

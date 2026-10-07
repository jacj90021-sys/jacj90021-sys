package com.cmaster.cloner;

import android.os.IInterface;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s2 extends rq {
    public final IInterface OooO0oO;

    public s2(v2 v2Var, ClassLoader classLoader) {
        super(v2Var, classLoader);
        if (u90.OooO0O0 == null) {
            this.OooO0oO = (IInterface) w2.OooO0O0.Oooo000(this);
        } else {
            this.OooO0oO = (IInterface) u90.OooO0OO.Oooo000(this);
        }
    }

    @Override // com.cmaster.cloner.rq, java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        yq yqVarOooO0o0;
        Object objOooO0oO = b8.OooO0O0.get();
        if (objOooO0oO == null || v90.OooO00o.isInstance(objOooO0oO)) {
            if (objOooO0oO == null) {
                objOooO0oO = this.OooO0o0.OooO0oO(rq.OooO0O0());
            }
            yqVarOooO0o0 = yq.OooO0o0(objOooO0oO, method, objArr);
        } else {
            yqVarOooO0o0 = yq.OooO0o0(this.OooO0oO, method, objArr);
        }
        ((st0) st0.OooO0OO.get()).OooO00o.OooO00o(yqVarOooO0o0);
        yqVarOooO0o0.OooO00o();
        return yqVarOooO0o0.OooO0oO();
    }
}

package com.cmaster.cloner;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class u50 extends m6 implements oOO000 {
    public final Set OooO0Oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public u50(Context context, Looper looper, int i, oO0Ooooo oo0ooooo, f60 f60Var, g60 g60Var) {
        b73 b73VarOooO00o = v50.OooO00o(context);
        d60 d60Var = d60.OooO0Oo;
        by2.OooO0oo(f60Var);
        by2.OooO0oo(g60Var);
        super(context, looper, b73VarOooO00o, d60Var, i, new nz0(f60Var, 13), new na1(g60Var, 9), (String) oo0ooooo.OooO0oo);
        Set set = (Set) oo0ooooo.OooO0o;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                qa.OooO0o("Expanding scopes is not permitted, use implied scopes instead");
                throw null;
            }
        }
        this.OooO0Oo = set;
    }

    @Override // com.cmaster.cloner.oOO000
    public final Set OooO00o() {
        return requiresSignIn() ? this.OooO0Oo : Collections.EMPTY_SET;
    }

    @Override // com.cmaster.cloner.m6
    public final Account getAccount() {
        return null;
    }

    @Override // com.cmaster.cloner.m6
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // com.cmaster.cloner.m6
    public final Set getScopes() {
        return this.OooO0Oo;
    }
}

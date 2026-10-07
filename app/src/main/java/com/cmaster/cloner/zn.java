package com.cmaster.cloner;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zn implements kh {
    public final Context OooO0Oo;
    public final w91 OooO0o0;

    public zn(Context context, w91 w91Var) {
        this.OooO0Oo = context.getApplicationContext();
        this.OooO0o0 = w91Var;
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO() {
        oh1 oh1VarOooO0O0 = oh1.OooO0O0(this.OooO0Oo);
        w91 w91Var = this.OooO0o0;
        synchronized (oh1VarOooO0O0) {
            ((HashSet) oh1VarOooO0O0.OooO0oO).add(w91Var);
            oh1VarOooO0O0.OooO0OO();
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void OooO0o0() {
        oh1 oh1VarOooO0O0 = oh1.OooO0O0(this.OooO0Oo);
        w91 w91Var = this.OooO0o0;
        synchronized (oh1VarOooO0O0) {
            ((HashSet) oh1VarOooO0O0.OooO0oO).remove(w91Var);
            if (oh1VarOooO0O0.OooO0o0 && ((HashSet) oh1VarOooO0O0.OooO0oO).isEmpty()) {
                km kmVar = (km) oh1VarOooO0O0.OooO0o;
                ((ConnectivityManager) ((bj) kmVar.OooO0OO).get()).unregisterNetworkCallback((yw0) kmVar.OooO0Oo);
                oh1VarOooO0O0.OooO0o0 = false;
            }
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final void onDestroy() {
    }
}

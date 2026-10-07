package com.cmaster.cloner;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g02 {
    public static final String OooO0Oo = ep0.OooO("WorkConstraintsTracker");
    public final f02 OooO00o;
    public final sh[] OooO0O0;
    public final Object OooO0OO;

    public g02(Context context, zl1 zl1Var, f02 f02Var) {
        Context applicationContext = context.getApplicationContext();
        this.OooO00o = f02Var;
        this.OooO0O0 = new sh[]{new o7((p7) ho1.OooOoO(applicationContext, zl1Var).OooO0o0, 0), new o7((q7) ho1.OooOoO(applicationContext, zl1Var).OooO0o, 1), new o7((gj1) ho1.OooOoO(applicationContext, zl1Var).OooO0oo, 4), new o7((zw0) ho1.OooOoO(applicationContext, zl1Var).OooO0oO, 2), new o7((zw0) ho1.OooOoO(applicationContext, zl1Var).OooO0oO, 3), new ww0((zw0) ho1.OooOoO(applicationContext, zl1Var).OooO0oO), new vw0((zw0) ho1.OooOoO(applicationContext, zl1Var).OooO0oO)};
        this.OooO0OO = new Object();
    }

    public final boolean OooO00o(String str) {
        synchronized (this.OooO0OO) {
            try {
                for (sh shVar : this.OooO0O0) {
                    Object obj = shVar.OooO0O0;
                    if (obj != null && shVar.OooO0O0(obj) && shVar.OooO00o.contains(str)) {
                        ep0.OooO0oO().OooO0Oo(OooO0Oo, "Work " + str + " constrained by " + shVar.getClass().getSimpleName(), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0O0(Collection collection) {
        synchronized (this.OooO0OO) {
            try {
                for (sh shVar : this.OooO0O0) {
                    if (shVar.OooO0Oo != null) {
                        shVar.OooO0Oo = null;
                        shVar.OooO0Oo(null, shVar.OooO0O0);
                    }
                }
                for (sh shVar2 : this.OooO0O0) {
                    shVar2.OooO0OO(collection);
                }
                for (sh shVar3 : this.OooO0O0) {
                    if (shVar3.OooO0Oo != this) {
                        shVar3.OooO0Oo = this;
                        shVar3.OooO0Oo(this, shVar3.OooO0O0);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO() {
        synchronized (this.OooO0OO) {
            try {
                for (sh shVar : this.OooO0O0) {
                    ArrayList arrayList = shVar.OooO00o;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        shVar.OooO0OO.OooO0O0(shVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f70 extends zj implements ip {
    public final Handler OooO0o;
    public final boolean OooO0oO;
    public final f70 OooO0oo;

    public f70(Handler handler, boolean z) {
        this.OooO0o = handler;
        this.OooO0oO = z;
        this.OooO0oo = z ? this : new f70(handler, true);
    }

    @Override // com.cmaster.cloner.ip
    public final ks OooO0OO(long j, final gn1 gn1Var, vj vjVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.OooO0o.postDelayed(gn1Var, j)) {
            return new ks() { // from class: com.cmaster.cloner.e70
                @Override // com.cmaster.cloner.ks
                public final void OooO0OO() {
                    this.OooO0Oo.OooO0o.removeCallbacks(gn1Var);
                }
            };
        }
        OooOOoo(vjVar, gn1Var);
        return cx0.OooO0Oo;
    }

    @Override // com.cmaster.cloner.zj
    public final void OooOOOO(vj vjVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.OooO0o.post(runnable)) {
            return;
        }
        OooOOoo(vjVar, runnable);
    }

    @Override // com.cmaster.cloner.zj
    public final boolean OooOOo() {
        return (this.OooO0oO && ij0.OooO00o(Looper.myLooper(), this.OooO0o.getLooper())) ? false : true;
    }

    public final void OooOOoo(vj vjVar, Runnable runnable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ou2.OooO00o(vjVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        gs.OooO0O0.OooOOOO(vjVar, runnable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj;
        return f70Var.OooO0o == this.OooO0o && f70Var.OooO0oO == this.OooO0oO;
    }

    public final int hashCode() {
        return (this.OooO0oO ? 1231 : 1237) ^ System.identityHashCode(this.OooO0o);
    }

    @Override // com.cmaster.cloner.zj
    public final String toString() {
        f70 f70Var;
        String str;
        wo woVar = gs.OooO00o;
        f70 f70Var2 = pp0.OooO00o;
        if (this == f70Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                f70Var = f70Var2.OooO0oo;
            } catch (UnsupportedOperationException unused) {
                f70Var = null;
            }
            str = this == f70Var ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.OooO0o.toString();
        if (!this.OooO0oO) {
            return string;
        }
        return string + ".immediate";
    }
}

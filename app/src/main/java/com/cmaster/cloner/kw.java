package com.cmaster.cloner;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kw {
    public static final boolean OooO0oo = Log.isLoggable("Engine", 2);
    public final f91 OooO00o;
    public final v03 OooO0O0;
    public final op0 OooO0OO;
    public final t62 OooO0Oo;
    public final o00Oo00 OooO0o;
    public final v8 OooO0o0;
    public final ho1 OooO0oO;

    public kw(op0 op0Var, xb1 xb1Var, q50 q50Var, q50 q50Var2, q50 q50Var3, q50 q50Var4) {
        this.OooO0OO = op0Var;
        bj bjVar = new bj(xb1Var);
        ho1 ho1Var = new ho1(3);
        this.OooO0oO = ho1Var;
        synchronized (this) {
            synchronized (ho1Var) {
                ho1Var.OooO0oo = this;
            }
        }
        this.OooO0O0 = new v03();
        this.OooO00o = new f91(2);
        t62 t62Var = new t62();
        t62Var.OooOO0 = z52.OooO00o(150, new xb1(t62Var, 15));
        t62Var.OooO0Oo = q50Var;
        t62Var.OooO0o0 = q50Var2;
        t62Var.OooO0o = q50Var3;
        t62Var.OooO0oO = q50Var4;
        t62Var.OooO0oo = this;
        t62Var.OooO = this;
        this.OooO0Oo = t62Var;
        this.OooO0o = new o00Oo00(bjVar);
        this.OooO0o0 = new v8();
        op0Var.OooO0Oo = this;
    }

    public static void OooO0OO(String str, long j, pw pwVar) {
        Log.v("Engine", str + " in " + cp0.OooO00o(j) + "ms, key: " + pwVar);
    }

    public static void OooO0o(fa1 fa1Var) {
        if (fa1Var instanceof qw) {
            ((qw) fa1Var).OooO0OO();
        } else {
            ra.OooOOO("Cannot release anything but an EngineResource");
        }
    }

    public final a02 OooO00o(j50 j50Var, Object obj, zk0 zk0Var, int i, int i2, Class cls, Class cls2, t41 t41Var, vr vrVar, ea eaVar, boolean z, boolean z2, xz0 xz0Var, boolean z3, boolean z4, kh1 kh1Var, Executor executor) {
        long jElapsedRealtimeNanos;
        if (OooO0oo) {
            int i3 = cp0.OooO0O0;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.OooO0O0.getClass();
        pw pwVar = new pw(obj, zk0Var, i, i2, eaVar, cls, cls2, xz0Var);
        synchronized (this) {
            try {
                qw qwVarOooO0O0 = OooO0O0(pwVar, z3, jElapsedRealtimeNanos);
                if (qwVarOooO0O0 == null) {
                    return OooO0oO(j50Var, obj, zk0Var, i, i2, cls, cls2, t41Var, vrVar, eaVar, z, z2, xz0Var, z3, z4, kh1Var, executor, pwVar, jElapsedRealtimeNanos);
                }
                kh1Var.OooO(qwVarOooO0O0, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qw OooO0O0(pw pwVar, boolean z, long j) {
        qw qwVar;
        Object obj;
        kw kwVar;
        pw pwVar2;
        qw qwVar2;
        if (z) {
            ho1 ho1Var = this.OooO0oO;
            synchronized (ho1Var) {
                o00OOO0 o00ooo0 = (o00OOO0) ((HashMap) ho1Var.OooO0o).get(pwVar);
                if (o00ooo0 == null) {
                    qwVar = null;
                } else {
                    qwVar = (qw) o00ooo0.get();
                    if (qwVar == null) {
                        ho1Var.OooOOOO(o00ooo0);
                    }
                }
            }
            if (qwVar != null) {
                qwVar.OooO00o();
            }
            if (qwVar != null) {
                if (OooO0oo) {
                    OooO0OO("Loaded resource from active resources", j, pwVar);
                }
                return qwVar;
            }
            op0 op0Var = this.OooO0OO;
            synchronized (op0Var) {
                lp0 lp0Var = (lp0) op0Var.OooO00o.remove(pwVar);
                if (lp0Var == null) {
                    obj = null;
                } else {
                    op0Var.OooO0OO -= lp0Var.OooO0O0;
                    obj = lp0Var.OooO00o;
                }
            }
            fa1 fa1Var = (fa1) obj;
            if (fa1Var == null) {
                kwVar = this;
                pwVar2 = pwVar;
                qwVar2 = null;
            } else if (fa1Var instanceof qw) {
                qwVar2 = (qw) fa1Var;
                kwVar = this;
                pwVar2 = pwVar;
            } else {
                kwVar = this;
                pwVar2 = pwVar;
                qwVar2 = new qw(fa1Var, true, true, pwVar2, kwVar);
            }
            if (qwVar2 != null) {
                qwVar2.OooO00o();
                kwVar.OooO0oO.OooO0oo(pwVar2, qwVar2);
            }
            if (qwVar2 != null) {
                if (OooO0oo) {
                    OooO0OO("Loaded resource from cache", j, pwVar2);
                }
                return qwVar2;
            }
        }
        return null;
    }

    public final synchronized void OooO0Oo(ow owVar, pw pwVar, qw qwVar) {
        if (qwVar != null) {
            try {
                if (qwVar.OooO0Oo) {
                    this.OooO0oO.OooO0oo(pwVar, qwVar);
                }
            } finally {
            }
        }
        f91 f91Var = this.OooO00o;
        f91Var.getClass();
        owVar.getClass();
        HashMap map = f91Var.OooO00o;
        if (owVar == map.get(pwVar)) {
            map.remove(pwVar);
        }
    }

    public final void OooO0o0(zk0 zk0Var, qw qwVar) {
        ho1 ho1Var = this.OooO0oO;
        synchronized (ho1Var) {
            o00OOO0 o00ooo0 = (o00OOO0) ((HashMap) ho1Var.OooO0o).remove(zk0Var);
            if (o00ooo0 != null) {
                o00ooo0.OooO0OO = null;
                o00ooo0.clear();
            }
        }
        if (qwVar.OooO0Oo) {
        } else {
            this.OooO0o0.OooO0Oo(qwVar, false);
        }
    }

    public final a02 OooO0oO(j50 j50Var, Object obj, zk0 zk0Var, int i, int i2, Class cls, Class cls2, t41 t41Var, vr vrVar, Map map, boolean z, boolean z2, xz0 xz0Var, boolean z3, boolean z4, kh1 kh1Var, Executor executor, pw pwVar, long j) {
        ow owVar = (ow) this.OooO00o.OooO00o.get(pwVar);
        if (owVar != null) {
            owVar.OooO00o(kh1Var, executor);
            if (OooO0oo) {
                OooO0OO("Added to existing load", j, pwVar);
            }
            return new a02(this, kh1Var, owVar);
        }
        ow owVar2 = (ow) ((hx2) this.OooO0Oo.OooOO0).OooO0oo();
        synchronized (owVar2) {
            owVar2.OooOOO = pwVar;
            owVar2.OooOOOO = z3;
            owVar2.OooOOOo = z4;
        }
        o00Oo00 o00oo00 = this.OooO0o;
        vn vnVar = (vn) ((hx2) o00oo00.OooO0oO).OooO0oo();
        int i3 = o00oo00.OooO0o0;
        o00oo00.OooO0o0 = i3 + 1;
        tn tnVar = vnVar.OooO0Oo;
        bj bjVar = vnVar.OooO0oO;
        tnVar.OooO0OO = j50Var;
        tnVar.OooO0Oo = obj;
        tnVar.OooOOO = zk0Var;
        tnVar.OooO0o0 = i;
        tnVar.OooO0o = i2;
        tnVar.OooOOOo = vrVar;
        tnVar.OooO0oO = cls;
        tnVar.OooO0oo = bjVar;
        tnVar.OooOO0O = cls2;
        tnVar.OooOOOO = t41Var;
        tnVar.OooO = xz0Var;
        tnVar.OooOO0 = map;
        tnVar.OooOOo0 = z;
        tnVar.OooOOo = z2;
        vnVar.OooOO0O = j50Var;
        vnVar.OooOO0o = zk0Var;
        vnVar.OooOOO0 = t41Var;
        vnVar.OooOOO = pwVar;
        vnVar.OooOOOO = i;
        vnVar.OooOOOo = i2;
        vnVar.OooOOo0 = vrVar;
        vnVar.OooOOo = xz0Var;
        vnVar.OooOOoo = owVar2;
        vnVar.OooOo00 = i3;
        vnVar.Oooo00O = 1;
        vnVar.OooOo0O = obj;
        f91 f91Var = this.OooO00o;
        f91Var.getClass();
        f91Var.OooO00o.put(pwVar, owVar2);
        owVar2.OooO00o(kh1Var, executor);
        synchronized (owVar2) {
            owVar2.OooOo0o = vnVar;
            int iOooO0oo = vnVar.OooO0oo(1);
            ((iOooO0oo == 2 || iOooO0oo == 3) ? owVar2.OooOO0 : owVar2.OooOOOo ? owVar2.OooOO0o : owVar2.OooOO0O).execute(vnVar);
        }
        if (OooO0oo) {
            OooO0OO("Started new load", j, pwVar);
        }
        return new a02(this, kh1Var, owVar2);
    }
}

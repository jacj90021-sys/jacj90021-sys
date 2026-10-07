package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ao2 {
    public static hp OooO00o(dj djVar, e40 e40Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z = true;
        vj vjVarOooO00o = mp2.OooO00o(djVar.OooO00o(), lv.OooO0Oo, true);
        wo woVar = gs.OooO00o;
        if (vjVarOooO00o != woVar && vjVarOooO00o.OooO0oo(oOO0OO.OooO0o0) == null) {
            vjVarOooO00o = vjVarOooO00o.OooO(woVar);
        }
        hp hpVar = new hp(vjVarOooO00o, z, 0);
        hpVar.OoooO0O(ik.OooO0Oo, hpVar, e40Var);
        return hpVar;
    }

    public static final Object OooO0O0(vj vjVar, e40 e40Var) throws Throwable {
        xw xwVarOooO00o;
        vj vjVarOooO00o;
        Thread threadCurrentThread = Thread.currentThread();
        uj ujVar = oOO0OO.OooO0o0;
        zj zjVar = (zj) vjVar.OooO0oo(ujVar);
        lv lvVar = lv.OooO0Oo;
        if (zjVar == null) {
            xwVarOooO00o = vm1.OooO00o();
            vjVarOooO00o = mp2.OooO00o(lvVar, vjVar.OooO(xwVarOooO00o), true);
            wo woVar = gs.OooO00o;
            if (vjVarOooO00o != woVar && vjVarOooO00o.OooO0oo(ujVar) == null) {
                vjVarOooO00o = vjVarOooO00o.OooO(woVar);
            }
        } else {
            xwVarOooO00o = (xw) vm1.OooO00o.get();
            vjVarOooO00o = mp2.OooO00o(lvVar, vjVar, true);
            wo woVar2 = gs.OooO00o;
            if (vjVarOooO00o != woVar2 && vjVarOooO00o.OooO0oo(ujVar) == null) {
                vjVarOooO00o = vjVarOooO00o.OooO(woVar2);
            }
        }
        o8 o8Var = new o8(vjVarOooO00o, threadCurrentThread, xwVarOooO00o);
        o8Var.OoooO0O(ik.OooO0Oo, o8Var, e40Var);
        xw xwVar = o8Var.OooO0oo;
        if (xwVar != null) {
            int i = xw.OooO;
            xwVar.OooOo00(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jOooOo0 = xwVar != null ? xwVar.OooOo0() : Long.MAX_VALUE;
                if (!(o8Var.OooOoo0() instanceof bg0)) {
                    if (xwVar != null) {
                        int i2 = xw.OooO;
                        xwVar.OooOOoo(false);
                    }
                    Object objOooO00o = j62.OooO00o(o8Var.OooOoo0());
                    rf rfVar = objOooO00o instanceof rf ? (rf) objOooO00o : null;
                    if (rfVar == null) {
                        return objOooO00o;
                    }
                    throw rfVar.OooO00o;
                }
                LockSupport.parkNanos(o8Var, jOooOo0);
            } catch (Throwable th) {
                if (xwVar != null) {
                    int i3 = xw.OooO;
                    xwVar.OooOOoo(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        o8Var.OooOOOO(interruptedException);
        throw interruptedException;
    }

    public static final Object OooO0OO(vj vjVar, e40 e40Var, ch chVar) throws Throwable {
        vj vjVar2 = chVar.OooO0o0;
        vjVar2.getClass();
        vj vjVarOooO = !((Boolean) vjVar.OooO0o(Boolean.FALSE, wj.OooO0oO)).booleanValue() ? vjVar2.OooO(vjVar) : mp2.OooO00o(vjVar2, vjVar, false);
        nk0 nk0Var = (nk0) vjVarOooO.OooO0oo(gu0.OooO0o0);
        if (nk0Var != null && !nk0Var.Oooo00O()) {
            throw nk0Var.OooOo0O();
        }
        if (vjVarOooO == vjVar2) {
            td1 td1Var = new td1(vjVarOooO, chVar);
            return k53.OooO00o(td1Var, td1Var, e40Var);
        }
        oOO0OO ooo0oo = oOO0OO.OooO0o0;
        if (ij0.OooO00o(vjVarOooO.OooO0oo(ooo0oo), vjVar2.OooO0oo(ooo0oo))) {
            qq1 qq1Var = new qq1(vjVarOooO, chVar);
            vj vjVar3 = qq1Var.OooO0o;
            Object objOooO0O0 = w82.OooO0O0(vjVar3, null);
            try {
                return k53.OooO00o(qq1Var, qq1Var, e40Var);
            } finally {
                w82.OooO00o(vjVar3, objOooO0O0);
            }
        }
        ds dsVar = new ds(vjVarOooO, chVar);
        go2.OooO00o(e40Var, dsVar, dsVar);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ds.OooO0oo;
        do {
            int i = atomicIntegerFieldUpdater.get(dsVar);
            if (i != 0) {
                if (i != 2) {
                    qa.OooO0o("Already suspended");
                    return null;
                }
                Object objOooO00o = j62.OooO00o(dsVar.OooOoo0());
                if (objOooO00o instanceof rf) {
                    throw ((rf) objOooO00o).OooO00o;
                }
                return objOooO00o;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(dsVar, 0, 1));
        return gk.OooO0Oo;
    }
}

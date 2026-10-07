package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class nk0 implements tj {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0Oo = AtomicReferenceFieldUpdater.newUpdater(nk0.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o0 = AtomicReferenceFieldUpdater.newUpdater(nk0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public nk0(boolean z) {
        this._state$volatile = z ? j62.OooO0oO : j62.OooO0o;
    }

    public static rc Oooo0OO(vo0 vo0Var) {
        while (vo0Var.OooOO0()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vo0.OooO0o0;
            vo0 vo0VarOooO0o = vo0Var.OooO0o();
            if (vo0VarOooO0o == null) {
                Object obj = atomicReferenceFieldUpdater.get(vo0Var);
                while (true) {
                    vo0Var = (vo0) obj;
                    if (!vo0Var.OooOO0()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(vo0Var);
                }
            } else {
                vo0Var = vo0VarOooO0o;
            }
        }
        while (true) {
            vo0Var = vo0Var.OooO();
            if (!vo0Var.OooOO0()) {
                if (vo0Var instanceof rc) {
                    return (rc) vo0Var;
                }
                if (vo0Var instanceof bx0) {
                    return null;
                }
            }
        }
    }

    public static String OoooO00(Object obj) {
        if (!(obj instanceof lk0)) {
            return obj instanceof bg0 ? ((bg0) obj).OooO0Oo() ? "Active" : "New" : obj instanceof rf ? "Cancelled" : "Completed";
        }
        lk0 lk0Var = (lk0) obj;
        return lk0Var.OooO0o0() ? "Cancelling" : lk0Var.OooO0o() ? "Completing" : "Active";
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooO(vj vjVar) {
        return kp2.OooO0OO(this, vjVar);
    }

    public final boolean OooO0O0(bg0 bg0Var, bx0 bx0Var, gk0 gk0Var) {
        vo0 vo0VarOooO0o;
        mk0 mk0Var = new mk0(gk0Var, this, bg0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = vo0.OooO0o0;
            vo0VarOooO0o = bx0Var.OooO0o();
            if (vo0VarOooO0o == null) {
                Object obj = atomicReferenceFieldUpdater.get(bx0Var);
                while (true) {
                    vo0VarOooO0o = (vo0) obj;
                    if (!vo0VarOooO0o.OooOO0()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(vo0VarOooO0o);
                }
            }
            vo0.OooO0o0.set(gk0Var, vo0VarOooO0o);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vo0.OooO0Oo;
            atomicReferenceFieldUpdater2.set(gk0Var, bx0Var);
            mk0Var.OooO0OO = bx0Var;
            while (!atomicReferenceFieldUpdater2.compareAndSet(vo0VarOooO0o, bx0Var, mk0Var)) {
                if (atomicReferenceFieldUpdater2.get(vo0VarOooO0o) != bx0Var) {
                    break;
                }
            }
        }
        return mk0Var.OooO0O0(vo0VarOooO0o) == null;
    }

    @Override // com.cmaster.cloner.vj
    public final Object OooO0o(Object obj, e40 e40Var) {
        return e40Var.OooO0oO(obj, this);
    }

    public void OooO0oO(Object obj) {
    }

    @Override // com.cmaster.cloner.vj
    public final tj OooO0oo(uj ujVar) {
        return kp2.OooO00o(this, ujVar);
    }

    public void OooOO0o(Object obj) {
        OooO0oO(obj);
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooOOO(uj ujVar) {
        return kp2.OooO0O0(this, ujVar);
    }

    public final void OooOOO0(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new ck0(OooOOo0(), null, this);
        }
        OooOOOO(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0059, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v9 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOOO(java.lang.Object r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.nk0.OooOOOO(java.lang.Object):boolean");
    }

    public final boolean OooOOOo(Throwable th) {
        if (Oooo00o()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        qc qcVar = (qc) OooO0o0.get(this);
        return (qcVar == null || qcVar == cx0.OooO0Oo) ? z : qcVar.OooO00o(th) || z;
    }

    public boolean OooOOo(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return OooOOOO(th) && OooOoO0();
    }

    public String OooOOo0() {
        return "Job was cancelled";
    }

    public final void OooOOoo(bg0 bg0Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o0;
        qc qcVar = (qc) atomicReferenceFieldUpdater.get(this);
        if (qcVar != null) {
            qcVar.OooO0OO();
            atomicReferenceFieldUpdater.set(this, cx0.OooO0Oo);
        }
        tf tfVar = null;
        rf rfVar = obj instanceof rf ? (rf) obj : null;
        Throwable th = rfVar != null ? rfVar.OooO00o : null;
        if (bg0Var instanceof gk0) {
            try {
                ((gk0) bg0Var).OooO0o0(th);
                return;
            } catch (Throwable th2) {
                OooOooO(new tf("Exception in completion handler " + bg0Var + " for " + this, th2));
                return;
            }
        }
        bx0 bx0VarOooO0O0 = bg0Var.OooO0O0();
        if (bx0VarOooO0O0 != null) {
            Object objOooO0oo = bx0VarOooO0O0.OooO0oo();
            objOooO0oo.getClass();
            for (vo0 vo0VarOooO = (vo0) objOooO0oo; !vo0VarOooO.equals(bx0VarOooO0O0); vo0VarOooO = vo0VarOooO.OooO()) {
                if (vo0VarOooO instanceof gk0) {
                    gk0 gk0Var = (gk0) vo0VarOooO;
                    try {
                        gk0Var.OooO0o0(th);
                    } catch (Throwable th3) {
                        if (tfVar != null) {
                            fr2.OooO00o(tfVar, th3);
                        } else {
                            tfVar = new tf("Exception in completion handler " + gk0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (tfVar != null) {
                OooOooO(tfVar);
            }
        }
    }

    public final Throwable OooOo(lk0 lk0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (lk0Var.OooO0o0()) {
                return new ck0(OooOOo0(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i2);
            i2++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof fn1) {
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof fn1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final Object OooOo0(lk0 lk0Var, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thOooOo;
        rf rfVar = obj instanceof rf ? (rf) obj : null;
        Throwable th = rfVar != null ? rfVar.OooO00o : null;
        synchronized (lk0Var) {
            lk0Var.OooO0o0();
            ArrayList arrayListOooO0oO = lk0Var.OooO0oO(th);
            thOooOo = OooOo(lk0Var, arrayListOooO0oO);
            if (thOooOo != null && arrayListOooO0oO.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListOooO0oO.size()));
                int size = arrayListOooO0oO.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListOooO0oO.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thOooOo && th2 != thOooOo && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        fr2.OooO00o(thOooOo, th2);
                    }
                }
            }
        }
        if (thOooOo != null && thOooOo != th) {
            obj = new rf(false, thOooOo);
        }
        if (thOooOo != null && (OooOOOo(thOooOo) || OooOoo(thOooOo))) {
            obj.getClass();
            rf.OooO0O0.compareAndSet((rf) obj, 0, 1);
        }
        Oooo0o(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0Oo;
        Object cg0Var = obj instanceof bg0 ? new cg0((bg0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, lk0Var, cg0Var) && atomicReferenceFieldUpdater.get(this) == lk0Var) {
        }
        OooOOoo(lk0Var, obj);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable] */
    public final Throwable OooOo00(Object obj) {
        CancellationException cancellationExceptionOooO0OO;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        nk0 nk0Var = (nk0) obj;
        Object objOooOoo0 = nk0Var.OooOoo0();
        if (objOooOoo0 instanceof lk0) {
            cancellationExceptionOooO0OO = ((lk0) objOooOoo0).OooO0OO();
        } else if (objOooOoo0 instanceof rf) {
            cancellationExceptionOooO0OO = ((rf) objOooOoo0).OooO00o;
        } else {
            if (objOooOoo0 instanceof bg0) {
                qa.OooO0Oo(objOooOoo0, "Cannot be cancelling child in this state: ");
                return null;
            }
            cancellationExceptionOooO0OO = null;
        }
        CancellationException cancellationException = cancellationExceptionOooO0OO instanceof CancellationException ? cancellationExceptionOooO0OO : null;
        return cancellationException == null ? new ck0("Parent job is ".concat(OoooO00(objOooOoo0)), cancellationExceptionOooO0OO, nk0Var) : cancellationException;
    }

    public final CancellationException OooOo0O() {
        CancellationException cancellationException;
        Object objOooOoo0 = OooOoo0();
        if (objOooOoo0 instanceof lk0) {
            Throwable thOooO0OO = ((lk0) objOooOoo0).OooO0OO();
            if (thOooO0OO == null) {
                qa.OooO0Oo(this, "Job is still new or active: ");
                return null;
            }
            String strConcat = getClass().getSimpleName().concat(" is cancelling");
            cancellationException = thOooO0OO instanceof CancellationException ? (CancellationException) thOooO0OO : null;
            return cancellationException == null ? new ck0(strConcat, thOooO0OO, this) : cancellationException;
        }
        if (objOooOoo0 instanceof bg0) {
            qa.OooO0Oo(this, "Job is still new or active: ");
            return null;
        }
        if (!(objOooOoo0 instanceof rf)) {
            return new ck0(getClass().getSimpleName().concat(" has completed normally"), null, this);
        }
        Throwable th = ((rf) objOooOoo0).OooO00o;
        cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new ck0(OooOOo0(), th, this) : cancellationException;
    }

    public final Object OooOo0o() throws Throwable {
        Object objOooOoo0 = OooOoo0();
        if (objOooOoo0 instanceof bg0) {
            qa.OooO0o("This job has not completed yet");
            return null;
        }
        if (objOooOoo0 instanceof rf) {
            throw ((rf) objOooOoo0).OooO00o;
        }
        return j62.OooO00o(objOooOoo0);
    }

    public boolean OooOoO() {
        return this instanceof of;
    }

    public boolean OooOoO0() {
        return true;
    }

    public final bx0 OooOoOO(bg0 bg0Var) {
        bx0 bx0VarOooO0O0 = bg0Var.OooO0O0();
        if (bx0VarOooO0O0 != null) {
            return bx0VarOooO0O0;
        }
        if (bg0Var instanceof jv) {
            return new bx0();
        }
        if (bg0Var instanceof gk0) {
            Oooo0oo((gk0) bg0Var);
            return null;
        }
        qa.OooO0Oo(bg0Var, "State should have list: ");
        return null;
    }

    public boolean OooOoo(Throwable th) {
        return false;
    }

    public final Object OooOoo0() {
        while (true) {
            Object obj = OooO0Oo.get(this);
            if (!(obj instanceof x3)) {
                return obj;
            }
            ((x3) obj).OooO0O0(this);
        }
    }

    public void OooOooO(tf tfVar) {
        throw tfVar;
    }

    public final void OooOooo(nk0 nk0Var) {
        int iOooo;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0o0;
        cx0 cx0Var = cx0.OooO0Oo;
        if (nk0Var == null) {
            atomicReferenceFieldUpdater.set(this, cx0Var);
            return;
        }
        do {
            iOooo = nk0Var.Oooo(nk0Var.OooOoo0());
            if (iOooo == 0) {
                break;
            }
        } while (iOooo != 1);
        qc qcVar = (qc) ou2.OooO0O0(nk0Var, true, new rc(this), 2);
        atomicReferenceFieldUpdater.set(this, qcVar);
        if (OooOoo0() instanceof bg0) {
            return;
        }
        qcVar.OooO0OO();
        atomicReferenceFieldUpdater.set(this, cx0Var);
    }

    public final int Oooo(Object obj) {
        boolean z = obj instanceof jv;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0Oo;
        if (z) {
            if (((jv) obj).OooO0Oo) {
                return 0;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, j62.OooO0oO)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof ag0)) {
            return 0;
        }
        bx0 bx0Var = ((ag0) obj).OooO0Oo;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bx0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object Oooo0(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objOoooO0;
        do {
            objOoooO0 = OoooO0(OooOoo0(), obj);
            if (objOoooO0 == j62.OooO00o) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                rf rfVar = obj instanceof rf ? (rf) obj : null;
                throw new IllegalStateException(str, rfVar != null ? rfVar.OooO00o : null);
            }
        } while (objOoooO0 == j62.OooO0OO);
        return objOoooO0;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.ks Oooo000(boolean r9, boolean r10, com.cmaster.cloner.fj0 r11) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.nk0.Oooo000(boolean, boolean, com.cmaster.cloner.fj0):com.cmaster.cloner.ks");
    }

    public boolean Oooo00O() {
        Object objOooOoo0 = OooOoo0();
        return (objOooOoo0 instanceof bg0) && ((bg0) objOooOoo0).OooO0Oo();
    }

    public boolean Oooo00o() {
        return this instanceof o8;
    }

    public String Oooo0O0() {
        return getClass().getSimpleName();
    }

    public void Oooo0o(Object obj) {
    }

    public final void Oooo0o0(bx0 bx0Var, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objOooO0oo = bx0Var.OooO0oo();
        objOooO0oo.getClass();
        tf tfVar = null;
        for (vo0 vo0VarOooO = (vo0) objOooO0oo; !vo0VarOooO.equals(bx0Var); vo0VarOooO = vo0VarOooO.OooO()) {
            if (vo0VarOooO instanceof dk0) {
                gk0 gk0Var = (gk0) vo0VarOooO;
                try {
                    gk0Var.OooO0o0(th);
                } catch (Throwable th2) {
                    if (tfVar != null) {
                        fr2.OooO00o(tfVar, th2);
                    } else {
                        tfVar = new tf("Exception in completion handler " + gk0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (tfVar != null) {
            OooOooO(tfVar);
        }
        OooOOOo(th);
    }

    public void Oooo0oO() {
    }

    public final void Oooo0oo(gk0 gk0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        bx0 bx0Var = new bx0();
        gk0Var.getClass();
        vo0.OooO0o0.set(bx0Var, gk0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = vo0.OooO0Oo;
        atomicReferenceFieldUpdater2.set(bx0Var, gk0Var);
        loop0: while (true) {
            if (gk0Var.OooO0oo() == gk0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(gk0Var, gk0Var, bx0Var)) {
                    if (atomicReferenceFieldUpdater2.get(gk0Var) != gk0Var) {
                        break;
                    }
                }
                bx0Var.OooO0oO(gk0Var);
                break loop0;
            }
            break;
        }
        vo0 vo0VarOooO = gk0Var.OooO();
        do {
            atomicReferenceFieldUpdater = OooO0Oo;
            if (atomicReferenceFieldUpdater.compareAndSet(this, gk0Var, vo0VarOooO)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == gk0Var);
    }

    public final Object OoooO0(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!(obj instanceof bg0)) {
            return j62.OooO00o;
        }
        if (((obj instanceof jv) || (obj instanceof gk0)) && !(obj instanceof rc) && !(obj2 instanceof rf)) {
            bg0 bg0Var = (bg0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0Oo;
            Object cg0Var = obj2 instanceof bg0 ? new cg0((bg0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, bg0Var, cg0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != bg0Var) {
                    return j62.OooO0OO;
                }
            }
            Oooo0o(obj2);
            OooOOoo(bg0Var, obj2);
            return obj2;
        }
        bg0 bg0Var2 = (bg0) obj;
        bx0 bx0VarOooOoOO = OooOoOO(bg0Var2);
        if (bx0VarOooOoOO == null) {
            return j62.OooO0OO;
        }
        rc rcVarOooo0OO = null;
        lk0 lk0Var = bg0Var2 instanceof lk0 ? (lk0) bg0Var2 : null;
        if (lk0Var == null) {
            lk0Var = new lk0(bx0VarOooOoOO, null);
        }
        synchronized (lk0Var) {
            if (lk0Var.OooO0o()) {
                return j62.OooO00o;
            }
            lk0.OooO0o0.set(lk0Var, 1);
            if (lk0Var != bg0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooO0Oo;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, bg0Var2, lk0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != bg0Var2) {
                        return j62.OooO0OO;
                    }
                }
            }
            boolean zOooO0o0 = lk0Var.OooO0o0();
            rf rfVar = obj2 instanceof rf ? (rf) obj2 : null;
            if (rfVar != null) {
                lk0Var.OooO00o(rfVar.OooO00o);
            }
            Throwable thOooO0OO = lk0Var.OooO0OO();
            if (zOooO0o0) {
                thOooO0OO = null;
            }
            if (thOooO0OO != null) {
                Oooo0o0(bx0VarOooOoOO, thOooO0OO);
            }
            rc rcVar = bg0Var2 instanceof rc ? (rc) bg0Var2 : null;
            if (rcVar == null) {
                bx0 bx0VarOooO0O0 = bg0Var2.OooO0O0();
                if (bx0VarOooO0O0 != null) {
                    rcVarOooo0OO = Oooo0OO(bx0VarOooO0O0);
                }
            } else {
                rcVarOooo0OO = rcVar;
            }
            if (rcVarOooo0OO != null) {
                while (ou2.OooO0O0(rcVarOooo0OO.OooO0oo, false, new kk0(this, lk0Var, rcVarOooo0OO, obj2), 1) == cx0.OooO0Oo) {
                    rcVarOooo0OO = Oooo0OO(rcVarOooo0OO);
                    if (rcVarOooo0OO == null) {
                    }
                }
                return j62.OooO0O0;
            }
            return OooOo0(lk0Var, obj2);
        }
    }

    @Override // com.cmaster.cloner.tj
    public final uj getKey() {
        return gu0.OooO0o0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Oooo0O0() + '{' + OoooO00(OooOoo0()) + '}');
        sb.append('@');
        sb.append(rn.OooO00o(this));
        return sb.toString();
    }
}

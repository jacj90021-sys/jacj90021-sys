package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lk0 implements bg0 {
    public final bx0 OooO0Oo;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public static final /* synthetic */ AtomicIntegerFieldUpdater OooO0o0 = AtomicIntegerFieldUpdater.newUpdater(lk0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0o = AtomicReferenceFieldUpdater.newUpdater(lk0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0oO = AtomicReferenceFieldUpdater.newUpdater(lk0.class, Object.class, "_exceptionsHolder$volatile");

    public lk0(bx0 bx0Var, Throwable th) {
        this.OooO0Oo = bx0Var;
        this._rootCause$volatile = th;
    }

    public final void OooO00o(Throwable th) {
        Throwable thOooO0OO = OooO0OO();
        if (thOooO0OO == null) {
            OooO0o.set(this, th);
            return;
        }
        if (th == thOooO0OO) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0oO;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                qa.OooO0Oo(obj, "State is ");
                return;
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // com.cmaster.cloner.bg0
    public final bx0 OooO0O0() {
        return this.OooO0Oo;
    }

    public final Throwable OooO0OO() {
        return (Throwable) OooO0o.get(this);
    }

    @Override // com.cmaster.cloner.bg0
    public final boolean OooO0Oo() {
        return OooO0OO() == null;
    }

    public final boolean OooO0o() {
        return OooO0o0.get(this) != 0;
    }

    public final boolean OooO0o0() {
        return OooO0OO() != null;
    }

    public final ArrayList OooO0oO(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO0oO;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                qa.OooO0Oo(obj, "State is ");
                return null;
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thOooO0OO = OooO0OO();
        if (thOooO0OO != null) {
            arrayList.add(0, thOooO0OO);
        }
        if (th != null && !th.equals(thOooO0OO)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, j62.OooO0o0);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + OooO0o0() + ", completing=" + OooO0o() + ", rootCause=" + OooO0OO() + ", exceptions=" + OooO0oO.get(this) + ", list=" + this.OooO0Oo + ']';
    }
}

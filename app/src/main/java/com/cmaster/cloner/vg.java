package com.cmaster.cloner;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vg {
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO00o = AtomicReferenceFieldUpdater.newUpdater(vg.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater OooO0O0 = AtomicReferenceFieldUpdater.newUpdater(vg.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public vg(re1 re1Var) {
        this._prev$volatile = re1Var;
    }

    public abstract boolean OooO00o();

    public final void OooO0O0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OooO00o;
        Object obj = atomicReferenceFieldUpdater.get(this);
        uk1 uk1Var = r80.OooO00o;
        if ((obj == uk1Var ? null : (vg) obj) == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OooO0O0;
            vg vgVar = (vg) atomicReferenceFieldUpdater2.get(this);
            while (vgVar != null && vgVar.OooO00o()) {
                vgVar = (vg) atomicReferenceFieldUpdater2.get(vgVar);
            }
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            vg vgVar2 = obj2 == uk1Var ? null : (vg) obj2;
            vgVar2.getClass();
            while (vgVar2.OooO00o()) {
                Object obj3 = atomicReferenceFieldUpdater.get(vgVar2);
                vg vgVar3 = obj3 == uk1Var ? null : (vg) obj3;
                if (vgVar3 == null) {
                    break;
                } else {
                    vgVar2 = vgVar3;
                }
            }
            while (true) {
                Object obj4 = atomicReferenceFieldUpdater2.get(vgVar2);
                vg vgVar4 = ((vg) obj4) == null ? null : vgVar;
                while (!atomicReferenceFieldUpdater2.compareAndSet(vgVar2, obj4, vgVar4)) {
                    if (atomicReferenceFieldUpdater2.get(vgVar2) != obj4) {
                        break;
                    }
                }
            }
            if (vgVar != null) {
                atomicReferenceFieldUpdater.set(vgVar, vgVar2);
            }
            if (vgVar2.OooO00o()) {
                Object obj5 = atomicReferenceFieldUpdater.get(vgVar2);
                if ((obj5 == uk1Var ? null : (vg) obj5) != null) {
                    continue;
                }
            }
            if (vgVar == null || !vgVar.OooO00o()) {
                return;
            }
        }
    }
}

package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zw implements Runnable, Comparable, ks {
    public long OooO0Oo;
    public int OooO0o0;
    private volatile Object _heap;

    public final int OooO0O0(long j, ax axVar, bx bxVar) {
        synchronized (this) {
            if (this._heap == q52.OooO00o) {
                return 2;
            }
            synchronized (axVar) {
                try {
                    zw[] zwVarArr = axVar.OooO00o;
                    zw zwVar = zwVarArr != null ? zwVarArr[0] : null;
                    if (bx.OooOO0o.get(bxVar) != 0) {
                        return 1;
                    }
                    if (zwVar == null) {
                        axVar.OooO0OO = j;
                    } else {
                        long j2 = zwVar.OooO0Oo;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - axVar.OooO0OO > 0) {
                            axVar.OooO0OO = j;
                        }
                    }
                    long j3 = this.OooO0Oo;
                    long j4 = axVar.OooO0OO;
                    if (j3 - j4 < 0) {
                        this.OooO0Oo = j4;
                    }
                    axVar.OooO00o(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.cmaster.cloner.ks
    public final void OooO0OO() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                uk1 uk1Var = q52.OooO00o;
                if (obj == uk1Var) {
                    return;
                }
                ax axVar = obj instanceof ax ? (ax) obj : null;
                if (axVar != null) {
                    synchronized (axVar) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof xm1 ? (xm1) obj2 : null) != null) {
                            axVar.OooO0O0(this.OooO0o0);
                        }
                    }
                }
                this._heap = uk1Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0Oo(ax axVar) {
        if (this._heap != q52.OooO00o) {
            this._heap = axVar;
        } else {
            ra.OooOOO("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.OooO0Oo - ((zw) obj).OooO0Oo;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    public String toString() {
        return "Delayed[nanos=" + this.OooO0Oo + ']';
    }
}

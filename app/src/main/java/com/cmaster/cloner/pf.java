package com.cmaster.cloner;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pf {
    public final Object OooO00o;
    public final ls OooO0O0;
    public final a40 OooO0OO;
    public final Object OooO0Oo;
    public final Throwable OooO0o0;

    public /* synthetic */ pf(Object obj, ls lsVar, a40 a40Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : lsVar, (i & 4) != 0 ? null : a40Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static pf OooO00o(pf pfVar, ls lsVar, CancellationException cancellationException, int i) {
        Object obj = pfVar.OooO00o;
        if ((i & 2) != 0) {
            lsVar = pfVar.OooO0O0;
        }
        ls lsVar2 = lsVar;
        a40 a40Var = pfVar.OooO0OO;
        Object obj2 = pfVar.OooO0Oo;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = pfVar.OooO0o0;
        }
        return new pf(obj, lsVar2, a40Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return ij0.OooO00o(this.OooO00o, pfVar.OooO00o) && ij0.OooO00o(this.OooO0O0, pfVar.OooO0O0) && ij0.OooO00o(this.OooO0OO, pfVar.OooO0OO) && ij0.OooO00o(this.OooO0Oo, pfVar.OooO0Oo) && ij0.OooO00o(this.OooO0o0, pfVar.OooO0o0);
    }

    public final int hashCode() {
        Object obj = this.OooO00o;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        ls lsVar = this.OooO0O0;
        int iHashCode2 = (iHashCode + (lsVar == null ? 0 : lsVar.hashCode())) * 31;
        a40 a40Var = this.OooO0OO;
        int iHashCode3 = (iHashCode2 + (a40Var == null ? 0 : a40Var.hashCode())) * 31;
        Object obj2 = this.OooO0Oo;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.OooO0o0;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.OooO00o + ", cancelHandler=" + this.OooO0O0 + ", onCancellation=" + this.OooO0OO + ", idempotentResume=" + this.OooO0Oo + ", cancelCause=" + this.OooO0o0 + ')';
    }

    public pf(Object obj, ls lsVar, a40 a40Var, Object obj2, Throwable th) {
        this.OooO00o = obj;
        this.OooO0O0 = lsVar;
        this.OooO0OO = a40Var;
        this.OooO0Oo = obj2;
        this.OooO0o0 = th;
    }
}

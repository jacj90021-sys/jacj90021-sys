package com.cmaster.cloner;

import android.database.SQLException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mp1 extends sk1 implements e40 {
    public int OooO;
    public final /* synthetic */ int OooO0oo;
    public /* synthetic */ Object OooOO0;
    public final /* synthetic */ rp1 OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mp1(rp1 rp1Var, gj gjVar, int i) {
        super(gjVar);
        this.OooO0oo = i;
        this.OooOO0O = rp1Var;
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        lo1 lo1Var;
        Object objOooO0O0;
        Object objOooO0Oo;
        lo1 lo1Var2;
        Object objOooO0O02;
        hy0[] hy0VarArr;
        hy0 hy0Var;
        int i = this.OooO0oo;
        ko1 ko1Var = ko1.OooO0o0;
        boolean z = false;
        gk gkVar = gk.OooO0Oo;
        boolean z2 = true;
        rp1 rp1Var = this.OooOO0O;
        gj gjVar = null;
        switch (i) {
            case 0:
                int i2 = this.OooO;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ty2.OooO0O0(obj);
                        return obj;
                    }
                    qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty2.OooO0O0(obj);
                j31 j31Var = (j31) this.OooOO0;
                this.OooO = 1;
                Object objOooO00o = rp1.OooO00o(rp1Var, j31Var, this);
                return objOooO00o == gkVar ? gkVar : objOooO00o;
            case 1:
                int i3 = this.OooO;
                try {
                    if (i3 == 0) {
                        ty2.OooO0O0(obj);
                        lo1Var = (lo1) this.OooOO0;
                        this.OooOO0 = lo1Var;
                        this.OooO = 1;
                        objOooO0O0 = lo1Var.OooO0O0(this);
                        if (objOooO0O0 == gkVar) {
                            return gkVar;
                        }
                    } else {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ty2.OooO0O0(obj);
                            objOooO0Oo = obj;
                            return (Set) objOooO0Oo;
                        }
                        lo1Var = (lo1) this.OooOO0;
                        ty2.OooO0O0(obj);
                        objOooO0O0 = obj;
                    }
                    if (!((Boolean) objOooO0O0).booleanValue()) {
                        mp1 mp1Var = new mp1(rp1Var, gjVar, 0);
                        this.OooOO0 = null;
                        this.OooO = 2;
                        objOooO0Oo = lo1Var.OooO0Oo(ko1Var, mp1Var, this);
                        if (objOooO0Oo == gkVar) {
                            return gkVar;
                        }
                        return (Set) objOooO0Oo;
                    }
                } catch (SQLException unused) {
                }
                return qv.OooO0Oo;
            default:
                int i4 = this.OooO;
                vq1 vq1Var = vq1.OooO00o;
                if (i4 == 0) {
                    ty2.OooO0O0(obj);
                    lo1Var2 = (lo1) this.OooOO0;
                    this.OooOO0 = lo1Var2;
                    this.OooO = 1;
                    objOooO0O02 = lo1Var2.OooO0O0(this);
                    if (objOooO0O02 == gkVar) {
                        return gkVar;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ty2.OooO0O0(obj);
                            return vq1Var;
                        }
                        qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lo1Var2 = (lo1) this.OooOO0;
                    ty2.OooO0O0(obj);
                    objOooO0O02 = obj;
                }
                if (!((Boolean) objOooO0O02).booleanValue()) {
                    km kmVar = (km) rp1Var.OooO0oO;
                    long[] jArr = (long[]) kmVar.OooO0OO;
                    ReentrantLock reentrantLock = (ReentrantLock) kmVar.OooO0O0;
                    reentrantLock.lock();
                    try {
                        if (kmVar.OooO00o) {
                            kmVar.OooO00o = false;
                            int length = jArr.length;
                            hy0VarArr = new hy0[length];
                            int i5 = 0;
                            boolean z3 = false;
                            while (i5 < length) {
                                if (jArr[i5] > 0) {
                                    z = z2;
                                }
                                boolean[] zArr = (boolean[]) kmVar.OooO0Oo;
                                if (z != zArr[i5]) {
                                    zArr[i5] = z;
                                    hy0Var = z ? hy0.OooO0o0 : hy0.OooO0o;
                                    z3 = true;
                                } else {
                                    hy0Var = hy0.OooO0Oo;
                                }
                                hy0VarArr[i5] = hy0Var;
                                i5++;
                                z = false;
                                z2 = true;
                            }
                            if (!z3) {
                                hy0VarArr = null;
                            }
                            reentrantLock.unlock();
                        } else {
                            reentrantLock.unlock();
                            hy0VarArr = null;
                        }
                        if (hy0VarArr != null) {
                            qp1 qp1Var = new qp1(hy0VarArr, rp1Var, lo1Var2, null);
                            this.OooOO0 = null;
                            this.OooO = 2;
                            if (lo1Var2.OooO0Oo(ko1Var, qp1Var, this) == gkVar) {
                                return gkVar;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                return vq1Var;
        }
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        int i = this.OooO0oo;
        vq1 vq1Var = vq1.OooO00o;
        switch (i) {
            case 0:
                return ((mp1) OooO0oo((gj) obj2, (j31) obj)).OooO(vq1Var);
            case 1:
                return ((mp1) OooO0oo((gj) obj2, (lo1) obj)).OooO(vq1Var);
            default:
                return ((mp1) OooO0oo((gj) obj2, (lo1) obj)).OooO(vq1Var);
        }
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        int i = this.OooO0oo;
        rp1 rp1Var = this.OooOO0O;
        switch (i) {
            case 0:
                mp1 mp1Var = new mp1(rp1Var, gjVar, 0);
                mp1Var.OooOO0 = obj;
                return mp1Var;
            case 1:
                mp1 mp1Var2 = new mp1(rp1Var, gjVar, 1);
                mp1Var2.OooOO0 = obj;
                return mp1Var2;
            default:
                mp1 mp1Var3 = new mp1(rp1Var, gjVar, 2);
                mp1Var3.OooOO0 = obj;
                return mp1Var3;
        }
    }
}

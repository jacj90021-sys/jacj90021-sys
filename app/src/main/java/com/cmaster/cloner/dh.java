package com.cmaster.cloner;

import android.net.Uri;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dh extends sk1 implements e40 {
    public int OooO;
    public final /* synthetic */ int OooO0oo;
    public final /* synthetic */ Object OooOO0;
    public final /* synthetic */ Object OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dh(Object obj, Object obj2, gj gjVar, int i) {
        super(gjVar);
        this.OooO0oo = i;
        this.OooOO0 = obj;
        this.OooOO0O = obj2;
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        int i = this.OooO0oo;
        vq1 vq1Var = vq1.OooO00o;
        Object obj2 = this.OooOO0;
        gk gkVar = gk.OooO0Oo;
        Object obj3 = this.OooOO0O;
        switch (i) {
            case 0:
                int i2 = this.OooO;
                if (i2 == 0) {
                    ty2.OooO0O0(obj);
                    this.OooO = 1;
                    Object objOooO0oO = ((e40) obj2).OooO0oO((p31) obj3, this);
                    return objOooO0oO == gkVar ? gkVar : objOooO0oO;
                }
                if (i2 == 1) {
                    ty2.OooO0O0(obj);
                    return obj;
                }
                qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                int i3 = this.OooO;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ty2.OooO0O0(obj);
                        return obj;
                    }
                    qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty2.OooO0O0(obj);
                Object obj4 = ((k81) obj3).OooO0Oo;
                this.OooO = 1;
                Object objOooO0oO2 = ((e40) obj2).OooO0oO(obj4, this);
                return objOooO0oO2 == gkVar ? gkVar : objOooO0oO2;
            case 2:
                int i4 = this.OooO;
                if (i4 == 0) {
                    ty2.OooO0O0(obj);
                    this.OooO = 1;
                    return ((or0) obj2).OooO00o.OooO0Oo((Uri) obj3, this) == gkVar ? gkVar : vq1Var;
                }
                if (i4 == 1) {
                    ty2.OooO0O0(obj);
                    return vq1Var;
                }
                qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                int i5 = this.OooO;
                if (i5 == 0) {
                    ty2.OooO0O0(obj);
                    this.OooO = 1;
                    Object objOooO0O0 = ((bo1) obj2).OooO00o.OooO0O0((v40) obj3, this);
                    return objOooO0O0 == gkVar ? gkVar : objOooO0O0;
                }
                if (i5 == 1) {
                    ty2.OooO0O0(obj);
                    return obj;
                }
                qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                p30 p30Var = (p30) obj3;
                int i6 = this.OooO;
                try {
                    if (i6 == 0) {
                        ty2.OooO0O0(obj);
                        this.OooO = 1;
                        obj = rp1.OooO0O0((rp1) obj2, this);
                        if (obj == gkVar) {
                            return gkVar;
                        }
                    } else {
                        if (i6 != 1) {
                            qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ty2.OooO0O0(obj);
                    }
                    return vq1Var;
                } finally {
                    p30Var.OooO00o();
                }
        }
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        int i = this.OooO0oo;
        vq1 vq1Var = vq1.OooO00o;
        fk fkVar = (fk) obj;
        gj gjVar = (gj) obj2;
        switch (i) {
        }
        return ((dh) OooO0oo(gjVar, fkVar)).OooO(vq1Var);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        int i = this.OooO0oo;
        Object obj2 = this.OooOO0O;
        Object obj3 = this.OooOO0;
        switch (i) {
            case 0:
                return new dh((e40) obj3, (p31) obj2, gjVar, 0);
            case 1:
                return new dh((e40) obj3, (k81) obj2, gjVar, 1);
            case 2:
                return new dh((or0) obj3, (Uri) obj2, gjVar, 2);
            case 3:
                return new dh((bo1) obj3, (v40) obj2, gjVar, 3);
            default:
                return new dh((rp1) obj3, (p30) obj2, gjVar, 4);
        }
    }
}

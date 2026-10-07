package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lj0 extends sk1 implements e40 {
    public int OooO;
    public final /* synthetic */ int OooO0oo;
    public final /* synthetic */ Object OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lj0(Object obj, gj gjVar, int i) {
        super(gjVar);
        this.OooO0oo = i;
        this.OooOO0 = obj;
    }

    @Override // com.cmaster.cloner.h6
    public final Object OooO(Object obj) throws Throwable {
        Object objOooOo00;
        Object objOooO00o;
        int i = this.OooO0oo;
        Object obj2 = this.OooOO0;
        Object obj3 = gk.OooO0Oo;
        switch (i) {
            case 0:
                int i2 = this.OooO;
                Object obj4 = vq1.OooO00o;
                if (i2 == 0) {
                    ty2.OooO0O0(obj);
                    mj0 mj0Var = (mj0) obj2;
                    this.OooO = 1;
                    tb1 tb1Var = mj0Var.OooO00o;
                    if ((tb1Var.OooOO0o() && !tb1Var.OooOOOo()) || (objOooOo00 = mj0Var.OooO0O0.OooOo00(this)) != obj3) {
                        objOooOo00 = obj4;
                    }
                    if (objOooOo00 == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ty2.OooO0O0(obj);
                }
                return obj4;
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
                mr0 mr0Var = ((or0) obj2).OooO00o;
                this.OooO = 1;
                Object objOooO0O0 = mr0Var.OooO0O0(this);
                return objOooO0O0 == obj3 ? obj3 : objOooO0O0;
            default:
                int i4 = this.OooO;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ty2.OooO0O0(obj);
                        return obj;
                    }
                    qa.OooO0o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ty2.OooO0O0(obj);
                of ofVar = (of) obj2;
                this.OooO = 1;
                while (true) {
                    Object objOooOoo0 = ofVar.OooOoo0();
                    if (objOooOoo0 instanceof bg0) {
                        if (ofVar.Oooo(objOooOoo0) >= 0) {
                            jk0 jk0Var = new jk0(gu2.OooO00o(this), ofVar);
                            jk0Var.OooOo0();
                            jk0Var.OooOo0o(new ls(ou2.OooO0O0(ofVar, false, new ms(jk0Var, 2), 3)));
                            objOooO00o = jk0Var.OooOo00();
                        }
                    } else {
                        if (objOooOoo0 instanceof rf) {
                            throw ((rf) objOooOoo0).OooO00o;
                        }
                        objOooO00o = j62.OooO00o(objOooOoo0);
                    }
                }
                Object obj5 = objOooO00o;
                return obj5 == obj3 ? obj3 : obj5;
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
        return ((lj0) OooO0oo(gjVar, fkVar)).OooO(vq1Var);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        int i = this.OooO0oo;
        Object obj2 = this.OooOO0;
        switch (i) {
            case 0:
                return new lj0((mj0) obj2, gjVar, 0);
            case 1:
                return new lj0((or0) obj2, gjVar, 1);
            default:
                return new lj0((of) obj2, gjVar, 2);
        }
    }
}

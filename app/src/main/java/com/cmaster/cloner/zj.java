package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zj extends OooOOOO implements tj {
    public static final yj OooO0o0 = new yj(oOO0OO.OooO0o0, xj.OooO0o0);

    public zj() {
        super(oOO0OO.OooO0o0);
    }

    @Override // com.cmaster.cloner.OooOOOO, com.cmaster.cloner.vj
    public final tj OooO0oo(uj ujVar) {
        tj tjVar;
        ujVar.getClass();
        if (ujVar instanceof yj) {
            yj yjVar = (yj) ujVar;
            uj ujVar2 = this.OooO0Oo;
            if ((ujVar2 == yjVar || yjVar.OooO0o0 == ujVar2) && (tjVar = (tj) yjVar.OooO0Oo.OooO0o(this)) != null) {
                return tjVar;
            }
        } else if (oOO0OO.OooO0o0 == ujVar) {
            return this;
        }
        return null;
    }

    @Override // com.cmaster.cloner.OooOOOO, com.cmaster.cloner.vj
    public final vj OooOOO(uj ujVar) {
        ujVar.getClass();
        if (ujVar instanceof yj) {
            yj yjVar = (yj) ujVar;
            uj ujVar2 = this.OooO0Oo;
            if ((ujVar2 != yjVar && yjVar.OooO0o0 != ujVar2) || ((tj) yjVar.OooO0Oo.OooO0o(this)) == null) {
                return this;
            }
        } else if (oOO0OO.OooO0o0 != ujVar) {
            return this;
        }
        return lv.OooO0Oo;
    }

    public abstract void OooOOOO(vj vjVar, Runnable runnable);

    public boolean OooOOo() {
        return !(this instanceof pq1);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + rn.OooO00o(this);
    }
}

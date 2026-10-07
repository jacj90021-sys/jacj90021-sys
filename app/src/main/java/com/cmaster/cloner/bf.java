package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bf implements vj, Serializable {
    public final vj OooO0Oo;
    public final tj OooO0o0;

    public bf(tj tjVar, vj vjVar) {
        vjVar.getClass();
        tjVar.getClass();
        this.OooO0Oo = vjVar;
        this.OooO0o0 = tjVar;
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooO(vj vjVar) {
        vjVar.getClass();
        return vjVar == lv.OooO0Oo ? this : (vj) vjVar.OooO0o(this, new af(1));
    }

    @Override // com.cmaster.cloner.vj
    public final Object OooO0o(Object obj, e40 e40Var) {
        return e40Var.OooO0oO(this.OooO0Oo.OooO0o(obj, e40Var), this.OooO0o0);
    }

    @Override // com.cmaster.cloner.vj
    public final tj OooO0oo(uj ujVar) {
        ujVar.getClass();
        while (true) {
            tj tjVarOooO0oo = this.OooO0o0.OooO0oo(ujVar);
            if (tjVarOooO0oo != null) {
                return tjVarOooO0oo;
            }
            vj vjVar = this.OooO0Oo;
            if (!(vjVar instanceof bf)) {
                return vjVar.OooO0oo(ujVar);
            }
            this = (bf) vjVar;
        }
    }

    @Override // com.cmaster.cloner.vj
    public final vj OooOOO(uj ujVar) {
        ujVar.getClass();
        tj tjVar = this.OooO0o0;
        tj tjVarOooO0oo = tjVar.OooO0oo(ujVar);
        vj vjVar = this.OooO0Oo;
        if (tjVarOooO0oo != null) {
            return vjVar;
        }
        vj vjVarOooOOO = vjVar.OooOOO(ujVar);
        return vjVarOooOOO == vjVar ? this : vjVarOooOOO == lv.OooO0Oo ? tjVar : new bf(tjVar, vjVarOooOOO);
    }

    public final boolean equals(Object obj) {
        boolean zOooO00o;
        if (this == obj) {
            return true;
        }
        if (obj instanceof bf) {
            bf bfVar = (bf) obj;
            int i = 2;
            bf bfVar2 = bfVar;
            int i2 = 2;
            while (true) {
                vj vjVar = bfVar2.OooO0Oo;
                bfVar2 = vjVar instanceof bf ? (bf) vjVar : null;
                if (bfVar2 == null) {
                    break;
                }
                i2++;
            }
            bf bfVar3 = this;
            while (true) {
                vj vjVar2 = bfVar3.OooO0Oo;
                bfVar3 = vjVar2 instanceof bf ? (bf) vjVar2 : null;
                if (bfVar3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                while (true) {
                    tj tjVar = this.OooO0o0;
                    if (!ij0.OooO00o(bfVar.OooO0oo(tjVar.getKey()), tjVar)) {
                        zOooO00o = false;
                        break;
                    }
                    vj vjVar3 = this.OooO0Oo;
                    if (!(vjVar3 instanceof bf)) {
                        vjVar3.getClass();
                        tj tjVar2 = (tj) vjVar3;
                        zOooO00o = ij0.OooO00o(bfVar.OooO0oo(tjVar2.getKey()), tjVar2);
                        break;
                    }
                    this = (bf) vjVar3;
                }
                if (zOooO00o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode() + this.OooO0Oo.hashCode();
    }

    public final String toString() {
        return "[" + ((String) OooO0o("", new af(0))) + ']';
    }
}

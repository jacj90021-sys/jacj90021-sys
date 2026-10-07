package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gc extends ly1 {
    public final ArrayList OooOO0O;
    public int OooOO0o;

    public gc(hi hiVar, int i) {
        hi hiVar2;
        super(hiVar);
        ArrayList arrayList = new ArrayList();
        this.OooOO0O = arrayList;
        this.OooO0o = i;
        hi hiVar3 = this.OooO0O0;
        hi hiVarOooOO0O = hiVar3.OooOO0O(i);
        while (true) {
            hiVar2 = hiVar3;
            hiVar3 = hiVarOooOO0O;
            if (hiVar3 == null) {
                break;
            } else {
                hiVarOooOO0O = hiVar3.OooOO0O(this.OooO0o);
            }
        }
        this.OooO0O0 = hiVar2;
        int i2 = this.OooO0o;
        arrayList.add(i2 == 0 ? hiVar2.OooO0Oo : i2 == 1 ? hiVar2.OooO0o0 : null);
        hi hiVarOooOO0 = hiVar2.OooOO0(this.OooO0o);
        while (hiVarOooOO0 != null) {
            int i3 = this.OooO0o;
            arrayList.add(i3 == 0 ? hiVarOooOO0.OooO0Oo : i3 == 1 ? hiVarOooOO0.OooO0o0 : null);
            hiVarOooOO0 = hiVarOooOO0.OooOO0(this.OooO0o);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ly1 ly1Var = (ly1) obj;
            int i5 = this.OooO0o;
            if (i5 == 0) {
                ly1Var.OooO0O0.OooO0O0 = this;
            } else if (i5 == 1) {
                ly1Var.OooO0O0.OooO0OO = this;
            }
        }
        if (this.OooO0o == 0 && ((ii) this.OooO0O0.OoooO0).o00oO0O && arrayList.size() > 1) {
            this.OooO0O0 = ((ly1) arrayList.get(arrayList.size() - 1)).OooO0O0;
        }
        int i6 = this.OooO0o;
        hi hiVar4 = this.OooO0O0;
        this.OooOO0o = i6 == 0 ? hiVar4.Oooooo0 : hiVar4.Oooooo;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00dd  */
    @Override // com.cmaster.cloner.qp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.cmaster.cloner.qp r28) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.gc.OooO00o(com.cmaster.cloner.qp):void");
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0Oo() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ly1) obj).OooO0Oo();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        hi hiVar = ((ly1) arrayList.get(0)).OooO0O0;
        hi hiVar2 = ((ly1) arrayList.get(size2 - 1)).OooO0O0;
        int i2 = this.OooO0o;
        up upVar = this.OooO;
        up upVar2 = this.OooO0oo;
        if (i2 == 0) {
            qh qhVar = hiVar.Oooo00O;
            qh qhVar2 = hiVar2.Oooo0;
            up upVarOooO = ly1.OooO(qhVar, 0);
            int iOooO0Oo = qhVar.OooO0Oo();
            hi hiVarOooOOO0 = OooOOO0();
            if (hiVarOooOOO0 != null) {
                iOooO0Oo = hiVarOooOOO0.Oooo00O.OooO0Oo();
            }
            if (upVarOooO != null) {
                ly1.OooO0O0(upVar2, upVarOooO, iOooO0Oo);
            }
            up upVarOooO2 = ly1.OooO(qhVar2, 0);
            int iOooO0Oo2 = qhVar2.OooO0Oo();
            hi hiVarOooOOO = OooOOO();
            if (hiVarOooOOO != null) {
                iOooO0Oo2 = hiVarOooOOO.Oooo0.OooO0Oo();
            }
            if (upVarOooO2 != null) {
                ly1.OooO0O0(upVar, upVarOooO2, -iOooO0Oo2);
            }
        } else {
            qh qhVar3 = hiVar.Oooo00o;
            qh qhVar4 = hiVar2.Oooo0O0;
            up upVarOooO3 = ly1.OooO(qhVar3, 1);
            int iOooO0Oo3 = qhVar3.OooO0Oo();
            hi hiVarOooOOO02 = OooOOO0();
            if (hiVarOooOOO02 != null) {
                iOooO0Oo3 = hiVarOooOOO02.Oooo00o.OooO0Oo();
            }
            if (upVarOooO3 != null) {
                ly1.OooO0O0(upVar2, upVarOooO3, iOooO0Oo3);
            }
            up upVarOooO4 = ly1.OooO(qhVar4, 1);
            int iOooO0Oo4 = qhVar4.OooO0Oo();
            hi hiVarOooOOO2 = OooOOO();
            if (hiVarOooOOO2 != null) {
                iOooO0Oo4 = hiVarOooOOO2.Oooo0O0.OooO0Oo();
            }
            if (upVarOooO4 != null) {
                ly1.OooO0O0(upVar, upVarOooO4, -iOooO0Oo4);
            }
        }
        upVar2.OooO00o = this;
        upVar.OooO00o = this;
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o() {
        this.OooO0OO = null;
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ly1) obj).OooO0o();
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0O;
            if (i >= arrayList.size()) {
                return;
            }
            ((ly1) arrayList.get(i)).OooO0o0();
            i++;
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final long OooOO0() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        long jOooOO0 = 0;
        for (int i = 0; i < size; i++) {
            jOooOO0 = r4.OooO.OooO0o + ((ly1) arrayList.get(i)).OooOO0() + jOooOO0 + r4.OooO0oo.OooO0o;
        }
        return jOooOO0;
    }

    @Override // com.cmaster.cloner.ly1
    public final boolean OooOO0O() {
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((ly1) arrayList.get(i)).OooOO0O()) {
                return false;
            }
        }
        return true;
    }

    public final hi OooOOO() {
        ArrayList arrayList = this.OooOO0O;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            hi hiVar = ((ly1) arrayList.get(size)).OooO0O0;
            if (hiVar.OooooOO != 8) {
                return hiVar;
            }
        }
        return null;
    }

    public final hi OooOOO0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooOO0O;
            if (i >= arrayList.size()) {
                return null;
            }
            hi hiVar = ((ly1) arrayList.get(i)).OooO0O0;
            if (hiVar.OooooOO != 8) {
                return hiVar;
            }
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.OooO0o == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.OooOO0O;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((ly1) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}

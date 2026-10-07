package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j80 extends ly1 {
    public static final int[] OooOO0O = new int[2];

    public static void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // com.cmaster.cloner.qp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.cmaster.cloner.qp r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.j80.OooO00o(com.cmaster.cloner.qp):void");
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0Oo() {
        hi hiVar;
        hi hiVar2;
        int i;
        hi hiVar3;
        hi hiVar4;
        int i2;
        hi hiVar5 = this.OooO0O0;
        boolean z = hiVar5.OooO00o;
        mr mrVar = this.OooO0o0;
        if (z) {
            mrVar.OooO0Oo(hiVar5.OooOO0o());
        }
        boolean z2 = mrVar.OooOO0;
        ArrayList arrayList = mrVar.OooOO0O;
        ArrayList arrayList2 = mrVar.OooOO0o;
        up upVar = this.OooO;
        up upVar2 = this.OooO0oo;
        if (!z2) {
            hi hiVar6 = this.OooO0O0;
            int i3 = hiVar6.o00Oo0[0];
            this.OooO0Oo = i3;
            if (i3 != 3) {
                if (i3 == 4 && (hiVar4 = hiVar6.OoooO0) != null && ((i2 = hiVar4.o00Oo0[0]) == 1 || i2 == 4)) {
                    int iOooOO0o = (hiVar4.OooOO0o() - this.OooO0O0.Oooo00O.OooO0Oo()) - this.OooO0O0.Oooo0.OooO0Oo();
                    ly1.OooO0O0(upVar2, hiVar4.OooO0Oo.OooO0oo, this.OooO0O0.Oooo00O.OooO0Oo());
                    ly1.OooO0O0(upVar, hiVar4.OooO0Oo.OooO, -this.OooO0O0.Oooo0.OooO0Oo());
                    mrVar.OooO0Oo(iOooOO0o);
                    return;
                }
                if (i3 == 1) {
                    mrVar.OooO0Oo(hiVar6.OooOO0o());
                }
            }
        } else if (this.OooO0Oo == 4 && (hiVar2 = (hiVar = this.OooO0O0).OoooO0) != null && ((i = hiVar2.o00Oo0[0]) == 1 || i == 4)) {
            ly1.OooO0O0(upVar2, hiVar2.OooO0Oo.OooO0oo, hiVar.Oooo00O.OooO0Oo());
            ly1.OooO0O0(upVar, hiVar2.OooO0Oo.OooO, -this.OooO0O0.Oooo0.OooO0Oo());
            return;
        }
        if (mrVar.OooOO0) {
            hi hiVar7 = this.OooO0O0;
            if (hiVar7.OooO00o) {
                qh[] qhVarArr = hiVar7.Oooo0oo;
                qh qhVar = qhVarArr[0];
                qh qhVar2 = qhVar.OooO0o;
                if (qhVar2 != null && qhVarArr[1].OooO0o != null) {
                    boolean zOooOOoo = hiVar7.OooOOoo();
                    hi hiVar8 = this.OooO0O0;
                    if (zOooOOoo) {
                        upVar2.OooO0o = hiVar8.Oooo0oo[0].OooO0Oo();
                        upVar.OooO0o = -this.OooO0O0.Oooo0oo[1].OooO0Oo();
                        return;
                    }
                    up upVarOooO0oo = ly1.OooO0oo(hiVar8.Oooo0oo[0]);
                    if (upVarOooO0oo != null) {
                        ly1.OooO0O0(upVar2, upVarOooO0oo, this.OooO0O0.Oooo0oo[0].OooO0Oo());
                    }
                    up upVarOooO0oo2 = ly1.OooO0oo(this.OooO0O0.Oooo0oo[1]);
                    if (upVarOooO0oo2 != null) {
                        ly1.OooO0O0(upVar, upVarOooO0oo2, -this.OooO0O0.Oooo0oo[1].OooO0Oo());
                    }
                    upVar2.OooO0O0 = true;
                    upVar.OooO0O0 = true;
                    return;
                }
                if (qhVar2 != null) {
                    up upVarOooO0oo3 = ly1.OooO0oo(qhVar);
                    if (upVarOooO0oo3 != null) {
                        ly1.OooO0O0(upVar2, upVarOooO0oo3, this.OooO0O0.Oooo0oo[0].OooO0Oo());
                        ly1.OooO0O0(upVar, upVar2, mrVar.OooO0oO);
                        return;
                    }
                    return;
                }
                qh qhVar3 = qhVarArr[1];
                if (qhVar3.OooO0o != null) {
                    up upVarOooO0oo4 = ly1.OooO0oo(qhVar3);
                    if (upVarOooO0oo4 != null) {
                        ly1.OooO0O0(upVar, upVarOooO0oo4, -this.OooO0O0.Oooo0oo[1].OooO0Oo());
                        ly1.OooO0O0(upVar2, upVar, -mrVar.OooO0oO);
                        return;
                    }
                    return;
                }
                if ((hiVar7 instanceof e6) || hiVar7.OoooO0 == null || hiVar7.OooO0oO(7).OooO0o != null) {
                    return;
                }
                hi hiVar9 = this.OooO0O0;
                ly1.OooO0O0(upVar2, hiVar9.OoooO0.OooO0Oo.OooO0oo, hiVar9.OooOOO0());
                ly1.OooO0O0(upVar, upVar2, mrVar.OooO0oO);
                return;
            }
        }
        if (this.OooO0Oo == 3) {
            hi hiVar10 = this.OooO0O0;
            int i4 = hiVar10.OooOOo0;
            if (i4 == 2) {
                hi hiVar11 = hiVar10.OoooO0;
                if (hiVar11 != null) {
                    mr mrVar2 = hiVar11.OooO0o0.OooO0o0;
                    arrayList2.add(mrVar2);
                    mrVar2.OooOO0O.add(mrVar);
                    mrVar.OooO0O0 = true;
                    arrayList.add(upVar2);
                    arrayList.add(upVar);
                }
            } else if (i4 == 3) {
                if (hiVar10.OooOOo == 3) {
                    upVar2.OooO00o = this;
                    upVar.OooO00o = this;
                    qs1 qs1Var = hiVar10.OooO0o0;
                    qs1Var.OooO0oo.OooO00o = this;
                    qs1Var.OooO.OooO00o = this;
                    mrVar.OooO00o = this;
                    if (hiVar10.OooOo00()) {
                        arrayList2.add(this.OooO0O0.OooO0o0.OooO0o0);
                        this.OooO0O0.OooO0o0.OooO0o0.OooOO0O.add(mrVar);
                        qs1 qs1Var2 = this.OooO0O0.OooO0o0;
                        qs1Var2.OooO0o0.OooO00o = this;
                        arrayList2.add(qs1Var2.OooO0oo);
                        arrayList2.add(this.OooO0O0.OooO0o0.OooO);
                        this.OooO0O0.OooO0o0.OooO0oo.OooOO0O.add(mrVar);
                        this.OooO0O0.OooO0o0.OooO.OooOO0O.add(mrVar);
                    } else {
                        boolean zOooOOoo2 = this.OooO0O0.OooOOoo();
                        hi hiVar12 = this.OooO0O0;
                        if (zOooOOoo2) {
                            hiVar12.OooO0o0.OooO0o0.OooOO0o.add(mrVar);
                            arrayList.add(this.OooO0O0.OooO0o0.OooO0o0);
                        } else {
                            hiVar12.OooO0o0.OooO0o0.OooOO0o.add(mrVar);
                        }
                    }
                } else {
                    mr mrVar3 = hiVar10.OooO0o0.OooO0o0;
                    arrayList2.add(mrVar3);
                    mrVar3.OooOO0O.add(mrVar);
                    this.OooO0O0.OooO0o0.OooO0oo.OooOO0O.add(mrVar);
                    this.OooO0O0.OooO0o0.OooO.OooOO0O.add(mrVar);
                    mrVar.OooO0O0 = true;
                    arrayList.add(upVar2);
                    arrayList.add(upVar);
                    upVar2.OooOO0o.add(mrVar);
                    upVar.OooOO0o.add(mrVar);
                }
            }
        }
        hi hiVar13 = this.OooO0O0;
        qh[] qhVarArr2 = hiVar13.Oooo0oo;
        qh qhVar4 = qhVarArr2[0];
        qh qhVar5 = qhVar4.OooO0o;
        if (qhVar5 != null && qhVarArr2[1].OooO0o != null) {
            boolean zOooOOoo3 = hiVar13.OooOOoo();
            hi hiVar14 = this.OooO0O0;
            if (zOooOOoo3) {
                upVar2.OooO0o = hiVar14.Oooo0oo[0].OooO0Oo();
                upVar.OooO0o = -this.OooO0O0.Oooo0oo[1].OooO0Oo();
                return;
            }
            up upVarOooO0oo5 = ly1.OooO0oo(hiVar14.Oooo0oo[0]);
            up upVarOooO0oo6 = ly1.OooO0oo(this.OooO0O0.Oooo0oo[1]);
            if (upVarOooO0oo5 != null) {
                upVarOooO0oo5.OooO0O0(this);
            }
            if (upVarOooO0oo6 != null) {
                upVarOooO0oo6.OooO0O0(this);
            }
            this.OooOO0 = 4;
            return;
        }
        if (qhVar5 != null) {
            up upVarOooO0oo7 = ly1.OooO0oo(qhVar4);
            if (upVarOooO0oo7 != null) {
                ly1.OooO0O0(upVar2, upVarOooO0oo7, this.OooO0O0.Oooo0oo[0].OooO0Oo());
                OooO0OO(upVar, upVar2, 1, mrVar);
                return;
            }
            return;
        }
        qh qhVar6 = qhVarArr2[1];
        if (qhVar6.OooO0o != null) {
            up upVarOooO0oo8 = ly1.OooO0oo(qhVar6);
            if (upVarOooO0oo8 != null) {
                ly1.OooO0O0(upVar, upVarOooO0oo8, -this.OooO0O0.Oooo0oo[1].OooO0Oo());
                OooO0OO(upVar2, upVar, -1, mrVar);
                return;
            }
            return;
        }
        if ((hiVar13 instanceof e6) || (hiVar3 = hiVar13.OoooO0) == null) {
            return;
        }
        ly1.OooO0O0(upVar2, hiVar3.OooO0Oo.OooO0oo, hiVar13.OooOOO0());
        OooO0OO(upVar, upVar2, 1, mrVar);
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
        this.OooO.OooO0OO();
        this.OooO0o0.OooO0OO();
        this.OooO0oO = false;
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o0() {
        up upVar = this.OooO0oo;
        if (upVar.OooOO0) {
            this.OooO0O0.OoooOOO = upVar.OooO0oO;
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final boolean OooOO0O() {
        return this.OooO0Oo != 3 || this.OooO0O0.OooOOo0 == 0;
    }

    public final void OooOOO() {
        this.OooO0oO = false;
        up upVar = this.OooO0oo;
        upVar.OooO0OO();
        upVar.OooOO0 = false;
        up upVar2 = this.OooO;
        upVar2.OooO0OO();
        upVar2.OooOO0 = false;
        this.OooO0o0.OooOO0 = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.OooO0O0.OooooOo;
    }
}

package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qs1 extends ly1 {
    public up OooOO0O;
    public h7 OooOO0o;

    @Override // com.cmaster.cloner.qp
    public final void OooO00o(qp qpVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (rj.OooOOoo(this.OooOO0) == 3) {
            hi hiVar = this.OooO0O0;
            OooOO0o(hiVar.Oooo00o, hiVar.Oooo0O0, 1);
            return;
        }
        mr mrVar = this.OooO0o0;
        if (mrVar.OooO0OO && !mrVar.OooOO0 && this.OooO0Oo == 3) {
            hi hiVar2 = this.OooO0O0;
            int i2 = hiVar2.OooOOo;
            if (i2 == 2) {
                hi hiVar3 = hiVar2.OoooO0;
                if (hiVar3 != null) {
                    if (hiVar3.OooO0o0.OooO0o0.OooOO0) {
                        mrVar.OooO0Oo((int) ((r5.OooO0oO * hiVar2.OooOoO0) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                mr mrVar2 = hiVar2.OooO0Oo.OooO0o0;
                if (mrVar2.OooOO0) {
                    int i3 = hiVar2.o000oOoO;
                    if (i3 == -1) {
                        f = mrVar2.OooO0oO;
                        f2 = hiVar2.OoooOO0;
                    } else if (i3 == 0) {
                        f3 = mrVar2.OooO0oO * hiVar2.OoooOO0;
                        i = (int) (f3 + 0.5f);
                        mrVar.OooO0Oo(i);
                    } else if (i3 != 1) {
                        i = 0;
                        mrVar.OooO0Oo(i);
                    } else {
                        f = mrVar2.OooO0oO;
                        f2 = hiVar2.OoooOO0;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    mrVar.OooO0Oo(i);
                }
            }
        }
        up upVar = this.OooO0oo;
        boolean z = upVar.OooO0OO;
        ArrayList arrayList = upVar.OooOO0o;
        if (z) {
            up upVar2 = this.OooO;
            boolean z2 = upVar2.OooO0OO;
            ArrayList arrayList2 = upVar2.OooOO0o;
            if (z2) {
                if (upVar.OooOO0 && upVar2.OooOO0 && mrVar.OooOO0) {
                    return;
                }
                if (!mrVar.OooOO0 && this.OooO0Oo == 3) {
                    hi hiVar4 = this.OooO0O0;
                    if (hiVar4.OooOOo0 == 0 && !hiVar4.OooOo00()) {
                        up upVar3 = (up) arrayList.get(0);
                        up upVar4 = (up) arrayList2.get(0);
                        int i4 = upVar3.OooO0oO + upVar.OooO0o;
                        int i5 = upVar4.OooO0oO + upVar2.OooO0o;
                        upVar.OooO0Oo(i4);
                        upVar2.OooO0Oo(i5);
                        mrVar.OooO0Oo(i5 - i4);
                        return;
                    }
                }
                if (!mrVar.OooOO0 && this.OooO0Oo == 3 && this.OooO00o == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    up upVar5 = (up) arrayList.get(0);
                    int i6 = (((up) arrayList2.get(0)).OooO0oO + upVar2.OooO0o) - (upVar5.OooO0oO + upVar.OooO0o);
                    int i7 = mrVar.OooOOO0;
                    if (i6 < i7) {
                        mrVar.OooO0Oo(i6);
                    } else {
                        mrVar.OooO0Oo(i7);
                    }
                }
                if (mrVar.OooOO0 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    up upVar6 = (up) arrayList.get(0);
                    up upVar7 = (up) arrayList2.get(0);
                    int i8 = upVar6.OooO0oO;
                    int i9 = upVar.OooO0o + i8;
                    int i10 = upVar7.OooO0oO;
                    int i11 = upVar2.OooO0o + i10;
                    float f4 = this.OooO0O0.Ooooo0o;
                    if (upVar6 == upVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    upVar.OooO0Oo((int) ((((i10 - i8) - mrVar.OooO0oO) * f4) + i8 + 0.5f));
                    upVar2.OooO0Oo(upVar.OooO0oO + mrVar.OooO0oO);
                }
            }
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0Oo() {
        hi hiVar;
        hi hiVar2;
        hi hiVar3;
        hi hiVar4;
        up upVar = this.OooOO0O;
        hi hiVar5 = this.OooO0O0;
        boolean z = hiVar5.OooO00o;
        mr mrVar = this.OooO0o0;
        if (z) {
            mrVar.OooO0Oo(hiVar5.OooO());
        }
        boolean z2 = mrVar.OooOO0;
        ArrayList arrayList = mrVar.OooOO0O;
        ArrayList arrayList2 = mrVar.OooOO0o;
        up upVar2 = this.OooO;
        up upVar3 = this.OooO0oo;
        if (!z2) {
            hi hiVar6 = this.OooO0O0;
            this.OooO0Oo = hiVar6.o00Oo0[1];
            if (hiVar6.OooOooO) {
                this.OooOO0o = new h7(this);
            }
            int i = this.OooO0Oo;
            if (i != 3) {
                if (i == 4 && (hiVar4 = this.OooO0O0.OoooO0) != null && hiVar4.o00Oo0[1] == 1) {
                    int iOooO = (hiVar4.OooO() - this.OooO0O0.Oooo00o.OooO0Oo()) - this.OooO0O0.Oooo0O0.OooO0Oo();
                    ly1.OooO0O0(upVar3, hiVar4.OooO0o0.OooO0oo, this.OooO0O0.Oooo00o.OooO0Oo());
                    ly1.OooO0O0(upVar2, hiVar4.OooO0o0.OooO, -this.OooO0O0.Oooo0O0.OooO0Oo());
                    mrVar.OooO0Oo(iOooO);
                    return;
                }
                if (i == 1) {
                    mrVar.OooO0Oo(this.OooO0O0.OooO());
                }
            }
        } else if (this.OooO0Oo == 4 && (hiVar2 = (hiVar = this.OooO0O0).OoooO0) != null && hiVar2.o00Oo0[1] == 1) {
            ly1.OooO0O0(upVar3, hiVar2.OooO0o0.OooO0oo, hiVar.Oooo00o.OooO0Oo());
            ly1.OooO0O0(upVar2, hiVar2.OooO0o0.OooO, -this.OooO0O0.Oooo0O0.OooO0Oo());
            return;
        }
        boolean z3 = mrVar.OooOO0;
        if (z3) {
            hi hiVar7 = this.OooO0O0;
            if (hiVar7.OooO00o) {
                qh[] qhVarArr = hiVar7.Oooo0oo;
                qh qhVar = qhVarArr[2];
                qh qhVar2 = qhVar.OooO0o;
                if (qhVar2 != null && qhVarArr[3].OooO0o != null) {
                    boolean zOooOo00 = hiVar7.OooOo00();
                    hi hiVar8 = this.OooO0O0;
                    if (zOooOo00) {
                        upVar3.OooO0o = hiVar8.Oooo0oo[2].OooO0Oo();
                        upVar2.OooO0o = -this.OooO0O0.Oooo0oo[3].OooO0Oo();
                    } else {
                        up upVarOooO0oo = ly1.OooO0oo(hiVar8.Oooo0oo[2]);
                        if (upVarOooO0oo != null) {
                            ly1.OooO0O0(upVar3, upVarOooO0oo, this.OooO0O0.Oooo0oo[2].OooO0Oo());
                        }
                        up upVarOooO0oo2 = ly1.OooO0oo(this.OooO0O0.Oooo0oo[3]);
                        if (upVarOooO0oo2 != null) {
                            ly1.OooO0O0(upVar2, upVarOooO0oo2, -this.OooO0O0.Oooo0oo[3].OooO0Oo());
                        }
                        upVar3.OooO0O0 = true;
                        upVar2.OooO0O0 = true;
                    }
                    hi hiVar9 = this.OooO0O0;
                    if (hiVar9.OooOooO) {
                        ly1.OooO0O0(upVar, upVar3, hiVar9.OoooOo0);
                        return;
                    }
                    return;
                }
                if (qhVar2 != null) {
                    up upVarOooO0oo3 = ly1.OooO0oo(qhVar);
                    if (upVarOooO0oo3 != null) {
                        ly1.OooO0O0(upVar3, upVarOooO0oo3, this.OooO0O0.Oooo0oo[2].OooO0Oo());
                        ly1.OooO0O0(upVar2, upVar3, mrVar.OooO0oO);
                        hi hiVar10 = this.OooO0O0;
                        if (hiVar10.OooOooO) {
                            ly1.OooO0O0(upVar, upVar3, hiVar10.OoooOo0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qh qhVar3 = qhVarArr[3];
                if (qhVar3.OooO0o != null) {
                    up upVarOooO0oo4 = ly1.OooO0oo(qhVar3);
                    if (upVarOooO0oo4 != null) {
                        ly1.OooO0O0(upVar2, upVarOooO0oo4, -this.OooO0O0.Oooo0oo[3].OooO0Oo());
                        ly1.OooO0O0(upVar3, upVar2, -mrVar.OooO0oO);
                    }
                    hi hiVar11 = this.OooO0O0;
                    if (hiVar11.OooOooO) {
                        ly1.OooO0O0(upVar, upVar3, hiVar11.OoooOo0);
                        return;
                    }
                    return;
                }
                qh qhVar4 = qhVarArr[4];
                if (qhVar4.OooO0o != null) {
                    up upVarOooO0oo5 = ly1.OooO0oo(qhVar4);
                    if (upVarOooO0oo5 != null) {
                        ly1.OooO0O0(upVar, upVarOooO0oo5, 0);
                        ly1.OooO0O0(upVar3, upVar, -this.OooO0O0.OoooOo0);
                        ly1.OooO0O0(upVar2, upVar3, mrVar.OooO0oO);
                        return;
                    }
                    return;
                }
                if ((hiVar7 instanceof e6) || hiVar7.OoooO0 == null || hiVar7.OooO0oO(7).OooO0o != null) {
                    return;
                }
                hi hiVar12 = this.OooO0O0;
                ly1.OooO0O0(upVar3, hiVar12.OoooO0.OooO0o0.OooO0oo, hiVar12.OooOOO());
                ly1.OooO0O0(upVar2, upVar3, mrVar.OooO0oO);
                hi hiVar13 = this.OooO0O0;
                if (hiVar13.OooOooO) {
                    ly1.OooO0O0(upVar, upVar3, hiVar13.OoooOo0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.OooO0Oo != 3) {
            mrVar.OooO0O0(this);
        } else {
            hi hiVar14 = this.OooO0O0;
            int i2 = hiVar14.OooOOo;
            if (i2 == 2) {
                hi hiVar15 = hiVar14.OoooO0;
                if (hiVar15 != null) {
                    mr mrVar2 = hiVar15.OooO0o0.OooO0o0;
                    arrayList2.add(mrVar2);
                    mrVar2.OooOO0O.add(mrVar);
                    mrVar.OooO0O0 = true;
                    arrayList.add(upVar3);
                    arrayList.add(upVar2);
                }
            } else if (i2 == 3 && !hiVar14.OooOo00()) {
                hi hiVar16 = this.OooO0O0;
                if (hiVar16.OooOOo0 != 3) {
                    mr mrVar3 = hiVar16.OooO0Oo.OooO0o0;
                    arrayList2.add(mrVar3);
                    mrVar3.OooOO0O.add(mrVar);
                    mrVar.OooO0O0 = true;
                    arrayList.add(upVar3);
                    arrayList.add(upVar2);
                }
            }
        }
        hi hiVar17 = this.OooO0O0;
        qh[] qhVarArr2 = hiVar17.Oooo0oo;
        qh qhVar5 = qhVarArr2[2];
        qh qhVar6 = qhVar5.OooO0o;
        if (qhVar6 != null && qhVarArr2[3].OooO0o != null) {
            boolean zOooOo002 = hiVar17.OooOo00();
            hi hiVar18 = this.OooO0O0;
            if (zOooOo002) {
                upVar3.OooO0o = hiVar18.Oooo0oo[2].OooO0Oo();
                upVar2.OooO0o = -this.OooO0O0.Oooo0oo[3].OooO0Oo();
            } else {
                up upVarOooO0oo6 = ly1.OooO0oo(hiVar18.Oooo0oo[2]);
                up upVarOooO0oo7 = ly1.OooO0oo(this.OooO0O0.Oooo0oo[3]);
                if (upVarOooO0oo6 != null) {
                    upVarOooO0oo6.OooO0O0(this);
                }
                if (upVarOooO0oo7 != null) {
                    upVarOooO0oo7.OooO0O0(this);
                }
                this.OooOO0 = 4;
            }
            if (this.OooO0O0.OooOooO) {
                OooO0OO(upVar, upVar3, 1, this.OooOO0o);
            }
        } else if (qhVar6 != null) {
            up upVarOooO0oo8 = ly1.OooO0oo(qhVar5);
            if (upVarOooO0oo8 != null) {
                ly1.OooO0O0(upVar3, upVarOooO0oo8, this.OooO0O0.Oooo0oo[2].OooO0Oo());
                OooO0OO(upVar2, upVar3, 1, mrVar);
                if (this.OooO0O0.OooOooO) {
                    OooO0OO(upVar, upVar3, 1, this.OooOO0o);
                }
                if (this.OooO0Oo == 3) {
                    hi hiVar19 = this.OooO0O0;
                    if (hiVar19.OoooOO0 > 0.0f) {
                        j80 j80Var = hiVar19.OooO0Oo;
                        if (j80Var.OooO0Oo == 3) {
                            j80Var.OooO0o0.OooOO0O.add(mrVar);
                            arrayList2.add(this.OooO0O0.OooO0Oo.OooO0o0);
                            mrVar.OooO00o = this;
                        }
                    }
                }
            }
        } else {
            qh qhVar7 = qhVarArr2[3];
            if (qhVar7.OooO0o != null) {
                up upVarOooO0oo9 = ly1.OooO0oo(qhVar7);
                if (upVarOooO0oo9 != null) {
                    ly1.OooO0O0(upVar2, upVarOooO0oo9, -this.OooO0O0.Oooo0oo[3].OooO0Oo());
                    OooO0OO(upVar3, upVar2, -1, mrVar);
                    if (this.OooO0O0.OooOooO) {
                        OooO0OO(upVar, upVar3, 1, this.OooOO0o);
                    }
                }
            } else {
                qh qhVar8 = qhVarArr2[4];
                if (qhVar8.OooO0o != null) {
                    up upVarOooO0oo10 = ly1.OooO0oo(qhVar8);
                    if (upVarOooO0oo10 != null) {
                        ly1.OooO0O0(upVar, upVarOooO0oo10, 0);
                        OooO0OO(upVar3, upVar, -1, this.OooOO0o);
                        OooO0OO(upVar2, upVar3, 1, mrVar);
                    }
                } else if (!(hiVar17 instanceof e6) && (hiVar3 = hiVar17.OoooO0) != null) {
                    ly1.OooO0O0(upVar3, hiVar3.OooO0o0.OooO0oo, hiVar17.OooOOO());
                    OooO0OO(upVar2, upVar3, 1, mrVar);
                    if (this.OooO0O0.OooOooO) {
                        OooO0OO(upVar, upVar3, 1, this.OooOO0o);
                    }
                    if (this.OooO0Oo == 3) {
                        hi hiVar20 = this.OooO0O0;
                        if (hiVar20.OoooOO0 > 0.0f) {
                            j80 j80Var2 = hiVar20.OooO0Oo;
                            if (j80Var2.OooO0Oo == 3) {
                                j80Var2.OooO0o0.OooOO0O.add(mrVar);
                                arrayList2.add(this.OooO0O0.OooO0Oo.OooO0o0);
                                mrVar.OooO00o = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            mrVar.OooO0OO = true;
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o() {
        this.OooO0OO = null;
        this.OooO0oo.OooO0OO();
        this.OooO.OooO0OO();
        this.OooOO0O.OooO0OO();
        this.OooO0o0.OooO0OO();
        this.OooO0oO = false;
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o0() {
        up upVar = this.OooO0oo;
        if (upVar.OooOO0) {
            this.OooO0O0.OoooOOo = upVar.OooO0oO;
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final boolean OooOO0O() {
        return this.OooO0Oo != 3 || this.OooO0O0.OooOOo == 0;
    }

    public final void OooOOO0() {
        this.OooO0oO = false;
        up upVar = this.OooO0oo;
        upVar.OooO0OO();
        upVar.OooOO0 = false;
        up upVar2 = this.OooO;
        upVar2.OooO0OO();
        upVar2.OooOO0 = false;
        up upVar3 = this.OooOO0O;
        upVar3.OooO0OO();
        upVar3.OooOO0 = false;
        this.OooO0o0.OooOO0 = false;
    }

    public final String toString() {
        return "VerticalRun " + this.OooO0O0.OooooOo;
    }
}

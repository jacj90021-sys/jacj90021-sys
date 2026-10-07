package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c70 extends ly1 {
    @Override // com.cmaster.cloner.qp
    public final void OooO00o(qp qpVar) {
        up upVar = this.OooO0oo;
        if (upVar.OooO0OO && !upVar.OooOO0) {
            upVar.OooO0Oo((int) ((((up) upVar.OooOO0o.get(0)).OooO0oO * ((b70) this.OooO0O0).o00Ooo) + 0.5f));
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0Oo() {
        hi hiVar = this.OooO0O0;
        b70 b70Var = (b70) hiVar;
        int i = b70Var.o00o0O;
        int i2 = b70Var.o00ooo;
        int i3 = b70Var.o00oO0o;
        up upVar = this.OooO0oo;
        if (i3 == 1) {
            if (i != -1) {
                upVar.OooOO0o.add(hiVar.OoooO0.OooO0Oo.OooO0oo);
                this.OooO0O0.OoooO0.OooO0Oo.OooO0oo.OooOO0O.add(upVar);
                upVar.OooO0o = i;
            } else if (i2 != -1) {
                upVar.OooOO0o.add(hiVar.OoooO0.OooO0Oo.OooO);
                this.OooO0O0.OoooO0.OooO0Oo.OooO.OooOO0O.add(upVar);
                upVar.OooO0o = -i2;
            } else {
                upVar.OooO0O0 = true;
                upVar.OooOO0o.add(hiVar.OoooO0.OooO0Oo.OooO);
                this.OooO0O0.OoooO0.OooO0Oo.OooO.OooOO0O.add(upVar);
            }
            OooOOO0(this.OooO0O0.OooO0Oo.OooO0oo);
            OooOOO0(this.OooO0O0.OooO0Oo.OooO);
            return;
        }
        if (i != -1) {
            upVar.OooOO0o.add(hiVar.OoooO0.OooO0o0.OooO0oo);
            this.OooO0O0.OoooO0.OooO0o0.OooO0oo.OooOO0O.add(upVar);
            upVar.OooO0o = i;
        } else if (i2 != -1) {
            upVar.OooOO0o.add(hiVar.OoooO0.OooO0o0.OooO);
            this.OooO0O0.OoooO0.OooO0o0.OooO.OooOO0O.add(upVar);
            upVar.OooO0o = -i2;
        } else {
            upVar.OooO0O0 = true;
            upVar.OooOO0o.add(hiVar.OoooO0.OooO0o0.OooO);
            this.OooO0O0.OoooO0.OooO0o0.OooO.OooOO0O.add(upVar);
        }
        OooOOO0(this.OooO0O0.OooO0o0.OooO0oo);
        OooOOO0(this.OooO0O0.OooO0o0.OooO);
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o() {
        this.OooO0oo.OooO0OO();
    }

    @Override // com.cmaster.cloner.ly1
    public final void OooO0o0() {
        hi hiVar = this.OooO0O0;
        int i = ((b70) hiVar).o00oO0o;
        up upVar = this.OooO0oo;
        if (i == 1) {
            hiVar.OoooOOO = upVar.OooO0oO;
        } else {
            hiVar.OoooOOo = upVar.OooO0oO;
        }
    }

    @Override // com.cmaster.cloner.ly1
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(up upVar) {
        up upVar2 = this.OooO0oo;
        upVar2.OooOO0O.add(upVar);
        upVar.OooOO0o.add(upVar2);
    }
}

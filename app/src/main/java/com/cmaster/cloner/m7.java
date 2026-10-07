package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m7 implements ln0 {
    public final ln0 OooO00o;
    public int OooO0O0 = 0;
    public int OooO0OO = -1;
    public int OooO0Oo = -1;
    public Object OooO0o0 = null;

    public m7(ln0 ln0Var) {
        this.OooO00o = ln0Var;
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO00o(int i, int i2) {
        OooO0o0();
        this.OooO00o.OooO00o(i, i2);
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0O0(int i, int i2) {
        int i3;
        if (this.OooO0O0 == 1 && i >= (i3 = this.OooO0OO)) {
            int i4 = this.OooO0Oo;
            if (i <= i3 + i4) {
                this.OooO0Oo = i4 + i2;
                this.OooO0OO = Math.min(i, i3);
                return;
            }
        }
        OooO0o0();
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.OooO0O0 = 1;
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0OO(int i, int i2) {
        int i3;
        if (this.OooO0O0 == 2 && (i3 = this.OooO0OO) >= i && i3 <= i + i2) {
            this.OooO0Oo += i2;
            this.OooO0OO = i;
        } else {
            OooO0o0();
            this.OooO0OO = i;
            this.OooO0Oo = i2;
            this.OooO0O0 = 2;
        }
    }

    @Override // com.cmaster.cloner.ln0
    public final void OooO0Oo(int i, int i2, Object obj) {
        int i3;
        int i4;
        int i5;
        if (this.OooO0O0 == 3 && i <= (i4 = this.OooO0Oo + (i3 = this.OooO0OO)) && (i5 = i + i2) >= i3 && this.OooO0o0 == obj) {
            this.OooO0OO = Math.min(i, i3);
            this.OooO0Oo = Math.max(i4, i5) - this.OooO0OO;
            return;
        }
        OooO0o0();
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        this.OooO0o0 = obj;
        this.OooO0O0 = 3;
    }

    public final void OooO0o0() {
        int i = this.OooO0O0;
        if (i == 0) {
            return;
        }
        ln0 ln0Var = this.OooO00o;
        if (i == 1) {
            ln0Var.OooO0O0(this.OooO0OO, this.OooO0Oo);
        } else if (i == 2) {
            ln0Var.OooO0OO(this.OooO0OO, this.OooO0Oo);
        } else if (i == 3) {
            ln0Var.OooO0Oo(this.OooO0OO, this.OooO0Oo, this.OooO0o0);
        }
        this.OooO0o0 = null;
        this.OooO0O0 = 0;
    }
}

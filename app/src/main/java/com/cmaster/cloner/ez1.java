package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ez1 {
    public final qz1 OooO00o;
    public zg0[] OooO0O0;

    public ez1() {
        this(new qz1());
    }

    public final void OooO00o() {
        zg0[] zg0VarArr = this.OooO0O0;
        if (zg0VarArr != null) {
            zg0 zg0VarOooO0o = zg0VarArr[0];
            zg0 zg0VarOooO0o2 = zg0VarArr[1];
            qz1 qz1Var = this.OooO00o;
            if (zg0VarOooO0o2 == null) {
                zg0VarOooO0o2 = qz1Var.OooO00o.OooO0o(2);
            }
            if (zg0VarOooO0o == null) {
                zg0VarOooO0o = qz1Var.OooO00o.OooO0o(1);
            }
            OooO0oO(zg0.OooO00o(zg0VarOooO0o, zg0VarOooO0o2));
            zg0 zg0Var = this.OooO0O0[i63.OooO00o(16)];
            if (zg0Var != null) {
                OooO0o(zg0Var);
            }
            zg0 zg0Var2 = this.OooO0O0[i63.OooO00o(32)];
            if (zg0Var2 != null) {
                OooO0Oo(zg0Var2);
            }
            zg0 zg0Var3 = this.OooO0O0[i63.OooO00o(64)];
            if (zg0Var3 != null) {
                OooO0oo(zg0Var3);
            }
        }
    }

    public abstract qz1 OooO0O0();

    public void OooO0OO(int i, zg0 zg0Var) {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new zg0[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.OooO0O0[i63.OooO00o(i2)] = zg0Var;
            }
        }
    }

    public void OooO0Oo(zg0 zg0Var) {
    }

    public void OooO0o(zg0 zg0Var) {
    }

    public abstract void OooO0o0(zg0 zg0Var);

    public abstract void OooO0oO(zg0 zg0Var);

    public void OooO0oo(zg0 zg0Var) {
    }

    public ez1(qz1 qz1Var) {
        this.OooO00o = qz1Var;
    }
}

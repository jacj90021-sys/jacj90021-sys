package com.cmaster.cloner;

import java.util.BitSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v81 extends h00 implements aq1 {
    public static final v81 OooO0o = new v81(0);

    public static v81 OooO(u81 u81Var) {
        v81 v81Var = new v81(1);
        v81Var.OooO0o(0, u81Var);
        return v81Var;
    }

    public static v81 OooOO0(u81 u81Var, u81 u81Var2) {
        v81 v81Var = new v81(2);
        v81Var.OooO0o(0, u81Var);
        v81Var.OooO0o(1, u81Var2);
        return v81Var;
    }

    public final v81 OooOO0O(boolean z, BitSet bitSet) {
        Object[] objArr = this.OooO0o0;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        v81 v81Var = new v81(objArr.length);
        int i = 0;
        int iOooO0OO = 0;
        while (i < length) {
            u81 u81VarOooO0Oo = (u81) OooO0o0(i);
            if (bitSet == null || !bitSet.get(i)) {
                if (u81VarOooO0Oo.OooO0Oo != iOooO0OO) {
                    u81VarOooO0Oo = u81.OooO0Oo(iOooO0OO, u81VarOooO0Oo.OooO0o0);
                }
                if (!z) {
                    iOooO0OO += u81VarOooO0Oo.OooO0OO();
                }
            }
            v81Var.OooO0o(i, u81VarOooO0Oo);
            i++;
            z = false;
        }
        if (!this.OooO0Oo) {
            v81Var.OooO0Oo = false;
        }
        return v81Var;
    }

    public final v81 OooOO0o(int i) {
        int i2;
        int i3;
        int length = this.OooO0o0.length;
        if (length == 0) {
            return this;
        }
        v81 v81Var = new v81(length);
        for (int i4 = 0; i4 < length; i4++) {
            u81 u81VarOooO0Oo = (u81) OooO0o0(i4);
            if (i != 0 && i2 != (i3 = (i2 = u81VarOooO0Oo.OooO0Oo) + i)) {
                u81VarOooO0Oo = u81.OooO0Oo(i3, u81VarOooO0Oo.OooO0o0);
            }
            v81Var.OooO0o(i4, u81VarOooO0Oo);
        }
        if (!this.OooO0Oo) {
            v81Var.OooO0Oo = false;
        }
        return v81Var;
    }

    @Override // com.cmaster.cloner.h00, com.cmaster.cloner.aq1
    public final vp1 getType(int i) {
        vp1 type = ((u81) OooO0o0(i)).OooO0o0.getType();
        type.getClass();
        return type;
    }
}

package com.cmaster.cloner;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kg1 {
    public float OooO00o;
    public float OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o0;
    public final ArrayList OooO0o = new ArrayList();
    public final ArrayList OooO0oO = new ArrayList();

    public kg1() {
        OooO0Oo(0.0f, 270.0f, 0.0f);
    }

    public final void OooO00o(float f) {
        float f2 = this.OooO0Oo;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.OooO0O0;
        float f5 = this.OooO0OO;
        gg1 gg1Var = new gg1(f4, f5, f4, f5);
        gg1Var.OooO0o = this.OooO0Oo;
        gg1Var.OooO0oO = f3;
        this.OooO0oO.add(new eg1(gg1Var));
        this.OooO0Oo = f;
    }

    public final void OooO0O0(Matrix matrix, Path path) {
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ig1) arrayList.get(i)).OooO00o(matrix, path);
        }
    }

    public final void OooO0OO(float f, float f2) {
        hg1 hg1Var = new hg1();
        hg1Var.OooO0O0 = f;
        hg1Var.OooO0OO = f2;
        this.OooO0o.add(hg1Var);
        fg1 fg1Var = new fg1(hg1Var, this.OooO0O0, this.OooO0OO);
        float fOooO0O0 = fg1Var.OooO0O0() + 270.0f;
        float fOooO0O02 = fg1Var.OooO0O0() + 270.0f;
        OooO00o(fOooO0O0);
        this.OooO0oO.add(fg1Var);
        this.OooO0Oo = fOooO0O02;
        this.OooO0O0 = f;
        this.OooO0OO = f2;
    }

    public final void OooO0Oo(float f, float f2, float f3) {
        this.OooO00o = f;
        this.OooO0O0 = 0.0f;
        this.OooO0OO = f;
        this.OooO0Oo = f2;
        this.OooO0o0 = (f2 + f3) % 360.0f;
        this.OooO0o.clear();
        this.OooO0oO.clear();
    }
}

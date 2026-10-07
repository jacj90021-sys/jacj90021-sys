package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pu {
    public int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public pu(i71 i71Var) {
        this.OooO00o = Integer.MIN_VALUE;
        this.OooO0OO = new Rect();
        this.OooO0O0 = i71Var;
    }

    public static pu OooO0O0(i71 i71Var, int i) {
        if (i == 0) {
            return new a01(i71Var, 0);
        }
        int i2 = 1;
        if (i == 1) {
            return new a01(i71Var, i2);
        }
        ra.OooOOO("invalid orientation");
        return null;
    }

    public abstract int OooO();

    public abstract void OooO00o(mc1 mc1Var);

    public abstract void OooO0OO(mc1 mc1Var);

    public abstract int OooO0Oo(View view);

    public abstract int OooO0o(View view);

    public abstract int OooO0o0(View view);

    public abstract int OooO0oO(View view);

    public abstract int OooO0oo();

    public abstract int OooOO0();

    public abstract int OooOO0O();

    public abstract int OooOO0o();

    public abstract int OooOOO();

    public abstract int OooOOO0();

    public abstract int OooOOOO(View view);

    public abstract int OooOOOo(View view);

    public abstract void OooOOo(mc1 mc1Var);

    public abstract void OooOOo0(int i);

    public abstract void OooOOoo(mc1 mc1Var);

    public abstract void OooOo0(mc1 mc1Var);

    public abstract void OooOo00(mc1 mc1Var);

    public abstract ub1 OooOo0O(mc1 mc1Var);

    public pu(int i, String str, String str2) {
        this.OooO00o = i;
        this.OooO0O0 = str;
        this.OooO0OO = str2;
    }

    public pu(ru ruVar) {
        this.OooO00o = 0;
        this.OooO0OO = new eo();
        this.OooO0O0 = ruVar;
    }
}

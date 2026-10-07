package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qz1 {
    public static final qz1 OooO0O0;
    public final mz1 OooO00o;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            OooO0O0 = lz1.OooOOoo;
        } else if (i >= 30) {
            OooO0O0 = jz1.OooOOo;
        } else {
            OooO0O0 = mz1.OooO0O0;
        }
    }

    public qz1(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.OooO00o = new lz1(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.OooO00o = new kz1(this, windowInsets);
            return;
        }
        if (i >= 30) {
            this.OooO00o = new jz1(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.OooO00o = new iz1(this, windowInsets);
        } else if (i >= 28) {
            this.OooO00o = new hz1(this, windowInsets);
        } else {
            this.OooO00o = new gz1(this, windowInsets);
        }
    }

    public static zg0 OooO0o0(zg0 zg0Var, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, zg0Var.OooO00o - i);
        int iMax2 = Math.max(0, zg0Var.OooO0O0 - i2);
        int iMax3 = Math.max(0, zg0Var.OooO0OO - i3);
        int iMax4 = Math.max(0, zg0Var.OooO0Oo - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? zg0Var : zg0.OooO0O0(iMax, iMax2, iMax3, iMax4);
    }

    public static qz1 OooO0oO(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        qz1 qz1Var = new qz1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = nt1.OooO00o;
            qz1 qz1VarOooO00o = gt1.OooO00o(view);
            mz1 mz1Var = qz1Var.OooO00o;
            mz1Var.OooOOOo(qz1VarOooO00o);
            mz1Var.OooO0Oo(view.getRootView());
            mz1Var.OooOOo(view.getWindowSystemUiVisibility());
        }
        return qz1Var;
    }

    public final int OooO00o() {
        return this.OooO00o.OooOO0().OooO0Oo;
    }

    public final int OooO0O0() {
        return this.OooO00o.OooOO0().OooO00o;
    }

    public final int OooO0OO() {
        return this.OooO00o.OooOO0().OooO0OO;
    }

    public final int OooO0Oo() {
        return this.OooO00o.OooOO0().OooO0O0;
    }

    public final WindowInsets OooO0o() {
        mz1 mz1Var = this.OooO00o;
        if (mz1Var instanceof fz1) {
            return ((fz1) mz1Var).OooO0OO;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qz1) {
            return Objects.equals(this.OooO00o, ((qz1) obj).OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        mz1 mz1Var = this.OooO00o;
        if (mz1Var == null) {
            return 0;
        }
        return mz1Var.hashCode();
    }

    public qz1() {
        this.OooO00o = new mz1(this);
    }
}

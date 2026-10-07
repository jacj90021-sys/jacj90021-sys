package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class mz1 {
    public static final qz1 OooO0O0;
    public final qz1 OooO00o;

    static {
        int i = Build.VERSION.SDK_INT;
        OooO0O0 = (i >= 34 ? new dz1() : i >= 31 ? new cz1() : i >= 30 ? new bz1() : i >= 29 ? new az1() : new zy1()).OooO0O0().OooO00o.OooO00o().OooO00o.OooO0O0().OooO00o.OooO0OO();
    }

    public mz1(qz1 qz1Var) {
        this.OooO00o = qz1Var;
    }

    public zg0 OooO() {
        return OooOO0();
    }

    public qz1 OooO00o() {
        return this.OooO00o;
    }

    public qz1 OooO0O0() {
        return this.OooO00o;
    }

    public qz1 OooO0OO() {
        return this.OooO00o;
    }

    public void OooO0Oo(View view) {
    }

    public zg0 OooO0o(int i) {
        return zg0.OooO0o0;
    }

    public hs OooO0o0() {
        return null;
    }

    public zg0 OooO0oO() {
        return OooOO0();
    }

    public zg0 OooO0oo() {
        return zg0.OooO0o0;
    }

    public zg0 OooOO0() {
        return zg0.OooO0o0;
    }

    public zg0 OooOO0O() {
        return OooOO0();
    }

    public qz1 OooOO0o(int i, int i2, int i3, int i4) {
        return OooO0O0;
    }

    public boolean OooOOO() {
        return false;
    }

    public boolean OooOOO0() {
        return false;
    }

    public void OooOOOO(zg0[] zg0VarArr) {
    }

    public void OooOOOo(qz1 qz1Var) {
    }

    public void OooOOo(int i) {
    }

    public void OooOOo0(zg0 zg0Var) {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz1)) {
            return false;
        }
        mz1 mz1Var = (mz1) obj;
        return OooOOO() == mz1Var.OooOOO() && OooOOO0() == mz1Var.OooOOO0() && Objects.equals(OooOO0(), mz1Var.OooOO0()) && Objects.equals(OooO0oo(), mz1Var.OooO0oo()) && Objects.equals(OooO0o0(), mz1Var.OooO0o0());
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(OooOOO()), Boolean.valueOf(OooOOO0()), OooOO0(), OooO0oo(), OooO0o0());
    }
}

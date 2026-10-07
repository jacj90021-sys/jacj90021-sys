package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wh1 implements Comparable {
    public boolean OooO0Oo;
    public float OooO0oo;
    public int OooOOOO;
    public int OooO0o0 = -1;
    public int OooO0o = -1;
    public int OooO0oO = 0;
    public boolean OooO = false;
    public final float[] OooOO0 = new float[9];
    public final float[] OooOO0O = new float[9];
    public l3[] OooOO0o = new l3[16];
    public int OooOOO0 = 0;
    public int OooOOO = 0;

    public wh1(int i) {
        this.OooOOOO = i;
    }

    public final void OooO00o(l3 l3Var) {
        int i = 0;
        while (true) {
            int i2 = this.OooOOO0;
            l3[] l3VarArr = this.OooOO0o;
            if (i >= i2) {
                if (i2 >= l3VarArr.length) {
                    this.OooOO0o = (l3[]) Arrays.copyOf(l3VarArr, l3VarArr.length * 2);
                }
                l3[] l3VarArr2 = this.OooOO0o;
                int i3 = this.OooOOO0;
                l3VarArr2[i3] = l3Var;
                this.OooOOO0 = i3 + 1;
                return;
            }
            if (l3VarArr[i] == l3Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void OooO0O0(l3 l3Var) {
        int i = this.OooOOO0;
        int i2 = 0;
        while (i2 < i) {
            if (this.OooOO0o[i2] == l3Var) {
                while (i2 < i - 1) {
                    l3[] l3VarArr = this.OooOO0o;
                    int i3 = i2 + 1;
                    l3VarArr[i2] = l3VarArr[i3];
                    i2 = i3;
                }
                this.OooOOO0--;
                return;
            }
            i2++;
        }
    }

    public final void OooO0OO() {
        this.OooOOOO = 5;
        this.OooO0oO = 0;
        this.OooO0o0 = -1;
        this.OooO0o = -1;
        this.OooO0oo = 0.0f;
        this.OooO = false;
        int i = this.OooOOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooOO0o[i2] = null;
        }
        this.OooOOO0 = 0;
        this.OooOOO = 0;
        this.OooO0Oo = false;
        Arrays.fill(this.OooOO0O, 0.0f);
    }

    public final void OooO0Oo(vm0 vm0Var, float f) {
        this.OooO0oo = f;
        this.OooO = true;
        int i = this.OooOOO0;
        this.OooO0o = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooOO0o[i2].OooO0oo(vm0Var, this, false);
        }
        this.OooOOO0 = 0;
    }

    public final void OooO0o0(vm0 vm0Var, l3 l3Var) {
        int i = this.OooOOO0;
        for (int i2 = 0; i2 < i; i2++) {
            this.OooOO0o[i2].OooO(vm0Var, l3Var, false);
        }
        this.OooOOO0 = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.OooO0o0 - ((wh1) obj).OooO0o0;
    }

    public final String toString() {
        return "" + this.OooO0o0;
    }
}

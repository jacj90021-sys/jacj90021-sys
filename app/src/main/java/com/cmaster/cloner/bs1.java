package com.cmaster.cloner;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bs1 extends cs1 {
    public float OooO;
    public final Matrix OooO00o;
    public final ArrayList OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public float OooO0o;
    public float OooO0o0;
    public float OooO0oO;
    public float OooO0oo;
    public final Matrix OooOO0;
    public String OooOO0O;

    /* JADX WARN: Multi-variable type inference failed */
    public bs1(bs1 bs1Var, k3 k3Var) {
        zr1 zr1Var;
        this.OooO00o = new Matrix();
        this.OooO0O0 = new ArrayList();
        this.OooO0OO = 0.0f;
        this.OooO0Oo = 0.0f;
        this.OooO0o0 = 0.0f;
        this.OooO0o = 1.0f;
        this.OooO0oO = 1.0f;
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        Matrix matrix = new Matrix();
        this.OooOO0 = matrix;
        this.OooOO0O = null;
        this.OooO0OO = bs1Var.OooO0OO;
        this.OooO0Oo = bs1Var.OooO0Oo;
        this.OooO0o0 = bs1Var.OooO0o0;
        this.OooO0o = bs1Var.OooO0o;
        this.OooO0oO = bs1Var.OooO0oO;
        this.OooO0oo = bs1Var.OooO0oo;
        this.OooO = bs1Var.OooO;
        String str = bs1Var.OooOO0O;
        this.OooOO0O = str;
        if (str != null) {
            k3Var.put(str, this);
        }
        matrix.set(bs1Var.OooOO0);
        ArrayList arrayList = bs1Var.OooO0O0;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof bs1) {
                this.OooO0O0.add(new bs1((bs1) obj, k3Var));
            } else {
                if (obj instanceof as1) {
                    as1 as1Var = (as1) obj;
                    as1 as1Var2 = new as1(as1Var);
                    as1Var2.OooO0o0 = 0.0f;
                    as1Var2.OooO0oO = 1.0f;
                    as1Var2.OooO0oo = 1.0f;
                    as1Var2.OooO = 0.0f;
                    as1Var2.OooOO0 = 1.0f;
                    as1Var2.OooOO0O = 0.0f;
                    as1Var2.OooOO0o = Paint.Cap.BUTT;
                    as1Var2.OooOOO0 = Paint.Join.MITER;
                    as1Var2.OooOOO = 4.0f;
                    as1Var2.OooO0Oo = as1Var.OooO0Oo;
                    as1Var2.OooO0o0 = as1Var.OooO0o0;
                    as1Var2.OooO0oO = as1Var.OooO0oO;
                    as1Var2.OooO0o = as1Var.OooO0o;
                    as1Var2.OooO0OO = as1Var.OooO0OO;
                    as1Var2.OooO0oo = as1Var.OooO0oo;
                    as1Var2.OooO = as1Var.OooO;
                    as1Var2.OooOO0 = as1Var.OooOO0;
                    as1Var2.OooOO0O = as1Var.OooOO0O;
                    as1Var2.OooOO0o = as1Var.OooOO0o;
                    as1Var2.OooOOO0 = as1Var.OooOOO0;
                    as1Var2.OooOOO = as1Var.OooOOO;
                    zr1Var = as1Var2;
                } else {
                    if (!(obj instanceof zr1)) {
                        qa.OooO0o("Unknown object in the tree!");
                        throw null;
                    }
                    zr1Var = new zr1((zr1) obj);
                }
                this.OooO0O0.add(zr1Var);
                Object obj2 = zr1Var.OooO0O0;
                if (obj2 != null) {
                    k3Var.put(obj2, zr1Var);
                }
            }
        }
    }

    @Override // com.cmaster.cloner.cs1
    public final boolean OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((cs1) arrayList.get(i)).OooO00o()) {
                return true;
            }
            i++;
        }
    }

    @Override // com.cmaster.cloner.cs1
    public final boolean OooO0O0(int[] iArr) {
        int i = 0;
        boolean zOooO0O0 = false;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i >= arrayList.size()) {
                return zOooO0O0;
            }
            zOooO0O0 |= ((cs1) arrayList.get(i)).OooO0O0(iArr);
            i++;
        }
    }

    public final void OooO0OO() {
        Matrix matrix = this.OooOO0;
        matrix.reset();
        matrix.postTranslate(-this.OooO0Oo, -this.OooO0o0);
        matrix.postScale(this.OooO0o, this.OooO0oO);
        matrix.postRotate(this.OooO0OO, 0.0f, 0.0f);
        matrix.postTranslate(this.OooO0oo + this.OooO0Oo, this.OooO + this.OooO0o0);
    }

    public String getGroupName() {
        return this.OooOO0O;
    }

    public Matrix getLocalMatrix() {
        return this.OooOO0;
    }

    public float getPivotX() {
        return this.OooO0Oo;
    }

    public float getPivotY() {
        return this.OooO0o0;
    }

    public float getRotation() {
        return this.OooO0OO;
    }

    public float getScaleX() {
        return this.OooO0o;
    }

    public float getScaleY() {
        return this.OooO0oO;
    }

    public float getTranslateX() {
        return this.OooO0oo;
    }

    public float getTranslateY() {
        return this.OooO;
    }

    public void setPivotX(float f) {
        if (f != this.OooO0Oo) {
            this.OooO0Oo = f;
            OooO0OO();
        }
    }

    public void setPivotY(float f) {
        if (f != this.OooO0o0) {
            this.OooO0o0 = f;
            OooO0OO();
        }
    }

    public void setRotation(float f) {
        if (f != this.OooO0OO) {
            this.OooO0OO = f;
            OooO0OO();
        }
    }

    public void setScaleX(float f) {
        if (f != this.OooO0o) {
            this.OooO0o = f;
            OooO0OO();
        }
    }

    public void setScaleY(float f) {
        if (f != this.OooO0oO) {
            this.OooO0oO = f;
            OooO0OO();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.OooO0oo) {
            this.OooO0oo = f;
            OooO0OO();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.OooO) {
            this.OooO = f;
            OooO0OO();
        }
    }

    public bs1() {
        this.OooO00o = new Matrix();
        this.OooO0O0 = new ArrayList();
        this.OooO0OO = 0.0f;
        this.OooO0Oo = 0.0f;
        this.OooO0o0 = 0.0f;
        this.OooO0o = 1.0f;
        this.OooO0oO = 1.0f;
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = new Matrix();
        this.OooOO0O = null;
    }
}

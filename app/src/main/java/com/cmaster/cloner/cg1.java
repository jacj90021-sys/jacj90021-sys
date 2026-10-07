package com.cmaster.cloner;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cg1 {
    public final kg1[] OooO00o = new kg1[4];
    public final Matrix[] OooO0O0 = new Matrix[4];
    public final Matrix[] OooO0OO = new Matrix[4];
    public final PointF OooO0Oo = new PointF();
    public final Path OooO0o0 = new Path();
    public final Path OooO0o = new Path();
    public final kg1 OooO0oO = new kg1();
    public final float[] OooO0oo = new float[2];
    public final float[] OooO = new float[2];
    public final Path OooOO0 = new Path();
    public final Path OooOO0O = new Path();
    public final boolean OooOO0o = true;

    public cg1() {
        for (int i = 0; i < 4; i++) {
            this.OooO00o[i] = new kg1();
            this.OooO0O0[i] = new Matrix();
            this.OooO0OO[i] = new Matrix();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public final void OooO00o(ag1 ag1Var, float[] fArr, float f, RectF rectF, ay1 ay1Var, Path path) {
        Matrix[] matrixArr;
        float[] fArr2;
        int i;
        kg1[] kg1VarArr;
        Matrix[] matrixArr2;
        boolean z;
        float f2;
        boolean z2;
        int i2;
        path.rewind();
        Path path2 = this.OooO0o0;
        path2.rewind();
        Path path3 = this.OooO0o;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = this.OooO0OO;
            fArr2 = this.OooO0oo;
            kg1VarArr = this.OooO00o;
            matrixArr2 = this.OooO0O0;
            z = 0;
            if (i3 >= 4) {
                break;
            }
            qj mdVar = fArr == null ? i3 != 1 ? i3 != 2 ? i3 != 3 ? ag1Var.OooO0o : ag1Var.OooO0o0 : ag1Var.OooO0oo : ag1Var.OooO0oO : new md(fArr[i3]);
            gp2 gp2Var = i3 != 1 ? i3 != 2 ? i3 != 3 ? ag1Var.OooO0O0 : ag1Var.OooO00o : ag1Var.OooO0Oo : ag1Var.OooO0OO;
            kg1 kg1Var = kg1VarArr[i3];
            gp2Var.getClass();
            gp2Var.OooO00o(kg1Var, f, mdVar.OooO00o(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = this.OooO0Oo;
            if (i3 == 1) {
                i2 = i3;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i3;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i3;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i3;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f3);
            kg1 kg1Var2 = kg1VarArr[i2];
            fArr2[0] = kg1Var2.OooO0O0;
            fArr2[1] = kg1Var2.OooO0OO;
            matrixArr2[i2].mapPoints(fArr2);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr2[0], fArr2[1]);
            matrixArr[i2].preRotate(f3);
            i3 = i4;
        }
        int i5 = 0;
        for (i = 4; i5 < i; i = 4) {
            kg1 kg1Var3 = kg1VarArr[i5];
            kg1Var3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = kg1Var3.OooO00o;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 0) {
                path.moveTo(fArr2[z], fArr2[1]);
            } else {
                path.lineTo(fArr2[z], fArr2[1]);
            }
            kg1VarArr[i5].OooO0O0(matrixArr2[i5], path);
            if (ay1Var != null) {
                kg1 kg1Var4 = kg1VarArr[i5];
                Matrix matrix = matrixArr2[i5];
                wq0 wq0Var = (wq0) ay1Var.OooO0o0;
                f2 = 0.0f;
                BitSet bitSet = wq0Var.OooO0oo;
                kg1Var4.getClass();
                bitSet.set(i5, z);
                jg1[] jg1VarArr = wq0Var.OooO0o;
                kg1Var4.OooO00o(kg1Var4.OooO0o0);
                jg1VarArr[i5] = new dg1(new ArrayList(kg1Var4.OooO0oO), new Matrix(matrix));
            } else {
                f2 = 0.0f;
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            kg1 kg1Var5 = kg1VarArr[i5];
            fArr2[0] = kg1Var5.OooO0O0;
            fArr2[1] = kg1Var5.OooO0OO;
            matrixArr2[i5].mapPoints(fArr2);
            kg1 kg1Var6 = kg1VarArr[i7];
            kg1Var6.getClass();
            float[] fArr3 = this.OooO;
            fArr3[0] = f2;
            fArr3[1] = kg1Var6.OooO00o;
            matrixArr2[i7].mapPoints(fArr3);
            Matrix[] matrixArr3 = matrixArr;
            kg1[] kg1VarArr2 = kg1VarArr;
            float fMax = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            kg1 kg1Var7 = kg1VarArr2[i5];
            fArr2[0] = kg1Var7.OooO0O0;
            fArr2[1] = kg1Var7.OooO0OO;
            matrixArr2[i5].mapPoints(fArr2);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr2[0]);
            } else {
                Math.abs(rectF.centerY() - fArr2[1]);
            }
            kg1 kg1Var8 = this.OooO0oO;
            kg1Var8.OooO0Oo(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? ag1Var.OooOO0 : ag1Var.OooO : ag1Var.OooOO0o : ag1Var.OooOO0O).getClass();
            kg1Var8.OooO0OO(fMax, 0.0f);
            Path path4 = this.OooOO0;
            path4.reset();
            kg1Var8.OooO0O0(matrixArr3[i5], path4);
            if (this.OooOO0o && (OooO0O0(path4, i5) || OooO0O0(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = kg1Var8.OooO00o;
                matrixArr3[i5].mapPoints(fArr2);
                path2.moveTo(fArr2[0], fArr2[1]);
                kg1Var8.OooO0O0(matrixArr3[i5], path2);
            } else {
                kg1Var8.OooO0O0(matrixArr3[i5], path);
            }
            if (ay1Var != null) {
                Matrix matrix2 = matrixArr3[i5];
                wq0 wq0Var2 = (wq0) ay1Var.OooO0o0;
                z2 = false;
                wq0Var2.OooO0oo.set(i5 + 4, false);
                jg1[] jg1VarArr2 = wq0Var2.OooO0oO;
                kg1Var8.OooO00o(kg1Var8.OooO0o0);
                jg1VarArr2[i5] = new dg1(new ArrayList(kg1Var8.OooO0oO), new Matrix(matrix2));
            } else {
                z2 = false;
            }
            matrixArr = matrixArr3;
            i5 = i6;
            z = z2;
            kg1VarArr = kg1VarArr2;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    public final boolean OooO0O0(Path path, int i) {
        Path path2 = this.OooOO0O;
        path2.reset();
        this.OooO00o[i].OooO0O0(this.OooO0O0[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }
}

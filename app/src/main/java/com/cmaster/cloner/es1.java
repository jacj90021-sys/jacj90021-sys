package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class es1 {
    public static final Matrix OooOOOo = new Matrix();
    public float OooO;
    public final Path OooO00o;
    public final Path OooO0O0;
    public final Matrix OooO0OO;
    public Paint OooO0Oo;
    public PathMeasure OooO0o;
    public Paint OooO0o0;
    public final bs1 OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public int OooOO0o;
    public Boolean OooOOO;
    public String OooOOO0;
    public final k3 OooOOOO;

    public es1(es1 es1Var) {
        this.OooO0OO = new Matrix();
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = 0.0f;
        this.OooOO0O = 0.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = null;
        this.OooOOO = null;
        k3 k3Var = new k3(0);
        this.OooOOOO = k3Var;
        this.OooO0oO = new bs1(es1Var.OooO0oO, k3Var);
        this.OooO00o = new Path(es1Var.OooO00o);
        this.OooO0O0 = new Path(es1Var.OooO0O0);
        this.OooO0oo = es1Var.OooO0oo;
        this.OooO = es1Var.OooO;
        this.OooOO0 = es1Var.OooOO0;
        this.OooOO0O = es1Var.OooOO0O;
        this.OooOO0o = es1Var.OooOO0o;
        this.OooOOO0 = es1Var.OooOOO0;
        String str = es1Var.OooOOO0;
        if (str != null) {
            k3Var.put(str, this);
        }
        this.OooOOO = es1Var.OooOOO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(bs1 bs1Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        float f2;
        Matrix matrix2 = bs1Var.OooO00o;
        ArrayList arrayList = bs1Var.OooO0O0;
        matrix2.set(matrix);
        Matrix matrix3 = bs1Var.OooO00o;
        matrix3.preConcat(bs1Var.OooOO0);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            cs1 cs1Var = (cs1) arrayList.get(i5);
            if (cs1Var instanceof bs1) {
                OooO00o((bs1) cs1Var, matrix3, canvas, i, i2);
            } else if (cs1Var instanceof ds1) {
                ds1 ds1Var = (ds1) cs1Var;
                float f3 = i / this.OooOO0;
                float f4 = i2 / this.OooOO0O;
                float fMin = Math.min(f3, f4);
                Matrix matrix4 = this.OooO0OO;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                boolean z = c;
                i3 = i5;
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.OooO00o;
                    path.reset();
                    o21[] o21VarArr = ds1Var.OooO00o;
                    if (o21VarArr != null) {
                        o21.OooO0O0(o21VarArr, path);
                    }
                    Path path2 = this.OooO0O0;
                    path2.reset();
                    if (ds1Var instanceof zr1) {
                        path2.setFillType(ds1Var.OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        as1 as1Var = (as1) ds1Var;
                        float f6 = as1Var.OooO;
                        if (f6 != 0.0f || as1Var.OooOO0 != 1.0f) {
                            float f7 = as1Var.OooOO0O;
                            float f8 = (f6 + f7) % 1.0f;
                            float f9 = (as1Var.OooOO0 + f7) % 1.0f;
                            if (this.OooO0o == null) {
                                this.OooO0o = new PathMeasure();
                            }
                            this.OooO0o.setPath(path, z);
                            float length = this.OooO0o.getLength();
                            float f10 = f8 * length;
                            float f11 = f9 * length;
                            path.reset();
                            PathMeasure pathMeasure = this.OooO0o;
                            if (f10 > f11) {
                                pathMeasure.getSegment(f10, length, path, true);
                                f = 0.0f;
                                this.OooO0o.getSegment(0.0f, f11, path, true);
                            } else {
                                f = 0.0f;
                                pathMeasure.getSegment(f10, f11, path, true);
                            }
                            path.rLineTo(f, f);
                        }
                        path2.addPath(path, matrix4);
                        o00Oo00 o00oo00 = as1Var.OooO0o;
                        if (((Shader) o00oo00.OooO0o) == null && o00oo00.OooO0o0 == 0) {
                            f2 = 255.0f;
                            i4 = 16777215;
                        } else {
                            if (this.OooO0o0 == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.OooO0o0 = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.OooO0o0;
                            Shader shader = (Shader) o00oo00.OooO0o;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(as1Var.OooO0oo * 255.0f));
                                f2 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i6 = o00oo00.OooO0o0;
                                float f12 = as1Var.OooO0oo;
                                PorterDuff.Mode mode = hs1.OooOOO0;
                                f2 = 255.0f;
                                paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(as1Var.OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        o00Oo00 o00oo002 = as1Var.OooO0Oo;
                        if (((Shader) o00oo002.OooO0o) != null || o00oo002.OooO0o0 != 0) {
                            if (this.OooO0Oo == null) {
                                Paint paint3 = new Paint(1);
                                this.OooO0Oo = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.OooO0Oo;
                            Paint.Join join = as1Var.OooOOO0;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = as1Var.OooOO0o;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(as1Var.OooOOO);
                            Shader shader2 = (Shader) o00oo002.OooO0o;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(as1Var.OooO0oO * f2));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i7 = o00oo002.OooO0o0;
                                float f13 = as1Var.OooO0oO;
                                PorterDuff.Mode mode2 = hs1.OooOOO0;
                                paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(as1Var.OooO0o0 * fMin * fAbs);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.OooOO0o;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.OooOO0o = i;
    }

    public es1() {
        this.OooO0OO = new Matrix();
        this.OooO0oo = 0.0f;
        this.OooO = 0.0f;
        this.OooOO0 = 0.0f;
        this.OooOO0O = 0.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOOO = new k3(0);
        this.OooO0oO = new bs1();
        this.OooO00o = new Path();
        this.OooO0O0 = new Path();
    }
}

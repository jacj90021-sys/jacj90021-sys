package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fd extends ht {
    public float OooO;
    public float OooO0o;
    public float OooO0oO;
    public float OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public int OooOO0o;
    public boolean OooOOO;
    public float OooOOO0;
    public float OooOOOO;
    public final RectF OooOOOo;
    public final Pair OooOOo0;

    public fd(ld ldVar) {
        super(ldVar);
        this.OooOOOo = new RectF();
        this.OooOOo0 = new Pair(new gt(), new gt());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.ht
    public final void OooO00o() {
        int i;
        Path path = this.OooO0O0;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.OooO0o0;
        matrix.reset();
        float f = this.OooO;
        matrix.setScale(f, f);
        path.transform(matrix);
        boolean zOooO00o = this.OooO00o.OooO00o(this.OooOOO);
        PathMeasure pathMeasure = this.OooO0Oo;
        if (zOooO00o) {
            pathMeasure.setPath(path, false);
            float f2 = this.OooOO0O;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.OooOOO ? r2.OooOO0 : r2.OooOO0O)) / 2.0f)) * 2;
            this.OooOO0 = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < iMax; i4++) {
                gt gtVar = new gt();
                float f4 = i4;
                pathMeasure.getPosTan(this.OooOO0 * f4, gtVar.OooO00o, gtVar.OooO0O0);
                gt gtVar2 = new gt();
                float f5 = this.OooOO0;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), gtVar2.OooO00o, gtVar2.OooO0O0);
                arrayList.add(gtVar);
                gtVar2.OooO00o(f2 * 2.0f);
                arrayList.add(gtVar2);
            }
            arrayList.add((gt) arrayList.get(0));
            gt gtVar3 = (gt) arrayList.get(0);
            float[] fArr = gtVar3.OooO00o;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                gt gtVar4 = (gt) arrayList.get(i5);
                float f6 = (this.OooOO0 / f3) * 0.48f;
                float[] fArr2 = gtVar3.OooO00o;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i2, fArr3, i2, i);
                System.arraycopy(gtVar3.OooO0O0, i2, new float[i], i2, i);
                new Matrix();
                float[] fArr4 = gtVar4.OooO00o;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i2, fArr5, i2, i);
                System.arraycopy(gtVar4.OooO0O0, i2, new float[i], i2, i);
                new Matrix();
                char c2 = c;
                float fAtan2 = (float) Math.atan2(r6[c], r6[i2]);
                double d = fArr3[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = fAtan2;
                fArr3[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + fArr3[c2]);
                double d4 = -f6;
                double dAtan2 = (float) Math.atan2(r11[c2], r11[i6]);
                fArr5[i6] = (float) ((Math.cos(dAtan2) * d4) + fArr5[i6]);
                float fSin = (float) ((Math.sin(dAtan2) * d4) + fArr5[c2]);
                fArr5[c2] = fSin;
                float f7 = fArr3[i6];
                float f8 = fArr3[c2];
                float f9 = fArr5[i6];
                float[] fArr6 = gtVar4.OooO00o;
                path.cubicTo(f7, f8, f9, fSin, fArr6[i6], fArr6[c2]);
                i5++;
                gtVar3 = gtVar4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void OooO0OO(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.OooOOOO < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                OooO0OO(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                OooO0OO(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.OooO0oO / this.OooO);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float fOooO00o = aw2.OooO00o(1.0f - this.OooOOOO, 1.0f, f8);
        float fOooO00o2 = aw2.OooO00o(0.0f, this.OooOOOO, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.OooO);
        float degrees3 = ((fOooO00o2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.OooO));
        float f12 = (fOooO00o * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        ld ldVar = this.OooO00o;
        boolean z2 = ldVar.OooO00o(this.OooOOO) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.OooO0o);
        float f13 = this.OooO0oO * 2.0f;
        float f14 = degrees * 2.0f;
        PathMeasure pathMeasure = this.OooO0Oo;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            gt gtVar = new gt();
            if (z2) {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.OooO0oo * f3;
                float f18 = this.OooO;
                if (f18 != this.OooOOO0 || f17 != this.OooOO0O) {
                    this.OooOO0O = f17;
                    this.OooOOO0 = f18;
                    OooO00o();
                }
                pathMeasure.getPosTan(length, gtVar.OooO00o, gtVar.OooO0O0);
            } else {
                gtVar.OooO0OO(f16 + 90.0f);
                gtVar.OooO00o(-this.OooO);
            }
            paint.setStyle(Paint.Style.FILL);
            OooO0Oo(canvas, paint, gtVar, f13, this.OooO0o, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap((ldVar.OooO0Oo && ldVar.OooO0OO == 0.5f) ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.OooOOo0;
        ((gt) pair.first).OooO0O0();
        ((gt) pair.second).OooO0O0();
        if (z2) {
            float f21 = f19 / 360.0f;
            float f22 = f20 / 360.0f;
            float f23 = this.OooO0oo * f3;
            int i4 = this.OooOOO ? ldVar.OooOO0 : ldVar.OooOO0O;
            float f24 = this.OooO;
            if (f24 != this.OooOOO0 || f23 != this.OooOO0O || i4 != this.OooOO0o) {
                this.OooOO0O = f23;
                this.OooOO0o = i4;
                this.OooOOO0 = f24;
                OooO00o();
            }
            Path path = this.OooO0OO;
            path.rewind();
            float fOooO00o3 = cw2.OooO00o(f22, 0.0f, 1.0f);
            if (ldVar.OooO00o(this.OooOOO)) {
                f5 = 1.0f;
                float f25 = f4 / ((float) ((this.OooO * 6.283185307179586d) / this.OooOO0));
                f21 += f25;
                f6 = 0.0f - (f25 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f26 = f21 % f5;
            float length2 = (pathMeasure.getLength() * f26) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f26 + fOooO00o3)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            gt gtVar2 = (gt) pair.first;
            gtVar2.OooO0O0();
            pathMeasure.getPosTan(length2, gtVar2.OooO00o, gtVar2.OooO0O0);
            gt gtVar3 = (gt) pair.second;
            gtVar3.OooO0O0();
            pathMeasure.getPosTan(length3, gtVar3.OooO00o, gtVar3.OooO0O0);
            Matrix matrix = this.OooO0o0;
            matrix.reset();
            matrix.setRotate(f6);
            gtVar2.OooO0OO(f6);
            gtVar3.OooO0OO(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((gt) pair.first).OooO0OO(f19 + 90.0f);
            ((gt) pair.first).OooO00o(-this.OooO);
            ((gt) pair.second).OooO0OO(f19 + f20 + 90.0f);
            ((gt) pair.second).OooO00o(-this.OooO);
            float f27 = this.OooO;
            float f28 = -f27;
            RectF rectF = this.OooOOOo;
            rectF.set(f28, f28, f27, f27);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        }
        if (!(ldVar.OooO0Oo && ldVar.OooO0OO == 0.5f) && this.OooO0oO > 0.0f) {
            paint.setStyle(Paint.Style.FILL);
            OooO0Oo(canvas2, paint, (gt) pair.first, f13, this.OooO0o, 1.0f);
            OooO0Oo(canvas, paint, (gt) pair.second, f13, this.OooO0o, 1.0f);
        }
    }

    public final void OooO0Oo(Canvas canvas, Paint paint, gt gtVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.OooO0o);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.OooO0oO * fMin) / this.OooO0o);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = gtVar.OooO00o;
        canvas.translate(fArr[0], fArr[1]);
        float[] fArr2 = gtVar.OooO0O0;
        canvas.rotate((float) Math.toDegrees(Math.atan2(fArr2[1], fArr2[0])));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final void OooO0o(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iOooO00o = uv2.OooO00o(i, i2);
        this.OooOOO = false;
        OooO0OO(canvas, paint, f, f2, iOooO00o, i3, i3, 0.0f, 0.0f, false);
    }

    public final void OooO0o0(Canvas canvas, Paint paint, ft ftVar, int i) {
        int iOooO00o = uv2.OooO00o(ftVar.OooO0OO, i);
        canvas.save();
        canvas.rotate(ftVar.OooO0o);
        this.OooOOO = ftVar.OooO0oO;
        OooO0OO(canvas, paint, ftVar.OooO00o, ftVar.OooO0O0, iOooO00o, 0, 0, ftVar.OooO0Oo, ftVar.OooO0o0, true);
        canvas.restore();
    }

    public final int OooO0oO() {
        ld ldVar = this.OooO00o;
        return (ldVar.OooOOo0 * 2) + ldVar.OooOOOo;
    }
}

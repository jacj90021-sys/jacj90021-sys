package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pq0 extends Drawable {
    public final Paint OooO;
    public final View OooO00o;
    public final RectF OooO0O0;
    public final ag1 OooO0OO;
    public final float OooO0Oo;
    public final RectF OooO0o;
    public final View OooO0o0;
    public final ag1 OooO0oO;
    public final float OooO0oo;
    public final Paint OooOO0;
    public final Paint OooOO0O;
    public final Paint OooOO0o;
    public final yo OooOOO;
    public final Paint OooOOO0;
    public final PathMeasure OooOOOO;
    public final float OooOOOo;
    public final boolean OooOOo;
    public final float[] OooOOo0;
    public final float OooOOoo;
    public final RectF OooOo;
    public final boolean OooOo0;
    public final float OooOo00;
    public final wq0 OooOo0O;
    public final RectF OooOo0o;
    public final RectF OooOoO;
    public final RectF OooOoO0;
    public final ho1 OooOoOO;
    public final e00 OooOoo;
    public final oy OooOoo0;
    public py OooOooO;
    public pa OooOooo;
    public float Oooo0;
    public RectF Oooo000;
    public float Oooo00O;
    public float Oooo00o;

    public pq0(PathMotion pathMotion, View view, RectF rectF, ag1 ag1Var, float f, View view2, RectF rectF2, ag1 ag1Var2, float f2, int i, int i2, boolean z, boolean z2, oy oyVar, e00 e00Var, ho1 ho1Var) {
        Paint paint = new Paint();
        this.OooO = paint;
        Paint paint2 = new Paint();
        this.OooOO0 = paint2;
        Paint paint3 = new Paint();
        this.OooOO0O = paint3;
        this.OooOO0o = new Paint();
        Paint paint4 = new Paint();
        this.OooOOO0 = paint4;
        yo yoVar = new yo();
        yoVar.OooO0Oo = new Path();
        yoVar.OooO0o0 = new Path();
        yoVar.OooO0o = new Path();
        yoVar.OooO0oO = bg1.OooO00o;
        this.OooOOO = yoVar;
        this.OooOOo0 = new float[]{rectF.centerX(), rectF.top};
        wq0 wq0Var = new wq0();
        this.OooOo0O = wq0Var;
        Paint paint5 = new Paint();
        new Path();
        this.OooO00o = view;
        this.OooO0O0 = rectF;
        this.OooO0OO = ag1Var;
        this.OooO0Oo = f;
        this.OooO0o0 = view2;
        this.OooO0o = rectF2;
        this.OooO0oO = ag1Var2;
        this.OooO0oo = f2;
        this.OooOOo = z;
        this.OooOo0 = z2;
        this.OooOoo0 = oyVar;
        this.OooOoo = e00Var;
        this.OooOoOO = ho1Var;
        WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
        this.OooOOoo = r13.widthPixels;
        this.OooOo00 = r13.heightPixels;
        paint.setColor(i);
        paint2.setColor(0);
        paint3.setColor(0);
        wq0Var.OooOO0o(ColorStateList.valueOf(0));
        wq0Var.OooOOO();
        wq0Var.OooOoOO = false;
        wq0Var.OooOOO0();
        RectF rectF3 = new RectF(rectF);
        this.OooOo0o = rectF3;
        this.OooOo = new RectF(rectF3);
        RectF rectF4 = new RectF(rectF3);
        this.OooOoO0 = rectF4;
        this.OooOoO = new RectF(rectF4);
        PointF pointF = new PointF(rectF.centerX(), rectF.top);
        PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
        PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
        this.OooOOOO = pathMeasure;
        this.OooOOOo = pathMeasure.getLength();
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF5 = dp1.OooO00o;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i2, i2, Shader.TileMode.CLAMP));
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeWidth(10.0f);
        OooO0Oo(0.0f);
    }

    public final void OooO00o(Canvas canvas) {
        OooO0OO(canvas, this.OooOO0O);
        Rect bounds = getBounds();
        RectF rectF = this.OooOoO0;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.OooOooo.OooO0O0;
        int i = this.OooOooO.OooO0O0;
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            RectF rectF2 = dp1.OooO00o;
            rectF2.set(bounds);
            canvas.saveLayerAlpha(rectF2, i);
        }
        this.OooO0o0.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void OooO0O0(Canvas canvas) {
        OooO0OO(canvas, this.OooOO0);
        Rect bounds = getBounds();
        RectF rectF = this.OooOo0o;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.OooOooo.OooO00o;
        int i = this.OooOooO.OooO00o;
        if (i <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(f, f2);
        canvas.scale(f3, f3);
        if (i < 255) {
            RectF rectF2 = dp1.OooO00o;
            rectF2.set(bounds);
            canvas.saveLayerAlpha(rectF2, i);
        }
        this.OooO00o.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void OooO0OO(Canvas canvas, Paint paint) {
        if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
            return;
        }
        canvas.drawRect(getBounds(), paint);
    }

    public final void OooO0Oo(float f) {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        Path path;
        float f5;
        this.Oooo0 = f;
        this.OooOOO0.setAlpha((int) (this.OooOOo ? dp1.OooO0OO(0.0f, 255.0f, f) : dp1.OooO0OO(255.0f, 0.0f, f)));
        float f6 = this.OooOOOo;
        PathMeasure pathMeasure = this.OooOOOO;
        float[] fArr = this.OooOOo0;
        pathMeasure.getPosTan(f6 * f, fArr, null);
        float f7 = fArr[0];
        float f8 = fArr[1];
        if (f > 1.0f || f < 0.0f) {
            if (f > 1.0f) {
                f3 = (f - 1.0f) / 0.00999999f;
                f2 = 0.99f;
            } else {
                f2 = 0.01f;
                f3 = (f / 0.01f) * (-1.0f);
            }
            pathMeasure.getPosTan(f6 * f2, fArr, null);
            f7 += (f7 - fArr[0]) * f3;
            f8 += (f8 - fArr[1]) * f3;
        }
        float f9 = f8;
        float f10 = f7;
        ho1 ho1Var = this.OooOoOO;
        zt ztVar = (zt) ho1Var.OooO0o;
        zt ztVar2 = (zt) ho1Var.OooO0o0;
        zt ztVar3 = (zt) ho1Var.OooO0oO;
        float f11 = ztVar.OooO00o;
        float f12 = ((zt) ho1Var.OooO0o).OooO0O0;
        RectF rectF2 = this.OooO0O0;
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        RectF rectF3 = this.OooO0o;
        pa paVarOooOO0 = this.OooOoo.OooOO0(f, f11, f12, fWidth, fHeight, rectF3.width(), rectF3.height());
        this.OooOooo = paVarOooOO0;
        float f13 = paVarOooOO0.OooO0OO / 2.0f;
        float f14 = paVarOooOO0.OooO0Oo + f9;
        RectF rectF4 = this.OooOo0o;
        rectF4.set(f10 - f13, f9, f13 + f10, f14);
        pa paVar = this.OooOooo;
        float f15 = paVar.OooO0o0 / 2.0f;
        float f16 = paVar.OooO0o + f9;
        RectF rectF5 = this.OooOoO0;
        rectF5.set(f10 - f15, f9, f15 + f10, f16);
        RectF rectF6 = this.OooOo;
        rectF6.set(rectF4);
        RectF rectF7 = this.OooOoO;
        rectF7.set(rectF5);
        float f17 = ztVar3.OooO00o;
        float f18 = ztVar3.OooO0O0;
        pa paVar2 = this.OooOooo;
        e00 e00Var = this.OooOoo;
        boolean zOooOO0o = e00Var.OooOO0o(paVar2);
        RectF rectF8 = zOooOO0o ? rectF6 : rectF7;
        float fOooO0Oo = dp1.OooO0Oo(0.0f, 1.0f, f17, f18, f, false);
        if (!zOooOO0o) {
            fOooO0Oo = 1.0f - fOooO0Oo;
        }
        e00Var.OooO0OO(rectF8, fOooO0Oo, this.OooOooo);
        this.Oooo000 = new RectF(Math.min(rectF6.left, rectF7.left), Math.min(rectF6.top, rectF7.top), Math.max(rectF6.right, rectF7.right), Math.max(rectF6.bottom, rectF7.bottom));
        zt ztVar4 = (zt) ho1Var.OooO0oo;
        yo yoVar = this.OooOOO;
        Path path2 = (Path) yoVar.OooO0o;
        Path path3 = (Path) yoVar.OooO0o0;
        cg1 cg1Var = (cg1) yoVar.OooO0oO;
        float f19 = ztVar4.OooO00o;
        float f20 = ztVar4.OooO0O0;
        ag1 ag1VarOooO00o = this.OooO0OO;
        if (f < f19) {
            f5 = f;
            rectF = rectF6;
            f4 = 1.0f;
            path = path2;
        } else {
            ag1 ag1Var = this.OooO0oO;
            if (f > f20) {
                f5 = f;
                rectF = rectF6;
                f4 = 1.0f;
                path = path2;
                ag1VarOooO00o = ag1Var;
            } else {
                qj qjVar = ag1VarOooO00o.OooO0o0;
                qj qjVar2 = ag1VarOooO00o.OooO0oo;
                qj qjVar3 = ag1VarOooO00o.OooO0oO;
                qj qjVar4 = ag1VarOooO00o.OooO0o;
                yf1 yf1VarOooO0o = ((qjVar.OooO00o(rectF4) == 0.0f && qjVar4.OooO00o(rectF4) == 0.0f && qjVar3.OooO00o(rectF4) == 0.0f && qjVar2.OooO00o(rectF4) == 0.0f) ? ag1Var : ag1VarOooO00o).OooO0o();
                f4 = 1.0f;
                rectF = rectF6;
                path = path2;
                yf1VarOooO0o.OooO0o0 = new OooOO0(dp1.OooO0Oo(ag1VarOooO00o.OooO0o0.OooO00o(rectF4), ag1Var.OooO0o0.OooO00o(rectF7), f19, f20, f, false));
                yf1VarOooO0o.OooO0o = new OooOO0(dp1.OooO0Oo(qjVar4.OooO00o(rectF4), ag1Var.OooO0o.OooO00o(rectF7), f19, f20, f, false));
                yf1VarOooO0o.OooO0oo = new OooOO0(dp1.OooO0Oo(qjVar2.OooO00o(rectF4), ag1Var.OooO0oo.OooO00o(rectF7), f19, f20, f, false));
                f5 = f;
                yf1VarOooO0o.OooO0oO = new OooOO0(dp1.OooO0Oo(qjVar3.OooO00o(rectF4), ag1Var.OooO0oO.OooO00o(rectF7), f19, f20, f5, false));
                ag1VarOooO00o = yf1VarOooO0o.OooO00o();
            }
        }
        yoVar.OooO0oo = ag1VarOooO00o;
        cg1Var.OooO00o(ag1VarOooO00o, null, 1.0f, rectF, null, path3);
        Path path4 = path;
        cg1Var.OooO00o((ag1) yoVar.OooO0oo, null, 1.0f, rectF7, null, path4);
        ((Path) yoVar.OooO0Oo).op(path3, path4, Path.Op.UNION);
        this.Oooo00O = dp1.OooO0OO(this.OooO0Oo, this.OooO0oo, f5);
        float fCenterX = ((this.Oooo000.centerX() / (this.OooOOoo / 2.0f)) - f4) * 0.3f;
        float fCenterY = (this.Oooo000.centerY() / this.OooOo00) * 1.5f;
        float f21 = this.Oooo00O;
        float f22 = (int) (fCenterY * f21);
        this.Oooo00o = f22;
        this.OooOO0o.setShadowLayer(f21, (int) (fCenterX * f21), f22, 754974720);
        this.OooOooO = this.OooOoo0.OooO0OO(f5, ztVar2.OooO00o, ztVar2.OooO0O0);
        Paint paint = this.OooOO0;
        if (paint.getColor() != 0) {
            paint.setAlpha(this.OooOooO.OooO00o);
        }
        Paint paint2 = this.OooOO0O;
        if (paint2.getColor() != 0) {
            paint2.setAlpha(this.OooOooO.OooO0O0);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.OooOOO0;
        if (paint.getAlpha() > 0) {
            canvas.drawRect(getBounds(), paint);
        }
        boolean z = this.OooOo0;
        yo yoVar = this.OooOOO;
        if (z && this.Oooo00O > 0.0f) {
            canvas.save();
            canvas.clipPath((Path) yoVar.OooO0Oo, Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                ag1 ag1Var = (ag1) yoVar.OooO0oo;
                boolean zOooO0o0 = ag1Var.OooO0o0(this.Oooo000);
                Paint paint2 = this.OooOO0o;
                if (zOooO0o0) {
                    float fOooO00o = ag1Var.OooO0o0.OooO00o(this.Oooo000);
                    canvas.drawRoundRect(this.Oooo000, fOooO00o, fOooO00o, paint2);
                } else {
                    canvas.drawPath((Path) yoVar.OooO0Oo, paint2);
                }
            } else {
                RectF rectF = this.Oooo000;
                int i = (int) rectF.left;
                int i2 = (int) rectF.top;
                int i3 = (int) rectF.right;
                int i4 = (int) rectF.bottom;
                wq0 wq0Var = this.OooOo0O;
                wq0Var.setBounds(i, i2, i3, i4);
                wq0Var.OooOO0O(this.Oooo00O);
                wq0Var.OooOOOO((int) this.Oooo00o);
                wq0Var.setShapeAppearanceModel((ag1) yoVar.OooO0oo);
                wq0Var.draw(canvas);
            }
            canvas.restore();
        }
        canvas.clipPath((Path) yoVar.OooO0Oo);
        OooO0OO(canvas, this.OooO);
        if (this.OooOooO.OooO0OO) {
            OooO0O0(canvas);
            OooO00o(canvas);
        } else {
            OooO00o(canvas);
            OooO0O0(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Setting alpha on is not supported");
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Setting a color filter is not supported");
    }
}

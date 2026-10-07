package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class wq0 extends Drawable implements lg1 {
    public static final Paint Oooo0;
    public static final vq0[] Oooo0O0;
    public boolean OooO;
    public final o00OO000 OooO0Oo;
    public final jg1[] OooO0o;
    public uq0 OooO0o0;
    public final jg1[] OooO0oO;
    public final BitSet OooO0oo;
    public boolean OooOO0;
    public final Matrix OooOO0O;
    public final Path OooOO0o;
    public final RectF OooOOO;
    public final Path OooOOO0;
    public final RectF OooOOOO;
    public final Region OooOOOo;
    public final Paint OooOOo;
    public final Region OooOOo0;
    public final Paint OooOOoo;
    public PorterDuffColorFilter OooOo;
    public final ay1 OooOo0;
    public final xf1 OooOo00;
    public final cg1 OooOo0O;
    public PorterDuffColorFilter OooOo0o;
    public final RectF OooOoO;
    public int OooOoO0;
    public boolean OooOoOO;
    public ag1 OooOoo;
    public boolean OooOoo0;
    public gi1 OooOooO;
    public final fi1[] OooOooo;
    public float[] Oooo000;
    public float[] Oooo00O;
    public pg0 Oooo00o;

    static {
        Paint paint = new Paint(1);
        Oooo0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Oooo0O0 = new vq0[4];
        int i = 0;
        while (true) {
            vq0[] vq0VarArr = Oooo0O0;
            if (i >= vq0VarArr.length) {
                return;
            }
            vq0VarArr[i] = new vq0(i);
            i++;
        }
    }

    public wq0(uq0 uq0Var) {
        this.OooO0Oo = new o00OO000(this, 19);
        this.OooO0o = new jg1[4];
        this.OooO0oO = new jg1[4];
        this.OooO0oo = new BitSet(8);
        this.OooOO0O = new Matrix();
        this.OooOO0o = new Path();
        this.OooOOO0 = new Path();
        this.OooOOO = new RectF();
        this.OooOOOO = new RectF();
        this.OooOOOo = new Region();
        this.OooOOo0 = new Region();
        Paint paint = new Paint(1);
        this.OooOOo = paint;
        Paint paint2 = new Paint(1);
        this.OooOOoo = paint2;
        this.OooOo00 = new xf1();
        this.OooOo0O = Looper.getMainLooper().getThread() == Thread.currentThread() ? bg1.OooO00o : new cg1();
        this.OooOoO = new RectF();
        this.OooOoOO = true;
        this.OooOoo0 = true;
        this.OooOooo = new fi1[4];
        this.OooO0o0 = uq0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        OooOOoo();
        OooOOo0(getState());
        this.OooOo0 = new ay1(this, 28);
    }

    public static float OooO0O0(RectF rectF, ag1 ag1Var, float[] fArr) {
        if (fArr == null) {
            if (ag1Var.OooO0o0(rectF)) {
                return ag1Var.OooO0o0.OooO00o(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (ag1Var.OooO0Oo()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void OooO(Context context) {
        this.OooO0o0.OooO0OO = new mu(context);
        OooOo00();
    }

    public final void OooO00o(RectF rectF, Path path) {
        uq0 uq0Var = this.OooO0o0;
        this.OooOo0O.OooO00o(uq0Var.OooO00o, this.Oooo000, uq0Var.OooOO0, rectF, this.OooOo0, path);
        if (this.OooO0o0.OooO != 1.0f) {
            Matrix matrix = this.OooOO0O;
            matrix.reset();
            float f = this.OooO0o0.OooO;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.OooOoO, true);
    }

    public final int OooO0OO(int i) {
        int i2;
        uq0 uq0Var = this.OooO0o0;
        float f = uq0Var.OooOOO + 0.0f + uq0Var.OooOOO0;
        mu muVar = uq0Var.OooO0OO;
        if (muVar == null || !muVar.OooO00o || ye.OooO0Oo(i, 255) != muVar.OooO0Oo) {
            return i;
        }
        float fMin = (muVar.OooO0o0 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iOooO0o0 = uv2.OooO0o0(ye.OooO0Oo(i, 255), muVar.OooO0O0, fMin);
        if (fMin > 0.0f && (i2 = muVar.OooO0OO) != 0) {
            iOooO0o0 = ye.OooO0O0(ye.OooO0Oo(i2, mu.OooO0o), iOooO0o0);
        }
        return ye.OooO0Oo(iOooO0o0, iAlpha);
    }

    public final void OooO0Oo(Canvas canvas) {
        if (this.OooO0oo.cardinality() > 0) {
            Log.w("wq0", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.OooO0o0.OooOOo0;
        Path path = this.OooOO0o;
        xf1 xf1Var = this.OooOo00;
        if (i != 0) {
            canvas.drawPath(path, (Paint) xf1Var.OooO0Oo);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            jg1 jg1Var = this.OooO0o[i2];
            int i3 = this.OooO0o0.OooOOOo;
            Matrix matrix = jg1.OooO0O0;
            jg1Var.OooO00o(matrix, xf1Var, i3, canvas);
            this.OooO0oO[i2].OooO00o(matrix, xf1Var, this.OooO0o0.OooOOOo, canvas);
        }
        if (this.OooOoOO) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * this.OooO0o0.OooOOo0);
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * this.OooO0o0.OooOOo0);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, Oooo0);
            canvas.translate(iSin, iCos);
        }
    }

    public final RectF OooO0o() {
        Rect bounds = getBounds();
        RectF rectF = this.OooOOO;
        rectF.set(bounds);
        return rectF;
    }

    public void OooO0o0(Canvas canvas) {
        ag1 ag1Var = this.OooOoo;
        float[] fArr = this.Oooo00O;
        RectF rectFOooO0o = OooO0o();
        RectF rectF = this.OooOOOO;
        rectF.set(rectFOooO0o);
        float fOooO0oO = OooO0oO();
        rectF.inset(fOooO0oO, fOooO0oO);
        float fOooO0O0 = OooO0O0(rectF, ag1Var, fArr);
        Paint paint = this.OooOOoo;
        if (fOooO0O0 < 0.0f) {
            canvas.drawPath(this.OooOOO0, paint);
        } else {
            float f = fOooO0O0 * this.OooO0o0.OooOO0;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final float OooO0oO() {
        if (OooO0oo()) {
            return this.OooOOoo.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final boolean OooO0oo() {
        Paint.Style style = this.OooO0o0.OooOOo;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.OooOOoo.getStrokeWidth() > 0.0f;
    }

    public final void OooOO0(gi1 gi1Var) {
        if (this.OooOooO == gi1Var) {
            return;
        }
        this.OooOooO = gi1Var;
        int i = 0;
        while (true) {
            fi1[] fi1VarArr = this.OooOooo;
            if (i >= fi1VarArr.length) {
                OooOOo(getState(), true);
                invalidateSelf();
                return;
            }
            if (fi1VarArr[i] == null) {
                fi1VarArr[i] = new fi1(this, Oooo0O0[i]);
            }
            fi1 fi1Var = fi1VarArr[i];
            gi1 gi1Var2 = new gi1();
            gi1Var2.OooO00o((float) gi1Var.OooO0O0);
            double d = gi1Var.OooO00o;
            gi1Var2.OooO0O0((float) (d * d));
            fi1Var.OooOO0O = gi1Var2;
            i++;
        }
    }

    public final void OooOO0O(float f) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooOOO != f) {
            uq0Var.OooOOO = f;
            OooOo00();
        }
    }

    public final void OooOO0o(ColorStateList colorStateList) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooO0Oo != colorStateList) {
            uq0Var.OooO0Oo = colorStateList;
            onStateChange(getState());
        }
    }

    public final void OooOOO() {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooOOOO != 2) {
            uq0Var.OooOOOO = 2;
            super.invalidateSelf();
        }
    }

    public final void OooOOO0() {
        this.OooOo00.OooO00o(-7829368);
        this.OooO0o0.getClass();
        super.invalidateSelf();
    }

    public final void OooOOOO(int i) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooOOo0 != i) {
            uq0Var.OooOOo0 = i;
            super.invalidateSelf();
        }
    }

    public final void OooOOOo(ti1 ti1Var) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooO0O0 != ti1Var) {
            uq0Var.OooO0O0 = ti1Var;
            OooOOo(getState(), true);
            invalidateSelf();
        }
    }

    public final void OooOOo(int[] iArr, boolean z) {
        int i;
        RectF rectFOooO0o = OooO0o();
        if (this.OooO0o0.OooO0O0 == null || rectFOooO0o.isEmpty()) {
            return;
        }
        int i2 = 0;
        boolean z2 = z | (this.OooOooO == null);
        if (this.Oooo000 == null) {
            this.Oooo000 = new float[4];
        }
        ti1 ti1Var = this.OooO0o0.OooO0O0;
        int[][] iArr2 = ti1Var.OooO0OO;
        int i3 = ti1Var.OooO00o;
        int i4 = 0;
        while (true) {
            i = -1;
            if (i4 >= i3) {
                i4 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i4], iArr)) {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = ti1Var.OooO0OO;
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i5], iArr3)) {
                    i = i5;
                    break;
                }
                i5++;
            }
            i4 = i;
        }
        ag1 ag1Var = ti1Var.OooO0Oo[i4];
        while (i2 < 4) {
            this.OooOo0O.getClass();
            float fOooO00o = (i2 != 1 ? i2 != 2 ? i2 != 3 ? ag1Var.OooO0o : ag1Var.OooO0o0 : ag1Var.OooO0oo : ag1Var.OooO0oO).OooO00o(rectFOooO0o);
            if (z2) {
                this.Oooo000[i2] = fOooO00o;
            }
            fi1[] fi1VarArr = this.OooOooo;
            fi1 fi1Var = fi1VarArr[i2];
            if (fi1Var != null) {
                fi1Var.OooO00o(fOooO00o);
                if (z2) {
                    fi1VarArr[i2].OooO0Oo();
                }
            }
            i2++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean OooOOo0(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.OooO0o0.OooO0Oo == null || color2 == (colorForState2 = this.OooO0o0.OooO0Oo.getColorForState(iArr, (color2 = (paint2 = this.OooOOo).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.OooO0o0.OooO0o0 == null || color == (colorForState = this.OooO0o0.OooO0o0.getColorForState(iArr, (color = (paint = this.OooOOoo).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean OooOOoo() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.OooOo0o;
        PorterDuffColorFilter porterDuffColorFilter3 = this.OooOo;
        uq0 uq0Var = this.OooO0o0;
        ColorStateList colorStateList = uq0Var.OooO0o;
        PorterDuff.Mode mode = uq0Var.OooO0oO;
        if (colorStateList == null || mode == null) {
            int color = this.OooOOo.getColor();
            int iOooO0OO = OooO0OO(color);
            this.OooOoO0 = iOooO0OO;
            porterDuffColorFilter = iOooO0OO != color ? new PorterDuffColorFilter(iOooO0OO, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iOooO0OO2 = OooO0OO(colorStateList.getColorForState(getState(), 0));
            this.OooOoO0 = iOooO0OO2;
            porterDuffColorFilter = new PorterDuffColorFilter(iOooO0OO2, mode);
        }
        this.OooOo0o = porterDuffColorFilter;
        this.OooO0o0.getClass();
        this.OooOo = null;
        this.OooO0o0.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.OooOo0o) && Objects.equals(porterDuffColorFilter3, this.OooOo)) ? false : true;
    }

    public final void OooOo00() {
        uq0 uq0Var = this.OooO0o0;
        float f = uq0Var.OooOOO + 0.0f;
        uq0Var.OooOOOo = (int) Math.ceil(0.75f * f);
        this.OooO0o0.OooOOo0 = (int) Math.ceil(f * 0.25f);
        OooOOoo();
        super.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[EDGE_INSN: B:69:0x0096->B:32:0x0096 BREAK  A[LOOP:1: B:23:0x007d->B:28:0x0087]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.wq0.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.OooO0o0.OooOO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.OooO0o0.OooOOOO == 2) {
            return;
        }
        RectF rectFOooO0o = OooO0o();
        if (rectFOooO0o.isEmpty()) {
            return;
        }
        float fOooO0O0 = OooO0O0(rectFOooO0o, this.OooO0o0.OooO00o, this.Oooo000);
        if (fOooO0O0 >= 0.0f) {
            outline.setRoundRect(getBounds(), fOooO0O0 * this.OooO0o0.OooOO0);
            return;
        }
        boolean z = this.OooO;
        Path path = this.OooOO0o;
        if (z) {
            OooO00o(rectFOooO0o, path);
            this.OooO = false;
        }
        mq2.OooO0O0(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.OooO0o0.OooO0oo;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // com.cmaster.cloner.lg1
    public final ag1 getShapeAppearanceModel() {
        return this.OooO0o0.OooO00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.OooOOOo;
        region.set(bounds);
        RectF rectFOooO0o = OooO0o();
        Path path = this.OooOO0o;
        OooO00o(rectFOooO0o, path);
        Region region2 = this.OooOOo0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.OooO = true;
        this.OooOO0 = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ti1 ti1Var;
        if (!super.isStateful() && ((colorStateList = this.OooO0o0.OooO0o) == null || !colorStateList.isStateful())) {
            this.OooO0o0.getClass();
            ColorStateList colorStateList3 = this.OooO0o0.OooO0o0;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && (((colorStateList2 = this.OooO0o0.OooO0Oo) == null || !colorStateList2.isStateful()) && ((ti1Var = this.OooO0o0.OooO0O0) == null || ti1Var.OooO00o <= 1))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.OooO0o0 = new uq0(this.OooO0o0);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.OooO = true;
        this.OooOO0 = true;
        super.onBoundsChange(rect);
        if (this.OooO0o0.OooO0O0 != null && !rect.isEmpty()) {
            OooOOo(getState(), this.OooOoo0);
        }
        this.OooOoo0 = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.OooO0o0.OooO0O0 != null) {
            OooOOo(iArr, false);
        }
        boolean z = OooOOo0(iArr) || OooOOoo();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooOO0o != i) {
            uq0Var.OooOO0o = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.OooO0o0.getClass();
        super.invalidateSelf();
    }

    @Override // com.cmaster.cloner.lg1
    public final void setShapeAppearanceModel(ag1 ag1Var) {
        uq0 uq0Var = this.OooO0o0;
        uq0Var.OooO00o = ag1Var;
        uq0Var.OooO0O0 = null;
        this.Oooo000 = null;
        this.Oooo00O = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.OooO0o0.OooO0o = colorStateList;
        OooOOoo();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        uq0 uq0Var = this.OooO0o0;
        if (uq0Var.OooO0oO != mode) {
            uq0Var.OooO0oO = mode;
            OooOOoo();
            super.invalidateSelf();
        }
    }

    public wq0(ag1 ag1Var) {
        this(new uq0(ag1Var));
    }

    public wq0() {
        this(new ag1());
    }
}

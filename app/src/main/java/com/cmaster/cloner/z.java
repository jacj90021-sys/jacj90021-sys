package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z extends o0O000O {
    public Drawable OooO;
    public final y OooO0oo;
    public ColorStateList OooOO0;
    public PorterDuff.Mode OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO0;

    public z(y yVar) {
        super(yVar, 1);
        this.OooOO0 = null;
        this.OooOO0O = null;
        this.OooOO0o = false;
        this.OooOOO0 = false;
        this.OooO0oo = yVar;
    }

    @Override // com.cmaster.cloner.o0O000O
    public final void Oooo0oO(AttributeSet attributeSet, int i) {
        super.Oooo0oO(attributeSet, R.attr.seekBarStyle);
        y yVar = this.OooO0oo;
        Context context = yVar.getContext();
        int[] iArr = l61.OooO0oO;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, R.attr.seekBarStyle);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        nt1.OooOO0o(yVar, yVar.getContext(), iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, R.attr.seekBarStyle);
        Drawable drawableOooOo00 = a02VarOooo0OO.OooOo00(0);
        if (drawableOooOo00 != null) {
            yVar.setThumb(drawableOooOo00);
        }
        Drawable drawableOooOOo = a02VarOooo0OO.OooOOo(1);
        Drawable drawable = this.OooO;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.OooO = drawableOooOOo;
        if (drawableOooOOo != null) {
            drawableOooOOo.setCallback(yVar);
            drawableOooOOo.setLayoutDirection(yVar.getLayoutDirection());
            if (drawableOooOOo.isStateful()) {
                drawableOooOOo.setState(yVar.getDrawableState());
            }
            Ooooo00();
        }
        yVar.invalidate();
        if (typedArray.hasValue(3)) {
            this.OooOO0O = ct.OooO0OO(typedArray.getInt(3, -1), this.OooOO0O);
            this.OooOOO0 = true;
        }
        if (typedArray.hasValue(2)) {
            this.OooOO0 = a02VarOooo0OO.OooOOOo(2);
            this.OooOO0o = true;
        }
        a02VarOooo0OO.Oooo0oO();
        Ooooo00();
    }

    public final void Ooooo00() {
        Drawable drawable = this.OooO;
        if (drawable != null) {
            if (this.OooOO0o || this.OooOOO0) {
                Drawable drawableMutate = drawable.mutate();
                this.OooO = drawableMutate;
                if (this.OooOO0o) {
                    drawableMutate.setTintList(this.OooOO0);
                }
                if (this.OooOOO0) {
                    this.OooO.setTintMode(this.OooOO0O);
                }
                if (this.OooO.isStateful()) {
                    this.OooO.setState(this.OooO0oo.getDrawableState());
                }
            }
        }
    }

    public final void Ooooo0o(Canvas canvas) {
        if (this.OooO != null) {
            int max = this.OooO0oo.getMax();
            if (max > 1) {
                int intrinsicWidth = this.OooO.getIntrinsicWidth();
                int intrinsicHeight = this.OooO.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.OooO.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.OooO.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}

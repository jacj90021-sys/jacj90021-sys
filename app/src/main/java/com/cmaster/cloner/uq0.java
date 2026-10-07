package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class uq0 extends Drawable.ConstantState {
    public final float OooO;
    public ag1 OooO00o;
    public ti1 OooO0O0;
    public mu OooO0OO;
    public ColorStateList OooO0Oo;
    public ColorStateList OooO0o;
    public ColorStateList OooO0o0;
    public PorterDuff.Mode OooO0oO;
    public Rect OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public int OooOO0o;
    public float OooOOO;
    public float OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public final Paint.Style OooOOo;
    public int OooOOo0;

    public uq0(uq0 uq0Var) {
        this.OooO0Oo = null;
        this.OooO0o0 = null;
        this.OooO0o = null;
        this.OooO0oO = PorterDuff.Mode.SRC_IN;
        this.OooO0oo = null;
        this.OooO = 1.0f;
        this.OooOO0 = 1.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = 0.0f;
        this.OooOOO = 0.0f;
        this.OooOOOO = 0;
        this.OooOOOo = 0;
        this.OooOOo0 = 0;
        this.OooOOo = Paint.Style.FILL_AND_STROKE;
        this.OooO00o = uq0Var.OooO00o;
        this.OooO0O0 = uq0Var.OooO0O0;
        this.OooO0OO = uq0Var.OooO0OO;
        this.OooOO0O = uq0Var.OooOO0O;
        this.OooO0Oo = uq0Var.OooO0Oo;
        this.OooO0o0 = uq0Var.OooO0o0;
        this.OooO0oO = uq0Var.OooO0oO;
        this.OooO0o = uq0Var.OooO0o;
        this.OooOO0o = uq0Var.OooOO0o;
        this.OooO = uq0Var.OooO;
        this.OooOOo0 = uq0Var.OooOOo0;
        this.OooOOOO = uq0Var.OooOOOO;
        this.OooOO0 = uq0Var.OooOO0;
        this.OooOOO0 = uq0Var.OooOOO0;
        this.OooOOO = uq0Var.OooOOO;
        this.OooOOOo = uq0Var.OooOOOo;
        this.OooOOo = uq0Var.OooOOo;
        if (uq0Var.OooO0oo != null) {
            this.OooO0oo = new Rect(uq0Var.OooO0oo);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        wq0 wq0Var = new wq0(this);
        wq0Var.OooO = true;
        wq0Var.OooOO0 = true;
        return wq0Var;
    }

    public uq0(ag1 ag1Var) {
        this.OooO0Oo = null;
        this.OooO0o0 = null;
        this.OooO0o = null;
        this.OooO0oO = PorterDuff.Mode.SRC_IN;
        this.OooO0oo = null;
        this.OooO = 1.0f;
        this.OooOO0 = 1.0f;
        this.OooOO0o = 255;
        this.OooOOO0 = 0.0f;
        this.OooOOO = 0.0f;
        this.OooOOOO = 0;
        this.OooOOOo = 0;
        this.OooOOo0 = 0;
        this.OooOOo = Paint.Style.FILL_AND_STROKE;
        this.OooO00o = ag1Var;
        this.OooO0OO = null;
    }
}

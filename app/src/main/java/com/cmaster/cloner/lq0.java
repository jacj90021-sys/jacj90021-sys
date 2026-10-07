package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lq0 {
    public int OooO;
    public final kq0 OooO00o;
    public ag1 OooO0O0;
    public ti1 OooO0OO;
    public gi1 OooO0Oo;
    public int OooO0o;
    public pg0 OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public PorterDuff.Mode OooOO0o;
    public ColorStateList OooOOO;
    public ColorStateList OooOOO0;
    public ColorStateList OooOOOO;
    public wq0 OooOOOo;
    public boolean OooOo00;
    public RippleDrawable OooOo0O;
    public int OooOo0o;
    public boolean OooOOo0 = false;
    public boolean OooOOo = false;
    public boolean OooOOoo = false;
    public boolean OooOo0 = true;

    public lq0(kq0 kq0Var, ag1 ag1Var) {
        this.OooO00o = kq0Var;
        this.OooO0O0 = ag1Var;
    }

    public final wq0 OooO00o(boolean z) {
        RippleDrawable rippleDrawable = this.OooOo0O;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (wq0) ((LayerDrawable) ((InsetDrawable) this.OooOo0O.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void OooO0O0(int i, int i2) {
        kq0 kq0Var = this.OooO00o;
        int paddingStart = kq0Var.getPaddingStart();
        int paddingTop = kq0Var.getPaddingTop();
        int paddingEnd = kq0Var.getPaddingEnd();
        int paddingBottom = kq0Var.getPaddingBottom();
        int i3 = this.OooO0oo;
        int i4 = this.OooO;
        this.OooO = i2;
        this.OooO0oo = i;
        if (!this.OooOOo) {
            OooO0OO();
        }
        kq0Var.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void OooO0OO() {
        wq0 wq0Var = new wq0(this.OooO0O0);
        ti1 ti1Var = this.OooO0OO;
        if (ti1Var != null) {
            wq0Var.OooOOOo(ti1Var);
        }
        gi1 gi1Var = this.OooO0Oo;
        if (gi1Var != null) {
            wq0Var.OooOO0(gi1Var);
        }
        pg0 pg0Var = this.OooO0o0;
        if (pg0Var != null) {
            wq0Var.Oooo00o = pg0Var;
        }
        kq0 kq0Var = this.OooO00o;
        wq0Var.OooO(kq0Var.getContext());
        wq0Var.setTintList(this.OooOOO0);
        PorterDuff.Mode mode = this.OooOO0o;
        if (mode != null) {
            wq0Var.setTintMode(mode);
        }
        float f = this.OooOO0O;
        ColorStateList colorStateList = this.OooOOO;
        wq0Var.OooO0o0.OooOO0O = f;
        wq0Var.invalidateSelf();
        uq0 uq0Var = wq0Var.OooO0o0;
        if (uq0Var.OooO0o0 != colorStateList) {
            uq0Var.OooO0o0 = colorStateList;
            wq0Var.onStateChange(wq0Var.getState());
        }
        wq0 wq0Var2 = new wq0(this.OooO0O0);
        ti1 ti1Var2 = this.OooO0OO;
        if (ti1Var2 != null) {
            wq0Var2.OooOOOo(ti1Var2);
        }
        gi1 gi1Var2 = this.OooO0Oo;
        if (gi1Var2 != null) {
            wq0Var2.OooOO0(gi1Var2);
        }
        wq0Var2.setTint(0);
        float f2 = this.OooOO0O;
        int iOooO0OO = this.OooOOo0 ? uv2.OooO0OO(kq0Var, R.attr.colorSurface) : 0;
        wq0Var2.OooO0o0.OooOO0O = f2;
        wq0Var2.invalidateSelf();
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iOooO0OO);
        uq0 uq0Var2 = wq0Var2.OooO0o0;
        if (uq0Var2.OooO0o0 != colorStateListValueOf) {
            uq0Var2.OooO0o0 = colorStateListValueOf;
            wq0Var2.onStateChange(wq0Var2.getState());
        }
        wq0 wq0Var3 = new wq0(this.OooO0O0);
        this.OooOOOo = wq0Var3;
        ti1 ti1Var3 = this.OooO0OO;
        if (ti1Var3 != null) {
            wq0Var3.OooOOOo(ti1Var3);
        }
        gi1 gi1Var3 = this.OooO0Oo;
        if (gi1Var3 != null) {
            this.OooOOOo.OooOO0(gi1Var3);
        }
        this.OooOOOo.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(lb1.OooO00o(this.OooOOOO), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{wq0Var2, wq0Var}), this.OooO0o, this.OooO0oo, this.OooO0oO, this.OooO), this.OooOOOo);
        this.OooOo0O = rippleDrawable;
        kq0Var.setInternalBackground(rippleDrawable);
        wq0 wq0VarOooO00o = OooO00o(false);
        if (wq0VarOooO00o != null) {
            wq0VarOooO00o.OooOO0O(this.OooOo0o);
            wq0VarOooO00o.setState(kq0Var.getDrawableState());
        }
    }

    public final void OooO0Oo() {
        lg1 lg1Var;
        wq0 wq0VarOooO00o = OooO00o(false);
        if (wq0VarOooO00o != null) {
            ti1 ti1Var = this.OooO0OO;
            if (ti1Var != null) {
                wq0VarOooO00o.OooOOOo(ti1Var);
            } else {
                wq0VarOooO00o.setShapeAppearanceModel(this.OooO0O0);
            }
            gi1 gi1Var = this.OooO0Oo;
            if (gi1Var != null) {
                wq0VarOooO00o.OooOO0(gi1Var);
            }
        }
        wq0 wq0VarOooO00o2 = OooO00o(true);
        if (wq0VarOooO00o2 != null) {
            ti1 ti1Var2 = this.OooO0OO;
            if (ti1Var2 != null) {
                wq0VarOooO00o2.OooOOOo(ti1Var2);
            } else {
                wq0VarOooO00o2.setShapeAppearanceModel(this.OooO0O0);
            }
            gi1 gi1Var2 = this.OooO0Oo;
            if (gi1Var2 != null) {
                wq0VarOooO00o2.OooOO0(gi1Var2);
            }
        }
        RippleDrawable rippleDrawable = this.OooOo0O;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            lg1Var = null;
        } else {
            int numberOfLayers = this.OooOo0O.getNumberOfLayers();
            RippleDrawable rippleDrawable2 = this.OooOo0O;
            lg1Var = numberOfLayers > 2 ? (lg1) rippleDrawable2.getDrawable(2) : (lg1) rippleDrawable2.getDrawable(1);
        }
        if (lg1Var != null) {
            lg1Var.setShapeAppearanceModel(this.OooO0O0);
            if (lg1Var instanceof wq0) {
                wq0 wq0Var = (wq0) lg1Var;
                ti1 ti1Var3 = this.OooO0OO;
                if (ti1Var3 != null) {
                    wq0Var.OooOOOo(ti1Var3);
                }
                gi1 gi1Var3 = this.OooO0Oo;
                if (gi1Var3 != null) {
                    wq0Var.OooOO0(gi1Var3);
                }
            }
        }
    }

    public final void OooO0o0() {
        wq0 wq0VarOooO00o = OooO00o(false);
        wq0 wq0VarOooO00o2 = OooO00o(true);
        if (wq0VarOooO00o != null) {
            float f = this.OooOO0O;
            ColorStateList colorStateList = this.OooOOO;
            wq0VarOooO00o.OooO0o0.OooOO0O = f;
            wq0VarOooO00o.invalidateSelf();
            uq0 uq0Var = wq0VarOooO00o.OooO0o0;
            if (uq0Var.OooO0o0 != colorStateList) {
                uq0Var.OooO0o0 = colorStateList;
                wq0VarOooO00o.onStateChange(wq0VarOooO00o.getState());
            }
            if (wq0VarOooO00o2 != null) {
                float f2 = this.OooOO0O;
                int iOooO0OO = this.OooOOo0 ? uv2.OooO0OO(this.OooO00o, R.attr.colorSurface) : 0;
                wq0VarOooO00o2.OooO0o0.OooOO0O = f2;
                wq0VarOooO00o2.invalidateSelf();
                ColorStateList colorStateListValueOf = ColorStateList.valueOf(iOooO0OO);
                uq0 uq0Var2 = wq0VarOooO00o2.OooO0o0;
                if (uq0Var2.OooO0o0 != colorStateListValueOf) {
                    uq0Var2.OooO0o0 = colorStateListValueOf;
                    wq0VarOooO00o2.onStateChange(wq0VarOooO00o2.getState());
                }
            }
        }
    }
}

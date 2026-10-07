package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOOOOo0O {
    public ColorStateList OooO00o = null;
    public PorterDuff.Mode OooO0O0 = null;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public final TextView OooO0o;
    public boolean OooO0o0;

    public /* synthetic */ oOOOOo0O(TextView textView) {
        this.OooO0o = textView;
    }

    public void OooO00o() {
        CompoundButton compoundButton = (CompoundButton) this.OooO0o;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.OooO0OO || this.OooO0Oo) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.OooO0OO) {
                    drawableMutate.setTintList(this.OooO00o);
                }
                if (this.OooO0Oo) {
                    drawableMutate.setTintMode(this.OooO0O0);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void OooO0O0() {
        oOOOoo00 oooooo00 = (oOOOoo00) this.OooO0o;
        Drawable checkMarkDrawable = oooooo00.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.OooO0OO || this.OooO0Oo) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.OooO0OO) {
                    drawableMutate.setTintList(this.OooO00o);
                }
                if (this.OooO0Oo) {
                    drawableMutate.setTintMode(this.OooO0O0);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(oooooo00.getDrawableState());
                }
                oooooo00.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void OooO0OO(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.OooO0o;
        Context context = compoundButton.getContext();
        int[] iArr = l61.OooOOO0;
        a02 a02VarOooo0OO = a02.Oooo0OO(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) a02VarOooo0OO.OooO0o;
        nt1.OooOO0o(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) a02VarOooo0OO.OooO0o, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ym2.OooO00o(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(ym2.OooO00o(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                compoundButton.setButtonTintList(a02VarOooo0OO.OooOOOo(2));
            }
            if (typedArray.hasValue(3)) {
                compoundButton.setButtonTintMode(ct.OooO0OO(typedArray.getInt(3, -1), null));
            }
            a02VarOooo0OO.Oooo0oO();
        } catch (Throwable th) {
            a02VarOooo0OO.Oooo0oO();
            throw th;
        }
    }
}

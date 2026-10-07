package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zp0 extends oOo000Oo {
    public final wq0 OooO0o;
    public final Rect OooO0oO;

    /* JADX WARN: Illegal instructions before constructor call */
    public zp0(Context context) {
        TypedValue typedValueOooO00o = sv2.OooO00o(context, R.attr.materialAlertDialogTheme);
        int i = typedValueOooO00o == null ? 0 : typedValueOooO00o.data;
        Context contextOooO00o = s62.OooO00o(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        contextOooO00o = i != 0 ? new ej(contextOooO00o, i) : contextOooO00o;
        TypedValue typedValueOooO00o2 = sv2.OooO00o(context, R.attr.materialAlertDialogTheme);
        super(contextOooO00o, typedValueOooO00o2 == null ? 0 : typedValueOooO00o2.data);
        ContextThemeWrapper contextThemeWrapper = ((oO00o0) this.OooO0o0).OooO00o;
        Resources.Theme theme = contextThemeWrapper.getTheme();
        t82.OooO00o(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int[] iArr = k61.OooOO0;
        t82.OooO0O0(contextThemeWrapper, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayObtainStyledAttributes.recycle();
        int layoutDirection = contextThemeWrapper.getResources().getConfiguration().getLayoutDirection();
        this.OooO0oO = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        String canonicalName = zp0.class.getCanonicalName();
        TypedValue typedValueOooO00o3 = sv2.OooO00o(contextThemeWrapper, R.attr.colorSurface);
        if (typedValueOooO00o3 == null) {
            throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", canonicalName, contextThemeWrapper.getResources().getResourceName(R.attr.colorSurface)));
        }
        int i2 = typedValueOooO00o3.resourceId;
        int color = i2 != 0 ? contextThemeWrapper.getColor(i2) : typedValueOooO00o3.data;
        TypedArray typedArrayObtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color2 = typedArrayObtainStyledAttributes2.getColor(4, color);
        typedArrayObtainStyledAttributes2.recycle();
        wq0 wq0Var = new wq0(ag1.OooO0O0(contextThemeWrapper, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents).OooO00o());
        wq0Var.OooO(contextThemeWrapper);
        wq0Var.OooOO0o(ColorStateList.valueOf(color2));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(((oO00o0) this.OooO0o0).OooO00o.getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                yf1 yf1VarOooO0o = wq0Var.OooO0o0.OooO00o.OooO0o();
                yf1VarOooO0o.OooO0o0 = new OooOO0(dimension);
                yf1VarOooO0o.OooO0o = new OooOO0(dimension);
                yf1VarOooO0o.OooO0oO = new OooOO0(dimension);
                yf1VarOooO0o.OooO0oo = new OooOO0(dimension);
                wq0Var.setShapeAppearanceModel(yf1VarOooO0o.OooO00o());
            }
        }
        this.OooO0o = wq0Var;
    }

    @Override // com.cmaster.cloner.oOo000Oo
    public final oOo0000O OooO0OO() {
        oOo0000O ooo0000oOooO0OO = super.OooO0OO();
        Window window = ooo0000oOooO0OO.getWindow();
        View decorView = window.getDecorView();
        wq0 wq0Var = this.OooO0o;
        if (wq0Var != null) {
            wq0Var.OooOO0O(decorView.getElevation());
        }
        Rect rect = this.OooO0oO;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) wq0Var, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new yg0(ooo0000oOooO0OO, rect));
        return ooo0000oOooO0OO;
    }
}

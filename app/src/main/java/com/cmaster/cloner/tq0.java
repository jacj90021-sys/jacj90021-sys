package com.cmaster.cloner;

import android.content.res.ColorStateList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tq0 extends v {
    public static final int[][] OooOO0 = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public boolean OooO;
    public ColorStateList OooO0oo;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.OooO0oo == null) {
            int iOooO0OO = uv2.OooO0OO(this, R.attr.colorControlActivated);
            int iOooO0OO2 = uv2.OooO0OO(this, R.attr.colorOnSurface);
            int iOooO0OO3 = uv2.OooO0OO(this, R.attr.colorSurface);
            this.OooO0oo = new ColorStateList(OooOO0, new int[]{uv2.OooO0o0(iOooO0OO3, iOooO0OO, 1.0f), uv2.OooO0o0(iOooO0OO3, iOooO0OO2, 0.54f), uv2.OooO0o0(iOooO0OO3, iOooO0OO2, 0.38f), uv2.OooO0o0(iOooO0OO3, iOooO0OO2, 0.38f)});
        }
        return this.OooO0oo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.OooO && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.OooO = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }
}

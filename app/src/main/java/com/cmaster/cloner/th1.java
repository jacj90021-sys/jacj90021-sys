package com.cmaster.cloner;

import android.content.Context;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class th1 extends f7 {
    public static final int[] OooOoo0 = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager OooOoO;
    public boolean OooOoOO;

    public th1(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.OooOoO = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }
}

package com.cmaster.cloner;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iv implements TransformationMethod {
    public final TransformationMethod OooO0Oo;

    public iv(TransformationMethod transformationMethod) {
        this.OooO0Oo = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.OooO0Oo;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || su.OooO00o().OooO0O0() != 1) {
            return charSequence;
        }
        su suVarOooO00o = su.OooO00o();
        suVarOooO00o.getClass();
        return suVarOooO00o.OooO0o0(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.OooO0Oo;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}

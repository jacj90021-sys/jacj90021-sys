package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zq0 extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i) throws Resources.NotFoundException {
        super.setTextAppearance(context, i);
        if (sv2.OooO0O0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, k61.OooOOo0);
            Context context2 = getContext();
            int[] iArr = {2, 4};
            int iOooO0OO = -1;
            for (int i2 = 0; i2 < 2 && iOooO0OO < 0; i2++) {
                iOooO0OO = wv2.OooO0OO(context2, typedArrayObtainStyledAttributes, iArr[i2], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO >= 0) {
                setLineHeight(iOooO0OO);
            }
        }
    }
}

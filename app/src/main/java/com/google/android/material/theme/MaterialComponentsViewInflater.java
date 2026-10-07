package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.cmaster.cloner.R;
import com.cmaster.cloner.d1;
import com.cmaster.cloner.k61;
import com.cmaster.cloner.kq0;
import com.cmaster.cloner.nq0;
import com.cmaster.cloner.oOOO00Oo;
import com.cmaster.cloner.oOOO00o0;
import com.cmaster.cloner.oOOO0OOO;
import com.cmaster.cloner.s62;
import com.cmaster.cloner.sv2;
import com.cmaster.cloner.t82;
import com.cmaster.cloner.tq0;
import com.cmaster.cloner.v;
import com.cmaster.cloner.wv2;
import com.cmaster.cloner.zq0;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends d1 {
    @Override // com.cmaster.cloner.d1
    public final oOOO00Oo OooO00o(Context context, AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // com.cmaster.cloner.d1
    public final oOOO00o0 OooO0O0(Context context, AttributeSet attributeSet) {
        return new kq0(context, attributeSet);
    }

    @Override // com.cmaster.cloner.d1
    public final oOOO0OOO OooO0OO(Context context, AttributeSet attributeSet) {
        return new nq0(context, attributeSet);
    }

    @Override // com.cmaster.cloner.d1
    public final v OooO0Oo(Context context, AttributeSet attributeSet) {
        tq0 tq0Var = new tq0(s62.OooO00o(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, 0);
        Context context2 = tq0Var.getContext();
        TypedArray typedArrayOooO0Oo = t82.OooO0Oo(context2, attributeSet, k61.OooOOO, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayOooO0Oo.hasValue(0)) {
            tq0Var.setButtonTintList(wv2.OooO00o(context2, typedArrayOooO0Oo, 0));
        }
        tq0Var.OooO = typedArrayOooO0Oo.getBoolean(1, false);
        typedArrayOooO0Oo.recycle();
        return tq0Var;
    }

    @Override // com.cmaster.cloner.d1
    public final AppCompatTextView OooO0o0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        zq0 zq0Var = new zq0(s62.OooO00o(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = zq0Var.getContext();
        if (sv2.OooO0O0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = k61.OooOOo;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int iOooO0OO = -1;
            for (int i = 0; i < 2 && iOooO0OO < 0; i++) {
                iOooO0OO = wv2.OooO0OO(context2, typedArrayObtainStyledAttributes, iArr2[i], -1);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (iOooO0OO == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, k61.OooOOo0);
                    Context context3 = zq0Var.getContext();
                    int[] iArr3 = {2, 4};
                    int iOooO0OO2 = -1;
                    for (int i2 = 0; i2 < 2 && iOooO0OO2 < 0; i2++) {
                        iOooO0OO2 = wv2.OooO0OO(context3, typedArrayObtainStyledAttributes3, iArr3[i2], -1);
                    }
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iOooO0OO2 >= 0) {
                        zq0Var.setLineHeight(iOooO0OO2);
                    }
                }
            }
        }
        return zq0Var;
    }
}

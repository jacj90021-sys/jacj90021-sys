package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bq0 extends ArrayAdapter {
    public ColorStateList OooO0Oo;
    public final /* synthetic */ MaterialAutoCompleteTextView OooO0o;
    public ColorStateList OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.OooO0o = materialAutoCompleteTextView;
        OooO00o();
    }

    public final void OooO00o() {
        ColorStateList colorStateList;
        MaterialAutoCompleteTextView materialAutoCompleteTextView = this.OooO0o;
        ColorStateList colorStateList2 = materialAutoCompleteTextView.OooOOOO;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {android.R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.OooO0o0 = colorStateList;
        if (materialAutoCompleteTextView.OooOOO != 0 && materialAutoCompleteTextView.OooOOOO != null) {
            int[] iArr2 = {android.R.attr.state_hovered, -16842919};
            int[] iArr3 = {android.R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{ye.OooO0O0(materialAutoCompleteTextView.OooOOOO.getColorForState(iArr3, 0), materialAutoCompleteTextView.OooOOO), ye.OooO0O0(materialAutoCompleteTextView.OooOOOO.getColorForState(iArr2, 0), materialAutoCompleteTextView.OooOOO), materialAutoCompleteTextView.OooOOO});
        }
        this.OooO0Oo = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.OooO0o;
            Drawable rippleDrawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.OooOOO != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.OooOOO);
                if (this.OooO0o0 != null) {
                    colorDrawable.setTintList(this.OooO0Oo);
                    rippleDrawable = new RippleDrawable(this.OooO0o0, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}

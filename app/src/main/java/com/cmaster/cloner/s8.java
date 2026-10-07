package com.cmaster.cloner;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s8 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ s8(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.OooO00o) {
            case 0:
                throw null;
            default:
                SearchView searchView = (SearchView) this.OooO0O0;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.OooOOoo;
                View view2 = searchView.OooOoOO;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.OooOo0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z = nu1.OooO00o;
                    boolean z2 = searchView.getLayoutDirection() == 1;
                    int dimensionPixelSize = searchView.OoooO00 ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i9 = rect.left;
                    searchAutoComplete.setDropDownHorizontalOffset(z2 ? -i9 : paddingLeft - (i9 + dimensionPixelSize));
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
                    return;
                }
                return;
        }
    }
}

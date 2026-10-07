package com.cmaster.cloner;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ f0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i2) {
            case 0:
                h0 h0Var = (h0) obj;
                k0 k0Var = h0Var.Oooo0O0;
                k0Var.setSelection(i);
                if (k0Var.getOnItemClickListener() != null) {
                    k0Var.performItemClick(view, i, h0Var.Oooo00O.getItemId(i));
                }
                h0Var.dismiss();
                break;
            case 1:
                kq kqVar = ((gq) obj).Ooooo00;
                fy0 fy0Var = kqVar.OooOO0;
                if (i == 0) {
                    fy0Var.OooO0Oo(true);
                } else {
                    fy0Var.OooO0Oo(false);
                }
                kqVar.OooO0oO.OooO0Oo(kqVar.OooO0oo[i]);
                break;
            case 2:
                MaterialAutoCompleteTextView materialAutoCompleteTextView = (MaterialAutoCompleteTextView) obj;
                hn0 hn0Var = materialAutoCompleteTextView.OooO0oo;
                materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(i < 0 ? !hn0Var.OooOoo.isShowing() ? null : hn0Var.OooO0o.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i)), false);
                AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = !hn0Var.OooOoo.isShowing() ? null : hn0Var.OooO0o.getSelectedView();
                        i = !hn0Var.OooOoo.isShowing() ? -1 : hn0Var.OooO0o.getSelectedItemPosition();
                        j = !hn0Var.OooOoo.isShowing() ? Long.MIN_VALUE : hn0Var.OooO0o.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(hn0Var.OooO0o, view, i, j);
                }
                hn0Var.dismiss();
                break;
            default:
                ((SearchView) obj).OooOOO0(i);
                break;
        }
    }
}

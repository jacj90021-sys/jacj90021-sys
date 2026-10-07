package com.cmaster.cloner;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fw implements TextWatcher {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ fw(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    private final void OooO00o(Editable editable) {
    }

    private final void OooO0O0(Editable editable) {
    }

    private final void OooO0OO(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void OooO0Oo(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void OooO0o0(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.OooO0Oo) {
            case 0:
                ((iw) this.OooO0o0).OooO00o().OooO00o();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.OooO0Oo) {
            case 0:
                ((iw) this.OooO0o0).OooO00o().OooO0O0();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i4) {
            case 0:
                break;
            case 1:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.OooOOoo.getText();
                searchView.OoooOoo = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.OooOo0O(!zIsEmpty);
                int i5 = 8;
                if (searchView.OoooOo0 && !searchView.OoooO0 && zIsEmpty) {
                    searchView.OooOo.setVisibility(8);
                    i5 = 0;
                }
                searchView.OooOoO.setVisibility(i5);
                searchView.OooOOo();
                searchView.OooOo0();
                if (searchView.Oooo0oO != null && !TextUtils.equals(charSequence, searchView.OoooOoO)) {
                    searchView.Oooo0oO.OooO0oO(charSequence.toString());
                }
                searchView.OoooOoO = charSequence.toString();
                break;
            default:
                nj0 nj0Var = (nj0) obj;
                if (nj0Var != null) {
                    nj0Var.OooO0Oo();
                    break;
                }
                break;
        }
    }
}

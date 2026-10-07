package com.cmaster.cloner;

import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ae1 implements View.OnFocusChangeListener {
    public final /* synthetic */ SearchView OooO00o;

    public ae1(SearchView searchView) {
        this.OooO00o = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.OooO00o;
        View.OnFocusChangeListener onFocusChangeListener = searchView.Oooo0oo;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}

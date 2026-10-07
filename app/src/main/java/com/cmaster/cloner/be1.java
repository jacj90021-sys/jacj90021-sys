package com.cmaster.cloner;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class be1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ SearchView OooO00o;

    public be1(SearchView searchView) {
        this.OooO00o = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        this.OooO00o.OooOOOo();
        return true;
    }
}

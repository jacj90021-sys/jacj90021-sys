package com.cmaster.cloner;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lb implements xs1 {
    public final CardView OooO0Oo;
    public final RecyclerView OooO0o;
    public final AppCompatTextView OooO0o0;

    public lb(CardView cardView, AppCompatTextView appCompatTextView, RecyclerView recyclerView, AppCompatImageButton appCompatImageButton) {
        this.OooO0Oo = cardView;
        this.OooO0o0 = appCompatTextView;
        this.OooO0o = recyclerView;
    }

    @Override // com.cmaster.cloner.xs1
    public final View getRoot() {
        return this.OooO0Oo;
    }
}

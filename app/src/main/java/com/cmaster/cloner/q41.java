package com.cmaster.cloner;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q41 extends y71 {
    public boolean OooOo;
    public final Drawable OooOo0;
    public final ColorStateList OooOo0O;
    public final SparseArray OooOo0o;
    public boolean OooOoO0;

    public q41(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.OooOo0o = sparseArray;
        TextView textView = (TextView) view.findViewById(android.R.id.title);
        sparseArray.put(android.R.id.title, textView);
        sparseArray.put(android.R.id.summary, view.findViewById(android.R.id.summary));
        sparseArray.put(android.R.id.icon, view.findViewById(android.R.id.icon));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(android.R.id.icon_frame, view.findViewById(android.R.id.icon_frame));
        this.OooOo0 = view.getBackground();
        if (textView != null) {
            this.OooOo0O = textView.getTextColors();
        }
    }

    public final View OooOOoo(int i) {
        SparseArray sparseArray = this.OooOo0o;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View viewFindViewById = this.OooO00o.findViewById(i);
        if (viewFindViewById != null) {
            sparseArray.put(i, viewFindViewById);
        }
        return viewFindViewById;
    }
}

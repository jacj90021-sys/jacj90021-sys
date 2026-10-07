package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i41 extends g71 {
    public Drawable OooO0Oo;
    public boolean OooO0o = true;
    public int OooO0o0;
    public final /* synthetic */ j41 OooO0oO;

    public i41(j41 j41Var) {
        this.OooO0oO = j41Var;
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0Oo(Rect rect, View view, RecyclerView recyclerView) {
        if (OooO0oO(view, recyclerView)) {
            rect.bottom = this.OooO0o0;
        }
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0o(Canvas canvas, RecyclerView recyclerView) {
        if (this.OooO0Oo == null) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        int width = recyclerView.getWidth();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (OooO0oO(childAt, recyclerView)) {
                int height = childAt.getHeight() + ((int) childAt.getY());
                this.OooO0Oo.setBounds(0, height, width, this.OooO0o0 + height);
                this.OooO0Oo.draw(canvas);
            }
        }
    }

    public final boolean OooO0oO(View view, RecyclerView recyclerView) {
        y71 y71VarOooo0oO = recyclerView.Oooo0oO(view);
        if (!(y71VarOooo0oO instanceof q41) || !((q41) y71VarOooo0oO).OooOoO0) {
            return false;
        }
        boolean z = this.OooO0o;
        int iIndexOfChild = recyclerView.indexOfChild(view);
        if (iIndexOfChild >= recyclerView.getChildCount() - 1) {
            return z;
        }
        y71 y71VarOooo0oO2 = recyclerView.Oooo0oO(recyclerView.getChildAt(iIndexOfChild + 1));
        return (y71VarOooo0oO2 instanceof q41) && ((q41) y71VarOooo0oO2).OooOo;
    }
}

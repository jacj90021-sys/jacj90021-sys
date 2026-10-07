package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ns extends g71 {
    public final /* synthetic */ int OooO0Oo;
    public int OooO0o0;

    public /* synthetic */ ns(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.g71
    public final void OooO0Oo(Rect rect, View view, RecyclerView recyclerView) {
        switch (this.OooO0Oo) {
            case 0:
                rect.set(0, 0, 0, this.OooO0o0);
                break;
            default:
                int i = this.OooO0o0;
                rect.bottom = i;
                y71 y71VarOooo0oo = RecyclerView.Oooo0oo(view);
                if ((y71VarOooo0oo != null ? y71VarOooo0oo.OooO0O0() : -1) == 0) {
                    rect.top = i;
                    break;
                }
                break;
        }
    }
}

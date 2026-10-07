package com.cmaster.cloner;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r70 {
    public final /* synthetic */ int OooO00o;

    public final ViewPropertyAnimator OooO00o(View view, int i) {
        switch (this.OooO00o) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }
}

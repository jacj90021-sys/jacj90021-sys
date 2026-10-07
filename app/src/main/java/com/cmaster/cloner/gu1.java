package com.cmaster.cloner;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gu1 {
    public final WeakReference OooO00o;

    public gu1(View view) {
        this.OooO00o = new WeakReference(view);
    }

    public final void OooO00o(float f) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void OooO0O0() {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void OooO0OO(long j) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void OooO0Oo(iu1 iu1Var) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            if (iu1Var != null) {
                view.animate().setListener(new ro1(iu1Var, view, 1));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void OooO0o0(float f) {
        View view = (View) this.OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}

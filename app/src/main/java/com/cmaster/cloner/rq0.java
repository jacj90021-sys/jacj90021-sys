package com.cmaster.cloner;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rq0 extends wo1 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ rq0(Object obj, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.wo1, android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        View view;
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                Drawable background = ((Window) obj).getDecorView().getBackground();
                if (background != null) {
                    background.mutate().clearColorFilter();
                    break;
                }
                break;
            case 2:
                Activity activity = (Activity) obj;
                WeakReference weakReference = sq0.OooO0o0;
                if (weakReference != null && (view = (View) weakReference.get()) != null) {
                    view.setAlpha(1.0f);
                    sq0.OooO0o0 = null;
                }
                activity.finish();
                activity.overridePendingTransition(0, 0);
                break;
        }
    }

    @Override // com.cmaster.cloner.wo1, android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        int i = this.OooO00o;
        Object obj = this.OooO0O0;
        switch (i) {
            case 0:
                sq0.OooO00o((Window) obj);
                break;
            case 1:
                sq0.OooO00o((Window) obj);
                break;
        }
    }
}

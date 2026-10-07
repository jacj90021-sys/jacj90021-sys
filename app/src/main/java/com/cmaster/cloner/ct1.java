package com.cmaster.cloner;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ct1 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
    public final WeakHashMap OooO0Oo = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (Build.VERSION.SDK_INT < 28) {
            for (Map.Entry entry : this.OooO0Oo.entrySet()) {
                View view = (View) entry.getKey();
                boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
                boolean z = view.isShown() && view.getWindowVisibility() == 0;
                if (zBooleanValue != z) {
                    nt1.OooO0oo(view, z ? 16 : 32);
                    entry.setValue(Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}

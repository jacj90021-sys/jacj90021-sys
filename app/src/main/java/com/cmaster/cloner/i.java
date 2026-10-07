package com.cmaster.cloner;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i extends ContentFrameLayout {
    public final /* synthetic */ k OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ej ejVar) {
        super(ejVar);
        this.OooOO0o = kVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.OooOO0o.OooOo0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                k kVar = this.OooOO0o;
                kVar.OooOOoo(kVar.OooOoO(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(ym2.OooO00o(getContext(), i));
    }
}

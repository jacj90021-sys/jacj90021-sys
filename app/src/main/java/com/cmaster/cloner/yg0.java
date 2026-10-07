package com.cmaster.cloner;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yg0 implements View.OnTouchListener {
    public final oOo0000O OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;

    public yg0(oOo0000O ooo0000o, Rect rect) {
        this.OooO0Oo = ooo0000o;
        this.OooO0o0 = rect.left;
        this.OooO0o = rect.top;
        this.OooO0oO = ViewConfiguration.get(ooo0000o.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(android.R.id.content);
        int left = viewFindViewById.getLeft() + this.OooO0o0;
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, viewFindViewById.getTop() + this.OooO0o, width, viewFindViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            float f = (-this.OooO0oO) - 1;
            motionEventObtain.setLocation(f, f);
        }
        view.performClick();
        return this.OooO0Oo.onTouchEvent(motionEventObtain);
    }
}

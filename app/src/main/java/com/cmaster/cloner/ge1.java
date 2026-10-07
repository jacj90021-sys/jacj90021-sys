package com.cmaster.cloner;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ge1 extends TouchDelegate {
    public final View OooO00o;
    public final Rect OooO0O0;
    public final Rect OooO0OO;
    public final Rect OooO0Oo;
    public boolean OooO0o;
    public final int OooO0o0;

    public ge1(View view, Rect rect, Rect rect2) {
        super(rect, view);
        int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.OooO0o0 = scaledTouchSlop;
        Rect rect3 = new Rect();
        this.OooO0O0 = rect3;
        Rect rect4 = new Rect();
        this.OooO0Oo = rect4;
        Rect rect5 = new Rect();
        this.OooO0OO = rect5;
        rect3.set(rect);
        rect4.set(rect);
        int i = -scaledTouchSlop;
        rect4.inset(i, i);
        rect5.set(rect2);
        this.OooO00o = view;
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action != 0) {
            if (action == 1 || action == 2) {
                z2 = this.OooO0o;
                if (z2 && !this.OooO0Oo.contains(x, y)) {
                    z3 = z2;
                    z = false;
                }
            } else {
                if (action == 3) {
                    z2 = this.OooO0o;
                    this.OooO0o = false;
                }
                z = true;
                z3 = false;
            }
            z3 = z2;
            z = true;
        } else if (this.OooO0O0.contains(x, y)) {
            this.OooO0o = true;
            z = true;
        } else {
            z = true;
            z3 = false;
        }
        if (!z3) {
            return false;
        }
        Rect rect = this.OooO0OO;
        View view = this.OooO00o;
        if (!z || rect.contains(x, y)) {
            motionEvent.setLocation(x - rect.left, y - rect.top);
        } else {
            motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
        }
        return view.dispatchTouchEvent(motionEvent);
    }
}

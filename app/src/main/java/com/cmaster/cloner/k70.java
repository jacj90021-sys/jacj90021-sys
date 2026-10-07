package com.cmaster.cloner;

import android.view.VelocityTracker;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k70 extends fu1 {
    public VelocityTracker OooO;
    public l1 OooO0OO;
    public OverScroller OooO0Oo;
    public int OooO0o;
    public boolean OooO0o0;
    public int OooO0oO;
    public int OooO0oo;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // com.cmaster.cloner.lj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOO0O(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, android.view.MotionEvent r10) {
        /*
            r7 = this;
            int r0 = r7.OooO0oo
            if (r0 >= 0) goto L12
            android.content.Context r0 = r8.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r7.OooO0oo = r0
        L12:
            int r0 = r10.getActionMasked()
            r1 = 2
            r2 = 1
            r3 = -1
            r4 = 0
            if (r0 != r1) goto L42
            boolean r0 = r7.OooO0o0
            if (r0 == 0) goto L42
            int r0 = r7.OooO0o
            if (r0 != r3) goto L26
            goto La8
        L26:
            int r0 = r10.findPointerIndex(r0)
            if (r0 != r3) goto L2e
            goto La8
        L2e:
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            int r1 = r7.OooO0oO
            int r1 = r0 - r1
            int r1 = java.lang.Math.abs(r1)
            int r5 = r7.OooO0oo
            if (r1 <= r5) goto L42
            r7.OooO0oO = r0
            return r2
        L42:
            int r0 = r10.getActionMasked()
            if (r0 != 0) goto La1
            r7.OooO0o = r3
            float r0 = r10.getX()
            int r0 = (int) r0
            float r1 = r10.getY()
            int r1 = (int) r1
            r5 = r7
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r5 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r5
            r6 = r9
            com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
            java.lang.ref.WeakReference r5 = r5.OooOOO
            if (r5 == 0) goto L72
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L7a
            boolean r6 = r5.isShown()
            if (r6 == 0) goto L7a
            boolean r3 = r5.canScrollVertically(r3)
            if (r3 != 0) goto L7a
        L72:
            boolean r8 = r8.OooOOOo(r9, r0, r1)
            if (r8 == 0) goto L7a
            r8 = r2
            goto L7b
        L7a:
            r8 = r4
        L7b:
            r7.OooO0o0 = r8
            if (r8 == 0) goto La1
            r7.OooO0oO = r1
            int r8 = r10.getPointerId(r4)
            r7.OooO0o = r8
            android.view.VelocityTracker r8 = r7.OooO
            if (r8 != 0) goto L91
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r7.OooO = r8
        L91:
            android.widget.OverScroller r8 = r7.OooO0Oo
            if (r8 == 0) goto La1
            boolean r8 = r8.isFinished()
            if (r8 != 0) goto La1
            android.widget.OverScroller r7 = r7.OooO0Oo
            r7.abortAnimation()
            return r2
        La1:
            android.view.VelocityTracker r7 = r7.OooO
            if (r7 == 0) goto La8
            r7.addMovement(r10)
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k70.OooOO0O(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fb A[ADDED_TO_REGION] */
    @Override // com.cmaster.cloner.lj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOo0O(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k70.OooOo0O(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int OooOoO(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public abstract int OooOoO0();

    public final void OooOoOO(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOoO(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

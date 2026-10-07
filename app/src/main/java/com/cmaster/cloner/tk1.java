package com.cmaster.cloner;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tk1 extends n53 {
    public int OooO00o;
    public int OooO0O0 = -1;
    public final /* synthetic */ SwipeDismissBehavior OooO0OO;

    public tk1(SwipeDismissBehavior swipeDismissBehavior) {
        this.OooO0OO = swipeDismissBehavior;
    }

    @Override // com.cmaster.cloner.n53
    public final boolean OooO(View view, int i) {
        int i2 = this.OooO0O0;
        return (i2 == -1 || i2 == i) && this.OooO0OO.OooOo0o(view);
    }

    @Override // com.cmaster.cloner.n53
    public final int OooO00o(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.OooO0OO.OooO0o0;
        if (i2 == 0) {
            width = this.OooO00o;
            if (z) {
                width -= view.getWidth();
                width2 = this.OooO00o;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.OooO00o;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.OooO00o + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.OooO00o;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.cmaster.cloner.n53
    public final int OooO0O0(View view, int i) {
        return view.getTop();
    }

    @Override // com.cmaster.cloner.n53
    public final int OooO0OO(View view) {
        return view.getWidth();
    }

    @Override // com.cmaster.cloner.n53
    public final void OooO0o(int i) {
        ay1 ay1Var = this.OooO0OO.OooO0O0;
        if (ay1Var != null) {
            c7 c7Var = ((f7) ay1Var.OooO0o0).OooOOoo;
            if (i == 0) {
                ho1.OooOoO0().Oooo0o0(c7Var);
            } else if (i == 1 || i == 2) {
                ho1.OooOoO0().Oooo0OO(c7Var);
            }
        }
    }

    @Override // com.cmaster.cloner.n53
    public final void OooO0o0(View view, int i) {
        this.OooO0O0 = i;
        this.OooO00o = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.OooO0OO;
            swipeDismissBehavior.OooO0Oo = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.OooO0Oo = false;
        }
    }

    @Override // com.cmaster.cloner.n53
    public final void OooO0oO(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.OooO0OO;
        float f = width * swipeDismissBehavior.OooO0o;
        float width2 = view.getWidth() * swipeDismissBehavior.OooO0oO;
        float fAbs = Math.abs(i - this.OooO00o);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.cmaster.cloner.n53
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0oo(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.OooO0O0 = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.OooO0OO
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.OooO0o0
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.OooO00o
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.OooO00o
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.OooO00o
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.OooO00o
        L67:
            com.cmaster.cloner.st1 r8 = r3.OooO00o
            int r10 = r9.getTop()
            boolean r8 = r8.OooOOOO(r0, r10)
            if (r8 == 0) goto L7c
            com.cmaster.cloner.gf1 r8 = new com.cmaster.cloner.gf1
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
            return
        L7c:
            if (r2 == 0) goto L85
            com.cmaster.cloner.ay1 r8 = r3.OooO0O0
            if (r8 == 0) goto L85
            r8.OooOOoo(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tk1.OooO0oo(android.view.View, float, float):void");
    }
}

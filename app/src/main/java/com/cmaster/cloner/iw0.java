package com.cmaster.cloner;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iw0 extends o0000O00 {
    public final /* synthetic */ int OooO0Oo;

    public /* synthetic */ iw0(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.o0000O00
    public void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.OooO0Oo) {
            case 0:
                super.OooO0OO(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.OooO0OO(view, accessibilityEvent);
                break;
        }
    }

    @Override // com.cmaster.cloner.o0000O00
    public final void OooO0Oo(View view, o000O00O o000o00o) {
        int scrollRange;
        int i = this.OooO0Oo;
        View.AccessibilityDelegate accessibilityDelegate = this.OooO00o;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = o000o00o.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName("android.widget.ScrollView");
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    o000o00o.OooO0o();
                    if (nestedScrollView.getScrollY() > 0) {
                        o000o00o.OooO00o(o000.OooO0o);
                        o000o00o.OooO00o(o000.OooOO0O);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        o000o00o.OooO00o(o000.OooO0o0);
                        o000o00o.OooO00o(o000.OooOO0o);
                        break;
                    }
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = o000o00o.OooO00o;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setVisibleToUser(false);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // com.cmaster.cloner.o0000O00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean OooO0oO(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            int r0 = r3.OooO0Oo
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r3 = super.OooO0oO(r4, r5, r6)
            return r3
        La:
            boolean r3 = super.OooO0oO(r4, r5, r6)
            r6 = 1
            if (r3 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r4 = (androidx.core.widget.NestedScrollView) r4
            boolean r3 = r4.isEnabled()
            r0 = 0
            if (r3 != 0) goto L1e
            goto La0
        L1e:
            int r3 = r4.getHeight()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Matrix r2 = r4.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 == 0) goto L3b
            boolean r2 = r4.getGlobalVisibleRect(r1)
            if (r2 == 0) goto L3b
            int r3 = r1.height()
        L3b:
            r1 = 4096(0x1000, float:5.74E-42)
            if (r5 == r1) goto L75
            r1 = 8192(0x2000, float:1.148E-41)
            if (r5 == r1) goto L4e
            r1 = 16908344(0x1020038, float:2.3877386E-38)
            if (r5 == r1) goto L4e
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            if (r5 == r1) goto L75
            goto La0
        L4e:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 - r3
            int r3 = java.lang.Math.max(r5, r0)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.OooOo0(r0, r3, r6)
            goto La1
        L75:
            int r5 = r4.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r4.getPaddingTop()
            int r3 = r3 - r5
            int r5 = r4.getScrollY()
            int r5 = r5 + r3
            int r3 = r4.getScrollRange()
            int r3 = java.lang.Math.min(r5, r3)
            int r5 = r4.getScrollY()
            if (r3 == r5) goto La0
            int r5 = r4.getScrollX()
            int r0 = r0 - r5
            int r5 = r4.getScrollY()
            int r3 = r3 - r5
            r4.OooOo0(r0, r3, r6)
            goto La1
        La0:
            r6 = r0
        La1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.iw0.OooO0oO(android.view.View, int, android.os.Bundle):boolean");
    }
}

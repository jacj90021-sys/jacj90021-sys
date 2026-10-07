package com.cmaster.cloner;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class to2 extends RelativeLayout {
    public final c62 OooO0Oo;
    public boolean OooO0o0;

    public to2(Context context, String str, String str2, String str3) {
        super(context);
        c62 c62Var = new c62(context);
        c62Var.OooO0OO = str;
        this.OooO0Oo = c62Var;
        c62Var.OooO0o0 = str2;
        c62Var.OooO0Oo = str3;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.OooO0o0) {
            return false;
        }
        this.OooO0Oo.OooO00o(motionEvent);
        return false;
    }
}

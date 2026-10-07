package com.cmaster.cloner;

import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cq0 {
    public final PathInterpolator OooO00o = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);
    public final View OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public j5 OooO0o;
    public final int OooO0o0;

    public cq0(View view) {
        this.OooO0O0 = view;
        Context context = view.getContext();
        this.OooO0OO = ow2.OooO0OO(context, R.attr.motionDurationMedium2, 300);
        this.OooO0Oo = ow2.OooO0OO(context, R.attr.motionDurationShort3, 150);
        this.OooO0o0 = ow2.OooO0OO(context, R.attr.motionDurationShort2, 100);
    }
}

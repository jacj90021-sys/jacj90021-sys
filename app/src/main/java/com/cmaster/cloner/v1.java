package com.cmaster.cloner;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v1 implements xs1 {
    public final RelativeLayout OooO0Oo;
    public final ImageView OooO0o;
    public final TextView OooO0o0;
    public final TextView OooO0oO;

    public v1(RelativeLayout relativeLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.OooO0Oo = relativeLayout;
        this.OooO0o0 = textView;
        this.OooO0o = imageView;
        this.OooO0oO = textView2;
    }

    @Override // com.cmaster.cloner.xs1
    public final View getRoot() {
        return this.OooO0Oo;
    }
}

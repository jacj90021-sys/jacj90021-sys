package com.cmaster.cloner;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.webkit.TracingConfig;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class o0000oo {
    public static /* bridge */ /* synthetic */ ImageDecoder.Source OooO0Oo(Object obj) {
        return (ImageDecoder.Source) obj;
    }

    public static /* bridge */ /* synthetic */ AnimatedImageDrawable OooO0o(Drawable drawable) {
        return (AnimatedImageDrawable) drawable;
    }

    public static /* synthetic */ void OooOOO() {
        new TracingConfig.Builder();
    }

    public static /* bridge */ /* synthetic */ void OooOo00(Object obj) {
    }

    public static /* bridge */ /* synthetic */ boolean OooOo0O(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}

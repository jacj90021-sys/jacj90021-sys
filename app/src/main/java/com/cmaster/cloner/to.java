package com.cmaster.cloner;

import android.content.pm.SigningInfo;
import android.content.pm.VersionedPackage;
import android.text.PrecomputedText;
import android.text.TextPaint;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class to {
    public static /* synthetic */ VersionedPackage OooO0oo(String str, long j) {
        return new VersionedPackage(str, j);
    }

    public static /* synthetic */ PrecomputedText.Params.Builder OooOOO0(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ Class OooOOoo() {
        return SigningInfo.class;
    }

    public static /* bridge */ /* synthetic */ boolean OooOoo0(CharSequence charSequence) {
        return charSequence instanceof PrecomputedText;
    }
}

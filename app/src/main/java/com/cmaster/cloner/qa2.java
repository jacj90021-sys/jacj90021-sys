package com.cmaster.cloner;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qa2 extends ContextWrapper {
    public Activity OooO00o;

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        Activity activity = this.OooO00o;
        return activity != null ? activity.getSystemService(str) : super.getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        Activity activity = this.OooO00o;
        if (activity != null) {
            activity.startActivity(intent);
        } else {
            intent.setFlags(268435456);
            super.startActivity(intent);
        }
    }
}

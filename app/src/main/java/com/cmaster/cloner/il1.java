package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class il1 {
    public static final String OooO0O0 = ep0.OooO("SystemJobInfoConverter");
    public final ComponentName OooO00o;

    public il1(Context context) {
        this.OooO00o = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}

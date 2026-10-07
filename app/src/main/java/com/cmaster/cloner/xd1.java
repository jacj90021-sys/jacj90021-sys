package com.cmaster.cloner;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xd1 {
    public final wd1 OooO00o;

    public xd1(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.OooO00o = new vd1(nestedScrollView);
        } else {
            this.OooO00o = new d83(12);
        }
    }
}

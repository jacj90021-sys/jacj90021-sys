package com.cmaster.cloner;

import android.graphics.Point;
import android.graphics.Rect;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x5 {
    public final c6 OooO00o;
    public final Rect OooO0O0;
    public final Point[] OooO0OO;

    public x5(c6 c6Var) {
        this.OooO00o = c6Var;
        this.OooO0O0 = c6Var.OooO0OO();
        this.OooO0OO = c6Var.OooO();
    }

    public final int OooO00o() {
        int format = this.OooO00o.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }
}

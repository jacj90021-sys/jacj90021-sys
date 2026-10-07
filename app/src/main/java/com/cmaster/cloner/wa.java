package com.cmaster.cloner;

import android.hardware.Camera;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wa {
    public final ph1 OooO00o;
    public final ph1 OooO0O0;

    public wa(Camera.Size size, Camera.Size size2) {
        this.OooO00o = new ph1(size.width, size.height);
        this.OooO0O0 = size2 != null ? new ph1(size2.width, size2.height) : null;
    }

    public wa(ph1 ph1Var, ph1 ph1Var2) {
        this.OooO00o = ph1Var;
        this.OooO0O0 = ph1Var2;
    }
}

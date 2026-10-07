package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gg0 extends pj0 {
    public int OooO0Oo = -1;

    public final String OooO0o() {
        return "[" + Integer.toHexString(this.OooO0Oo) + ']';
    }

    public final int OooO0o0() {
        int i = this.OooO0Oo;
        if (i >= 0) {
            return i;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-100, 94, 107, 63, -44, 86, -4, 114, -127, 16, 118, 63, -40, 86, -31, 120, -127}, new byte[]{-11, 48, 15, 90, -84, 118, -110, 29}));
        return 0;
    }

    public final void OooO0oO(int i) {
        if (this.OooO0Oo == -1) {
            this.OooO0Oo = i;
        } else {
            ra.OooOOO0(u7.OooO00o(new byte[]{-78, -53, -27, -81, 43, -5, 3, -69, -87, -64, -32, -82, 42, -5, 17, -78, -81}, new byte[]{-37, -91, -127, -54, 83, -37, 98, -41}));
        }
    }
}

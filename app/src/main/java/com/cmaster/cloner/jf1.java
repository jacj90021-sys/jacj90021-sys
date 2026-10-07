package com.cmaster.cloner;

import android.content.Intent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jf1 {
    public final kf1 OooO00o;
    public final int OooO0O0;
    public final Intent OooO0OO;
    public int OooO0Oo;
    public String OooO0o;
    public int OooO0o0;

    public jf1(kf1 kf1Var, int i, Intent intent) {
        this.OooO00o = kf1Var;
        this.OooO0O0 = i;
        this.OooO0OO = intent;
    }

    public final String toString() {
        String str = this.OooO0o;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append(u7.OooO00o(new byte[]{81, -28, -102, -105, -46, 8, -85, -82, 103, -30, -121, -109, -33, 16}, new byte[]{2, -127, -24, -31, -69, 107, -50, -4}));
        kf1 kf1Var = this.OooO00o;
        sb.append(Integer.toHexString(System.identityHashCode(kf1Var)));
        sb.append(' ');
        sb.append(kf1Var.OooO0oO);
        sb.append(u7.OooO00o(new byte[]{116, -24, 37, -63, 16, -1, 56, 90, 49, -42, 113}, new byte[]{84, -69, 81, -96, 98, -117, 113, 46}));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(u7.OooO00o(new byte[]{69, 56, 40, 73}, new byte[]{101, 81, 76, 116, 23, -40, 46, 126}));
        sb.append(this.OooO0O0);
        sb.append('}');
        String string = sb.toString();
        this.OooO0o = string;
        return string;
    }
}

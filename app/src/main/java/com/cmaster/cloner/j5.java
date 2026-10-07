package com.cmaster.cloner;

import android.window.BackEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j5 {
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final int OooO0Oo;

    public j5(BackEvent backEvent) {
        backEvent.getClass();
        oOO000o ooo000o = oOO000o.OooO00o;
        float fOooO0Oo = ooo000o.OooO0Oo(backEvent);
        float fOooO0o0 = ooo000o.OooO0o0(backEvent);
        float fOooO0O0 = ooo000o.OooO0O0(backEvent);
        int iOooO0OO = ooo000o.OooO0OO(backEvent);
        this.OooO00o = fOooO0Oo;
        this.OooO0O0 = fOooO0o0;
        this.OooO0OO = fOooO0O0;
        this.OooO0Oo = iOooO0OO;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.OooO00o + ", touchY=" + this.OooO0O0 + ", progress=" + this.OooO0OO + ", swipeEdge=" + this.OooO0Oo + '}';
    }
}

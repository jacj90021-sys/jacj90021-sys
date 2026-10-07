package com.cmaster.cloner;

import android.os.Handler;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z41 implements hm0 {
    public static final z41 OooOO0o = new z41();
    public int OooO0Oo;
    public int OooO0o0;
    public Handler OooO0oo;
    public boolean OooO0o = true;
    public boolean OooO0oO = true;
    public final jm0 OooO = new jm0(this);
    public final o00OOOOo OooOO0 = new o00OOOOo(this, 12);
    public final o00OO000 OooOO0O = new o00OO000(this, 23);

    public final void OooO00o() {
        int i = this.OooO0o0 + 1;
        this.OooO0o0 = i;
        if (i == 1) {
            if (this.OooO0o) {
                this.OooO.OooO(wl0.ON_RESUME);
                this.OooO0o = false;
            } else {
                Handler handler = this.OooO0oo;
                handler.getClass();
                handler.removeCallbacks(this.OooOO0);
            }
        }
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return this.OooO;
    }
}

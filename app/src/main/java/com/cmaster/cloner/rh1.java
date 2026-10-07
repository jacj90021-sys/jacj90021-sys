package com.cmaster.cloner;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rh1 implements g31 {
    public final ip0 OooO00o;
    public int OooO0O0;
    public Bitmap.Config OooO0OO;

    public rh1(ip0 ip0Var) {
        this.OooO00o = ip0Var;
    }

    @Override // com.cmaster.cloner.g31
    public final void OooO00o() {
        this.OooO00o.OooO0oO(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rh1) {
            rh1 rh1Var = (rh1) obj;
            if (this.OooO0O0 == rh1Var.OooO0O0 && pr1.OooO0O0(this.OooO0OO, rh1Var.OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.OooO0O0 * 31;
        Bitmap.Config config = this.OooO0OO;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return sh1.OooO0OO(this.OooO0O0, this.OooO0OO);
    }
}

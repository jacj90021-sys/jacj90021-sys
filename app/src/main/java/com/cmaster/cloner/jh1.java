package com.cmaster.cloner;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jh1 extends eb1 {
    public final AtomicBoolean OooOOo0 = new AtomicBoolean(false);

    @Override // com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    public final void OooO0o0(hm0 hm0Var, iy0 iy0Var) {
        if (this.OooO0o > 0) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.OooO0o0(hm0Var, new ih1(this, iy0Var, 0));
    }

    @Override // com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    public final void OooO0oO(iy0 iy0Var) {
        if (this.OooO0o > 0) {
            Log.w("SingleLiveEvent", "Multiple observers registered but only one will be notified of changes.");
        }
        super.OooO0oO(new ih1(this, iy0Var, 1));
    }

    @Override // com.cmaster.cloner.eb1, com.cmaster.cloner.gv0
    public final void OooOO0o(Object obj) {
        this.OooOOo0.set(true);
        super.OooOO0o(obj);
    }
}

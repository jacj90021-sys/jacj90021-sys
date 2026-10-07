package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a32 {
    public Boolean OooO00o;
    public boolean OooO0O0;
    public final /* synthetic */ m6 OooO0OO;
    public final int OooO0Oo;
    public final /* synthetic */ m6 OooO0o;
    public final Bundle OooO0o0;

    public a32(m6 m6Var, int i, Bundle bundle) {
        this.OooO0o = m6Var;
        Boolean bool = Boolean.TRUE;
        this.OooO0OO = m6Var;
        this.OooO00o = bool;
        this.OooO0O0 = false;
        this.OooO0Oo = i;
        this.OooO0o0 = bundle;
    }

    public abstract void OooO00o(gh ghVar);

    public abstract boolean OooO0O0();

    public final void OooO0OO() {
        synchronized (this) {
            this.OooO00o = null;
        }
        synchronized (this.OooO0OO.zzt) {
            this.OooO0OO.zzt.remove(this);
        }
    }
}

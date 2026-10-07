package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t31 extends s31 {
    public final Object OooO0o;

    public t31(int i) {
        super(i);
        this.OooO0o = new Object();
    }

    @Override // com.cmaster.cloner.s31, com.cmaster.cloner.r31
    public final boolean OooO0O0(Object obj) {
        boolean zOooO0O0;
        obj.getClass();
        synchronized (this.OooO0o) {
            zOooO0O0 = super.OooO0O0(obj);
        }
        return zOooO0O0;
    }

    @Override // com.cmaster.cloner.s31, com.cmaster.cloner.r31
    public final Object OooO0oo() {
        Object objOooO0oo;
        synchronized (this.OooO0o) {
            objOooO0oo = super.OooO0oo();
        }
        return objOooO0oo;
    }
}

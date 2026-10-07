package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class il0 implements r51 {
    public static final Object OooO0OO = new Object();
    public volatile Object OooO00o = OooO0OO;
    public volatile r51 OooO0O0;

    public il0(r51 r51Var) {
        this.OooO0O0 = r51Var;
    }

    @Override // com.cmaster.cloner.r51
    public final Object get() {
        Object obj;
        Object obj2 = this.OooO00o;
        Object obj3 = OooO0OO;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.OooO00o;
                if (obj == obj3) {
                    obj = this.OooO0O0.get();
                    this.OooO00o = obj;
                    this.OooO0O0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

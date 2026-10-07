package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qs implements q51 {
    public static final Object OooO0o = new Object();
    public volatile iy OooO0Oo;
    public volatile Object OooO0o0;

    public static q51 OooO00o(iy iyVar) {
        if (iyVar instanceof qs) {
            return iyVar;
        }
        qs qsVar = new qs();
        qsVar.OooO0o0 = OooO0o;
        qsVar.OooO0Oo = iyVar;
        return qsVar;
    }

    @Override // com.cmaster.cloner.q51
    public final Object get() {
        Object obj;
        Object obj2 = this.OooO0o0;
        Object obj3 = OooO0o;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.OooO0o0;
                if (obj == obj3) {
                    obj = this.OooO0Oo.get();
                    Object obj4 = this.OooO0o0;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.OooO0o0 = obj;
                    this.OooO0Oo = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}

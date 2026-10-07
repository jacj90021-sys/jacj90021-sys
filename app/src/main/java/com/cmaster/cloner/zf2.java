package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zf2 implements lg2 {
    public static final Object OooO0o = new Object();
    public volatile dg2 OooO0Oo;
    public volatile Object OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public static zf2 OooO00o(dg2 dg2Var) {
        if (dg2Var instanceof zf2) {
            return (zf2) dg2Var;
        }
        zf2 zf2Var = new zf2();
        zf2Var.OooO0o0 = OooO0o;
        zf2Var.OooO0Oo = dg2Var;
        return zf2Var;
    }

    @Override // com.cmaster.cloner.lg2
    public final Object zza() {
        Object obj = this.OooO0o0;
        Object obj2 = OooO0o;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.OooO0o0;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objZza = this.OooO0Oo.zza();
                Object obj4 = this.OooO0o0;
                if (obj4 != obj2 && obj4 != objZza) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objZza + ". This is likely due to a circular dependency.");
                }
                this.OooO0o0 = objZza;
                this.OooO0Oo = null;
                return objZza;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

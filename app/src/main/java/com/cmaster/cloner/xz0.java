package com.cmaster.cloner;

import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xz0 implements zk0 {
    public final ea OooO0O0 = new ea(0);

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            ea eaVar = this.OooO0O0;
            if (i >= eaVar.OooO0o) {
                return;
            }
            tz0 tz0Var = (tz0) eaVar.OooO0o(i);
            Object objOooOO0 = this.OooO0O0.OooOO0(i);
            sz0 sz0Var = tz0Var.OooO0O0;
            if (tz0Var.OooO0Oo == null) {
                tz0Var.OooO0Oo = tz0Var.OooO0OO.getBytes(zk0.OooO00o);
            }
            sz0Var.OooO0o0(tz0Var.OooO0Oo, objOooOO0, messageDigest);
            i++;
        }
    }

    public final Object OooO0OO(tz0 tz0Var) {
        ea eaVar = this.OooO0O0;
        return eaVar.containsKey(tz0Var) ? eaVar.get(tz0Var) : tz0Var.OooO00o;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof xz0) {
            return this.OooO0O0.equals(((xz0) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.OooO0O0 + '}';
    }
}

package com.cmaster.cloner;

import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gn implements zk0 {
    public final zk0 OooO0O0;
    public final zk0 OooO0OO;

    public gn(zk0 zk0Var, zk0 zk0Var2) {
        this.OooO0O0 = zk0Var;
        this.OooO0OO = zk0Var2;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        this.OooO0O0.OooO00o(messageDigest);
        this.OooO0OO.OooO00o(messageDigest);
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof gn) {
            gn gnVar = (gn) obj;
            if (this.OooO0O0.equals(gnVar.OooO0O0) && this.OooO0OO.equals(gnVar.OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return this.OooO0OO.hashCode() + (this.OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.OooO0O0 + ", signature=" + this.OooO0OO + '}';
    }
}

package com.cmaster.cloner;

import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class by0 implements zk0 {
    public final Object OooO0O0;

    public by0(Object obj) {
        zx2.OooO0OO(obj, "Argument must not be null");
        this.OooO0O0 = obj;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(this.OooO0O0.toString().getBytes(zk0.OooO00o));
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof by0) {
            return this.OooO0O0.equals(((by0) obj).OooO0O0);
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.OooO0O0 + '}';
    }
}

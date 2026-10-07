package com.cmaster.cloner;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pw implements zk0 {
    public final xz0 OooO;
    public final Object OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final Class OooO0o;
    public final Class OooO0o0;
    public final zk0 OooO0oO;
    public final Map OooO0oo;
    public int OooOO0;

    public pw(Object obj, zk0 zk0Var, int i, int i2, Map map, Class cls, Class cls2, xz0 xz0Var) {
        zx2.OooO0OO(obj, "Argument must not be null");
        this.OooO0O0 = obj;
        this.OooO0oO = zk0Var;
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        zx2.OooO0OO(map, "Argument must not be null");
        this.OooO0oo = map;
        zx2.OooO0OO(cls, "Resource class must not be null");
        this.OooO0o0 = cls;
        zx2.OooO0OO(cls2, "Transcode class must not be null");
        this.OooO0o = cls2;
        zx2.OooO0OO(xz0Var, "Argument must not be null");
        this.OooO = xz0Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof pw) {
            pw pwVar = (pw) obj;
            if (this.OooO0O0.equals(pwVar.OooO0O0) && this.OooO0oO.equals(pwVar.OooO0oO) && this.OooO0Oo == pwVar.OooO0Oo && this.OooO0OO == pwVar.OooO0OO && this.OooO0oo.equals(pwVar.OooO0oo) && this.OooO0o0.equals(pwVar.OooO0o0) && this.OooO0o.equals(pwVar.OooO0o) && this.OooO.equals(pwVar.OooO)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        if (this.OooOO0 == 0) {
            int iHashCode = this.OooO0O0.hashCode();
            this.OooOO0 = iHashCode;
            int iHashCode2 = ((((this.OooO0oO.hashCode() + (iHashCode * 31)) * 31) + this.OooO0OO) * 31) + this.OooO0Oo;
            this.OooOO0 = iHashCode2;
            int iHashCode3 = this.OooO0oo.hashCode() + (iHashCode2 * 31);
            this.OooOO0 = iHashCode3;
            int iHashCode4 = this.OooO0o0.hashCode() + (iHashCode3 * 31);
            this.OooOO0 = iHashCode4;
            int iHashCode5 = this.OooO0o.hashCode() + (iHashCode4 * 31);
            this.OooOO0 = iHashCode5;
            this.OooOO0 = this.OooO.OooO0O0.hashCode() + (iHashCode5 * 31);
        }
        return this.OooOO0;
    }

    public final String toString() {
        return "EngineKey{model=" + this.OooO0O0 + ", width=" + this.OooO0OO + ", height=" + this.OooO0Oo + ", resourceClass=" + this.OooO0o0 + ", transcodeClass=" + this.OooO0o + ", signature=" + this.OooO0oO + ", hashCode=" + this.OooOO0 + ", transformations=" + this.OooO0oo + ", options=" + this.OooO + '}';
    }
}

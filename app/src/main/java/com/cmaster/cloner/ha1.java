package com.cmaster.cloner;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ha1 implements zk0 {
    public static final mp0 OooOO0 = new mp0(50);
    public final no1 OooO;
    public final jp0 OooO0O0;
    public final zk0 OooO0OO;
    public final zk0 OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final Class OooO0oO;
    public final xz0 OooO0oo;

    public ha1(jp0 jp0Var, zk0 zk0Var, zk0 zk0Var2, int i, int i2, no1 no1Var, Class cls, xz0 xz0Var) {
        this.OooO0O0 = jp0Var;
        this.OooO0OO = zk0Var;
        this.OooO0Oo = zk0Var2;
        this.OooO0o0 = i;
        this.OooO0o = i2;
        this.OooO = no1Var;
        this.OooO0oO = cls;
        this.OooO0oo = xz0Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        Object objOooO0o0;
        jp0 jp0Var = this.OooO0O0;
        synchronized (jp0Var) {
            ip0 ip0Var = jp0Var.OooO0O0;
            g31 g31VarOooOO0O = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
            if (g31VarOooOO0O == null) {
                g31VarOooOO0O = ip0Var.OooOO0O();
            }
            hp0 hp0Var = (hp0) g31VarOooOO0O;
            hp0Var.OooO0O0 = 8;
            hp0Var.OooO0OO = byte[].class;
            objOooO0o0 = jp0Var.OooO0o0(hp0Var, byte[].class);
        }
        byte[] bArr = (byte[]) objOooO0o0;
        ByteBuffer.wrap(bArr).putInt(this.OooO0o0).putInt(this.OooO0o).array();
        this.OooO0Oo.OooO00o(messageDigest);
        this.OooO0OO.OooO00o(messageDigest);
        messageDigest.update(bArr);
        no1 no1Var = this.OooO;
        if (no1Var != null) {
            no1Var.OooO00o(messageDigest);
        }
        this.OooO0oo.OooO00o(messageDigest);
        mp0 mp0Var = OooOO0;
        Class cls = this.OooO0oO;
        byte[] bytes = (byte[]) mp0Var.OooO00o(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(zk0.OooO00o);
            mp0Var.OooO0Oo(cls, bytes);
        }
        messageDigest.update(bytes);
        this.OooO0O0.OooO0oO(bArr);
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof ha1) {
            ha1 ha1Var = (ha1) obj;
            if (this.OooO0o == ha1Var.OooO0o && this.OooO0o0 == ha1Var.OooO0o0 && pr1.OooO0O0(this.OooO, ha1Var.OooO) && this.OooO0oO.equals(ha1Var.OooO0oO) && this.OooO0OO.equals(ha1Var.OooO0OO) && this.OooO0Oo.equals(ha1Var.OooO0Oo) && this.OooO0oo.equals(ha1Var.OooO0oo)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        int iHashCode = ((((this.OooO0Oo.hashCode() + (this.OooO0OO.hashCode() * 31)) * 31) + this.OooO0o0) * 31) + this.OooO0o;
        no1 no1Var = this.OooO;
        if (no1Var != null) {
            iHashCode = (iHashCode * 31) + no1Var.hashCode();
        }
        int iHashCode2 = this.OooO0oO.hashCode();
        return this.OooO0oo.OooO0O0.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.OooO0OO + ", signature=" + this.OooO0Oo + ", width=" + this.OooO0o0 + ", height=" + this.OooO0o + ", decodedResourceClass=" + this.OooO0oO + ", transformation='" + this.OooO + "', options=" + this.OooO0oo + '}';
    }
}

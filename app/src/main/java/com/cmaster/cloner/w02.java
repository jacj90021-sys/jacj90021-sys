package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w02 {
    public long OooO;
    public String OooO00o;
    public int OooO0O0 = 1;
    public String OooO0OO;
    public String OooO0Oo;
    public cn OooO0o;
    public cn OooO0o0;
    public long OooO0oO;
    public long OooO0oo;
    public ji OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public long OooOOO;
    public long OooOOO0;
    public long OooOOOO;
    public long OooOOOo;
    public int OooOOo;
    public boolean OooOOo0;

    static {
        ep0.OooO("WorkSpec");
    }

    public w02(String str, String str2) {
        cn cnVar = cn.OooO0OO;
        this.OooO0o0 = cnVar;
        this.OooO0o = cnVar;
        this.OooOO0 = ji.OooO;
        this.OooOO0o = 1;
        this.OooOOO0 = 30000L;
        this.OooOOOo = -1L;
        this.OooOOo = 1;
        this.OooO00o = str;
        this.OooO0OO = str2;
    }

    public final long OooO00o() {
        int i;
        if (this.OooO0O0 == 1 && (i = this.OooOO0O) > 0) {
            int i2 = this.OooOO0o;
            long j = this.OooOOO0;
            return Math.min(18000000L, i2 == 2 ? j * i : (long) Math.scalb(j, i - 1)) + this.OooOOO;
        }
        if (!OooO0OO()) {
            long jCurrentTimeMillis = this.OooOOO;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.OooO0oO;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j2 = this.OooOOO;
        if (j2 == 0) {
            j2 = this.OooO0oO + jCurrentTimeMillis2;
        }
        long j3 = this.OooO;
        long j4 = this.OooO0oo;
        if (j3 != j4) {
            return j2 + j4 + (j2 == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j2 != 0 ? j4 : 0L);
    }

    public final boolean OooO0O0() {
        return !ji.OooO.equals(this.OooOO0);
    }

    public final boolean OooO0OO() {
        return this.OooO0oo != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w02.class != obj.getClass()) {
            return false;
        }
        w02 w02Var = (w02) obj;
        if (this.OooO0oO != w02Var.OooO0oO || this.OooO0oo != w02Var.OooO0oo || this.OooO != w02Var.OooO || this.OooOO0O != w02Var.OooOO0O || this.OooOOO0 != w02Var.OooOOO0 || this.OooOOO != w02Var.OooOOO || this.OooOOOO != w02Var.OooOOOO || this.OooOOOo != w02Var.OooOOOo || this.OooOOo0 != w02Var.OooOOo0 || !this.OooO00o.equals(w02Var.OooO00o) || this.OooO0O0 != w02Var.OooO0O0 || !this.OooO0OO.equals(w02Var.OooO0OO)) {
            return false;
        }
        String str = this.OooO0Oo;
        String str2 = w02Var.OooO0Oo;
        if (str != null) {
            if (!str.equals(str2)) {
                return false;
            }
        } else if (str2 != null) {
            return false;
        }
        return this.OooO0o0.equals(w02Var.OooO0o0) && this.OooO0o.equals(w02Var.OooO0o) && this.OooOO0.equals(w02Var.OooOO0) && this.OooOO0o == w02Var.OooOO0o && this.OooOOo == w02Var.OooOOo;
    }

    public final int hashCode() {
        int iHashCode = (this.OooO0OO.hashCode() + ((rj.OooOOoo(this.OooO0O0) + (this.OooO00o.hashCode() * 31)) * 31)) * 31;
        String str = this.OooO0Oo;
        int iHashCode2 = (this.OooO0o.hashCode() + ((this.OooO0o0.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        long j = this.OooO0oO;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.OooO0oo;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.OooO;
        int iOooOOoo = (rj.OooOOoo(this.OooOO0o) + ((((this.OooOO0.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.OooOO0O) * 31)) * 31;
        long j4 = this.OooOOO0;
        int i3 = (iOooOOoo + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.OooOOO;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.OooOOOO;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.OooOOOo;
        return rj.OooOOoo(this.OooOOo) + ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.OooOOo0 ? 1 : 0)) * 31);
    }

    public final String toString() {
        return rj.OooO0oO(new StringBuilder("{WorkSpec: "), this.OooO00o, "}");
    }
}

package com.cmaster.cloner;

import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ji {
    public static final ji OooO;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;
    public int OooO00o = 1;
    public long OooO0o = -1;
    public long OooO0oO = -1;
    public aj OooO0oo = new aj();

    static {
        aj ajVar = new aj();
        ji jiVar = new ji();
        jiVar.OooO00o = 1;
        jiVar.OooO0o = -1L;
        jiVar.OooO0oO = -1L;
        new HashSet();
        jiVar.OooO0O0 = false;
        jiVar.OooO0OO = false;
        jiVar.OooO00o = 1;
        jiVar.OooO0Oo = false;
        jiVar.OooO0o0 = false;
        jiVar.OooO0oo = ajVar;
        jiVar.OooO0o = -1L;
        jiVar.OooO0oO = -1L;
        OooO = jiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ji.class != obj.getClass()) {
            return false;
        }
        ji jiVar = (ji) obj;
        if (this.OooO0O0 == jiVar.OooO0O0 && this.OooO0OO == jiVar.OooO0OO && this.OooO0Oo == jiVar.OooO0Oo && this.OooO0o0 == jiVar.OooO0o0 && this.OooO0o == jiVar.OooO0o && this.OooO0oO == jiVar.OooO0oO && this.OooO00o == jiVar.OooO00o) {
            return this.OooO0oo.equals(jiVar.OooO0oo);
        }
        return false;
    }

    public final int hashCode() {
        int iOooOOoo = ((((((((rj.OooOOoo(this.OooO00o) * 31) + (this.OooO0O0 ? 1 : 0)) * 31) + (this.OooO0OO ? 1 : 0)) * 31) + (this.OooO0Oo ? 1 : 0)) * 31) + (this.OooO0o0 ? 1 : 0)) * 31;
        long j = this.OooO0o;
        int i = (iOooOOoo + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.OooO0oO;
        return this.OooO0oo.OooO00o.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}

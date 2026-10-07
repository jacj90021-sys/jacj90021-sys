package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fl extends gl {
    public final long OooO0Oo;

    public fl(long j) {
        this.OooO0Oo = j;
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        long j = ((fl) ohVar).OooO0Oo;
        long j2 = this.OooO0Oo;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // com.cmaster.cloner.gl
    public final boolean OooO0o() {
        long j = this.OooO0Oo;
        return ((long) ((int) j)) == j;
    }

    @Override // com.cmaster.cloner.gl
    public final int OooO0oO() {
        return (int) this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.gl
    public final long OooO0oo() {
        return this.OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.OooO0Oo == ((fl) obj).OooO0Oo;
    }

    public final int hashCode() {
        long j = this.OooO0Oo;
        return ((int) j) ^ ((int) (j >> 32));
    }
}

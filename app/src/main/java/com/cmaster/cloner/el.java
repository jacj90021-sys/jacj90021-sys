package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class el extends gl {
    public final int OooO0Oo;

    public el(int i) {
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        int i = ((el) ohVar).OooO0Oo;
        int i2 = this.OooO0Oo;
        if (i2 < i) {
            return -1;
        }
        return i2 > i ? 1 : 0;
    }

    @Override // com.cmaster.cloner.gl
    public final boolean OooO0o() {
        return true;
    }

    @Override // com.cmaster.cloner.gl
    public final int OooO0oO() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.gl
    public final long OooO0oo() {
        return this.OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.OooO0Oo == ((el) obj).OooO0Oo;
    }

    public final int hashCode() {
        return this.OooO0Oo;
    }
}

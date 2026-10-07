package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tj2 implements lk2 {
    public final int OooO00o;

    public tj2(int i) {
        this.OooO00o = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return lk2.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk2)) {
            return false;
        }
        lk2 lk2Var = (lk2) obj;
        return this.OooO00o == lk2Var.zza() && ik2.OooO0Oo.equals(lk2Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.OooO00o ^ 14552422) + (ik2.OooO0Oo.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.OooO00o + "intEncoding=" + ik2.OooO0Oo + ')';
    }

    @Override // com.cmaster.cloner.lk2
    public final int zza() {
        return this.OooO00o;
    }

    @Override // com.cmaster.cloner.lk2
    public final ik2 zzb() {
        return ik2.OooO0Oo;
    }
}

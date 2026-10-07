package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w32 implements o42 {
    public final int OooO00o;

    public w32(int i) {
        this.OooO00o = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return o42.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o42)) {
            return false;
        }
        o42 o42Var = (o42) obj;
        return this.OooO00o == o42Var.zza() && m42.OooO0Oo.equals(o42Var.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.OooO00o ^ 14552422) + (m42.OooO0Oo.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.OooO00o + "intEncoding=" + m42.OooO0Oo + ')';
    }

    @Override // com.cmaster.cloner.o42
    public final int zza() {
        return this.OooO00o;
    }

    @Override // com.cmaster.cloner.o42
    public final m42 zzb() {
        return m42.OooO0Oo;
    }
}

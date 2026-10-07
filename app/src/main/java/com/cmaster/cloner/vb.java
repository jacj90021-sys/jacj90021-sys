package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vb implements Comparable {
    public final nl OooO0Oo;
    public final int OooO0o0;

    public vb(nl nlVar, int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-88, 102, -84, -127, -56, 124, 77, 25, -4, 39, -14}, new byte[]{-64, 7, -62, -27, -92, 25, 63, 57}));
            throw null;
        }
        this.OooO0o0 = i;
        this.OooO0Oo = nlVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(vb vbVar) {
        int i = vbVar.OooO0o0;
        int i2 = this.OooO0o0;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.OooO0Oo.compareTo(vbVar.OooO0Oo);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof vb) && compareTo((vb) obj) == 0;
    }

    public final int hashCode() {
        return this.OooO0Oo.hashCode() + (this.OooO0o0 * 31);
    }
}

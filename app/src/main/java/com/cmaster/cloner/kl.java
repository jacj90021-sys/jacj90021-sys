package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kl extends oh {
    public final ml OooO0Oo;
    public final ml OooO0o0;

    static {
        new kl(new ml(u7.OooO00o(new byte[]{-57, -14, -126, 73}, new byte[]{-109, -85, -46, 12, -94, -26, -9, 82})), new ml(u7.OooO00o(new byte[]{-4, 45, -87, 37, 92, -6, 94, 127, -34, 32, -25, 16, 81, -76, 65, 109, -117}, new byte[]{-80, 71, -56, 83, 61, -43, 50, 30})));
    }

    public kl(ml mlVar, ml mlVar2) {
        this.OooO0Oo = mlVar;
        this.OooO0o0 = mlVar2;
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return this.OooO0Oo.OooO00o() + ':' + this.OooO0o0.OooO00o();
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        kl klVar = (kl) ohVar;
        int iCompareTo = this.OooO0Oo.compareTo(klVar.OooO0Oo);
        return iCompareTo != 0 ? iCompareTo : this.OooO0o0.compareTo(klVar.OooO0o0);
    }

    @Override // com.cmaster.cloner.oh
    public final String OooO0o0() {
        return u7.OooO00o(new byte[]{-64, -117, -14}, new byte[]{-82, -22, -122, 43, 66, -80, 86, 33});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return this.OooO0Oo.equals(klVar.OooO0Oo) && this.OooO0o0.equals(klVar.OooO0o0);
    }

    public final int hashCode() {
        return this.OooO0o0.OooO0Oo.hashCode() ^ (this.OooO0Oo.OooO0Oo.hashCode() * 31);
    }

    public final String toString() {
        return u7.OooO00o(new byte[]{-106, 125, -51, -27}, new byte[]{-8, 28, -71, -98, 45, 42, -112, 3}) + OooO00o() + '}';
    }
}

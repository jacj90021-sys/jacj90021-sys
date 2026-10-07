package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class il extends eq1 {
    public final nl OooO0Oo;
    public final kl OooO0o0;

    public il(nl nlVar, kl klVar) {
        if (nlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{7, 78, 45, -94, 126, 115, -120, -62, 32, 71, 42, -72, 99, 58, -37, -104, 67, 69, 62, -89, 124}, new byte[]{99, 43, 75, -53, 16, 26, -26, -91}));
            throw null;
        }
        this.OooO0Oo = nlVar;
        this.OooO0o0 = klVar;
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return this.OooO0Oo.OooO0Oo.OooO00o() + '.' + this.OooO0o0.OooO00o();
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        il ilVar = (il) obj;
        return this.OooO0Oo.equals(ilVar.OooO0Oo) && this.OooO0o0.equals(ilVar.OooO0o0);
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode() ^ (this.OooO0Oo.hashCode() * 31);
    }

    public final String toString() {
        return OooO0o0() + '{' + OooO00o() + '}';
    }
}

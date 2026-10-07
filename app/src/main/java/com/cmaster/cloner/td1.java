package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class td1 extends OooOOO implements hk {
    public final ij OooO0oO;

    public td1(vj vjVar, ij ijVar) {
        super(vjVar, true);
        this.OooO0oO = ijVar;
    }

    @Override // com.cmaster.cloner.hk
    public final hk OooO0OO() {
        ij ijVar = this.OooO0oO;
        if (ijVar != null) {
            return ijVar;
        }
        return null;
    }

    @Override // com.cmaster.cloner.nk0
    public void OooO0oO(Object obj) {
        uu0.OooO00o(gu2.OooO00o(this.OooO0oO), cp2.OooO00o(obj));
    }

    @Override // com.cmaster.cloner.nk0
    public void OooOO0o(Object obj) {
        this.OooO0oO.OooO0Oo(cp2.OooO00o(obj));
    }

    @Override // com.cmaster.cloner.nk0
    public final boolean Oooo00o() {
        return true;
    }
}

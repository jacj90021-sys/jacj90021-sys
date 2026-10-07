package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jv implements bg0 {
    public final boolean OooO0Oo;

    public jv(boolean z) {
        this.OooO0Oo = z;
    }

    @Override // com.cmaster.cloner.bg0
    public final bx0 OooO0O0() {
        return null;
    }

    @Override // com.cmaster.cloner.bg0
    public final boolean OooO0Oo() {
        return this.OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.OooO0Oo ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}

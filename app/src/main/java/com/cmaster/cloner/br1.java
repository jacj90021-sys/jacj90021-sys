package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class br1 implements hl0, Serializable {
    public p30 OooO0Oo;
    public Object OooO0o0;

    @Override // com.cmaster.cloner.hl0
    public final Object getValue() {
        if (this.OooO0o0 == oOO0OO.OooO0o) {
            p30 p30Var = this.OooO0Oo;
            p30Var.getClass();
            this.OooO0o0 = p30Var.OooO00o();
            this.OooO0Oo = null;
        }
        return this.OooO0o0;
    }

    public final String toString() {
        return this.OooO0o0 != oOO0OO.OooO0o ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}

package com.cmaster.cloner;

import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wg0 implements mn {
    public final jp0 OooO00o;

    public wg0(jp0 jp0Var) {
        this.OooO00o = jp0Var;
    }

    @Override // com.cmaster.cloner.mn
    public final Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.cmaster.cloner.mn
    public final nn OooO0O0(Object obj) {
        return new xb1((InputStream) obj, this.OooO00o);
    }
}

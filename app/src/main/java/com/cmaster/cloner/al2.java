package com.cmaster.cloner;

import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class al2 {
    public Object OooO00o(Class cls) {
        r51 r51VarOooO0O0 = OooO0O0(cls);
        if (r51VarOooO0O0 == null) {
            return null;
        }
        return r51VarOooO0O0.get();
    }

    public abstract r51 OooO0O0(Class cls);

    public Set OooO0OO(Class cls) {
        return (Set) OooO0Oo(cls).get();
    }

    public abstract r51 OooO0Oo(Class cls);
}

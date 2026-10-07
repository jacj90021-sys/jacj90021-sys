package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public interface bu1 {
    default yt1 OooO0OO(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default yt1 OooO0Oo(rd rdVar, fv0 fv0Var) {
        Class cls = rdVar.OooO00o;
        cls.getClass();
        return OooOOO(cls, fv0Var);
    }

    default yt1 OooOOO(Class cls, fv0 fv0Var) {
        return OooO0OO(cls);
    }
}

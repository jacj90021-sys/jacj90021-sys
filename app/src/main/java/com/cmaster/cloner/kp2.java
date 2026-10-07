package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class kp2 {
    public static tj OooO00o(tj tjVar, uj ujVar) {
        ujVar.getClass();
        if (ij0.OooO00o(tjVar.getKey(), ujVar)) {
            return tjVar;
        }
        return null;
    }

    public static vj OooO0O0(tj tjVar, uj ujVar) {
        ujVar.getClass();
        return ij0.OooO00o(tjVar.getKey(), ujVar) ? lv.OooO0Oo : tjVar;
    }

    public static vj OooO0OO(tj tjVar, vj vjVar) {
        vjVar.getClass();
        return vjVar == lv.OooO0Oo ? tjVar : (vj) vjVar.OooO0o(tjVar, new af(1));
    }
}

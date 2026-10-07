package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gy1 extends oOO00OO {
    @Override // com.cmaster.cloner.ooooO000
    public final boolean OooO0O0() {
        if (!super.OooO0O0() || !u53.OooO00o("MULTI_PROCESS")) {
            return false;
        }
        int i = ey1.OooO00o;
        if (hy1.OooO0OO.OooO0O0()) {
            return iy1.OooO00o.getStatics().isMultiProcessEnabled();
        }
        throw hy1.OooO00o();
    }
}

package com.cmaster.cloner;

import org.apache.commons.compress.archivers.zip.UnixStat;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cl extends el {
    public static final cl OooO0o;
    public static final cl[] OooO0o0 = new cl[UnixStat.DEFAULT_LINK_PERM];

    static {
        OooO(-1);
        OooO0o = OooO(0);
        OooO(1);
        OooO(2);
        OooO(3);
        OooO(4);
        OooO(5);
    }

    public static cl OooO(int i) {
        cl[] clVarArr = OooO0o0;
        int length = (Integer.MAX_VALUE & i) % clVarArr.length;
        cl clVar = clVarArr[length];
        if (clVar != null && clVar.OooO0Oo == i) {
            return clVar;
        }
        cl clVar2 = new cl(i);
        clVarArr[length] = clVar2;
        return clVar2;
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return Integer.toString(this.OooO0Oo);
    }

    @Override // com.cmaster.cloner.oh
    public final String OooO0o0() {
        return u7.OooO00o(new byte[]{-125, -70, -110}, new byte[]{-22, -44, -26, 3, 56, 51, 94, -64});
    }

    @Override // com.cmaster.cloner.wp1
    public final vp1 getType() {
        return vp1.OooOOOO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{-118, 18, -79, 21, 65, -117}, new byte[]{-29, 124, -59, 110, 113, -13, -114, -26}));
        int i = this.OooO0Oo;
        sb.append(js2.OooO0OO(i));
        sb.append(u7.OooO00o(new byte[]{24, 56, 127}, new byte[]{56, 23, 95, -29, 96, 1, -34, 55}));
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}

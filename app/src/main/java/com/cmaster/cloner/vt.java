package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vt implements Comparable {
    public static final long OooO0Oo;
    public static final /* synthetic */ int OooO0o = 0;
    public static final long OooO0o0;

    static {
        int i = wt.OooO00o;
        OooO0Oo = oq2.OooO00o(4611686018427387903L);
        OooO0o0 = oq2.OooO00o(-4611686018427387903L);
    }

    public static final long OooO00o(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        if (-4611686018426L > j4 || j4 >= 4611686018427L) {
            return oq2.OooO00o(hy2.OooO00o(j4));
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i = wt.OooO00o;
        return j5;
    }

    public static final boolean OooO0O0(long j) {
        return j == OooO0Oo || j == OooO0o0;
    }
}

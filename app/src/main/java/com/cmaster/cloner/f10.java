package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class f10 implements Comparable {
    public final int OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final String OooO0oO;

    public f10(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = str;
        this.OooO0oO = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f10 f10Var = (f10) obj;
        f10Var.getClass();
        int i = this.OooO0Oo - f10Var.OooO0Oo;
        return i == 0 ? this.OooO0o0 - f10Var.OooO0o0 : i;
    }
}

package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n4 {
    public int OooO;
    public int OooO00o;
    public int OooO0O0;
    public float OooO0OO;
    public float OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public long OooO0oO;
    public float OooO0oo;

    public final float OooO00o(long j) {
        if (j < this.OooO0o0) {
            return 0.0f;
        }
        long j2 = this.OooO0oO;
        if (j2 < 0 || j < j2) {
            return mn0.OooO0O0((j - r0) / this.OooO00o, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.OooO0oo;
        return (mn0.OooO0O0((j - j2) / this.OooO, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}

package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y2 extends j43 {
    public static volatile y2 OooO0O0;
    public static final x2 OooO0OO = new x2(0);
    public final fp OooO00o = new fp();

    public static y2 OooO00o() {
        if (OooO0O0 != null) {
            return OooO0O0;
        }
        synchronized (y2.class) {
            try {
                if (OooO0O0 == null) {
                    OooO0O0 = new y2();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return OooO0O0;
    }
}

package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cr1 extends UnsupportedOperationException {
    public final iz OooO0Oo;

    public cr1(iz izVar) {
        this.OooO0Oo = izVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.OooO0Oo));
    }
}

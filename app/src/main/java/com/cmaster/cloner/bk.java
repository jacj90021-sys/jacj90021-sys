package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bk extends OooOOOO {
    public static final je OooO0o = new je(5);
    public final String OooO0o0;

    public bk() {
        super(OooO0o);
        this.OooO0o0 = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bk) && ij0.OooO00o(this.OooO0o0, ((bk) obj).OooO0o0);
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.OooO0o0 + ')';
    }
}

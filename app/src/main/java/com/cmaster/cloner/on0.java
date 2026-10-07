package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class on0 extends rn0 {
    public final cn OooO00o = cn.OooO0OO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || on0.class != obj.getClass()) {
            return false;
        }
        return this.OooO00o.equals(((on0) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() + (on0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.OooO00o + '}';
    }
}

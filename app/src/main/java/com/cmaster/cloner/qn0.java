package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qn0 extends rn0 {
    public final cn OooO00o;

    public qn0(cn cnVar) {
        this.OooO00o = cnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qn0.class != obj.getClass()) {
            return false;
        }
        return this.OooO00o.equals(((qn0) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() + (qn0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.OooO00o + '}';
    }
}

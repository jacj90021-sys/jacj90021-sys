package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q40 implements Cloneable {
    public im2 OooO0Oo;

    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final q40 clone() {
        try {
            return (q40) super.clone();
        } catch (CloneNotSupportedException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    public final boolean OooO0O0(Object obj) {
        if (obj instanceof q40) {
            return pr1.OooO0O0(this.OooO0Oo, ((q40) obj).OooO0Oo);
        }
        return false;
    }

    public final int OooO0OO() {
        im2 im2Var = this.OooO0Oo;
        if (im2Var != null) {
            return im2Var.hashCode();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q40) && OooO0O0(obj);
    }

    public final int hashCode() {
        return OooO0OO();
    }
}

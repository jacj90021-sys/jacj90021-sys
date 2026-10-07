package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ooOOOOoo {
    public int OooO00o;
    public int OooO0O0;
    public Object OooO0OO;
    public int OooO0Oo;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ooOOOOoo)) {
                return false;
            }
            ooOOOOoo oooooooo = (ooOOOOoo) obj;
            int i = this.OooO00o;
            if (i != oooooooo.OooO00o) {
                return false;
            }
            if (i != 8 || Math.abs(this.OooO0Oo - this.OooO0O0) != 1 || this.OooO0Oo != oooooooo.OooO0O0 || this.OooO0O0 != oooooooo.OooO0Oo) {
                if (this.OooO0Oo != oooooooo.OooO0Oo || this.OooO0O0 != oooooooo.OooO0O0) {
                    return false;
                }
                Object obj2 = this.OooO0OO;
                Object obj3 = oooooooo.OooO0OO;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0Oo;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.OooO00o;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.OooO0O0);
        sb.append("c:");
        sb.append(this.OooO0Oo);
        sb.append(",p:");
        sb.append(this.OooO0OO);
        sb.append("]");
        return sb.toString();
    }
}

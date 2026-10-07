package com.cmaster.cloner;

import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p00 {
    public String OooO00o;
    public String OooO0O0;
    public List OooO0OO;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p00)) {
            return false;
        }
        p00 p00Var = (p00) obj;
        return Objects.equals(this.OooO00o, p00Var.OooO00o) && Objects.equals(this.OooO0O0, p00Var.OooO0O0) && Objects.equals(this.OooO0OO, p00Var.OooO0OO);
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o, this.OooO0O0, this.OooO0OO);
    }
}

package com.cmaster.cloner;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sa1 {
    public final Resources OooO00o;
    public final Resources.Theme OooO0O0;

    public sa1(Resources resources, Resources.Theme theme) {
        this.OooO00o = resources;
        this.OooO0O0 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sa1.class == obj.getClass()) {
            sa1 sa1Var = (sa1) obj;
            if (this.OooO00o.equals(sa1Var.OooO00o) && Objects.equals(this.OooO0O0, sa1Var.OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o, this.OooO0O0);
    }
}

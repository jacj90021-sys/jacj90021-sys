package com.cmaster.cloner;

import android.view.DisplayCutout;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hs {
    public final DisplayCutout OooO00o;

    public hs(DisplayCutout displayCutout) {
        this.OooO00o = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hs.class != obj.getClass()) {
            return false;
        }
        return this.OooO00o.equals(((hs) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.OooO00o + "}";
    }
}

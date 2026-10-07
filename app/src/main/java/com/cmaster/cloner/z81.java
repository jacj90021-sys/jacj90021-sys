package com.cmaster.cloner;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class z81 implements qj {
    public final float OooO00o;

    public z81(float f) {
        this.OooO00o = f;
    }

    @Override // com.cmaster.cloner.qj
    public final float OooO00o(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.OooO00o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z81) && this.OooO00o == ((z81) obj).OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.OooO00o)});
    }

    public final String toString() {
        return rj.OooO0o(new StringBuilder(), (int) (this.OooO00o * 100.0f), "%");
    }
}

package com.cmaster.cloner;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class md implements qj {
    public final float OooO00o;

    public md(float f) {
        this.OooO00o = f;
    }

    @Override // com.cmaster.cloner.qj
    public final float OooO00o(RectF rectF) {
        return cw2.OooO00o(this.OooO00o, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof md) && this.OooO00o == ((md) obj).OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.OooO00o)});
    }
}

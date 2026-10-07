package com.cmaster.cloner;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00O0o implements qj {
    public final qj OooO00o;
    public final float OooO0O0;

    public oO00O0o(float f, qj qjVar) {
        while (qjVar instanceof oO00O0o) {
            qjVar = ((oO00O0o) qjVar).OooO00o;
            f += ((oO00O0o) qjVar).OooO0O0;
        }
        this.OooO00o = qjVar;
        this.OooO0O0 = f;
    }

    @Override // com.cmaster.cloner.qj
    public final float OooO00o(RectF rectF) {
        return Math.max(0.0f, this.OooO00o.OooO00o(rectF) + this.OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oO00O0o)) {
            return false;
        }
        oO00O0o oo00o0o = (oO00O0o) obj;
        return this.OooO00o.equals(oo00o0o.OooO00o) && this.OooO0O0 == oo00o0o.OooO0O0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO00o, Float.valueOf(this.OooO0O0)});
    }
}

package com.cmaster.cloner;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vq0 extends rr2 {
    public final int OooO00o;

    public vq0(int i) {
        this.OooO00o = i;
    }

    @Override // com.cmaster.cloner.rr2
    public final float OooO00o(Drawable drawable) {
        float[] fArr = ((wq0) drawable).Oooo000;
        if (fArr != null) {
            return fArr[this.OooO00o];
        }
        return 0.0f;
    }

    @Override // com.cmaster.cloner.rr2
    public final void OooO0O0(Drawable drawable, float f) {
        float fOooO00o;
        wq0 wq0Var = (wq0) drawable;
        float[] fArr = wq0Var.Oooo000;
        if (fArr != null) {
            int i = this.OooO00o;
            if (fArr[i] != f) {
                fArr[i] = f;
                pg0 pg0Var = wq0Var.Oooo00o;
                if (pg0Var != null) {
                    cg1 cg1Var = wq0Var.OooOo0O;
                    if (fArr != null) {
                        fOooO00o = (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
                    } else {
                        RectF rectFOooO0o = wq0Var.OooO0o();
                        ag1 ag1Var = wq0Var.OooO0o0.OooO00o;
                        cg1Var.getClass();
                        fOooO00o = (((wq0Var.OooO0o0.OooO00o.OooO0oo.OooO00o(rectFOooO0o) + ag1Var.OooO0o0.OooO00o(rectFOooO0o)) - wq0Var.OooO0o0.OooO00o.OooO0oO.OooO00o(rectFOooO0o)) - wq0Var.OooO0o0.OooO00o.OooO0o.OooO00o(rectFOooO0o)) / 2.0f;
                    }
                    kq0 kq0Var = (kq0) pg0Var.OooO0Oo;
                    int i2 = (int) (fOooO00o * 0.11f);
                    if (kq0Var.OooOoO0 != i2) {
                        kq0Var.OooOoO0 = i2;
                        kq0Var.OooO();
                        kq0Var.invalidate();
                    }
                }
                wq0Var.invalidateSelf();
            }
        }
    }
}

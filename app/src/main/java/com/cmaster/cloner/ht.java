package com.cmaster.cloner;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ht {
    public final ld OooO00o;
    public final Path OooO0O0;
    public final Path OooO0OO;
    public final PathMeasure OooO0Oo;
    public final Matrix OooO0o0;

    public ht(ld ldVar) {
        Path path = new Path();
        this.OooO0O0 = path;
        this.OooO0OO = new Path();
        this.OooO0Oo = new PathMeasure(path, false);
        this.OooO00o = ldVar;
        this.OooO0o0 = new Matrix();
    }

    public abstract void OooO00o();

    public final void OooO0O0(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        this.OooO00o.OooO0O0();
        fd fdVar = (fd) this;
        float fWidth = rect.width() / fdVar.OooO0oO();
        float fHeight = rect.height() / fdVar.OooO0oO();
        ld ldVar = fdVar.OooO00o;
        float f2 = (ldVar.OooOOOo / 2.0f) + ldVar.OooOOo0;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (ldVar.OooOOo != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        fdVar.OooO0o = ldVar.OooO00o * f;
        fdVar.OooO0oO = Math.min(r9 / 2, ldVar.OooO0Oo ? (int) (r10 * ldVar.OooO0OO) : ldVar.OooO0O0) * f;
        fdVar.OooO0oo = ldVar.OooOO0o * f;
        int i = ldVar.OooOOOo;
        int i2 = ldVar.OooO00o;
        float f4 = (i - i2) / 2.0f;
        fdVar.OooO = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && ldVar.OooO0oO == 2) || (z2 && ldVar.OooO0oo == 1)) {
                fdVar.OooO = f4 + f5;
            } else if ((z && ldVar.OooO0oO == 1) || (z2 && ldVar.OooO0oo == 2)) {
                fdVar.OooO = f4 - f5;
            }
        }
        if (z2 && ldVar.OooO0oo == 3) {
            fdVar.OooOOOO = f;
        } else {
            fdVar.OooOOOO = 1.0f;
        }
    }
}

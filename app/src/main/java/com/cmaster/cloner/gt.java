package com.cmaster.cloner;

import android.graphics.Matrix;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gt {
    public final float[] OooO00o = new float[2];
    public final float[] OooO0O0 = {1.0f, 0.0f};
    public final Matrix OooO0OO = new Matrix();

    public final void OooO00o(float f) {
        float[] fArr = this.OooO0O0;
        float fAtan2 = (float) (Math.atan2(fArr[1], fArr[0]) + 1.5707963267948966d);
        float[] fArr2 = this.OooO00o;
        double d = f;
        double d2 = fAtan2;
        fArr2[0] = (float) ((Math.cos(d2) * d) + fArr2[0]);
        fArr2[1] = (float) ((Math.sin(d2) * d) + fArr2[1]);
    }

    public final void OooO0O0() {
        Arrays.fill(this.OooO00o, 0.0f);
        float[] fArr = this.OooO0O0;
        Arrays.fill(fArr, 0.0f);
        fArr[0] = 1.0f;
        this.OooO0OO.reset();
    }

    public final void OooO0OO(float f) {
        Matrix matrix = this.OooO0OO;
        matrix.reset();
        matrix.setRotate(f);
        matrix.mapPoints(this.OooO00o);
        matrix.mapPoints(this.OooO0O0);
    }
}

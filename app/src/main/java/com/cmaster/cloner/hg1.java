package com.cmaster.cloner;

import android.graphics.Matrix;
import android.graphics.Path;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hg1 extends ig1 {
    public float OooO0O0;
    public float OooO0OO;

    @Override // com.cmaster.cloner.ig1
    public final void OooO00o(Matrix matrix, Path path) {
        Matrix matrix2 = this.OooO00o;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.OooO0O0, this.OooO0OO);
        path.transform(matrix);
    }
}

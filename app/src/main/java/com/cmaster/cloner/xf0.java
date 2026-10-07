package com.cmaster.cloner;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xf0 extends Property {
    public final Matrix OooO00o;

    public xf0() {
        super(Matrix.class, "imageMatrixProperty");
        this.OooO00o = new Matrix();
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        Matrix imageMatrix = ((ImageView) obj).getImageMatrix();
        Matrix matrix = this.OooO00o;
        matrix.set(imageMatrix);
        return matrix;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}

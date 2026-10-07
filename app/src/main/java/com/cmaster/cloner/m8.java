package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m8 implements no1 {
    @Override // com.cmaster.cloner.no1
    public final fa1 OooO0O0(Context context, fa1 fa1Var, int i, int i2) {
        if (!pr1.OooO(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        k8 k8Var = com.bumptech.glide.OooO00o.OooO00o(context).OooO0Oo;
        Bitmap bitmap = (Bitmap) fa1Var.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapOooO0OO = OooO0OO(k8Var, bitmap, i, i2);
        return bitmap.equals(bitmapOooO0OO) ? fa1Var : l8.OooO0OO(bitmapOooO0OO, k8Var);
    }

    public abstract Bitmap OooO0OO(k8 k8Var, Bitmap bitmap, int i, int i2);
}

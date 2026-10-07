package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dc extends m8 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(zk0.OooO00o);

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.cmaster.cloner.m8
    public final Bitmap OooO0OO(k8 k8Var, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = po1.OooO00o;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapOooO0Oo = k8Var.OooO0Oo(i, i2, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapOooO0Oo.setHasAlpha(bitmap.hasAlpha());
        po1.OooO00o(bitmap, bitmapOooO0Oo, matrix);
        return bitmapOooO0Oo;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        return obj instanceof dc;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return -599754482;
    }
}

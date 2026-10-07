package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ec extends m8 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(zk0.OooO00o);

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.cmaster.cloner.m8
    public final Bitmap OooO0OO(k8 k8Var, Bitmap bitmap, int i, int i2) {
        Paint paint = po1.OooO00o;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return po1.OooO0O0(k8Var, bitmap, i, i2);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        return obj instanceof ec;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return -670243078;
    }
}

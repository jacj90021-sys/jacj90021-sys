package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dd extends m8 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(zk0.OooO00o);

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.cmaster.cloner.m8
    public final Bitmap OooO0OO(k8 k8Var, Bitmap bitmap, int i, int i2) {
        Bitmap bitmapOooO0Oo;
        Lock lock = po1.OooO0Oo;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        int i3 = Build.VERSION.SDK_INT;
        Bitmap.Config config = (i3 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
        if (config.equals(bitmap.getConfig())) {
            bitmapOooO0Oo = bitmap;
        } else {
            bitmapOooO0Oo = k8Var.OooO0Oo(bitmap.getWidth(), bitmap.getHeight(), config);
            new Canvas(bitmapOooO0Oo).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        Bitmap bitmapOooO0Oo2 = k8Var.OooO0Oo(iMin, iMin, (i3 < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16);
        bitmapOooO0Oo2.setHasAlpha(true);
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapOooO0Oo2);
            canvas.drawCircle(f2, f2, f2, po1.OooO0O0);
            canvas.drawBitmap(bitmapOooO0Oo, (Rect) null, rectF, po1.OooO0OO);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapOooO0Oo.equals(bitmap)) {
                k8Var.OooO0O0(bitmapOooO0Oo);
            }
            return bitmapOooO0Oo2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        return obj instanceof dd;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return 1101716364;
    }
}

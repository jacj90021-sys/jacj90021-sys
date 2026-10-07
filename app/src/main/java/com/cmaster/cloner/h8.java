package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h8 implements ia1 {
    public final /* synthetic */ int OooO00o;
    public final k8 OooO0O0;

    public h8() {
        this.OooO00o = 0;
        this.OooO0O0 = new im2();
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return OooO0OO(o0000oo.OooO0Oo(obj), i, i2, xz0Var);
            default:
                return l8.OooO0OO(((ni1) obj).OooO0O0(), this.OooO0O0);
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final /* bridge */ /* synthetic */ boolean OooO0O0(Object obj, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                o0000oo.OooOo00(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public l8 OooO0OO(ImageDecoder.Source source, int i, int i2, xz0 xz0Var) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new vo(i, i2, xz0Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new l8(bitmapDecodeBitmap, (im2) this.OooO0O0);
    }

    public h8(k8 k8Var) {
        this.OooO00o = 1;
        this.OooO0O0 = k8Var;
    }
}

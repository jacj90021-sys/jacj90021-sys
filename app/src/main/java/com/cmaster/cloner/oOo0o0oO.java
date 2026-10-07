package com.cmaster.cloner;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oOo0o0oO implements ia1 {
    public final /* synthetic */ int OooO00o;
    public final e81 OooO0O0;

    public /* synthetic */ oOo0o0oO(int i, e81 e81Var) {
        this.OooO00o = i;
        this.OooO0O0 = e81Var;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return e81.OooO0OO(ImageDecoder.createSource((ByteBuffer) obj), i, i2, xz0Var);
            default:
                return e81.OooO0OO(ImageDecoder.createSource(ba.OooO0O0((InputStream) obj)), i, i2, xz0Var);
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) throws IOException {
        int i = this.OooO00o;
        e81 e81Var = this.OooO0O0;
        switch (i) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeOooO0OO = yt2.OooO0OO((ArrayList) e81Var.OooO0o0, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeOooO0OO != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeOooO0OO != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
            default:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeOooO0O0 = yt2.OooO0O0((ArrayList) e81Var.OooO0o0, (InputStream) obj, (jp0) e81Var.OooO0o);
                if (imageHeaderParser$ImageTypeOooO0O0 != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
                    if (Build.VERSION.SDK_INT < 31 || imageHeaderParser$ImageTypeOooO0O0 != ImageHeaderParser$ImageType.ANIMATED_AVIF) {
                        break;
                    }
                }
                break;
        }
        return false;
    }
}

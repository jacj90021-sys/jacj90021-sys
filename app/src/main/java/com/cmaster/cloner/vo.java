package com.cmaster.cloner;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vo implements ImageDecoder.OnHeaderDecodedListener {
    public final h70 OooO00o = h70.OooO00o();
    public final int OooO0O0;
    public final int OooO0OO;
    public final sn OooO0Oo;
    public final boolean OooO0o;
    public final ss OooO0o0;
    public final r41 OooO0oO;

    public vo(int i, int i2, xz0 xz0Var) {
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = (sn) xz0Var.OooO0OO(us.OooO0o);
        this.OooO0o0 = (ss) xz0Var.OooO0OO(ss.OooO0oO);
        tz0 tz0Var = us.OooO;
        this.OooO0o = xz0Var.OooO0OO(tz0Var) != null && ((Boolean) xz0Var.OooO0OO(tz0Var)).booleanValue();
        this.OooO0oO = (r41) xz0Var.OooO0OO(us.OooO0oO);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = this.OooO0o;
        h70 h70Var = this.OooO00o;
        int width = this.OooO0O0;
        int height = this.OooO0OO;
        if (h70Var.OooO0OO(width, height, z, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.OooO0Oo == sn.OooO0o0) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new uo());
        Size size = imageInfo.getSize();
        if (width == Integer.MIN_VALUE) {
            width = size.getWidth();
        }
        if (height == Integer.MIN_VALUE) {
            height = size.getHeight();
        }
        float fOooO0O0 = this.OooO0o0.OooO0O0(size.getWidth(), size.getHeight(), width, height);
        int iRound = Math.round(size.getWidth() * fOooO0O0);
        int iRound2 = Math.round(size.getHeight() * fOooO0O0);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fOooO0O0);
        }
        imageDecoder.setTargetSize(iRound, iRound2);
        r41 r41Var = this.OooO0oO;
        if (r41Var != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                imageDecoder.setTargetColorSpace(ColorSpace.get((r41Var == r41.OooO0Oo && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (i >= 26) {
                ColorSpace.Named unused = ColorSpace.Named.SRGB;
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}

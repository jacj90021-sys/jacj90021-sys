package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wt2 {
    public static ByteBuffer OooO00o(ug0 ug0Var) throws bu0 {
        int i;
        int i2 = ug0Var.OooO0o;
        if (i2 != -1) {
            if (i2 == 17) {
                ByteBuffer byteBuffer = ug0Var.OooO0O0;
                by2.OooO0oo(byteBuffer);
                return byteBuffer;
            }
            if (i2 == 35) {
                by2.OooO0oo(null);
                throw null;
            }
            if (i2 != 842094169) {
                throw new bu0("Unsupported image format", 13);
            }
            ByteBuffer byteBuffer2 = ug0Var.OooO0O0;
            by2.OooO0oo(byteBuffer2);
            byteBuffer2.rewind();
            int iLimit = byteBuffer2.limit();
            int i3 = iLimit / 6;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iLimit);
            int i4 = 0;
            while (true) {
                i = i3 * 4;
                if (i4 >= i) {
                    break;
                }
                byteBufferAllocateDirect.put(i4, byteBuffer2.get(i4));
                i4++;
            }
            for (int i5 = 0; i5 < i3 + i3; i5++) {
                byteBufferAllocateDirect.put(i + i5, byteBuffer2.get((i5 / 2) + ((i5 % 2) * i3) + i));
            }
            return byteBufferAllocateDirect;
        }
        Bitmap bitmapCopy = ug0Var.OooO00o;
        by2.OooO0oo(bitmapCopy);
        if (Build.VERSION.SDK_INT >= 26 && bitmapCopy.getConfig() == Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapCopy.copy(Bitmap.Config.ARGB_8888, bitmapCopy.isMutable());
        }
        Bitmap bitmap = bitmapCopy;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i6 = width * height;
        int[] iArr = new int[i6];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int iCeil = (int) Math.ceil(height / 2.0d);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(((iCeil + iCeil) * ((int) Math.ceil(width / 2.0d))) + i6);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9++) {
            int i10 = 0;
            while (i10 < width) {
                int i11 = iArr[i8];
                int i12 = i11 >> 16;
                int i13 = i11 >> 8;
                int i14 = i11 & 255;
                int i15 = i7 + 1;
                int i16 = i12 & 255;
                int i17 = i13 & 255;
                byteBufferAllocateDirect2.put(i7, (byte) Math.min(255, ((((i14 * 25) + ((i17 * 129) + (i16 * 66))) + 128) >> 8) + 16));
                if (i9 % 2 == 0 && i8 % 2 == 0) {
                    int i18 = ((((i16 * 112) - (i17 * 94)) - (i14 * 18)) + 128) >> 8;
                    int i19 = (((((i16 * (-38)) - (i17 * 74)) + (i14 * 112)) + 128) >> 8) + 128;
                    int i20 = i6 + 1;
                    byteBufferAllocateDirect2.put(i6, (byte) Math.min(255, i18 + 128));
                    i6 += 2;
                    byteBufferAllocateDirect2.put(i20, (byte) Math.min(255, i19));
                }
                i8++;
                i10++;
                i7 = i15;
            }
        }
        return byteBufferAllocateDirect2;
    }
}

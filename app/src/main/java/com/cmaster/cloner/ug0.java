package com.cmaster.cloner;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ug0 {
    public volatile Bitmap OooO00o;
    public volatile ByteBuffer OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public ug0(ByteBuffer byteBuffer, int i, int i2, int i3) {
        by2.OooO0oo(byteBuffer);
        this.OooO0O0 = byteBuffer;
        by2.OooO00o("Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.", byteBuffer.limit() > i * i2);
        byteBuffer.rewind();
        this.OooO0OO = i;
        this.OooO0Oo = i2;
        by2.OooO00o("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", i3 == 0 || i3 == 90 || i3 == 180 || i3 == 270);
        this.OooO0o0 = i3;
        this.OooO0o = 17;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0083 A[Catch: FileNotFoundException -> 0x003a, TRY_LEAVE, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae A[PHI: r8
      0x00ae: PHI (r8v4 android.graphics.Matrix) = (r8v0 android.graphics.Matrix), (r8v1 android.graphics.Matrix) binds: [B:43:0x00ab, B:52:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bf A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c6 A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d1 A[Catch: FileNotFoundException -> 0x003a, TryCatch #6 {FileNotFoundException -> 0x003a, blocks: (B:3:0x0018, B:5:0x001e, B:7:0x002c, B:42:0x0096, B:43:0x00ab, B:54:0x00dc, B:56:0x00e5, B:45:0x00b0, B:46:0x00b4, B:47:0x00bb, B:48:0x00bf, B:49:0x00c6, B:50:0x00ca, B:52:0x00d1, B:36:0x0083, B:39:0x008c, B:33:0x0073, B:60:0x0102, B:61:0x0109), top: B:77:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.ug0 OooO00o(android.net.Uri r13, android.content.Context r14) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.io.IOException, java.lang.SecurityException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ug0.OooO00o(android.net.Uri, android.content.Context):com.cmaster.cloner.ug0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0O0(int r14, int r15, long r16, int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ug0.OooO0O0(int, int, long, int, int, int, int):void");
    }

    public ug0(Bitmap bitmap) {
        by2.OooO0oo(bitmap);
        this.OooO00o = bitmap;
        this.OooO0OO = bitmap.getWidth();
        this.OooO0Oo = bitmap.getHeight();
        this.OooO0o0 = 0;
        this.OooO0o = -1;
    }
}

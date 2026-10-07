package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class us {
    public static final tz0 OooO;
    public static final tz0 OooO0o = tz0.OooO00o(sn.OooO0o, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final tz0 OooO0oO = new tz0("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, tz0.OooO0o0);
    public static final tz0 OooO0oo;
    public static final qc3 OooOO0;
    public static final ArrayDeque OooOO0O;
    public final k8 OooO00o;
    public final DisplayMetrics OooO0O0;
    public final jp0 OooO0OO;
    public final ArrayList OooO0Oo;
    public final h70 OooO0o0 = h70.OooO00o();

    static {
        ss ssVar = ss.OooO0O0;
        Boolean bool = Boolean.FALSE;
        OooO0oo = tz0.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        OooO = tz0.OooO00o(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        OooOO0 = new qc3(5);
        Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = pr1.OooO00o;
        OooOO0O = new ArrayDeque(0);
    }

    public us(ArrayList arrayList, DisplayMetrics displayMetrics, k8 k8Var, jp0 jp0Var) {
        this.OooO0Oo = arrayList;
        zx2.OooO0OO(displayMetrics, "Argument must not be null");
        this.OooO0O0 = displayMetrics;
        zx2.OooO0OO(k8Var, "Argument must not be null");
        this.OooO00o = k8Var;
        zx2.OooO0OO(jp0Var, "Argument must not be null");
        this.OooO0OO = jp0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap OooO0OO(com.cmaster.cloner.yf0 r9, android.graphics.BitmapFactory.Options r10, com.cmaster.cloner.ts r11, com.cmaster.cloner.k8 r12) {
        /*
            java.lang.String r0 = "Downsampler"
            boolean r1 = r10.inJustDecodeBounds
            if (r1 != 0) goto Lc
            r11.OooO0Oo()
            r9.OooOO0o()
        Lc:
            int r1 = r10.outWidth
            int r2 = r10.outHeight
            java.lang.String r3 = r10.outMimeType
            java.util.concurrent.locks.Lock r4 = com.cmaster.cloner.po1.OooO0Oo
            r4.lock()
            android.graphics.Bitmap r9 = r9.OooO(r10)     // Catch: java.lang.IllegalArgumentException -> L1f java.lang.Throwable -> L66
            r4.unlock()
            return r9
        L1f:
            r4 = move-exception
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L66
            java.lang.String r6 = "Exception decoding bitmap, outWidth: "
            java.lang.String r7 = ", outHeight: "
            java.lang.String r8 = ", outMimeType: "
            java.lang.StringBuilder r1 = com.cmaster.cloner.rj.OooO(r1, r2, r6, r7, r8)     // Catch: java.lang.Throwable -> L66
            r1.append(r3)     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = ", inBitmap: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            android.graphics.Bitmap r2 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            java.lang.String r2 = OooO0Oo(r2)     // Catch: java.lang.Throwable -> L66
            r1.append(r2)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L66
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L50
            java.lang.String r1 = "Failed to decode with inBitmap, trying again without Bitmap re-use"
            android.util.Log.d(r0, r1, r5)     // Catch: java.lang.Throwable -> L66
        L50:
            android.graphics.Bitmap r0 = r10.inBitmap     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L65
            r12.OooO0O0(r0)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            r0 = 0
            r10.inBitmap = r0     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            android.graphics.Bitmap r9 = OooO0OO(r9, r10, r11, r12)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L66
            java.util.concurrent.locks.Lock r10 = com.cmaster.cloner.po1.OooO0Oo
            r10.unlock()
            return r9
        L64:
            throw r5     // Catch: java.lang.Throwable -> L66
        L65:
            throw r5     // Catch: java.lang.Throwable -> L66
        L66:
            r9 = move-exception
            java.util.concurrent.locks.Lock r10 = com.cmaster.cloner.po1.OooO0Oo
            r10.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.us.OooO0OO(com.cmaster.cloner.yf0, android.graphics.BitmapFactory$Options, com.cmaster.cloner.ts, com.cmaster.cloner.k8):android.graphics.Bitmap");
    }

    public static String OooO0Oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void OooO0o0(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final l8 OooO00o(yf0 yf0Var, int i, int i2, xz0 xz0Var, ts tsVar) {
        ArrayDeque arrayDeque;
        BitmapFactory.Options options;
        byte[] bArr = (byte[]) this.OooO0OO.OooO0OO(65536, byte[].class);
        synchronized (us.class) {
            arrayDeque = OooOO0O;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                OooO0o0(options);
            }
        }
        options.inTempStorage = bArr;
        sn snVar = (sn) xz0Var.OooO0OO(OooO0o);
        r41 r41Var = (r41) xz0Var.OooO0OO(OooO0oO);
        ss ssVar = (ss) xz0Var.OooO0OO(ss.OooO0oO);
        boolean zBooleanValue = ((Boolean) xz0Var.OooO0OO(OooO0oo)).booleanValue();
        tz0 tz0Var = OooO;
        try {
            l8 l8VarOooO0OO = l8.OooO0OO(OooO0O0(yf0Var, options, ssVar, snVar, r41Var, xz0Var.OooO0OO(tz0Var) != null && ((Boolean) xz0Var.OooO0OO(tz0Var)).booleanValue(), i, i2, zBooleanValue, tsVar), this.OooO00o);
            OooO0o0(options);
            synchronized (arrayDeque) {
                arrayDeque.offer(options);
            }
            this.OooO0OO.OooO0oO(bArr);
            return l8VarOooO0OO;
        } catch (Throwable th) {
            OooO0o0(options);
            ArrayDeque arrayDeque2 = OooOO0O;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(options);
                this.OooO0OO.OooO0oO(bArr);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0O0(com.cmaster.cloner.yf0 r42, android.graphics.BitmapFactory.Options r43, com.cmaster.cloner.ss r44, com.cmaster.cloner.sn r45, com.cmaster.cloner.r41 r46, boolean r47, int r48, int r49, boolean r50, com.cmaster.cloner.ts r51) {
        /*
            Method dump skipped, instructions count: 1404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.us.OooO0O0(com.cmaster.cloner.yf0, android.graphics.BitmapFactory$Options, com.cmaster.cloner.ss, com.cmaster.cloner.sn, com.cmaster.cloner.r41, boolean, int, int, boolean, com.cmaster.cloner.ts):android.graphics.Bitmap");
    }
}

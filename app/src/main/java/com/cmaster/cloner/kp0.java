package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kp0 implements k8 {
    public static final Bitmap.Config OooOOO0 = Bitmap.Config.ARGB_8888;
    public int OooO;
    public final sh1 OooO0Oo;
    public final oOO0OO OooO0o;
    public final Set OooO0o0;
    public final long OooO0oO;
    public long OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;

    public kp0(long j) {
        sh1 sh1Var = new sh1();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add(null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.OooO0oO = j;
        this.OooO0Oo = sh1Var;
        this.OooO0o0 = setUnmodifiableSet;
        this.OooO0o = new oOO0OO();
    }

    @Override // com.cmaster.cloner.k8
    public final Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0o0 = OooO0o0(i, i2, config);
        if (bitmapOooO0o0 != null) {
            return bitmapOooO0o0;
        }
        if (config == null) {
            config = OooOOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.cmaster.cloner.k8
    public final synchronized void OooO0O0(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.OooO0Oo.getClass();
                if (pr1.OooO0OO(bitmap) <= this.OooO0oO && this.OooO0o0.contains(bitmap.getConfig())) {
                    this.OooO0Oo.getClass();
                    int iOooO0OO = pr1.OooO0OO(bitmap);
                    this.OooO0Oo.OooO0o0(bitmap);
                    this.OooO0o.getClass();
                    this.OooOO0O++;
                    this.OooO0oo += iOooO0OO;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.OooO0Oo.getClass();
                        Log.v("LruBitmapPool", "Put bitmap in pool=".concat(sh1.OooO0OO(pr1.OooO0OO(bitmap), bitmap.getConfig())));
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        OooO0OO();
                    }
                    OooO0oo(this.OooO0oO);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb = new StringBuilder("Reject bitmap from pool, bitmap: ");
                this.OooO0Oo.getClass();
                sb.append(sh1.OooO0OO(pr1.OooO0OO(bitmap), bitmap.getConfig()));
                sb.append(", is mutable: ");
                sb.append(bitmap.isMutable());
                sb.append(", is allowed config: ");
                sb.append(this.OooO0o0.contains(bitmap.getConfig()));
                Log.v("LruBitmapPool", sb.toString());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0OO() {
        Log.v("LruBitmapPool", "Hits=" + this.OooO + ", misses=" + this.OooOO0 + ", puts=" + this.OooOO0O + ", evictions=" + this.OooOO0o + ", currentSize=" + this.OooO0oo + ", maxSize=" + this.OooO0oO + "\nStrategy=" + this.OooO0Oo);
    }

    @Override // com.cmaster.cloner.k8
    public final Bitmap OooO0Oo(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0o0 = OooO0o0(i, i2, config);
        if (bitmapOooO0o0 != null) {
            bitmapOooO0o0.eraseColor(0);
            return bitmapOooO0o0;
        }
        if (config == null) {
            config = OooOOO0;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.cmaster.cloner.k8
    public final void OooO0o(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i);
        }
        if (i >= 40 || i >= 20) {
            OooO0oO();
        } else if (i >= 20 || i == 15) {
            OooO0oo(this.OooO0oO / 2);
        }
    }

    public final synchronized Bitmap OooO0o0(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapOooO0O0;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapOooO0O0 = this.OooO0Oo.OooO0O0(i, i2, config != null ? config : OooOOO0);
            if (bitmapOooO0O0 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.OooO0Oo.getClass();
                    Log.d("LruBitmapPool", "Missing bitmap=".concat(sh1.OooO0OO(pr1.OooO0Oo(config) * i * i2, config)));
                }
                this.OooOO0++;
            } else {
                this.OooO++;
                long j = this.OooO0oo;
                this.OooO0Oo.getClass();
                this.OooO0oo = j - pr1.OooO0OO(bitmapOooO0O0);
                this.OooO0o.getClass();
                bitmapOooO0O0.setHasAlpha(true);
                bitmapOooO0O0.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.OooO0Oo.getClass();
                Log.v("LruBitmapPool", "Get bitmap=".concat(sh1.OooO0OO(pr1.OooO0Oo(config) * i * i2, config)));
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                OooO0OO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapOooO0O0;
    }

    @Override // com.cmaster.cloner.k8
    public final void OooO0oO() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        OooO0oo(0L);
    }

    public final synchronized void OooO0oo(long j) {
        while (this.OooO0oo > j) {
            try {
                sh1 sh1Var = this.OooO0Oo;
                Bitmap bitmap = (Bitmap) sh1Var.OooO0O0.OooOoO0();
                if (bitmap != null) {
                    sh1Var.OooO00o(Integer.valueOf(pr1.OooO0OO(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        OooO0OO();
                    }
                    this.OooO0oo = 0L;
                    return;
                }
                this.OooO0o.getClass();
                long j2 = this.OooO0oo;
                this.OooO0Oo.getClass();
                this.OooO0oo = j2 - pr1.OooO0OO(bitmap);
                this.OooOO0o++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    this.OooO0Oo.getClass();
                    sb.append(sh1.OooO0OO(pr1.OooO0OO(bitmap), bitmap.getConfig()));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    OooO0OO();
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

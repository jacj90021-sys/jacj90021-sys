package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w9 implements ia1 {
    public static final gu0 OooO0o = new gu0(4);
    public static final xb1 OooO0oO = new xb1(8);
    public final Context OooO00o;
    public final ArrayList OooO0O0;
    public final e81 OooO0o0;
    public final gu0 OooO0Oo = OooO0o;
    public final xb1 OooO0OO = OooO0oO;

    public w9(Context context, ArrayList arrayList, k8 k8Var, jp0 jp0Var) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = arrayList;
        this.OooO0o0 = new e81(k8Var, jp0Var, 17);
    }

    public static int OooO0Oo(e50 e50Var, int i, int i2) {
        int iMin = Math.min(e50Var.OooO0oO / i2, e50Var.OooO0o / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            StringBuilder sbOooO = rj.OooO(iMax, i, "Downsampling GIF, sampleSize: ", ", target dimens: [", "x");
            sbOooO.append(i2);
            sbOooO.append("], actual dimens: [");
            sbOooO.append(e50Var.OooO0o);
            sbOooO.append("x");
            sbOooO.append(e50Var.OooO0oO);
            sbOooO.append("]");
            Log.v("BufferGifDecoder", sbOooO.toString());
        }
        return iMax;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        f50 f50Var;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        xb1 xb1Var = this.OooO0OO;
        synchronized (xb1Var) {
            try {
                f50 f50Var2 = (f50) ((ArrayDeque) xb1Var.OooO0o0).poll();
                if (f50Var2 == null) {
                    f50Var2 = new f50();
                }
                f50Var = f50Var2;
                f50Var.OooO0O0 = null;
                Arrays.fill(f50Var.OooO00o, (byte) 0);
                f50Var.OooO0OO = new e50();
                f50Var.OooO0Oo = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                f50Var.OooO0O0 = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                f50Var.OooO0O0.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return OooO0OO(byteBuffer, i, i2, f50Var, xz0Var);
        } finally {
            this.OooO0OO.Oooo0(f50Var);
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        return !((Boolean) xz0Var.OooO0OO(g50.OooO0O0)).booleanValue() && yt2.OooO0OO(this.OooO0O0, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final y40 OooO0OO(ByteBuffer byteBuffer, int i, int i2, f50 f50Var, xz0 xz0Var) {
        StringBuilder sb;
        int i3 = cp0.OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            e50 e50VarOooO0O0 = f50Var.OooO0O0();
            if (e50VarOooO0O0.OooO0OO > 0 && e50VarOooO0O0.OooO0O0 == 0) {
                Bitmap.Config config = xz0Var.OooO0OO(g50.OooO00o) == sn.OooO0o0 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iOooO0Oo = OooO0Oo(e50VarOooO0O0, i, i2);
                gu0 gu0Var = this.OooO0Oo;
                e81 e81Var = this.OooO0o0;
                gu0Var.getClass();
                ni1 ni1Var = new ni1(e81Var, e50VarOooO0O0, byteBuffer, iOooO0Oo);
                ni1Var.OooO0OO(config);
                ni1Var.OooOO0O = (ni1Var.OooOO0O + 1) % ni1Var.OooOO0o.OooO0OO;
                Bitmap bitmapOooO0O0 = ni1Var.OooO0O0();
                if (bitmapOooO0O0 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        sb = new StringBuilder("Decoded GIF from stream in ");
                        sb.append(cp0.OooO00o(jElapsedRealtimeNanos));
                        Log.v("BufferGifDecoder", sb.toString());
                        return null;
                    }
                    return null;
                }
                y40 y40Var = new y40(new x40(new ooo0o(new d50(com.bumptech.glide.OooO00o.OooO00o(this.OooO00o), ni1Var, i, i2, bitmapOooO0O0), 2)), 0);
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + cp0.OooO00o(jElapsedRealtimeNanos));
                }
                return y40Var;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                sb = new StringBuilder("Decoded GIF from stream in ");
                sb.append(cp0.OooO00o(jElapsedRealtimeNanos));
                Log.v("BufferGifDecoder", sb.toString());
                return null;
            }
            return null;
        } finally {
        }
    }
}

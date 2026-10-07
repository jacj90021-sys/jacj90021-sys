package com.cmaster.cloner;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ni1 {
    public byte[] OooO;
    public int[] OooO00o;
    public final e81 OooO0OO;
    public ByteBuffer OooO0Oo;
    public short[] OooO0o;
    public byte[] OooO0o0;
    public byte[] OooO0oO;
    public byte[] OooO0oo;
    public final int[] OooOO0;
    public int OooOO0O;
    public e50 OooOO0o;
    public final boolean OooOOO;
    public Bitmap OooOOO0;
    public int OooOOOO;
    public final int OooOOOo;
    public final int OooOOo;
    public final int OooOOo0;
    public Boolean OooOOoo;
    public final int[] OooO0O0 = new int[256];
    public Bitmap.Config OooOo00 = Bitmap.Config.ARGB_8888;

    public ni1(e81 e81Var, e50 e50Var, ByteBuffer byteBuffer, int i) {
        this.OooO0OO = e81Var;
        this.OooOO0o = new e50();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                int i2 = 0;
                this.OooOOOO = 0;
                this.OooOO0o = e50Var;
                this.OooOO0O = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.OooO0Oo = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.OooO0Oo.order(ByteOrder.LITTLE_ENDIAN);
                this.OooOOO = false;
                ArrayList arrayList = e50Var.OooO0o0;
                int size = arrayList.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((a50) obj).OooO0oO == 3) {
                        this.OooOOO = true;
                        break;
                    }
                }
                this.OooOOOo = iHighestOneBit;
                int i3 = e50Var.OooO0o;
                this.OooOOo = i3 / iHighestOneBit;
                int i4 = e50Var.OooO0oO;
                this.OooOOo0 = i4 / iHighestOneBit;
                int i5 = i3 * i4;
                jp0 jp0Var = (jp0) this.OooO0OO.OooO0o;
                this.OooO = jp0Var == null ? new byte[i5] : (byte[]) jp0Var.OooO0OO(i5, byte[].class);
                e81 e81Var2 = this.OooO0OO;
                int i6 = this.OooOOo * this.OooOOo0;
                jp0 jp0Var2 = (jp0) e81Var2.OooO0o;
                this.OooOO0 = jp0Var2 == null ? new int[i6] : (int[]) jp0Var2.OooO0OO(i6, int[].class);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Bitmap OooO00o() {
        Boolean bool = this.OooOOoo;
        Bitmap bitmapOooO00o = ((k8) this.OooO0OO.OooO0o0).OooO00o(this.OooOOo, this.OooOOo0, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.OooOo00);
        bitmapOooO00o.setHasAlpha(true);
        return bitmapOooO00o;
    }

    public final synchronized Bitmap OooO0O0() {
        try {
            if (this.OooOO0o.OooO0OO <= 0 || this.OooOO0O < 0) {
                if (Log.isLoggable("ni1", 3)) {
                    Log.d("ni1", "Unable to decode frame, frameCount=" + this.OooOO0o.OooO0OO + ", framePointer=" + this.OooOO0O);
                }
                this.OooOOOO = 1;
            }
            int i = this.OooOOOO;
            if (i != 1 && i != 2) {
                this.OooOOOO = 0;
                if (this.OooO0o0 == null) {
                    jp0 jp0Var = (jp0) this.OooO0OO.OooO0o;
                    this.OooO0o0 = jp0Var == null ? new byte[255] : (byte[]) jp0Var.OooO0OO(255, byte[].class);
                }
                a50 a50Var = (a50) this.OooOO0o.OooO0o0.get(this.OooOO0O);
                int i2 = this.OooOO0O - 1;
                a50 a50Var2 = i2 >= 0 ? (a50) this.OooOO0o.OooO0o0.get(i2) : null;
                int[] iArr = a50Var.OooOO0O;
                if (iArr == null) {
                    iArr = this.OooOO0o.OooO00o;
                }
                this.OooO00o = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("ni1", 3)) {
                        Log.d("ni1", "No valid color table found for frame #" + this.OooOO0O);
                    }
                    this.OooOOOO = 1;
                    return null;
                }
                if (a50Var.OooO0o) {
                    System.arraycopy(iArr, 0, this.OooO0O0, 0, iArr.length);
                    int[] iArr2 = this.OooO0O0;
                    this.OooO00o = iArr2;
                    iArr2[a50Var.OooO0oo] = 0;
                    if (a50Var.OooO0oO == 2 && this.OooOO0O == 0) {
                        this.OooOOoo = Boolean.TRUE;
                    }
                }
                return OooO0Oo(a50Var, a50Var2);
            }
            if (Log.isLoggable("ni1", 3)) {
                Log.d("ni1", "Unable to decode frame, status=" + this.OooOOOO);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0OO(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.OooOo00 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7 A[PHI: r7
      0x01e7: PHI (r7v18 int) = (r7v12 int), (r7v20 int), (r7v20 int) binds: [B:95:0x01d3, B:97:0x01de, B:98:0x01e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0Oo(com.cmaster.cloner.a50 r37, com.cmaster.cloner.a50 r38) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ni1.OooO0Oo(com.cmaster.cloner.a50, com.cmaster.cloner.a50):android.graphics.Bitmap");
    }
}

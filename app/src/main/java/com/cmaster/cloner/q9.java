package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q9 {
    public final boolean OooO00o;
    public byte[] OooO0O0;
    public int OooO0OO;
    public final ArrayList OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;

    public q9(byte[] bArr, boolean z) {
        this.OooO00o = z;
        this.OooO0O0 = bArr;
        this.OooO0OO = 0;
        this.OooO0Oo = null;
        this.OooO0o0 = 0;
        this.OooO0o = 0;
    }

    public static void OooO0oo() {
        throw new IndexOutOfBoundsException(u7.OooO00o(new byte[]{43, -1, 110, -75, -67, 118, -91, 108, 62, -28, 58, -89, -94, 111, -91, 41, 106, -5, 123, -93, -92, 38, -91, 36, 47, -85, 127, -66, -76}, new byte[]{74, -117, 26, -48, -48, 6, -47, 76}));
    }

    public final void OooO(byte[] bArr) {
        int length = bArr.length;
        int i = this.OooO0OO;
        int i2 = i + length;
        if ((length | i2) < 0 || length > bArr.length) {
            StringBuilder sb = new StringBuilder();
            sb.append(u7.OooO00o(new byte[]{113, -42, -48, 33, 1, -33, -42, -49, 125, -56, -48, 44, 82}, new byte[]{19, -81, -92, 68, 114, -15, -70, -86}));
            sb.append(bArr.length);
            rj.OooOOOo(new byte[]{20, -15}, new byte[]{47, -47, -52, -92, 48, 53, 122, 13}, sb, 0);
            ra.OooO0oO(px0.OooOOOo(new byte[]{13, -112, -95}, new byte[]{35, -66, -128, 118, -123, -58, 121, -86}, sb, i2));
            return;
        }
        if (this.OooO00o) {
            OooO0oO(i2);
        } else if (i2 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        System.arraycopy(bArr, 0, this.OooO0O0, i, length);
        this.OooO0OO = i2;
    }

    public final void OooO00o(int i) {
        int i2 = i - 1;
        if (i < 0 || (i & i2) != 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-48, -84, -32, -66, 20, -66, -34, 17, -37, -92, -23, -90, 2, -16, -53}, new byte[]{-78, -61, -121, -53, 103, -98, -65, 125}));
            return;
        }
        int i3 = (this.OooO0OO + i2) & (~i2);
        if (this.OooO00o) {
            OooO0oO(i3);
        } else if (i3 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        Arrays.fill(this.OooO0O0, this.OooO0OO, i3, (byte) 0);
        this.OooO0OO = i3;
    }

    public final void OooO0O0(int i, String str) {
        ArrayList arrayList = this.OooO0Oo;
        if (arrayList == null) {
            return;
        }
        OooO0o();
        int size = arrayList.size();
        int i2 = size == 0 ? 0 : ((p9) arrayList.get(size - 1)).OooO00o;
        int i3 = this.OooO0OO;
        if (i2 <= i3) {
            i2 = i3;
        }
        arrayList.add(new p9(i2, i + i2, str));
    }

    public final void OooO0OO(String str) {
        ArrayList arrayList = this.OooO0Oo;
        if (arrayList == null) {
            return;
        }
        OooO0o();
        arrayList.add(new p9(this.OooO0OO, Integer.MAX_VALUE, str));
    }

    public final boolean OooO0Oo() {
        return this.OooO0Oo != null;
    }

    public final void OooO0o() {
        int size;
        ArrayList arrayList = this.OooO0Oo;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        p9 p9Var = (p9) arrayList.get(size - 1);
        int i = this.OooO0OO;
        if (p9Var.OooO00o == Integer.MAX_VALUE) {
            p9Var.OooO00o = i;
        }
    }

    public final void OooO0o0(int i) {
        if (this.OooO0OO == i) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        rj.OooOOOo(new byte[]{21, -122, 91, -105, 57, -11, 82, -101, 80, -99, 94, -128, 41, -18, 69, -33}, new byte[]{112, -2, 43, -14, 90, -127, 55, -1}, sb, i);
        sb.append(u7.OooO00o(new byte[]{-15, -9, 60, -98, 104, 37, 102, 88, -22, -95, 60, -111, 105, 53, 61, 20}, new byte[]{-54, -41, 93, -3, 28, 80, 7, 52}));
        sb.append(this.OooO0OO);
        throw new dx(sb.toString(), null);
    }

    public final void OooO0oO(int i) {
        byte[] bArr = this.OooO0O0;
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i * 2) + zzbcj.zzq.zzf];
            System.arraycopy(bArr, 0, bArr2, 0, this.OooO0OO);
            this.OooO0O0 = bArr2;
        }
    }

    public final void OooOO0(int i) {
        int i2 = this.OooO0OO;
        int i3 = i2 + 1;
        if (this.OooO00o) {
            OooO0oO(i3);
        } else if (i3 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        this.OooO0O0[i2] = (byte) i;
        this.OooO0OO = i3;
    }

    public final void OooOO0O(int i) {
        int i2 = this.OooO0OO;
        int i3 = i2 + 4;
        if (this.OooO00o) {
            OooO0oO(i3);
        } else if (i3 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        byte[] bArr = this.OooO0O0;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.OooO0OO = i3;
    }

    public final void OooOO0o(int i) {
        int i2 = this.OooO0OO;
        int i3 = i2 + 2;
        if (this.OooO00o) {
            OooO0oO(i3);
        } else if (i3 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        byte[] bArr = this.OooO0O0;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        this.OooO0OO = i3;
    }

    public final int OooOOO(int i) {
        if (this.OooO00o) {
            OooO0oO(this.OooO0OO + 5);
        }
        int i2 = this.OooO0OO;
        while (true) {
            int i3 = i;
            i >>>= 7;
            if (i == 0) {
                OooOO0((byte) (i3 & 127));
                return this.OooO0OO - i2;
            }
            OooOO0((byte) ((i3 & 127) | 128));
        }
    }

    public final void OooOOO0(int i) {
        if (this.OooO00o) {
            OooO0oO(this.OooO0OO + 5);
        }
        int i2 = i >> 7;
        int i3 = (Integer.MIN_VALUE & i) == 0 ? 0 : -1;
        int i4 = i;
        int i5 = i2;
        boolean z = true;
        while (z) {
            z = (i5 == i3 && (i5 & 1) == ((i4 >> 6) & 1)) ? false : true;
            OooOO0((byte) ((i4 & 127) | (z ? 128 : 0)));
            i4 = i5;
            i5 >>= 7;
        }
    }

    public final void OooOOOO(int i) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-17, 27, -34, 19, 99, 52, 1, 114, -68}, new byte[]{-116, 116, -85, 125, 23, 20, 61, 82}));
            return;
        }
        int i2 = this.OooO0OO + i;
        if (this.OooO00o) {
            OooO0oO(i2);
        } else if (i2 > this.OooO0O0.length) {
            OooO0oo();
            throw null;
        }
        Arrays.fill(this.OooO0O0, this.OooO0OO, i2, (byte) 0);
        this.OooO0OO = i2;
    }

    public q9() {
        this(new byte[zzbcj.zzq.zzf], true);
    }
}

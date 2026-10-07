package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kd {
    public int[] OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    public kd() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.OooO0Oo = iHighestOneBit - 1;
        this.OooO00o = new int[iHighestOneBit];
    }

    public final void OooO00o(int i) {
        int[] iArr = this.OooO00o;
        int i2 = this.OooO0OO;
        iArr[i2] = i;
        int i3 = this.OooO0Oo & (i2 + 1);
        this.OooO0OO = i3;
        int i4 = this.OooO0O0;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            if (i6 < 0) {
                ra.OooOOO0("Max array capacity exceeded");
                return;
            }
            int[] iArr2 = new int[i6];
            o3.OooO00o(0, i4, length, iArr, iArr2);
            o3.OooO00o(i5, 0, this.OooO0O0, this.OooO00o, iArr2);
            this.OooO00o = iArr2;
            this.OooO0O0 = 0;
            this.OooO0OO = length;
            this.OooO0Oo = i6 - 1;
        }
    }
}

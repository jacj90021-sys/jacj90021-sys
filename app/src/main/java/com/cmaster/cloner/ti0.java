package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ti0 extends ev0 {
    public static final ti0 OooO0oo;
    public int OooO0o;
    public int[] OooO0o0;
    public boolean OooO0oO;

    static {
        ti0 ti0Var = new ti0(0);
        OooO0oo = ti0Var;
        ti0Var.OooO0Oo = false;
    }

    public ti0(int i) {
        super(true);
        try {
            this.OooO0o0 = new int[i];
            this.OooO0o = 0;
            this.OooO0oO = true;
        } catch (NegativeArraySizeException unused) {
            ra.OooOOO(u7.OooO00o(new byte[]{15, 56, -13, -64, 47, -27, -3, -68}, new byte[]{124, 81, -119, -91, 15, -39, -35, -116}));
            throw null;
        }
    }

    public final int OooO0o(int i) {
        if (i >= this.OooO0o) {
            ra.OooO0oO(u7.OooO00o(new byte[]{-12, 87, 79, 105, 76, -108, -58, -23, -1, 95, 88}, new byte[]{-102, 119, 113, 84, 108, -25, -81, -109}));
            return 0;
        }
        try {
            return this.OooO0o0[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            ra.OooO0oO(u7.OooO00o(new byte[]{70, -99, -109, 45, -82}, new byte[]{40, -67, -81, 13, -98, -27, 54, -8}));
            return 0;
        }
    }

    public final void OooO0o0(int i) {
        OooO0OO();
        int i2 = this.OooO0o;
        int[] iArr = this.OooO0o0;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.OooO0o0 = iArr2;
        }
        int[] iArr3 = this.OooO0o0;
        int i3 = this.OooO0o;
        int i4 = i3 + 1;
        this.OooO0o = i4;
        iArr3[i3] = i;
        if (!this.OooO0oO || i4 <= 1) {
            return;
        }
        this.OooO0oO = i >= iArr3[i3 + (-1)];
    }

    public final void OooO0oO(int i, int i2) {
        OooO0OO();
        if (i >= this.OooO0o) {
            ra.OooO0oO(u7.OooO00o(new byte[]{-29, -34, 71, -29, 65, -55, 113, -118, -24, -42, 80}, new byte[]{-115, -2, 121, -34, 97, -70, 24, -16}));
            return;
        }
        try {
            this.OooO0o0[i] = i2;
            this.OooO0oO = false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            if (i >= 0) {
                return;
            }
            ra.OooOOO(u7.OooO00o(new byte[]{48, -70, -119, 35, 93}, new byte[]{94, -102, -75, 3, 109, -126, -24, 11}));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ti0)) {
            return false;
        }
        ti0 ti0Var = (ti0) obj;
        if (this.OooO0oO != ti0Var.OooO0oO || this.OooO0o != ti0Var.OooO0o) {
            return false;
        }
        for (int i = 0; i < this.OooO0o; i++) {
            if (this.OooO0o0[i] != ti0Var.OooO0o0[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < this.OooO0o; i2++) {
            i = (i * 31) + this.OooO0o0[i2];
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.OooO0o * 5) + 10);
        sb.append('{');
        for (int i = 0; i < this.OooO0o; i++) {
            if (i != 0) {
                sb.append(u7.OooO00o(new byte[]{105, 90}, new byte[]{69, 122, 57, -26, -29, 10, 45, -5}));
            }
            sb.append(this.OooO0o0[i]);
        }
        sb.append('}');
        return sb.toString();
    }
}

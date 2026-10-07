package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ys1 {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public int OooO0o0;

    public final boolean OooO00o() {
        int i = this.OooO00o;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.OooO0Oo;
            int i4 = this.OooO0O0;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.OooO0Oo;
            int i6 = this.OooO0OO;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.OooO0o0;
            int i8 = this.OooO0O0;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.OooO0o0;
            int i10 = this.OooO0OO;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if (((i2 << 12) & i) == 0) {
                return false;
            }
        }
        return true;
    }
}

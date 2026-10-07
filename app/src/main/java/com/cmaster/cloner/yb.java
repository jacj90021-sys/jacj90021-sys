package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yb implements Comparable {
    public final int OooO0Oo;
    public final wb OooO0o;
    public final int OooO0o0;

    public yb(int i, int i2, wb wbVar) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{37, 32, -14, 75, 109, 80, 69, -108, 102}, new byte[]{86, 84, -109, 57, 25, 112, 121, -76}));
            throw null;
        }
        if (i2 <= i) {
            ra.OooOOO(u7.OooO00o(new byte[]{-77, -74, -35, -70, 46, 10, 4, 49, -94, -71, -53, -18}, new byte[]{-42, -40, -71, -102, 18, 55, 36, 66}));
            throw null;
        }
        if (wbVar.OooO0Oo) {
            ra.OooOOO(u7.OooO00o(new byte[]{94, 64, -103, 8, -1, 8, 101, 38, 24, 72, -124, 33, -26, 25, 118, 55, 90, 68, -33, 69}, new byte[]{54, 33, -9, 108, -109, 109, 23, 85}));
            throw null;
        }
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = wbVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final int compareTo(yb ybVar) {
        int i = ybVar.OooO0Oo;
        int i2 = this.OooO0Oo;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = ybVar.OooO0o0;
        int i4 = this.OooO0o0;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.OooO0o.compareTo(ybVar.OooO0o);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof yb) && compareTo((yb) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.OooO0o.OooO0o0) + (((this.OooO0Oo * 31) + this.OooO0o0) * 31);
    }
}

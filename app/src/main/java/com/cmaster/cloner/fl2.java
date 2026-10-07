package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fl2 {
    public static void OooO00o(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbOooO = rj.OooO(i, i2, "fromIndex: ", ", toIndex: ", ", size: ");
            sbOooO.append(i3);
            throw new IndexOutOfBoundsException(sbOooO.toString());
        }
        if (i <= i2) {
            return;
        }
        ra.OooOOO(px0.OooOOO0(i, i2, "fromIndex: ", " > toIndex: "));
    }
}

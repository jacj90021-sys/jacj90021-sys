package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i10 {
    public final /* synthetic */ int OooO00o;
    public final int OooO0O0;
    public final String OooO0OO;

    public /* synthetic */ i10(int i, int i2, String str) {
        this.OooO00o = i2;
        this.OooO0O0 = i;
        this.OooO0OO = str;
    }

    public Bundle OooO00o() {
        Bundle bundle = new Bundle();
        bundle.putInt(u7.OooO00o(new byte[]{-8, 80, -89, -124, 54, -52, 122, -22, -49, 103, -127, -87, 20, -83, 123, -3}, new byte[]{-99, 40, -45, -10, 87, -30, 63, -72}), this.OooO0O0);
        bundle.putString(u7.OooO00o(new byte[]{-62, 82, -109, 74, 38, 20, -61, -67, -11, 101, -75, 103, 10, 127, -43, -68, -26, 109, -94}, new byte[]{-89, 42, -25, 56, 71, 58, -122, -17}), this.OooO0OO);
        bundle.putString(u7.OooO00o(new byte[]{4, 110, -63, -100, 113, -112, -111, 49, 34, 93, -12, -87, 85, -31, -113, 49, 44, 83}, new byte[]{97, 22, -75, -18, 16, -66, -63, 112}), null);
        return bundle;
    }

    public String toString() {
        switch (this.OooO00o) {
            case 1:
                StringBuilder sbOooOO0 = rj.OooOO0("i10");
                sbOooOO0.append(u7.OooO00o(new byte[]{-2, -18, -85, 52, 37, 93}, new byte[]{-123, -115, -60, 80, 64, 125, -65, 26}));
                sbOooOO0.append(this.OooO0O0);
                sbOooOO0.append(u7.OooO00o(new byte[]{-48, 68, 44, 5, 18, -116}, new byte[]{-4, 100, 65, 118, 117, -84, 35, -94}));
                sbOooOO0.append(this.OooO0OO);
                return rj.OooO0oo(new byte[]{116}, new byte[]{9, 127, -36, -4, 105, 113, -31, 62}, sbOooOO0);
            default:
                return super.toString();
        }
    }
}

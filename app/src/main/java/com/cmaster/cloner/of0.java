package com.cmaster.cloner;

import android.content.AttributionSource;
import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class of0 extends ef1 {
    public static final String OooOO0O;

    static {
        u7.OooO00o(new byte[]{-79, -59, -21, 37, -85, 63, 103, -119, -66, -50, -5, 121, -77, 63, 101, -50, -2, -30, -40, 62, -94, 63, 78, -58, -66, -54, -24, 50, -74}, new byte[]{-48, -85, -113, 87, -60, 86, 3, -89});
        OooOO0O = u7.OooO00o(new byte[]{6, 67, 47, 90, -66, 25, -90, -48, 17, 90, 54, 87, -76, 3, -81, -50, 2, 79, 47, 90, -74, 4, -93, -59, 10, 84, 53, 87, -84, 9, -93, -61, 0, 94}, new byte[]{67, 27, 123, 8, -1, 70, -10, -111});
    }

    public of0() {
        super(u7.OooO00o(new byte[]{55, 119, -99, 127, -84, 105, -24, -83, 56, 124, -115, 35, -76, 105, -22, -22, 120, 80, -82, 100, -91, 105, -63, -30, 56, 120, -98, 104, -79}, new byte[]{86, 25, -7, 13, -61, 0, -116, -125}));
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
        if (yn2.OooO0oo()) {
            try {
                Object[] objArr = yqVar.OooO0o;
                if (objArr.length < 1 || !(objArr[objArr.length - 1] instanceof Bundle)) {
                    return;
                }
                Parcelable parcelable = ((Bundle) objArr[objArr.length - 1]).getParcelable(OooOO0O);
                if (t8.OooOoO(parcelable)) {
                    AttributionSource attributionSourceOooO0oo = t8.OooO0oo(parcelable);
                    l81 l81Var = d4.OooO0Oo;
                    fn2.OooO0O0(true, qx1.OooO0Oo(), l81Var != null ? l81Var.OooO0O0(attributionSourceOooO0oo) : null);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        String strOooO00o = u7.OooO00o(new byte[]{-89, 115, -67, 2, -22, -59, 111, 72, -92, 85, -90, 59, -27, -54, 97, 124, -90, 119, -67, 60, -20, -51}, new byte[]{-44, 22, -55, 85, -125, -93, 6, 9});
        Boolean bool = Boolean.FALSE;
        OooO0O0(strOooO00o, new nd0(bool, 1));
        OooO0O0(u7.OooO00o(new byte[]{73, 69, 31, -88, 52, -59, -103, 19, 74, 99, 4, -107, 61, -54, -118, 39, 72, 65, 31, -110, 52, -51}, new byte[]{58, 32, 107, -5, 91, -93, -19, 82}), new nd0(bool, 1));
        OooO0O0(u7.OooO00o(new byte[]{-18, -102, 102, 12, 46, -78, 58, 34, -7, -68, 125, 53, 33, -67, 52, 22, -5, -98, 102, 50, 40, -70}, new byte[]{-119, -1, 18, 91, 71, -44, 83, 99}), new nd0((Object) null, 1));
    }
}

package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r90 extends x7 {
    static {
        u7.OooO00o(new byte[]{-76, 16, 85, -65, 60, 79, 86, 122, -76, 14, 65, -29, 26, 103, 66, 36, -127, 31, 66, -90}, new byte[]{-43, 126, 49, -51, 83, 38, 50, 84});
    }

    public r90() {
        super(u7.OooO00o(new byte[]{47, 121, -99, -4, -122, 117, -67, 117, 47, 103, -119, -96, -96, 93, -87, 43, 26, 118, -118, -27}, new byte[]{78, 23, -7, -114, -23, 28, -39, 91}));
    }

    @Override // com.cmaster.cloner.x7
    public final boolean OooO(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        Object obj;
        WeakHashMap weakHashMap = po0.OooO00o;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(iBinder);
        }
        w7 w7Var = (w7) obj;
        if ((w7Var == null ? null : w7Var.OooO00o) == null) {
            return false;
        }
        return super.OooO(iBinder, i, parcel, parcel2, i2);
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
        yqVar.OooO00o();
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        OooO0O0(u7.OooO00o(new byte[]{-113, 98, -60, 71, -9, -102, 26, -109, -107, 96, -52, 65, -6}, new byte[]{-4, 22, -91, 53, -125, -37, 121, -25}), new i90(13));
        OooO0O0(u7.OooO00o(new byte[]{40, -71, -65, -95, 60, 110, 33, -123, 33, -70, -92}, new byte[]{79, -36, -53, -11, 93, 29, 74, -52}), new i90(12));
        OooO0O0(u7.OooO00o(new byte[]{-56, -54, 73, -116, 37, 81, 61, -13, -54, -15, 66, -120, 57, 79, 25, -55, -49, -48, 76}, new byte[]{-82, -93, 39, -27, 86, 57, 124, -99}), new i90(11));
    }

    @Override // com.cmaster.cloner.x7
    public final IInterface OooO0oO(IBinder iBinder) {
        Object obj;
        WeakHashMap weakHashMap = po0.OooO00o;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(iBinder);
        }
        w7 w7Var = (w7) obj;
        if (w7Var == null) {
            return null;
        }
        return w7Var.OooO00o;
    }
}

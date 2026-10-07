package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uy implements z7 {
    public static final uy OooO0Oo = new uy();

    @Override // com.cmaster.cloner.z7
    public final boolean OooO00o(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            try {
                ThreadLocal threadLocal = b8.OooO00o;
                int i3 = d02.OooO00o;
                PAM.WAFXO(iBinder, i, parcel, parcel2, i2);
                parcel2.readException();
            } catch (Exception unused) {
                parcel2.setDataPosition(0);
                parcel2.writeNoException();
                parcel2.writeInt(0);
            }
            return true;
        } finally {
            parcel2.setDataPosition(0);
        }
    }
}

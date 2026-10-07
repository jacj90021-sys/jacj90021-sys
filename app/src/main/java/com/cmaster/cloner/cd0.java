package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cd0 implements dd0 {
    public IBinder OooO0Oo;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    @Override // com.cmaster.cloner.dd0
    public final void send(int i, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{49, -82, 52, 38, 109, 10, 120, 61, 38, -92, 43, 38, 109, 11, 118, 32, 55, -77, 119, 91, 93, 50, 73, 8, 25, -121, 11, 70, 88, 53, 85, 23, 11, -106}, new byte[]{82, -63, 89, 8, 14, 103, 25, 78}));
            parcelObtain.writeInt(-1);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.OooO0Oo.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}

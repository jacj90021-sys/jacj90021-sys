package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class af0 implements bf0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.bf0
    public final aq OooO0Oo(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(u7.OooO00o(new byte[]{75, 7, -42, -71, -12, 12, -45, -106, 92, 13, -55, -71, -12, 13, -35, -117, 77, 26, -107, -50, -61, 37, -28, -65, 124, 43, -1, -47, -63, 39, -27, -93, 112, 34, -19, -33, -43, 54}, new byte[]{40, 104, -69, -105, -105, 97, -78, -27}));
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.OooO0Oo.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0 ? aq.CREATOR.createFromParcel(parcelObtain2) : null;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }
}

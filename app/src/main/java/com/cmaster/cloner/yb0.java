package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yb0 implements zb0 {
    public IBinder OooO0Oo;

    @Override // com.cmaster.cloner.zb0
    public final void OooOooO(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(zb0.OooO00o);
            parcelObtain.writeStringArray(strArr);
            this.OooO0Oo.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }
}

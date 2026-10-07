package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ee2 implements wj2, IInterface {
    public final IBinder OooO0Oo;

    public ee2(IBinder iBinder) {
        this.OooO0Oo = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0Oo;
    }

    public final Parcel o0000o0O(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.OooO0Oo.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }
}

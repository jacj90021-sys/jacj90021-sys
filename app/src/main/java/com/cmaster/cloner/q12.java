package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class q12 extends Binder implements IInterface {
    public final /* synthetic */ int OooO0Oo;

    public q12(String str, int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 1:
                attachInterface(this, str);
                break;
            default:
                attachInterface(this, str);
                break;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i = this.OooO0Oo;
        return this;
    }

    public boolean o00(int i, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean o000oooo(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (this.OooO0Oo) {
            case 0:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return o000oooo(i, parcel, parcel2);
            case 1:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                return o00(i, parcel, parcel2);
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rf1 extends Binder implements sf1 {
    public rf1() {
        attachInterface(this, u7.OooO00o(new byte[]{-68, 107, 126, 119, -78, -75, -19, 19, -85, 97, 97, 119, -78, -76, -29, 14, -70, 118, 61, 31, -119, -99, -44, 47, -117, 67, 87, 18, -98, -117, -53, 56, -113}, new byte[]{-33, 4, 19, 89, -47, -40, -116, 96}));
    }

    public static sf1 o0000o0O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u7.OooO00o(new byte[]{-76, -79, 4, -96, -103, -99, 20, 49, -93, -69, 27, -96, -103, -100, 26, 44, -78, -84, 71, -56, -94, -75, 45, 13, -125, -103, 45, -59, -75, -93, 50, 26, -121}, new byte[]{-41, -34, 105, -114, -6, -16, 117, 66}));
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof sf1)) {
            return (sf1) iInterfaceQueryLocalInterface;
        }
        qf1 qf1Var = new qf1();
        qf1Var.OooO0Oo = iBinder;
        return qf1Var;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{-27, -50, 41, -36, -113, 51, 70, -67, -14, -60, 54, -36, -113, 50, 72, -96, -29, -45, 106, -76, -76, 27, 127, -127, -46, -26, 0, -71, -93, 13, 96, -106, -42}, new byte[]{-122, -95, 68, -14, -20, 94, 39, -50});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        if (i == 1) {
            onServiceConnected((ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null), parcel.readStrongBinder());
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            onServiceDisconnected((ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i == 3) {
            onBindingDied((ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
        if (i != 4) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        onNullBinding((ComponentName) (parcel.readInt() != 0 ? ComponentName.CREATOR.createFromParcel(parcel) : null));
        parcel2.writeNoException();
        return true;
    }
}

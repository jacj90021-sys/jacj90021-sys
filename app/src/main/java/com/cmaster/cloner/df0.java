package com.cmaster.cloner;

import android.app.job.JobInfo;
import android.app.job.JobWorkItem;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class df0 extends Binder implements ef0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{-37, -39, -88, 101, -21, 98, 69, -103, -52, -45, -73, 101, -21, 99, 75, -124, -35, -60, -21, 5, -59, 67, 109, -71, -16, -28, -109, 9, -59, 68, 101, -90, -16}, new byte[]{-72, -74, -59, 75, -120, 15, 36, -22});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        switch (i) {
            case 1:
                int iOoooOo0 = ((hx1) this).OoooOo0(parcel.readString(), (JobInfo) (parcel.readInt() != 0 ? JobInfo.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iOoooOo0);
                return true;
            case 2:
                int iOooOOo0 = ((hx1) this).OooOOo0(parcel.readString(), (JobInfo) (parcel.readInt() != 0 ? JobInfo.CREATOR.createFromParcel(parcel) : null), parcel.readString(), parcel.readInt(), c60.OooO0o0(parcel.readInt() != 0 ? JobWorkItem.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                parcel2.writeInt(iOooOOo0);
                return true;
            case 3:
                int iO0O0O00 = ((hx1) this).o0O0O00(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO0O0O00);
                return true;
            case 4:
                ((hx1) this).o0000O0(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 5:
                HashMap mapOooO00o = ((hx1) this).OooO00o(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                parcel2.writeMap(mapOooO00o);
                return true;
            case 6:
                JobInfo jobInfoO0000oo = ((hx1) this).o0000oo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                mt2.OooO00o(parcel2, jobInfoO0000oo, 1);
                return true;
            case 7:
                int iOooo0o = ((hx1) this).Oooo0o(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooo0o);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

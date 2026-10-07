package com.cmaster.cloner;

import android.accounts.Account;
import android.accounts.AuthenticatorDescription;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class se0 extends Binder implements te0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{117, -93, -96, -78, -95, -4, 36, 127, 98, -87, -65, -78, -95, -3, 42, 98, 115, -66, -29, -54, -102, -36, 28, 88, 82, -106, -108, -38, -104, -55, 8, 90, 83, -127, -99}, new byte[]{22, -52, -51, -100, -62, -111, 69, 12});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        switch (i) {
            case 1:
                Account[] accountArrOooO0O0 = ((jw1) this).OooO0O0(parcel.readInt(), null);
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArrOooO0O0, 1);
                return true;
            case 2:
                boolean zOooooo0 = ((jw1) this).Oooooo0(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zOooooo0 ? 1 : 0);
                return true;
            case 3:
                String strO000O00O = ((jw1) this).o000O00O(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strO000O00O);
                return true;
            case 4:
                String strO000o000 = ((jw1) this).o000o000(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strO000o000);
                return true;
            case 5:
                boolean zO000000 = ((jw1) this).o000000(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zO000000 ? 1 : 0);
                return true;
            case 6:
                ((jw1) this).o000oo0o(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 7:
                ((jw1) this).OoooO(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 8:
                ((jw1) this).o0000OO(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 9:
                ((jw1) this).o000OoO(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 10:
                ((jw1) this).OoooO0O(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                return true;
            case 11:
                String strOooOOOo = ((jw1) this).OooOOOo(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strOooOOOo);
                return true;
            case 12:
                boolean zOoOO = ((jw1) this).ooOO(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zOoOO ? 1 : 0);
                return true;
            case 13:
                boolean zO000Ooo = ((jw1) this).o000Ooo(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zO000Ooo ? 1 : 0);
                return true;
            case 14:
                String strO0ooOO0 = ((jw1) this).o0ooOO0(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(strO0ooOO0);
                return true;
            case 15:
                ((jw1) this).o0OOO0o(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 16:
                ((jw1) this).OooOO0o(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 17:
                ((jw1) this).OooooO0(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 18:
                ((jw1) this).o0ooOOo(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 19:
                ((jw1) this).OooOoo0(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                ((jw1) this).o00oO0o(parcel.readInt(), parcel.readStrongBinder(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case zzbcj.zzt.zzm /* 21 */:
                ((jw1) this).o000oo00(parcel.readInt(), parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 22:
                ((jw1) this).o000oooO(parcel.readInt(), parcel.readStrongBinder(), parcel.readString(), parcel.readString(), parcel.createStringArray(), parcel.readInt() != 0, (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 23:
                ((jw1) this).o00ooo(parcel.readInt(), parcel.readStrongBinder(), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 24:
                ((jw1) this).Ooooo0o(parcel.readInt(), parcel.readStrongBinder(), parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                return true;
            case 25:
                AuthenticatorDescription[] authenticatorDescriptionArrO0OO00O = ((jw1) this).o0OO00O(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeTypedArray(authenticatorDescriptionArrO0OO00O, 1);
                return true;
            case 26:
                Account[] accountArrOooO0O02 = ((jw1) this).OooO0O0(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedArray(accountArrOooO0O02, 1);
                return true;
            case 27:
                Map mapOooO0o = ((jw1) this).OooO0o(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR));
                parcel2.writeNoException();
                parcel2.writeMap(mapOooO0o);
                return true;
            case 28:
                boolean zO000ooO = ((jw1) this).o000ooO(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), (Bundle) gt2.OooO00o(parcel, Bundle.CREATOR), parcel.readHashMap(getClass().getClassLoader()));
                parcel2.writeNoException();
                parcel2.writeInt(zO000ooO ? 1 : 0);
                return true;
            case 29:
                boolean zOoooo00 = ((jw1) this).Ooooo00(parcel.readInt(), parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zOoooo00 ? 1 : 0);
                return true;
            case 30:
                int iO000o00o = ((jw1) this).o000o00o(parcel.readInt(), (Account) gt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO000o00o);
                return true;
            case 31:
                Map mapO0OoOo0 = ((jw1) this).o0OoOo0(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(mapO0OoOo0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

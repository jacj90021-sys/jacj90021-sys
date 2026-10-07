package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gf0 extends Binder implements hf0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        ArrayList arrayListOooOoO0;
        ArrayList arrayListOooOOo0;
        int[] iArrOooO0OO;
        String strOooO00o = u7.OooO00o(new byte[]{-31, 102, -44, 41, 0, -59, -89, 113, -10, 108, -53, 41, 0, -60, -87, 108, -25, 123, -105, 77, 58, -27, -127, 70, -45, 64, -6, 70, 32, -17, -106, 70, -56, 91, -12}, new byte[]{-126, 9, -71, 7, 99, -88, -58, 2});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        int i3 = 0;
        switch (i) {
            case 1:
                int iO00O0 = ((ox1) this).o00O0(parcel.readInt(), parcel.readString(), parcel.readInt(), (ParcelFileDescriptor[]) parcel.createTypedArray(ParcelFileDescriptor.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(iO00O0);
                return true;
            case 2:
                o01 o01Var = ((ox1) this).OooO;
                parcel2.writeNoException();
                parcel2.writeStrongBinder(o01Var);
                return true;
            case 3:
                int iOooooOo = ((ox1) this).OooooOo(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooooOo);
                return true;
            case 4:
                int iO000ooo0 = ((ox1) this).o000ooo0(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO000ooo0);
                return true;
            case 5:
                int i4 = parcel.readInt();
                String string = parcel.readString();
                parcel.readInt();
                ((ox1) this).o000oooo(i4, string);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 6:
                boolean zO000OooO = ((ox1) this).o000OooO(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO000OooO ? 1 : 0);
                return true;
            case 7:
                boolean zOooOO0 = ((ox1) this).OooOO0(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zOooOO0 ? 1 : 0);
                return true;
            case 8:
                String string2 = parcel.readString();
                int i5 = parcel.readInt();
                parcel.readInt();
                String strO000OO0o = ((ox1) this).o000OO0o(i5, string2);
                parcel2.writeNoException();
                parcel2.writeString(strO000OO0o);
                return true;
            case 9:
                ApplicationInfo applicationInfoO0000oO0 = ((ox1) this).o0000oO0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, applicationInfoO0000oO0, 1);
                return true;
            case 10:
                ox1 ox1Var = (ox1) this;
                PackageInfo packageInfoO000o0oo = ox1Var.o000o0oo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, packageInfoO000o0oo, 1);
                return true;
            case 11:
                ArrayList arrayListO00O000o = ((ox1) this).o00O000o(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringList(arrayListO00O000o);
                return true;
            case 12:
                ArrayList arrayListOooOooo = ((ox1) this).OooOooo(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListOooOooo);
                return true;
            case 13:
                ArrayList arrayListOooo0o0 = ((ox1) this).Oooo0o0(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListOooo0o0);
                return true;
            case 14:
                String string3 = parcel.readString();
                parcel.readInt();
                ArrayList arrayListO000O00 = ((ox1) this).o000O00(parcel.readInt(), string3);
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListO000O00);
                return true;
            case 15:
                String[] strArrO000Oo0 = ((ox1) this).o000Oo0(parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringArray(strArrO000Oo0);
                return true;
            case 16:
                parcel.readInt();
                parcel.readInt();
                parcel2.writeNoException();
                parcel2.writeString(null);
                return true;
            case 17:
                int iO0000Oo = ((ox1) this).o0000Oo(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO0000Oo);
                return true;
            case 18:
                int iOooooo = ((ox1) this).Oooooo(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iOooooo);
                return true;
            case 19:
                int iO0000o0O = ((ox1) this).o0000o0O(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iO0000o0O);
                return true;
            case 20:
                String string4 = parcel.readString();
                int i6 = parcel.readInt();
                parcel.readInt();
                PermissionGroupInfo permissionGroupInfoO00O00oO = ((ox1) this).o00O00oO(i6, string4);
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, permissionGroupInfoO00O00oO, 1);
                return true;
            case zzbcj.zzt.zzm /* 21 */:
                String string5 = parcel.readString();
                int i7 = parcel.readInt();
                parcel.readInt();
                ox1 ox1Var2 = (ox1) this;
                synchronized (ox1Var2.OooOOOO) {
                    arrayListOooOoO0 = ((hx2) ox1Var2.OooOOOO.OooO).OooOoO0(i7, string5);
                }
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListOooOoO0);
                return true;
            case 22:
                int i8 = parcel.readInt();
                parcel.readInt();
                ox1 ox1Var3 = (ox1) this;
                synchronized (ox1Var3.OooOOOO) {
                    arrayListOooOOo0 = ((hx2) ox1Var3.OooOOOO.OooO).OooOOo0(i8);
                }
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListOooOOo0);
                return true;
            case 23:
                PermissionInfo permissionInfoOooo00o = ((ox1) this).oooo00o(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, permissionInfoOooo00o, 1);
                return true;
            case 24:
                ResolveInfo resolveInfoO000O0 = ((ox1) this).o000O0(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, resolveInfoO000O0, 1);
                return true;
            case 25:
                List listOooo0 = ((ox1) this).Oooo0(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, listOooo0);
                return true;
            case 26:
                ActivityInfo activityInfoOooOo0 = ((ox1) this).OooOo0(parcel.readString(), (ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, activityInfoOooOo0, 1);
                return true;
            case 27:
                List listO00O00 = ((ox1) this).o00O00((ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, listO00O00);
                return true;
            case 28:
                ActivityInfo activityInfoO000000o = ((ox1) this).o000000o(parcel.readString(), (ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, activityInfoO000000o, 1);
                return true;
            case 29:
                List listOooOOoo = ((ox1) this).OooOOoo(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, listOooOOoo);
                return true;
            case 30:
                ResolveInfo resolveInfoO000OoOo = ((ox1) this).o000OoOo(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, resolveInfoO000OoOo, 1);
                return true;
            case 31:
                ArrayList arrayListOooOoO = ((ox1) this).OooOoO(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, arrayListOooOoO);
                return true;
            case 32:
                ServiceInfo serviceInfoO00O0O = ((ox1) this).o00O0O(parcel.readString(), (ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, serviceInfoO00O0O, 1);
                return true;
            case 33:
                ProviderInfo providerInfoO000o0Oo = ((ox1) this).o000o0Oo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, providerInfoO000o0Oo, 1);
                return true;
            case 34:
                ProviderInfo providerInfoO000O0oO = ((ox1) this).o000O0oO(parcel.readString(), (ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, providerInfoO000O0oO, 1);
                return true;
            case 35:
                List listO0000o0 = ((ox1) this).o0000o0(parcel.readString(), (Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, listO0000o0);
                return true;
            case 36:
                List listOooOO0O = ((ox1) this).OooOO0O(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO00o(parcel2, listOooOO0O);
                return true;
            case 37:
                boolean zO0000o0o = ((ox1) this).o0000o0o(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO0000o0o ? 1 : 0);
                return true;
            case 38:
                ((ox1) this).oo0o0Oo((ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 39:
                int iO0OoO0o = ((ox1) this).o0OoO0o((ComponentName) ot2.OooO0O0(parcel, ComponentName.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO0OoO0o);
                return true;
            case 40:
                ((ox1) this).OoooOO0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 41:
                String string6 = parcel.readString();
                int i9 = parcel.readInt();
                parcel.readInt();
                i01 i01VarO000Oo = ((ox1) this).o000Oo(i9, string6);
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, i01VarO000Oo, 1);
                return true;
            case 42:
                ox1 ox1Var4 = (ox1) this;
                synchronized (ox1Var4.OooOOOO) {
                    iArrOooO0OO = ox1Var4.OooO0oo.OooO0OO(false);
                }
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrOooO0OO);
                return true;
            case 43:
                int[] iArrO00O000 = ((ox1) this).o00O000(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeIntArray(iArrO00O000);
                return true;
            case 44:
                ResolveInfo resolveInfoResolveService = ((ox1) this).OooO0oO.resolveService((Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, resolveInfoResolveService, 1);
                return true;
            case 45:
                ResolveInfo resolveInfoResolveActivity = ((ox1) this).OooO0oO.resolveActivity((Intent) ot2.OooO0O0(parcel, Intent.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, resolveInfoResolveActivity, 1);
                return true;
            case 46:
                boolean zContains = ((ox1) this).OooOOoo.contains(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zContains ? 1 : 0);
                return true;
            case 47:
                try {
                    oO00OOo0.OooO0Oo().OooO0oO(parcel.readStrongBinder(), parcel.readString());
                    i3 = 1;
                } catch (Exception unused) {
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 48:
                boolean zO00O0OO = ((ox1) this).o00O0OO(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO00O0OO ? 1 : 0);
                return true;
            case 49:
                ir1 ir1VarOooo0oO = ((ox1) this).Oooo0oO(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                ot2.OooO0OO(parcel2, ir1VarOooo0oO, 1);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

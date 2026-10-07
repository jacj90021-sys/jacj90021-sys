package com.cmaster.cloner;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.NetworkRequest;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Process;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ve0 extends Binder implements we0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        b51 b51VarOooO00o;
        int i3;
        String strOooO00o = u7.OooO00o(new byte[]{-62, 56, -41, -40, -10, 15, -77, -72, -43, 50, -56, -40, -10, 14, -67, -91, -60, 37, -108, -76, -61, 46, -111, -122, -19, 13, -9, -70, -62, 43, -117, -127, -17, 28, -14, -92}, new byte[]{-95, 87, -70, -10, -107, 98, -46, -53});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        ComponentName componentName = null;
        String str = null;
        switch (i) {
            case 1:
                int iMyPid = Process.myPid();
                parcel2.writeNoException();
                parcel2.writeInt(iMyPid);
                return true;
            case 2:
                String string = parcel.readString();
                int i4 = parcel.readInt();
                parcel.readInt();
                pw1 pw1Var = (pw1) this;
                ActivityInfo activityInfoO00O00O = pw1Var.OooO0oO.o00O00O(i4, string);
                if (activityInfoO00O00O != null && (b51VarOooO00o = pw1Var.OooO0o.OooO00o(i4, string, activityInfoO00O00O.processName)) != null) {
                    b51VarOooO00o.OooOOoo.OooO0o.OooO0o0();
                }
                parcel2.writeNoException();
                return true;
            case 3:
                parcel.readString();
                String string2 = parcel.readString();
                parcel.readInt();
                int iO00O00O = ((pw1) this).o00O00O(parcel.readInt(), string2);
                parcel2.writeNoException();
                parcel2.writeInt(iO00O00O);
                return true;
            case 4:
                ((pw1) this).o00000oO(parcel.readStrongBinder(), parcel.readStrongBinder());
                return true;
            case 5:
                vi viVarOooO0OO = ((pw1) this).OooO0OO(parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, viVarOooO0OO, 1);
                return true;
            case 6:
                ((pw1) this).Oooo000(parcel.readStrongBinder(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                return true;
            case 7:
                boolean zOooOoO0 = ((pw1) this).OooOoO0(parcel.readStrongBinder(), parcel.readStrongBinder(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(zOooOoO0 ? 1 : 0);
                return true;
            case 8:
                ((pw1) this).o00oO0O(parcel.readStrongBinder(), parcel.readStrongBinder(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 9:
                ComponentName componentNameO0ooOoO = ((pw1) this).o0ooOoO(o0O0oo00.o0000o0O(parcel.readStrongBinder()), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, componentNameO0ooOoO, 1);
                return true;
            case 10:
                int iOooOo0o = ((pw1) this).OooOo0o(o0O0oo00.o0000o0O(parcel.readStrongBinder()), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iOooOo0o);
                return true;
            case 11:
                o0O0oo00.o0000o0O(parcel.readStrongBinder());
                parcel.readStrongBinder();
                parcel.readString();
                parcel.readStrongBinder();
                parcel.readInt();
                parcel.readString();
                parcel.readInt();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                int iO000o00O = ((pw1) this).o000o00O(o0O0oo00.o0000o0O(parcel.readStrongBinder()), parcel.readStrongBinder(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString(), parcel.readStrongBinder(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO000o00O);
                return true;
            case 13:
                parcel.readStrongBinder();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 14:
                boolean zO000OoOO = ((pw1) this).o000OoOO(parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO000OoOO ? 1 : 0);
                return true;
            case 15:
                boolean zO000o0OO = ((pw1) this).o000o0OO((ComponentName) it2.OooO00o(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO000o0OO ? 1 : 0);
                return true;
            case 16:
                ((pw1) this).o00000O0((ComponentName) it2.OooO00o(parcel, ComponentName.CREATOR), parcel.readStrongBinder(), parcel.readInt(), (Notification) it2.OooO00o(parcel, Notification.CREATOR), parcel.readInt(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 17:
                ArrayList arrayListO000ooo = ((pw1) this).o000ooo(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeList(arrayListO000ooo);
                return true;
            case 18:
                IBinder iBinderO00o0O = ((pw1) this).o00o0O((Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderO00o0O);
                return true;
            case 19:
                boolean zO0000ooO = ((pw1) this).o0000ooO(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(zO0000ooO ? 1 : 0);
                return true;
            case 20:
                parcel.readString();
                parcel.readString();
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case zzbcj.zzt.zzm /* 21 */:
                IBinder iBinderOooo = ((pw1) this).Oooo(parcel.readInt(), parcel.readStrongBinder(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderOooo);
                return true;
            case 22:
                int iOoooO0 = ((pw1) this).OoooO0(parcel.readString(), (Intent[]) parcel.createTypedArray(Intent.CREATOR), parcel.createStringArray(), parcel.readStrongBinder(), (Bundle) it2.OooO00o(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iOoooO0);
                return true;
            case 23:
                String string3 = parcel.readString();
                Intent intent = (Intent) it2.OooO00o(parcel, Intent.CREATOR);
                String string4 = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                String string5 = parcel.readString();
                int i5 = parcel.readInt();
                parcel.readInt();
                int iOooO = ((pw1) this).OooO(string3, intent, string4, strongBinder, string5, i5, (Bundle) it2.OooO00o(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iOooO);
                return true;
            case 24:
                int iO0000oOO = ((pw1) this).o0000oOO(parcel.readString(), parcel.readInt(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString(), (Bundle) it2.OooO00o(parcel, Bundle.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO0000oOO);
                return true;
            case 25:
                IBinder strongBinder2 = parcel.readStrongBinder();
                parcel.readInt();
                ((pw1) this).o000oooo(strongBinder2);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 26:
                int iO0000OoO = ((pw1) this).o0000OoO(parcel.readStrongBinder(), parcel.readInt() != 0, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO0000OoO);
                return true;
            case 27:
                IBinder strongBinder3 = parcel.readStrongBinder();
                int i6 = parcel.readInt();
                parcel.readInt();
                ((pw1) this).o000Oooo(strongBinder3, i6);
                return true;
            case 28:
                boolean zO00000oo = ((pw1) this).o00000oo(parcel.readStrongBinder(), parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO00000oo ? 1 : 0);
                return true;
            case 29:
                ((pw1) this).OooOo(parcel.readStrongBinder());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 30:
                IBinder strongBinder4 = parcel.readStrongBinder();
                parcel.readInt();
                ((pw1) this).OooooOO(strongBinder4, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 31:
                IBinder strongBinder5 = parcel.readStrongBinder();
                parcel.readInt();
                ((pw1) this).OooO0oO(strongBinder5, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 32:
                IBinder strongBinder6 = parcel.readStrongBinder();
                parcel.readInt();
                ((pw1) this).o000000O(strongBinder6, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 33:
                IBinder strongBinder7 = parcel.readStrongBinder();
                parcel.readInt();
                parcel.readInt();
                parcel.readInt();
                ((pw1) this).OooOOOo.OooO0O0.getClass();
                o0O00OOO o0o00oooOooO0oO = o0O00OOO.OooO0oO(strongBinder7);
                if (o0o00oooOooO0oO != null) {
                    o0o00oooOooO0oO.OooO0O0(4);
                }
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 34:
                IBinder strongBinder8 = parcel.readStrongBinder();
                parcel.readInt();
                ((pw1) this).o0000O0O(strongBinder8, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 35:
                boolean zO000Oo00 = ((pw1) this).o000Oo00(parcel.readStrongBinder(), parcel.readInt(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO000Oo00 ? 1 : 0);
                return true;
            case 36:
                int i7 = parcel.readInt();
                parcel.readInt();
                ((pw1) this).o000o0oO(i7, parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 37:
                ComponentName componentNameO000oo0 = ((pw1) this).o000oo0(parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, componentNameO000oo0, 1);
                return true;
            case 38:
                String strO0000 = ((pw1) this).o0000(parcel.readStrongBinder(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(strO0000);
                return true;
            case 39:
                IBinder strongBinder9 = parcel.readStrongBinder();
                parcel.readInt();
                synchronized (((pw1) this).OooOOOo.OooO0O0.OooO0OO) {
                    try {
                        o0O00OOO o0o00oooOooO0oo = o0O00OOO.OooO0oo(strongBinder9);
                        if (o0o00oooOooO0oo != null) {
                            componentName = o0o00oooOooO0oo.OooO;
                        }
                    } finally {
                    }
                }
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, componentName, 1);
                return true;
            case 40:
                b51 b51VarOooO0o0 = oO00OOo0.OooO0Oo().OooO0o0(parcel.readInt());
                int i8 = b51VarOooO0o0 == null ? -1 : b51VarOooO0o0.OooOOoo.OooO0oo;
                parcel2.writeNoException();
                parcel2.writeInt(i8);
                return true;
            case 41:
                m2 m2VarO000O0oo = ((pw1) this).o000O0oo(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, m2VarO000O0oo, 1);
                return true;
            case 42:
                IBinder strongBinder10 = parcel.readStrongBinder();
                parcel.readInt();
                synchronized (((pw1) this).OooOOOo.OooO0O0.OooO0OO) {
                    try {
                        o0O00OOO o0o00oooOooO0oo2 = o0O00OOO.OooO0oo(strongBinder10);
                        if (o0o00oooOooO0oo2 != null) {
                            str = o0o00oooOooO0oo2.OooOO0O;
                        }
                    } finally {
                    }
                }
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 43:
                parcel.readStrongBinder();
                parcel.readInt();
                parcel.readInt();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 44:
                boolean zO000o0o0 = ((pw1) this).o000o0o0(parcel.readString(), (zi0) it2.OooO00o(parcel, zi0.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO000o0o0 ? 1 : 0);
                return true;
            case 45:
                parcel.readString();
                IBinder strongBinder11 = parcel.readStrongBinder();
                parcel.readInt();
                pw1 pw1Var2 = (pw1) this;
                synchronized (pw1Var2.OooOOO) {
                    i3 = ((zi0) pw1Var2.OooOOO.remove(strongBinder11)) != null ? 1 : 0;
                }
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            case 46:
                zi0 zi0VarO00Ooo = ((pw1) this).o00Ooo(parcel.readInt(), parcel.readStrongBinder(), parcel.readString());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, zi0VarO00Ooo, 1);
                return true;
            case 47:
                String strO000Ooo0 = ((pw1) this).o000Ooo0(parcel.readStrongBinder(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strO000Ooo0);
                return true;
            case 48:
                int i9 = parcel.readInt();
                parcel.readInt();
                b51 b51VarOooO0o02 = ((pw1) this).OooO0o.OooO0o0(i9);
                String str2 = b51VarOooO0o02 != null ? b51VarOooO0o02.OooOO0O : null;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 49:
                int i10 = parcel.readInt();
                parcel.readInt();
                b51 b51VarOooO0o03 = ((pw1) this).OooO0o.OooO0o0(i10);
                ArrayList arrayList = b51VarOooO0o03 != null ? new ArrayList(b51VarOooO0o03.OooO0o) : null;
                parcel2.writeNoException();
                parcel2.writeList(arrayList);
                return true;
            case 50:
                int iO00000O = ((pw1) this).o00000O(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO00000O);
                return true;
            case 51:
                int iO0000OOo = ((pw1) this).o0000OOo(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iO0000OOo);
                return true;
            case 52:
                ((pw1) this).o000Oo0o(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 53:
                parcel.readString();
                parcel.readStrongBinder();
                parcel.readInt();
                parcel.readInt();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 54:
                boolean zO00000 = ((pw1) this).o00000(parcel.readInt(), (Intent) it2.OooO00o(parcel, Intent.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO00000 ? 1 : 0);
                return true;
            case 55:
                String strO0O0ooO = ((pw1) this).o0O0ooO(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(strO0O0ooO);
                return true;
            case 56:
                ArrayList arrayListO000O0o0 = ((pw1) this).o000O0o0(parcel.readString(), parcel.readInt(), parcel.createTypedArrayList(ActivityManager.RunningAppProcessInfo.CREATOR));
                parcel2.writeNoException();
                it2.OooO0O0(parcel2, arrayListO000O0o0, 1);
                return true;
            case 57:
                int iOoooOOO = ((pw1) this).OoooOOO(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(iOoooOOO);
                return true;
            case 58:
                ((pw1) this).o000ooO0(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 59:
                String strO000oo0O = ((pw1) this).o000oo0O(parcel.readInt(), parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(strO000oo0O);
                return true;
            case 60:
                IBinder iBinderO00000OO = ((pw1) this).o00000OO(parcel.readInt(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderO00000OO);
                return true;
            case 61:
                NetworkRequest networkRequestO00000Oo = ((pw1) this).o00000Oo(parcel.readString(), parcel.readStrongBinder(), (Messenger) it2.OooO00o(parcel, Messenger.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                it2.OooO0OO(parcel2, networkRequestO00000Oo, 1);
                return true;
            case 62:
                boolean zO000O0O = ((pw1) this).o000O0O((NetworkRequest) it2.OooO00o(parcel, NetworkRequest.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zO000O0O ? 1 : 0);
                return true;
            case 63:
                ((pw1) this).OoooOoo(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.createByteArray());
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

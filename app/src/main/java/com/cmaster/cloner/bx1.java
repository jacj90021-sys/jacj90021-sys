package com.cmaster.cloner;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bx1 extends Binder implements bf0 {
    public static final /* synthetic */ int OooO0oO = 0;
    public static final oO00OOOo OooO0oo = new oO00OOOo(15);
    public Context OooO0Oo;
    public final ax1 OooO0o;
    public zp OooO0o0;

    public bx1() {
        attachInterface(this, u7.OooO00o(new byte[]{4, 104, -35, 71, 100, -94, 60, -120, 19, 98, -62, 71, 100, -93, 50, -107, 2, 117, -98, 48, 83, -117, 11, -95, 51, 68, -12, 47, 81, -119, 10, -67, 63, 77, -26, 33, 69, -104}, new byte[]{103, 7, -80, 105, 7, -49, 93, -5}));
        this.OooO0o = new ax1(this);
    }

    public static bx1 o0000o0O() {
        return (bx1) OooO0oo.OooO0O0();
    }

    @Override // com.cmaster.cloner.bf0
    public final synchronized aq OooO0Oo(int i, String str) {
        aq aqVar;
        ax1 ax1Var = this.OooO0o;
        ax1Var.getClass();
        aqVar = (aq) ((ko0) ax1Var.OooOOO0.get(ax1.OooO0oO(i, str)));
        if (aqVar == null) {
            aqVar = (aq) this.OooO0o.OooO0oo(i, null, null);
        }
        return aqVar;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final synchronized void o000oooo(int i, String str, String str2) {
        aq aqVarOooO0Oo = OooO0Oo(i, str);
        if (aq.OooO0Oo(str2)) {
            aqVarOooO0Oo.OooO0o0.remove(str2);
        }
        aqVarOooO0Oo.OooO0Oo.remove(str2);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        String string;
        String strOooO00o = u7.OooO00o(new byte[]{1, -119, 87, -96, -81, 63, 107, 121, 22, -125, 72, -96, -81, 62, 101, 100, 7, -108, 20, -41, -104, 22, 92, 80, 54, -91, 126, -56, -102, 20, 93, 76, 58, -84, 108, -58, -114, 5}, new byte[]{98, -26, 58, -114, -52, 82, 10, 10});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        if (i == 1) {
            aq aqVarOooO0Oo = OooO0Oo(parcel.readInt(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(1);
            parcel2.writeBundle(aqVarOooO0Oo.OooO0Oo);
            return true;
        }
        if (i == 2) {
            String string2 = parcel.readString();
            int i4 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            synchronized (this) {
                try {
                    aq aqVarOooO0Oo2 = OooO0Oo(i4, string2);
                    i3 = aqVarOooO0Oo2.OooO0OO() != z ? 1 : 0;
                    if (i3 != 0) {
                        aqVarOooO0Oo2.OooO0o0(u7.OooO00o(new byte[]{27, -91, -4, -68, 98, 25}, new byte[]{126, -53, -99, -34, 14, 124, 71, -19}), z ? u7.OooO00o(new byte[]{-44}, new byte[]{-27, -46, 36, 26, -11, -108, -120, 98}) : u7.OooO00o(new byte[]{-67}, new byte[]{-115, -22, 117, 8, 9, -3, 89, 90}));
                        this.OooO0o.OooO(string2, i4, aqVarOooO0Oo2);
                    }
                } finally {
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        if (i == 3) {
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i5 = parcel.readInt();
            synchronized (this) {
                OooO0Oo(i5, string3).OooO0o0(string4, string5);
            }
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        if (i != 4) {
            if (i != 5) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            o000oooo(parcel.readInt(), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(1);
            return true;
        }
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        int i6 = parcel.readInt();
        synchronized (this) {
            string = OooO0Oo(i6, string6).OooO0Oo.getString(string7, string8);
        }
        parcel2.writeNoException();
        parcel2.writeString(string);
        return true;
    }
}

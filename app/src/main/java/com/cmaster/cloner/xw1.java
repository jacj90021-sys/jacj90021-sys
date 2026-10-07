package com.cmaster.cloner;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xw1 extends Binder implements IInterface {
    public final /* synthetic */ yw1 OooO0Oo;

    public xw1(yw1 yw1Var) {
        this.OooO0Oo = yw1Var;
        attachInterface(this, u7.OooO00o(new byte[]{-99, 127, -96, -59, -69, 10, 25, 107, -118, 117, -65, -59, -69, 11, 23, 118, -101, 98, -29, -101, -71, 10, 19, 117, -111, 62, -96, -111, -78, 73, 41, 92, -112, 115, -96, -115, -75, 21, 61, 104, -112, 116, -86, -126, -87, 5}, new byte[]{-2, 16, -51, -21, -40, 103, 120, 24}));
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    public final void o0000o0O(int i, int i2, String str, String str2) {
        String strOooO00o = u7.OooO00o(new byte[]{-9, -83, -124, 90, -109, -70, 88, 28, -47, -80, -100, 71, -107, -79}, new byte[]{-76, -62, -22, 46, -10, -44, 44, 79});
        StringBuilder sb = new StringBuilder();
        rj.OooOOo0(new byte[]{108, -35, 7, -100, 24, -109, -118, 87, 102, -9, 50, -111, 30, -116, -114, 84, 35}, new byte[]{3, -77, 87, -3, 123, -8, -21, 48}, sb, str);
        rj.OooOOOo(new byte[]{-17, 123}, new byte[]{-61, 91, 61, -6, -58, -11, 103, -112}, sb, i);
        rj.OooOOo0(new byte[]{-101, 85}, new byte[]{-73, 117, 45, -62, -11, -101, -31, -97}, sb, str2);
        sb.append(u7.OooO00o(new byte[]{-56, -7}, new byte[]{-28, -39, -84, 101, -85, -104, -25, 92}));
        sb.append(i2);
        Log.d(strOooO00o, sb.toString());
        this.OooO0Oo.o00O00O(i2, null, str);
    }

    public final void o000oooo(String str, int i, String str2, Bundle bundle, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{-79, -37, 109, 63, -92, -89, 74, -115, -105, -58, 117, 34, -94, -84}, new byte[]{-14, -76, 3, 75, -63, -55, 62, -34});
        StringBuilder sb = new StringBuilder();
        rj.OooOOo0(new byte[]{31, 127, -71, 33, 111, -103, -60, -92, 21, 88, -121, 51, 120, -109, -55, -81, 21, 117, -55}, new byte[]{112, 17, -23, 64, 12, -14, -91, -61}, sb, str);
        rj.OooOOOo(new byte[]{-39, 76}, new byte[]{-11, 108, 55, -46, -96, -17, 104, -112}, sb, i);
        rj.OooOOo0(new byte[]{-81, -97}, new byte[]{-125, -65, -25, 23, -15, 91, -111, 2}, sb, str2);
        sb.append(u7.OooO00o(new byte[]{-101, -100}, new byte[]{-73, -68, 27, -88, -125, -30, -44, -43}));
        sb.append(bundle);
        sb.append(u7.OooO00o(new byte[]{124, -68}, new byte[]{80, -100, 41, -101, -121, -123, 94, 76}));
        sb.append(i2);
        Log.d(strOooO00o, sb.toString());
        this.OooO0Oo.o00O00O(i2, null, str);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{27, -92, -85, 111, 8, 86, -120, -13, 12, -82, -76, 111, 8, 87, -122, -18, 29, -71, -24, 49, 10, 86, -126, -19, 23, -27, -85, 59, 1, 21, -72, -60, 22, -88, -85, 39, 6, 73, -84, -16, 22, -81, -95, 40, 26, 89}, new byte[]{120, -53, -58, 65, 107, 59, -23, -128});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        if (i == 1) {
            o000oooo(parcel.readString(), parcel.readInt(), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readInt());
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            o0000o0O(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }
        return true;
    }
}

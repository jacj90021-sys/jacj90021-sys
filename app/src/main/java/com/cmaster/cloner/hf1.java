package com.cmaster.cloner;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hf1 extends Binder implements kf0 {
    public static final oO00OOOo OooO = new oO00OOOo(5);
    public static final /* synthetic */ int OooO0oo = 0;
    public boolean OooO0Oo;
    public int OooO0o;
    public ff1 OooO0o0;
    public final HashMap OooO0oO;

    public hf1() {
        attachInterface(this, u7.OooO00o(new byte[]{58, 75, -32, -22, -60, -6, -11, -56, 45, 65, -1, -22, -60, -5, -5, -43, 60, 86, -93, -112, -22, -50, -40, -14, 3, 116, -59, -99, -21, -40, -63, -10, 24, 124, -57}, new byte[]{89, 36, -115, -60, -89, -105, -108, -69}));
        this.OooO0Oo = false;
        this.OooO0o = 0;
        this.OooO0oO = new HashMap();
        cx1.OooO0o.execute(new u91(this, 1));
    }

    @Override // com.cmaster.cloner.kf0
    public final IBinder Oooo00O(String str) {
        return (IBinder) this.OooO0oO.get(str);
    }

    @Override // com.cmaster.cloner.kf0
    public final ff1 OoooOOo() {
        return this.OooO0o0;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // com.cmaster.cloner.kf0
    public final int o0000OO0() {
        return this.OooO0o;
    }

    public final void o0000o0O(Context context) {
        synchronized (this) {
            try {
                if (!this.OooO0Oo) {
                    dx1.OooO0OO(context);
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-122, 124, 14, -67, -20, 76, 26, -35, -108, 111, 10, -69}, new byte[]{-11, 8, 111, -55, -97, 33, 123, -77}), new qy(u7.OooO00o(new byte[]{-4, 52, 52, -26, -50, 18, 112, 70, -14, 41, 126, -35, -14, 15, 117, 28, -18, 23, 49, -6, -64, 28, 113, 26, -50, 63, 34, -30, -56, 24, 113}, new byte[]{-99, 90, 80, -108, -95, 123, 20, 104})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-62, 18, -88, -97, 126, -52, -96, -120, -38, 20, -91, -109, 82}, new byte[]{-82, 125, -53, -12, 33, -65, -59, -4}), new qy(u7.OooO00o(new byte[]{-10, 39, -17, 34, -100, -63, -114, -17, -6, 33, -26, 34, -108, -63, -98, -8, -25, 38, -29, 96, -45, -40, -125, -7, -14, 45, -10, 34, -76, -29, -123, -2, -2, 27, -25, 120, -119, -58, -124, -6, -26}, new byte[]{-107, 72, -126, 12, -3, -81, -22, -99})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-24, 39, 6, -37, 66, 49, -115, 109, -26, 58, 76, -4, 93, 60, -120, 55, -20, 12, 12, -50, 68, 54, -116, 16, -20, 59, 20, -64, 78, 61}, new byte[]{-119, 73, 98, -87, 45, 88, -23, 67}), new qy(u7.OooO00o(new byte[]{-42, -16, -17, 72, 12, -116, 94, -6, -40, -19, -91, 115, 54, -107, 94, -75, -61, -5, -50, 84, 4, -116, 84, -79}, new byte[]{-73, -98, -117, 58, 99, -27, 58, -44})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-33, -50, -51, 127, 121, -89, 80, 73, -36, -45, -33, 127, 121}, new byte[]{-84, -73, -66, 11, 28, -54, 15, 60}), new qy(u7.OooO00o(new byte[]{28, 83, 122, 39, -18, 127, 84, 125, 18, 78, 48, 28, -46, 111, 67, 39, 24, 80, 75, 37, -27, 119, 68, 54, 48, 92, 112, 52, -26, 115, 66}, new byte[]{125, 61, 30, 85, -127, 22, 48, 83})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-43, 4, 2, 3, 53, 127, -23, 112, -45, 6, 27, 40, 37}, new byte[]{-76, 116, 114, 92, 92, 17, -99, 21}), new qy(u7.OooO00o(new byte[]{121, 50, 31, 68, -119, -24, 109, 59, 123, 51, 21, 66, -125, -17, 125, 59, 113, 50, 15, 83, -127, -13, 96, 97, 97, 114, 50, 119, -106, -15, 64, 123, 108, 57, 28, 68, -113, -11, 112, 88, 121, 50, 26, 81, -125, -13}, new byte[]{24, 92, 123, 54, -26, -127, 9, 21})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-109, -72, 4, -71, -9, 16, 82, 54}, new byte[]{-31, -35, 103, -42, -127, 117, 32, 79}), new qy(u7.OooO00o(new byte[]{61, -2, 59, 108, 24, -108, -120, 81, 51, -29, 113, 87, 37, -104, -113, 16, 42, -11, 45, 103, 36, -124, -97, 11, 57, -3}, new byte[]{92, -112, 95, 30, 119, -3, -20, 127})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{34, -66, 59, -45, -127, 13, -33, 4, 59, -78, 47}, new byte[]{85, -41, 93, -70, -14, 110, -66, 106}), new qy(u7.OooO00o(new byte[]{-36, 22, 1, -85, -107, -97, 1, -45, -45, 29, 17, -9, -115, -97, 3, -108, -109, 49, 50, -80, -100, -97, 54, -98, -36, 22, 11, -68, -120}, new byte[]{-67, 120, 101, -39, -6, -10, 101, -3})));
                    this.OooO0oO.put(u7.OooO00o(new byte[]{-58, -22, -70, -50, -45, 55, 119, 39, -37, -20, -95, -53, -39}, new byte[]{-88, -113, -50, -71, -68, 69, 28, 120}), new qy(u7.OooO00o(new byte[]{10, 114, -118, 53, -97, -96, 67, -10, 5, 121, -102, 105, -71, -121, 66, -84, 28, 115, -100, 44, -93, -86, 72, -86, 14, 79, -117, 53, -122, -96, 68, -67}, new byte[]{107, 28, -18, 71, -16, -55, 39, -40})));
                    ff1.OooO00o(context);
                    ff1 ff1Var = new ff1();
                    this.OooO0o0 = ff1Var;
                    ff1Var.OooO0O0(e92.OooO00o);
                    this.OooO0Oo = true;
                    cx1.OooO0o.execute(new oOOoOOO0(5));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ox1.o0O0ooO().OooOOO.block(0L);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, final Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{37, 52, 47, -72, 50, -54, 4, -24, 50, 62, 48, -72, 50, -53, 10, -11, 35, 41, 108, -62, 28, -2, 41, -46, 28, 11, 10, -49, 29, -24, 48, -42, 7, 3, 8}, new byte[]{70, 91, 66, -106, 81, -89, 101, -101});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        switch (i) {
            case 1:
                IBinder iBinderOooo00O = Oooo00O(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderOooo00O);
                return true;
            case 2:
                qy qyVar = new qy(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(qyVar);
                return true;
            case 3:
                IBinder iBinderOo000o = oo000o(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderOo000o);
                return true;
            case 4:
                Map map = Collections.EMPTY_MAP;
                parcel2.writeNoException();
                if (map == null) {
                    parcel2.writeInt(-1);
                    return true;
                }
                parcel2.writeInt(map.size());
                map.forEach(new BiConsumer() { // from class: com.cmaster.cloner.if0
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        Parcel parcel3 = parcel2;
                        parcel3.writeString((String) obj);
                        parcel3.writeStrongBinder((IBinder) obj2);
                    }
                });
                return true;
            case 5:
                ff1 ff1Var = this.OooO0o0;
                parcel2.writeNoException();
                if (ff1Var == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                ff1Var.writeToParcel(parcel2, 1);
                return true;
            case 6:
                int i3 = this.OooO0o;
                parcel2.writeNoException();
                parcel2.writeInt(i3);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // com.cmaster.cloner.kf0
    public final IBinder oo000o(String str) {
        oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
        oo00ooo0OooO0Oo.getClass();
        try {
            oo00ooo0OooO0Oo.OooO0oO(null, str);
        } catch (Exception unused) {
        }
        oO00Oo00 oo00oo00 = (oO00Oo00) oo00ooo0OooO0Oo.OooO00o.get(str);
        if (oo00oo00 == null) {
            return null;
        }
        return oo00oo00.OooOOOo.asBinder();
    }
}

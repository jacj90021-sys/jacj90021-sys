package com.cmaster.cloner;

import android.app.Application;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.PowerManager;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0O0oo00 extends Binder implements w90 {
    public final /* synthetic */ o0OO00o0 OooO0Oo;

    public o0O0oo00(o0OO00o0 o0oo00o0) {
        this.OooO0Oo = o0oo00o0;
        attachInterface(this, u7.OooO00o(new byte[]{-51, 99, 109, -94, 109, 22, 66, 58, -38, 105, 114, -94, 109, 23, 76, 39, -53, 126, 46, -40, 92, 47, 96, 30, -24, 68, 68, -56, 84, 43, 119, 5, -20, 89, 89, -35, 92}, new byte[]{-82, 12, 0, -116, 14, 123, 35, 73}));
    }

    public static w90 o0000o0O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u7.OooO00o(new byte[]{24, 29, -21, 85, 7, -127, 1, -78, 15, 23, -12, 85, 7, -128, 15, -81, 30, 0, -88, 47, 54, -72, 35, -106, 61, 58, -62, 63, 62, -68, 52, -115, 57, 39, -33, 42, 54}, new byte[]{123, 114, -122, 123, 100, -20, 96, -63}));
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof w90)) {
            return (w90) iInterfaceQueryLocalInterface;
        }
        t90 t90Var = new t90();
        t90Var.OooO0Oo = iBinder;
        return t90Var;
    }

    @Override // com.cmaster.cloner.w90
    public final void OooOOO0(Intent intent, ActivityInfo activityInfo) {
        o0OO00o0 o0oo00o0 = this.OooO0Oo;
        try {
            o0oo00o0.OooO00o.block();
            Binder binder = o0oo00o0.OooOO0o;
            Object obj = o0oo00o0.OooOOO0;
            o00OO000 o00oo000 = o0OOooO0.OooO00o;
            if (o00oo000 != null) {
                o00oo000.OooOooo(binder, intent, activityInfo, obj, -1, null, null, Boolean.FALSE, 0, 12);
                return;
            }
            o00OO000 o00oo0002 = o0OOooO0.OooO0O0;
            if (o00oo0002 != null) {
                Boolean bool = Boolean.FALSE;
                o00oo0002.OooOooo(binder, intent, activityInfo, obj, -1, null, null, bool, bool, 0, 12, -1, null);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void OooOoOO(IBinder iBinder) {
        try {
            Binder binder = this.OooO0Oo.OooOO0o;
            o00OO000 o00oo000 = o0O.OooOO0;
            if (o00oo000 != null) {
                o00oo000.OooOooo(binder, iBinder);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void OoooooO(IBinder iBinder, IBinder iBinder2, Intent intent, boolean z, int i) {
        try {
            o0O.OooO00o(this.OooO0Oo.OooOO0o, iBinder, iBinder2, intent, z, i);
        } catch (Exception unused) {
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // com.cmaster.cloner.w90
    public final void o0000o(IBinder iBinder, ArrayList arrayList) {
        oo0oO0 oo0oo0 = new oo0oO0();
        oo0oo0.OooO00o = arrayList;
        oo0oo0.OooO0O0 = iBinder;
        Message messageObtain = Message.obtain();
        messageObtain.what = 108;
        messageObtain.obj = oo0oo0;
        messageObtain.arg1 = 0;
        messageObtain.arg2 = 0;
        this.OooO0Oo.OooO0Oo.sendMessage(messageObtain);
    }

    @Override // com.cmaster.cloner.w90
    public final boolean o000O000(Intent intent, sf1 sf1Var, int i) {
        oo0ooO oo0ooo = new oo0ooO();
        oo0ooo.OooO0Oo = intent;
        oo0ooo.OooO0o0 = sf1Var;
        Message messageObtain = Message.obtain();
        messageObtain.what = 13;
        messageObtain.obj = oo0ooo;
        this.OooO0Oo.OooO0o0.sendMessage(messageObtain);
        return true;
    }

    @Override // com.cmaster.cloner.w90
    public final void o000O0o(IBinder iBinder, ServiceInfo serviceInfo, int i) {
        ServiceInfo serviceInfo2;
        o0OO00o0 o0oo00o0 = this.OooO0Oo;
        try {
            o0oo00o0.OooO00o.block(0L);
            Binder binder = o0oo00o0.OooOO0o;
            Object obj = o0oo00o0.OooOOO0;
            o00OO000 o00oo000 = o0O.OooO0O0;
            if (o00oo000 == null) {
                serviceInfo2 = serviceInfo;
            } else if (((Method) o00oo000.OooO0o0).getParameterTypes().length == 6) {
                serviceInfo2 = serviceInfo;
                o00oo000.OooOooo(binder, iBinder, serviceInfo2, obj, Integer.valueOf(i), 0, null);
            } else {
                serviceInfo2 = serviceInfo;
                o00oo000.OooOooo(binder, iBinder, serviceInfo2, obj, Integer.valueOf(i));
            }
            o0OO00o0 o0oo00o02 = o0OO00o0.OooOOo0;
            u7.OooO00o(new byte[]{78, 68, 62, 21, 73, 106, -128, -51, 126, 85, 51, 17, 89, 122, -65, -51, 79, 81, 63, 19, 72, 63}, new byte[]{61, 39, 86, 112, 45, 31, -20, -88});
            Objects.toString(serviceInfo2);
            u7.OooO00o(new byte[]{31, 53, -81, 74, -114, 73, -88, 61}, new byte[]{63, 70, -38, 41, -19, 44, -37, 78});
            int i2 = fp0.OooO00o;
        } catch (Exception unused) {
        }
    }

    @Override // com.cmaster.cloner.w90
    public final boolean o000OO0O(sf1 sf1Var, int i) {
        synchronized (this.OooO0Oo.OooOO0) {
            try {
                oo0ooO oo0ooo = (oo0ooO) this.OooO0Oo.OooOO0.remove(sf1Var.asBinder());
                if (oo0ooo == null) {
                    return false;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 14;
                messageObtain.obj = oo0ooo;
                this.OooO0Oo.OooO0o0.sendMessage(messageObtain);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o000Oo0O(ce ceVar) {
        o0.OooO0oO.OooO00o.block();
        ceVar.OooO00o();
    }

    @Override // com.cmaster.cloner.w90
    public final void o000o0O0(p2 p2Var) {
        boolean zContains;
        o0OO00o0 o0oo00o0 = o0OO00o0.OooOOo0;
        o0oo00o0.getClass();
        Integer num = qx1.OooO00o;
        synchronized (qx1.class) {
            try {
                if (qx1.OooO0Oo == null) {
                    qx1.OooO0Oo = p2Var;
                    w50 w50Var = new w50();
                    boolean z = p2Var.OooOO0;
                    String str = p2Var.OooO0o0.packageName;
                    boolean z2 = false;
                    if (z) {
                        HashSet hashSet = i21.OooO00o;
                        zContains = false;
                    } else {
                        zContains = i21.OooOO0O.contains(str);
                    }
                    w50Var.OooO0Oo = zContains;
                    qx1.OooOO0 = w50Var;
                    Map map = (Map) e92.OooO0oO;
                    map.put(u7.OooO00o(new byte[]{-18, 101, -41, -24, -1, 2, -36, -94, -50, 81, -17, -59, -50, 103, -56}, new byte[]{-117, 29, -93, -102, -98, 44, -113, -22}), qx1.OooO0Oo());
                    map.put(u7.OooO00o(new byte[]{-115, -50, 14, 79, -25, -17, 122, 56, -85, -3, 59, 122, -61, -98, 100, 56, -91, -13}, new byte[]{-24, -74, 122, 61, -122, -63, 42, 121}), qx1.OooO00o());
                    map.put(u7.OooO00o(new byte[]{41, 103, 54, -18, 50, 25, -91, -90, 9, 77}, new byte[]{76, 31, 66, -100, 83, 55, -16, -11}), Integer.valueOf(qx1.OooO0oO()));
                    String strOooO00o = u7.OooO00o(new byte[]{74, -111, 16, -4, -90, 29, -40, -78, 96, -86, 33, -35, -108, 108, -58, -95, 98, -84}, new byte[]{47, -23, 100, -114, -57, 51, -120, -32});
                    p2 p2Var2 = qx1.OooO0Oo;
                    map.put(strOooO00o, p2Var2 != null ? p2Var2.OooOO0O : null);
                    String strOooO00o2 = u7.OooO00o(new byte[]{86, 103, -15, -11, -125, 72, -114, 97, 124, 77, -60, -64, -89, 57, -115, 126, 116}, new byte[]{51, 31, -123, -121, -30, 102, -35, 53});
                    p2 p2Var3 = qx1.OooO0Oo;
                    map.put(strOooO00o2, p2Var3 != null ? p2Var3.OooOO0o : null);
                    ew0.OooO0Oo(p2Var.OooO0oO, p2Var.OooO0o0);
                    PowerManager powerManager = (PowerManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{32, 88, 15, -35, -115}, new byte[]{80, 55, 120, -72, -1, 4, -39, 67}));
                    if (Build.VERSION.SDK_INT >= 28) {
                        if (powerManager != null && !powerManager.isIgnoringBatteryOptimizations(qx1.OooO0Oo())) {
                            z2 = true;
                        }
                        qx1.OooO0oo = z2;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qx1.OooO0Oo == null) {
            u7.OooO00o(new byte[]{79, 103, 40, 101, -108, 54, 78, -126, 65, 103, 37, 96, -64, 62, 81, -100, 13, 104, 39, 104, -40, 50, 90, -46}, new byte[]{45, 14, 70, 1, -76, 87, 62, -14});
            int i = fp0.OooO00o;
        } else {
            u7.OooO00o(new byte[]{-121, -19, 18, -11, 9, -124, -74, -62, -119, -19, 31, -16, 93, -116, -87, -36, -59, -12, 14, -2, 74, -128, -75, -63, -59}, new byte[]{-27, -124, 124, -111, 41, -27, -58, -78});
            String str2 = qx1.OooO0Oo.OooOO0O;
            u7.OooO00o(new byte[]{-62, -36, -115, 6, 13, 74, 121, -94}, new byte[]{-30, -81, -3, 103, 110, 47, 67, -126});
            int i2 = qx1.OooO0Oo.OooO0oO;
            int i3 = fp0.OooO00o;
        }
        o0oo00o0.OooO0Oo.sendMessageAtFrontOfQueue(o0oo00o0.OooO0Oo.obtainMessage(110, p2Var));
    }

    @Override // com.cmaster.cloner.w90
    public final void o000oOoo(IBinder iBinder, IBinder iBinder2, Intent intent) {
        try {
            Binder binder = this.OooO0Oo.OooOO0o;
            o00OO000 o00oo000 = o0O.OooO0o;
            if (o00oo000 != null) {
                o00oo000.OooOooo(binder, iBinder, intent);
            } else {
                o00OO000 o00oo0002 = o0O.OooO0oO;
                if (o00oo0002 != null) {
                    o00oo0002.OooOooo(binder, iBinder, iBinder2, intent);
                }
            }
        } catch (Exception unused) {
        }
        o0OO00o0 o0oo00o0 = o0OO00o0.OooOOo0;
        u7.OooO00o(new byte[]{-86, 2, 93, 116, 44, 9, 79, -26, -116, 15, 87, 120, 38, 24, 112, -26, -85, 23, 92, 114, 45, 92}, new byte[]{-39, 97, 53, 17, 72, 124, 35, -125});
        Objects.toString(intent);
        int i = fp0.OooO00o;
    }

    @Override // com.cmaster.cloner.w90
    public final IBinder o00Oo0(String str, ProviderInfo providerInfo) {
        this.OooO0Oo.OooO00o.block();
        boolean z = false;
        String[] strArrSplit = providerInfo.authority.split(u7.OooO00o(new byte[]{108}, new byte[]{87, 79, -63, 1, 3, -123, 44, -68}));
        String str2 = strArrSplit.length == 0 ? providerInfo.authority : strArrSplit[0];
        synchronized (this.OooO0Oo.OooO0O0) {
            try {
                ConditionVariable conditionVariable = (ConditionVariable) this.OooO0Oo.OooO0O0.get(providerInfo.authority);
                if (conditionVariable == null) {
                    o00OO000 o00oo000 = o0OO0oO0.OooOOOo;
                    Object objOooO00o = o0OO0oO0.OooO00o();
                    Application application = this.OooO0Oo.OooO0oO;
                    Integer num = qx1.OooO00o;
                    IInterface iInterface = (IInterface) o00oo000.OooOooo(objOooO00o, application, str2, Integer.valueOf(jr1.OooO00o()), Boolean.FALSE);
                    if (iInterface != null) {
                        return iInterface.asBinder();
                    }
                    conditionVariable = new ConditionVariable();
                    this.OooO0Oo.OooO0O0.put(providerInfo.authority, conditionVariable);
                    v90.OooO0O0.OooOooo(o0OO0oO0.OooO0OO(), providerInfo);
                    cx1.OooO0o0.execute(new pi2(this, providerInfo, 6, z));
                }
                conditionVariable.block();
                o00OO000 o00oo0002 = o0OO0oO0.OooOOOo;
                Object objOooO00o2 = o0OO0oO0.OooO00o();
                Application application2 = this.OooO0Oo.OooO0oO;
                Integer num2 = qx1.OooO00o;
                IInterface iInterface2 = (IInterface) o00oo0002.OooOooo(objOooO00o2, application2, str2, Integer.valueOf(jr1.OooO00o()), Boolean.FALSE);
                if (iInterface2 != null) {
                    return iInterface2.asBinder();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.w90
    public final void o0Oo0oo(IBinder iBinder, ArrayList arrayList) {
        boolean zOooO0O0 = yn2.OooO0O0();
        o0OO00o0 o0oo00o0 = this.OooO0Oo;
        int i = 0;
        if (!zOooO0O0 || o0O.OooO == null) {
            while (i < arrayList.size()) {
                nf1 nf1Var = (nf1) arrayList.get(i);
                Binder binder = o0oo00o0.OooOO0o;
                boolean z = nf1Var.OooO0Oo;
                int i2 = nf1Var.OooO0o0;
                int i3 = nf1Var.OooO0o;
                Intent intent = nf1Var.OooO0oO;
                o00OO000 o00oo000 = o0O.OooO0oo;
                if (o00oo000 != null) {
                    o00oo000.OooOooo(binder, iBinder, Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3), intent);
                }
                i++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        while (i < arrayList.size()) {
            nf1 nf1Var2 = (nf1) arrayList.get(i);
            boolean z2 = nf1Var2.OooO0Oo;
            int i4 = nf1Var2.OooO0o0;
            int i5 = nf1Var2.OooO0o;
            Intent intent2 = nf1Var2.OooO0oO;
            xb1 xb1Var = of1.OooO00o;
            arrayList2.add(xb1Var != null ? xb1Var.Oooo000(Boolean.valueOf(z2), Integer.valueOf(i4), Integer.valueOf(i5), intent2) : null);
            o0OO00o0 o0oo00o02 = o0OO00o0.OooOOo0;
            u7.OooO00o(new byte[]{58, -104, -101, 32, 1, -2, -89, 123, 26, -98, -127, 51, 12, -24, -82, 95, 59, -100, -128, 101, 4, -7, -84, 109}, new byte[]{73, -5, -13, 69, 101, -117, -53, 30});
            arrayList2.toString();
            int i6 = fp0.OooO00o;
            i++;
        }
        Object objOooO0OO = m21.OooO0OO(arrayList2);
        Binder binder2 = o0oo00o0.OooOO0o;
        o00OO000 o00oo0002 = o0O.OooO;
        if (o00oo0002 != null) {
            o00oo0002.OooOooo(binder2, iBinder, objOooO0OO);
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String strOooO00o = u7.OooO00o(new byte[]{-42, -60, -43, 116, -39, -72, 63, 55, -63, -50, -54, 116, -39, -71, 49, 42, -48, -39, -106, 14, -24, -127, 29, 19, -13, -29, -4, 30, -32, -123, 10, 8, -9, -2, -31, 11, -24}, new byte[]{-75, -85, -72, 90, -70, -43, 94, 68});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        switch (i) {
            case 1:
                o000o0O0((p2) at2.OooO00o(parcel, p2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                o000O0o(parcel.readStrongBinder(), (ServiceInfo) at2.OooO00o(parcel, ServiceInfo.CREATOR), parcel.readInt());
                return true;
            case 3:
                OooOoOO(parcel.readStrongBinder());
                return true;
            case 4:
                o0Oo0oo(parcel.readStrongBinder(), parcel.readArrayList(o0O0oo00.class.getClassLoader()));
                return true;
            case 5:
                OoooooO(parcel.readStrongBinder(), parcel.readStrongBinder(), (Intent) at2.OooO00o(parcel, Intent.CREATOR), parcel.readInt() != 0, parcel.readInt());
                return true;
            case 6:
                o000oOoo(parcel.readStrongBinder(), parcel.readStrongBinder(), (Intent) at2.OooO00o(parcel, Intent.CREATOR));
                return true;
            case 7:
                parcel.readStrongBinder();
                parcel.createStringArray();
                return true;
            case 8:
                o000O000((Intent) at2.OooO00o(parcel, Intent.CREATOR), rf1.o0000o0O(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 9:
                boolean zO000OO0O = o000OO0O(rf1.o0000o0O(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO000OO0O ? 1 : 0);
                return true;
            case 10:
                o000Oo0O((ce) at2.OooO00o(parcel, ce.CREATOR));
                parcel2.writeNoException();
                return true;
            case 11:
                IBinder strongBinder = parcel.readStrongBinder();
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(q81.CREATOR);
                parcel.readInt();
                o0000o(strongBinder, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 12:
                parcel.readStrongBinder();
                parcel2.writeNoException();
                return true;
            case 13:
                OooOOO0((Intent) at2.OooO00o(parcel, Intent.CREATOR), (ActivityInfo) at2.OooO00o(parcel, ActivityInfo.CREATOR));
                return true;
            case 14:
                IBinder iBinderO00Oo0 = o00Oo0(parcel.readString(), (ProviderInfo) at2.OooO00o(parcel, ProviderInfo.CREATOR));
                parcel2.writeNoException();
                parcel2.writeStrongBinder(iBinderO00Oo0);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

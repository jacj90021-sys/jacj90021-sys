package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tg1 extends Binder implements uyi, mf0 {
    public static final oO00OOOo OooO0Oo = new oO00OOOo(7);

    public tg1() {
        attachInterface(this, u7.OooO00o(new byte[]{-58, 80, 4, 55, -65, 98, 15, -71, -47, 90, 27, 55, -65, 99, 1, -92, -64, 77, 71, 77, -104, 65, 62, -117, -1, 114, 34, 76, -106, 67, 39, -116}, new byte[]{-91, 63, 105, 25, -36, 15, 110, -54}));
    }

    public static mf0 o0000o0O(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(u7.OooO00o(new byte[]{-22, 99, 77, 8, 93, -75, 5, -35, -3, 105, 82, 8, 93, -76, 11, -64, -20, 126, 14, 114, 122, -106, 52, -17, -45, 65, 107, 115, 116, -108, 45, -24}, new byte[]{-119, 12, 32, 38, 62, -40, 100, -82}));
        if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof mf0)) {
            return (mf0) iInterfaceQueryLocalInterface;
        }
        lf0 lf0Var = new lf0();
        lf0Var.OooO0Oo = iBinder;
        return lf0Var;
    }

    @Override // com.cmaster.cloner.mf0
    public final byte[] Oooo00o() {
        try {
            return ((pq) pq.OooO0O0.OooO0O0()).OooO0Oo();
        } catch (IOException e) {
            sa.OooOO0(e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.mf0
    public final List Oooo0oo() {
        return ((ActivityManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{52, 37, 51, 28, 29, 80, 17, -112}, new byte[]{85, 70, 71, 117, 107, 57, 101, -23}))).getRunningAppProcesses();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // com.cmaster.cloner.uyi
    public final Bundle call(String str, String str2, Bundle bundle) throws NumberFormatException {
        int i;
        IBinder iBinderAsBinder;
        boolean zOooO0O0 = m63.OooO0O0();
        oO00OOOo oo00oooo = hf1.OooO;
        if (zOooO0O0) {
            ((hf1) oo00oooo.OooO0O0()).o0000o0O(e92.OooO00o);
        } else if (m63.OooO0OO == 3) {
        } else if (m63.OooO00o()) {
            rx1.OooO00o();
            o0OO00o0 o0oo00o0 = o0OO00o0.OooOOo0;
            o0oo00o0.OooOOOo.block();
            o0oo00o0.OooO0O0();
        } else {
            rx1.OooO00o();
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = 995;
        }
        switch (i) {
            case 995:
                iBinderAsBinder = (oOO0O0O) oOO0O0O.OooO0Oo.OooO0O0();
                break;
            case 996:
                iBinderAsBinder = o0OO00o0.OooOOo0.OooO0OO;
                break;
            case 997:
                iBinderAsBinder = (tg1) OooO0Oo.OooO0O0();
                break;
            case 998:
                if (!m63.OooO0O0()) {
                    iBinderAsBinder = rx1.OooO00o().asBinder();
                    break;
                } else {
                    iBinderAsBinder = (hf1) oo00oooo.OooO0O0();
                    break;
                }
            default:
                iBinderAsBinder = null;
                break;
        }
        if (iBinderAsBinder == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBinder(u7.OooO00o(new byte[]{82, -92, -127, 39, -49, -74, 119, -58, 90, -92, -111, 48, -50, -85, 61, -115, 75, -66, -105, 52, -114, -106, 93, -68, 118, -124, -79}, new byte[]{51, -54, -27, 85, -96, -33, 19, -24}), iBinderAsBinder);
        return bundle2;
    }

    @Override // com.cmaster.cloner.mf0
    public final void o0000oOo(int i) {
        Process.sendSignal(i, 9);
    }

    @Override // com.cmaster.cloner.mf0
    public final ArrayList o0000oo0() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{-92, -8, 3, 73, -32, 113, 22, -47}, new byte[]{-59, -101, 119, 32, -106, 24, 98, -88}))).getAppTasks();
        ArrayList arrayList = new ArrayList(appTasks.size());
        Iterator<ActivityManager.AppTask> it = appTasks.iterator();
        while (it.hasNext()) {
            arrayList.add(((IInterface) o0O000Oo.OooO0O0.OooO0O0(it.next())).asBinder());
        }
        return arrayList;
    }

    @Override // com.cmaster.cloner.mf0
    public final String o000oOoO() {
        pq pqVar = (pq) pq.OooO0O0.OooO0O0();
        pqVar.OooO00o();
        return pqVar.OooO00o.OooO0OO.getName();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws SecurityException {
        String strOooO00o = u7.OooO00o(new byte[]{-68, 98, 122, 80, 80, -10, -71, 105, -85, 104, 101, 80, 80, -9, -73, 116, -70, 127, 57, 42, 119, -43, -120, 91, -123, 64, 92, 43, 121, -41, -111, 92}, new byte[]{-33, 13, 23, 126, 51, -101, -40, 26});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        switch (i) {
            case 1:
                byte[] bArrOooo00o = Oooo00o();
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrOooo00o);
                return true;
            case 2:
                String strO000oOoO = o000oOoO();
                parcel2.writeNoException();
                parcel2.writeString(strO000oOoO);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                int i3 = parcel.readInt();
                Object objCreateFromParcel = parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null;
                parcel.readInt();
                o0O00O0o.OooO00o(strongBinder, i3, (Intent) objCreateFromParcel);
                parcel2.writeNoException();
                parcel2.writeInt(1);
                return true;
            case 4:
                List listOooo0oo = Oooo0oo();
                parcel2.writeNoException();
                qt2.OooO00o(parcel2, listOooo0oo);
                return true;
            case 5:
                List<ActivityManager.RecentTaskInfo> recentTasks = ((ActivityManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{1, -75, 62, 100, 61, 31, 123, 61}, new byte[]{96, -42, 74, 13, 75, 118, 15, 68}))).getRecentTasks(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                qt2.OooO00o(parcel2, recentTasks);
                return true;
            case 6:
                ArrayList arrayListO0000oo0 = o0000oo0();
                parcel2.writeNoException();
                parcel2.writeBinderList(arrayListO0000oo0);
                return true;
            case 7:
                Intent intent = (Intent) (parcel.readInt() != 0 ? Intent.CREATOR.createFromParcel(parcel) : null);
                parcel.readInt();
                e92.OooO00o.startActivity(intent);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 8:
                Process.sendSignal(parcel.readInt(), parcel.readInt());
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

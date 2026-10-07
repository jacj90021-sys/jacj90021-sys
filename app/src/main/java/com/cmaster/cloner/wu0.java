package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class wu0 extends Binder implements ac0 {
    public final /* synthetic */ MultiInstanceInvalidationService OooO0Oo;

    public wu0(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.OooO0Oo = multiInstanceInvalidationService;
        attachInterface(this, ac0.OooO0O0);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // com.cmaster.cloner.ac0
    public final void o000o00(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.OooO0Oo;
        synchronized (multiInstanceInvalidationService.OooO0o) {
            String str = (String) multiInstanceInvalidationService.OooO0o0.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int iBeginBroadcast = multiInstanceInvalidationService.OooO0o.beginBroadcast();
            int i2 = 0;
            while (true) {
                xu0 xu0Var = multiInstanceInvalidationService.OooO0o;
                if (i2 >= iBeginBroadcast) {
                    xu0Var.finishBroadcast();
                    return;
                }
                try {
                    Object broadcastCookie = xu0Var.getBroadcastCookie(i2);
                    broadcastCookie.getClass();
                    Integer num = (Integer) broadcastCookie;
                    int iIntValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.OooO0o0.get(num);
                    if (i != iIntValue && str.equals(str2)) {
                        try {
                            ((zb0) multiInstanceInvalidationService.OooO0o.getBroadcastItem(i2)).OooOooO(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                    i2++;
                } catch (Throwable th) {
                    multiInstanceInvalidationService.OooO0o.finishBroadcast();
                    throw th;
                }
            }
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = ac0.OooO0O0;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        zb0 zb0Var = null;
        zb0 zb0Var2 = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                o000o00(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(zb0.OooO00o);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof zb0)) {
                    yb0 yb0Var = new yb0();
                    yb0Var.OooO0Oo = strongBinder;
                    zb0Var2 = yb0Var;
                } else {
                    zb0Var2 = (zb0) iInterfaceQueryLocalInterface;
                }
            }
            int i3 = parcel.readInt();
            zb0Var2.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.OooO0Oo;
            synchronized (multiInstanceInvalidationService.OooO0o) {
                multiInstanceInvalidationService.OooO0o.unregister(zb0Var2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(zb0.OooO00o);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof zb0)) {
                yb0 yb0Var2 = new yb0();
                yb0Var2.OooO0Oo = strongBinder2;
                zb0Var = yb0Var2;
            } else {
                zb0Var = (zb0) iInterfaceQueryLocalInterface2;
            }
        }
        String string = parcel.readString();
        zb0Var.getClass();
        int i4 = 0;
        if (string != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.OooO0Oo;
            synchronized (multiInstanceInvalidationService2.OooO0o) {
                try {
                    int i5 = multiInstanceInvalidationService2.OooO0Oo + 1;
                    multiInstanceInvalidationService2.OooO0Oo = i5;
                    if (multiInstanceInvalidationService2.OooO0o.register(zb0Var, Integer.valueOf(i5))) {
                        multiInstanceInvalidationService2.OooO0o0.put(Integer.valueOf(i5), string);
                        i4 = i5;
                    } else {
                        multiInstanceInvalidationService2.OooO0Oo--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i4);
        return true;
    }
}

package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t42 extends l12 implements f52 {
    public final s42 o00oOoo(ey0 ey0Var, l42 l42Var) {
        s42 s42Var;
        Parcel parcelO00 = o00();
        int i = fb2.OooO00o;
        parcelO00.writeStrongBinder(ey0Var);
        parcelO00.writeInt(1);
        l42Var.writeToParcel(parcelO00, 0);
        Parcel parcelO00O0000 = o00O0000(1, parcelO00);
        IBinder strongBinder = parcelO00O0000.readStrongBinder();
        if (strongBinder == null) {
            s42Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            s42Var = iInterfaceQueryLocalInterface instanceof s42 ? (s42) iInterfaceQueryLocalInterface : new s42(2, strongBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
        }
        parcelO00O0000.recycle();
        return s42Var;
    }
}

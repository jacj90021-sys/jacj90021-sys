package com.cmaster.cloner;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v43 implements jz2 {
    public boolean OooO00o;
    public final Context OooO0O0;
    public final l42 OooO0OO;
    public final ic3 OooO0Oo;
    public s42 OooO0o0;

    public v43(Context context, a6 a6Var, ic3 ic3Var) {
        l42 l42Var = new l42();
        this.OooO0OO = l42Var;
        this.OooO0O0 = context;
        l42Var.OooO0Oo = 0;
        this.OooO0Oo = ic3Var;
    }

    @Override // com.cmaster.cloner.jz2
    public final ArrayList OooO00o(ug0 ug0Var) throws bu0 {
        s93[] s93VarArr;
        if (this.OooO0o0 == null) {
            zzc();
        }
        s42 s42Var = this.OooO0o0;
        if (s42Var == null) {
            throw new bu0("Error initializing the legacy barcode scanner.", 14);
        }
        i52 i52Var = new i52(ug0Var.OooO0OO, ug0Var.OooO0Oo, 0, 0L, wo2.OooO00o(ug0Var.OooO0o0));
        try {
            int i = ug0Var.OooO0o;
            if (i == -1) {
                ey0 ey0Var = new ey0(ug0Var.OooO00o);
                Parcel parcelO00 = s42Var.o00();
                int i2 = fb2.OooO00o;
                parcelO00.writeStrongBinder(ey0Var);
                parcelO00.writeInt(1);
                i52Var.writeToParcel(parcelO00, 0);
                Parcel parcelO00O0000 = s42Var.o00O0000(2, parcelO00);
                s93VarArr = (s93[]) parcelO00O0000.createTypedArray(s93.CREATOR);
                parcelO00O0000.recycle();
            } else if (i == 17) {
                ey0 ey0Var2 = new ey0(ug0Var.OooO0O0);
                Parcel parcelO002 = s42Var.o00();
                int i3 = fb2.OooO00o;
                parcelO002.writeStrongBinder(ey0Var2);
                parcelO002.writeInt(1);
                i52Var.writeToParcel(parcelO002, 0);
                Parcel parcelO00O00002 = s42Var.o00O0000(1, parcelO002);
                s93VarArr = (s93[]) parcelO00O00002.createTypedArray(s93.CREATOR);
                parcelO00O00002.recycle();
            } else {
                if (i == 35) {
                    by2.OooO0oo(null);
                    throw null;
                }
                if (i != 842094169) {
                    throw new bu0("Unsupported image format: " + ug0Var.OooO0o, 3);
                }
                ey0 ey0Var3 = new ey0(wt2.OooO00o(ug0Var));
                Parcel parcelO003 = s42Var.o00();
                int i4 = fb2.OooO00o;
                parcelO003.writeStrongBinder(ey0Var3);
                parcelO003.writeInt(1);
                i52Var.writeToParcel(parcelO003, 0);
                Parcel parcelO00O00003 = s42Var.o00O0000(1, parcelO003);
                s93VarArr = (s93[]) parcelO00O00003.createTypedArray(s93.CREATOR);
                parcelO00O00003.recycle();
            }
            ArrayList arrayList = new ArrayList();
            for (s93 s93Var : s93VarArr) {
                arrayList.add(new x5(new vk1(s93Var, 14)));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new bu0("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // com.cmaster.cloner.jz2
    public final void zzb() {
        s42 s42Var = this.OooO0o0;
        if (s42Var != null) {
            try {
                s42Var.o0O0ooO(3, s42Var.o00());
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.OooO0o0 = null;
        }
    }

    @Override // com.cmaster.cloner.jz2
    public final boolean zzc() throws bu0 {
        f52 t42Var;
        Context context = this.OooO0O0;
        if (this.OooO0o0 != null) {
            return false;
        }
        try {
            IBinder iBinderOooO0O0 = fu.OooO0OO(context, fu.OooO0O0, "com.google.android.gms.vision.dynamite").OooO0O0("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
            int i = z42.OooO0o0;
            if (iBinderOooO0O0 == null) {
                t42Var = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderOooO0O0.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                t42Var = iInterfaceQueryLocalInterface instanceof f52 ? (f52) iInterfaceQueryLocalInterface : new t42(2, iBinderOooO0O0, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
            }
            s42 s42VarO00oOoo = ((t42) t42Var).o00oOoo(new ey0(context), this.OooO0OO);
            this.OooO0o0 = s42VarO00oOoo;
            ic3 ic3Var = this.OooO0Oo;
            if (s42VarO00oOoo == null && !this.OooO00o) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                iz[] izVarArr = vz0.OooO00o;
                v32 v32Var = d42.OooO0oO;
                Object[] objArr = {"barcode"};
                z63.OooO00o(1, objArr);
                vz0.OooO00o(context, new y42(objArr, 1));
                this.OooO00o = true;
                z62.OooO0O0(ic3Var, e63.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new bu0("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            z62.OooO0O0(ic3Var, e63.NO_ERROR);
            return false;
        } catch (RemoteException e) {
            throw new bu0("Failed to create legacy barcode detector.", e);
        } catch (bu e2) {
            throw new bu0("Failed to load deprecated vision dynamite module.", e2);
        }
    }
}

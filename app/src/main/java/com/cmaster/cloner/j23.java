package com.cmaster.cloner;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j23 implements jz2 {
    public static final qf2 OooO0oo;
    public boolean OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;
    public final Context OooO0Oo;
    public final ic3 OooO0o;
    public final a6 OooO0o0;
    public md3 OooO0oO;

    static {
        dd2 dd2Var = ld2.OooO0o0;
        Object[] objArr = {"com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite"};
        s73.OooO00o(2, objArr);
        OooO0oo = new qf2(objArr, 2);
    }

    public j23(Context context, a6 a6Var, ic3 ic3Var) {
        this.OooO0Oo = context;
        this.OooO0o0 = a6Var;
        this.OooO0o = ic3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[LOOP:0: B:29:0x00ca->B:30:0x00cc, LOOP_END] */
    @Override // com.cmaster.cloner.jz2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList OooO00o(com.cmaster.cloner.ug0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.j23.OooO00o(com.cmaster.cloner.ug0):java.util.ArrayList");
    }

    public final md3 OooO0O0(eu euVar, String str, String str2) throws bu {
        IInterface nd3Var;
        Context context = this.OooO0Oo;
        IBinder iBinderOooO0O0 = fu.OooO0OO(context, euVar, str).OooO0O0(str2);
        int i = od3.OooO0o0;
        md3 md3Var = null;
        if (iBinderOooO0O0 == null) {
            nd3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinderOooO0O0.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
            nd3Var = iInterfaceQueryLocalInterface instanceof pd3 ? (pd3) iInterfaceQueryLocalInterface : new nd3(2, iBinderOooO0O0, "com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
        }
        ey0 ey0Var = new ey0(context);
        int i2 = this.OooO0o0.OooO00o != null ? 1 : 0;
        nd3 nd3Var2 = (nd3) nd3Var;
        Parcel parcelO00 = nd3Var2.o00();
        int i3 = fb2.OooO00o;
        parcelO00.writeStrongBinder(ey0Var);
        parcelO00.writeInt(1);
        int iOooOO0 = m33.OooOO0(20293, parcelO00);
        m33.OooOO0o(parcelO00, 1, 4);
        parcelO00.writeInt(0);
        m33.OooOO0o(parcelO00, 2, 4);
        parcelO00.writeInt(i2);
        m33.OooOO0O(iOooOO0, parcelO00);
        Parcel parcelO00O0000 = nd3Var2.o00O0000(1, parcelO00);
        IBinder strongBinder = parcelO00O0000.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
            md3Var = iInterfaceQueryLocalInterface2 instanceof md3 ? (md3) iInterfaceQueryLocalInterface2 : new md3(2, strongBinder, "com.google.mlkit.vision.barcode.aidls.IBarcodeScanner");
        }
        parcelO00O0000.recycle();
        return md3Var;
    }

    @Override // com.cmaster.cloner.jz2
    public final void zzb() {
        md3 md3Var = this.OooO0oO;
        if (md3Var != null) {
            try {
                md3Var.o0O0ooO(2, md3Var.o00());
            } catch (RemoteException e) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e);
            }
            this.OooO0oO = null;
            this.OooO00o = false;
        }
    }

    @Override // com.cmaster.cloner.jz2
    public final boolean zzc() throws Throwable {
        if (this.OooO0oO != null) {
            return this.OooO0O0;
        }
        Context context = this.OooO0Oo;
        int iOooO00o = fu.OooO00o(context, "com.google.mlkit.dynamite.barcode");
        ic3 ic3Var = this.OooO0o;
        if (iOooO00o > 0) {
            this.OooO0O0 = true;
            try {
                this.OooO0oO = OooO0O0(fu.OooO0OO, "com.google.mlkit.dynamite.barcode", "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e) {
                throw new bu0("Failed to create thick barcode scanner.", e);
            } catch (bu e2) {
                throw new bu0("Failed to load the bundled barcode module.", e2);
            }
        } else {
            boolean z = false;
            this.OooO0O0 = false;
            iz[] izVarArr = vz0.OooO00o;
            e60.OooO0O0.getClass();
            int iOooO00o2 = e60.OooO00o(context);
            qf2 qf2Var = OooO0oo;
            if (iOooO00o2 >= 221500000) {
                try {
                    ac3 ac3VarOooO0Oo = new s22(context, s22.OooOOO0, oOO0000.OooO00o, a60.OooO0O0).OooO0Oo(new i23(vz0.OooO0O0(vz0.OooO0Oo, qf2Var), 1));
                    qc3 qc3Var = new qc3(17);
                    ac3VarOooO0Oo.getClass();
                    ac3VarOooO0Oo.OooO00o(am1.OooO00o, qc3Var);
                    z = ((mu0) m43.OooO00o(ac3VarOooO0Oo)).OooO0Oo;
                } catch (InterruptedException | ExecutionException e3) {
                    Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e3);
                }
            } else {
                try {
                    dd2 dd2VarListIterator = qf2Var.listIterator(0);
                    while (dd2VarListIterator.hasNext()) {
                        fu.OooO0OO(context, fu.OooO0O0, (String) dd2VarListIterator.next());
                    }
                    z = true;
                } catch (bu unused) {
                }
            }
            if (!z) {
                if (!this.OooO0OO) {
                    Object[] objArr = {"barcode", "tflite_dynamite"};
                    s73.OooO00o(2, objArr);
                    vz0.OooO00o(context, new qf2(objArr, 2));
                    this.OooO0OO = true;
                }
                z62.OooO0O0(ic3Var, e63.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new bu0("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.OooO0oO = OooO0O0(fu.OooO0O0, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | bu e4) {
                z62.OooO0O0(ic3Var, e63.OPTIONAL_MODULE_INIT_ERROR);
                throw new bu0("Failed to create thin barcode scanner.", e4);
            }
        }
        z62.OooO0O0(ic3Var, e63.NO_ERROR);
        return this.OooO0O0;
    }
}

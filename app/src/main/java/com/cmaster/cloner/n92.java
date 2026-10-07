package com.cmaster.cloner;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayu;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class n92 extends zzayu implements r92 {
    public n92() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            kz2 kz2Var = (kz2) zzayv.zza(parcel, kz2.CREATOR);
            zzayv.zzd(parcel);
            zzg(kz2Var);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String strZze = zze();
            parcel2.writeNoException();
            parcel2.writeString(strZze);
            return true;
        }
        if (i == 3) {
            boolean zZzi = zzi();
            parcel2.writeNoException();
            int i3 = zzayv.zza;
            parcel2.writeInt(zZzi ? 1 : 0);
            return true;
        }
        if (i == 4) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
            return true;
        }
        if (i != 5) {
            return false;
        }
        kz2 kz2Var2 = (kz2) zzayv.zza(parcel, kz2.CREATOR);
        int i4 = parcel.readInt();
        zzayv.zzd(parcel);
        zzh(kz2Var2, i4);
        parcel2.writeNoException();
        return true;
    }
}

package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayu;
import com.google.android.gms.internal.ads.zzayv;
import com.google.android.gms.internal.ads.zzbge;
import com.google.android.gms.internal.ads.zzbhm;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbhp;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhs;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbic;
import com.google.android.gms.internal.ads.zzbid;
import com.google.android.gms.internal.ads.zzbmp;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmy;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class z92 extends zzayu implements da2 {
    public z92() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) {
        u82 m82Var = null;
        nd2 nd2Var = null;
        switch (i) {
            case 1:
                r92 r92VarZze = zze();
                parcel2.writeNoException();
                zzayv.zzg(parcel2, r92VarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    m82Var = iInterfaceQueryLocalInterface instanceof u82 ? (u82) iInterfaceQueryLocalInterface : new m82(strongBinder);
                }
                zzayv.zzd(parcel);
                zzl(m82Var);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbhn zzbhnVarZzb = zzbhm.zzb(parcel.readStrongBinder());
                zzayv.zzd(parcel);
                zzf(zzbhnVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbhq zzbhqVarZzb = zzbhp.zzb(parcel.readStrongBinder());
                zzayv.zzd(parcel);
                zzg(zzbhqVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhw zzbhwVarZzb = zzbhv.zzb(parcel.readStrongBinder());
                zzbht zzbhtVarZzb = zzbhs.zzb(parcel.readStrongBinder());
                zzayv.zzd(parcel);
                zzh(string, zzbhwVarZzb, zzbhtVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbge zzbgeVar = (zzbge) zzayv.zza(parcel, zzbge.CREATOR);
                zzayv.zzd(parcel);
                zzo(zzbgeVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    nd2Var = iInterfaceQueryLocalInterface2 instanceof nd2 ? (nd2) iInterfaceQueryLocalInterface2 : new nd2(strongBinder2);
                }
                zzayv.zzd(parcel);
                zzq(nd2Var);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbia zzbiaVarZzb = zzbhz.zzb(parcel.readStrongBinder());
                w53 w53Var = (w53) zzayv.zza(parcel, w53.CREATOR);
                zzayv.zzd(parcel);
                zzj(zzbiaVarZzb, w53Var);
                parcel2.writeNoException();
                return true;
            case 9:
                v51 v51Var = (v51) zzayv.zza(parcel, v51.CREATOR);
                zzayv.zzd(parcel);
                zzp(v51Var);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbid zzbidVarZzb = zzbic.zzb(parcel.readStrongBinder());
                zzayv.zzd(parcel);
                zzk(zzbidVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmp zzbmpVar = (zzbmp) zzayv.zza(parcel, zzbmp.CREATOR);
                zzayv.zzd(parcel);
                zzn(zzbmpVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmy zzbmyVarZzb = zzbmx.zzb(parcel.readStrongBinder());
                zzayv.zzd(parcel);
                zzi(zzbmyVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                oO00000o oo00000o = (oO00000o) zzayv.zza(parcel, oO00000o.CREATOR);
                zzayv.zzd(parcel);
                zzm(oo00000o);
                parcel2.writeNoException();
                return true;
        }
    }
}

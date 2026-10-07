package com.cmaster.cloner;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzayu;
import com.google.android.gms.internal.ads.zzayv;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yf2 extends zzayu implements cg2 {
    public yf2() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzayu
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        th2 th2Var = (th2) zzayv.zza(parcel, th2.CREATOR);
        zzayv.zzd(parcel);
        zze(th2Var);
        parcel2.writeNoException();
        return true;
    }
}

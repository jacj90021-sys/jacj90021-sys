package com.cmaster.cloner;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ne2 extends q12 {
    public final int OooO0o;
    public m6 OooO0o0;

    public ne2(m6 m6Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.OooO0o0 = m6Var;
        this.OooO0o = i;
    }

    @Override // com.cmaster.cloner.q12
    public final boolean o00(int i, Parcel parcel, Parcel parcel2) {
        int i2 = this.OooO0o;
        if (i == 1) {
            int i3 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) eb2.OooO00o(parcel, Bundle.CREATOR);
            eb2.OooO0O0(parcel);
            by2.OooO(this.OooO0o0, "onPostInitComplete can be called only once per call to getRemoteService");
            this.OooO0o0.onPostInitHandler(i3, strongBinder, bundle, i2);
            this.OooO0o0 = null;
        } else if (i == 2) {
            parcel.readInt();
            eb2.OooO0O0(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            cv2 cv2Var = (cv2) eb2.OooO00o(parcel, cv2.CREATOR);
            eb2.OooO0O0(parcel);
            m6 m6Var = this.OooO0o0;
            by2.OooO(m6Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            by2.OooO0oo(cv2Var);
            m6.zzj(m6Var, cv2Var);
            Bundle bundle2 = cv2Var.OooO0Oo;
            by2.OooO(this.OooO0o0, "onPostInitComplete can be called only once per call to getRemoteService");
            this.OooO0o0.onPostInitHandler(i4, strongBinder2, bundle2, i2);
            this.OooO0o0 = null;
        }
        parcel2.writeNoException();
        return true;
    }
}

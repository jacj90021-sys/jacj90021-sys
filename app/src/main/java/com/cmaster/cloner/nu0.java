package com.cmaster.cloner;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nu0 extends o00000OO {
    public static final Parcelable.Creator<nu0> CREATOR = new b41(17);
    public final PendingIntent OooO0Oo;

    public nu0(PendingIntent pendingIntent) {
        this.OooO0Oo = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0Oo(parcel, 1, this.OooO0Oo, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

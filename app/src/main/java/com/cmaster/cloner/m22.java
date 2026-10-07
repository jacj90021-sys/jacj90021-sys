package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class m22 extends o00000OO {
    public static final Parcelable.Creator<m22> CREATOR = new b41(22);
    public final List OooO0Oo;
    public final String OooO0o0;

    public m22(ArrayList arrayList, String str) {
        this.OooO0Oo = arrayList;
        this.OooO0o0 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0oO(parcel, this.OooO0Oo, 1);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

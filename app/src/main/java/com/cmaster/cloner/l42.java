package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l42 extends o00000OO {
    public static final Parcelable.Creator<l42> CREATOR = new n32(6);
    public int OooO0Oo;
    public boolean OooO0o0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l42)) {
            return false;
        }
        l42 l42Var = (l42) obj;
        return this.OooO0Oo == l42Var.OooO0Oo && uw2.OooO00o(Boolean.valueOf(this.OooO0o0), Boolean.valueOf(l42Var.OooO0o0));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0Oo), Boolean.valueOf(this.OooO0o0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        int i2 = this.OooO0Oo;
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.OooO0o0;
        m33.OooOO0o(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

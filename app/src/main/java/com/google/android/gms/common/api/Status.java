package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.cmaster.cloner.gh;
import com.cmaster.cloner.m33;
import com.cmaster.cloner.n32;
import com.cmaster.cloner.o00000OO;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.uw2;
import com.cmaster.cloner.yo2;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class Status extends o00000OO implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new n32(10);
    public final int OooO0Oo;
    public final PendingIntent OooO0o;
    public final String OooO0o0;
    public final gh OooO0oO;

    public Status(int i, String str, PendingIntent pendingIntent, gh ghVar) {
        this.OooO0Oo = i;
        this.OooO0o0 = str;
        this.OooO0o = pendingIntent;
        this.OooO0oO = ghVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.OooO0Oo == status.OooO0Oo && uw2.OooO00o(this.OooO0o0, status.OooO0o0) && uw2.OooO00o(this.OooO0o, status.OooO0o) && uw2.OooO00o(this.OooO0oO, status.OooO0oO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0Oo), this.OooO0o0, this.OooO0o, this.OooO0oO});
    }

    public final String toString() {
        o0O000O o0o000o = new o0O000O(this);
        String strOooO00o = this.OooO0o0;
        if (strOooO00o == null) {
            strOooO00o = yo2.OooO00o(this.OooO0Oo);
        }
        o0o000o.OooO00o(strOooO00o, "statusCode");
        o0o000o.OooO00o(this.OooO0o, "resolution");
        return o0o000o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooO0Oo(parcel, 4, this.OooO0oO, i);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

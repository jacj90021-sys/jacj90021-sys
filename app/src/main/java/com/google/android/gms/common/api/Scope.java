package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.cmaster.cloner.b41;
import com.cmaster.cloner.by2;
import com.cmaster.cloner.m33;
import com.cmaster.cloner.o00000OO;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class Scope extends o00000OO implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new b41(28);
    public final int OooO0Oo;
    public final String OooO0o0;

    public Scope(int i, String str) {
        by2.OooO0o(str, "scopeUri must not be null or empty");
        this.OooO0Oo = i;
        this.OooO0o0 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.OooO0o0.equals(((Scope) obj).OooO0o0);
    }

    public final int hashCode() {
        return this.OooO0o0.hashCode();
    }

    public final String toString() {
        return this.OooO0o0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iz extends o00000OO {
    public static final Parcelable.Creator<iz> CREATOR = new n32(14);
    public final String OooO0Oo;
    public final long OooO0o;
    public final int OooO0o0;

    public iz(String str, long j) {
        this.OooO0Oo = str;
        this.OooO0o = j;
        this.OooO0o0 = -1;
    }

    public final long OooO00o() {
        long j = this.OooO0o;
        return j == -1 ? this.OooO0o0 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iz) {
            iz izVar = (iz) obj;
            String str = izVar.OooO0Oo;
            String str2 = this.OooO0Oo;
            if (((str2 != null && str2.equals(str)) || (str2 == null && str == null)) && OooO00o() == izVar.OooO00o()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.OooO0Oo, Long.valueOf(OooO00o())});
    }

    public final String toString() {
        o0O000O o0o000o = new o0O000O(this);
        o0o000o.OooO00o(this.OooO0Oo, "name");
        o0o000o.OooO00o(Long.valueOf(OooO00o()), "version");
        return o0o000o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooO0o0(parcel, 1, this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0);
        long jOooO00o = OooO00o();
        m33.OooOO0o(parcel, 3, 8);
        parcel.writeLong(jOooO00o);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public iz(int i, long j, String str) {
        this.OooO0Oo = str;
        this.OooO0o0 = i;
        this.OooO0o = j;
    }
}

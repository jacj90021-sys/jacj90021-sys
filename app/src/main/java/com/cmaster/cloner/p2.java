package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class p2 implements Parcelable {
    public static final Parcelable.Creator<p2> CREATOR = new o0O0000O(4);
    public int OooO;
    public IBinder OooO0Oo;
    public List OooO0o = null;
    public ApplicationInfo OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public String OooOO0O;
    public String OooOO0o;
    public String OooOOO;
    public String OooOOO0;
    public int OooOOOO;

    public p2(b51 b51Var, int i) {
        this.OooO0Oo = b51Var.OooOOoo;
        this.OooO0o0 = b51Var.OooO0Oo;
        this.OooO0oO = b51Var.OooO0o0;
        this.OooO0oo = b51Var.OooO0oO;
        this.OooOO0O = b51Var.OooOO0O;
        c21 c21Var = b51Var.OooOo00;
        String strOooO0O0 = c21Var.OooOOoo.OooO0O0();
        this.OooOO0o = strOooO0O0;
        this.OooOOO0 = strOooO0O0;
        pq pqVar = (pq) pq.OooO0O0.OooO0O0();
        pqVar.OooO00o();
        this.OooOOO = pqVar.OooO00o.OooO0OO.getName();
        this.OooO = i;
        this.OooOO0 = b51Var.OooOOO0;
        this.OooOOOO = c21Var.OooOOoo.OooO0o0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.OooO0Oo);
        parcel.writeParcelable(this.OooO0o0, i);
        parcel.writeTypedList(this.OooO0o);
        parcel.writeInt(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeInt(this.OooO);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
        parcel.writeString(this.OooOO0O);
        parcel.writeString(this.OooOO0o);
        parcel.writeString(this.OooOOO0);
        parcel.writeString(this.OooOOO);
        parcel.writeInt(this.OooOOOO);
    }
}

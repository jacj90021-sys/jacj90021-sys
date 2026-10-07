package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class th2 extends o00000OO {
    public static final Parcelable.Creator<th2> CREATOR = new n32(19);
    public final int OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public th2 OooO0oO;
    public IBinder OooO0oo;

    public th2(int i, String str, String str2, th2 th2Var, IBinder iBinder) {
        this.OooO0Oo = i;
        this.OooO0o0 = str;
        this.OooO0o = str2;
        this.OooO0oO = th2Var;
        this.OooO0oo = iBinder;
    }

    public final o0OOO0OO OooO00o() {
        th2 th2Var = this.OooO0oO;
        o0OOO0OO o0ooo0oo = null;
        if (th2Var != null) {
            String str = th2Var.OooO0o;
            o0ooo0oo = new o0OOO0OO(th2Var.OooO0Oo, th2Var.OooO0o0, str, null);
        }
        return new o0OOO0OO(this.OooO0Oo, this.OooO0o0, this.OooO0o, o0ooo0oo);
    }

    public final xn0 OooO0O0() {
        o0OOO0OO o0ooo0oo;
        yh2 bh2Var;
        th2 th2Var = this.OooO0oO;
        if (th2Var == null) {
            o0ooo0oo = null;
        } else {
            o0ooo0oo = new o0OOO0OO(th2Var.OooO0Oo, th2Var.OooO0o0, th2Var.OooO0o, null);
        }
        IBinder iBinder = this.OooO0oo;
        if (iBinder == null) {
            bh2Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            bh2Var = iInterfaceQueryLocalInterface instanceof yh2 ? (yh2) iInterfaceQueryLocalInterface : new bh2(iBinder);
        }
        return new xn0(this.OooO0Oo, this.OooO0o0, this.OooO0o, o0ooo0oo, bh2Var != null ? new ya1(bh2Var) : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0o0(parcel, 2, this.OooO0o0);
        m33.OooO0o0(parcel, 3, this.OooO0o);
        m33.OooO0Oo(parcel, 4, this.OooO0oO, i);
        m33.OooO0OO(parcel, 5, this.OooO0oo);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

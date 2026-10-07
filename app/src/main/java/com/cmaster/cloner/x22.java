package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x22 extends o00000OO {
    public static final Parcelable.Creator<x22> CREATOR = new b41(27);
    public final int OooO0Oo;
    public final gh OooO0o;
    public final IBinder OooO0o0;
    public final boolean OooO0oO;
    public final boolean OooO0oo;

    public x22(int i, IBinder iBinder, gh ghVar, boolean z, boolean z2) {
        this.OooO0Oo = i;
        this.OooO0o0 = iBinder;
        this.OooO0o = ghVar;
        this.OooO0oO = z;
        this.OooO0oo = z2;
    }

    public final boolean equals(Object obj) {
        Object yb3Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof x22)) {
                return false;
            }
            x22 x22Var = (x22) obj;
            if (!this.OooO0o.equals(x22Var.OooO0o)) {
                return false;
            }
            Object yb3Var2 = null;
            IBinder iBinder = this.OooO0o0;
            if (iBinder == null) {
                yb3Var = null;
            } else {
                int i = o00O0000.OooO0o0;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                yb3Var = iInterfaceQueryLocalInterface instanceof w80 ? (w80) iInterfaceQueryLocalInterface : new yb3(1, iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            IBinder iBinder2 = x22Var.OooO0o0;
            if (iBinder2 != null) {
                int i2 = o00O0000.OooO0o0;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                yb3Var2 = iInterfaceQueryLocalInterface2 instanceof w80 ? (w80) iInterfaceQueryLocalInterface2 : new yb3(1, iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            if (!uw2.OooO00o(yb3Var, yb3Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooO0OO(parcel, 2, this.OooO0o0);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooOO0o(parcel, 4, 4);
        parcel.writeInt(this.OooO0oO ? 1 : 0);
        m33.OooOO0o(parcel, 5, 4);
        parcel.writeInt(this.OooO0oo ? 1 : 0);
        m33.OooOO0O(iOooOO0, parcel);
    }
}

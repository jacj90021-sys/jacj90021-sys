package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class q20 implements Parcelable {
    public static final Parcelable.Creator<q20> CREATOR = new o0O0000O(16);
    public final String OooO;
    public final String OooO0Oo;
    public final boolean OooO0o;
    public final String OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;
    public final boolean OooOO0;
    public final boolean OooOO0O;
    public final boolean OooOO0o;
    public final boolean OooOOO;
    public final Bundle OooOOO0;
    public final int OooOOOO;
    public Bundle OooOOOo;

    public q20(Parcel parcel) {
        this.OooO0Oo = parcel.readString();
        this.OooO0o0 = parcel.readString();
        this.OooO0o = parcel.readInt() != 0;
        this.OooO0oO = parcel.readInt();
        this.OooO0oo = parcel.readInt();
        this.OooO = parcel.readString();
        this.OooOO0 = parcel.readInt() != 0;
        this.OooOO0O = parcel.readInt() != 0;
        this.OooOO0o = parcel.readInt() != 0;
        this.OooOOO0 = parcel.readBundle();
        this.OooOOO = parcel.readInt() != 0;
        this.OooOOOo = parcel.readBundle();
        this.OooOOOO = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.OooO0Oo);
        sb.append(" (");
        sb.append(this.OooO0o0);
        sb.append(")}:");
        if (this.OooO0o) {
            sb.append(" fromLayout");
        }
        int i = this.OooO0oo;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.OooO;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.OooOO0) {
            sb.append(" retainInstance");
        }
        if (this.OooOO0O) {
            sb.append(" removing");
        }
        if (this.OooOO0o) {
            sb.append(" detached");
        }
        if (this.OooOOO) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.OooO0Oo);
        parcel.writeString(this.OooO0o0);
        parcel.writeInt(this.OooO0o ? 1 : 0);
        parcel.writeInt(this.OooO0oO);
        parcel.writeInt(this.OooO0oo);
        parcel.writeString(this.OooO);
        parcel.writeInt(this.OooOO0 ? 1 : 0);
        parcel.writeInt(this.OooOO0O ? 1 : 0);
        parcel.writeInt(this.OooOO0o ? 1 : 0);
        parcel.writeBundle(this.OooOOO0);
        parcel.writeInt(this.OooOOO ? 1 : 0);
        parcel.writeBundle(this.OooOOOo);
        parcel.writeInt(this.OooOOOO);
    }

    public q20(o10 o10Var) {
        this.OooO0Oo = o10Var.getClass().getName();
        this.OooO0o0 = o10Var.OooO0oo;
        this.OooO0o = o10Var.OooOOOo;
        this.OooO0oO = o10Var.OooOoO0;
        this.OooO0oo = o10Var.OooOoO;
        this.OooO = o10Var.OooOoOO;
        this.OooOO0 = o10Var.OooOooO;
        this.OooOO0O = o10Var.OooOOOO;
        this.OooOO0o = o10Var.OooOoo;
        this.OooOOO0 = o10Var.OooO;
        this.OooOOO = o10Var.OooOoo0;
        this.OooOOOO = o10Var.OoooO00.ordinal();
    }
}

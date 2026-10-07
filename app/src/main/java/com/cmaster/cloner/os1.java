package com.cmaster.cloner;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class os1 extends ns1 {
    public int OooO;
    public final SparseIntArray OooO0Oo;
    public final int OooO0o;
    public final Parcel OooO0o0;
    public final int OooO0oO;
    public final String OooO0oo;
    public int OooOO0;
    public int OooOO0O;

    public os1(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new k3(0), new k3(0), new k3(0));
    }

    @Override // com.cmaster.cloner.ns1
    public final os1 OooO00o() {
        Parcel parcel = this.OooO0o0;
        int iDataPosition = parcel.dataPosition();
        int i = this.OooOO0;
        if (i == this.OooO0o) {
            i = this.OooO0oO;
        }
        return new os1(parcel, iDataPosition, i, rj.OooO0oO(new StringBuilder(), this.OooO0oo, "  "), this.OooO00o, this.OooO0O0, this.OooO0OO);
    }

    @Override // com.cmaster.cloner.ns1
    public final boolean OooO0o0(int i) {
        while (true) {
            int i2 = this.OooOO0;
            int i3 = this.OooOO0O;
            if (i2 >= this.OooO0oO) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.OooOO0;
            Parcel parcel = this.OooO0o0;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.OooOO0O = parcel.readInt();
            this.OooOO0 += i5;
        }
    }

    @Override // com.cmaster.cloner.ns1
    public final void OooO0oo(int i) {
        int i2 = this.OooO;
        SparseIntArray sparseIntArray = this.OooO0Oo;
        Parcel parcel = this.OooO0o0;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(iDataPosition - i3);
            parcel.setDataPosition(iDataPosition);
        }
        this.OooO = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public os1(Parcel parcel, int i, int i2, String str, k3 k3Var, k3 k3Var2, k3 k3Var3) {
        super(k3Var, k3Var2, k3Var3);
        this.OooO0Oo = new SparseIntArray();
        this.OooO = -1;
        this.OooOO0O = -1;
        this.OooO0o0 = parcel;
        this.OooO0o = i;
        this.OooO0oO = i2;
        this.OooOO0 = i;
        this.OooO0oo = str;
    }
}

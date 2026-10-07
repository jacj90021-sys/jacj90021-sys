package com.google.android.material.appbar;

import android.os.Parcel;
import android.os.Parcelable;
import com.cmaster.cloner.OooO;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO0o extends OooO {
    public static final Parcelable.Creator<OooO0o> CREATOR = new OooO0OO();
    public float OooO;
    public boolean OooO0o;
    public boolean OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;

    public OooO0o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.OooO0o = parcel.readByte() != 0;
        this.OooO0oO = parcel.readByte() != 0;
        this.OooO0oo = parcel.readInt();
        this.OooO = parcel.readFloat();
        this.OooOO0 = parcel.readByte() != 0;
    }

    @Override // com.cmaster.cloner.OooO, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.OooO0oo);
        parcel.writeFloat(this.OooO);
        parcel.writeByte(this.OooOO0 ? (byte) 1 : (byte) 0);
    }
}

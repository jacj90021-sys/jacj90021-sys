package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i01 implements Parcelable {
    public static final Parcelable.Creator<i01> CREATOR;
    public long OooO0Oo;

    @Override // android.os.Parcelable
    public final native int describeContents();

    public final native String toString();

    @Override // android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i);

    static {
        DexUtils.classesInit0(53);
        CREATOR = new o0O0000O(27);
    }
}

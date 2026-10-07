package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class kr1 implements Parcelable, vk0 {
    public static final Parcelable.Creator<kr1> CREATOR;
    public long OooO;
    public int OooO0Oo;
    public String OooO0o;
    public int OooO0o0;
    public String OooO0oO;
    public int OooO0oo;

    @Override // com.cmaster.cloner.vk0
    public final native void OooO00o(JSONObject jSONObject);

    public final native boolean OooO0O0();

    @Override // android.os.Parcelable
    public final native int describeContents();

    public final native String toString();

    @Override // android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i);

    static {
        DexUtils.classesInit0(54);
        CREATOR = new b41(11);
    }
}

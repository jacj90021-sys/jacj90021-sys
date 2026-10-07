package com.cmaster.cloner;

import android.content.pm.ComponentInfo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g21 implements Parcelable, vk0 {
    public static final Parcelable.Creator<g21> CREATOR;
    public String OooOO0O;
    public int OooOO0 = -1;
    public boolean OooO0Oo = false;
    public boolean OooO0o0 = false;
    public boolean OooO0o = true;
    public boolean OooO0oO = false;
    public int OooO0oo = 0;
    public boolean OooO = false;
    public HashSet OooOO0o = new HashSet();
    public HashSet OooOOO0 = new HashSet();

    @Override // com.cmaster.cloner.vk0
    public final native void OooO00o(JSONObject jSONObject);

    public final native boolean OooO0O0(int i);

    public final native boolean OooO0OO(ComponentInfo componentInfo, int i);

    @Override // android.os.Parcelable
    public final native int describeContents();

    public final native boolean equals(Object obj);

    public final native String toString();

    @Override // android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i);

    static {
        DexUtils.classesInit0(5);
        u7.OooO00o(new byte[]{-19, -19, 120, 80, 101, 51, -32, -112, -50, -23, 105, 104, 112, 53, -15, -96}, new byte[]{-67, -116, 27, 59, 4, 84, -123, -59});
        CREATOR = new o0O0000O(28);
    }
}

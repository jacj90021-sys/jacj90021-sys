package com.cmaster.cloner;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class aq extends ko0 {
    public final Bundle OooO0Oo;
    public final LinkedHashMap OooO0o0;
    public static final String OooO0o = u7.OooO00o(new byte[]{37}, new byte[]{20, -91, 99, 120, -63, -1, -76, 43});
    public static final String OooO0oO = u7.OooO00o(new byte[]{-30}, new byte[]{-46, 47, -13, -94, 58, -24, 87, -102});
    public static final aq OooO0oo = new aq();
    public static final Parcelable.Creator<aq> CREATOR = new o0O0000O(10);

    public aq(Parcel parcel) {
        Bundle bundle = parcel.readBundle();
        this.OooO0Oo = bundle;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            if (str.startsWith(u7.OooO00o(new byte[]{43, -42, 79}, new byte[]{89, -71, 97, 85, 80, 83, -118, 48}))) {
                linkedHashMap.put(str, bundle.getString(str));
            }
        }
        this.OooO0o0 = linkedHashMap;
    }

    public static final boolean OooO0Oo(String str) {
        return str.startsWith(u7.OooO00o(new byte[]{41, -81, -94}, new byte[]{91, -64, -116, -9, 22, 43, -25, 113}));
    }

    public final String OooO00o() {
        return this.OooO0Oo.getString(u7.OooO00o(new byte[]{-122, -112, 88, 35, 54, -18, -97, -56, -127, -100, 84, 35, 34, -7, -122, -59, -105, -102}, new byte[]{-12, -1, 32, 13, 70, -100, -16, -84}));
    }

    public final String OooO0O0() {
        return this.OooO0Oo.getString(u7.OooO00o(new byte[]{-13, 3, 27, 42, -5, 16, 44, 19, -12, 15, 23, 42, -30, 1, 32, 40, -14, 9, 17, 109, -22, 14}, new byte[]{-127, 108, 99, 4, -117, 98, 67, 119}));
    }

    public final boolean OooO0OO() {
        return this.OooO0Oo.getString(u7.OooO00o(new byte[]{101, 8, -72, 30, 95, 93}, new byte[]{0, 102, -39, 124, 51, 56, -7, 60}), OooO0oO).equals(OooO0o);
    }

    public final void OooO0o0(String str, String str2) {
        if (OooO0Oo(str)) {
            this.OooO0o0.put(str, str2);
        }
        this.OooO0Oo.putString(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Bundle bundle = this.OooO0Oo;
        bundle.size();
        return bundle.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.OooO0Oo);
    }

    public aq() {
        this.OooO0Oo = new Bundle();
        this.OooO0o0 = new LinkedHashMap();
    }
}

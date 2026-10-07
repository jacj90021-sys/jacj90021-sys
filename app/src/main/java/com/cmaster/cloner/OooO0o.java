package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class OooO0o implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ OooO0o(int i) {
        this.OooO00o = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.OooO00o) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return OooO.OooO0o0;
                }
                qa.OooO0o("superState must be null");
                return null;
            case 1:
                return new y8(parcel, classLoader);
            case 2:
                return new oc(parcel, classLoader);
            case 3:
                return new pj(parcel, classLoader);
            case 4:
                return new ey(parcel, classLoader);
            case 5:
                return new jq0(parcel, classLoader);
            case 6:
                return new r71(parcel, classLoader);
            case 7:
                return new fe1(parcel, classLoader);
            case 8:
                return new zg1(parcel, classLoader);
            case 9:
                return new pm1(parcel, classLoader);
            default:
                return new rn1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new OooO[i];
            case 1:
                return new y8[i];
            case 2:
                return new oc[i];
            case 3:
                return new pj[i];
            case 4:
                return new ey[i];
            case 5:
                return new jq0[i];
            case 6:
                return new r71[i];
            case 7:
                return new fe1[i];
            case 8:
                return new zg1[i];
            case 9:
                return new pm1[i];
            default:
                return new rn1[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.OooO00o) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return OooO.OooO0o0;
                }
                qa.OooO0o("superState must be null");
                return null;
            case 1:
                return new y8(parcel, null);
            case 2:
                return new oc(parcel, null);
            case 3:
                return new pj(parcel, null);
            case 4:
                return new ey(parcel, null);
            case 5:
                return new jq0(parcel, null);
            case 6:
                return new r71(parcel, null);
            case 7:
                return new fe1(parcel, null);
            case 8:
                return new zg1(parcel, null);
            case 9:
                return new pm1(parcel, null);
            default:
                return new rn1(parcel, null);
        }
    }
}

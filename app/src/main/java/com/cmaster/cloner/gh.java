package com.cmaster.cloner;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gh extends o00000OO {
    public final int OooO0Oo;
    public final PendingIntent OooO0o;
    public final int OooO0o0;
    public final String OooO0oO;
    public static final gh OooO0oo = new gh(0);
    public static final Parcelable.Creator<gh> CREATOR = new n32(9);

    public gh(int i, int i2, PendingIntent pendingIntent, String str) {
        this.OooO0Oo = i;
        this.OooO0o0 = i2;
        this.OooO0o = pendingIntent;
        this.OooO0oO = str;
    }

    public static String OooO00o(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case zzbcj.zzt.zzm /* 21 */:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return rj.OooO00o(i, "UNKNOWN_ERROR_CODE(", ")");
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gh)) {
            return false;
        }
        gh ghVar = (gh) obj;
        return this.OooO0o0 == ghVar.OooO0o0 && uw2.OooO00o(this.OooO0o, ghVar.OooO0o) && uw2.OooO00o(this.OooO0oO, ghVar.OooO0oO);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.OooO0o0), this.OooO0o, this.OooO0oO});
    }

    public final String toString() {
        o0O000O o0o000o = new o0O000O(this);
        o0o000o.OooO00o(OooO00o(this.OooO0o0), "statusCode");
        o0o000o.OooO00o(this.OooO0o, "resolution");
        o0o000o.OooO00o(this.OooO0oO, "message");
        return o0o000o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iOooOO0 = m33.OooOO0(20293, parcel);
        m33.OooOO0o(parcel, 1, 4);
        parcel.writeInt(this.OooO0Oo);
        m33.OooOO0o(parcel, 2, 4);
        parcel.writeInt(this.OooO0o0);
        m33.OooO0Oo(parcel, 3, this.OooO0o, i);
        m33.OooO0o0(parcel, 4, this.OooO0oO);
        m33.OooOO0O(iOooOO0, parcel);
    }

    public gh(int i) {
        this(1, i, null, null);
    }

    public gh(int i, PendingIntent pendingIntent) {
        this(1, i, pendingIntent, null);
    }
}

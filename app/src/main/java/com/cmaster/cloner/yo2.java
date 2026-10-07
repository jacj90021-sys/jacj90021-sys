package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class yo2 {
    public static String OooO00o(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return px0.OooOOO(i, "unknown status code: ");
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case zzbcj.zzt.zzm /* 21 */:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}

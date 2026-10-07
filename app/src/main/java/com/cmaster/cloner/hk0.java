package com.cmaster.cloner;

import android.app.job.JobParameters;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hk0 {
    public static final l81 OooO00o = l81.OooO0o(JobParameters.class, u7.OooO00o(new byte[]{-94, 24, 14, 105, 19, -124, -35, 65}, new byte[]{-63, 121, 98, 5, 113, -27, -66, 42}));
    public static final l81 OooO0O0;

    static {
        l81.OooO0o(JobParameters.class, u7.OooO00o(new byte[]{27, -25, -62, -111, -85, -62}, new byte[]{126, -97, -74, -29, -54, -79, -8, 40}));
        OooO0O0 = l81.OooO0o0(JobParameters.class, u7.OooO00o(new byte[]{57, -30, 90, -122, 85}, new byte[]{83, -115, 56, -49, 49, -100, -41, 75}));
        l81.OooO0o(JobParameters.class, u7.OooO00o(new byte[]{-126, 81, 89, -32, -125, -12, 60, 84, -126, 102, 64, -6, -126, -4, 42}, new byte[]{-10, 35, 56, -114, -16, -99, 89, 58}));
        l81.OooO0o(JobParameters.class, u7.OooO00o(new byte[]{-11, -78, -117, 126, 37, -84, -128, -53}, new byte[]{-106, -34, -30, 14, 97, -51, -12, -86}));
    }

    public static IBinder OooO00o(JobParameters jobParameters) {
        l81 l81Var = OooO00o;
        if (l81Var != null) {
            return (IBinder) l81Var.OooO0O0(jobParameters);
        }
        return null;
    }
}

package com.cmaster.cloner;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h70 {
    public static final boolean OooO0o;
    public static final boolean OooO0o0;
    public static final File OooO0oO;
    public static volatile h70 OooO0oo;
    public int OooO0O0;
    public boolean OooO0OO = true;
    public final AtomicBoolean OooO0Oo = new AtomicBoolean(false);
    public final int OooO00o = 20000;

    static {
        int i = Build.VERSION.SDK_INT;
        OooO0o0 = i < 29;
        OooO0o = i >= 28;
        OooO0oO = new File("/proc/self/fd");
    }

    public static h70 OooO00o() {
        if (OooO0oo == null) {
            synchronized (h70.class) {
                try {
                    if (OooO0oo == null) {
                        OooO0oo = new h70();
                    }
                } finally {
                }
            }
        }
        return OooO0oo;
    }

    public final int OooO0O0() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.OooO00o;
    }

    public final boolean OooO0OO(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (OooO0o) {
                if (!OooO0o0 || this.OooO0Oo.get()) {
                    if (z2) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.OooO0O0 + 1;
                                this.OooO0O0 = i3;
                                if (i3 >= 50) {
                                    this.OooO0O0 = 0;
                                    int length = OooO0oO.list().length;
                                    long jOooO0O0 = OooO0O0();
                                    boolean z4 = ((long) length) < jOooO0O0;
                                    this.OooO0OO = z4;
                                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jOooO0O0);
                                    }
                                }
                                z3 = this.OooO0OO;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}

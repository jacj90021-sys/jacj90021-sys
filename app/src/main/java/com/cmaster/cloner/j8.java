package com.cmaster.cloner;

import android.os.SystemClock;
import android.util.Log;
import java.util.LinkedList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class j8 {
    public static final o0O000O OooO0OO = new o0O000O("StreamingFormatChecker", "");
    public final LinkedList OooO00o = new LinkedList();
    public long OooO0O0 = -1;

    public final void OooO00o(ug0 ug0Var) {
        if (ug0Var.OooO0o != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long lValueOf = Long.valueOf(jElapsedRealtime);
        LinkedList linkedList = this.OooO00o;
        linkedList.add(lValueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            by2.OooO0oo(l);
            if (jElapsedRealtime - l.longValue() < 5000) {
                long j = this.OooO0O0;
                if (j == -1 || jElapsedRealtime - j >= 5000) {
                    this.OooO0O0 = jElapsedRealtime;
                    o0O000O o0o000o = OooO0OO;
                    if (Log.isLoggable((String) o0o000o.OooO0o0, 5)) {
                        Log.w("StreamingFormatChecker", o0o000o.OoooOoo("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit."));
                    }
                }
            }
        }
    }
}

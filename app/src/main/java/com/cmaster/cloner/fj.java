package com.cmaster.cloner;

import android.os.SystemClock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class fj {
    public static final Object OooO0O0 = new Object();
    public volatile Object OooO00o = OooO0O0;

    public final Object OooO00o(long j) {
        Object obj;
        Object obj2;
        if (j == 0) {
            synchronized (this) {
                while (true) {
                    Object obj3 = this.OooO00o;
                    obj = OooO0O0;
                    if (obj3 != obj) {
                        break;
                    }
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                Object obj4 = this.OooO00o;
                if (obj4 == obj) {
                    return null;
                }
                return obj4;
            }
        }
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            while (true) {
                Object obj5 = this.OooO00o;
                obj2 = OooO0O0;
                if (obj5 != obj2 || jElapsedRealtime >= j2) {
                    break;
                }
                try {
                    wait(j2 - jElapsedRealtime);
                } catch (InterruptedException unused2) {
                }
                jElapsedRealtime = SystemClock.elapsedRealtime();
            }
            Object obj6 = this.OooO00o;
            if (obj6 == obj2) {
                return null;
            }
            return obj6;
        }
    }

    public final boolean OooO0O0() {
        boolean z;
        synchronized (this) {
            z = this.OooO00o != OooO0O0;
        }
        return z;
    }

    public void OooO0OO(Object obj) {
        synchronized (this) {
            try {
                Object obj2 = this.OooO00o;
                this.OooO00o = obj;
                if (obj2 == OooO0O0) {
                    notifyAll();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

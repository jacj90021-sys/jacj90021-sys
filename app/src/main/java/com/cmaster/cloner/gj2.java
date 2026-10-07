package com.cmaster.cloner;

import java.util.logging.Logger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gj2 {
    public final ha OooO00o = new ha();
    public final String OooO0O0;
    public volatile Logger OooO0OO;

    public gj2(Class cls) {
        this.OooO0O0 = cls.getName();
    }

    public final Logger OooO00o() {
        Logger logger = this.OooO0OO;
        if (logger != null) {
            return logger;
        }
        synchronized (this.OooO00o) {
            try {
                Logger logger2 = this.OooO0OO;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.OooO0O0);
                this.OooO0OO = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

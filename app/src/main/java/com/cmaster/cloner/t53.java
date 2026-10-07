package com.cmaster.cloner;

import android.os.Binder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class t53 {
    public static int OooO00o() {
        if (m63.OooO0O0()) {
            return pw1.o00O0000().o0000OOo(Binder.getCallingPid());
        }
        lw1 lw1VarOooO0O0 = lw1.OooO0O0();
        int callingPid = Binder.getCallingPid();
        lw1VarOooO0O0.getClass();
        try {
            return lw1VarOooO0O0.OooO00o.o0000OOo(callingPid);
        } catch (Exception e) {
            lw1.OooO00o(e);
            return 0;
        }
    }

    public static int OooO0O0() {
        lw1 lw1VarOooO0O0 = lw1.OooO0O0();
        int callingPid = Binder.getCallingPid();
        lw1VarOooO0O0.getClass();
        try {
            return lw1VarOooO0O0.OooO00o.o00000O(callingPid);
        } catch (Exception e) {
            lw1.OooO00o(e);
            return -10000;
        }
    }
}

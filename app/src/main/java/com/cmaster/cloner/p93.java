package com.cmaster.cloner;

import android.os.Process;
import android.webkit.CookieManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class p93 extends i32 {
    public final CookieManager OooO0oo() {
        ya3 ya3Var = ya3.OooOooO;
        a73 a73Var = ya3Var.OooO0OO;
        int iMyUid = Process.myUid();
        if (iMyUid != 0 && iMyUid != 1000) {
            try {
                return CookieManager.getInstance();
            } catch (Throwable th) {
                int i = uh2.OooO0O0;
                uh2.OooO0oo("Failed to obtain CookieManager.", th);
                ya3Var.OooO0oo.zzv(th, "ApiLevelUtil.getCookieManager");
            }
        }
        return null;
    }
}

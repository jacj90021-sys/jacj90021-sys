package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.Toast;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e2 {
    public static e2 OooO;
    public final App OooO00o;
    public final String OooO0O0;
    public final boolean OooO0OO;
    public final jh1 OooO0Oo = new jh1();
    public Toast OooO0o;
    public volatile PackageInfo OooO0o0;
    public lh OooO0oO;
    public lh OooO0oo;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e2(com.cmaster.cloner.App r8) throws java.io.IOException {
        /*
            r7 = this;
            r7.<init>()
            com.cmaster.cloner.jh1 r0 = new com.cmaster.cloner.jh1
            r0.<init>()
            r7.OooO0Oo = r0
            r7.OooO00o = r8
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L19
            java.lang.String r0 = com.cmaster.cloner.to.OooOo00()
            r7.OooO0O0 = r0
            goto L67
        L19:
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = "/proc/"
            r2 = -1
            if (r0 != r2) goto L26
            int r0 = android.os.Process.myPid()
        L26:
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L61
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L61
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L61
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L61
            r6.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "/cmdline"
            r6.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L61
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L61
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch: java.lang.Throwable -> L61
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L61
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r0.<init>()     // Catch: java.lang.Throwable -> L62
        L4e:
            int r1 = r3.read()     // Catch: java.lang.Throwable -> L62
            if (r1 <= 0) goto L59
            char r1 = (char) r1     // Catch: java.lang.Throwable -> L62
            r0.append(r1)     // Catch: java.lang.Throwable -> L62
            goto L4e
        L59:
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L62
        L5d:
            r3.close()     // Catch: java.lang.Exception -> L65
            goto L65
        L61:
            r3 = r2
        L62:
            if (r3 == 0) goto L65
            goto L5d
        L65:
            r7.OooO0O0 = r2
        L67:
            android.content.pm.ApplicationInfo r0 = r8.getApplicationInfo()
            java.lang.String r0 = r0.processName
            if (r0 == 0) goto L80
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()
            java.lang.String r8 = r8.processName
            java.lang.String r0 = r7.OooO0O0
            boolean r8 = android.text.TextUtils.equals(r8, r0)
            if (r8 == 0) goto L7e
            goto L80
        L7e:
            r8 = 0
            goto L81
        L80:
            r8 = 1
        L81:
            r7.OooO0OO = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.e2.<init>(com.cmaster.cloner.App):void");
    }

    public static PackageInfo OooO00o() {
        e2 e2Var = OooO;
        if (e2Var.OooO0o0 == null) {
            synchronized (e2.class) {
                if (e2Var.OooO0o0 != null) {
                    return e2Var.OooO0o0;
                }
                try {
                    e2Var.OooO0o0 = e2Var.OooO00o.getPackageManager().getPackageInfo(e2Var.OooO00o.getPackageName(), 128);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
        }
        return e2Var.OooO0o0;
    }

    public static PackageManager OooO0O0() {
        return OooO.OooO00o.getPackageManager();
    }

    public static void OooO0Oo(String str) {
        if (h1.OooO0O0()) {
            OooO.OooO0Oo.OooOO0o(str);
        } else {
            OooO.OooO0Oo.OooOO0(str);
        }
    }

    public final void OooO0OO() {
        ArrayList arrayList = j1.OooO00o;
        OooO.OooO00o.registerActivityLifecycleCallbacks(j1.OooO0OO);
        if (this.OooO0oO != null) {
            return;
        }
        this.OooO0oO = new lh("android.net.conn.CONNECTIVITY_CHANGE");
        this.OooO0oo = new lh();
        this.OooO0Oo.OooO0oO(new k1(this, 3));
    }
}

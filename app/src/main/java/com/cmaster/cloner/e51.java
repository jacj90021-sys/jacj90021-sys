package com.cmaster.cloner;

import android.content.ContentProviderClient;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class e51 {
    public static final LinkedHashMap OooO0Oo = new LinkedHashMap();
    public final App OooO00o;
    public final String OooO0O0;
    public ContentProviderClient OooO0OO = null;

    public e51(App app, String str) {
        this.OooO00o = app;
        this.OooO0O0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.os.Bundle OooO00o(android.os.Bundle r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 5
        L2:
            int r1 = r0 + (-1)
            r2 = 0
            if (r0 <= 0) goto L6d
            android.content.ContentProviderClient r0 = r5.OooO0OO     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto Ld
            r3 = 1
            goto Le
        Ld:
            r3 = 0
        Le:
            java.lang.String r4 = r5.OooO0O0     // Catch: java.lang.Throwable -> L57
            if (r0 != 0) goto L1e
            com.cmaster.cloner.App r0 = r5.OooO00o     // Catch: java.lang.Throwable -> L57
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L57
            android.content.ContentProviderClient r0 = r0.acquireUnstableContentProviderClient(r4)     // Catch: java.lang.Throwable -> L57
            r5.OooO0OO = r0     // Catch: java.lang.Throwable -> L57
        L1e:
            android.content.ContentProviderClient r0 = r5.OooO0OO     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L59
            if (r6 != 0) goto L29
            android.os.Bundle r6 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r0 = move-exception
            goto L2f
        L29:
            android.os.Bundle r6 = r0.call(r7, r2, r6)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r5)
            return r6
        L2f:
            if (r1 == 0) goto L32
            goto L59
        L32:
            java.lang.String r6 = "/jaHjvM=\n"
            java.lang.String r7 = "uHfTz78sLwU=\n"
            java.lang.String r6 = com.cmaster.cloner.qn2.OooO00o(r6, r7)     // Catch: java.lang.Throwable -> L57
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57
            r7.<init>()     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = "Os8PxR/OclF2yBvCEMNzD3Y=\n"
            java.lang.String r2 = "Vq56q3ymFzU=\n"
            java.lang.String r1 = com.cmaster.cloner.qn2.OooO00o(r1, r2)     // Catch: java.lang.Throwable -> L57
            r7.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r1 = r5.OooO0O0     // Catch: java.lang.Throwable -> L57
            r7.append(r1)     // Catch: java.lang.Throwable -> L57
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L57
            android.util.Log.e(r6, r7, r0)     // Catch: java.lang.Throwable -> L57
            throw r0     // Catch: java.lang.Throwable -> L57
        L57:
            r6 = move-exception
            goto L6b
        L59:
            android.content.ContentProviderClient r0 = r5.OooO0OO     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L69
            r0.release()     // Catch: java.lang.Throwable -> L60
        L60:
            r5.OooO0OO = r2     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L69
            if (r3 != 0) goto L69
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> L69
        L69:
            r0 = r1
            goto L2
        L6b:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            throw r6
        L6d:
            monitor-exit(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.e51.OooO00o(android.os.Bundle, java.lang.String):android.os.Bundle");
    }
}

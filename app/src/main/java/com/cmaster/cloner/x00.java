package com.cmaster.cloner;

import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x00 {
    public static final np0 OooO00o = new np0(16);
    public static final ThreadPoolExecutor OooO0O0;
    public static final Object OooO0OO;
    public static final gh1 OooO0Oo;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o00OO(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        OooO0O0 = threadPoolExecutor;
        OooO0OO = new Object();
        OooO0Oo = new gh1(0);
    }

    public static String OooO00o(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((r00) list.get(i2)).OooO0oO);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b7, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00bb, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.w00 OooO0O0(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            com.cmaster.cloner.np0 r0 = com.cmaster.cloner.x00.OooO00o
            java.lang.String r1 = "getFontSync"
            com.cmaster.cloner.s43.OooO00o(r1)
            java.lang.Object r1 = r0.OooO0o(r8)     // Catch: java.lang.Throwable -> Lb7
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lb7
            if (r1 == 0) goto L18
            com.cmaster.cloner.w00 r8 = new com.cmaster.cloner.w00     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L18:
            com.cmaster.cloner.oOo000Oo r10 = com.cmaster.cloner.q00.OooO00o(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad java.lang.Throwable -> Lb7
            java.lang.Object r1 = r10.OooO0o0     // Catch: java.lang.Throwable -> Lb7
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> Lb7
            int r10 = r10.OooO0Oo     // Catch: java.lang.Throwable -> Lb7
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2d
            if (r10 == r2) goto L2b
        L29:
            r10 = r3
            goto L4e
        L2b:
            r10 = -2
            goto L4e
        L2d:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.c10[] r10 = (com.cmaster.cloner.c10[]) r10     // Catch: java.lang.Throwable -> Lb7
            if (r10 == 0) goto L4d
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            if (r5 != 0) goto L39
            goto L4d
        L39:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lb7
            r6 = r4
        L3b:
            if (r6 >= r5) goto L4b
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lb7
            int r7 = r7.OooO0o     // Catch: java.lang.Throwable -> Lb7
            if (r7 == 0) goto L48
            if (r7 >= 0) goto L46
            goto L29
        L46:
            r10 = r7
            goto L4e
        L48:
            int r6 = r6 + 1
            goto L3b
        L4b:
            r10 = r4
            goto L4e
        L4d:
            r10 = r2
        L4e:
            if (r10 == 0) goto L59
            com.cmaster.cloner.w00 r8 = new com.cmaster.cloner.w00     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L59:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lb7
            if (r10 <= r2) goto L7b
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb7
            r2 = 29
            if (r10 < r2) goto L7b
            com.cmaster.cloner.f53 r10 = com.cmaster.cloner.gq1.OooO00o     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            com.cmaster.cloner.s43.OooO00o(r10)     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.f53 r10 = com.cmaster.cloner.gq1.OooO00o     // Catch: java.lang.Throwable -> L76
            android.graphics.Typeface r9 = r10.OooO0OO(r9, r1, r11)     // Catch: java.lang.Throwable -> L76
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            goto L91
        L76:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        L7b:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.c10[] r10 = (com.cmaster.cloner.c10[]) r10     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.f53 r1 = com.cmaster.cloner.gq1.OooO00o     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            com.cmaster.cloner.s43.OooO00o(r1)     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.f53 r1 = com.cmaster.cloner.gq1.OooO00o     // Catch: java.lang.Throwable -> La8
            android.graphics.Typeface r9 = r1.OooO0O0(r9, r10, r11)     // Catch: java.lang.Throwable -> La8
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
        L91:
            if (r9 == 0) goto L9f
            r0.OooOO0(r8, r9)     // Catch: java.lang.Throwable -> Lb7
            com.cmaster.cloner.w00 r8 = new com.cmaster.cloner.w00     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        L9f:
            com.cmaster.cloner.w00 r8 = new com.cmaster.cloner.w00     // Catch: java.lang.Throwable -> Lb7
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        La8:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb7
            throw r8     // Catch: java.lang.Throwable -> Lb7
        Lad:
            com.cmaster.cloner.w00 r8 = new com.cmaster.cloner.w00     // Catch: java.lang.Throwable -> Lb7
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb7
            android.os.Trace.endSection()
            return r8
        Lb7:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.x00.OooO0O0(java.lang.String, android.content.Context, java.util.List, int):com.cmaster.cloner.w00");
    }
}

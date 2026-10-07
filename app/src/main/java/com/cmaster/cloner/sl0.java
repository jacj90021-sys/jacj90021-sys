package com.cmaster.cloner;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sl0 {
    public static final o0O000O OooO0O0 = new o0O000O("LibraryVersion", "");
    public static final sl0 OooO0OO = new sl0();
    public final ConcurrentHashMap OooO00o = new ConcurrentHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String OooO00o(java.lang.String r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = "LibraryVersion"
            com.cmaster.cloner.o0O000O r1 = com.cmaster.cloner.sl0.OooO0O0
            java.lang.String r2 = "Failed to get app version for libraryName: "
            java.lang.String r3 = "/"
            java.lang.String r4 = "Please provide a valid libraryName"
            com.cmaster.cloner.by2.OooO0o(r10, r4)
            java.util.concurrent.ConcurrentHashMap r9 = r9.OooO00o
            boolean r4 = r9.containsKey(r10)
            if (r4 == 0) goto L1c
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1c:
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            r5 = 0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            r6.<init>(r3)     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            r6.append(r10)     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            java.lang.String r3 = ".properties"
            r6.append(r3)     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            java.lang.String r3 = r6.toString()     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            java.lang.Class<com.cmaster.cloner.sl0> r6 = com.cmaster.cloner.sl0.class
            java.io.InputStream r3 = r6.getResourceAsStream(r3)     // Catch: java.io.IOException -> L93 java.lang.Throwable -> L96
            if (r3 == 0) goto L72
            r4.load(r3)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r6 = "version"
            java.lang.String r5 = r4.getProperty(r6, r5)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4.<init>()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4.append(r10)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r6 = " version is "
            r4.append(r6)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4.append(r5)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.Object r6 = r1.OooO0o0     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7 = 2
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            if (r6 == 0) goto Lab
            java.lang.String r4 = r1.OoooOoo(r4)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            android.util.Log.v(r0, r4)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            goto Lab
        L6b:
            r9 = move-exception
            goto L91
        L6d:
            r4 = move-exception
            r8 = r5
            r5 = r3
            r3 = r8
            goto L99
        L72:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r4.append(r10)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.Object r6 = r1.OooO0o0     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            r7 = 5
            boolean r6 = android.util.Log.isLoggable(r6, r7)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            if (r6 == 0) goto Lab
            java.lang.String r4 = r1.OoooOoo(r4)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            android.util.Log.w(r0, r4)     // Catch: java.lang.Throwable -> L6b java.io.IOException -> L6d
            goto Lab
        L91:
            r5 = r3
            goto Lcc
        L93:
            r3 = move-exception
            r4 = r3
            goto L98
        L96:
            r9 = move-exception
            goto Lcc
        L98:
            r3 = r5
        L99:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L96
            r6.append(r10)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L96
            r1.OooOo(r0, r2, r4)     // Catch: java.lang.Throwable -> L96
            r8 = r5
            r5 = r3
            r3 = r8
        Lab:
            if (r3 == 0) goto Lb0
            com.cmaster.cloner.et2.OooO00o(r3)
        Lb0:
            if (r5 != 0) goto Lc8
            java.lang.Object r2 = r1.OooO0o0
            java.lang.String r2 = (java.lang.String) r2
            r3 = 3
            boolean r2 = android.util.Log.isLoggable(r2, r3)
            if (r2 == 0) goto Lc6
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            java.lang.String r1 = r1.OoooOoo(r2)
            android.util.Log.d(r0, r1)
        Lc6:
            java.lang.String r5 = "UNKNOWN"
        Lc8:
            r9.put(r10, r5)
            return r5
        Lcc:
            if (r5 == 0) goto Ld1
            com.cmaster.cloner.et2.OooO00o(r5)
        Ld1:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.sl0.OooO00o(java.lang.String):java.lang.String");
    }
}

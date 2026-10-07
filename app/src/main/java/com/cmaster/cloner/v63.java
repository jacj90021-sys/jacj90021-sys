package com.cmaster.cloner;

import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v63 {
    /* JADX WARN: Removed duplicated region for block: B:50:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.aj OooO00o(byte[] r7) throws java.lang.Throwable {
        /*
            com.cmaster.cloner.aj r0 = new com.cmaster.cloner.aj
            r0.<init>()
            if (r7 != 0) goto L8
            goto L55
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L4b
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L17:
            if (r7 <= 0) goto L36
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            com.cmaster.cloner.zi r5 = new com.cmaster.cloner.zi     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.<init>(r3, r4)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.HashSet r3 = r0.OooO00o     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r3.add(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r7 = r7 + (-1)
            goto L17
        L32:
            r7 = move-exception
            goto L56
        L34:
            r7 = move-exception
            goto L4f
        L36:
            r2.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r7 = move-exception
            r7.printStackTrace()
        L3e:
            r1.close()     // Catch: java.io.IOException -> L42
            goto L55
        L42:
            r7 = move-exception
            r7.printStackTrace()
            goto L55
        L47:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L56
        L4b:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L4f:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L3e
            goto L36
        L55:
            return r0
        L56:
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r0.printStackTrace()
        L60:
            r1.close()     // Catch: java.io.IOException -> L64
            goto L68
        L64:
            r0 = move-exception
            r0.printStackTrace()
        L68:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.v63.OooO00o(byte[]):com.cmaster.cloner.aj");
    }

    public static int OooO0O0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        ra.OooOOO(rj.OooO00o(i, "Could not convert ", " to BackoffPolicy"));
        return 0;
    }

    public static int OooO0OO(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return 6;
        }
        ra.OooOOO(rj.OooO00o(i, "Could not convert ", " to NetworkType"));
        return 0;
    }

    public static int OooO0Oo(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        ra.OooOOO(rj.OooO00o(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return 0;
    }

    public static int OooO0o(int i) {
        int iOooOOoo = rj.OooOOoo(i);
        if (iOooOOoo == 0) {
            return 0;
        }
        int i2 = 1;
        if (iOooOOoo != 1) {
            i2 = 2;
            if (iOooOOoo != 2) {
                i2 = 3;
                if (iOooOOoo != 3) {
                    i2 = 4;
                    if (iOooOOoo != 4) {
                        if (iOooOOoo == 5) {
                            return 5;
                        }
                        ra.OooO0o(px0.OooOoo(i), "Could not convert ", " to int");
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    public static int OooO0o0(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        ra.OooOOO(rj.OooO00o(i, "Could not convert ", " to State"));
        return 0;
    }
}

package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class au0 {
    public static final Object OooO0O0 = new Object();
    public static au0 OooO0OO;
    public qg OooO00o;

    public static au0 OooO0OO() {
        au0 au0Var;
        synchronized (OooO0O0) {
            by2.OooOO0("MlKitContext has not been initialized", OooO0OO != null);
            au0Var = OooO0OO;
            by2.OooO0oo(au0Var);
        }
        return au0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        monitor-enter(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r9 = new java.util.HashMap(r8.OooO00o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        monitor-exit(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
    
        r8.OooO0o0(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        r8 = com.cmaster.cloner.au0.OooO0OO;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.au0 OooO0Oo(android.content.Context r8, java.util.concurrent.Executor r9) {
        /*
            java.lang.Object r0 = com.cmaster.cloner.au0.OooO0O0
            monitor-enter(r0)
            com.cmaster.cloner.au0 r1 = com.cmaster.cloner.au0.OooO0OO     // Catch: java.lang.Throwable -> L7c
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = r3
        Lc:
            java.lang.String r4 = "MlKitContext is already initialized"
            com.cmaster.cloner.by2.OooOO0(r4, r1)     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.au0 r1 = new com.cmaster.cloner.au0     // Catch: java.lang.Throwable -> L7c
            r1.<init>()     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.au0.OooO0OO = r1     // Catch: java.lang.Throwable -> L7c
            android.content.Context r4 = r8.getApplicationContext()     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L1f
            r8 = r4
        L1f:
            com.cmaster.cloner.hg r4 = new com.cmaster.cloner.hg     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.im2 r5 = new com.cmaster.cloner.im2     // Catch: java.lang.Throwable -> L7c
            r5.<init>()     // Catch: java.lang.Throwable -> L7c
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L7c
            java.util.ArrayList r4 = r4.OooO0o0()     // Catch: java.lang.Throwable -> L7c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r5.<init>()     // Catch: java.lang.Throwable -> L7c
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7c
            r6.<init>()     // Catch: java.lang.Throwable -> L7c
            r5.addAll(r4)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.vf r8 = com.cmaster.cloner.vf.OooO0O0(r8, r4, r7)     // Catch: java.lang.Throwable -> L7c
            r6.add(r8)     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<com.cmaster.cloner.au0> r8 = com.cmaster.cloner.au0.class
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.vf r8 = com.cmaster.cloner.vf.OooO0O0(r1, r8, r3)     // Catch: java.lang.Throwable -> L7c
            r6.add(r8)     // Catch: java.lang.Throwable -> L7c
            com.cmaster.cloner.qg r8 = new com.cmaster.cloner.qg     // Catch: java.lang.Throwable -> L7c
            r8.<init>(r9, r5, r6)     // Catch: java.lang.Throwable -> L7c
            r1.OooO00o = r8     // Catch: java.lang.Throwable -> L7c
            java.util.concurrent.atomic.AtomicReference r9 = r8.OooO0o0     // Catch: java.lang.Throwable -> L7c
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L7c
        L5b:
            r3 = 0
            boolean r3 = r9.compareAndSet(r3, r1)     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L72
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L7c
            java.util.HashMap r9 = new java.util.HashMap     // Catch: java.lang.Throwable -> L6f
            java.util.HashMap r1 = r8.OooO00o     // Catch: java.lang.Throwable -> L6f
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6f
            r8.OooO0o0(r9, r2)     // Catch: java.lang.Throwable -> L7c
            goto L78
        L6f:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L6f
            throw r9     // Catch: java.lang.Throwable -> L7c
        L72:
            java.lang.Object r3 = r9.get()     // Catch: java.lang.Throwable -> L7c
            if (r3 == 0) goto L5b
        L78:
            com.cmaster.cloner.au0 r8 = com.cmaster.cloner.au0.OooO0OO     // Catch: java.lang.Throwable -> L7c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            return r8
        L7c:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.au0.OooO0Oo(android.content.Context, java.util.concurrent.Executor):com.cmaster.cloner.au0");
    }

    public final Object OooO00o(Class cls) {
        by2.OooOO0("MlKitContext has been deleted", OooO0OO == this);
        by2.OooO0oo(this.OooO00o);
        return this.OooO00o.OooO00o(cls);
    }

    public final Context OooO0O0() {
        return (Context) OooO00o(Context.class);
    }
}

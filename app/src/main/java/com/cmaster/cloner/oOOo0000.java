package com.cmaster.cloner;

import android.content.Context;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class oOOo0000 implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Context OooO0o0;

    public /* synthetic */ oOOo0000(Context context, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r10 = this;
            int r0 = r10.OooO0Oo
            r1 = 1
            android.content.Context r10 = r10.OooO0o0
            switch(r0) {
                case 0: goto L2e;
                case 1: goto L14;
                default: goto L8;
            }
        L8:
            com.cmaster.cloner.x2 r0 = new com.cmaster.cloner.x2
            r0.<init>(r1)
            com.cmaster.cloner.je r1 = com.cmaster.cloner.r72.OooO00o
            r2 = 0
            com.cmaster.cloner.r72.OooO0O0(r10, r0, r1, r2)
            return
        L14:
            java.util.concurrent.ThreadPoolExecutor r3 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingQueue r9 = new java.util.concurrent.LinkedBlockingQueue
            r9.<init>()
            r4 = 0
            r5 = 1
            r6 = 0
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            r3.<init>(r4, r5, r6, r8, r9)
            com.cmaster.cloner.oOOo0000 r0 = new com.cmaster.cloner.oOOo0000
            r1 = 2
            r0.<init>(r10, r1)
            r3.execute(r0)
            return
        L2e:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r0 < r2) goto Lad
            android.content.ComponentName r3 = new android.content.ComponentName
            java.lang.String r4 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
            r3.<init>(r10, r4)
            android.content.pm.PackageManager r4 = r10.getPackageManager()
            int r4 = r4.getComponentEnabledSetting(r3)
            if (r4 == r1) goto Lad
            java.lang.String r4 = "locale"
            if (r0 < r2) goto L84
            com.cmaster.cloner.m3 r0 = com.cmaster.cloner.O0000000.OooOO0
            r0.getClass()
            com.cmaster.cloner.h3 r2 = new com.cmaster.cloner.h3
            r2.<init>(r0)
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r2.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r0 = r0.get()
            com.cmaster.cloner.O0000000 r0 = (com.cmaster.cloner.O0000000) r0
            if (r0 == 0) goto L53
            com.cmaster.cloner.k r0 = (com.cmaster.cloner.k) r0
            android.content.Context r0 = r0.OooOOO
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.getSystemService(r4)
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 == 0) goto L89
            android.os.LocaleList r0 = com.cmaster.cloner.oOo0o00.OooO00o(r0)
            com.cmaster.cloner.ro0 r2 = new com.cmaster.cloner.ro0
            com.cmaster.cloner.so0 r5 = new com.cmaster.cloner.so0
            r5.<init>(r0)
            r2.<init>(r5)
            goto L8b
        L84:
            com.cmaster.cloner.ro0 r2 = com.cmaster.cloner.O0000000.OooO0o
            if (r2 == 0) goto L89
            goto L8b
        L89:
            com.cmaster.cloner.ro0 r2 = com.cmaster.cloner.ro0.OooO0O0
        L8b:
            com.cmaster.cloner.so0 r0 = r2.OooO00o
            android.os.LocaleList r0 = r0.OooO00o
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La6
            java.lang.String r0 = com.cmaster.cloner.d9.OooO0O0(r10)
            java.lang.Object r2 = r10.getSystemService(r4)
            if (r2 == 0) goto La6
            android.os.LocaleList r0 = com.cmaster.cloner.oOOo0O00.OooO00o(r0)
            com.cmaster.cloner.oOo0o00.OooO0O0(r2, r0)
        La6:
            android.content.pm.PackageManager r10 = r10.getPackageManager()
            r10.setComponentEnabledSetting(r3, r1, r1)
        Lad:
            com.cmaster.cloner.O0000000.OooO = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.oOOo0000.run():void");
    }
}

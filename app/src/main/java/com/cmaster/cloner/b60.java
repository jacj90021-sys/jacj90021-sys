package com.cmaster.cloner;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class b60 {
    public final int OooO;
    public final Context OooO0Oo;
    public final o0O000O OooO0o;
    public final String OooO0o0;
    public final oOO0000 OooO0oO;
    public final oOO0O0 OooO0oo;
    public final s60 OooOO0;
    public final h60 OooOO0O;

    public b60(Context context, o0O000O o0o000o, oOO0000 ooo0000, a60 a60Var) {
        by2.OooO(context, "Null context is not permitted.");
        by2.OooO(o0o000o, "Api must not be null.");
        by2.OooO(a60Var, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        by2.OooO(applicationContext, "The provided context did not have an application context.");
        this.OooO0Oo = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.OooO0o0 = attributionTag;
        this.OooO0o = o0o000o;
        this.OooO0oO = ooo0000;
        this.OooO0oo = new oOO0O0(o0o000o, ooo0000, attributionTag);
        h60 h60VarOooO0o0 = h60.OooO0o0(applicationContext);
        this.OooOO0O = h60VarOooO0o0;
        this.OooO = h60VarOooO0o0.OooOO0O.getAndIncrement();
        this.OooOO0 = a60Var.OooO00o;
        xi1 xi1Var = h60VarOooO0o0.OooOOOo;
        xi1Var.sendMessage(xi1Var.obtainMessage(7, this));
    }

    public final hx2 OooO0O0() {
        hx2 hx2Var = new hx2(5, false);
        Set set = Collections.EMPTY_SET;
        if (((m3) hx2Var.OooO0o0) == null) {
            hx2Var.OooO0o0 = new m3(0);
        }
        ((m3) hx2Var.OooO0o0).addAll(set);
        Context context = this.OooO0Oo;
        hx2Var.OooO0oO = context.getClass().getName();
        hx2Var.OooO0o = context.getPackageName();
        return hx2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.ac3 OooO0OO(int r14, com.cmaster.cloner.z8 r15) {
        /*
            r13 = this;
            com.cmaster.cloner.yl1 r0 = new com.cmaster.cloner.yl1
            r0.<init>()
            com.cmaster.cloner.h60 r2 = r13.OooOO0O
            r2.getClass()
            com.cmaster.cloner.xi1 r9 = r2.OooOOOo
            int r3 = r15.OooO0O0
            com.cmaster.cloner.ac3 r10 = r0.OooO00o
            if (r3 == 0) goto L8e
            boolean r1 = r2.OooO00o()
            if (r1 != 0) goto L19
            goto L5a
        L19:
            com.cmaster.cloner.xb1 r1 = com.cmaster.cloner.xb1.OooOooO()
            java.lang.Object r1 = r1.OooO0o0
            com.cmaster.cloner.yb1 r1 = (com.cmaster.cloner.yb1) r1
            com.cmaster.cloner.oOO0O0 r4 = r13.OooO0oo
            r5 = 1
            if (r1 == 0) goto L5c
            boolean r6 = r1.OooO0o0
            if (r6 == 0) goto L5a
            boolean r1 = r1.OooO0o
            java.util.concurrent.ConcurrentHashMap r6 = r2.OooOOO0
            java.lang.Object r6 = r6.get(r4)
            com.cmaster.cloner.s12 r6 = (com.cmaster.cloner.s12) r6
            if (r6 == 0) goto L58
            com.cmaster.cloner.oOO000 r7 = r6.OooO0o0
            boolean r8 = r7 instanceof com.cmaster.cloner.m6
            if (r8 == 0) goto L5a
            com.cmaster.cloner.m6 r7 = (com.cmaster.cloner.m6) r7
            boolean r8 = r7.hasConnectionInfo()
            if (r8 == 0) goto L58
            boolean r8 = r7.isConnecting()
            if (r8 != 0) goto L58
            com.cmaster.cloner.hh r1 = com.cmaster.cloner.a22.OooO00o(r6, r7, r3)
            if (r1 == 0) goto L5a
            int r7 = r6.OooOOOO
            int r7 = r7 + r5
            r6.OooOOOO = r7
            boolean r5 = r1.OooO0o
            goto L5c
        L58:
            r5 = r1
            goto L5c
        L5a:
            r1 = 0
            goto L73
        L5c:
            com.cmaster.cloner.a22 r1 = new com.cmaster.cloner.a22
            r6 = 0
            if (r5 == 0) goto L67
            long r11 = java.lang.System.currentTimeMillis()
            goto L68
        L67:
            r11 = r6
        L68:
            if (r5 == 0) goto L6e
            long r6 = android.os.SystemClock.elapsedRealtime()
        L6e:
            r7 = r6
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r7)
        L73:
            if (r1 == 0) goto L8e
            r9.getClass()
            com.cmaster.cloner.v3 r3 = new com.cmaster.cloner.v3
            r4 = 2
            r3.<init>(r9, r4)
            r10.getClass()
            com.cmaster.cloner.he2 r4 = new com.cmaster.cloner.he2
            r4.<init>(r3, r1)
            com.cmaster.cloner.oh1 r1 = r10.OooO0O0
            r1.OooO0o0(r4)
            r10.OooOO0o()
        L8e:
            com.cmaster.cloner.n22 r1 = new com.cmaster.cloner.n22
            com.cmaster.cloner.s60 r3 = r13.OooOO0
            r1.<init>(r14, r15, r0, r3)
            java.util.concurrent.atomic.AtomicInteger r14 = r2.OooOO0o
            com.cmaster.cloner.c22 r15 = new com.cmaster.cloner.c22
            int r14 = r14.get()
            r15.<init>(r1, r14, r13)
            r13 = 4
            android.os.Message r13 = r9.obtainMessage(r13, r15)
            r9.sendMessage(r13)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.b60.OooO0OO(int, com.cmaster.cloner.z8):com.cmaster.cloner.ac3");
    }
}

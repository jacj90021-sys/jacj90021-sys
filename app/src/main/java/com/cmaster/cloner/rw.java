package com.cmaster.cloner;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rw implements Runnable {
    public static final String OooO0o = ep0.OooO("EnqueueRunnable");
    public final h02 OooO0Oo;
    public final e81 OooO0o0 = new e81(1);

    public rw(h02 h02Var) {
        this.OooO0Oo = h02Var;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooO00o(com.cmaster.cloner.h02 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.rw.OooO00o(com.cmaster.cloner.h02):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        e81 e81Var = this.OooO0o0;
        h02 h02Var = this.OooO0Oo;
        q02 q02Var = h02Var.OooO00o;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(h02Var.OooO0OO);
            HashSet hashSetOooO00o = h02.OooO00o(h02Var);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(h02Var.OooO0OO);
                    z = false;
                    break;
                } else if (hashSetOooO00o.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + h02Var + ")");
            }
            WorkDatabase workDatabase = q02Var.OooO0OO;
            workDatabase.OooO0OO();
            try {
                boolean zOooO00o = OooO00o(h02Var);
                workDatabase.OooOOo0();
                if (zOooO00o) {
                    v01.OooO00o(q02Var.OooO00o, RescheduleReceiver.class, true);
                    qd1.OooO00o(q02Var.OooO0O0, q02Var.OooO0OO, q02Var.OooO0o0);
                }
                e81Var.OooOoo(e81.OooO0oO);
            } finally {
                workDatabase.OooOOO();
            }
        } catch (Throwable th) {
            e81Var.OooOoo(new pz0(th));
        }
    }
}

package com.cmaster.cloner;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d12 implements Runnable {
    public static final String OooOo0o = ep0.OooO("WorkerWrapper");
    public ListenableWorker OooO;
    public Context OooO0Oo;
    public List OooO0o;
    public String OooO0o0;
    public a02 OooO0oO;
    public w02 OooO0oo;
    public hx2 OooOO0;
    public rn0 OooOO0O;
    public xf1 OooOO0o;
    public WorkDatabase OooOOO;
    public g51 OooOOO0;
    public o0O00000 OooOOOO;
    public o0O000O OooOOOo;
    public ArrayList OooOOo;
    public vr1 OooOOo0;
    public String OooOOoo;
    public nn0 OooOo0;
    public uf1 OooOo00;
    public volatile boolean OooOo0O;

    public final void OooO00o(rn0 rn0Var) {
        boolean z = rn0Var instanceof qn0;
        String str = OooOo0o;
        if (!z) {
            if (rn0Var instanceof pn0) {
                ep0.OooO0oO().OooO0oo(str, rj.OooO0OO("Worker result RETRY for ", this.OooOOoo), new Throwable[0]);
                OooO0OO();
                return;
            }
            ep0.OooO0oO().OooO0oo(str, rj.OooO0OO("Worker result FAILURE for ", this.OooOOoo), new Throwable[0]);
            if (this.OooO0oo.OooO0OO()) {
                OooO0Oo();
                return;
            } else {
                OooO0oO();
                return;
            }
        }
        ep0.OooO0oO().OooO0oo(str, rj.OooO0OO("Worker result SUCCESS for ", this.OooOOoo), new Throwable[0]);
        if (this.OooO0oo.OooO0OO()) {
            OooO0Oo();
            return;
        }
        o0O000O o0o000o = this.OooOOOo;
        String str2 = this.OooO0o0;
        o0O00000 o0o00000 = this.OooOOOO;
        WorkDatabase workDatabase = this.OooOOO;
        workDatabase.OooO0OO();
        try {
            o0o00000.OooOO0o(3, str2);
            o0o00000.OooOO0(str2, ((qn0) this.OooOO0O).OooO00o);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayListOooOoo0 = o0o000o.OooOoo0(str2);
            int size = arrayListOooOoo0.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListOooOoo0.get(i);
                i++;
                String str3 = (String) obj;
                if (o0o00000.OooO0o0(str3) == 5) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) o0o000o.OooO0o0;
                    wb1 wb1VarOooO0OO = wb1.OooO0OO(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        wb1VarOooO0OO.OooO0O0(1);
                    } else {
                        wb1VarOooO0OO.OooO0Oo(1, str3);
                    }
                    workDatabase_Impl.OooO0O0();
                    Cursor cursorOooO0OO = aq2.OooO0OO(workDatabase_Impl, wb1VarOooO0OO);
                    try {
                        if (cursorOooO0OO.moveToFirst() && cursorOooO0OO.getInt(0) != 0) {
                            ep0.OooO0oO().OooO0oo(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            o0o00000.OooOO0o(1, str3);
                            o0o00000.OooOO0O(str3, jCurrentTimeMillis);
                        }
                    } finally {
                        cursorOooO0OO.close();
                        wb1VarOooO0OO.OooO0o();
                    }
                }
            }
            workDatabase.OooOOo0();
            workDatabase.OooOOO();
            OooO0o0(false);
        } catch (Throwable th) {
            workDatabase.OooOOO();
            OooO0o0(false);
            throw th;
        }
    }

    public final void OooO0O0() {
        List list = this.OooO0o;
        String str = this.OooO0o0;
        WorkDatabase workDatabase = this.OooOOO;
        if (!OooO0oo()) {
            workDatabase.OooO0OO();
            try {
                int iOooO0o0 = this.OooOOOO.OooO0o0(str);
                ho1 ho1VarOooOo0O = workDatabase.OooOo0O();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) ho1VarOooOo0O.OooO0o0;
                workDatabase_Impl.OooO0O0();
                hl1 hl1Var = (hl1) ho1VarOooOo0O.OooO0oO;
                j30 j30VarOooO00o = hl1Var.OooO00o();
                if (str == null) {
                    j30VarOooO00o.OooO0O0(1);
                } else {
                    j30VarOooO00o.OooO0Oo(1, str);
                }
                workDatabase_Impl.OooO0OO();
                try {
                    j30VarOooO00o.OooO0OO();
                    workDatabase_Impl.OooOOo0();
                    if (iOooO0o0 == 0) {
                        OooO0o0(false);
                    } else if (iOooO0o0 == 2) {
                        OooO00o(this.OooOO0O);
                    } else if (!px0.OooO0Oo(iOooO0o0)) {
                        OooO0OO();
                    }
                    workDatabase.OooOOo0();
                    workDatabase.OooOOO();
                } finally {
                    workDatabase_Impl.OooOOO();
                    hl1Var.OooO0OO(j30VarOooO00o);
                }
            } catch (Throwable th) {
                workDatabase.OooOOO();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((od1) it.next()).OooO0OO(str);
            }
            qd1.OooO00o(this.OooOO0o, workDatabase, list);
        }
    }

    public final void OooO0OO() {
        String str = this.OooO0o0;
        o0O00000 o0o00000 = this.OooOOOO;
        WorkDatabase workDatabase = this.OooOOO;
        workDatabase.OooO0OO();
        try {
            o0o00000.OooOO0o(1, str);
            o0o00000.OooOO0O(str, System.currentTimeMillis());
            o0o00000.OooO(str, -1L);
            workDatabase.OooOOo0();
        } finally {
            workDatabase.OooOOO();
            OooO0o0(true);
        }
    }

    public final void OooO0Oo() {
        String str = this.OooO0o0;
        o0O00000 o0o00000 = this.OooOOOO;
        WorkDatabase workDatabase = this.OooOOO;
        workDatabase.OooO0OO();
        try {
            o0o00000.OooOO0O(str, System.currentTimeMillis());
            o0o00000.OooOO0o(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) o0o00000.OooO0Oo;
            workDatabase_Impl.OooO0O0();
            hl1 hl1Var = (hl1) o0o00000.OooOO0;
            j30 j30VarOooO00o = hl1Var.OooO00o();
            if (str == null) {
                j30VarOooO00o.OooO0O0(1);
            } else {
                j30VarOooO00o.OooO0Oo(1, str);
            }
            workDatabase_Impl.OooO0OO();
            try {
                j30VarOooO00o.OooO0OO();
                workDatabase_Impl.OooOOo0();
                workDatabase_Impl.OooOOO();
                hl1Var.OooO0OO(j30VarOooO00o);
                o0o00000.OooO(str, -1L);
                workDatabase.OooOOo0();
            } catch (Throwable th) {
                workDatabase_Impl.OooOOO();
                hl1Var.OooO0OO(j30VarOooO00o);
                throw th;
            }
        } finally {
            workDatabase.OooOOO();
            OooO0o0(false);
        }
    }

    public final void OooO0o() {
        o0O00000 o0o00000 = this.OooOOOO;
        String str = this.OooO0o0;
        int iOooO0o0 = o0o00000.OooO0o0(str);
        String str2 = OooOo0o;
        if (iOooO0o0 == 2) {
            ep0.OooO0oO().OooO0Oo(str2, px0.OooOOOO("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            OooO0o0(true);
            return;
        }
        ep0.OooO0oO().OooO0Oo(str2, "Status for " + str + " is " + px0.OooOoo(iOooO0o0) + "; not doing any work", new Throwable[0]);
        OooO0o0(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o0(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.OooOOO
            r0.OooO0OO()
            androidx.work.impl.WorkDatabase r0 = r5.OooOOO     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.o0O00000 r0 = r0.OooOo0o()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            com.cmaster.cloner.wb1 r1 = com.cmaster.cloner.wb1.OooO0OO(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.OooO0Oo     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.OooO0O0()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = com.cmaster.cloner.aq2.OooO0OO(r0, r1)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.OooO0o()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.OooO0Oo     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            com.cmaster.cloner.v01.OooO00o(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            com.cmaster.cloner.o0O00000 r0 = r5.OooOOOO     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.OooOO0o(r4, r1)     // Catch: java.lang.Throwable -> L42
            com.cmaster.cloner.o0O00000 r0 = r5.OooOOOO     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.OooO0o0     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.OooO(r1, r2)     // Catch: java.lang.Throwable -> L42
        L5a:
            com.cmaster.cloner.w02 r0 = r5.OooO0oo     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.OooO     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            com.cmaster.cloner.g51 r0 = r5.OooOOO0     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.OooO0o0     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.OooOOO     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.OooO     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.OooO0oo()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.OooOOO     // Catch: java.lang.Throwable -> L42
            r0.OooOOo0()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.OooOOO
            r0.OooOOO()
            com.cmaster.cloner.uf1 r5 = r5.OooOo00
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r5.OooO0oo(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.OooO0o()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r5 = r5.OooOOO
            r5.OooOOO()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.d12.OooO0o0(boolean):void");
    }

    public final void OooO0oO() {
        o0O00000 o0o00000 = this.OooOOOO;
        String str = this.OooO0o0;
        WorkDatabase workDatabase = this.OooOOO;
        workDatabase.OooO0OO();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                if (o0o00000.OooO0o0(str2) != 6) {
                    o0o00000.OooOO0o(4, str2);
                }
                linkedList.addAll(this.OooOOOo.OooOoo0(str2));
            }
            o0o00000.OooOO0(str, ((on0) this.OooOO0O).OooO00o);
            workDatabase.OooOOo0();
        } finally {
            workDatabase.OooOOO();
            OooO0o0(false);
        }
    }

    public final boolean OooO0oo() {
        if (!this.OooOo0O) {
            return false;
        }
        ep0.OooO0oO().OooO0Oo(OooOo0o, rj.OooO0OO("Work interrupted for ", this.OooOOoo), new Throwable[0]);
        if (this.OooOOOO.OooO0o0(this.OooO0o0) == 0) {
            OooO0o0(false);
            return true;
        }
        OooO0o0(!px0.OooO0Oo(r0));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c9 A[Catch: all -> 0x0085, TryCatch #2 {all -> 0x0085, blocks: (B:13:0x005c, B:16:0x0066, B:21:0x0088, B:23:0x008c, B:26:0x00b4, B:28:0x00ba, B:30:0x00c0, B:43:0x0108, B:35:0x00c9, B:38:0x00d8, B:40:0x00e0), top: B:109:0x005c }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.d12.run():void");
    }
}

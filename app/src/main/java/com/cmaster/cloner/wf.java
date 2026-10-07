package com.cmaster.cloner;

import android.content.Context;
import java.io.File;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class wf implements p30 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ wf(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.p30
    public final Object OooO00o() {
        g30 g30Var;
        int i = this.OooO0Oo;
        Object[] objArr = 0;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                ((oOOO00) obj).reportFullyDrawn();
                return null;
            case 1:
                return ((o0O000O) obj).OooO0oO(":memory:");
            case 2:
                h30 h30Var = (h30) obj;
                qb qbVar = h30Var.OooO0o;
                Context context = h30Var.OooO0Oo;
                String str = h30Var.OooO0o0;
                if (str == null || !h30Var.OooO0oO) {
                    g30Var = new g30(context, str, new ay1(22), qbVar);
                } else {
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    g30Var = new g30(context, new File(noBackupFilesDir, str).getAbsolutePath(), new ay1(22), qbVar);
                }
                g30Var.setWriteAheadLoggingEnabled(h30Var.OooO);
                return g30Var;
            case 3:
                tb1 tb1Var = ((mj0) obj).OooO00o;
                return Boolean.valueOf(!tb1Var.OooOO0o() || tb1Var.OooOOOo());
            case 4:
                return h82.OooO0OO((eu1) obj);
            case 5:
                jd1 jd1Var = (jd1) obj;
                jd1Var.OooO0o().OooO0OO(new v61(jd1Var, objArr == true ? 1 : 0));
                return vq1.OooO00o;
            default:
                qg1 qg1Var = (qg1) obj;
                String strOooO0O0 = qg1Var.OooO0O0();
                tb1 tb1Var2 = qg1Var.OooO00o;
                tb1Var2.getClass();
                tb1Var2.OooO00o();
                tb1Var2.OooO0O0();
                return tb1Var2.OooO().OooOO0O().OooO0oo(strOooO0O0);
        }
    }
}

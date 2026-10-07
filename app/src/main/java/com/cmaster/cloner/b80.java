package com.cmaster.cloner;

import android.app.ProgressDialog;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class b80 implements a40 {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ b80(g80 g80Var, k81 k81Var) {
        this.OooO0Oo = 1;
        this.OooO0o0 = g80Var;
        this.OooO0o = k81Var;
    }

    @Override // com.cmaster.cloner.a40
    public final Object OooO0o(Object obj) throws Exception {
        int i = this.OooO0Oo;
        vq1 vq1Var = vq1.OooO00o;
        Object obj2 = this.OooO0o0;
        Object obj3 = this.OooO0o;
        switch (i) {
            case 0:
                e80 e80Var = (e80) obj3;
                g80 g80Var = (g80) obj2;
                ArrayList arrayList = new ArrayList();
                for (k2 k2Var : (List) obj) {
                    if (k2Var.OooO0o.OooO0o0.OooO0o.size() != 0) {
                        arrayList.add(k2Var);
                    }
                }
                if (arrayList.size() == 0) {
                    arrayList.add(e80Var);
                }
                qe qeVar = g80Var.Ooooo00;
                if (qeVar != null) {
                    qeVar.OooOOOO(arrayList);
                    return vq1Var;
                }
                ij0.OooO(sn2.OooO00o("UZ1d44mGKg==\n", "MPk8k/3jWGE=\n"));
                throw null;
            case 1:
                k81 k81Var = (k81) obj3;
                wa1 wa1Var = (wa1) obj;
                ProgressDialog progressDialog = ((g80) obj2).Ooooooo;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                }
                if (wa1Var.OooO0Oo()) {
                    e2.OooO0Oo("Backup Success: " + ((File) k81Var.OooO0Oo).getPath());
                } else {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    Throwable th = wa1Var.OooO0Oo;
                    if (th != null) {
                        th.printStackTrace(printWriter);
                    }
                    e2.OooO0Oo(stringWriter.getBuffer().toString());
                }
                return vq1Var;
            default:
                ArrayList arrayList2 = (ArrayList) obj2;
                mc1 mc1Var = (mc1) obj;
                Object obj4 = ((e81) obj3).OooO0o;
                mc1Var.getClass();
                rc1 rc1VarOooOOo0 = mc1Var.OooOOo0(sn2.OooO00o("I1lmp89UEf84N2enzUxw8y83fKzJTxHQCXhcjO5gEZgKSFyG/SxR0wV+W4KxYEPVB3ZcjPRuVtBG\nd0GN9mVf0EZ3Vo30bm7EE2dQgrFgU9UNflu96Wlc1Qo7VYflcFjCD3NqlvRtVNBGd1CM+V9F2Qdy\nVc79c17FGHRQgrFgVMgeZVSCsWBCxAtjQJH9KRHmK1tgp84gGY9GKBndsT8dj0YoGd2xPx2PRigZ\n3bQ=\n", "ahc14p0AMbA=\n"));
                try {
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj5 = arrayList2.get(i2);
                        i2++;
                        if (obj5 != null) {
                            v03.OooOOOo(rc1VarOooOOo0, obj5);
                            rc1VarOooOOo0.OooOOOo();
                            rc1VarOooOOo0.reset();
                        }
                    }
                    in2.OooO00o(rc1VarOooOOo0, null);
                    return null;
                } finally {
                }
        }
    }

    public /* synthetic */ b80(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o = obj;
        this.OooO0o0 = obj2;
    }
}

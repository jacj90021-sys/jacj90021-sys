package com.cmaster.cloner;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cb extends db {
    public final /* synthetic */ q02 OooO0o;
    public final /* synthetic */ int OooO0o0;

    public /* synthetic */ cb(q02 q02Var, int i) {
        this.OooO0o0 = i;
        this.OooO0o = q02Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.cmaster.cloner.db
    public final void OooO0O0() {
        int i = this.OooO0o0;
        int i2 = 0;
        q02 q02Var = this.OooO0o;
        switch (i) {
            case 0:
                WorkDatabase workDatabase = q02Var.OooO0OO;
                workDatabase.OooO0OO();
                try {
                    ArrayList arrayListOooO0oO = workDatabase.OooOo0o().OooO0oO();
                    int size = arrayListOooO0oO.size();
                    while (i2 < size) {
                        Object obj = arrayListOooO0oO.get(i2);
                        i2++;
                        db.OooO00o(q02Var, (String) obj);
                    }
                    workDatabase.OooOOo0();
                    workDatabase.OooOOO();
                    qd1.OooO00o(q02Var.OooO0O0, q02Var.OooO0OO, q02Var.OooO0o0);
                    return;
                } catch (Throwable th) {
                    workDatabase.OooOOO();
                    throw th;
                }
            default:
                WorkDatabase workDatabase2 = q02Var.OooO0OO;
                workDatabase2.OooO0OO();
                try {
                    ArrayList arrayListOooO0o = workDatabase2.OooOo0o().OooO0o();
                    int size2 = arrayListOooO0o.size();
                    while (i2 < size2) {
                        Object obj2 = arrayListOooO0o.get(i2);
                        i2++;
                        db.OooO00o(q02Var, (String) obj2);
                    }
                    workDatabase2.OooOOo0();
                    workDatabase2.OooOOO();
                    return;
                } catch (Throwable th2) {
                    workDatabase2.OooOOO();
                    throw th2;
                }
        }
    }
}

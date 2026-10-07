package com.cmaster.cloner;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bb extends db {
    public final /* synthetic */ UUID OooO0o;
    public final /* synthetic */ q02 OooO0o0;

    public bb(q02 q02Var, UUID uuid) {
        this.OooO0o0 = q02Var;
        this.OooO0o = uuid;
    }

    @Override // com.cmaster.cloner.db
    public final void OooO0O0() {
        q02 q02Var = this.OooO0o0;
        WorkDatabase workDatabase = q02Var.OooO0OO;
        workDatabase.OooO0OO();
        try {
            db.OooO00o(q02Var, this.OooO0o.toString());
            workDatabase.OooOOo0();
            workDatabase.OooOOO();
            qd1.OooO00o(q02Var.OooO0O0, q02Var.OooO0OO, q02Var.OooO0o0);
        } catch (Throwable th) {
            workDatabase.OooOOO();
            throw th;
        }
    }
}

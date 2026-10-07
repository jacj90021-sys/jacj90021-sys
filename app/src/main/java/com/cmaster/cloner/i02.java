package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i02 extends rb1 {
    @Override // com.cmaster.cloner.rb1
    public final void OooO00o(c30 c30Var) {
        c30Var.getClass();
        c30Var.OooO0OO();
        try {
            c30Var.OooOOO("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - 86400000) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            c30Var.OooOo00();
        } finally {
            c30Var.OooO();
        }
    }
}

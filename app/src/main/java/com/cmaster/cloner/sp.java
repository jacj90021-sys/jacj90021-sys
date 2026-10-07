package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sp extends qg1 {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp(tb1 tb1Var, int i) {
        super(tb1Var);
        this.OooO0Oo = i;
    }

    @Override // com.cmaster.cloner.qg1
    public final String OooO0O0() {
        switch (this.OooO0Oo) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:75|(2:164|(2:160|76))|(5:166|77|(2:80|78)|168|86)|157|90|101) */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b5, code lost:
    
        r0.printStackTrace();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01d2  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x01ad -> B:157:0x01b0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo(com.cmaster.cloner.j30 r17, java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 672
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.sp.OooO0Oo(com.cmaster.cloner.j30, java.lang.Object):void");
    }

    public final void OooO0o0(Object obj) {
        j30 j30VarOooO00o = OooO00o();
        try {
            OooO0Oo(j30VarOooO00o, obj);
            j30VarOooO00o.OooO0o0.executeInsert();
        } finally {
            OooO0OO(j30VarOooO00o);
        }
    }
}

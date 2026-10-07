package com.cmaster.cloner;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ao1 extends do1 {
    public final /* synthetic */ int OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao1(TopicsManager topicsManager, int i) {
        super(topicsManager);
        this.OooO0O0 = i;
    }

    @Override // com.cmaster.cloner.do1
    public GetTopicsRequest OooO00o(v40 v40Var) {
        switch (this.OooO0O0) {
            case 1:
                v40Var.getClass();
                GetTopicsRequest getTopicsRequestBuild = n6.OooO0oO().setAdsSdkName("com.google.android.gms.ads").setShouldRecordObservation(v40Var.OooO00o).build();
                getTopicsRequestBuild.getClass();
                return getTopicsRequestBuild;
            default:
                return super.OooO00o(v40Var);
        }
    }
}

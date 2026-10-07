package com.cmaster.cloner;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class do1 {
    public final TopicsManager OooO00o;

    public do1(TopicsManager topicsManager) {
        topicsManager.getClass();
        this.OooO00o = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object OooO0OO(com.cmaster.cloner.do1 r6, com.cmaster.cloner.v40 r7, com.cmaster.cloner.gj<? super com.cmaster.cloner.w40> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.cmaster.cloner.co1
            if (r0 == 0) goto L13
            r0 = r8
            com.cmaster.cloner.co1 r0 = (com.cmaster.cloner.co1) r0
            int r1 = r0.OooOO0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.OooOO0 = r1
            goto L18
        L13:
            com.cmaster.cloner.co1 r0 = new com.cmaster.cloner.co1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.OooO0oo
            int r1 = r0.OooOO0
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            com.cmaster.cloner.do1 r6 = r0.OooO0oO
            com.cmaster.cloner.ty2.OooO0O0(r8)
            goto L5d
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.cmaster.cloner.qa.OooO0o(r6)
            r6 = 0
            return r6
        L2e:
            com.cmaster.cloner.ty2.OooO0O0(r8)
            android.adservices.topics.GetTopicsRequest r7 = r6.OooO00o(r7)
            r0.OooO0oO = r6
            r0.OooOO0 = r2
            com.cmaster.cloner.gb r8 = new com.cmaster.cloner.gb
            com.cmaster.cloner.gj r0 = com.cmaster.cloner.gu2.OooO00o(r0)
            r8.<init>(r0, r2)
            r8.OooOo0()
            android.adservices.topics.TopicsManager r0 = r6.OooO00o
            com.cmaster.cloner.x2 r1 = new com.cmaster.cloner.x2
            r1.<init>(r2)
            com.cmaster.cloner.jj r2 = new com.cmaster.cloner.jj
            r2.<init>(r8)
            com.cmaster.cloner.n6.OooOo0o(r0, r7, r1, r2)
            java.lang.Object r8 = r8.OooOo00()
            com.cmaster.cloner.gk r7 = com.cmaster.cloner.gk.OooO0Oo
            if (r8 != r7) goto L5d
            return r7
        L5d:
            android.adservices.topics.GetTopicsResponse r7 = com.cmaster.cloner.n6.OooOO0O(r8)
            r6.getClass()
            r7.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = com.cmaster.cloner.n6.OooOOo0(r7)
            java.util.Iterator r7 = r7.iterator()
        L74:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L97
            java.lang.Object r8 = r7.next()
            android.adservices.topics.Topic r8 = com.cmaster.cloner.n6.OooOO0o(r8)
            com.cmaster.cloner.zn1 r0 = new com.cmaster.cloner.zn1
            long r1 = com.cmaster.cloner.n6.OooO0o0(r8)
            long r3 = com.cmaster.cloner.n6.OooOoO(r8)
            int r5 = com.cmaster.cloner.n6.OooO0O0(r8)
            r0.<init>(r1, r3, r5)
            r6.add(r0)
            goto L74
        L97:
            com.cmaster.cloner.w40 r7 = new com.cmaster.cloner.w40
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.do1.OooO0OO(com.cmaster.cloner.do1, com.cmaster.cloner.v40, com.cmaster.cloner.gj):java.lang.Object");
    }

    public GetTopicsRequest OooO00o(v40 v40Var) {
        v40Var.getClass();
        GetTopicsRequest getTopicsRequestBuild = n6.OooO0oO().setAdsSdkName("com.google.android.gms.ads").build();
        getTopicsRequestBuild.getClass();
        return getTopicsRequestBuild;
    }

    public Object OooO0O0(v40 v40Var, gj<? super w40> gjVar) {
        return OooO0OO(this, v40Var, gjVar);
    }
}

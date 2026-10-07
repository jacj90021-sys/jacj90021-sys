package com.cmaster.cloner;

import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nr0 extends sk1 implements e40 {
    public int OooO;
    public final /* synthetic */ int OooO0oo;
    public Object OooOO0;
    public final /* synthetic */ Object OooOO0O;
    public final /* synthetic */ Object OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(or0 or0Var, Uri uri, InputEvent inputEvent, gj gjVar) {
        super(gjVar);
        this.OooO0oo = 0;
        this.OooOO0 = or0Var;
        this.OooOO0O = uri;
        this.OooOO0o = inputEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[LOOP:0: B:24:0x0056->B:66:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    @Override // com.cmaster.cloner.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.nr0.OooO(java.lang.Object):java.lang.Object");
    }

    @Override // com.cmaster.cloner.e40
    public final Object OooO0oO(Object obj, Object obj2) {
        int i = this.OooO0oo;
        vq1 vq1Var = vq1.OooO00o;
        fk fkVar = (fk) obj;
        gj gjVar = (gj) obj2;
        switch (i) {
        }
        return ((nr0) OooO0oo(gjVar, fkVar)).OooO(vq1Var);
    }

    @Override // com.cmaster.cloner.h6
    public final gj OooO0oo(gj gjVar, Object obj) {
        int i = this.OooO0oo;
        Object obj2 = this.OooOO0o;
        Object obj3 = this.OooOO0O;
        switch (i) {
            case 0:
                return new nr0((or0) this.OooOO0, (Uri) obj3, (InputEvent) obj2, gjVar);
            case 1:
                return new nr0((k81) obj3, (f31) obj2, gjVar, 1);
            default:
                nr0 nr0Var = new nr0((of) obj3, (e40) obj2, gjVar, 2);
                nr0Var.OooOO0 = obj;
                return nr0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr0(Object obj, Object obj2, gj gjVar, int i) {
        super(gjVar);
        this.OooO0oo = i;
        this.OooOO0O = obj;
        this.OooOO0o = obj2;
    }
}

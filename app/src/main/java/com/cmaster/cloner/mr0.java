package com.cmaster.cloner;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mr0 {
    public final MeasurementManager OooO00o;

    public mr0(Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) n6.OooOOOo());
        systemService.getClass();
        this.OooO00o = n6.OooO0o(systemService);
    }

    public Object OooO00o(np npVar, gj<? super vq1> gjVar) {
        new gb(gu2.OooO00o(gjVar), 1).OooOo0();
        n6.OooOOoo();
        throw null;
    }

    public Object OooO0O0(gj<? super Integer> gjVar) {
        gb gbVar = new gb(gu2.OooO00o(gjVar), 1);
        gbVar.OooOo0();
        this.OooO00o.getMeasurementApiStatus(new x2(1), new jj(gbVar));
        return gbVar.OooOo00();
    }

    public Object OooO0OO(Uri uri, InputEvent inputEvent, gj<? super vq1> gjVar) throws Throwable {
        gb gbVar = new gb(gu2.OooO00o(gjVar), 1);
        gbVar.OooOo0();
        this.OooO00o.registerSource(uri, inputEvent, new x2(1), new jj(gbVar));
        Object objOooOo00 = gbVar.OooOo00();
        return objOooOo00 == gk.OooO0Oo ? objOooOo00 : vq1.OooO00o;
    }

    public Object OooO0Oo(Uri uri, gj<? super vq1> gjVar) throws Throwable {
        gb gbVar = new gb(gu2.OooO00o(gjVar), 1);
        gbVar.OooOo0();
        this.OooO00o.registerTrigger(uri, new x2(1), new jj(gbVar));
        Object objOooOo00 = gbVar.OooOo00();
        return objOooOo00 == gk.OooO0Oo ? objOooOo00 : vq1.OooO00o;
    }

    public Object OooO0o(cy1 cy1Var, gj<? super vq1> gjVar) {
        new gb(gu2.OooO00o(gjVar), 1).OooOo0();
        n6.OooOoo();
        throw null;
    }

    public Object OooO0o0(by1 by1Var, gj<? super vq1> gjVar) {
        new gb(gu2.OooO00o(gjVar), 1).OooOo0();
        n6.OooOoo0();
        throw null;
    }
}

package com.cmaster.cloner;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ip1 {
    public static volatile ym OooO0o0;
    public final ie OooO00o;
    public final ie OooO0O0;
    public final xo OooO0OO;
    public final yn1 OooO0Oo;

    public ip1(ie ieVar, ie ieVar2, xo xoVar, yn1 yn1Var, ho1 ho1Var) {
        this.OooO00o = ieVar;
        this.OooO0O0 = ieVar2;
        this.OooO0OO = xoVar;
        this.OooO0Oo = yn1Var;
        ((Executor) ho1Var.OooO0o0).execute(new u91(ho1Var, 13));
    }

    public static ip1 OooO00o() {
        ym ymVar = OooO0o0;
        if (ymVar != null) {
            return (ip1) ymVar.OooO0oo.get();
        }
        qa.OooO0o("Not initialized!");
        return null;
    }

    public static void OooO0O0(Context context) {
        if (OooO0o0 == null) {
            synchronized (ip1.class) {
                try {
                    if (OooO0o0 == null) {
                        hg hgVar = new hg();
                        context.getClass();
                        hgVar.OooO0o0 = context;
                        OooO0o0 = hgVar.OooO0Oo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final hx2 OooO0OO(ca caVar) {
        Set setUnmodifiableSet = caVar instanceof ca ? Collections.unmodifiableSet(ca.OooO0Oo) : Collections.singleton(new dw("proto"));
        caVar.getClass();
        String str = caVar.OooO00o;
        String str2 = caVar.OooO0O0;
        if (str2 == null) {
            str2 = "";
        }
        return new hx2(setUnmodifiableSet, new g5("cct", rj.OooO0o0("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8")), s41.OooO0Oo), this, 19);
    }
}

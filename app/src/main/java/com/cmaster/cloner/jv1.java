package com.cmaster.cloner;

import android.os.Bundle;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jv1 {
    public static final jv1 OooO0O0;
    public static final String OooO0OO = sn2.OooO00o("yUTeomM=\n", "6i2wxAwJpaA=\n");
    public final iv1 OooO00o;

    static {
        sn2.OooO00o("X/K0sKM=\n", "fJHVwsfFv20=\n");
        OooO0O0 = new jv1(e2.OooO.OooO00o.getDatabasePath(sn2.OooO00o("cDMV9nieAt9vLgLvfg==\n", "Blpngg3/boA=\n")));
    }

    public jv1(File file) {
        this.OooO00o = new iv1(file);
    }

    public final synchronized qj0 OooO00o(int i, String str) {
        Object obj;
        qj0 qj0Var;
        String str2 = str + sn2.OooO00o("QQ==\n", "AdgYKfWLBRs=\n") + i;
        iv1 iv1Var = this.OooO00o;
        String str3 = OooO0OO;
        ye1 ye1Var = iv1Var.OooO0Oo;
        ye1Var.getClass();
        if (((Executor) ye1.OooO0oo.get()) != ye1Var) {
            iv1Var.OooO0O0.block();
        }
        synchronized (iv1Var.OooO0OO) {
            try {
                Map map = (Map) iv1Var.OooO0OO.get(str3);
                obj = map != null ? map.get(str2) : null;
            } finally {
            }
        }
        qj0Var = (qj0) obj;
        if (qj0Var == null) {
            qj0Var = new qj0(str, i, new Bundle());
            this.OooO00o.OooO0Oo(str3, str2, qj0Var);
        }
        return qj0Var;
    }
}

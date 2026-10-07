package com.cmaster.cloner;

import android.content.SharedPreferences;
import java.util.Random;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class do0 {
    public static final do0 OooO0OO;
    public long OooO00o;
    public long OooO0O0;

    static {
        do0 do0Var = new do0();
        SharedPreferences sharedPreferences = e2.OooO.OooO00o.getSharedPreferences(sn2.OooO00o("3VaChx8oBi/SVpSIBw==\n", "sTnh5nN3Z0w=\n"), 0);
        long j = sharedPreferences.getLong(sn2.OooO00o("eho4n6ypZidnHSaO\n", "E3RL683FCng=\n"), 0L);
        do0Var.OooO00o = j;
        sharedPreferences.getLong(sn2.OooO00o("gwzTcra+mzq7HdR6oQ==\n", "5Gm9F8Tf718=\n"), 0L);
        long j2 = sharedPreferences.getLong(sn2.OooO00o("JjF3joZXVoYzO2GY\n", "UFQF/e84ONk=\n"), 0L);
        long j3 = sharedPreferences.getLong(sn2.OooO00o("74hh9zhg5hzzlWA=\n", "mvgFlkwFuWg=\n"), 0L);
        do0Var.OooO0O0 = j3;
        if (j == 0) {
            long j4 = e2.OooO00o().versionCode;
            long j5 = e2.OooO00o().firstInstallTime;
            do0Var.OooO00o = j5;
            long j6 = e2.OooO00o().lastUpdateTime;
            do0Var.OooO0O0 = j6;
            if (j5 == 0) {
                do0Var.OooO00o = System.currentTimeMillis();
            }
            if (j6 == 0) {
                do0Var.OooO0O0 = System.currentTimeMillis();
            }
            sharedPreferences.edit().putLong(sn2.OooO00o("07wjQCi7WiHOuz1R\n", "utJQNEnXNn4=\n"), do0Var.OooO00o).putLong(sn2.OooO00o("kzfpRwgno3erJu5PHw==\n", "9FKHInpG1xI=\n"), System.currentTimeMillis()).putLong(sn2.OooO00o("6P9PQi859hX04k4=\n", "nY8rI1tcqWE=\n"), do0Var.OooO0O0).putLong(sn2.OooO00o("SkCVakT7/gFfSoN8\n", "PCXnGS2UkF4=\n"), j4).apply();
        } else if (j2 != e2.OooO00o().versionCode) {
            sharedPreferences.edit().putLong(sn2.OooO00o("9UFnuYqElZDpXGY=\n", "gDED2P7hyuQ=\n"), j3).apply();
        }
        new Random();
        OooO0OO = do0Var;
    }

    public final boolean OooO00o(int i) {
        return ((long) (i * 86400)) * 1000 > System.currentTimeMillis() - this.OooO0O0;
    }
}

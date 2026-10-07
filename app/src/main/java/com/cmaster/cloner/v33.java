package com.cmaster.cloner;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class v33 {
    public static bd1 OooO00o(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            bd1 bd1Var = new bd1();
            new LinkedHashMap();
            bd1Var.OooO00o = new yo(pv.OooO0Oo);
            return bd1Var;
        }
        ClassLoader classLoader = bd1.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        tp0 tp0Var = new tp0(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            tp0Var.put(str, bundle.get(str));
        }
        tp0 tp0VarOooO0O0 = tp0Var.OooO0O0();
        bd1 bd1Var2 = new bd1();
        new LinkedHashMap();
        bd1Var2.OooO00o = new yo(tp0VarOooO0O0);
        return bd1Var2;
    }
}

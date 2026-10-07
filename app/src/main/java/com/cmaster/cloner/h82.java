package com.cmaster.cloner;

import android.os.Bundle;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h82 {
    public static final gu0 OooO00o = new gu0(12);
    public static final vu0 OooO0O0 = new vu0(12);
    public static final im2 OooO0OO = new im2();

    public static final bd1 OooO00o(fv0 fv0Var) {
        LinkedHashMap linkedHashMap = fv0Var.OooO00o;
        jd1 jd1Var = (jd1) linkedHashMap.get(OooO00o);
        Bundle bundle = null;
        if (jd1Var == null) {
            ra.OooOOO("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        eu1 eu1Var = (eu1) linkedHashMap.get(OooO0O0);
        if (eu1Var == null) {
            ra.OooOOO("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(OooO0OO);
        String str = (String) linkedHashMap.get(cu1.OooO0O0);
        if (str == null) {
            ra.OooOOO("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        gd1 gd1VarOooo000 = jd1Var.OooO0Oo().Oooo000();
        dd1 dd1Var = gd1VarOooo000 instanceof dd1 ? (dd1) gd1VarOooo000 : null;
        if (dd1Var == null) {
            qa.OooO0o("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = OooO0OO(eu1Var).OooO0o0;
        bd1 bd1Var = (bd1) linkedHashMap2.get(str);
        if (bd1Var != null) {
            return bd1Var;
        }
        dd1Var.OooO0O0();
        Bundle bundle3 = dd1Var.OooO0OO;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = co2.OooO00o((k21[]) Arrays.copyOf(new k21[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                dd1Var.OooO0OO = null;
            }
            bundle = bundle4;
        }
        bd1 bd1VarOooO00o = v33.OooO00o(bundle, bundle2);
        linkedHashMap2.put(str, bd1VarOooO00o);
        return bd1VarOooO00o;
    }

    public static final void OooO0O0(jd1 jd1Var) {
        xl0 xl0Var = jd1Var.OooO0o().OooO0o;
        if (xl0Var != xl0.OooO0o0 && xl0Var != xl0.OooO0o) {
            ra.OooOOO("Failed requirement.");
        } else if (jd1Var.OooO0Oo().Oooo000() == null) {
            dd1 dd1Var = new dd1(jd1Var.OooO0Oo(), (eu1) jd1Var);
            jd1Var.OooO0Oo().o000oOoO("androidx.lifecycle.internal.SavedStateHandlesProvider", dd1Var);
            jd1Var.OooO0o().OooO0OO(new v61(dd1Var, 4));
        }
    }

    public static final ed1 OooO0OO(eu1 eu1Var) {
        gp gpVar = new gp(1);
        nk nkVarOooO0O0 = eu1Var instanceof j70 ? ((j70) eu1Var).OooO0O0() : mk.OooO0O0;
        nkVarOooO0O0.getClass();
        du1 du1VarOooO0OO = eu1Var.OooO0OO();
        du1VarOooO0OO.getClass();
        return (ed1) new ho1(du1VarOooO0OO, gpVar, nkVarOooO0O0).OooOoo0(r81.OooO00o(ed1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}

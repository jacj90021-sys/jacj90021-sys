package com.cmaster.cloner;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.window.OnBackInvokedDispatcher;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v61 implements cm0 {
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o0;

    public /* synthetic */ v61(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }

    @Override // com.cmaster.cloner.cm0
    public final void OooO0o(hm0 hm0Var, wl0 wl0Var) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view;
        int i = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i) {
            case 0:
                jd1 jd1Var = (jd1) obj;
                if (wl0Var != wl0.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                hm0Var.OooO0o().OooOOOO(this);
                Bundle bundleOooO0o = jd1Var.OooO0Oo().OooO0o("androidx.savedstate.Restarter");
                if (bundleOooO0o == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleOooO0o.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    qa.OooO0o("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, v61.class.getClassLoader()).asSubclass(fd1.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                if (!(jd1Var instanceof eu1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + jd1Var).toString());
                                }
                                du1 du1VarOooO0OO = ((eu1) jd1Var).OooO0OO();
                                o0O000O o0o000oOooO0Oo = jd1Var.OooO0Oo();
                                du1VarOooO0OO.getClass();
                                LinkedHashMap linkedHashMap = du1VarOooO0OO.OooO00o;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    yt1 yt1Var = (yt1) linkedHashMap.get(str3);
                                    if (yt1Var != null) {
                                        hv2.OooO00o(yt1Var, o0o000oOooO0Oo, jd1Var.OooO0o());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    o0o000oOooO0Oo.OoooOOO();
                                }
                            } catch (Exception e) {
                                qa.OooO0oO(rj.OooO0OO("Failed to instantiate ", str2), e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        qa.OooO0oO(px0.OooOOOO("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case 1:
                if (wl0Var != wl0.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                xy0 xy0Var = ((fg) obj).OooOO0O;
                OnBackInvokedDispatcher onBackInvokedDispatcherOooO00o = bg.OooO00o((fg) hm0Var);
                xy0Var.getClass();
                onBackInvokedDispatcherOooO00o.getClass();
                xy0Var.OooO0o0 = onBackInvokedDispatcherOooO00o;
                xy0Var.OooO0O0(xy0Var.OooO0oO);
                return;
            case 2:
                new HashMap();
                p40[] p40VarArr = (p40[]) obj;
                if (p40VarArr.length > 0) {
                    p40 p40Var = p40VarArr[0];
                    throw null;
                }
                if (p40VarArr.length <= 0) {
                    return;
                }
                p40 p40Var2 = p40VarArr[0];
                throw null;
            case 3:
                if (wl0Var != wl0.ON_STOP || (view = ((o10) obj).Oooo0) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            default:
                if (wl0Var == wl0.ON_CREATE) {
                    hm0Var.OooO0o().OooOOOO(this);
                    ((dd1) obj).OooO0O0();
                    return;
                } else {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + wl0Var).toString());
                }
        }
    }
}

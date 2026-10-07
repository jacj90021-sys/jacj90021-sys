package com.cmaster.cloner;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kd1 implements bu1 {
    public final Application OooO0Oo;
    public final Bundle OooO0o;
    public final au1 OooO0o0;
    public final jm0 OooO0oO;
    public final o0O000O OooO0oo;

    public kd1(Application application, jd1 jd1Var, Bundle bundle) {
        au1 au1Var;
        this.OooO0oo = jd1Var.OooO0Oo();
        this.OooO0oO = jd1Var.OooO0o();
        this.OooO0o = bundle;
        this.OooO0Oo = application;
        if (application != null) {
            if (au1.OooOO0 == null) {
                au1.OooOO0 = new au1(application);
            }
            au1Var = au1.OooOO0;
            au1Var.getClass();
        } else {
            au1Var = new au1(null);
        }
        this.OooO0o0 = au1Var;
    }

    public final yt1 OooO00o(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        jm0 jm0Var = this.OooO0oO;
        if (jm0Var == null) {
            sa.OooO0oO("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
            return null;
        }
        boolean zIsAssignableFrom = oO0O0O0o.class.isAssignableFrom(cls);
        Constructor constructorOooO00o = (!zIsAssignableFrom || this.OooO0Oo == null) ? ld1.OooO00o(cls, ld1.OooO0O0) : ld1.OooO00o(cls, ld1.OooO00o);
        if (constructorOooO00o == null) {
            if (this.OooO0Oo != null) {
                return this.OooO0o0.OooO0OO(cls);
            }
            if (v03.OooO0oo == null) {
                v03.OooO0oo = new v03();
            }
            v03.OooO0oo.getClass();
            return su2.OooO00o(cls);
        }
        o0O000O o0o000o = this.OooO0oo;
        o0o000o.getClass();
        bd1 bd1VarOooO00o = v33.OooO00o(o0o000o.OooO0o(str), this.OooO0o);
        cd1 cd1Var = new cd1(str, bd1VarOooO00o);
        cd1Var.OooO0OO(o0o000o, jm0Var);
        xl0 xl0Var = jm0Var.OooO0o;
        if (xl0Var == xl0.OooO0o0 || xl0Var.compareTo(xl0.OooO0oO) >= 0) {
            o0o000o.OoooOOO();
        } else {
            jm0Var.OooO0OO(new so(o0o000o, jm0Var));
        }
        yt1 yt1VarOooO0O0 = (!zIsAssignableFrom || (application = this.OooO0Oo) == null) ? ld1.OooO0O0(cls, constructorOooO00o, bd1VarOooO00o) : ld1.OooO0O0(cls, constructorOooO00o, application, bd1VarOooO00o);
        yt1VarOooO0O0.getClass();
        zt1 zt1Var = yt1VarOooO0O0.OooO0Oo;
        if (zt1Var == null) {
            return yt1VarOooO0O0;
        }
        if (zt1Var.OooO0Oo) {
            zt1.OooO00o(cd1Var);
            return yt1VarOooO0O0;
        }
        synchronized (zt1Var.OooO00o) {
            autoCloseable = (AutoCloseable) zt1Var.OooO0O0.put("androidx.lifecycle.savedstate.vm.tag", cd1Var);
        }
        zt1.OooO00o(autoCloseable);
        return yt1VarOooO0O0;
    }

    @Override // com.cmaster.cloner.bu1
    public final yt1 OooO0OO(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return OooO00o(cls, canonicalName);
        }
        ra.OooOOO("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override // com.cmaster.cloner.bu1
    public final yt1 OooO0Oo(rd rdVar, fv0 fv0Var) {
        Class cls = rdVar.OooO00o;
        cls.getClass();
        return OooOOO(cls, fv0Var);
    }

    @Override // com.cmaster.cloner.bu1
    public final yt1 OooOOO(Class cls, fv0 fv0Var) {
        LinkedHashMap linkedHashMap = fv0Var.OooO00o;
        String str = (String) linkedHashMap.get(cu1.OooO0O0);
        if (str == null) {
            qa.OooO0o("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
            return null;
        }
        if (linkedHashMap.get(h82.OooO00o) == null || linkedHashMap.get(h82.OooO0O0) == null) {
            if (this.OooO0oO != null) {
                return OooO00o(cls, str);
            }
            qa.OooO0o("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
            return null;
        }
        Application application = (Application) linkedHashMap.get(au1.OooOO0O);
        boolean zIsAssignableFrom = oO0O0O0o.class.isAssignableFrom(cls);
        Constructor constructorOooO00o = (!zIsAssignableFrom || application == null) ? ld1.OooO00o(cls, ld1.OooO0O0) : ld1.OooO00o(cls, ld1.OooO00o);
        return constructorOooO00o == null ? this.OooO0o0.OooOOO(cls, fv0Var) : (!zIsAssignableFrom || application == null) ? ld1.OooO0O0(cls, constructorOooO00o, h82.OooO00o(fv0Var)) : ld1.OooO0O0(cls, constructorOooO00o, application, h82.OooO00o(fv0Var));
    }
}

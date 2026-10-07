package com.cmaster.cloner;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class au1 extends v03 {
    public static au1 OooOO0;
    public static final im2 OooOO0O = new im2();
    public final Application OooO;

    public au1(Application application) {
        this.OooO = application;
    }

    @Override // com.cmaster.cloner.v03, com.cmaster.cloner.bu1
    public final yt1 OooO0OO(Class cls) {
        Application application = this.OooO;
        if (application != null) {
            return OooOOoo(cls, application);
        }
        sa.OooO0oO("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // com.cmaster.cloner.v03, com.cmaster.cloner.bu1
    public final yt1 OooOOO(Class cls, fv0 fv0Var) {
        if (this.OooO != null) {
            return OooO0OO(cls);
        }
        Application application = (Application) fv0Var.OooO00o.get(OooOO0O);
        if (application != null) {
            return OooOOoo(cls, application);
        }
        if (!oO0O0O0o.class.isAssignableFrom(cls)) {
            return su2.OooO00o(cls);
        }
        ra.OooOOO("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final yt1 OooOOoo(Class cls, Application application) {
        if (!oO0O0O0o.class.isAssignableFrom(cls)) {
            return su2.OooO00o(cls);
        }
        try {
            yt1 yt1Var = (yt1) cls.getConstructor(Application.class).newInstance(application);
            yt1Var.getClass();
            return yt1Var;
        } catch (IllegalAccessException e) {
            ra.OooOO0O("Cannot create an instance of ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            ra.OooOO0O("Cannot create an instance of ", cls, e2);
            return null;
        } catch (NoSuchMethodException e3) {
            ra.OooOO0O("Cannot create an instance of ", cls, e3);
            return null;
        } catch (InvocationTargetException e4) {
            ra.OooOO0O("Cannot create an instance of ", cls, e4);
            return null;
        }
    }
}

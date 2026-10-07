package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ns1 {
    public final k3 OooO00o;
    public final k3 OooO0O0;
    public final k3 OooO0OO;

    public ns1(k3 k3Var, k3 k3Var2, k3 k3Var3) {
        this.OooO00o = k3Var;
        this.OooO0O0 = k3Var2;
        this.OooO0OO = k3Var3;
    }

    public final void OooO(ps1 ps1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (ps1Var == null) {
            ((os1) this).OooO0o0.writeString(null);
            return;
        }
        try {
            ((os1) this).OooO0o0.writeString(OooO0O0(ps1Var.getClass()).getName());
            os1 os1VarOooO00o = OooO00o();
            try {
                OooO0Oo(ps1Var.getClass()).invoke(null, ps1Var, os1VarOooO00o);
                Parcel parcel = os1VarOooO00o.OooO0o0;
                int i = os1VarOooO00o.OooO;
                if (i >= 0) {
                    int i2 = os1VarOooO00o.OooO0Oo.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                qa.OooO0oO("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                qa.OooO0oO("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                qa.OooO0oO("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                qa.OooO0oO("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            qa.OooO0oO(ps1Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract os1 OooO00o();

    public final Class OooO0O0(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        k3 k3Var = this.OooO0OO;
        Class cls2 = (Class) k3Var.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        k3Var.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method OooO0OO(String str) throws NoSuchMethodException, SecurityException {
        k3 k3Var = this.OooO00o;
        Method method = (Method) k3Var.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, ns1.class.getClassLoader()).getDeclaredMethod("read", ns1.class);
        k3Var.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method OooO0Oo(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        k3 k3Var = this.OooO0O0;
        Method method = (Method) k3Var.get(name);
        if (method != null) {
            return method;
        }
        Class clsOooO0O0 = OooO0O0(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsOooO0O0.getDeclaredMethod("write", cls, ns1.class);
        k3Var.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Parcelable OooO0o(Parcelable parcelable, int i) {
        if (!OooO0o0(i)) {
            return parcelable;
        }
        return ((os1) this).OooO0o0.readParcelable(os1.class.getClassLoader());
    }

    public abstract boolean OooO0o0(int i);

    public final ps1 OooO0oO() {
        String string = ((os1) this).OooO0o0.readString();
        if (string == null) {
            return null;
        }
        try {
            return (ps1) OooO0OO(string).invoke(null, OooO00o());
        } catch (ClassNotFoundException e) {
            qa.OooO0oO("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            qa.OooO0oO("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            qa.OooO0oO("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            qa.OooO0oO("VersionedParcel encountered InvocationTargetException", e4);
            return null;
        }
    }

    public abstract void OooO0oo(int i);
}

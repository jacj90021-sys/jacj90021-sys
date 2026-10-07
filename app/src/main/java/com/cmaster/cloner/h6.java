package com.cmaster.cloner;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h6 implements gj, hk, Serializable {
    public final gj OooO0Oo;

    public h6(gj gjVar) {
        this.OooO0Oo = gjVar;
    }

    public abstract Object OooO(Object obj);

    @Override // com.cmaster.cloner.hk
    public final hk OooO0OO() {
        gj gjVar = this.OooO0Oo;
        if (gjVar instanceof hk) {
            return (hk) gjVar;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.gj
    public final void OooO0Oo(Object obj) {
        while (true) {
            h6 h6Var = this;
            gj gjVar = h6Var.OooO0Oo;
            gjVar.getClass();
            try {
                obj = h6Var.OooO(obj);
                if (obj == gk.OooO0Oo) {
                    return;
                }
            } catch (Throwable th) {
                obj = new bb1(th);
            }
            h6Var.OooOO0o();
            if (!(gjVar instanceof h6)) {
                gjVar.OooO0Oo(obj);
                return;
            }
            this = gjVar;
        }
    }

    public gj OooO0oo(gj gjVar, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void OooOO0o() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StackTraceElement] */
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        qn qnVar = (qn) getClass().getAnnotation(qn.class);
        String name = null;
        if (qnVar != null) {
            int iV = qnVar.v();
            if (iV > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? qnVar.l()[iIntValue] : -1;
            pu0 pu0Var = x62.OooO0Oo;
            pu0 pu0Var2 = x62.OooO0OO;
            if (pu0Var == null) {
                try {
                    pu0 pu0Var3 = new pu0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                    x62.OooO0Oo = pu0Var3;
                    pu0Var = pu0Var3;
                } catch (Exception unused2) {
                    x62.OooO0Oo = pu0Var2;
                    pu0Var = pu0Var2;
                }
            }
            if (pu0Var != pu0Var2 && (method = pu0Var.OooO00o) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = pu0Var.OooO0O0) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = pu0Var.OooO0OO;
                String strInvoke = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (strInvoke instanceof String) {
                    name = strInvoke;
                }
            }
            if (name == null) {
                strC = qnVar.c();
            } else {
                strC = name + '/' + qnVar.c();
            }
            name = new StackTraceElement(strC, qnVar.m(), qnVar.f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append((Object) name);
        return sb.toString();
    }
}

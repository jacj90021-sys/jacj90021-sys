package com.cmaster.cloner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class yq implements dy0 {
    public static final Object OooOO0 = new Object();
    public Exception OooO;
    public Object OooO0Oo;
    public Object[] OooO0o;
    public Method OooO0o0;
    public Object OooO0oO = OooOO0;
    public boolean OooO0oo;

    public static yq OooO0o0(Object obj, Method method, Object[] objArr) {
        yq yqVar = (yq) cy0.OooO00o(yq.class);
        if (yqVar == null) {
            yqVar = new yq();
        }
        yqVar.OooO0Oo = obj;
        yqVar.OooO0o0 = method;
        yqVar.OooO0o = objArr;
        return yqVar;
    }

    public boolean OooO00o() {
        if (!this.OooO0oo) {
            this.OooO0oo = true;
            try {
                this.OooO0oO = this.OooO0o0.invoke(this.OooO0Oo, this.OooO0o);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof Exception) {
                    this.OooO = (Exception) e.getTargetException();
                }
            } catch (Throwable th) {
                this.OooO = new SecurityException(th);
            }
        }
        return this.OooO == null;
    }

    public final boolean OooO0O0() {
        return this.OooO != null;
    }

    public final int OooO0OO(int i, Class cls) {
        Class<?>[] parameterTypes = this.OooO0o0.getParameterTypes();
        while (i < parameterTypes.length) {
            if (parameterTypes[i] == cls) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final int OooO0Oo(Class cls) {
        Class<?>[] parameterTypes = this.OooO0o0.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i] == cls) {
                return i;
            }
        }
        return -1;
    }

    public final Class OooO0o(int i) {
        Class<?>[] parameterTypes = this.OooO0o0.getParameterTypes();
        if (i < 0 || i >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i];
    }

    public final Object OooO0oO() throws Exception {
        if (!this.OooO0oo) {
            OooO00o();
        }
        Exception exc = this.OooO;
        if (exc != null) {
            throw exc;
        }
        Object obj = this.OooO0oO;
        if (obj != OooOO0) {
            return obj;
        }
        return null;
    }

    public final void OooO0oo(Object obj) {
        this.OooO0oo = true;
        this.OooO = null;
        this.OooO0oO = obj;
    }
}

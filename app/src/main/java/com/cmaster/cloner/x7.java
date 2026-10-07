package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;
import android.util.SparseArray;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class x7 extends i80 {
    public volatile a02 OooO;
    public final Class OooO0OO;
    public final Class OooO0Oo;
    public final SparseArray OooO0o;
    public final String OooO0o0;
    public HashMap OooO0oO;
    public z7 OooO0oo;
    public volatile IInterface OooOO0;

    public x7(String str, String str2) throws ClassNotFoundException {
        Class<?> cls;
        Class<?> cls2;
        try {
            cls = Class.forName(str2);
        } catch (Exception unused) {
            cls = null;
        }
        if (cls == null) {
            cls2 = null;
        } else {
            try {
                cls2 = Class.forName(cls.getName().concat(u7.OooO00o(new byte[]{108, -106, -111, 73, -37}, new byte[]{72, -59, -27, 60, -71, -111, 36, 12})));
            } catch (Exception unused2) {
            }
        }
        this.OooO0o = new SparseArray();
        this.OooO0oO = new HashMap();
        new HashMap();
        if (cls == null || cls2 == null) {
            this.OooO0o0 = null;
            this.OooO0Oo = null;
            this.OooO0OO = null;
        } else {
            this.OooO0o0 = str;
            this.OooO0Oo = cls;
            this.OooO0OO = cls2;
        }
    }

    public boolean OooO(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        st0 st0Var = (st0) this.OooO0o.get(i);
        if (st0Var == null) {
            u7.OooO00o(new byte[]{97, 77, -64, 78, 73, 81, -82, -41, 99, 92, -108, 78, 73, 90, -27, -36, 104}, new byte[]{12, 40, -76, 38, 38, 53, -114, -71});
            return false;
        }
        z7 z7Var = st0Var.OooO0O0;
        if (z7Var == null) {
            return false;
        }
        ThreadLocal threadLocal = st0.OooO0OO;
        st0 st0Var2 = (st0) threadLocal.get();
        threadLocal.set(st0Var);
        try {
            boolean zOooO00o = z7Var.OooO00o(iBinder, i, parcel, parcel2, i2);
            threadLocal.set(st0Var2);
            return zOooO00o;
        } catch (Throwable th) {
            st0.OooO0OO.set(st0Var2);
            throw th;
        }
    }

    @Override // com.cmaster.cloner.jo1
    public void OooO00o(yq yqVar) {
        yqVar.OooO00o();
    }

    public z7 OooO0o() {
        return new rq(this, wq.OooO00o);
    }

    public Pair OooO0o0(Class cls) {
        return a8.OooO00o(this.OooO0OO, false);
    }

    public IInterface OooO0oO(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = this.OooOO0;
        if (iInterface != null && iInterface.asBinder() == iBinder) {
            return iInterface;
        }
        a02 a02VarOooo0o0 = this.OooO;
        if (a02VarOooo0o0 == null) {
            a02VarOooo0o0 = a02.Oooo0o0(this.OooO0OO, u7.OooO00o(new byte[]{-108, -95, -121, -51, -92, 31, 40, -50, -108, -79, -85}, new byte[]{-11, -46, -50, -93, -48, 122, 90, -88}), IBinder.class);
            this.OooO = a02VarOooo0o0;
        }
        IInterface iInterface2 = (IInterface) a02VarOooo0o0.OooO0o0(iBinder);
        if (iInterface == null) {
            this.OooOO0 = iInterface2;
        }
        return iInterface2;
    }

    public final void OooO0oo() throws SecurityException {
        HashMap map;
        SparseArray sparseArray;
        Pair pairOooO0o0 = OooO0o0(this.OooO0OO);
        Map map2 = (Map) pairOooO0o0.first;
        Method[] declaredMethods = this.OooO0Oo.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            map = this.OooO00o;
            sparseArray = this.OooO0o;
            if (i >= length) {
                break;
            }
            Method method = declaredMethods[i];
            if (Modifier.isAbstract(method.getModifiers())) {
                String name = method.getName();
                Integer num = (Integer) map2.remove(name);
                if (num != null) {
                    jo1 jo1Var = (jo1) map.get(name);
                    if (jo1Var == null && OooO0OO()) {
                        jo1Var = this;
                    }
                    z7 z7Var = (z7) this.OooO0oO.get(name);
                    if (z7Var == null) {
                        if (this.OooO0oo == null) {
                            this.OooO0oo = OooO0o();
                        }
                        z7Var = this.OooO0oo;
                    }
                    if (jo1Var != null) {
                        sparseArray.put(num.intValue(), new st0(z7Var, jo1Var));
                    }
                }
            }
            i++;
        }
        for (Map.Entry entry : map2.entrySet()) {
            jo1 jo1Var2 = (jo1) map.get((String) entry.getKey());
            if (jo1Var2 == null && OooO0OO()) {
                jo1Var2 = this;
            }
            if (jo1Var2 != null) {
                z7 z7Var2 = (z7) this.OooO0oO.get((String) entry.getKey());
                if (z7Var2 == null) {
                    if (this.OooO0oo == null) {
                        this.OooO0oo = OooO0o();
                    }
                    z7Var2 = this.OooO0oo;
                }
                if (z7Var2 != null) {
                    sparseArray.put(((Integer) entry.getValue()).intValue(), new st0(z7Var2, jo1Var2));
                }
            }
        }
        this.OooO0oO = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x7(String str) throws ClassNotFoundException {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName(str);
        } catch (Exception unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                cls2 = Class.forName(cls.getName().concat(u7.OooO00o(new byte[]{62, 122, 41, -13, 46}, new byte[]{26, 41, 93, -122, 76, 111, -6, -60})));
            } catch (Exception unused2) {
            }
        }
        this(cls, cls2);
    }

    public x7(Class cls, Class cls2) {
        this.OooO0o = new SparseArray();
        this.OooO0oO = new HashMap();
        new HashMap();
        if (cls != null && cls2 != null) {
            this.OooO0o0 = cls.getName();
            this.OooO0Oo = cls;
            this.OooO0OO = cls2;
        } else {
            this.OooO0o0 = null;
            this.OooO0Oo = null;
            this.OooO0OO = null;
        }
    }
}

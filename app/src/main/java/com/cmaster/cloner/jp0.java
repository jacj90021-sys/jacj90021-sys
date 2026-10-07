package com.cmaster.cloner;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jp0 {
    public final e81 OooO00o = new e81(19);
    public final ip0 OooO0O0 = new ip0(0);
    public final HashMap OooO0OO = new HashMap();
    public final HashMap OooO0Oo = new HashMap();
    public int OooO0o;
    public final int OooO0o0;

    public jp0(int i) {
        this.OooO0o0 = i;
    }

    public final void OooO00o(int i, Class cls) {
        NavigableMap navigableMapOooO0o = OooO0o(cls);
        Integer num = (Integer) navigableMapOooO0o.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapOooO0o.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapOooO0o.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void OooO0O0(int i) {
        while (this.OooO0o > i) {
            Object objOooOoO0 = this.OooO00o.OooOoO0();
            zx2.OooO0O0(objOooOoO0);
            o9 o9VarOooO0Oo = OooO0Oo(objOooOoO0.getClass());
            this.OooO0o -= o9VarOooO0Oo.OooO0O0() * o9VarOooO0Oo.OooO00o(objOooOoO0);
            OooO00o(o9VarOooO0Oo.OooO00o(objOooOoO0), objOooOoO0.getClass());
            if (Log.isLoggable(o9VarOooO0Oo.OooO0OO(), 2)) {
                Log.v(o9VarOooO0Oo.OooO0OO(), "evicted: " + o9VarOooO0Oo.OooO00o(objOooOoO0));
            }
        }
    }

    public final synchronized Object OooO0OO(int i, Class cls) {
        hp0 hp0Var;
        int i2;
        try {
            Integer num = (Integer) OooO0o(cls).ceilingKey(Integer.valueOf(i));
            boolean z = num != null && ((i2 = this.OooO0o) == 0 || this.OooO0o0 / i2 >= 2 || num.intValue() <= i * 8);
            ip0 ip0Var = this.OooO0O0;
            if (z) {
                int iIntValue = num.intValue();
                g31 g31VarOooOO0O = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
                if (g31VarOooOO0O == null) {
                    g31VarOooOO0O = ip0Var.OooOO0O();
                }
                hp0Var = (hp0) g31VarOooOO0O;
                hp0Var.OooO0O0 = iIntValue;
                hp0Var.OooO0OO = cls;
            } else {
                g31 g31VarOooOO0O2 = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
                if (g31VarOooOO0O2 == null) {
                    g31VarOooOO0O2 = ip0Var.OooOO0O();
                }
                hp0Var = (hp0) g31VarOooOO0O2;
                hp0Var.OooO0O0 = i;
                hp0Var.OooO0OO = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0o0(hp0Var, cls);
    }

    public final o9 OooO0Oo(Class cls) {
        o9 o9Var;
        HashMap map = this.OooO0Oo;
        o9 o9Var2 = (o9) map.get(cls);
        if (o9Var2 != null) {
            return o9Var2;
        }
        if (cls.equals(int[].class)) {
            o9Var = new o9(1);
        } else {
            if (!cls.equals(byte[].class)) {
                ra.OooOOO("No array pool found for: ".concat(cls.getSimpleName()));
                return null;
            }
            o9Var = new o9(0);
        }
        map.put(cls, o9Var);
        return o9Var;
    }

    public final NavigableMap OooO0o(Class cls) {
        HashMap map = this.OooO0OO;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public final Object OooO0o0(hp0 hp0Var, Class cls) {
        o9 o9VarOooO0Oo = OooO0Oo(cls);
        Object objOooO = this.OooO00o.OooO(hp0Var);
        if (objOooO != null) {
            this.OooO0o -= o9VarOooO0Oo.OooO0O0() * o9VarOooO0Oo.OooO00o(objOooO);
            OooO00o(o9VarOooO0Oo.OooO00o(objOooO), cls);
        }
        if (objOooO != null) {
            return objOooO;
        }
        if (Log.isLoggable(o9VarOooO0Oo.OooO0OO(), 2)) {
            Log.v(o9VarOooO0Oo.OooO0OO(), "Allocated " + hp0Var.OooO0O0 + " bytes");
        }
        int i = hp0Var.OooO0O0;
        switch (o9VarOooO0Oo.OooO00o) {
            case 0:
                return new byte[i];
            default:
                return new int[i];
        }
    }

    public final synchronized void OooO0oO(Object obj) {
        Class<?> cls = obj.getClass();
        o9 o9VarOooO0Oo = OooO0Oo(cls);
        int iOooO00o = o9VarOooO0Oo.OooO00o(obj);
        int iOooO0O0 = o9VarOooO0Oo.OooO0O0() * iOooO00o;
        if (iOooO0O0 <= this.OooO0o0 / 2) {
            ip0 ip0Var = this.OooO0O0;
            g31 g31VarOooOO0O = (g31) ((ArrayDeque) ip0Var.OooO0Oo).poll();
            if (g31VarOooOO0O == null) {
                g31VarOooOO0O = ip0Var.OooOO0O();
            }
            hp0 hp0Var = (hp0) g31VarOooOO0O;
            hp0Var.OooO0O0 = iOooO00o;
            hp0Var.OooO0OO = cls;
            this.OooO00o.OooOo0o(hp0Var, obj);
            NavigableMap navigableMapOooO0o = OooO0o(cls);
            Integer num = (Integer) navigableMapOooO0o.get(Integer.valueOf(hp0Var.OooO0O0));
            Integer numValueOf = Integer.valueOf(hp0Var.OooO0O0);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapOooO0o.put(numValueOf, Integer.valueOf(iIntValue));
            this.OooO0o += iOooO0O0;
            OooO0O0(this.OooO0o0);
        }
    }
}

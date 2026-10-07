package com.cmaster.cloner;

import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xp1 {
    public static final xp1 OooO;
    public static final xp1 OooO0Oo;
    public static final xp1 OooO0o;
    public static final xp1 OooO0o0;
    public static final xp1 OooO0oO;
    public static final xp1 OooO0oo;
    public static final xp1 OooOO0;
    public static final xp1 OooOO0O;
    public static final xp1 OooOO0o;
    public static final xp1 OooOOO;
    public static final xp1 OooOOO0;
    public static final HashMap OooOOOO;
    public final String OooO00o;
    public final vp1 OooO0O0;
    public final nl OooO0OO;

    static {
        xp1 xp1Var = new xp1(vp1.OooOO0);
        OooO0Oo = xp1Var;
        xp1 xp1Var2 = new xp1(vp1.OooOO0O);
        OooO0o0 = xp1Var2;
        xp1 xp1Var3 = new xp1(vp1.OooOO0o);
        OooO0o = xp1Var3;
        xp1 xp1Var4 = new xp1(vp1.OooOOO0);
        OooO0oO = xp1Var4;
        xp1 xp1Var5 = new xp1(vp1.OooOOO);
        OooO0oo = xp1Var5;
        xp1 xp1Var6 = new xp1(vp1.OooOOOO);
        OooO = xp1Var6;
        xp1 xp1Var7 = new xp1(vp1.OooOOOo);
        OooOO0 = xp1Var7;
        xp1 xp1Var8 = new xp1(vp1.OooOOo0);
        OooOO0O = xp1Var8;
        xp1 xp1Var9 = new xp1(vp1.OooOOo);
        OooOO0o = xp1Var9;
        OooOOO0 = new xp1(vp1.OooOo);
        OooOOO = new xp1(vp1.OooOoO0);
        HashMap map = new HashMap();
        OooOOOO = map;
        map.put(Boolean.TYPE, xp1Var);
        map.put(Byte.TYPE, xp1Var2);
        map.put(Character.TYPE, xp1Var3);
        map.put(Double.TYPE, xp1Var4);
        map.put(Float.TYPE, xp1Var5);
        map.put(Integer.TYPE, xp1Var6);
        map.put(Long.TYPE, xp1Var7);
        map.put(Short.TYPE, xp1Var8);
        map.put(Void.TYPE, xp1Var9);
    }

    public xp1(String str, vp1 vp1Var) {
        if (str == null || vp1Var == null) {
            throw null;
        }
        this.OooO00o = str;
        this.OooO0O0 = vp1Var;
        nl nlVar = new nl(vp1Var);
        nl nlVar2 = (nl) nl.OooO0o.putIfAbsent(vp1Var, nlVar);
        this.OooO0OO = nlVar2 != null ? nlVar2 : nlVar;
    }

    public static xp1 OooO00o(Class cls) {
        if (cls.isPrimitive()) {
            return (xp1) OooOOOO.get(cls);
        }
        String strReplace = cls.getName().replace('.', '/');
        if (!cls.isArray()) {
            strReplace = "L" + strReplace + ';';
        }
        return new xp1(strReplace, vp1.OooO0oO(strReplace));
    }

    public final tt0 OooO0O0(xp1... xp1VarArr) {
        return new tt0(this, OooOO0o, u7.OooO00o(new byte[]{75, -35, -105, -109, 109, -45}, new byte[]{119, -76, -7, -6, 25, -19, -57, -15}), new bq1(xp1VarArr));
    }

    public final tt0 OooO0OO(xp1 xp1Var, String str, xp1... xp1VarArr) {
        return new tt0(this, xp1Var, str, new bq1(xp1VarArr));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof xp1) && ((xp1) obj).OooO00o.equals(this.OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return this.OooO00o;
    }

    public xp1(vp1 vp1Var) {
        this(vp1Var.OooO0Oo, vp1Var);
    }
}

package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rd implements nd {
    public static final Map OooO0O0;
    public final Class OooO00o;

    static {
        List listAsList = Arrays.asList(p30.class, a40.class, e40.class, nv0.class, z20.class, f40.class, g40.class, h40.class, i40.class, j40.class, q30.class, r30.class, s30.class, t30.class, u30.class, v30.class, w30.class, x30.class, y30.class, z30.class, b40.class, c40.class, d40.class);
        listAsList.getClass();
        ArrayList arrayList = new ArrayList(listAsList.size());
        int i = 0;
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new k21((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        OooO0O0 = xp0.OooO0O0(arrayList);
    }

    public rd(Class cls) {
        cls.getClass();
        this.OooO00o = cls;
    }

    @Override // com.cmaster.cloner.nd
    public final Class OooO00o() {
        return this.OooO00o;
    }

    public final String OooO0O0() {
        String strOooO00o;
        Class cls = this.OooO00o;
        cls.getClass();
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strOooO00o2 = mo2.OooO00o(cls.getName());
            return strOooO00o2 == null ? cls.getCanonicalName() : strOooO00o2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strOooO00o = mo2.OooO00o(componentType.getName())) != null) {
            strConcat = strOooO00o.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean OooO0OO(Object obj) {
        Class clsOooO00o = this.OooO00o;
        clsOooO00o.getClass();
        Map map = OooO0O0;
        map.getClass();
        Integer num = (Integer) map.get(clsOooO00o);
        if (num != null) {
            return zp1.OooO0O0(num.intValue(), obj);
        }
        if (clsOooO00o.isPrimitive()) {
            clsOooO00o = qu2.OooO00o(r81.OooO00o(clsOooO00o));
        }
        return clsOooO00o.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rd) && qu2.OooO00o(this).equals(qu2.OooO00o((rd) obj));
    }

    public final int hashCode() {
        return qu2.OooO00o(this).hashCode();
    }

    public final String toString() {
        return this.OooO00o + " (Kotlin reflection is not available)";
    }
}

package com.cmaster.cloner;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mm0 {
    public static final HashMap OooO00o = new HashMap();
    public static final HashMap OooO0O0 = new HashMap();

    public static void OooO00o(Constructor constructor, gm0 gm0Var) {
        try {
            constructor.newInstance(gm0Var).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0148 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO0O0(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.mm0.OooO0O0(java.lang.Class):int");
    }
}

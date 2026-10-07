package com.cmaster.cloner;

import android.os.ConditionVariable;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class oO00OOo0 {
    public static final oO00OOOo OooO0o;
    public static final Object OooO0o0;
    public final ConcurrentHashMap OooO00o = new ConcurrentHashMap();
    public final SparseArray OooO0O0 = new SparseArray();
    public final HashMap OooO0OO = new HashMap();
    public final LinkedHashSet OooO0Oo = new LinkedHashSet();

    public oO00OOo0() {
        new ConditionVariable();
        cx1.OooO0o.execute(new o00OOO00(this, 2));
    }

    public static native oO00OOo0 OooO0Oo();

    public final native b51 OooO00o(int i, String str, String str2);

    public final native oO00Oo0 OooO0O0(int i, String str, String str2, String str3);

    public final native oO00Oo0 OooO0OO(String str);

    public final native void OooO0o(oO00Oo0 oo00oo0);

    public final native b51 OooO0o0(int i);

    public final native void OooO0oO(IBinder iBinder, String str);

    public final native b51 OooO0oo(int i, String str, String str2);

    static {
        DexUtils.classesInit0(21);
        OooO0o0 = new Object();
        OooO0o = new oO00OOOo(0);
    }
}

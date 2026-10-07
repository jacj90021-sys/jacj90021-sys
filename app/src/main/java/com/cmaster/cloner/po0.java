package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class po0 {
    public static final WeakHashMap OooO00o = new WeakHashMap();
    public static final HashMap OooO0O0 = new HashMap();

    public static Object OooO00o(IBinder iBinder) {
        Object obj;
        WeakHashMap weakHashMap = OooO00o;
        synchronized (weakHashMap) {
            obj = weakHashMap.get(iBinder);
        }
        w7 w7Var = (w7) obj;
        if (w7Var == null) {
            return null;
        }
        return w7Var.OooO0O0;
    }

    public static void OooO0O0(IInterface iInterface, Parcelable parcelable) {
        IBinder iBinderAsBinder = iInterface.asBinder();
        w7 w7Var = new w7(iInterface, parcelable);
        WeakHashMap weakHashMap = OooO00o;
        synchronized (weakHashMap) {
            weakHashMap.put(iBinderAsBinder, w7Var);
        }
    }
}

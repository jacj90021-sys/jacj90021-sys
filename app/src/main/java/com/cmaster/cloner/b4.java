package com.cmaster.cloner;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.ArrayMap;
import android.util.LruCache;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b4 {
    public static final b4 OooO0Oo = new b4(e92.OooO00o);
    public final Context OooO00o;
    public final LruCache OooO0O0 = new LruCache(4);
    public a4 OooO0OO;

    public b4(Context context) {
        new Configuration();
        this.OooO00o = context;
    }

    public final y3 OooO00o(String str, int i, int[] iArr) {
        ArrayMap arrayMap;
        y3 y3Var;
        synchronized (this) {
            try {
                z3 z3Var = (z3) this.OooO0O0.get(str);
                if (z3Var != null) {
                    arrayMap = (ArrayMap) z3Var.OooO0OO.get(i);
                    if (arrayMap != null && (y3Var = (y3) arrayMap.get(iArr)) != null) {
                        return y3Var;
                    }
                } else {
                    Resources resources = this.OooO00o.getResources();
                    c21 c21VarO00O00Oo = ox1.o0O0ooO().o00O00Oo(str);
                    if (c21VarO00O00Oo == null) {
                        return null;
                    }
                    o00OO000 o00oo000 = q3.OooO00o;
                    try {
                        AssetManager assetManager = (AssetManager) AssetManager.class.newInstance();
                        z3Var = new z3(new Resources(assetManager, resources.getDisplayMetrics(), resources.getConfiguration()));
                        this.OooO0O0.put(str, z3Var);
                        arrayMap = null;
                    } catch (Throwable th) {
                        throw new RuntimeException(th);
                    }
                }
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                    z3Var.OooO0OO.put(i, arrayMap);
                }
                try {
                    y3 y3Var2 = new y3(z3Var.OooO0O0.obtainStyledAttributes(i, iArr));
                    arrayMap.put(iArr, y3Var2);
                    return y3Var2;
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

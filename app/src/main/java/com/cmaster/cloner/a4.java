package com.cmaster.cloner;

import android.content.res.TypedArray;
import android.util.ArrayMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a4 implements n90 {
    @Override // com.cmaster.cloner.n90
    public final void OooO00o(int i, int i2, String str) {
        if (i == 8 || i == 4 || i == 16) {
            b4 b4Var = b4.OooO0Oo;
            synchronized (b4Var) {
                z3 z3Var = (z3) b4Var.OooO0O0.remove(str);
                if (z3Var != null) {
                    for (int i3 = 0; i3 < z3Var.OooO0OO.size(); i3++) {
                        ArrayMap arrayMap = (ArrayMap) z3Var.OooO0OO.valueAt(i3);
                        for (int i4 = 0; i4 < arrayMap.size(); i4++) {
                            TypedArray typedArray = ((y3) arrayMap.valueAt(i4)).OooO00o;
                            if (typedArray != null) {
                                typedArray.recycle();
                            }
                        }
                    }
                    try {
                        z3Var.OooO00o.flushLayoutCache();
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}

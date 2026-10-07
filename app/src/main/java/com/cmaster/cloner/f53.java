package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class f53 {
    public f53() {
        new ConcurrentHashMap();
    }

    public static c10 OooO0o0(c10[] c10VarArr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        c10 c10Var = null;
        int i3 = Integer.MAX_VALUE;
        for (c10 c10Var2 : c10VarArr) {
            int iAbs = (Math.abs(c10Var2.OooO0OO - i2) * 2) + (c10Var2.OooO0Oo == z ? 0 : 1);
            if (c10Var == null || i3 > iAbs) {
                c10Var = c10Var2;
                i3 = iAbs;
            }
        }
        return c10Var;
    }

    public abstract Typeface OooO00o(Context context, z00 z00Var, Resources resources, int i);

    public abstract Typeface OooO0O0(Context context, c10[] c10VarArr, int i);

    public Typeface OooO0OO(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) {
        File fileOooO0OO = g53.OooO0OO(context);
        if (fileOooO0OO == null) {
            return null;
        }
        try {
            if (g53.OooO00o(fileOooO0OO, resources, i)) {
                return Typeface.createFromFile(fileOooO0OO.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileOooO0OO.delete();
        }
    }
}

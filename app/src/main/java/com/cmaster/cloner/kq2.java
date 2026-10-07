package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class kq2 {
    public static volatile boolean OooO00o = true;

    public static Drawable OooO00o(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (OooO00o) {
                return OooO0O0(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            OooO00o = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = ta1.OooO00o;
        return resources.getDrawable(i, theme);
    }

    public static Drawable OooO0O0(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ej ejVar = new ej(context);
            ejVar.OooO0O0 = theme;
            ejVar.OooO00o(theme.getResources().getConfiguration());
            context = ejVar;
        }
        return ym2.OooO00o(context, i);
    }
}

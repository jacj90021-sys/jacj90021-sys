package com.cmaster.cloner;

import android.view.MenuItem;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dk1 implements MenuItem.OnMenuItemClickListener {
    public static final Class[] OooO0oO = {MenuItem.class};
    public final /* synthetic */ int OooO0Oo = 0;
    public Object OooO0o;
    public Object OooO0o0;

    public dk1(zs0 zs0Var, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.OooO0o = zs0Var;
        this.OooO0o0 = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        switch (this.OooO0Oo) {
            case 0:
                Object obj = this.OooO0o0;
                Method method = (Method) this.OooO0o;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        zBooleanValue = ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    } else {
                        method.invoke(obj, menuItem);
                        zBooleanValue = true;
                    }
                    return zBooleanValue;
                } catch (Exception e) {
                    sa.OooOO0(e);
                    return false;
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.OooO0o0).onMenuItemClick(((zs0) this.OooO0o).OooO(menuItem));
        }
    }

    public /* synthetic */ dk1() {
    }
}

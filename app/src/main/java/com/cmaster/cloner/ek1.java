package com.cmaster.cloner;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ek1 {
    public int OooO;
    public final Menu OooO00o;
    public boolean OooO0oo;
    public int OooOO0;
    public CharSequence OooOO0O;
    public CharSequence OooOO0o;
    public char OooOOO;
    public int OooOOO0;
    public int OooOOOO;
    public char OooOOOo;
    public int OooOOo;
    public int OooOOo0;
    public boolean OooOOoo;
    public String OooOo;
    public boolean OooOo0;
    public boolean OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public ws0 OooOoO;
    public String OooOoO0;
    public CharSequence OooOoOO;
    public CharSequence OooOoo0;
    public final /* synthetic */ fk1 OooOooo;
    public ColorStateList OooOoo = null;
    public PorterDuff.Mode OooOooO = null;
    public int OooO0O0 = 0;
    public int OooO0OO = 0;
    public int OooO0Oo = 0;
    public int OooO0o0 = 0;
    public boolean OooO0o = true;
    public boolean OooO0oO = true;

    public ek1(fk1 fk1Var, Menu menu) {
        this.OooOooo = fk1Var;
        this.OooO00o = menu;
    }

    public final Object OooO00o(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.OooOooo.OooO0OO.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void OooO0O0(MenuItem menuItem) {
        fk1 fk1Var = this.OooOooo;
        Context context = fk1Var.OooO0OO;
        boolean z = false;
        menuItem.setChecked(this.OooOOoo).setVisible(this.OooOo00).setEnabled(this.OooOo0).setCheckable(this.OooOOo >= 1).setTitleCondensed(this.OooOO0o).setIcon(this.OooOOO0);
        int i = this.OooOo0O;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.OooOoO0 != null) {
            if (context.isRestricted()) {
                qa.OooO0o("The android:onClick attribute cannot be used within a restricted context");
                return;
            }
            if (fk1Var.OooO0Oo == null) {
                fk1Var.OooO0Oo = fk1.OooO00o(context);
            }
            Object obj = fk1Var.OooO0Oo;
            String str = this.OooOoO0;
            dk1 dk1Var = new dk1();
            dk1Var.OooO0o0 = obj;
            Class<?> cls = obj.getClass();
            try {
                dk1Var.OooO0o = cls.getMethod(str, dk1.OooO0oO);
                menuItem.setOnMenuItemClickListener(dk1Var);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.OooOOo >= 2) {
            if (menuItem instanceof vs0) {
                vs0 vs0Var = (vs0) menuItem;
                vs0Var.OooOoOO = (vs0Var.OooOoOO & (-5)) | 4;
            } else if (menuItem instanceof zs0) {
                zs0 zs0Var = (zs0) menuItem;
                gk1 gk1Var = zs0Var.OooO0o;
                try {
                    if (zs0Var.OooO0oO == null) {
                        zs0Var.OooO0oO = gk1Var.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    zs0Var.OooO0oO.invoke(gk1Var, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.OooOo;
        if (str2 != null) {
            menuItem.setActionView((View) OooO00o(str2, fk1.OooO0o0, fk1Var.OooO00o));
            z = true;
        }
        int i2 = this.OooOo0o;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        ws0 ws0Var = this.OooOoO;
        if (ws0Var != null) {
            if (menuItem instanceof gk1) {
                ((gk1) menuItem).OooO0O0(ws0Var);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.OooOoOO;
        boolean z2 = menuItem instanceof gk1;
        if (z2) {
            ((gk1) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cj.OooOO0O(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.OooOoo0;
        if (z2) {
            ((gk1) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cj.OooOo(menuItem, charSequence2);
        }
        char c = this.OooOOO;
        int i3 = this.OooOOOO;
        if (z2) {
            ((gk1) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cj.OooO(menuItem, c, i3);
        }
        char c2 = this.OooOOOo;
        int i4 = this.OooOOo0;
        if (z2) {
            ((gk1) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            cj.OooOOo(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.OooOooO;
        if (mode != null) {
            if (z2) {
                ((gk1) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                cj.OooOOOo(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.OooOoo;
        if (colorStateList != null) {
            if (z2) {
                ((gk1) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                cj.OooOOOO(menuItem, colorStateList);
            }
        }
    }
}

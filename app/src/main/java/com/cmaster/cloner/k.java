package com.cmaster.cloner;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class k extends O0000000 implements qs0, LayoutInflater.Factory2 {
    public final Context OooOOO;
    public final Object OooOOO0;
    public Window OooOOOO;
    public e OooOOOo;
    public fk1 OooOOo;
    public cm2 OooOOo0;
    public CharSequence OooOOoo;
    public ActionBarContextView OooOo;
    public ay1 OooOo0;
    public ActionBarOverlayLayout OooOo00;
    public O0OO00 OooOo0O;
    public o00OO0O0 OooOo0o;
    public O0O0 OooOoO;
    public PopupWindow OooOoO0;
    public boolean OooOoo;
    public ViewGroup OooOooO;
    public TextView OooOooo;
    public j Oooo;
    public boolean Oooo0;
    public View Oooo000;
    public boolean Oooo00O;
    public boolean Oooo00o;
    public boolean Oooo0O0;
    public boolean Oooo0OO;
    public boolean Oooo0o;
    public boolean Oooo0o0;
    public boolean Oooo0oO;
    public j[] Oooo0oo;
    public boolean OoooO;
    public boolean OoooO0;
    public boolean OoooO00;
    public boolean OoooO0O;
    public Configuration OoooOO0;
    public int OoooOOO;
    public int OoooOOo;
    public boolean OoooOo0;
    public f OoooOoO;
    public f OoooOoo;
    public boolean Ooooo00;
    public int Ooooo0o;
    public boolean OooooOO;
    public Rect OooooOo;
    public d1 Oooooo;
    public Rect Oooooo0;
    public OnBackInvokedDispatcher OoooooO;
    public OnBackInvokedCallback Ooooooo;
    public final int o000oOoO;
    public static final gh1 o0OoOo0 = new gh1(0);
    public static final int[] ooOO = {android.R.attr.windowBackground};
    public static final boolean o00O0O = !"robolectric".equals(Build.FINGERPRINT);
    public gu1 OooOoOO = null;
    public final boolean OooOoo0 = true;
    public final O0O0 OooooO0 = new O0O0(this, 0);

    public k(Context context, Window window, oOOO0O0o oooo0o0o, Object obj) {
        oOOO00 oooo00 = null;
        this.o000oOoO = -100;
        this.OooOOO = context;
        this.OooOOO0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof oOOO00)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        oooo00 = (oOOO00) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (oooo00 != null) {
                this.o000oOoO = ((k) oooo00.OooOO0o()).o000oOoO;
            }
        }
        if (this.o000oOoO == -100) {
            String name = this.OooOOO0.getClass().getName();
            gh1 gh1Var = o0OoOo0;
            Integer num = (Integer) gh1Var.get(name);
            if (num != null) {
                this.o000oOoO = num.intValue();
                gh1Var.remove(this.OooOOO0.getClass().getName());
            }
        }
        if (window != null) {
            OooOOOO(window);
        }
        n.OooO0Oo();
    }

    public static ro0 OooOOOo(Context context) {
        ro0 ro0Var;
        ro0 ro0Var2;
        if (Build.VERSION.SDK_INT >= 33 || (ro0Var = O0000000.OooO0o) == null) {
            return null;
        }
        so0 so0Var = ro0Var.OooO00o;
        ro0 ro0VarOooO0O0 = b.OooO0O0(context.getApplicationContext().getResources().getConfiguration());
        if (so0Var.OooO00o.isEmpty()) {
            ro0Var2 = ro0.OooO0O0;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < ro0VarOooO0O0.OooO0O0() + ro0Var.OooO0O0()) {
                Locale locale = i < ro0Var.OooO0O0() ? so0Var.OooO00o.get(i) : ro0VarOooO0O0.OooO00o.OooO00o.get(i - ro0Var.OooO0O0());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            ro0Var2 = new ro0(new so0(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return ro0Var2.OooO00o.OooO00o.isEmpty() ? ro0VarOooO0O0 : ro0Var2;
    }

    public static Configuration OooOo00(Context context, int i, ro0 ro0Var, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (ro0Var != null) {
            b.OooO0Oo(configuration2, ro0Var);
        }
        return configuration2;
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooO(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.OooOooO.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.OooOOO).inflate(i, viewGroup);
        this.OooOOOo.OooO00o(this.OooOOOO.getCallback());
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooO00o() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.OooOOO);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof k) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooO0O0() {
        if (this.OooOOo0 != null) {
            OooOoOO();
            if (this.OooOOo0.OooO0o()) {
                return;
            }
            OooOoo0(0);
        }
    }

    @Override // com.cmaster.cloner.qs0
    public final boolean OooO0Oo(ss0 ss0Var, MenuItem menuItem) {
        j jVar;
        Window.Callback callback = this.OooOOOO.getCallback();
        if (callback != null && !this.OoooO) {
            ss0 ss0VarOooOO0O = ss0Var.OooOO0O();
            j[] jVarArr = this.Oooo0oo;
            int length = jVarArr != null ? jVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    jVar = jVarArr[i];
                    if (jVar != null && jVar.OooO0oo == ss0VarOooOO0O) {
                        break;
                    }
                    i++;
                } else {
                    jVar = null;
                    break;
                }
            }
            if (jVar != null) {
                return callback.onMenuItemSelected(jVar.OooO00o, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.cmaster.cloner.O0000000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.OooOOO0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = com.cmaster.cloner.O0000000.OooOO0O
            monitor-enter(r0)
            com.cmaster.cloner.O0000000.OooO0oO(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r3
        L11:
            boolean r0 = r3.Ooooo00
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.OooOOOO
            android.view.View r0 = r0.getDecorView()
            com.cmaster.cloner.O0O0 r1 = r3.OooooO0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.OoooO = r0
            int r0 = r3.o000oOoO
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.OooOOO0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            com.cmaster.cloner.gh1 r0 = com.cmaster.cloner.k.o0OoOo0
            java.lang.Object r1 = r3.OooOOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.o000oOoO
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            com.cmaster.cloner.gh1 r0 = com.cmaster.cloner.k.o0OoOo0
            java.lang.Object r1 = r3.OooOOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            com.cmaster.cloner.cm2 r0 = r3.OooOOo0
            if (r0 == 0) goto L63
            r0.OooO0oo()
        L63:
            com.cmaster.cloner.f r0 = r3.OoooOoO
            if (r0 == 0) goto L6a
            r0.OooO0Oo()
        L6a:
            com.cmaster.cloner.f r3 = r3.OoooOoo
            if (r3 == 0) goto L71
            r3.OooO0Oo()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooO0o():void");
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooO0o0() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        String strOooO0OO;
        this.OoooO0 = true;
        OooOOO(false, true);
        OooOo();
        Object obj = this.OooOOO0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strOooO0OO = sw2.OooO0OO(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strOooO0OO = null;
            }
            if (strOooO0OO != null) {
                cm2 cm2Var = this.OooOOo0;
                if (cm2Var == null) {
                    this.OooooOO = true;
                } else {
                    cm2Var.OooOO0o(true);
                }
            }
            synchronized (O0000000.OooOO0O) {
                O0000000.OooO0oO(this);
                O0000000.OooOO0.add(new WeakReference(this));
            }
        }
        this.OoooOO0 = new Configuration(this.OooOOO.getResources().getConfiguration());
        this.OoooO0O = true;
    }

    @Override // com.cmaster.cloner.O0000000
    public final boolean OooO0oo(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.Oooo0o && i == 108) {
            return false;
        }
        if (this.Oooo0 && i == 1) {
            this.Oooo0 = false;
        }
        if (i == 1) {
            Oooo00o();
            this.Oooo0o = true;
            return true;
        }
        if (i == 2) {
            Oooo00o();
            this.Oooo00O = true;
            return true;
        }
        if (i == 5) {
            Oooo00o();
            this.Oooo00o = true;
            return true;
        }
        if (i == 10) {
            Oooo00o();
            this.Oooo0OO = true;
            return true;
        }
        if (i == 108) {
            Oooo00o();
            this.Oooo0 = true;
            return true;
        }
        if (i != 109) {
            return this.OooOOOO.requestFeature(i);
        }
        Oooo00o();
        this.Oooo0O0 = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r6.OooOO0O() != false) goto L20;
     */
    @Override // com.cmaster.cloner.qs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0(com.cmaster.cloner.ss0 r6) {
        /*
            r5 = this;
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.OooOo00
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lc9
            r6.OooOO0O()
            com.cmaster.cloner.xn r6 = r6.OooO0oo
            com.cmaster.cloner.un1 r6 = (com.cmaster.cloner.un1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.OooO00o
            int r2 = r6.getVisibility()
            if (r2 != 0) goto Lc9
            androidx.appcompat.widget.ActionMenuView r6 = r6.OooO0Oo
            if (r6 == 0) goto Lc9
            boolean r6 = r6.OooOo0O
            if (r6 == 0) goto Lc9
            android.content.Context r6 = r5.OooOOO
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L46
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = r5.OooOo00
            r6.OooOO0O()
            com.cmaster.cloner.xn r6 = r6.OooO0oo
            com.cmaster.cloner.un1 r6 = (com.cmaster.cloner.un1) r6
            androidx.appcompat.widget.Toolbar r6 = r6.OooO00o
            androidx.appcompat.widget.ActionMenuView r6 = r6.OooO0Oo
            if (r6 == 0) goto Lc9
            com.cmaster.cloner.o00O0OOO r6 = r6.OooOo0o
            if (r6 == 0) goto Lc9
            com.cmaster.cloner.pi2 r2 = r6.OooOo
            if (r2 != 0) goto L46
            boolean r6 = r6.OooOO0O()
            if (r6 == 0) goto Lc9
        L46:
            android.view.Window r6 = r5.OooOOOO
            android.view.Window$Callback r6 = r6.getCallback()
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r5.OooOo00
            r2.OooOO0O()
            com.cmaster.cloner.xn r2 = r2.OooO0oo
            com.cmaster.cloner.un1 r2 = (com.cmaster.cloner.un1) r2
            androidx.appcompat.widget.Toolbar r2 = r2.OooO00o
            boolean r2 = r2.OooOOOO()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L84
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r5.OooOo00
            r0.OooOO0O()
            com.cmaster.cloner.xn r0 = r0.OooO0oo
            com.cmaster.cloner.un1 r0 = (com.cmaster.cloner.un1) r0
            androidx.appcompat.widget.Toolbar r0 = r0.OooO00o
            androidx.appcompat.widget.ActionMenuView r0 = r0.OooO0Oo
            if (r0 == 0) goto L76
            com.cmaster.cloner.o00O0OOO r0 = r0.OooOo0o
            if (r0 == 0) goto L76
            boolean r0 = r0.OooO()
        L76:
            boolean r0 = r5.OoooO
            if (r0 != 0) goto Lc8
            com.cmaster.cloner.j r5 = r5.OooOoO(r1)
            com.cmaster.cloner.ss0 r5 = r5.OooO0oo
            r6.onPanelClosed(r3, r5)
            return
        L84:
            if (r6 == 0) goto Lc8
            boolean r2 = r5.OoooO
            if (r2 != 0) goto Lc8
            boolean r2 = r5.Ooooo00
            if (r2 == 0) goto La1
            int r2 = r5.Ooooo0o
            r0 = r0 & r2
            if (r0 == 0) goto La1
            android.view.Window r0 = r5.OooOOOO
            android.view.View r0 = r0.getDecorView()
            com.cmaster.cloner.O0O0 r2 = r5.OooooO0
            r0.removeCallbacks(r2)
            r2.run()
        La1:
            com.cmaster.cloner.j r0 = r5.OooOoO(r1)
            com.cmaster.cloner.ss0 r2 = r0.OooO0oo
            if (r2 == 0) goto Lc8
            boolean r4 = r0.OooOOOO
            if (r4 != 0) goto Lc8
            android.view.View r4 = r0.OooO0oO
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc8
            com.cmaster.cloner.ss0 r0 = r0.OooO0oo
            r6.onMenuOpened(r3, r0)
            androidx.appcompat.widget.ActionBarOverlayLayout r5 = r5.OooOo00
            r5.OooOO0O()
            com.cmaster.cloner.xn r5 = r5.OooO0oo
            com.cmaster.cloner.un1 r5 = (com.cmaster.cloner.un1) r5
            androidx.appcompat.widget.Toolbar r5 = r5.OooO00o
            r5.OooOo0()
        Lc8:
            return
        Lc9:
            com.cmaster.cloner.j r6 = r5.OooOoO(r1)
            r6.OooOOO = r0
            r5.OooOOoo(r6, r1)
            r0 = 0
            r5.OooOooo(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooOO0(com.cmaster.cloner.ss0):void");
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooOO0O(View view) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.OooOooO.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.OooOOOo.OooO00o(this.OooOOOO.getCallback());
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooOO0o(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOo0o();
        ViewGroup viewGroup = (ViewGroup) this.OooOooO.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.OooOOOo.OooO00o(this.OooOOOO.getCallback());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOO(boolean r14, boolean r15) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, android.content.pm.PackageManager.NameNotFoundException, java.lang.SecurityException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooOOO(boolean, boolean):boolean");
    }

    @Override // com.cmaster.cloner.O0000000
    public final void OooOOO0(CharSequence charSequence) {
        this.OooOOoo = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.OooOo00;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        cm2 cm2Var = this.OooOOo0;
        if (cm2Var != null) {
            cm2Var.OooOOOo(charSequence);
            return;
        }
        TextView textView = this.OooOooo;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOOOO(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.OooOOOO
            if (r1 != 0) goto L7e
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof com.cmaster.cloner.e
            if (r2 != 0) goto L7a
            com.cmaster.cloner.e r0 = new com.cmaster.cloner.e
            r0.<init>(r7, r1)
            r7.OooOOOo = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.OooOOO
            int[] r1 = com.cmaster.cloner.k.ooOO
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            com.cmaster.cloner.n r4 = com.cmaster.cloner.n.OooO00o()
            monitor-enter(r4)
            com.cmaster.cloner.pa1 r5 = r4.OooO00o     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.OooO0o0(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r7 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r7
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.OooOOOO = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.OoooooO
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.OooOOO0
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.Ooooooo
            if (r1 == 0) goto L61
            com.cmaster.cloner.d.OooO0OO(r8, r1)
            r7.Ooooooo = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = com.cmaster.cloner.d.OooO00o(r0)
            r7.OoooooO = r8
            goto L76
        L74:
            r7.OoooooO = r2
        L76:
            r7.Oooo0()
        L79:
            return
        L7a:
            com.cmaster.cloner.qa.OooO0o(r0)
            return
        L7e:
            com.cmaster.cloner.qa.OooO0o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooOOOO(android.view.Window):void");
    }

    public final void OooOOo(ss0 ss0Var) {
        o00O0OOO o00o0ooo;
        if (this.Oooo0oO) {
            return;
        }
        this.Oooo0oO = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.OooOo00;
        actionBarOverlayLayout.OooOO0O();
        ActionMenuView actionMenuView = ((un1) actionBarOverlayLayout.OooO0oo).OooO00o.OooO0Oo;
        if (actionMenuView != null && (o00o0ooo = actionMenuView.OooOo0o) != null) {
            o00o0ooo.OooO();
            o00O0OO0 o00o0oo0 = o00o0ooo.OooOo0o;
            if (o00o0oo0 != null && o00o0oo0.OooO0O0()) {
                o00o0oo0.OooO.dismiss();
            }
        }
        Window.Callback callback = this.OooOOOO.getCallback();
        if (callback != null && !this.OoooO) {
            callback.onPanelClosed(108, ss0Var);
        }
        this.Oooo0oO = false;
    }

    public final void OooOOo0(int i, j jVar, ss0 ss0Var) {
        if (ss0Var == null) {
            if (jVar == null && i >= 0) {
                j[] jVarArr = this.Oooo0oo;
                if (i < jVarArr.length) {
                    jVar = jVarArr[i];
                }
            }
            if (jVar != null) {
                ss0Var = jVar.OooO0oo;
            }
        }
        if ((jVar == null || jVar.OooOOO0) && !this.OoooO) {
            e eVar = this.OooOOOo;
            Window.Callback callback = this.OooOOOO.getCallback();
            eVar.getClass();
            try {
                eVar.OooO0oo = true;
                callback.onPanelClosed(i, ss0Var);
            } finally {
                eVar.OooO0oo = false;
            }
        }
    }

    public final void OooOOoo(j jVar, boolean z) {
        i iVar;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && jVar.OooO00o == 0 && (actionBarOverlayLayout = this.OooOo00) != null) {
            actionBarOverlayLayout.OooOO0O();
            if (((un1) actionBarOverlayLayout.OooO0oo).OooO00o.OooOOOO()) {
                OooOOo(jVar.OooO0oo);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.OooOOO.getSystemService("window");
        if (windowManager != null && jVar.OooOOO0 && (iVar = jVar.OooO0o0) != null) {
            windowManager.removeView(iVar);
            if (z) {
                OooOOo0(jVar.OooO00o, jVar, null);
            }
        }
        jVar.OooOO0O = false;
        jVar.OooOO0o = false;
        jVar.OooOOO0 = false;
        jVar.OooO0o = null;
        jVar.OooOOO = true;
        if (this.Oooo == jVar) {
            this.Oooo = null;
        }
        if (jVar.OooO00o == 0) {
            Oooo0();
        }
    }

    public final void OooOo() {
        if (this.OooOOOO == null) {
            Object obj = this.OooOOO0;
            if (obj instanceof Activity) {
                OooOOOO(((Activity) obj).getWindow());
            }
        }
        if (this.OooOOOO != null) {
            return;
        }
        qa.OooO0o("We have not been given a Window");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOo0(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooOo0(android.view.KeyEvent):boolean");
    }

    public final void OooOo0O(int i) {
        j jVarOooOoO = OooOoO(i);
        if (jVarOooOoO.OooO0oo != null) {
            Bundle bundle = new Bundle();
            jVarOooOoO.OooO0oo.OooOo00(bundle);
            if (bundle.size() > 0) {
                jVarOooOoO.OooOOOo = bundle;
            }
            jVarOooOoO.OooO0oo.OooOo0o();
            jVarOooOoO.OooO0oo.clear();
        }
        jVarOooOoO.OooOOOO = true;
        jVarOooOoO.OooOOO = true;
        if ((i == 108 || i == 0) && this.OooOo00 != null) {
            j jVarOooOoO2 = OooOoO(0);
            jVarOooOoO2.OooOO0O = false;
            Oooo00O(jVarOooOoO2, null);
        }
    }

    public final void OooOo0o() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ViewGroup viewGroup;
        if (this.OooOoo) {
            return;
        }
        Context context = this.OooOOO;
        int[] iArr = l61.OooOO0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            qa.OooO0o("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            OooO0oo(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            OooO0oo(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            OooO0oo(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            OooO0oo(10);
        }
        this.Oooo0o0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        OooOo();
        this.OooOOOO.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.Oooo0o) {
            viewGroup = this.Oooo0OO ? (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.Oooo0o0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.Oooo0O0 = false;
            this.Oooo0 = false;
        } else if (this.Oooo0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ej(context, typedValue.resourceId) : context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(R.id.decor_content_parent);
            this.OooOo00 = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.OooOOOO.getCallback());
            if (this.Oooo0O0) {
                this.OooOo00.OooOO0(109);
            }
            if (this.Oooo00O) {
                this.OooOo00.OooOO0(2);
            }
            if (this.Oooo00o) {
                this.OooOo00.OooOO0(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Oooo0 + ", windowActionBarOverlay: " + this.Oooo0O0 + ", android:windowIsFloating: " + this.Oooo0o0 + ", windowActionModeOverlay: " + this.Oooo0OO + ", windowNoTitle: " + this.Oooo0o + " }");
        }
        O0OO00 o0oo00 = new O0OO00(this);
        WeakHashMap weakHashMap = nt1.OooO00o;
        ft1.OooOO0O(viewGroup, o0oo00);
        if (this.OooOo00 == null) {
            this.OooOooo = (TextView) viewGroup.findViewById(R.id.title);
        }
        boolean z = nu1.OooO00o;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.OooOOOO.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.OooOOOO.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new o00OO000(this, 3));
        this.OooOooO = viewGroup;
        Object obj = this.OooOOO0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.OooOOoo;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooOo00;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                cm2 cm2Var = this.OooOOo0;
                if (cm2Var != null) {
                    cm2Var.OooOOOo(title);
                } else {
                    TextView textView = this.OooOooo;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.OooOooO.findViewById(android.R.id.content);
        View decorView = this.OooOOOO.getDecorView();
        contentFrameLayout2.OooOO0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.OooOoo = true;
        j jVarOooOoO = OooOoO(0);
        if (this.OoooO || jVarOooOoO.OooO0oo != null) {
            return;
        }
        OooOoo0(108);
    }

    public final j OooOoO(int i) {
        j[] jVarArr = this.Oooo0oo;
        if (jVarArr == null || jVarArr.length <= i) {
            j[] jVarArr2 = new j[i + 1];
            if (jVarArr != null) {
                System.arraycopy(jVarArr, 0, jVarArr2, 0, jVarArr.length);
            }
            this.Oooo0oo = jVarArr2;
            jVarArr = jVarArr2;
        }
        j jVar = jVarArr[i];
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j();
        jVar2.OooO00o = i;
        jVar2.OooOOO = false;
        jVarArr[i] = jVar2;
        return jVar2;
    }

    public final h OooOoO0(Context context) {
        if (this.OoooOoO == null) {
            if (hx2.OooOO0 == null) {
                Context applicationContext = context.getApplicationContext();
                hx2.OooOO0 = new hx2(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.OoooOoO = new f(this, hx2.OooOO0);
        }
        return this.OoooOoO;
    }

    public final void OooOoOO() {
        OooOo0o();
        if (this.Oooo0 && this.OooOOo0 == null) {
            Object obj = this.OooOOO0;
            if (obj instanceof Activity) {
                this.OooOOo0 = new ry1(this.Oooo0O0, (Activity) obj);
            } else if (obj instanceof Dialog) {
                this.OooOOo0 = new ry1((Dialog) obj);
            }
            cm2 cm2Var = this.OooOOo0;
            if (cm2Var != null) {
                cm2Var.OooOO0o(this.OooooOO);
            }
        }
    }

    public final int OooOoo(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            qa.OooO0o("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.OoooOoo == null) {
                            this.OoooOoo = new f(this, context);
                        }
                        return this.OoooOoo.OooO0oO();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return OooOoO0(context).OooO0oO();
                }
            }
            return i;
        }
        return -1;
    }

    public final void OooOoo0(int i) {
        this.Ooooo0o = (1 << i) | this.Ooooo0o;
        if (this.Ooooo00) {
            return;
        }
        View decorView = this.OooOOOO.getDecorView();
        WeakHashMap weakHashMap = nt1.OooO00o;
        decorView.postOnAnimation(this.OooooO0);
        this.Ooooo00 = true;
    }

    public final boolean OooOooO() {
        boolean z = this.OoooO00;
        this.OoooO00 = false;
        j jVarOooOoO = OooOoO(0);
        if (!jVarOooOoO.OooOOO0) {
            o00OO0O0 o00oo0o0 = this.OooOo0o;
            if (o00oo0o0 != null) {
                o00oo0o0.OooO00o();
                return true;
            }
            OooOoOO();
            cm2 cm2Var = this.OooOOo0;
            if (cm2Var == null || !cm2Var.OooO0O0()) {
                return false;
            }
        } else if (!z) {
            OooOOoo(jVarOooOoO, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0175, code lost:
    
        if (r2.OooO.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOooo(com.cmaster.cloner.j r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.OooOooo(com.cmaster.cloner.j, android.view.KeyEvent):void");
    }

    public final void Oooo0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.OoooooO != null && (OooOoO(0).OooOOO0 || this.OooOo0o != null)) {
                z = true;
            }
            if (z && this.Ooooooo == null) {
                this.Ooooooo = d.OooO0O0(this.OoooooO, this);
            } else {
                if (z || (onBackInvokedCallback = this.Ooooooo) == null) {
                    return;
                }
                d.OooO0OO(this.OoooooO, onBackInvokedCallback);
                this.Ooooooo = null;
            }
        }
    }

    public final boolean Oooo000(j jVar, int i, KeyEvent keyEvent) {
        ss0 ss0Var;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((jVar.OooOO0O || Oooo00O(jVar, keyEvent)) && (ss0Var = jVar.OooO0oo) != null) {
            return ss0Var.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Oooo00O(com.cmaster.cloner.j r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.Oooo00O(com.cmaster.cloner.j, android.view.KeyEvent):boolean");
    }

    public final void Oooo00o() {
        if (this.OooOoo) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.k.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

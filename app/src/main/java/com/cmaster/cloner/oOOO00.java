package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oOOO00 extends fg implements oOOO0O0o {
    public boolean OooOoO;
    public boolean OooOoO0;
    public k OooOoo0;
    public final ay1 OooOo0o = new ay1(new q10(this), 19);
    public final jm0 OooOo = new jm0(this);
    public boolean OooOoOO = true;

    public oOOO00() {
        ((o0O000O) this.OooO0oo.OooO0o).o000oOoO("android:support:lifecycle", new xf(this, 1));
        final int i = 0;
        OooO0oo(new mi(this) { // from class: com.cmaster.cloner.p10
            public final /* synthetic */ oOOO00 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i2 = i;
                oOOO00 oooo00 = this.OooO0O0;
                switch (i2) {
                    case 0:
                        oooo00.OooOo0o.OooOOo();
                        break;
                    default:
                        oooo00.OooOo0o.OooOOo();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.OooOOo.add(new mi(this) { // from class: com.cmaster.cloner.p10
            public final /* synthetic */ oOOO00 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.cmaster.cloner.mi
            public final void accept(Object obj) {
                int i22 = i2;
                oOOO00 oooo00 = this.OooO0O0;
                switch (i22) {
                    case 0:
                        oooo00.OooOo0o.OooOOo();
                        break;
                    default:
                        oooo00.OooOo0o.OooOOo();
                        break;
                }
            }
        });
        OooO(new yf(this, 1));
        ((o0O000O) this.OooO0oo.OooO0o).o000oOoO("androidx:appcompat", new oOO(this));
        OooO(new oOOO000o(this));
    }

    public static boolean OooOOOO(k20 k20Var) {
        boolean zOooOOOO = false;
        for (o10 o10Var : k20Var.OooO0OO.OooOo()) {
            if (o10Var != null) {
                q10 q10Var = o10Var.OooOo0O;
                if ((q10Var == null ? null : q10Var.OooO0oo) != null) {
                    zOooOOOO |= OooOOOO(o10Var.OooO());
                }
                w20 w20Var = o10Var.OoooO0O;
                xl0 xl0Var = xl0.OooO0oO;
                xl0 xl0Var2 = xl0.OooO0o;
                if (w20Var != null) {
                    w20Var.OooO0oO();
                    if (w20Var.OooO0oO.OooO0o.compareTo(xl0Var) >= 0) {
                        jm0 jm0Var = o10Var.OoooO0O.OooO0oO;
                        jm0Var.OooO0oo("setCurrentState");
                        jm0Var.OooOOO(xl0Var2);
                        zOooOOOO = true;
                    }
                }
                if (o10Var.OoooO0.OooO0o.compareTo(xl0Var) >= 0) {
                    jm0 jm0Var2 = o10Var.OoooO0;
                    jm0Var2.OooO0oo("setCurrentState");
                    jm0Var2.OooOOO(xl0Var2);
                    zOooOOOO = true;
                }
            }
        }
        return zOooOOOO;
    }

    public final O0000000 OooOO0o() {
        if (this.OooOoo0 == null) {
            oo000000 oo000000Var = O0000000.OooO0Oo;
            this.OooOoo0 = new k(this, null, this, this);
        }
        return this.OooOoo0;
    }

    public final k20 OooOOO() {
        return ((q10) this.OooOo0o.OooO0o0).OooO0oO;
    }

    public final cm2 OooOOO0() {
        k kVar = (k) OooOO0o();
        kVar.OooOoOO();
        return kVar.OooOOo0;
    }

    public final void OooOOOo() {
        super.onDestroy();
        ((q10) this.OooOo0o.OooO0o0).OooO0oO.OooOO0O();
        this.OooOo.OooO(wl0.ON_DESTROY);
    }

    public final void OooOOo() {
        super.onPostResume();
        this.OooOo.OooO(wl0.ON_RESUME);
        k20 k20Var = ((q10) this.OooOo0o.OooO0o0).OooO0oO;
        k20Var.OooOooo = false;
        k20Var.Oooo000 = false;
        k20Var.Oooo0o0.OooOO0 = false;
        k20Var.OooOo00(7);
    }

    public final boolean OooOOo0(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((q10) this.OooOo0o.OooO0o0).OooO0oO.OooO();
        }
        return false;
    }

    public final void OooOOoo() {
        ay1 ay1Var = this.OooOo0o;
        ay1Var.OooOOo();
        q10 q10Var = (q10) ay1Var.OooO0o0;
        super.onStart();
        this.OooOoOO = false;
        if (!this.OooOoO0) {
            this.OooOoO0 = true;
            k20 k20Var = q10Var.OooO0oO;
            k20Var.OooOooo = false;
            k20Var.Oooo000 = false;
            k20Var.Oooo0o0.OooOO0 = false;
            k20Var.OooOo00(4);
        }
        q10Var.OooO0oO.OooOo(true);
        this.OooOo.OooO(wl0.ON_START);
        k20 k20Var2 = q10Var.OooO0oO;
        k20Var2.OooOooo = false;
        k20Var2.Oooo000 = false;
        k20Var2.Oooo0o0.OooOO0 = false;
        k20Var2.OooOo00(5);
    }

    public final void OooOo00() {
        super.onStop();
        this.OooOoOO = true;
        while (OooOOOO(OooOOO())) {
        }
        k20 k20Var = ((q10) this.OooOo0o.OooO0o0).OooO0oO;
        k20Var.Oooo000 = true;
        k20Var.Oooo0o0.OooOO0 = true;
        k20Var.OooOo00(4);
        this.OooOo.OooO(wl0.ON_STOP);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        OooOO0O();
        k kVar = (k) OooOO0o();
        kVar.OooOo0o();
        ((ViewGroup) kVar.OooOooO.findViewById(android.R.id.content)).addView(view, layoutParams);
        kVar.OooOOOo.OooO00o(kVar.OooOOOO.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachBaseContext(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.oOOO00.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        cm2 cm2VarOooOOO0 = OooOOO0();
        if (getWindow().hasFeature(0)) {
            if (cm2VarOooOOO0 == null || !cm2VarOooOOO0.OooO00o()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // com.cmaster.cloner.eg, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        cm2 cm2VarOooOOO0 = OooOOO0();
        if (keyCode == 82 && cm2VarOooOOO0 != null && cm2VarOooOOO0.OooOO0(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.oOOO00.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        k kVar = (k) OooOO0o();
        kVar.OooOo0o();
        return kVar.OooOOOO.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        k kVar = (k) OooOO0o();
        if (kVar.OooOOo == null) {
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            kVar.OooOOo = new fk1(cm2Var != null ? cm2Var.OooO0o0() : kVar.OooOOO);
        }
        return kVar.OooOOo;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = is1.OooO00o;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        OooOO0o().OooO0O0();
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.OooOo0o.OooOOo();
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onConfigurationChanged(configuration);
        k kVar = (k) OooOO0o();
        if (kVar.Oooo0 && kVar.OooOoo) {
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            if (cm2Var != null) {
                cm2Var.OooO0oO();
            }
        }
        n nVarOooO00o = n.OooO00o();
        Context context = kVar.OooOOO;
        synchronized (nVarOooO00o) {
            pa1 pa1Var = nVarOooO00o.OooO00o;
            synchronized (pa1Var) {
                gp0 gp0Var = (gp0) pa1Var.OooO0O0.get(context);
                if (gp0Var != null) {
                    gp0Var.OooO00o();
                }
            }
        }
        kVar.OoooOO0 = new Configuration(kVar.OooOOO.getResources().getConfiguration());
        kVar.OooOOO(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.OooOo.OooO(wl0.ON_CREATE);
        k20 k20Var = ((q10) this.OooOo0o.OooO0o0).OooO0oO;
        k20Var.OooOooo = false;
        k20Var.Oooo000 = false;
        k20Var.Oooo0o0.OooOO0 = false;
        k20Var.OooOo00(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((q10) this.OooOo0o.OooO0o0).OooO0oO.OooO0o.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        OooOOOo();
        OooOO0o().OooO0o();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentOooO00o;
        if (!OooOOo0(i, menuItem)) {
            cm2 cm2VarOooOOO0 = OooOOO0();
            if (menuItem.getItemId() != 16908332 || cm2VarOooOOO0 == null || (cm2VarOooOOO0.OooO0Oo() & 4) == 0 || (intentOooO00o = sw2.OooO00o(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentOooO00o)) {
                navigateUpTo(intentOooO00o);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentOooO00o2 = sw2.OooO00o(this);
            if (intentOooO00o2 == null) {
                intentOooO00o2 = sw2.OooO00o(this);
            }
            if (intentOooO00o2 != null) {
                ComponentName component = intentOooO00o2.getComponent();
                if (component == null) {
                    component = intentOooO00o2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentOooO0O0 = sw2.OooO0O0(this, component);
                    while (intentOooO0O0 != null) {
                        arrayList.add(size, intentOooO0O0);
                        intentOooO0O0 = sw2.OooO0O0(this, intentOooO0O0.getComponent());
                    }
                    arrayList.add(intentOooO00o2);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                qa.OooO0o("No intents added to TaskStackBuilder; cannot startActivities");
                return false;
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.OooOoO = false;
        ((q10) this.OooOo0o.OooO0o0).OooO0oO.OooOo00(5);
        this.OooOo.OooO(wl0.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        super.onPostCreate(bundle);
        ((k) OooOO0o()).OooOo0o();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        OooOOo();
        k kVar = (k) OooOO0o();
        kVar.OooOoOO();
        cm2 cm2Var = kVar.OooOOo0;
        if (cm2Var != null) {
            cm2Var.OooOOO(true);
        }
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.OooOo0o.OooOOo();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        ay1 ay1Var = this.OooOo0o;
        ay1Var.OooOOo();
        super.onResume();
        this.OooOoO = true;
        ((q10) ay1Var.OooO0o0).OooO0oO.OooOo(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        OooOOoo();
        ((k) OooOO0o()).OooOOO(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.OooOo0o.OooOOo();
    }

    @Override // android.app.Activity
    public final void onStop() {
        OooOo00();
        k kVar = (k) OooOO0o();
        kVar.OooOoOO();
        cm2 cm2Var = kVar.OooOOo0;
        if (cm2Var != null) {
            cm2Var.OooOOO(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OooOO0o().OooOOO0(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        cm2 cm2VarOooOOO0 = OooOOO0();
        if (getWindow().hasFeature(0)) {
            if (cm2VarOooOOO0 == null || !cm2VarOooOOO0.OooOO0O()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        OooOO0O();
        OooOO0o().OooO(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((k) OooOO0o()).OoooOOO = i;
    }

    @Override // com.cmaster.cloner.fg, android.app.Activity
    public void setContentView(View view) {
        OooOO0O();
        OooOO0o().OooOO0O(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOO0O();
        OooOO0o().OooOO0o(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((q10) this.OooOo0o.OooO0o0).OooO0oO.OooO0o.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}

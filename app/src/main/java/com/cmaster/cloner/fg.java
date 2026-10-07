package com.cmaster.cloner;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class fg extends eg implements eu1, j70, jd1 {
    public du1 OooO;
    public final a02 OooO0o;
    public final bj OooO0o0 = new bj();
    public final jm0 OooO0oO;
    public final e81 OooO0oo;
    public kd1 OooOO0;
    public xy0 OooOO0O;
    public final dg OooOO0o;
    public final AtomicInteger OooOOO;
    public final oh1 OooOOO0;
    public final zf OooOOOO;
    public final CopyOnWriteArrayList OooOOOo;
    public final CopyOnWriteArrayList OooOOo;
    public final CopyOnWriteArrayList OooOOo0;
    public final CopyOnWriteArrayList OooOOoo;
    public boolean OooOo0;
    public final CopyOnWriteArrayList OooOo00;
    public boolean OooOo0O;

    public fg() {
        oOOO00 oooo00 = (oOOO00) this;
        this.OooO0o = new a02(new o00OOOOo(oooo00, 5));
        jm0 jm0Var = new jm0(this);
        this.OooO0oO = jm0Var;
        id1 id1Var = new id1(this, new wf(this, 5));
        e81 e81Var = new e81(id1Var);
        this.OooO0oo = e81Var;
        this.OooOO0O = null;
        dg dgVar = new dg(oooo00);
        this.OooOO0o = dgVar;
        this.OooOOO0 = new oh1(dgVar, new wf(oooo00, 0));
        this.OooOOO = new AtomicInteger();
        this.OooOOOO = new zf(oooo00);
        this.OooOOOo = new CopyOnWriteArrayList();
        this.OooOOo0 = new CopyOnWriteArrayList();
        this.OooOOo = new CopyOnWriteArrayList();
        this.OooOOoo = new CopyOnWriteArrayList();
        this.OooOo00 = new CopyOnWriteArrayList();
        this.OooOo0 = false;
        this.OooOo0O = false;
        jm0Var.OooO0OO(new ag(oooo00, 0));
        jm0Var.OooO0OO(new ag(oooo00, 1));
        jm0Var.OooO0OO(new ag(oooo00, 2));
        id1Var.OooO00o();
        h82.OooO0O0(this);
        ((o0O000O) e81Var.OooO0o).o000oOoO("android:support:activity-result", new xf(oooo00, 0));
        OooO(new yf(oooo00, 0));
    }

    public final void OooO(az0 az0Var) {
        bj bjVar = this.OooO0o0;
        bjVar.getClass();
        if (((fg) bjVar.OooO0o0) != null) {
            az0Var.OooO00o();
        }
        ((CopyOnWriteArraySet) bjVar.OooO0Oo).add(az0Var);
    }

    @Override // com.cmaster.cloner.j70
    public final bu1 OooO00o() {
        if (this.OooOO0 == null) {
            this.OooOO0 = new kd1(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.OooOO0;
    }

    @Override // com.cmaster.cloner.j70
    public final fv0 OooO0O0() {
        fv0 fv0Var = new fv0();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = fv0Var.OooO00o;
        if (application != null) {
            linkedHashMap.put(au1.OooOO0O, getApplication());
        }
        linkedHashMap.put(h82.OooO00o, this);
        linkedHashMap.put(h82.OooO0O0, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(h82.OooO0OO, getIntent().getExtras());
        }
        return fv0Var;
    }

    @Override // com.cmaster.cloner.eu1
    public final du1 OooO0OO() {
        if (getApplication() == null) {
            qa.OooO0o("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.OooO == null) {
            cg cgVar = (cg) getLastNonConfigurationInstance();
            if (cgVar != null) {
                this.OooO = cgVar.OooO00o;
            }
            if (this.OooO == null) {
                this.OooO = new du1();
            }
        }
        return this.OooO;
    }

    @Override // com.cmaster.cloner.jd1
    public final o0O000O OooO0Oo() {
        return (o0O000O) this.OooO0oo.OooO0o;
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return this.OooO0oO;
    }

    public final void OooO0oo(mi miVar) {
        this.OooOOOo.add(miVar);
    }

    public final xy0 OooOO0() {
        if (this.OooOO0O == null) {
            this.OooOO0O = new xy0(new o00OOO00(this, 10));
            this.OooO0oO.OooO0OO(new v61(this, 1));
        }
        return this.OooOO0O;
    }

    public final void OooOO0O() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.OooOOOO.OooO00o(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        OooOO0().OooO00o();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.OooOOOo.iterator();
        while (it.hasNext()) {
            ((mi) it.next()).accept(configuration);
        }
    }

    @Override // com.cmaster.cloner.eg, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.OooO0oo.OooOo0(bundle);
        bj bjVar = this.OooO0o0;
        bjVar.getClass();
        bjVar.OooO0o0 = this;
        Iterator it = ((CopyOnWriteArraySet) bjVar.OooO0Oo).iterator();
        while (it.hasNext()) {
            ((az0) it.next()).OooO00o();
        }
        super.onCreate(bundle);
        int i = l91.OooO0o0;
        j91.OooO0O0(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.OooO0o.OooO0o).iterator();
        while (it.hasNext()) {
            ((e20) it.next()).OooO00o.OooOO0(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.OooO0o.OooO0o).iterator();
            while (it.hasNext()) {
                if (((e20) it.next()).OooO00o.OooOOOO(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.OooOo0 = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.OooOo0 = false;
            Iterator it = this.OooOOoo.iterator();
            while (it.hasNext()) {
                mi miVar = (mi) it.next();
                configuration.getClass();
                miVar.accept(new dv0(z));
            }
        } catch (Throwable th) {
            this.OooOo0 = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.OooOOo.iterator();
        while (it.hasNext()) {
            ((mi) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.OooO0o.OooO0o).iterator();
        while (it.hasNext()) {
            ((e20) it.next()).OooO00o.OooOOOo();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.OooOo0O = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.OooOo0O = false;
            Iterator it = this.OooOo00.iterator();
            while (it.hasNext()) {
                mi miVar = (mi) it.next();
                configuration.getClass();
                miVar.accept(new w21(z));
            }
        } catch (Throwable th) {
            this.OooOo0O = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.OooO0o.OooO0o).iterator();
        while (it.hasNext()) {
            ((e20) it.next()).OooO00o.OooOOoo(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.OooOOOO.OooO00o(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        cg cgVar;
        du1 du1Var = this.OooO;
        if (du1Var == null && (cgVar = (cg) getLastNonConfigurationInstance()) != null) {
            du1Var = cgVar.OooO00o;
        }
        if (du1Var == null) {
            return null;
        }
        cg cgVar2 = new cg();
        cgVar2.OooO00o = du1Var;
        return cgVar2;
    }

    @Override // com.cmaster.cloner.eg, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        jm0 jm0Var = this.OooO0oO;
        if (jm0Var != null) {
            jm0Var.OooO0oo("setCurrentState");
            jm0Var.OooOOO(xl0.OooO0o);
        }
        super.onSaveInstanceState(bundle);
        this.OooO0oo.OooOo0O(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.OooOOo0.iterator();
        while (it.hasNext()) {
            ((mi) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (s43.OooO0O0()) {
                s43.OooO00o("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            oh1 oh1Var = this.OooOOO0;
            synchronized (oh1Var.OooO0o) {
                try {
                    oh1Var.OooO0o0 = true;
                    ArrayList arrayList = (ArrayList) oh1Var.OooO0oO;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((p30) obj).OooO00o();
                    }
                    ((ArrayList) oh1Var.OooO0oO).clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        OooOO0O();
        View decorView = getWindow().getDecorView();
        dg dgVar = this.OooOO0o;
        if (!dgVar.OooO0o) {
            dgVar.OooO0o = true;
            decorView.getViewTreeObserver().addOnDrawListener(dgVar);
        }
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.OooOo0) {
            return;
        }
        Iterator it = this.OooOOoo.iterator();
        while (it.hasNext()) {
            ((mi) it.next()).accept(new dv0(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.OooOo0O) {
            return;
        }
        Iterator it = this.OooOo00.iterator();
        while (it.hasNext()) {
            ((mi) it.next()).accept(new w21(z));
        }
    }
}

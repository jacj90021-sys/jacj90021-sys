package com.cmaster.cloner;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o10 implements ComponentCallbacks, View.OnCreateContextMenuListener, hm0, eu1, j70, jd1 {
    public static final Object OoooOo0 = new Object();
    public Bundle OooO;
    public SparseArray OooO0o;
    public Bundle OooO0o0;
    public Bundle OooO0oO;
    public o10 OooOO0;
    public int OooOO0o;
    public boolean OooOOO;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public boolean OooOOoo;
    public o10 OooOo;
    public k20 OooOo0;
    public int OooOo00;
    public q10 OooOo0O;
    public int OooOoO;
    public int OooOoO0;
    public String OooOoOO;
    public boolean OooOoo;
    public boolean OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public String Oooo;
    public View Oooo0;
    public boolean Oooo00O;
    public ViewGroup Oooo00o;
    public boolean Oooo0O0;
    public boolean Oooo0o;
    public n10 Oooo0o0;
    public LayoutInflater Oooo0oO;
    public boolean Oooo0oo;
    public jm0 OoooO0;
    public w20 OoooO0O;
    public kd1 OoooOO0;
    public final ArrayList OoooOOO;
    public final l10 OoooOOo;
    public e81 o000oOoO;
    public int OooO0Oo = -1;
    public String OooO0oo = UUID.randomUUID().toString();
    public String OooOO0O = null;
    public Boolean OooOOO0 = null;
    public k20 OooOo0o = new k20();
    public final boolean Oooo000 = true;
    public boolean Oooo0OO = true;
    public xl0 OoooO00 = xl0.OooO0oo;
    public final gv0 OoooO = new gv0();

    public o10() {
        new AtomicInteger();
        this.OoooOOO = new ArrayList();
        this.OoooOOo = new l10(this);
        OooOOo0();
    }

    public final k20 OooO() {
        if (this.OooOo0O != null) {
            return this.OooOo0o;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " has not been attached yet."));
        return null;
    }

    @Override // com.cmaster.cloner.j70
    public final bu1 OooO00o() {
        Application application = null;
        if (this.OooOo0 == null) {
            qa.OooO0o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.OoooOO0 == null) {
            Context applicationContext = Oooo().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && k20.Oooo000(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + Oooo().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.OoooOO0 = new kd1(application, this, this.OooO);
        }
        return this.OoooOO0;
    }

    @Override // com.cmaster.cloner.j70
    public final fv0 OooO0O0() {
        Application application;
        Context applicationContext = Oooo().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && k20.Oooo000(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + Oooo().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        fv0 fv0Var = new fv0();
        LinkedHashMap linkedHashMap = fv0Var.OooO00o;
        if (application != null) {
            linkedHashMap.put(au1.OooOO0O, application);
        }
        linkedHashMap.put(h82.OooO00o, this);
        linkedHashMap.put(h82.OooO0O0, this);
        Bundle bundle = this.OooO;
        if (bundle != null) {
            linkedHashMap.put(h82.OooO0OO, bundle);
        }
        return fv0Var;
    }

    @Override // com.cmaster.cloner.eu1
    public final du1 OooO0OO() {
        if (this.OooOo0 == null) {
            qa.OooO0o("Can't access ViewModels from detached fragment");
            return null;
        }
        if (OooOO0o() == 1) {
            qa.OooO0o("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.OooOo0.Oooo0o0.OooO0oO;
        du1 du1Var = (du1) map.get(this.OooO0oo);
        if (du1Var != null) {
            return du1Var;
        }
        du1 du1Var2 = new du1();
        map.put(this.OooO0oo, du1Var2);
        return du1Var2;
    }

    @Override // com.cmaster.cloner.jd1
    public final o0O000O OooO0Oo() {
        return (o0O000O) this.o000oOoO.OooO0o;
    }

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return this.OoooO0;
    }

    public ds2 OooO0o0() {
        return new m10(this);
    }

    public final n10 OooO0oO() {
        if (this.Oooo0o0 == null) {
            n10 n10Var = new n10();
            Object obj = OoooOo0;
            n10Var.OooO0oO = obj;
            n10Var.OooO0oo = obj;
            n10Var.OooO = obj;
            n10Var.OooOO0 = 1.0f;
            n10Var.OooOO0O = null;
            this.Oooo0o0 = n10Var;
        }
        return this.Oooo0o0;
    }

    public final oOOO00 OooO0oo() {
        q10 q10Var = this.OooOo0O;
        if (q10Var == null) {
            return null;
        }
        return q10Var.OooO0Oo;
    }

    public final Context OooOO0() {
        q10 q10Var = this.OooOo0O;
        if (q10Var == null) {
            return null;
        }
        return q10Var.OooO0o0;
    }

    public final LayoutInflater OooOO0O() {
        LayoutInflater layoutInflater = this.Oooo0oO;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterOooOooo = OooOooo(null);
        this.Oooo0oO = layoutInflaterOooOooo;
        return layoutInflaterOooOooo;
    }

    public final int OooOO0o() {
        xl0 xl0Var = this.OoooO00;
        return (xl0Var == xl0.OooO0o0 || this.OooOo == null) ? xl0Var.ordinal() : Math.min(xl0Var.ordinal(), this.OooOo.OooOO0o());
    }

    public final Resources OooOOO() {
        return Oooo().getResources();
    }

    public final k20 OooOOO0() {
        k20 k20Var = this.OooOo0;
        if (k20Var != null) {
            return k20Var;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final o10 OooOOOO(boolean z) {
        String str;
        if (z) {
            s20 s20Var = t20.OooO00o;
            t20.OooO0O0(new u40(this, "Attempting to get target fragment from fragment " + this));
            t20.OooO00o(this).getClass();
        }
        o10 o10Var = this.OooOO0;
        if (o10Var != null) {
            return o10Var;
        }
        k20 k20Var = this.OooOo0;
        if (k20Var == null || (str = this.OooOO0O) == null) {
            return null;
        }
        return k20Var.OooO0OO.OooOOo0(str);
    }

    public final w20 OooOOOo() {
        w20 w20Var = this.OoooO0O;
        if (w20Var != null) {
            return w20Var;
        }
        qa.OooO0o("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public final void OooOOo() {
        OooOOo0();
        this.Oooo = this.OooO0oo;
        this.OooO0oo = UUID.randomUUID().toString();
        this.OooOOO = false;
        this.OooOOOO = false;
        this.OooOOOo = false;
        this.OooOOo0 = false;
        this.OooOOo = false;
        this.OooOo00 = 0;
        this.OooOo0 = null;
        this.OooOo0o = new k20();
        this.OooOo0O = null;
        this.OooOoO0 = 0;
        this.OooOoO = 0;
        this.OooOoOO = null;
        this.OooOoo0 = false;
        this.OooOoo = false;
    }

    public final void OooOOo0() {
        this.OoooO0 = new jm0(this);
        this.o000oOoO = new e81(new id1(this, new wf(this, 5)));
        this.OoooOO0 = null;
        ArrayList arrayList = this.OoooOOO;
        l10 l10Var = this.OoooOOo;
        if (arrayList.contains(l10Var)) {
            return;
        }
        if (this.OooO0Oo >= 0) {
            l10Var.OooO00o();
        } else {
            arrayList.add(l10Var);
        }
    }

    public final boolean OooOOoo() {
        return this.OooOo0O != null && this.OooOOO;
    }

    public void OooOo(Context context) {
        this.Oooo00O = true;
        q10 q10Var = this.OooOo0O;
        if ((q10Var == null ? null : q10Var.OooO0Oo) != null) {
            this.Oooo00O = true;
        }
    }

    public final boolean OooOo0() {
        return this.OooOo00 > 0;
    }

    public final boolean OooOo00() {
        if (this.OooOoo0) {
            return true;
        }
        k20 k20Var = this.OooOo0;
        if (k20Var != null) {
            o10 o10Var = this.OooOo;
            k20Var.getClass();
            if (o10Var == null ? false : o10Var.OooOo00()) {
                return true;
            }
        }
        return false;
    }

    public void OooOo0O() {
        this.Oooo00O = true;
    }

    public void OooOo0o(int i, int i2, Intent intent) {
        if (k20.Oooo000(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void OooOoO(Menu menu, MenuInflater menuInflater) {
    }

    public void OooOoO0(Bundle bundle) {
        Parcelable parcelable;
        this.Oooo00O = true;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.OooOo0o.OoooO00(parcelable);
            k20 k20Var = this.OooOo0o;
            k20Var.OooOooo = false;
            k20Var.Oooo000 = false;
            k20Var.Oooo0o0.OooOO0 = false;
            k20Var.OooOo00(1);
        }
        k20 k20Var2 = this.OooOo0o;
        if (k20Var2.OooOOoo >= 1) {
            return;
        }
        k20Var2.OooOooo = false;
        k20Var2.Oooo000 = false;
        k20Var2.Oooo0o0.OooOO0 = false;
        k20Var2.OooOo00(1);
    }

    public View OooOoOO(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void OooOoo() {
        this.Oooo00O = true;
    }

    public void OooOoo0() {
        this.Oooo00O = true;
    }

    public void OooOooO() {
        this.Oooo00O = true;
    }

    public LayoutInflater OooOooo(Bundle bundle) {
        q10 q10Var = this.OooOo0O;
        if (q10Var == null) {
            qa.OooO0o("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        oOOO00 oooo00 = q10Var.OooO0oo;
        LayoutInflater layoutInflaterCloneInContext = oooo00.getLayoutInflater().cloneInContext(oooo00);
        layoutInflaterCloneInContext.setFactory2(this.OooOo0o.OooO0o);
        return layoutInflaterCloneInContext;
    }

    public final Context Oooo() {
        Context contextOooOO0 = OooOO0();
        if (contextOooOO0 != null) {
            return contextOooOO0;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " not attached to a context."));
        return null;
    }

    public void Oooo0() {
        this.Oooo00O = true;
    }

    public boolean Oooo000(MenuItem menuItem) {
        return false;
    }

    public void Oooo00O(Menu menu) {
    }

    public void Oooo00o(Bundle bundle) {
    }

    public void Oooo0O0() {
        this.Oooo00O = true;
    }

    public void Oooo0OO(Bundle bundle) {
    }

    public void Oooo0o(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.OooOo0o.Oooo0o0();
        this.OooOOoo = true;
        this.OoooO0O = new w20(this, OooO0OO());
        View viewOooOoOO = OooOoOO(layoutInflater, viewGroup);
        this.Oooo0 = viewOooOoOO;
        w20 w20Var = this.OoooO0O;
        if (viewOooOoOO == null) {
            if (w20Var.OooO0oO == null) {
                this.OoooO0O = null;
                return;
            } else {
                qa.OooO0o("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        w20Var.OooO0oO();
        View view = this.Oooo0;
        w20 w20Var2 = this.OoooO0O;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, w20Var2);
        View view2 = this.Oooo0;
        w20 w20Var3 = this.OoooO0O;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, w20Var3);
        View view3 = this.Oooo0;
        w20 w20Var4 = this.OoooO0O;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, w20Var4);
        this.OoooO.OooOO0o(this.OoooO0O);
    }

    public void Oooo0o0(Bundle bundle) {
        this.Oooo00O = true;
    }

    public final oOOO00 Oooo0oO() {
        oOOO00 oooo00OooO0oo = OooO0oo();
        if (oooo00OooO0oo != null) {
            return oooo00OooO0oo;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " not attached to an activity."));
        return null;
    }

    public final Bundle Oooo0oo() {
        Bundle bundle = this.OooO;
        if (bundle != null) {
            return bundle;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " does not have any arguments."));
        return null;
    }

    public final void OoooO() {
        if (!this.OooOooo) {
            this.OooOooo = true;
            if (!OooOOoo() || OooOo00()) {
                return;
            }
            this.OooOo0O.OooO0oo.invalidateOptionsMenu();
        }
    }

    public final void OoooO0(int i, int i2, int i3, int i4) {
        if (this.Oooo0o0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        OooO0oO().OooO0O0 = i;
        OooO0oO().OooO0OO = i2;
        OooO0oO().OooO0Oo = i3;
        OooO0oO().OooO0o0 = i4;
    }

    public final View OoooO00() {
        View view = this.Oooo0;
        if (view != null) {
            return view;
        }
        qa.OooO0o(rj.OooO0O0("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void OoooO0O(Bundle bundle) {
        k20 k20Var = this.OooOo0;
        if (k20Var == null || !(k20Var.OooOooo || k20Var.Oooo000)) {
            this.OooO = bundle;
        } else {
            qa.OooO0o("Fragment already added and state has been saved");
        }
    }

    public final void OoooOO0(o10 o10Var) {
        if (o10Var != null) {
            s20 s20Var = t20.OooO00o;
            t20.OooO0O0(new u40(this, "Attempting to set target fragment " + o10Var + " with request code 0 for fragment " + this));
            t20.OooO00o(this).getClass();
        }
        k20 k20Var = this.OooOo0;
        k20 k20Var2 = o10Var != null ? o10Var.OooOo0 : null;
        if (k20Var != null && k20Var2 != null && k20Var != k20Var2) {
            ra.OooOOO(rj.OooO0O0("Fragment ", o10Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (o10 o10VarOooOOOO = o10Var; o10VarOooOOOO != null; o10VarOooOOOO = o10VarOooOOOO.OooOOOO(false)) {
            if (o10VarOooOOOO == this) {
                throw new IllegalArgumentException("Setting " + o10Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (o10Var == null) {
            this.OooOO0O = null;
            this.OooOO0 = null;
        } else if (this.OooOo0 == null || o10Var.OooOo0 == null) {
            this.OooOO0O = null;
            this.OooOO0 = o10Var;
        } else {
            this.OooOO0O = o10Var.OooO0oo;
            this.OooOO0 = null;
        }
        this.OooOO0o = 0;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final void o000oOoO(Intent intent) {
        q10 q10Var = this.OooOo0O;
        if (q10Var != null) {
            q10Var.OooO0o0.startActivity(intent, null);
        } else {
            qa.OooO0o(rj.OooO0O0("Fragment ", this, " not attached to Activity"));
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Oooo00O = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        Oooo0oO().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Oooo00O = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.OooO0oo);
        if (this.OooOoO0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.OooOoO0));
        }
        if (this.OooOoOO != null) {
            sb.append(" tag=");
            sb.append(this.OooOoOO);
        }
        sb.append(")");
        return sb.toString();
    }
}

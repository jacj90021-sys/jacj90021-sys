package com.cmaster.cloner;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m1 extends oOOO00 {
    public final cf1 OooOoo = new cf1();
    public final ConcurrentHashMap OooOooO = new ConcurrentHashMap();
    public final ay1 OooOooo = new ay1(this, 7);

    public final o0O0O0O OooOo(Intent intent) {
        o0O0O0O o0o0o0o = new o0O0O0O(intent);
        this.OooOoo.OooOO0o(o0o0o0o);
        return o0o0o0o;
    }

    public final void OooOo0(Runnable runnable) {
        OooOoo0().execute(new l1(this, runnable, OooOoOO(), 0));
    }

    public final qq0 OooOo0O(boolean z) {
        qq0 qq0Var = new qq0();
        qq0Var.OooO0Oo = false;
        qq0Var.OooO0o0 = false;
        qq0Var.OooO0o = false;
        qq0Var.OooO0oO = android.R.id.content;
        qq0Var.OooO0oo = -1;
        qq0Var.OooO = -1;
        qq0Var.OooOO0 = 0;
        qq0Var.OooOO0O = 1375731712;
        qq0Var.OooOO0o = 0;
        qq0Var.OooOOO0 = Build.VERSION.SDK_INT >= 28;
        qq0Var.OooOOO = -1.0f;
        qq0Var.OooOOOO = -1.0f;
        qq0Var.OooO0O0(this, z);
        qq0Var.OooO0o = true;
        qq0Var.addTarget(android.R.id.content);
        qq0Var.OooOO0 = uv2.OooO0OO(findViewById(android.R.id.content), R.attr.colorSurface);
        qq0Var.OooOO0o = 3;
        return qq0Var;
    }

    public final void OooOo0o(Class cls, o0O0O0o0 o0o0o0o0) {
        ConcurrentHashMap concurrentHashMap = this.OooOooO;
        if (((o0O0OOO0) concurrentHashMap.get(cls)) == null) {
            String str = "activity_rq#" + this.OooOOO.getAndIncrement();
            zf zfVar = this.OooOOOO;
            HashMap map = zfVar.OooO0OO;
            jm0 jm0Var = this.OooO0oO;
            if (jm0Var.OooO0o.compareTo(xl0.OooO0oO) >= 0) {
                StringBuilder sb = new StringBuilder("LifecycleOwner ");
                sb.append(this);
                xl0 xl0Var = jm0Var.OooO0o;
                sb.append(" is attempting to register while current state is ");
                sb.append(xl0Var);
                sb.append(". LifecycleOwners must call register before they are STARTED.");
                throw new IllegalStateException(sb.toString());
            }
            zfVar.OooO0Oo(str);
            oo0OOoo oo0oooo = (oo0OOoo) map.get(str);
            if (oo0oooo == null) {
                oo0oooo = new oo0OOoo(jm0Var);
            }
            o0O0OO0 o0o0oo0 = new o0O0OO0(zfVar, str, this.OooOooo, o0o0o0o0);
            oo0oooo.OooO00o.OooO0OO(o0o0oo0);
            oo0oooo.OooO0O0.add(o0o0oo0);
            map.put(str, oo0oooo);
            concurrentHashMap.put(cls, new o0O0OOO0(zfVar, str, o0o0o0o0, 0));
        }
    }

    public final void OooOoO(Class cls, Bundle bundle) {
        o10 o10VarOooOoOO;
        k5 k5Var;
        int id = OooOoO0().getId();
        ArrayList arrayList = j1.OooO00o;
        Object bb1Var = vq1.OooO00o;
        k20 k20VarOooOOO = OooOOO();
        k20VarOooOOO.getClass();
        try {
            o10VarOooOoOO = k20VarOooOOO.OooOoOO(cls.getName());
            if (o10VarOooOoOO == null) {
                o10VarOooOoOO = null;
            }
            if (o10VarOooOoOO == null) {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                objNewInstance.getClass();
                o10VarOooOoOO = (o10) objNewInstance;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                o10VarOooOoOO.OoooO0O(bundle);
            }
            k5Var = new k5(k20VarOooOOO);
        } catch (Throwable th) {
            bb1Var = new bb1(th);
        }
        if (id == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k5Var.OooO0o0(id, o10VarOooOoOO, null, 2);
        if (k5Var.OooO0oO) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        k5Var.OooO0oo = false;
        k20 k20Var = k5Var.OooOOo0;
        if (k20Var.OooOo00 != null && !k20Var.Oooo00O) {
            k20Var.OooOo0o(true);
            k5Var.OooO00o(k20Var.Oooo0, k20Var.Oooo0O0);
            k20Var.OooO0O0 = true;
            try {
                k20Var.Oooo(k20Var.Oooo0, k20Var.Oooo0O0);
                k20Var.OooO0Oo();
                k20Var.OoooOoo();
                if (k20Var.Oooo00o) {
                    k20Var.Oooo00o = false;
                    k20Var.OoooOo0();
                }
                ((HashMap) k20Var.OooO0OO.OooO0o).values().removeAll(Collections.singleton(null));
            } catch (Throwable th2) {
                k20Var.OooO0Oo();
                throw th2;
            }
        }
        Throwable thOooO00o = cb1.OooO00o(bb1Var);
        if (thOooO00o == null) {
            return;
        }
        thOooO00o.printStackTrace();
    }

    public ViewGroup OooOoO0() {
        return (ViewGroup) findViewById(android.R.id.content);
    }

    public final Dialog OooOoOO() {
        Dialog dialog = new Dialog(this);
        dialog.setCancelable(false);
        CircularProgressIndicator circularProgressIndicator = new CircularProgressIndicator(this);
        circularProgressIndicator.setIndeterminate(true);
        int i = xj0.OooOo;
        int i2 = (int) ((getResources().getDisplayMetrics().density * 16.0f) + 0.5d);
        circularProgressIndicator.setPadding(i2, i2, i2, i2);
        dialog.setContentView(circularProgressIndicator);
        dialog.show();
        return dialog;
    }

    public final o0O0OOO0 OooOoo(Class cls) {
        o0O0OOO0 o0o0ooo0 = (o0O0OOO0) this.OooOooO.get(cls);
        return (o0o0ooo0 != null || cls == Object.class) ? o0o0ooo0 : OooOoo(cls.getSuperclass());
    }

    public Executor OooOoo0() {
        return h1.OooO0Oo;
    }

    public final void OooOooO(Toolbar toolbar) {
        k kVar = (k) OooOO0o();
        if (kVar.OooOOO0 instanceof Activity) {
            kVar.OooOoOO();
            cm2 cm2Var = kVar.OooOOo0;
            if (cm2Var instanceof ry1) {
                qa.OooO0o("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
                return;
            }
            kVar.OooOOo = null;
            if (cm2Var != null) {
                cm2Var.OooO0oo();
            }
            kVar.OooOOo0 = null;
            if (toolbar != null) {
                Object obj = kVar.OooOOO0;
                sn1 sn1Var = new sn1(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : kVar.OooOOoo, kVar.OooOOOo);
                kVar.OooOOo0 = sn1Var;
                kVar.OooOOOo.OooO0o0 = sn1Var.OooO0OO;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                kVar.OooOOOo.OooO0o0 = null;
            }
            kVar.OooO0O0();
        }
    }

    @Override // com.cmaster.cloner.oOOO00, com.cmaster.cloner.fg, com.cmaster.cloner.eg, android.app.Activity
    public void onCreate(Bundle bundle) {
        int i = 0;
        int i2 = 1;
        if (getIntent().getStringExtra("EXTRA_TRANSITION_NAME") != null) {
            findViewById(android.R.id.content).setTransitionName(getIntent().getStringExtra("EXTRA_TRANSITION_NAME"));
            sq0 sq0Var = new sq0();
            sq0Var.OooO00o = true;
            sq0Var.OooO0O0 = true;
            sq0Var.OooO0Oo = new iu(10);
            setEnterSharedElementCallback(sq0Var);
            getWindow().setSharedElementEnterTransition(OooOo0O(true));
            getWindow().setSharedElementReturnTransition(OooOo0O(false));
        }
        super.onCreate(bundle);
        this.OooOoo.OooO0o0(this, new k1(this, i));
        OooOo0o(o0O0O0O.class, new o0O0O0o0(2));
        OooOo0o(u21.class, new o0O0O0o0(i2));
        OooOo0o(uz.class, new o0O0O0o0(i));
    }
}

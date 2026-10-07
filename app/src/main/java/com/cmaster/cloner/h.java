package com.cmaster.cloner;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.view.MenuItem;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class h implements ju0 {
    public Object OooO0Oo;
    public Object OooO0o0;

    public h() {
        ArrayList arrayList = new ArrayList();
        this.OooO0o0 = arrayList;
        arrayList.add(new ft());
    }

    public static float OooO0oo(int i, int i2, int i3) {
        return cw2.OooO00o((i - i2) / i3, 0.0f, 1.0f);
    }

    public MenuItem OooO(MenuItem menuItem) {
        if (!(menuItem instanceof gk1)) {
            return menuItem;
        }
        gk1 gk1Var = (gk1) menuItem;
        if (((gh1) this.OooO0o0) == null) {
            this.OooO0o0 = new gh1(0);
        }
        MenuItem menuItem2 = (MenuItem) ((gh1) this.OooO0o0).get(gk1Var);
        if (menuItem2 != null) {
            return menuItem2;
        }
        zs0 zs0Var = new zs0((Context) this.OooO0Oo, gk1Var);
        ((gh1) this.OooO0o0).put(gk1Var, zs0Var);
        return zs0Var;
    }

    public abstract void OooO0OO();

    public void OooO0Oo() {
        g gVar = (g) this.OooO0Oo;
        if (gVar != null) {
            try {
                ((k) this.OooO0o0).OooOOO.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.OooO0Oo = null;
        }
    }

    public abstract IntentFilter OooO0o();

    public void OooO0o0() {
        ei1 ei1Var = (ei1) this.OooO0Oo;
        ib ibVar = (ib) this.OooO0o0;
        HashSet hashSet = ei1Var.OooO0o0;
        if (hashSet.remove(ibVar) && hashSet.isEmpty()) {
            ei1Var.OooO0O0();
        }
    }

    public abstract int OooO0oO();

    public abstract void OooOO0();

    public abstract void OooOO0O();

    public abstract void OooOO0o(t6 t6Var);

    public void OooOOO() {
        OooO0Oo();
        IntentFilter intentFilterOooO0o = OooO0o();
        if (intentFilterOooO0o.countActions() == 0) {
            return;
        }
        if (((g) this.OooO0Oo) == null) {
            this.OooO0Oo = new g(this, 0);
        }
        ((k) this.OooO0o0).OooOOO.registerReceiver((g) this.OooO0Oo, intentFilterOooO0o);
    }

    public abstract void OooOOO0();

    public abstract void OooOOOO();

    public abstract void OooOOOo();

    @Override // com.cmaster.cloner.ju0
    public iu0 OooOo00(ho1 ho1Var) {
        Context context = (Context) this.OooO0Oo;
        Class cls = (Class) this.OooO0o0;
        return new y51(context, ho1Var.OooOO0O(File.class, cls), ho1Var.OooOO0O(Uri.class, cls), cls);
    }

    public h(Context context) {
        this.OooO0Oo = context;
    }

    public /* synthetic */ h(Object obj, Object obj2) {
        this.OooO0Oo = obj;
        this.OooO0o0 = obj2;
    }

    public h(k kVar) {
        this.OooO0o0 = kVar;
    }
}

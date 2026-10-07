package com.cmaster.cloner;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x91 implements ComponentCallbacks2, fm0 {
    public static final aa1 OooOOO;
    public static final aa1 OooOOOO;
    public final vl1 OooO;
    public final com.bumptech.glide.OooO00o OooO0Oo;
    public final yl0 OooO0o;
    public final Context OooO0o0;
    public final oh1 OooO0oO;
    public final z91 OooO0oo;
    public final u91 OooOO0;
    public final kh OooOO0O;
    public final CopyOnWriteArrayList OooOO0o;
    public final aa1 OooOOO0;

    static {
        aa1 aa1Var = (aa1) new aa1().OooO0OO(Bitmap.class);
        aa1Var.OooOOOo = true;
        OooOOO = aa1Var;
        ((aa1) new aa1().OooO0OO(x40.class)).OooOOOo = true;
        OooOOOO = (aa1) ((aa1) ((aa1) new aa1().OooO0Oo(vr.OooO0O0)).OooOO0O()).OooOOOO(true);
    }

    public x91(com.bumptech.glide.OooO00o oooO00o, yl0 yl0Var, z91 z91Var, Context context) {
        aa1 aa1Var;
        oh1 oh1Var = new oh1(4);
        gu0 gu0Var = oooO00o.OooO;
        this.OooO = new vl1();
        u91 u91Var = new u91(this, 0);
        this.OooOO0 = u91Var;
        this.OooO0Oo = oooO00o;
        this.OooO0o = yl0Var;
        this.OooO0oo = z91Var;
        this.OooO0oO = oh1Var;
        this.OooO0o0 = context;
        Context applicationContext = context.getApplicationContext();
        w91 w91Var = new w91(this, oh1Var);
        gu0Var.getClass();
        boolean z = ep2.OooO00o(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        kh znVar = z ? new zn(applicationContext, w91Var) : new wx0();
        this.OooOO0O = znVar;
        synchronized (oooO00o.OooOO0) {
            if (oooO00o.OooOO0.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            oooO00o.OooOO0.add(this);
        }
        char[] cArr = pr1.OooO00o;
        if ((Looper.myLooper() == Looper.getMainLooper() ? 1 : 0) == 0) {
            pr1.OooO0o().post(u91Var);
        } else {
            yl0Var.OooO0O0(this);
        }
        yl0Var.OooO0O0(znVar);
        this.OooOO0o = new CopyOnWriteArrayList(oooO00o.OooO0o.OooO0o0);
        j50 j50Var = oooO00o.OooO0o;
        synchronized (j50Var) {
            try {
                if (j50Var.OooOO0 == null) {
                    j50Var.OooO0Oo.getClass();
                    aa1 aa1Var2 = new aa1();
                    aa1Var2.OooOOOo = true;
                    j50Var.OooOO0 = aa1Var2;
                }
                aa1Var = j50Var.OooOO0;
            } finally {
            }
        }
        synchronized (this) {
            aa1 aa1Var3 = (aa1) aa1Var.clone();
            if (aa1Var3.OooOOOo && !aa1Var3.OooOOo0) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            aa1Var3.OooOOo0 = true;
            aa1Var3.OooOOOo = true;
            this.OooOOO0 = aa1Var3;
        }
    }

    @Override // com.cmaster.cloner.fm0
    public final synchronized void OooO() {
        OooOOO0();
        this.OooO.OooO();
    }

    @Override // com.cmaster.cloner.fm0
    public final synchronized void OooO0o0() {
        this.OooO.OooO0o0();
        OooOO0o();
    }

    public final void OooOO0O(sl1 sl1Var) {
        if (sl1Var == null) {
            return;
        }
        boolean zOooOOO = OooOOO(sl1Var);
        m91 m91VarOooO0oO = sl1Var.OooO0oO();
        if (zOooOOO) {
            return;
        }
        com.bumptech.glide.OooO00o oooO00o = this.OooO0Oo;
        synchronized (oooO00o.OooOO0) {
            try {
                ArrayList arrayList = oooO00o.OooOO0;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((x91) obj).OooOOO(sl1Var)) {
                        return;
                    }
                }
                if (m91VarOooO0oO != null) {
                    sl1Var.OooO00o(null);
                    m91VarOooO0oO.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void OooOO0o() {
        oh1 oh1Var = this.OooO0oO;
        oh1Var.OooO0o0 = true;
        ArrayList arrayListOooO0o0 = pr1.OooO0o0((Set) oh1Var.OooO0o);
        int size = arrayListOooO0o0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            m91 m91Var = (m91) obj;
            if (m91Var.isRunning()) {
                m91Var.OooO0Oo();
                ((HashSet) oh1Var.OooO0oO).add(m91Var);
            }
        }
    }

    public final synchronized boolean OooOOO(sl1 sl1Var) {
        m91 m91VarOooO0oO = sl1Var.OooO0oO();
        if (m91VarOooO0oO == null) {
            return true;
        }
        if (!this.OooO0oO.OooO00o(m91VarOooO0oO)) {
            return false;
        }
        this.OooO.OooO0Oo.remove(sl1Var);
        sl1Var.OooO00o(null);
        return true;
    }

    public final synchronized void OooOOO0() {
        oh1 oh1Var = this.OooO0oO;
        int i = 0;
        oh1Var.OooO0o0 = false;
        ArrayList arrayListOooO0o0 = pr1.OooO0o0((Set) oh1Var.OooO0o);
        int size = arrayListOooO0o0.size();
        while (i < size) {
            Object obj = arrayListOooO0o0.get(i);
            i++;
            m91 m91Var = (m91) obj;
            if (!m91Var.OooOO0() && !m91Var.isRunning()) {
                m91Var.OooO0oo();
            }
        }
        ((HashSet) oh1Var.OooO0oO).clear();
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.cmaster.cloner.fm0
    public final synchronized void onDestroy() {
        int i;
        this.OooO.onDestroy();
        synchronized (this) {
            try {
                ArrayList arrayListOooO0o0 = pr1.OooO0o0(this.OooO.OooO0Oo);
                int size = arrayListOooO0o0.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayListOooO0o0.get(i2);
                    i2++;
                    OooOO0O((sl1) obj);
                }
                this.OooO.OooO0Oo.clear();
            } finally {
            }
        }
        oh1 oh1Var = this.OooO0oO;
        ArrayList arrayListOooO0o02 = pr1.OooO0o0((Set) oh1Var.OooO0o);
        int size2 = arrayListOooO0o02.size();
        while (i < size2) {
            Object obj2 = arrayListOooO0o02.get(i);
            i++;
            oh1Var.OooO00o((m91) obj2);
        }
        ((HashSet) oh1Var.OooO0oO).clear();
        this.OooO0o.OooO00o(this);
        this.OooO0o.OooO00o(this.OooOO0O);
        pr1.OooO0o().removeCallbacks(this.OooOO0);
        com.bumptech.glide.OooO00o oooO00o = this.OooO0Oo;
        synchronized (oooO00o.OooOO0) {
            if (!oooO00o.OooOO0.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            oooO00o.OooOO0.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.OooO0oO + ", treeNode=" + this.OooO0oo + "}";
    }
}

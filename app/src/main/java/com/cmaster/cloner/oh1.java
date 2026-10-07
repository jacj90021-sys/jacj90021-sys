package com.cmaster.cloner;

import android.content.Context;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oh1 implements r50 {
    public static volatile oh1 OooO0oo;
    public final /* synthetic */ int OooO0Oo;
    public final Object OooO0o;
    public boolean OooO0o0;
    public Object OooO0oO;

    public oh1(int i) {
        this.OooO0Oo = i;
        switch (i) {
            case 5:
                this.OooO0o = new Object();
                break;
            default:
                this.OooO0o = Collections.newSetFromMap(new WeakHashMap());
                this.OooO0oO = new HashSet();
                break;
        }
    }

    public static oh1 OooO0O0(Context context) {
        if (OooO0oo == null) {
            synchronized (oh1.class) {
                try {
                    if (OooO0oo == null) {
                        OooO0oo = new oh1(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return OooO0oo;
    }

    public boolean OooO00o(m91 m91Var) {
        boolean z = true;
        if (m91Var == null) {
            return true;
        }
        boolean zRemove = ((Set) this.OooO0o).remove(m91Var);
        if (!((HashSet) this.OooO0oO).remove(m91Var) && !zRemove) {
            z = false;
        }
        if (z) {
            m91Var.clear();
        }
        return z;
    }

    public void OooO0OO() {
        if (this.OooO0o0 || ((HashSet) this.OooO0oO).isEmpty()) {
            return;
        }
        km kmVar = (km) this.OooO0o;
        bj bjVar = (bj) kmVar.OooO0OO;
        boolean z = false;
        kmVar.OooO00o = ((ConnectivityManager) bjVar.get()).getActiveNetwork() != null;
        try {
            ((ConnectivityManager) bjVar.get()).registerDefaultNetworkCallback((yw0) kmVar.OooO0Oo);
            z = true;
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register callback", e);
            }
        }
        this.OooO0o0 = z;
    }

    public void OooO0Oo(Typeface typeface) {
        if (this.OooO0o0) {
            return;
        }
        ne neVar = (ne) ((xb1) this.OooO0oO).OooO0o0;
        if (neVar.OooOO0o(typeface)) {
            neVar.OooOO0(false);
        }
    }

    public void OooO0o(xl1 xl1Var) {
        he2 he2Var;
        synchronized (this.OooO0o) {
            if (((ArrayDeque) this.OooO0oO) != null && !this.OooO0o0) {
                this.OooO0o0 = true;
                while (true) {
                    synchronized (this.OooO0o) {
                        try {
                            he2Var = (he2) ((ArrayDeque) this.OooO0oO).poll();
                            if (he2Var == null) {
                                this.OooO0o0 = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    he2Var.OooO00o(xl1Var);
                }
            }
        }
    }

    public void OooO0o0(he2 he2Var) {
        synchronized (this.OooO0o) {
            try {
                if (((ArrayDeque) this.OooO0oO) == null) {
                    this.OooO0oO = new ArrayDeque();
                }
                ((ArrayDeque) this.OooO0oO).add(he2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.r50
    public Object get() {
        if (this.OooO0o0) {
            qa.OooO0o("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            return null;
        }
        s43.OooO00o("Glide registry");
        this.OooO0o0 = true;
        try {
            return ly2.OooO00o((com.bumptech.glide.OooO00o) this.OooO0o, (ArrayList) this.OooO0oO);
        } finally {
            this.OooO0o0 = false;
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.OooO0Oo) {
            case 4:
                return super.toString() + "{numRequests=" + ((Set) this.OooO0o).size() + ", isPaused=" + this.OooO0o0 + "}";
            default:
                return super.toString();
        }
    }

    public oh1(xb1 xb1Var, Typeface typeface) {
        this.OooO0Oo = 1;
        this.OooO0o = typeface;
        this.OooO0oO = xb1Var;
    }

    public oh1(dg dgVar, wf wfVar) {
        this.OooO0Oo = 2;
        this.OooO0o = new Object();
        this.OooO0oO = new ArrayList();
    }

    public oh1(Context context) {
        this.OooO0Oo = 0;
        this.OooO0oO = new HashSet();
        this.OooO0o = new km(new bj(new pr(context, 5)), new mh1(this));
    }

    public oh1(com.bumptech.glide.OooO00o oooO00o, ArrayList arrayList, bn2 bn2Var) {
        this.OooO0Oo = 3;
        this.OooO0o = oooO00o;
        this.OooO0oO = arrayList;
    }
}

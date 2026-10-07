package com.cmaster.cloner;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class x60 implements od1, f02, hx {
    public static final String OooOO0o = ep0.OooO("GreedyScheduler");
    public boolean OooO;
    public final Context OooO0Oo;
    public final g02 OooO0o;
    public final q02 OooO0o0;
    public final kp OooO0oo;
    public Boolean OooOO0O;
    public final HashSet OooO0oO = new HashSet();
    public final Object OooOO0 = new Object();

    public x60(Context context, xf1 xf1Var, hx2 hx2Var, q02 q02Var) {
        this.OooO0Oo = context;
        this.OooO0o0 = q02Var;
        this.OooO0o = new g02(context, hx2Var, this);
        this.OooO0oo = new kp(this, (ay1) xf1Var.OooO0oo);
    }

    @Override // com.cmaster.cloner.od1
    public final boolean OooO00o() {
        return false;
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.OooOO0) {
            try {
                Iterator it = this.OooO0oO.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    w02 w02Var = (w02) it.next();
                    if (w02Var.OooO00o.equals(str)) {
                        ep0.OooO0oO().OooO0Oo(OooOO0o, "Stopping tracking for " + str, new Throwable[0]);
                        this.OooO0oO.remove(w02Var);
                        this.OooO0o.OooO0O0(this.OooO0oO);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.od1
    public final void OooO0OO(String str) {
        Runnable runnable;
        Boolean bool = this.OooOO0O;
        q02 q02Var = this.OooO0o0;
        if (bool == null) {
            this.OooOO0O = Boolean.valueOf(f51.OooO00o(this.OooO0Oo, q02Var.OooO0O0));
        }
        boolean zBooleanValue = this.OooOO0O.booleanValue();
        String str2 = OooOO0o;
        if (!zBooleanValue) {
            ep0.OooO0oO().OooO0oo(str2, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.OooO) {
            q02Var.OooO0o.OooO00o(this);
            this.OooO = true;
        }
        ep0.OooO0oO().OooO0Oo(str2, rj.OooO0OO("Cancelling work ID ", str), new Throwable[0]);
        kp kpVar = this.OooO0oo;
        if (kpVar != null && (runnable = (Runnable) kpVar.OooO0OO.remove(str)) != null) {
            ((Handler) kpVar.OooO0O0.OooO0o0).removeCallbacks(runnable);
        }
        q02Var.OooO0oO(str);
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0Oo(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            ep0.OooO0oO().OooO0Oo(OooOO0o, rj.OooO0OO("Constraints not met: Cancelling work ID ", str), new Throwable[0]);
            this.OooO0o0.OooO0oO(str);
        }
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0o(List list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            ep0.OooO0oO().OooO0Oo(OooOO0o, rj.OooO0OO("Constraints met: Scheduling work ID ", str), new Throwable[0]);
            this.OooO0o0.OooO0o(str, null);
        }
    }

    @Override // com.cmaster.cloner.od1
    public final void OooO0o0(w02... w02VarArr) {
        if (this.OooOO0O == null) {
            this.OooOO0O = Boolean.valueOf(f51.OooO00o(this.OooO0Oo, this.OooO0o0.OooO0O0));
        }
        boolean z = false;
        if (!this.OooOO0O.booleanValue()) {
            ep0.OooO0oO().OooO0oo(OooOO0o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.OooO) {
            this.OooO0o0.OooO0o.OooO00o(this);
            this.OooO = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (w02 w02Var : w02VarArr) {
            long jOooO00o = w02Var.OooO00o();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (w02Var.OooO0O0 == 1) {
                if (jCurrentTimeMillis < jOooO00o) {
                    kp kpVar = this.OooO0oo;
                    if (kpVar != null) {
                        ay1 ay1Var = kpVar.OooO0O0;
                        HashMap map = kpVar.OooO0OO;
                        Runnable runnable = (Runnable) map.remove(w02Var.OooO00o);
                        if (runnable != null) {
                            ((Handler) ay1Var.OooO0o0).removeCallbacks(runnable);
                        }
                        pi2 pi2Var = new pi2(kpVar, w02Var, 17, z);
                        map.put(w02Var.OooO00o, pi2Var);
                        ((Handler) ay1Var.OooO0o0).postDelayed(pi2Var, w02Var.OooO00o() - System.currentTimeMillis());
                    }
                } else if (w02Var.OooO0O0()) {
                    ji jiVar = w02Var.OooOO0;
                    if (jiVar.OooO0OO) {
                        ep0.OooO0oO().OooO0Oo(OooOO0o, "Ignoring WorkSpec " + w02Var + ", Requires device idle.", new Throwable[0]);
                    } else if (jiVar.OooO0oo.OooO00o.size() > 0) {
                        ep0.OooO0oO().OooO0Oo(OooOO0o, "Ignoring WorkSpec " + w02Var + ", Requires ContentUri triggers.", new Throwable[0]);
                    } else {
                        hashSet.add(w02Var);
                        hashSet2.add(w02Var.OooO00o);
                    }
                } else {
                    ep0.OooO0oO().OooO0Oo(OooOO0o, rj.OooO0OO("Starting work for ", w02Var.OooO00o), new Throwable[0]);
                    this.OooO0o0.OooO0o(w02Var.OooO00o, null);
                }
            }
        }
        synchronized (this.OooOO0) {
            try {
                if (!hashSet.isEmpty()) {
                    ep0.OooO0oO().OooO0Oo(OooOO0o, "Starting tracking for [" + TextUtils.join(",", hashSet2) + "]", new Throwable[0]);
                    this.OooO0oO.addAll(hashSet);
                    this.OooO0o.OooO0O0(this.OooO0oO);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

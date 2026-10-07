package com.cmaster.cloner;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vn implements jn, Runnable, Comparable, ky {
    public final bj OooO0oO;
    public final r31 OooO0oo;
    public j50 OooOO0O;
    public zk0 OooOO0o;
    public pw OooOOO;
    public t41 OooOOO0;
    public int OooOOOO;
    public int OooOOOo;
    public xz0 OooOOo;
    public vr OooOOo0;
    public ow OooOOoo;
    public zk0 OooOo;
    public long OooOo0;
    public int OooOo00;
    public Object OooOo0O;
    public Thread OooOo0o;
    public Object OooOoO;
    public zk0 OooOoO0;
    public in OooOoOO;
    public volatile boolean OooOoo;
    public volatile kn OooOoo0;
    public volatile boolean OooOooO;
    public boolean OooOooo;
    public int Oooo000;
    public int Oooo00O;
    public int Oooo00o;
    public final tn OooO0Oo = new tn();
    public final ArrayList OooO0o0 = new ArrayList();
    public final vi1 OooO0o = new vi1();
    public final a02 OooO = new a02(7, false);
    public final un OooOO0 = new un();

    public vn(bj bjVar, hx2 hx2Var) {
        this.OooO0oO = bjVar;
        this.OooO0oo = hx2Var;
    }

    public final void OooO(String str, String str2, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(cp0.OooO00o(j));
        sb.append(", load key: ");
        sb.append(this.OooOOO);
        sb.append(str2 != null ? ", ".concat(str2) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    @Override // com.cmaster.cloner.jn
    public final void OooO00o(zk0 zk0Var, Object obj, in inVar, int i, zk0 zk0Var2) {
        this.OooOo = zk0Var;
        this.OooOoO = obj;
        this.OooOoOO = inVar;
        this.Oooo00o = i;
        this.OooOoO0 = zk0Var2;
        this.OooOooo = zk0Var != this.OooO0Oo.OooO00o().get(0);
        if (Thread.currentThread() == this.OooOo0o) {
            OooO0o();
            return;
        }
        this.Oooo00O = 3;
        ow owVar = this.OooOOoo;
        (owVar.OooOOOo ? owVar.OooOO0o : owVar.OooOO0O).execute(this);
    }

    @Override // com.cmaster.cloner.jn
    public final void OooO0O0(zk0 zk0Var, Exception exc, in inVar, int i) {
        inVar.OooO0Oo();
        n50 n50Var = new n50("Fetching data failed", Collections.singletonList(exc));
        Class clsOooO00o = inVar.OooO00o();
        n50Var.OooO0o0 = zk0Var;
        n50Var.OooO0o = i;
        n50Var.OooO0oO = clsOooO00o;
        this.OooO0o0.add(n50Var);
        if (Thread.currentThread() == this.OooOo0o) {
            OooOO0o();
            return;
        }
        this.Oooo00O = 2;
        ow owVar = this.OooOOoo;
        (owVar.OooOOOo ? owVar.OooOO0o : owVar.OooOO0O).execute(this);
    }

    @Override // com.cmaster.cloner.ky
    public final vi1 OooO0OO() {
        return this.OooO0o;
    }

    public final fa1 OooO0Oo(in inVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = cp0.OooO0O0;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            fa1 fa1VarOooO0o0 = OooO0o0(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                OooO("Decoded result " + fa1VarOooO0o0, null, jElapsedRealtimeNanos);
            }
            return fa1VarOooO0o0;
        } finally {
            inVar.OooO0Oo();
        }
    }

    public final void OooO0o() {
        fa1 fa1VarOooO0Oo;
        boolean zOooO00o;
        if (Log.isLoggable("DecodeJob", 2)) {
            OooO("Retrieved data", "data: " + this.OooOoO + ", cache key: " + this.OooOo + ", fetcher: " + this.OooOoOO, this.OooOo0);
        }
        zo0 zo0Var = null;
        try {
            fa1VarOooO0Oo = OooO0Oo(this.OooOoOO, this.OooOoO, this.Oooo00o);
        } catch (n50 e) {
            zk0 zk0Var = this.OooOoO0;
            int i = this.Oooo00o;
            e.OooO0o0 = zk0Var;
            e.OooO0o = i;
            e.OooO0oO = null;
            this.OooO0o0.add(e);
            fa1VarOooO0Oo = null;
        }
        if (fa1VarOooO0Oo == null) {
            OooOO0o();
            return;
        }
        int i2 = this.Oooo00o;
        if (fa1VarOooO0Oo instanceof lg0) {
            ((lg0) fa1VarOooO0Oo).OooO00o();
        }
        if (((zo0) this.OooO.OooO0oO) != null) {
            zo0Var = (zo0) zo0.OooO0oo.OooO0oo();
            zo0Var.OooO0oO = false;
            zo0Var.OooO0o = true;
            zo0Var.OooO0o0 = fa1VarOooO0Oo;
            fa1VarOooO0Oo = zo0Var;
        }
        OooOOO();
        ow owVar = this.OooOOoo;
        synchronized (owVar) {
            owVar.OooOOo0 = fa1VarOooO0Oo;
            owVar.OooOOo = i2;
        }
        synchronized (owVar) {
            try {
                owVar.OooO0o0.OooO00o();
                if (owVar.OooOo) {
                    owVar.OooOOo0.OooO0O0();
                    owVar.OooO0o();
                } else {
                    if (owVar.OooO0Oo.OooO0Oo.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (owVar.OooOOoo) {
                        throw new IllegalStateException("Already have resource");
                    }
                    im2 im2Var = owVar.OooO0oo;
                    fa1 fa1Var = owVar.OooOOo0;
                    boolean z = owVar.OooOOOO;
                    pw pwVar = owVar.OooOOO;
                    kw kwVar = owVar.OooO0o;
                    im2Var.getClass();
                    owVar.OooOo0O = new qw(fa1Var, z, true, pwVar, kwVar);
                    owVar.OooOOoo = true;
                    nw nwVar = owVar.OooO0Oo;
                    nwVar.getClass();
                    ArrayList arrayList = new ArrayList(nwVar.OooO0Oo);
                    owVar.OooO0Oo(arrayList.size() + 1);
                    owVar.OooO.OooO0Oo(owVar, owVar.OooOOO, owVar.OooOo0O);
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        mw mwVar = (mw) obj;
                        mwVar.OooO0O0.execute(new lw(owVar, mwVar.OooO00o, 1));
                    }
                    owVar.OooO0O0();
                }
            } finally {
            }
        }
        this.Oooo000 = 5;
        try {
            a02 a02Var = this.OooO;
            if (((zo0) a02Var.OooO0oO) != null) {
                try {
                    this.OooO0oO.OooO00o().OooOOOO((zk0) a02Var.OooO0o0, new hx2((la1) a02Var.OooO0o, (zo0) a02Var.OooO0oO, this.OooOOo, 6));
                    ((zo0) a02Var.OooO0oO).OooO00o();
                } catch (Throwable th) {
                    ((zo0) a02Var.OooO0oO).OooO00o();
                    throw th;
                }
            }
            if (zo0Var != null) {
                zo0Var.OooO00o();
            }
            un unVar = this.OooOO0;
            synchronized (unVar) {
                unVar.OooO0O0 = true;
                zOooO00o = unVar.OooO00o();
            }
            if (zOooO00o) {
                OooOO0O();
            }
        } finally {
        }
    }

    public final fa1 OooO0o0(int i, Object obj) {
        Class<?> cls = obj.getClass();
        tn tnVar = this.OooO0Oo;
        yn0 yn0VarOooO0OO = tnVar.OooO0OO(cls);
        xz0 xz0Var = this.OooOOo;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || tnVar.OooOOo;
            tz0 tz0Var = us.OooO;
            Boolean bool = (Boolean) xz0Var.OooO0OO(tz0Var);
            if (bool == null || (bool.booleanValue() && !z)) {
                xz0Var = new xz0();
                ea eaVar = this.OooOOo.OooO0O0;
                ea eaVar2 = xz0Var.OooO0O0;
                eaVar2.OooO0oO(eaVar);
                eaVar2.put(tz0Var, Boolean.valueOf(z));
            }
        }
        xz0 xz0Var2 = xz0Var;
        nn nnVarOooO0oO = this.OooOO0O.OooO00o().OooO0oO(obj);
        try {
            return yn0VarOooO0OO.OooO00o(this.OooOOOO, this.OooOOOo, new oOo000Oo(this, i), nnVarOooO0oO, xz0Var2);
        } finally {
            nnVarOooO0oO.OooO0Oo();
        }
    }

    public final kn OooO0oO() {
        int iOooOOoo = rj.OooOOoo(this.Oooo000);
        tn tnVar = this.OooO0Oo;
        if (iOooOOoo == 1) {
            return new ga1(tnVar, this);
        }
        if (iOooOOoo == 2) {
            return new fn(tnVar.OooO00o(), tnVar, this);
        }
        if (iOooOOoo == 3) {
            return new yh1(tnVar, this);
        }
        if (iOooOOoo == 5) {
            return null;
        }
        qa.OooO0o("Unrecognized stage: ".concat(rj.OooOo0(this.Oooo000)));
        return null;
    }

    public final int OooO0oo(int i) {
        int iOooOOoo = rj.OooOOoo(i);
        if (iOooOOoo == 0) {
            if (this.OooOOo0.OooO0O0()) {
                return 2;
            }
            return OooO0oo(2);
        }
        if (iOooOOoo == 1) {
            if (this.OooOOo0.OooO00o()) {
                return 3;
            }
            return OooO0oo(3);
        }
        if (iOooOOoo == 2) {
            return 4;
        }
        if (iOooOOoo == 3 || iOooOOoo == 5) {
            return 6;
        }
        ra.OooOOO("Unrecognized stage: ".concat(rj.OooOo0(i)));
        return 0;
    }

    public final void OooOO0() {
        boolean zOooO00o;
        OooOOO();
        n50 n50Var = new n50("Failed to load resource", new ArrayList(this.OooO0o0));
        ow owVar = this.OooOOoo;
        synchronized (owVar) {
            owVar.OooOo00 = n50Var;
        }
        synchronized (owVar) {
            try {
                owVar.OooO0o0.OooO00o();
                if (owVar.OooOo) {
                    owVar.OooO0o();
                } else {
                    if (owVar.OooO0Oo.OooO0Oo.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (owVar.OooOo0) {
                        throw new IllegalStateException("Already failed once");
                    }
                    owVar.OooOo0 = true;
                    pw pwVar = owVar.OooOOO;
                    nw nwVar = owVar.OooO0Oo;
                    nwVar.getClass();
                    ArrayList arrayList = new ArrayList(nwVar.OooO0Oo);
                    owVar.OooO0Oo(arrayList.size() + 1);
                    owVar.OooO.OooO0Oo(owVar, pwVar, null);
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        mw mwVar = (mw) obj;
                        mwVar.OooO0O0.execute(new lw(owVar, mwVar.OooO00o, 0));
                    }
                    owVar.OooO0O0();
                }
            } finally {
            }
        }
        un unVar = this.OooOO0;
        synchronized (unVar) {
            unVar.OooO0OO = true;
            zOooO00o = unVar.OooO00o();
        }
        if (zOooO00o) {
            OooOO0O();
        }
    }

    public final void OooOO0O() {
        un unVar = this.OooOO0;
        synchronized (unVar) {
            unVar.OooO0O0 = false;
            unVar.OooO00o = false;
            unVar.OooO0OO = false;
        }
        a02 a02Var = this.OooO;
        a02Var.OooO0o0 = null;
        a02Var.OooO0o = null;
        a02Var.OooO0oO = null;
        tn tnVar = this.OooO0Oo;
        tnVar.OooO0OO = null;
        tnVar.OooO0Oo = null;
        tnVar.OooOOO = null;
        tnVar.OooO0oO = null;
        tnVar.OooOO0O = null;
        tnVar.OooO = null;
        tnVar.OooOOOO = null;
        tnVar.OooOO0 = null;
        tnVar.OooOOOo = null;
        tnVar.OooO00o.clear();
        tnVar.OooOO0o = false;
        tnVar.OooO0O0.clear();
        tnVar.OooOOO0 = false;
        this.OooOoo = false;
        this.OooOO0O = null;
        this.OooOO0o = null;
        this.OooOOo = null;
        this.OooOOO0 = null;
        this.OooOOO = null;
        this.OooOOoo = null;
        this.Oooo000 = 0;
        this.OooOoo0 = null;
        this.OooOo0o = null;
        this.OooOo = null;
        this.OooOoO = null;
        this.Oooo00o = 0;
        this.OooOoOO = null;
        this.OooOo0 = 0L;
        this.OooOooO = false;
        this.OooOo0O = null;
        this.OooO0o0.clear();
        this.OooO0oo.OooO0O0(this);
    }

    public final void OooOO0o() {
        this.OooOo0o = Thread.currentThread();
        int i = cp0.OooO0O0;
        this.OooOo0 = SystemClock.elapsedRealtimeNanos();
        boolean zOooO0OO = false;
        while (!this.OooOooO && this.OooOoo0 != null && !(zOooO0OO = this.OooOoo0.OooO0OO())) {
            this.Oooo000 = OooO0oo(this.Oooo000);
            this.OooOoo0 = OooO0oO();
            if (this.Oooo000 == 4) {
                this.Oooo00O = 2;
                ow owVar = this.OooOOoo;
                (owVar.OooOOOo ? owVar.OooOO0o : owVar.OooOO0O).execute(this);
                return;
            }
        }
        if ((this.Oooo000 == 6 || this.OooOooO) && !zOooO0OO) {
            OooOO0();
        }
    }

    public final void OooOOO() {
        Throwable th;
        this.OooO0o.OooO00o();
        if (!this.OooOoo) {
            this.OooOoo = true;
            return;
        }
        if (this.OooO0o0.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.OooO0o0;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    public final void OooOOO0() {
        int iOooOOoo = rj.OooOOoo(this.Oooo00O);
        if (iOooOOoo == 0) {
            this.Oooo000 = OooO0oo(1);
            this.OooOoo0 = OooO0oO();
            OooOO0o();
        } else if (iOooOOoo == 1) {
            OooOO0o();
        } else if (iOooOOoo == 2) {
            OooO0o();
        } else {
            int i = this.Oooo00O;
            qa.OooO0o("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        vn vnVar = (vn) obj;
        int iOrdinal = this.OooOOO0.ordinal() - vnVar.OooOOO0.ordinal();
        return iOrdinal == 0 ? this.OooOo00 - vnVar.OooOo00 : iOrdinal;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in inVar = this.OooOoOO;
        try {
            try {
                if (this.OooOooO) {
                    OooOO0();
                    if (inVar != null) {
                        inVar.OooO0Oo();
                        return;
                    }
                    return;
                }
                OooOOO0();
                if (inVar != null) {
                    inVar.OooO0Oo();
                }
            } catch (Throwable th) {
                if (inVar != null) {
                    inVar.OooO0Oo();
                }
                throw th;
            }
        } catch (ja e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.OooOooO + ", stage: " + rj.OooOo0(this.Oooo000), th2);
            }
            if (this.Oooo000 != 5) {
                this.OooO0o0.add(th2);
                OooOO0();
            }
            if (!this.OooOooO) {
                throw th2;
            }
            throw th2;
        }
    }
}

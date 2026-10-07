package com.cmaster.cloner;

import android.os.Looper;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class tb1 {
    public dj OooO00o;
    public Executor OooO0O0;
    public oo000000 OooO0OO;
    public pb1 OooO0Oo;
    public mj0 OooO0o0;
    public boolean OooO0oO;
    public final o0O000O OooO0o = new o0O000O(new wy0(0, this, tb1.class, "onClosed", "onClosed()V", 0, 0, 2));
    public final ThreadLocal OooO0oo = new ThreadLocal();
    public final LinkedHashMap OooO = new LinkedHashMap();
    public boolean OooOO0 = true;

    public final kk1 OooO() {
        pb1 pb1Var = this.OooO0Oo;
        if (pb1Var == null) {
            ij0.OooO("connectionManager");
            throw null;
        }
        kk1 kk1VarOooO0OO = pb1Var.OooO0OO();
        if (kk1VarOooO0OO != null) {
            return kk1VarOooO0OO;
        }
        qa.OooO0o("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final void OooO00o() {
        if (this.OooO0oO) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qa.OooO0o("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void OooO0O0() {
        if (!OooOO0o() || OooOOO0() || this.OooO0oo.get() == null) {
            return;
        }
        qa.OooO0o("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void OooO0OO() {
        OooO00o();
        OooO00o();
        c30 c30VarOooOO0O = OooO().OooOO0O();
        if (!c30VarOooOO0O.OooOOo()) {
            xy2.OooO00o(new lj0(OooO0oo(), null, 0));
        }
        if (c30VarOooOO0O.OooO0Oo.isWriteAheadLoggingEnabled()) {
            c30VarOooOO0O.OooO0o();
        } else {
            c30VarOooOO0O.OooO0OO();
        }
    }

    public abstract mj0 OooO0Oo();

    public kk1 OooO0o(on onVar) {
        onVar.getClass();
        throw new fx0(0);
    }

    public pu OooO0o0() {
        throw new fx0(0);
    }

    public List OooO0oO(LinkedHashMap linkedHashMap) {
        return nv.OooO0Oo;
    }

    public final mj0 OooO0oo() {
        mj0 mj0Var = this.OooO0o0;
        if (mj0Var != null) {
            return mj0Var;
        }
        ij0.OooO("internalTracker");
        throw null;
    }

    public Set OooOO0() {
        return qv.OooO0Oo;
    }

    public Map OooOO0O() {
        return pv.OooO0Oo;
    }

    public final boolean OooOO0o() {
        pb1 pb1Var = this.OooO0Oo;
        if (pb1Var != null) {
            return pb1Var.OooO0OO() != null;
        }
        ij0.OooO("connectionManager");
        throw null;
    }

    public final void OooOOO() {
        OooO().OooOO0O().OooO();
        if (OooOOO0()) {
            return;
        }
        mj0 mj0VarOooO0oo = OooO0oo();
        mj0VarOooO0oo.OooO0O0.OooOOo0(mj0VarOooO0oo.OooO0o0, mj0VarOooO0oo.OooO0o);
    }

    public final boolean OooOOO0() {
        return OooOOOo() && OooO().OooOO0O().OooOOo();
    }

    public final void OooOOOO(mc1 mc1Var) throws Exception {
        mc1Var.getClass();
        mj0 mj0VarOooO0oo = OooO0oo();
        rp1 rp1Var = mj0VarOooO0oo.OooO0O0;
        rp1Var.getClass();
        rc1 rc1VarOooOOo0 = mc1Var.OooOOo0("PRAGMA query_only");
        try {
            rc1VarOooOOo0.OooOOOo();
            boolean z = rc1VarOooOOo0.getLong(0) != 0;
            in2.OooO00o(rc1VarOooOOo0, null);
            if (!z) {
                zy2.OooO00o(mc1Var, "PRAGMA temp_store = MEMORY");
                zy2.OooO00o(mc1Var, "PRAGMA recursive_triggers = 1");
                zy2.OooO00o(mc1Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (rp1Var.OooO00o) {
                    zy2.OooO00o(mc1Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    zy2.OooO00o(mc1Var, uj1.OooO0oO("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                km kmVar = (km) rp1Var.OooO0oO;
                ReentrantLock reentrantLock = (ReentrantLock) kmVar.OooO0O0;
                reentrantLock.lock();
                try {
                    kmVar.OooO00o = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (mj0VarOooO0oo.OooO0oO) {
            }
        } finally {
        }
    }

    public final boolean OooOOOo() {
        pb1 pb1Var = this.OooO0Oo;
        if (pb1Var == null) {
            ij0.OooO("connectionManager");
            throw null;
        }
        c30 c30Var = (c30) pb1Var.OooO0oO;
        if (c30Var != null) {
            return c30Var.OooO0Oo.isOpen();
        }
        return false;
    }

    public final void OooOOo0() {
        OooO().OooOO0O().OooOo00();
    }
}

package androidx.work.impl;

import android.content.Context;
import com.cmaster.cloner.er1;
import com.cmaster.cloner.ho1;
import com.cmaster.cloner.hx2;
import com.cmaster.cloner.kk1;
import com.cmaster.cloner.km;
import com.cmaster.cloner.mj0;
import com.cmaster.cloner.nz0;
import com.cmaster.cloner.o0O00000;
import com.cmaster.cloner.o0O000O;
import com.cmaster.cloner.on;
import com.cmaster.cloner.vb1;
import com.cmaster.cloner.vr1;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile o0O00000 OooOO0O;
    public volatile o0O000O OooOO0o;
    public volatile hx2 OooOOO;
    public volatile vr1 OooOOO0;
    public volatile er1 OooOOOO;
    public volatile ho1 OooOOOo;
    public volatile o0O000O OooOOo0;

    @Override // com.cmaster.cloner.tb1
    public final mj0 OooO0Oo() {
        return new mj0(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // com.cmaster.cloner.tb1
    public final kk1 OooO0o(on onVar) {
        vb1 vb1Var = new vb1(onVar, new nz0(this, 12));
        Context context = onVar.OooO00o;
        context.getClass();
        return onVar.OooO0OO.OooO0Oo(new km(context, onVar.OooO0O0, vb1Var, false));
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0O000O OooOOo() {
        o0O000O o0o000o;
        if (this.OooOO0o != null) {
            return this.OooOO0o;
        }
        synchronized (this) {
            try {
                if (this.OooOO0o == null) {
                    this.OooOO0o = new o0O000O(this, 12);
                }
                o0o000o = this.OooOO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o000o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0O000O OooOOoo() {
        o0O000O o0o000o;
        if (this.OooOOo0 != null) {
            return this.OooOOo0;
        }
        synchronized (this) {
            try {
                if (this.OooOOo0 == null) {
                    this.OooOOo0 = new o0O000O(this, 24);
                }
                o0o000o = this.OooOOo0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o000o;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final vr1 OooOo() {
        vr1 vr1Var;
        if (this.OooOOO0 != null) {
            return this.OooOOO0;
        }
        synchronized (this) {
            try {
                if (this.OooOOO0 == null) {
                    this.OooOOO0 = new vr1(this);
                }
                vr1Var = this.OooOOO0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vr1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final er1 OooOo0() {
        er1 er1Var;
        if (this.OooOOOO != null) {
            return this.OooOOOO;
        }
        synchronized (this) {
            try {
                if (this.OooOOOO == null) {
                    this.OooOOOO = new er1(this);
                }
                er1Var = this.OooOOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return er1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final hx2 OooOo00() {
        hx2 hx2Var;
        if (this.OooOOO != null) {
            return this.OooOOO;
        }
        synchronized (this) {
            try {
                if (this.OooOOO == null) {
                    this.OooOOO = new hx2(this);
                }
                hx2Var = this.OooOOO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hx2Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ho1 OooOo0O() {
        ho1 ho1Var;
        if (this.OooOOOo != null) {
            return this.OooOOOo;
        }
        synchronized (this) {
            try {
                if (this.OooOOOo == null) {
                    this.OooOOOo = new ho1(this);
                }
                ho1Var = this.OooOOOo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ho1Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final o0O00000 OooOo0o() {
        o0O00000 o0o00000;
        if (this.OooOO0O != null) {
            return this.OooOO0O;
        }
        synchronized (this) {
            try {
                if (this.OooOO0O == null) {
                    this.OooOO0O = new o0O00000(this);
                }
                o0o00000 = this.OooOO0O;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0o00000;
    }
}

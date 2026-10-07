package com.cmaster.cloner;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gi {
    public static final String OooO0o = ep0.OooO("ConstraintTracker");
    public final zl1 OooO00o;
    public final Context OooO0O0;
    public final Object OooO0OO = new Object();
    public final LinkedHashSet OooO0Oo = new LinkedHashSet();
    public Object OooO0o0;

    public gi(Context context, zl1 zl1Var) {
        this.OooO0O0 = context.getApplicationContext();
        this.OooO00o = zl1Var;
    }

    public abstract Object OooO00o();

    public final void OooO0O0(sh shVar) {
        synchronized (this.OooO0OO) {
            try {
                if (this.OooO0Oo.remove(shVar) && this.OooO0Oo.isEmpty()) {
                    OooO0o0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0OO(Object obj) {
        synchronized (this.OooO0OO) {
            try {
                Object obj2 = this.OooO0o0;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.OooO0o0 = obj;
                    ((yc1) ((hx2) this.OooO00o).OooO0oO).execute(new pi2((Object) this, (Object) new ArrayList(this.OooO0Oo), 13, false));
                }
            } finally {
            }
        }
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o0();
}

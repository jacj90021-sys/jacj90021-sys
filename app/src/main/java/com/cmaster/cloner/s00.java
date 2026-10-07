package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s00 implements ru {
    public ThreadPoolExecutor OooO;
    public final Context OooO0Oo;
    public final iu OooO0o;
    public final r00 OooO0o0;
    public final Object OooO0oO = new Object();
    public Handler OooO0oo;
    public ThreadPoolExecutor OooOO0;
    public sq2 OooOO0O;

    public s00(Context context, r00 r00Var) {
        fy2.OooO00o(context, "Context cannot be null");
        this.OooO0Oo = context.getApplicationContext();
        this.OooO0o0 = r00Var;
        this.OooO0o = t00.OooO0Oo;
    }

    public final void OooO00o() {
        synchronized (this.OooO0oO) {
            try {
                this.OooOO0O = null;
                Handler handler = this.OooO0oo;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.OooO0oo = null;
                ThreadPoolExecutor threadPoolExecutor = this.OooOO0;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.OooO = null;
                this.OooOO0 = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final c10 OooO0O0() {
        try {
            iu iuVar = this.OooO0o;
            Context context = this.OooO0Oo;
            r00 r00Var = this.OooO0o0;
            iuVar.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{r00Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            oOo000Oo ooo000ooOooO00o = q00.OooO00o(context, Collections.unmodifiableList(arrayList));
            int i = ooo000ooOooO00o.OooO0Oo;
            if (i != 0) {
                ra.OooOOO0(rj.OooO00o(i, "fetchFonts failed (", ")"));
                return null;
            }
            c10[] c10VarArr = (c10[]) ((List) ooo000ooOooO00o.OooO0o0).get(0);
            if (c10VarArr != null && c10VarArr.length != 0) {
                return c10VarArr[0];
            }
            ra.OooOOO0("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            qa.OooO0oO("provider not found", e);
            return null;
        }
    }

    @Override // com.cmaster.cloner.ru
    public final void OooO0Oo(sq2 sq2Var) {
        synchronized (this.OooO0oO) {
            this.OooOO0O = sq2Var;
        }
        synchronized (this.OooO0oO) {
            try {
                if (this.OooOO0O == null) {
                    return;
                }
                if (this.OooO == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new sg("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.OooOO0 = threadPoolExecutor;
                    this.OooO = threadPoolExecutor;
                }
                this.OooO.execute(new o00OOOOo(this, 9));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

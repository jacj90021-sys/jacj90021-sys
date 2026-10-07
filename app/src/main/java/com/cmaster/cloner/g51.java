package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g51 implements hx {
    public static final String OooOOOO = ep0.OooO("Processor");
    public final xf1 OooO0o;
    public final Context OooO0o0;
    public final hx2 OooO0oO;
    public final WorkDatabase OooO0oo;
    public final List OooOO0O;
    public final HashMap OooOO0 = new HashMap();
    public final HashMap OooO = new HashMap();
    public final HashSet OooOO0o = new HashSet();
    public final ArrayList OooOOO0 = new ArrayList();
    public PowerManager.WakeLock OooO0Oo = null;
    public final Object OooOOO = new Object();

    public g51(Context context, xf1 xf1Var, hx2 hx2Var, WorkDatabase workDatabase, List list) {
        this.OooO0o0 = context;
        this.OooO0o = xf1Var;
        this.OooO0oO = hx2Var;
        this.OooO0oo = workDatabase;
        this.OooOO0O = list;
    }

    public static boolean OooO0OO(String str, d12 d12Var) {
        boolean zIsDone;
        if (d12Var == null) {
            ep0.OooO0oO().OooO0Oo(OooOOOO, rj.OooO0OO("WorkerWrapper could not be found for ", str), new Throwable[0]);
            return false;
        }
        d12Var.OooOo0O = true;
        d12Var.OooO0oo();
        nn0 nn0Var = d12Var.OooOo0;
        if (nn0Var != null) {
            zIsDone = nn0Var.isDone();
            d12Var.OooOo0.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = d12Var.OooO;
        if (listenableWorker == null || zIsDone) {
            ep0.OooO0oO().OooO0Oo(d12.OooOo0o, "WorkSpec " + d12Var.OooO0oo + " is already done. Not interrupting.", new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        ep0.OooO0oO().OooO0Oo(OooOOOO, rj.OooO0OO("WorkerWrapper interrupted for ", str), new Throwable[0]);
        return true;
    }

    public final boolean OooO(String str) {
        boolean zOooO0OO;
        synchronized (this.OooOOO) {
            ep0.OooO0oO().OooO0Oo(OooOOOO, "Processor stopping foreground work " + str, new Throwable[0]);
            zOooO0OO = OooO0OO(str, (d12) this.OooO.remove(str));
        }
        return zOooO0OO;
    }

    public final void OooO00o(hx hxVar) {
        synchronized (this.OooOOO) {
            this.OooOOO0.add(hxVar);
        }
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        synchronized (this.OooOOO) {
            try {
                this.OooOO0.remove(str);
                int i = 0;
                ep0.OooO0oO().OooO0Oo(OooOOOO, g51.class.getSimpleName() + " " + str + " executed; reschedule = " + z, new Throwable[0]);
                ArrayList arrayList = this.OooOOO0;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((hx) obj).OooO0O0(str, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean OooO0Oo(String str) {
        boolean z;
        synchronized (this.OooOOO) {
            try {
                z = this.OooOO0.containsKey(str) || this.OooO.containsKey(str);
            } finally {
            }
        }
        return z;
    }

    public final void OooO0o(String str, e10 e10Var) {
        synchronized (this.OooOOO) {
            try {
                ep0.OooO0oO().OooO0oo(OooOOOO, "Moving WorkSpec (" + str + ") to the foreground", new Throwable[0]);
                d12 d12Var = (d12) this.OooOO0.remove(str);
                if (d12Var != null) {
                    if (this.OooO0Oo == null) {
                        PowerManager.WakeLock wakeLockOooO00o = xx1.OooO00o(this.OooO0o0, "ProcessorForegroundLck");
                        this.OooO0Oo = wakeLockOooO00o;
                        wakeLockOooO00o.acquire();
                    }
                    this.OooO.put(str, d12Var);
                    Intent intentOooO0OO = fl1.OooO0OO(this.OooO0o0, str, e10Var);
                    Context context = this.OooO0o0;
                    if (Build.VERSION.SDK_INT >= 26) {
                        cj.OooOoO(context, intentOooO0OO);
                    } else {
                        context.startService(intentOooO0OO);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0o0(hx hxVar) {
        synchronized (this.OooOOO) {
            this.OooOOO0.remove(hxVar);
        }
    }

    public final boolean OooO0oO(String str, a02 a02Var) {
        synchronized (this.OooOOO) {
            try {
                if (OooO0Oo(str)) {
                    ep0.OooO0oO().OooO0Oo(OooOOOO, "Work " + str + " is already enqueued for processing", new Throwable[0]);
                    return false;
                }
                Context context = this.OooO0o0;
                xf1 xf1Var = this.OooO0o;
                hx2 hx2Var = this.OooO0oO;
                WorkDatabase workDatabase = this.OooO0oo;
                a02 a02Var2 = new a02(24);
                Context applicationContext = context.getApplicationContext();
                List list = this.OooOO0O;
                if (a02Var == null) {
                    a02Var = a02Var2;
                }
                d12 d12Var = new d12();
                d12Var.OooOO0O = new on0();
                uf1 uf1Var = new uf1();
                d12Var.OooOo00 = uf1Var;
                d12Var.OooOo0 = null;
                d12Var.OooO0Oo = applicationContext;
                d12Var.OooOO0 = hx2Var;
                d12Var.OooOOO0 = this;
                d12Var.OooO0o0 = str;
                d12Var.OooO0o = list;
                d12Var.OooO0oO = a02Var;
                d12Var.OooO = null;
                d12Var.OooOO0o = xf1Var;
                d12Var.OooOOO = workDatabase;
                d12Var.OooOOOO = workDatabase.OooOo0o();
                d12Var.OooOOOo = workDatabase.OooOOo();
                d12Var.OooOOo0 = workDatabase.OooOo();
                l1 l1Var = new l1(6);
                l1Var.OooO0o0 = this;
                l1Var.OooO0o = str;
                l1Var.OooO0oO = uf1Var;
                uf1Var.addListener(l1Var, (yc1) this.OooO0oO.OooO0oO);
                this.OooOO0.put(str, d12Var);
                ((af1) this.OooO0oO.OooO0o0).execute(d12Var);
                ep0.OooO0oO().OooO0Oo(OooOOOO, rj.OooO0Oo(g51.class.getSimpleName(), ": processing ", str), new Throwable[0]);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void OooO0oo() {
        synchronized (this.OooOOO) {
            try {
                if (this.OooO.isEmpty()) {
                    Context context = this.OooO0o0;
                    String str = fl1.OooOOO0;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.OooO0o0.startService(intent);
                    } catch (Throwable th) {
                        ep0.OooO0oO().OooO0o(OooOOOO, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.OooO0Oo;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.OooO0Oo = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean OooOO0(String str) {
        boolean zOooO0OO;
        synchronized (this.OooOOO) {
            ep0.OooO0oO().OooO0Oo(OooOOOO, "Processor stopping background work " + str, new Throwable[0]);
            zOooO0OO = OooO0OO(str, (d12) this.OooOO0.remove(str));
        }
        return zOooO0OO;
    }
}

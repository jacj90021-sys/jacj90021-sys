package com.cmaster.cloner;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o02 implements Runnable {
    public final /* synthetic */ Object OooO;
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;
    public final /* synthetic */ Object OooO0oO;
    public final /* synthetic */ Object OooO0oo;

    public o02(p02 p02Var, uf1 uf1Var, UUID uuid, e10 e10Var, Context context) {
        this.OooO0Oo = 0;
        this.OooO = p02Var;
        this.OooO0o0 = uf1Var;
        this.OooO0o = uuid;
        this.OooO0oO = e10Var;
        this.OooO0oo = context;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        String str;
        final int i = 1;
        switch (this.OooO0Oo) {
            case 0:
                try {
                    if (!(((uf1) this.OooO0o0).OooO0Oo instanceof OooOo00)) {
                        String string = ((UUID) this.OooO0o).toString();
                        int iOooO0o0 = ((p02) this.OooO).OooO0OO.OooO0o0(string);
                        if (iOooO0o0 == 0 || px0.OooO0Oo(iOooO0o0)) {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                        ((p02) this.OooO).OooO0O0.OooO0o(string, (e10) this.OooO0oO);
                        ((Context) this.OooO0oo).startService(fl1.OooO00o((Context) this.OooO0oo, string, (e10) this.OooO0oO));
                    }
                    ((uf1) this.OooO0o0).OooO0oo(null);
                    return;
                } catch (Throwable th) {
                    ((uf1) this.OooO0o0).OooO(th);
                    return;
                }
            case 1:
                ex2 ex2Var = (ex2) this.OooO0o0;
                na1 na1Var = (na1) this.OooO0o;
                jb jbVar = (jb) this.OooO0oO;
                Callable callable = (Callable) this.OooO0oo;
                yl1 yl1Var = (yl1) this.OooO;
                try {
                    if (((ac3) na1Var.OooO0o0).OooO0o0()) {
                        jbVar.OooO00o();
                        return;
                    }
                    try {
                        if (!ex2Var.OooO0OO.get()) {
                            synchronized (ex2Var) {
                                ex2Var.OooO = ex2Var.OooO0o0.zzc();
                            }
                            ex2Var.OooO0OO.set(true);
                        }
                        if (((ac3) na1Var.OooO0o0).OooO0o0()) {
                            jbVar.OooO00o();
                            return;
                        }
                        Object objCall = callable.call();
                        if (((ac3) na1Var.OooO0o0).OooO0o0()) {
                            jbVar.OooO00o();
                            return;
                        } else {
                            yl1Var.OooO0O0(objCall);
                            return;
                        }
                    } catch (RuntimeException e) {
                        throw new bu0("Internal error has occurred when executing ML Kit tasks", e);
                    }
                } catch (Exception e2) {
                    if (((ac3) na1Var.OooO0o0).OooO0o0()) {
                        jbVar.OooO00o();
                        return;
                    } else {
                        yl1Var.OooO00o(e2);
                        return;
                    }
                }
            default:
                k42 k42Var = (k42) this.OooO0o0;
                Activity activity = (Activity) this.OooO0o;
                oOO0OO ooo0oo = (oOO0OO) this.OooO0oO;
                a02 a02Var = (a02) this.OooO0oo;
                final o0O000O o0o000o = (o0O000O) this.OooO;
                try {
                    Log.i("UserMessagingPlatform", "Use new ConsentDebugSettings.Builder().addTestDeviceHashedId(\"" + rc2.OooO00o((Application) k42Var.OooO0Oo) + "\") to set this as a debug device.");
                    aa aaVarOooO00o = new hw((hx2) k42Var.OooOO0, k42Var.OooO0O0(((vr1) k42Var.OooO).OooOO0(activity, ooo0oo))).OooO00o();
                    s52 s52Var = (s52) k42Var.OooO0oO;
                    s52Var.OooO0O0.edit().putInt("consent_status", aaVarOooO00o.OooO0Oo).commit();
                    int i2 = aaVarOooO00o.OooO0o0;
                    SharedPreferences.Editor editorEdit = s52Var.OooO0O0.edit();
                    if (i2 == 1) {
                        str = "UNKNOWN";
                    } else if (i2 == 2) {
                        str = "NOT_REQUIRED";
                    } else {
                        if (i2 != 3) {
                            throw null;
                        }
                        str = "REQUIRED";
                    }
                    editorEdit.putString("privacy_options_requirement_status", str).commit();
                    ((h92) k42Var.OooO0oo).OooO0OO.set((o92) aaVarOooO00o.OooO0o);
                    ((qh2) k42Var.OooOO0O).OooO00o.execute(new l1(k42Var, a02Var, aaVarOooO00o, 22, false));
                    return;
                } catch (hm2 e3) {
                    final int i3 = 0;
                    ((Handler) k42Var.OooO0o0).post(new Runnable() { // from class: com.cmaster.cloner.a63
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i3;
                            hm2 hm2Var = e3;
                            o0O000O o0o000o2 = o0o000o;
                            switch (i4) {
                                case 0:
                                    o0o000o2.OoooO0(hm2Var.OooO00o());
                                    break;
                                default:
                                    o0o000o2.OoooO0(hm2Var.OooO00o());
                                    break;
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e4) {
                    final hm2 hm2Var = new hm2(1, "Caught exception when trying to request consent info update: ".concat(String.valueOf(Log.getStackTraceString(e4))));
                    ((Handler) k42Var.OooO0o0).post(new Runnable() { // from class: com.cmaster.cloner.a63
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i4 = i;
                            hm2 hm2Var2 = hm2Var;
                            o0O000O o0o000o2 = o0o000o;
                            switch (i4) {
                                case 0:
                                    o0o000o2.OoooO0(hm2Var2.OooO00o());
                                    break;
                                default:
                                    o0o000o2.OoooO0(hm2Var2.OooO00o());
                                    break;
                            }
                        }
                    });
                    return;
                }
        }
    }

    public /* synthetic */ o02(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
        this.OooO0oo = obj4;
        this.OooO = obj5;
    }
}

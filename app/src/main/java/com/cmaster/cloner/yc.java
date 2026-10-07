package com.cmaster.cloner;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class yc implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;
    public final /* synthetic */ Object OooO0oO;

    public /* synthetic */ yc(fy fyVar, Activity activity, Intent intent) {
        this.OooO0Oo = 2;
        this.OooO0o0 = fyVar;
        this.OooO0oO = activity;
        this.OooO0o = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO0Oo) {
            case 0:
                cd cdVar = (cd) this.OooO0o0;
                try {
                    pw1.o00O0000().OooO(null, (Intent) this.OooO0o, null, (IBinder) this.OooO0oO, null, -1, null, cdVar.OooO0oO);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
            case 1:
                pr prVar = (pr) this.OooO0o0;
                sq2 sq2Var = (sq2) this.OooO0o;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.OooO0oO;
                try {
                    t00 t00VarOooO00o = cq2.OooO00o(prVar.OooO0o0);
                    if (t00VarOooO00o == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s00 s00Var = (s00) ((ru) t00VarOooO00o.OooO0O0);
                    synchronized (s00Var.OooO0oO) {
                        s00Var.OooO = threadPoolExecutor;
                    }
                    ((ru) t00VarOooO00o.OooO0O0).OooO0Oo(new uu(sq2Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    sq2Var.OooO00o(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                fy fyVar = (fy) this.OooO0o0;
                Activity activity = (Activity) this.OooO0oO;
                Intent intent = (Intent) this.OooO0o;
                try {
                    List<ResolveInfo> listQueryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
                    if (!fn2.OooO0Oo(listQueryIntentActivities)) {
                        ActivityInfo activityInfo = listQueryIntentActivities.get(0).activityInfo;
                        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    }
                    pw1.o00O0000().OooO(null, intent, null, null, null, -1, null, fyVar.OooO00o);
                    return;
                } catch (Throwable unused2) {
                    return;
                }
        }
    }

    public /* synthetic */ yc(Object obj, Object obj2, Object obj3, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
        this.OooO0oO = obj3;
    }
}

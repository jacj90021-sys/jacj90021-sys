package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import com.cmaster.cloner.el1;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.lm0;
import com.cmaster.cloner.xx1;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SystemAlarmService extends lm0 {
    public static final String OooO0oO = ep0.OooO("SystemAlarmService");
    public boolean OooO0o;
    public el1 OooO0o0;

    public final void OooO00o() {
        this.OooO0o = true;
        ep0.OooO0oO().OooO0Oo(OooO0oO, "All commands completed in dispatcher", new Throwable[0]);
        String str = xx1.OooO00o;
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = xx1.OooO0O0;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                ep0.OooO0oO().OooOOO(xx1.OooO00o, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // com.cmaster.cloner.lm0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        el1 el1Var = new el1(this);
        this.OooO0o0 = el1Var;
        if (el1Var.OooOOO0 != null) {
            ep0.OooO0oO().OooO0o(el1.OooOOO, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            el1Var.OooOOO0 = this;
        }
        this.OooO0o = false;
    }

    @Override // com.cmaster.cloner.lm0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.OooO0o = true;
        this.OooO0o0.OooO0Oo();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.OooO0o) {
            ep0.OooO0oO().OooO0oo(OooO0oO, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.OooO0o0.OooO0Oo();
            el1 el1Var = new el1(this);
            this.OooO0o0 = el1Var;
            if (el1Var.OooOOO0 != null) {
                ep0.OooO0oO().OooO0o(el1.OooOOO, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
            } else {
                el1Var.OooOOO0 = this;
            }
            this.OooO0o = false;
        }
        if (intent == null) {
            return 3;
        }
        this.OooO0o0.OooO00o(i2, intent);
        return 3;
    }
}

package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import com.cmaster.cloner.bb;
import com.cmaster.cloner.ep0;
import com.cmaster.cloner.fl1;
import com.cmaster.cloner.hx2;
import com.cmaster.cloner.l1;
import com.cmaster.cloner.lm0;
import com.cmaster.cloner.q02;
import java.util.UUID;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class SystemForegroundService extends lm0 {
    public static final String OooO = ep0.OooO("SystemFgService");
    public boolean OooO0o;
    public Handler OooO0o0;
    public fl1 OooO0oO;
    public NotificationManager OooO0oo;

    public final void OooO00o() {
        this.OooO0o0 = new Handler(Looper.getMainLooper());
        this.OooO0oo = (NotificationManager) getApplicationContext().getSystemService("notification");
        fl1 fl1Var = new fl1(getApplicationContext());
        this.OooO0oO = fl1Var;
        if (fl1Var.OooOO0o != null) {
            ep0.OooO0oO().OooO0o(fl1.OooOOO0, "A callback already exists.", new Throwable[0]);
        } else {
            fl1Var.OooOO0o = this;
        }
    }

    @Override // com.cmaster.cloner.lm0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        OooO00o();
    }

    @Override // com.cmaster.cloner.lm0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.OooO0oO.OooO0oO();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.OooO0o;
        String str = OooO;
        if (z) {
            ep0.OooO0oO().OooO0oo(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.OooO0oO.OooO0oO();
            OooO00o();
            this.OooO0o = false;
        }
        if (intent == null) {
            return 3;
        }
        fl1 fl1Var = this.OooO0oO;
        q02 q02Var = fl1Var.OooO0Oo;
        String str2 = fl1.OooOOO0;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            ep0.OooO0oO().OooO0oo(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = q02Var.OooO0OO;
            ((hx2) fl1Var.OooO0o0).OooOOOo(new l1(fl1Var, workDatabase, stringExtra, 11));
            fl1Var.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            fl1Var.OooO0o0(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            ep0.OooO0oO().OooO0oo(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            q02Var.getClass();
            q02Var.OooO0Oo.OooOOOo(new bb(q02Var, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        ep0.OooO0oO().OooO0oo(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = fl1Var.OooOO0o;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.OooO0o = true;
        ep0.OooO0oO().OooO0Oo(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}

package com.cmaster.cloner;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fl1 implements f02, hx {
    public static final String OooOOO0 = ep0.OooO("SystemFgDispatcher");
    public final HashMap OooO;
    public final q02 OooO0Oo;
    public final Object OooO0o = new Object();
    public final zl1 OooO0o0;
    public String OooO0oO;
    public final LinkedHashMap OooO0oo;
    public final HashSet OooOO0;
    public final g02 OooOO0O;
    public SystemForegroundService OooOO0o;

    public fl1(Context context) {
        q02 q02VarOooO0O0 = q02.OooO0O0(context);
        this.OooO0Oo = q02VarOooO0O0;
        hx2 hx2Var = q02VarOooO0O0.OooO0Oo;
        this.OooO0o0 = hx2Var;
        this.OooO0oO = null;
        this.OooO0oo = new LinkedHashMap();
        this.OooOO0 = new HashSet();
        this.OooO = new HashMap();
        this.OooOO0O = new g02(context, hx2Var, this);
        q02VarOooO0O0.OooO0o.OooO00o(this);
    }

    public static Intent OooO00o(Context context, String str, e10 e10Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", e10Var.OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", e10Var.OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", e10Var.OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent OooO0OO(Context context, String str, e10 e10Var) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", e10Var.OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", e10Var.OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", e10Var.OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // com.cmaster.cloner.hx
    public final void OooO0O0(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.OooO0o) {
            try {
                w02 w02Var = (w02) this.OooO.remove(str);
                if (w02Var != null ? this.OooOO0.remove(w02Var) : false) {
                    this.OooOO0O.OooO0O0(this.OooOO0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e10 e10Var = (e10) this.OooO0oo.remove(str);
        int i = 2;
        if (str.equals(this.OooO0oO) && this.OooO0oo.size() > 0) {
            Iterator it = this.OooO0oo.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.OooO0oO = (String) entry.getKey();
            if (this.OooOO0o != null) {
                e10 e10Var2 = (e10) entry.getValue();
                SystemForegroundService systemForegroundService = this.OooOO0o;
                systemForegroundService.OooO0o0.post(new dm(systemForegroundService, e10Var2.OooO00o, e10Var2.OooO0OO, e10Var2.OooO0O0));
                SystemForegroundService systemForegroundService2 = this.OooOO0o;
                systemForegroundService2.OooO0o0.post(new oa(e10Var2.OooO00o, i, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.OooOO0o;
        if (e10Var == null || systemForegroundService3 == null) {
            return;
        }
        ep0 ep0VarOooO0oO = ep0.OooO0oO();
        String str2 = OooOOO0;
        int i2 = e10Var.OooO00o;
        int i3 = e10Var.OooO0O0;
        StringBuilder sb = new StringBuilder("Removing Notification (id: ");
        sb.append(i2);
        sb.append(", workSpecId: ");
        sb.append(str);
        sb.append(" ,notificationType: ");
        ep0VarOooO0oO.OooO0Oo(str2, rj.OooO0o(sb, i3, ")"), new Throwable[0]);
        systemForegroundService3.OooO0o0.post(new oa(e10Var.OooO00o, i, systemForegroundService3));
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0Oo(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            ep0.OooO0oO().OooO0Oo(OooOOO0, rj.OooO0OO("Constraints unmet for WorkSpec ", str), new Throwable[0]);
            q02 q02Var = this.OooO0Oo;
            q02Var.OooO0Oo.OooOOOo(new dj1(q02Var, str, true));
        }
    }

    @Override // com.cmaster.cloner.f02
    public final void OooO0o(List list) {
    }

    public final void OooO0o0(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ep0 ep0VarOooO0oO = ep0.OooO0oO();
        StringBuilder sb = new StringBuilder("Notifying with (id: ");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType: ");
        ep0VarOooO0oO.OooO0Oo(OooOOO0, rj.OooO0o(sb, intExtra2, ")"), new Throwable[0]);
        if (notification == null || this.OooOO0o == null) {
            return;
        }
        e10 e10Var = new e10(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.OooO0oo;
        linkedHashMap.put(stringExtra, e10Var);
        if (TextUtils.isEmpty(this.OooO0oO)) {
            this.OooO0oO = stringExtra;
            SystemForegroundService systemForegroundService = this.OooOO0o;
            systemForegroundService.OooO0o0.post(new dm(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.OooOO0o;
        systemForegroundService2.OooO0o0.post(new n0(systemForegroundService2, intExtra, notification, 6));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((e10) ((Map.Entry) it.next()).getValue()).OooO0O0;
        }
        e10 e10Var2 = (e10) linkedHashMap.get(this.OooO0oO);
        if (e10Var2 != null) {
            SystemForegroundService systemForegroundService3 = this.OooOO0o;
            systemForegroundService3.OooO0o0.post(new dm(systemForegroundService3, e10Var2.OooO00o, e10Var2.OooO0OO, i));
        }
    }

    public final void OooO0oO() {
        this.OooOO0o = null;
        synchronized (this.OooO0o) {
            this.OooOO0O.OooO0OO();
        }
        this.OooO0Oo.OooO0o.OooO0o0(this);
    }
}

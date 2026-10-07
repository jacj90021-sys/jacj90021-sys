package com.cmaster.cloner;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mf1 extends e02 {
    public static final mf1 OooO0Oo = new mf1();
    public final ConcurrentHashMap OooO00o;
    public final ConcurrentHashMap OooO0O0;
    public final LinkedHashMap OooO0OO;

    public mf1() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.OooO00o = concurrentHashMap;
        this.OooO0O0 = new ConcurrentHashMap();
        this.OooO0OO = new LinkedHashMap();
        concurrentHashMap.put(jx1.OooO0OO(), new ik0());
    }

    @Override // com.cmaster.cloner.e02
    public final IBinder OooO00o(Service service, Intent intent) {
        e02 e02Var = (e02) this.OooO0OO.get(service);
        if (e02Var != null) {
            return e02Var.OooO00o(service, intent);
        }
        return null;
    }

    @Override // com.cmaster.cloner.e02
    public final void OooO0O0(Service service) {
        e02 e02Var = (e02) this.OooO00o.get(service.getClass().getName());
        if (e02Var != null) {
            this.OooO0OO.put(service, e02Var);
            e02Var.OooO0O0(service);
        }
    }

    @Override // com.cmaster.cloner.e02
    public final void OooO0OO(Service service) {
        e02 e02Var = (e02) this.OooO0OO.remove(service);
        if (e02Var != null) {
            e02Var.OooO0OO(service);
        }
    }

    @Override // com.cmaster.cloner.e02
    public final void OooO0Oo(Service service, Intent intent) {
        e02 e02Var = (e02) this.OooO0OO.get(service);
        if (e02Var != null) {
            e02Var.OooO0Oo(service, intent);
        }
    }

    @Override // com.cmaster.cloner.e02
    public final void OooO0o(Service service, Intent intent) {
        e02 e02Var = (e02) this.OooO0OO.get(service);
        if (e02Var != null) {
            e02Var.OooO0o(service, intent);
        }
    }

    @Override // com.cmaster.cloner.e02
    public final int OooO0o0(Service service, Intent intent, int i, int i2) {
        e02 e02Var = (e02) this.OooO0OO.get(service);
        if (e02Var != null) {
            return e02Var.OooO0o0(service, intent, i, i2);
        }
        return 2;
    }

    @Override // com.cmaster.cloner.e02
    public final boolean OooO0oO(Service service, Intent intent) {
        e02 e02Var = (e02) this.OooO0OO.get(service);
        if (e02Var != null) {
            return e02Var.OooO0oO(service, intent);
        }
        return false;
    }
}

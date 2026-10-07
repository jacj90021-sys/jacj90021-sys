package com.cmaster.cloner;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lm0 extends Service implements hm0 {
    public final a02 OooO0Oo = new a02(this);

    @Override // com.cmaster.cloner.hm0
    public final jm0 OooO0o() {
        return (jm0) this.OooO0Oo.OooO0o0;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        a02 a02Var = this.OooO0Oo;
        a02Var.getClass();
        a02Var.Oooo0o(wl0.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        a02 a02Var = this.OooO0Oo;
        a02Var.getClass();
        a02Var.Oooo0o(wl0.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a02 a02Var = this.OooO0Oo;
        a02Var.getClass();
        a02Var.Oooo0o(wl0.ON_STOP);
        a02Var.Oooo0o(wl0.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        a02 a02Var = this.OooO0Oo;
        a02Var.getClass();
        a02Var.Oooo0o(wl0.ON_START);
        super.onStart(intent, i);
    }
}

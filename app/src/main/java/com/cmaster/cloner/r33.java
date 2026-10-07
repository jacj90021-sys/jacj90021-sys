package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class r33 implements ServiceConnection {
    public ComponentName OooO;
    public boolean OooO0o;
    public IBinder OooO0oO;
    public final l23 OooO0oo;
    public final /* synthetic */ b73 OooOO0;
    public final HashMap OooO0Oo = new HashMap();
    public int OooO0o0 = 2;

    public r33(b73 b73Var, l23 l23Var) {
        this.OooOO0 = b73Var;
        this.OooO0oo = l23Var;
    }

    public final void OooO00o(String str, Executor executor) {
        this.OooO0o0 = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            b73 b73Var = this.OooOO0;
            xb1 xb1Var = b73Var.OooO0oO;
            Context context = b73Var.OooO0o0;
            boolean zOooo0o = xb1Var.Oooo0o(context, str, this.OooO0oo.OooO00o(context), this, 4225, executor);
            this.OooO0o = zOooo0o;
            if (zOooo0o) {
                this.OooOO0.OooO0o.sendMessageDelayed(this.OooOO0.OooO0o.obtainMessage(1, this.OooO0oo), this.OooOO0.OooO);
            } else {
                this.OooO0o0 = 2;
                try {
                    b73 b73Var2 = this.OooOO0;
                    b73Var2.OooO0oO.Oooo0OO(b73Var2.OooO0o0, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.OooOO0.OooO0Oo) {
            try {
                this.OooOO0.OooO0o.removeMessages(1, this.OooO0oo);
                this.OooO0oO = iBinder;
                this.OooO = componentName;
                Iterator it = this.OooO0Oo.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.OooO0o0 = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.OooOO0.OooO0Oo) {
            try {
                this.OooOO0.OooO0o.removeMessages(1, this.OooO0oo);
                this.OooO0oO = null;
                this.OooO = componentName;
                Iterator it = this.OooO0Oo.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.OooO0o0 = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

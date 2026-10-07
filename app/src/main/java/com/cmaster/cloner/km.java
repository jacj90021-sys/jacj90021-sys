package com.cmaster.cloner;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class km {
    public boolean OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;

    public km(int i, boolean z) {
        switch (i) {
            case 5:
                this.OooO0O0 = new Object();
                this.OooO0OO = new ArrayDeque();
                this.OooO0Oo = new AtomicReference();
                break;
            default:
                this.OooO0O0 = new Intent("android.intent.action.VIEW");
                this.OooO0OO = new iu(5);
                this.OooO00o = true;
                break;
        }
    }

    public void OooO00o() {
        as.OooO0OO((as) this.OooO0Oo, this, false);
    }

    public o0O000O OooO0O0() {
        Intent intent = (Intent) this.OooO0O0;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.OooO00o);
        ((iu) this.OooO0OO).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String strOooO00o = im.OooO00o();
        if (!TextUtils.isEmpty(strOooO00o)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", strOooO00o);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (((ActivityOptions) this.OooO0Oo) == null) {
                this.OooO0Oo = hm.OooO00o();
            }
            jm.OooO00o((ActivityOptions) this.OooO0Oo, false);
        }
        ActivityOptions activityOptions = (ActivityOptions) this.OooO0Oo;
        return new o0O000O(intent, activityOptions != null ? activityOptions.toBundle() : null, 11);
    }

    public File OooO0OO() {
        File file;
        synchronized (((as) this.OooO0Oo)) {
            try {
                zr zrVar = (zr) this.OooO0O0;
                if (zrVar.OooO0o != this) {
                    throw new IllegalStateException();
                }
                if (!zrVar.OooO0o0) {
                    ((boolean[]) this.OooO0OO)[0] = true;
                }
                file = zrVar.OooO0Oo[0];
                ((as) this.OooO0Oo).OooO0Oo.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public void OooO0Oo(Runnable runnable, Executor executor) {
        synchronized (this.OooO0O0) {
            try {
                if (this.OooO00o) {
                    ((ArrayDeque) this.OooO0OO).add(new sa3(runnable, executor));
                } else {
                    this.OooO00o = true;
                    OooO0o(runnable, executor);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void OooO0o(Runnable runnable, Executor executor) {
        try {
            executor.execute(new bf1(this, runnable, 29, false));
        } catch (RejectedExecutionException unused) {
            OooO0o0();
        }
    }

    public void OooO0o0() {
        synchronized (this.OooO0O0) {
            try {
                if (((ArrayDeque) this.OooO0OO).isEmpty()) {
                    this.OooO00o = false;
                    return;
                }
                sa3 sa3Var = (sa3) ((ArrayDeque) this.OooO0OO).remove();
                OooO0o(sa3Var.OooO0O0, sa3Var.OooO00o);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public km(Context context, String str, qb qbVar, boolean z) {
        context.getClass();
        qbVar.getClass();
        this.OooO0O0 = context;
        this.OooO0OO = str;
        this.OooO0Oo = qbVar;
        this.OooO00o = z;
    }

    public km(int i) {
        this.OooO0O0 = new ReentrantLock();
        this.OooO0OO = new long[i];
        this.OooO0Oo = new boolean[i];
    }

    public km(bj bjVar, mh1 mh1Var) {
        this.OooO0Oo = new yw0(this, 1);
        this.OooO0OO = bjVar;
        this.OooO0O0 = mh1Var;
    }

    public km(nm nmVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.OooO0O0 = intent;
        this.OooO0OO = new iu(5);
        this.OooO00o = true;
        if (nmVar != null) {
            intent.setPackage(nmVar.OooO0Oo.getPackageName());
            IBinder iBinderAsBinder = nmVar.OooO0OO.asBinder();
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
            intent.putExtras(bundle);
        }
    }

    public km(as asVar, zr zrVar) {
        this.OooO0Oo = asVar;
        this.OooO0O0 = zrVar;
        this.OooO0OO = zrVar.OooO0o0 ? null : new boolean[asVar.OooOO0];
    }
}

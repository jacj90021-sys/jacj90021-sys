package com.cmaster.cloner;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ej1 {
    public static final ReentrantLock OooO0OO = new ReentrantLock();
    public static ej1 OooO0Oo;
    public final ReentrantLock OooO00o = new ReentrantLock();
    public final SharedPreferences OooO0O0;

    public ej1(Context context) {
        this.OooO0O0 = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String OooO00o(String str) {
        ReentrantLock reentrantLock = this.OooO00o;
        reentrantLock.lock();
        try {
            return this.OooO0O0.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}

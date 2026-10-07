package com.cmaster.cloner;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xx1 {
    public static final String OooO00o = ep0.OooO("WakeLocks");
    public static final WeakHashMap OooO0O0 = new WeakHashMap();

    public static PowerManager.WakeLock OooO00o(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strConcat);
        WeakHashMap weakHashMap = OooO0O0;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strConcat);
        }
        return wakeLockNewWakeLock;
    }
}

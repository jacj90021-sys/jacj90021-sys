package com.cmaster.cloner;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gx {
    public static final d83 OooO0OO = new d83(6);
    public static final LinkedHashMap OooO0Oo = new LinkedHashMap();
    public final ReentrantLock OooO00o;
    public final o0O000O OooO0O0;

    public gx(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (OooO0OO) {
            try {
                LinkedHashMap linkedHashMap = OooO0Oo;
                Object reentrantLock2 = linkedHashMap.get(str);
                if (reentrantLock2 == null) {
                    reentrantLock2 = new ReentrantLock();
                    linkedHashMap.put(str, reentrantLock2);
                }
                reentrantLock = (ReentrantLock) reentrantLock2;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO00o = reentrantLock;
        this.OooO0O0 = z ? new o0O000O(str) : null;
    }
}

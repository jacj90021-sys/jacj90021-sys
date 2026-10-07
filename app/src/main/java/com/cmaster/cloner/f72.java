package com.cmaster.cloner;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class f72 {
    public static final ThreadPoolExecutor OooO00o = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new z22("ClientDefault"));
    public static final ExecutorService OooO0O0 = Executors.newSingleThreadExecutor(new z22("ClientSingle"));
}

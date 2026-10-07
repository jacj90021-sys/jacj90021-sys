package com.cmaster.cloner;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class mj0 {
    public final tb1 OooO00o;
    public final rp1 OooO0O0;
    public final LinkedHashMap OooO0OO;
    public final ReentrantLock OooO0Oo;
    public final b30 OooO0o;
    public final b30 OooO0o0;
    public final Object OooO0oO;

    public mj0(tb1 tb1Var, HashMap map, HashMap map2, String... strArr) {
        this.OooO00o = tb1Var;
        rp1 rp1Var = new rp1(tb1Var, map, map2, strArr, tb1Var.OooOO0, new kj0(1, this, mj0.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 0));
        this.OooO0O0 = rp1Var;
        this.OooO0OO = new LinkedHashMap();
        this.OooO0Oo = new ReentrantLock();
        this.OooO0o0 = new b30(this, 2);
        this.OooO0o = new b30(this, 3);
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.OooO0oO = new Object();
        rp1Var.OooOO0 = new wf(this, 3);
    }
}

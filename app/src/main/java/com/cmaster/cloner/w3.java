package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w3 {
    public static final v3 OooO0oo = new v3();
    public final oe OooO00o;
    public final a02 OooO0O0;
    public final Executor OooO0OO;
    public final CopyOnWriteArrayList OooO0Oo = new CopyOnWriteArrayList();
    public List OooO0o = Collections.EMPTY_LIST;
    public ArrayList OooO0o0;
    public int OooO0oO;

    public w3(oe oeVar, a02 a02Var) {
        this.OooO00o = oeVar;
        this.OooO0O0 = a02Var;
        Executor executor = (Executor) a02Var.OooO0o0;
        if (executor != null) {
            this.OooO0OO = executor;
        } else {
            this.OooO0OO = OooO0oo;
        }
    }
}

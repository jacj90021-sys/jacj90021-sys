package com.cmaster.cloner;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class va1 implements Closeable {
    public final ho1 OooO0Oo;
    public final String OooO0o;
    public final int OooO0o0;
    public final n70 OooO0oO;
    public final xa1 OooO0oo;

    static {
        DexUtils.classesInit0(6);
    }

    public va1(xb xbVar) {
        this.OooO0Oo = (ho1) xbVar.OooO0o;
        this.OooO0o0 = xbVar.OooO0o0;
        this.OooO0o = (String) xbVar.OooO0oO;
        xb1 xb1Var = (xb1) xbVar.OooO0oo;
        xb1Var.getClass();
        this.OooO0oO = new n70(xb1Var);
        this.OooO0oo = (xa1) xbVar.OooO;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();

    public final native String toString();
}

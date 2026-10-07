package com.cmaster.cloner;

import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class xa1 implements Closeable {
    public static final Charset OooO0oO;
    public final /* synthetic */ tr0 OooO0Oo;
    public final /* synthetic */ InputStream OooO0o;
    public final /* synthetic */ long OooO0o0;

    static {
        DexUtils.classesInit0(4);
        OooO0oO = Charset.forName(u7.OooO00o(new byte[]{21, -124, -30, 31, -83}, new byte[]{64, -48, -92, 50, -107, -28, 31, 114}));
    }

    public xa1(tr0 tr0Var, long j, InputStream inputStream) {
        this.OooO0Oo = tr0Var;
        this.OooO0o0 = j;
        this.OooO0o = inputStream;
    }

    public final native String OooO0OO();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final native void close();
}

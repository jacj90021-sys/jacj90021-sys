package com.cmaster.cloner;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class fa extends FilterInputStream {
    public final HttpURLConnection OooO0Oo;

    static {
        DexUtils.classesInit0(87);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public fa(HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.OooO0Oo = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final native void close();
}

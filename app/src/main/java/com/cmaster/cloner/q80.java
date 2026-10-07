package com.cmaster.cloner;

import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* loaded from: classes.dex */
public final class q80 implements HostnameVerifier {
    public static final q80 OooO00o;

    public static native List OooO00o(X509Certificate x509Certificate, int i);

    public static native boolean OooO0O0(String str, X509Certificate x509Certificate);

    @Override // javax.net.ssl.HostnameVerifier
    public final native boolean verify(String str, SSLSession sSLSession);

    static {
        DexUtils.classesInit0(47);
        OooO00o = new q80();
    }
}

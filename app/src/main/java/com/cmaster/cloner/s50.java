package com.cmaster.cloner;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class s50 implements zk0 {
    public final o70 OooO0O0;
    public final URL OooO0OO;
    public final String OooO0Oo;
    public URL OooO0o;
    public String OooO0o0;
    public volatile byte[] OooO0oO;
    public int OooO0oo;

    public s50(String str) {
        ll0 ll0Var = o70.OooO00o;
        this.OooO0OO = null;
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO("Must not be null or empty");
            throw null;
        }
        this.OooO0Oo = str;
        zx2.OooO0OO(ll0Var, "Argument must not be null");
        this.OooO0O0 = ll0Var;
    }

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        if (this.OooO0oO == null) {
            this.OooO0oO = OooO0OO().getBytes(zk0.OooO00o);
        }
        messageDigest.update(this.OooO0oO);
    }

    public final String OooO0OO() {
        String str = this.OooO0Oo;
        if (str != null) {
            return str;
        }
        URL url = this.OooO0OO;
        zx2.OooO0OO(url, "Argument must not be null");
        return url.toString();
    }

    public final URL OooO0Oo() {
        if (this.OooO0o == null) {
            if (TextUtils.isEmpty(this.OooO0o0)) {
                String string = this.OooO0Oo;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.OooO0OO;
                    zx2.OooO0OO(url, "Argument must not be null");
                    string = url.toString();
                }
                this.OooO0o0 = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.OooO0o = new URL(this.OooO0o0);
        }
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        if (obj instanceof s50) {
            s50 s50Var = (s50) obj;
            if (OooO0OO().equals(s50Var.OooO0OO()) && this.OooO0O0.equals(s50Var.OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        if (this.OooO0oo == 0) {
            int iHashCode = OooO0OO().hashCode();
            this.OooO0oo = iHashCode;
            this.OooO0oo = this.OooO0O0.hashCode() + (iHashCode * 31);
        }
        return this.OooO0oo;
    }

    public final String toString() {
        return OooO0OO();
    }

    public s50(URL url) {
        ll0 ll0Var = o70.OooO00o;
        zx2.OooO0OO(url, "Argument must not be null");
        this.OooO0OO = url;
        this.OooO0Oo = null;
        zx2.OooO0OO(ll0Var, "Argument must not be null");
        this.OooO0O0 = ll0Var;
    }
}

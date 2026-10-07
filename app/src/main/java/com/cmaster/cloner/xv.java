package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xv {
    public final dw OooO00o;
    public final byte[] OooO0O0;

    public xv(dw dwVar, byte[] bArr) {
        if (dwVar == null) {
            qa.OooOOO0("encoding is null");
            throw null;
        }
        if (bArr == null) {
            qa.OooOOO0("bytes is null");
            throw null;
        }
        this.OooO00o = dwVar;
        this.OooO0O0 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv)) {
            return false;
        }
        xv xvVar = (xv) obj;
        if (this.OooO00o.equals(xvVar.OooO00o)) {
            return Arrays.equals(this.OooO0O0, xvVar.OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.OooO0O0) ^ ((this.OooO00o.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.OooO00o + ", bytes=[...]}";
    }
}

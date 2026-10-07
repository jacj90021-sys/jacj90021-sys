package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class cc3 {
    public final String OooO00o;
    public final int OooO0O0;

    public cc3(String str, int i) {
        this.OooO00o = str;
        this.OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc3)) {
            return false;
        }
        cc3 cc3Var = (cc3) obj;
        return this.OooO00o.equals(cc3Var.OooO00o) && this.OooO0O0 == cc3Var.OooO0O0;
    }

    public final int hashCode() {
        return this.OooO0O0 ^ ((((this.OooO00o.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLKitLoggingOptions{libraryName=");
        sb.append(this.OooO00o);
        sb.append(", enableFirelog=true, firelogEventType=");
        return rj.OooO0o(sb, this.OooO0O0, "}");
    }
}

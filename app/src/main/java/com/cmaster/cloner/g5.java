package com.cmaster.cloner;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class g5 {
    public final String OooO00o;
    public final byte[] OooO0O0;
    public final s41 OooO0OO;

    public g5(String str, byte[] bArr, s41 s41Var) {
        this.OooO00o = str;
        this.OooO0O0 = bArr;
        this.OooO0OO = s41Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g5) {
            g5 g5Var = (g5) obj;
            if (this.OooO00o.equals(g5Var.OooO00o) && Arrays.equals(this.OooO0O0, g5Var.OooO0O0) && this.OooO0OO.equals(g5Var.OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0OO.hashCode() ^ ((((this.OooO00o.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.OooO0O0)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.OooO0O0;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.OooO00o);
        sb.append(", ");
        sb.append(this.OooO0OO);
        sb.append(", ");
        return rj.OooO0oO(sb, strEncodeToString, ")");
    }
}

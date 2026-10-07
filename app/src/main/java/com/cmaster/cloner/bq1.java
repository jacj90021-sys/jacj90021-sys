package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bq1 {
    public final xp1[] OooO00o;
    public final bj1 OooO0O0;

    public bq1(xp1[] xp1VarArr) {
        this.OooO00o = (xp1[]) xp1VarArr.clone();
        this.OooO0O0 = new bj1(xp1VarArr.length);
        for (int i = 0; i < xp1VarArr.length; i++) {
            this.OooO0O0.OooO0o(i, xp1VarArr[i].OooO0O0);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bq1) && Arrays.equals(((bq1) obj).OooO00o, this.OooO00o);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            xp1[] xp1VarArr = this.OooO00o;
            if (i >= xp1VarArr.length) {
                return sb.toString();
            }
            if (i > 0) {
                sb.append(u7.OooO00o(new byte[]{105, 27}, new byte[]{69, 59, -31, 88, -71, -77, -44, 62}));
            }
            sb.append(xp1VarArr[i]);
            i++;
        }
    }
}

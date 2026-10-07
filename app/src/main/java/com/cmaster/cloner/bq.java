package com.cmaster.cloner;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bq {
    public static final String OooO0O0 = qn2.OooO00o("rw==\n", "numLc1jEh7U=\n");
    public static final String OooO0OO = qn2.OooO00o("tg==\n", "hn1iUH5lvuU=\n");
    public static final String OooO0Oo = qn2.OooO00o("U2zGTji2zk54Qepq\n", "NgKnLFTTkQo=\n");
    public final Bundle OooO00o;

    static {
        qn2.OooO00o("xirZe95f\n", "o0S4GbI68+I=\n");
        new bq();
    }

    public bq(Bundle bundle) {
        bundle = bundle == null ? new Bundle() : bundle;
        this.OooO00o = bundle;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            if (str.startsWith(qn2.OooO00o("h1hC\n", "9TdsowO2ao4=\n"))) {
                linkedHashMap.put(str, bundle.getString(str));
            }
        }
    }

    public final boolean OooO00o() {
        return this.OooO00o.getString(OooO0Oo, OooO0OO).equals(OooO0O0);
    }

    public final String toString() {
        Bundle bundle = this.OooO00o;
        bundle.size();
        return bundle.toString();
    }

    public bq() {
        this.OooO00o = new Bundle();
        new LinkedHashMap();
    }
}

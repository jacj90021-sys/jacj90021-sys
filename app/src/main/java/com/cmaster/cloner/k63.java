package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class k63 {
    public static PackageInfo OooO00o(int i, int i2, String str) {
        try {
            return a02.OooO0oo.OooOoO(i, i2, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static ep0 OooO0O0(int i, int i2, String str, String str2, String str3) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString(qn2.OooO00o("TZto2p8yuRhtr1D3rlet\n", "KOMcqP4c6lA=\n"), str);
            bundle.putString(qn2.OooO00o("016YuhpIa+X5dK2PPjlo+vE=\n", "tibsyHtmOLE=\n"), str2);
            bundle.putInt(qn2.OooO00o("NLKORCWbvnwUmA==\n", "Ucr6NkS16y8=\n"), -1);
            return new ep0(a02.OooO0oo.Oooo000(str3, i, i2, bundle));
        } catch (Exception unused) {
            return new ep0(Bundle.EMPTY);
        }
    }
}

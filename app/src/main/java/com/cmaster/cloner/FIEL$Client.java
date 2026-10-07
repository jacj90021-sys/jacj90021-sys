package com.cmaster.cloner;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class FIEL$Client extends v6 {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        if (!TextUtils.equals(str, qn2.OooO00o("YDedmQ==\n", "Dlbw/O/r6lo=\n")) || bundle == null) {
            return Bundle.EMPTY;
        }
        int i = bundle.getInt(qn2.OooO00o("RTPb\n", "Jl6/mJb+/Ek=\n"), -1);
        bundle.setClassLoader(FIEL$Client.class.getClassLoader());
        return fx.OooO0O0.OooO00o(getContext(), i, bundle);
    }
}

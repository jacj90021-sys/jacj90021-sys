package com.cmaster.cloner;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hr1 implements iu0 {
    public static final Set OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));
    public final iu0 OooO00o;

    public hr1(iu0 iu0Var) {
        this.OooO00o = iu0Var;
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        return OooO0O0.contains(((Uri) obj).getScheme());
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        return this.OooO00o.OooO0O0(new s50(((Uri) obj).toString()), i, i2, xz0Var);
    }
}

package com.cmaster.cloner;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class y51 implements iu0 {
    public final Context OooO00o;
    public final iu0 OooO0O0;
    public final iu0 OooO0OO;
    public final Class OooO0Oo;

    public y51(Context context, iu0 iu0Var, iu0 iu0Var2, Class cls) {
        this.OooO00o = context.getApplicationContext();
        this.OooO0O0 = iu0Var;
        this.OooO0OO = iu0Var2;
        this.OooO0Oo = cls;
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && ew2.OooO00o((Uri) obj);
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        Uri uri = (Uri) obj;
        return new hu0(new by0(uri), new x51(this.OooO00o, this.OooO0O0, this.OooO0OO, uri, i, i2, xz0Var, this.OooO0Oo));
    }
}

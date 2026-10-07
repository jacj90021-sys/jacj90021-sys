package com.cmaster.cloner;

import android.os.Handler;
import android.webkit.WebView;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ha2 extends WebView {
    public static final /* synthetic */ int OooO0oO = 0;
    public final Handler OooO0Oo;
    public boolean OooO0o;
    public final k42 OooO0o0;

    public ha2(qa2 qa2Var, Handler handler, k42 k42Var) {
        super(qa2Var);
        this.OooO0o = false;
        this.OooO0Oo = handler;
        this.OooO0o0 = k42Var;
    }

    public final void OooO00o(String str, String str2) {
        this.OooO0Oo.post(new bf1(this, str + "(" + str2 + ");", 14, false));
    }
}

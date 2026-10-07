package com.cmaster.cloner;

import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class rz1 extends j63 {
    public final Window OooO00o;

    public rz1(Window window) {
        this.OooO00o = window;
    }

    @Override // com.cmaster.cloner.j63
    public final boolean OooO00o() {
        return (this.OooO00o.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // com.cmaster.cloner.j63
    public final void OooO0O0(boolean z) {
        Window window = this.OooO00o;
        if (!z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        } else {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
        }
    }
}

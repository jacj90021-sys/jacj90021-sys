package com.cmaster.cloner;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class tz1 extends j63 {
    public final WindowInsetsController OooO00o;
    public final Window OooO0O0;

    public tz1(Window window) {
        this.OooO00o = window.getInsetsController();
        this.OooO0O0 = window;
    }

    @Override // com.cmaster.cloner.j63
    public boolean OooO00o() {
        this.OooO00o.setSystemBarsAppearance(0, 0);
        return (this.OooO00o.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // com.cmaster.cloner.j63
    public final void OooO0O0(boolean z) {
        Window window = this.OooO0O0;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.OooO00o.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.OooO00o.setSystemBarsAppearance(0, 8);
    }
}

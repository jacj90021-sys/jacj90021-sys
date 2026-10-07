package com.cmaster.cloner;

import android.widget.ImageButton;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nv1 extends ImageButton {
    public int OooO0Oo;

    public final void OooO00o(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.OooO0Oo = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.OooO0Oo;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        OooO00o(i, true);
    }
}

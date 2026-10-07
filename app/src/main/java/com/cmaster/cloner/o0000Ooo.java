package com.cmaster.cloner;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0000Ooo extends ClickableSpan {
    public final int OooO0Oo;
    public final int OooO0o;
    public final o000O00O OooO0o0;

    public o0000Ooo(int i, o000O00O o000o00o, int i2) {
        this.OooO0Oo = i;
        this.OooO0o0 = o000o00o;
        this.OooO0o = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.OooO0Oo);
        this.OooO0o0.OooO00o.performAction(this.OooO0o, bundle);
    }
}

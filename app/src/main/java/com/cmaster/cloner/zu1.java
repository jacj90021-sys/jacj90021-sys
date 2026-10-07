package com.cmaster.cloner;

import android.content.DialogInterface;
import android.widget.NumberPicker;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zu1 implements DialogInterface.OnClickListener {
    public final /* synthetic */ g80 OooO0Oo;
    public final /* synthetic */ wu1 OooO0o;
    public final /* synthetic */ NumberPicker OooO0o0;

    public zu1(g80 g80Var, NumberPicker numberPicker, wu1 wu1Var) {
        this.OooO0Oo = g80Var;
        this.OooO0o0 = numberPicker;
        this.OooO0o = wu1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.OooO0Oo.OoooOOO().OooOo0(new u91(this, 10));
    }
}

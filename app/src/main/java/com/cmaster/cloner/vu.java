package com.cmaster.cloner;

import android.text.Editable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class vu extends Editable.Factory {
    public static final Object OooO00o = new Object();
    public static volatile vu OooO0O0;
    public static Class OooO0OO;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = OooO0OO;
        return cls != null ? new bi1(cls, charSequence) : super.newEditable(charSequence);
    }
}

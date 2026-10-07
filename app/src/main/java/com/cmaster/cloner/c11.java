package com.cmaster.cloner;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class c11 extends IntentFilter {
    public final boolean OooO0Oo;
    public final CharSequence OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;

    public c11(Object obj) {
        super((IntentFilter) obj);
        l81 l81Var = p11.OooO00o;
        this.OooO0Oo = l81Var != null && l81Var.OooO0OO(obj);
        l81 l81Var2 = p11.OooO0O0;
        this.OooO0o0 = l81Var2 != null ? l81Var2.OooO00o(obj) : 0;
        l81 l81Var3 = p11.OooO0OO;
        this.OooO0o = l81Var3 != null ? (CharSequence) l81Var3.OooO0O0(obj) : null;
        l81 l81Var4 = p11.OooO0Oo;
        this.OooO0oO = l81Var4 != null ? l81Var4.OooO00o(obj) : 0;
        l81 l81Var5 = p11.OooO0o0;
        if (l81Var5 != null) {
            l81Var5.OooO00o(obj);
        }
        l81 l81Var6 = p11.OooO0o;
        if (l81Var6 != null) {
            l81Var6.OooO00o(obj);
        }
        l81 l81Var7 = p11.OooO0oO;
        if (l81Var7 != null) {
            l81Var7.OooO00o(obj);
        }
    }
}

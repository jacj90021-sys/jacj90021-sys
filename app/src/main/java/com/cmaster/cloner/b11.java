package com.cmaster.cloner;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b11 {
    public d11 OooO00o;
    public ArrayList OooO0O0 = new ArrayList(0);
    public String OooO0OO;
    public Bundle OooO0Oo;
    public ComponentName OooO0o0;

    static {
        DexUtils.classesInit0(74);
    }

    public b11(d11 d11Var, Object obj) {
        this.OooO00o = d11Var;
        l81 l81Var = n11.OooO00o;
        this.OooO0OO = l81Var != null ? (String) l81Var.OooO0O0(obj) : null;
        l81 l81Var2 = n11.OooO0OO;
        this.OooO0Oo = l81Var2 != null ? (Bundle) l81Var2.OooO0O0(obj) : null;
    }

    public final native ComponentName OooO00o();
}

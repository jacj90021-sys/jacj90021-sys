package com.cmaster.cloner;

import android.content.pm.ApplicationInfo;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d11 {
    public final String OooO00o;
    public final int OooO0O0;
    public ApplicationInfo OooO0OO;
    public c21 OooO0Oo;
    public final k11 OooO0o0;
    public final ArrayList OooO0o = new ArrayList(0);
    public final ArrayList OooO0oO = new ArrayList(0);
    public final ArrayList OooO0oo = new ArrayList(0);
    public final ArrayList OooO = new ArrayList(0);
    public final ArrayList OooOO0 = new ArrayList(0);
    public final ArrayList OooOO0O = new ArrayList(0);

    public d11(k11 k11Var, String str) {
        Integer num;
        this.OooO0o0 = k11Var;
        this.OooO00o = str;
        ho0 ho0Var = k11Var.OooO0OO;
        ho0Var.getClass();
        try {
            Object obj = ho0Var.OooO0Oo;
            l81 l81Var = r11.OooOo0O;
            num = l81Var != null ? (Integer) l81Var.OooO00o.get(obj) : null;
        } catch (Exception unused) {
            num = 0;
        }
        this.OooO0O0 = num.intValue();
    }
}

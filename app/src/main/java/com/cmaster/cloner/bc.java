package com.cmaster.cloner;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bc implements gp1 {
    public final ay1 OooO00o;
    public final ConnectivityManager OooO0O0;
    public final Context OooO0OO;
    public final URL OooO0Oo;
    public final ie OooO0o;
    public final ie OooO0o0;
    public final int OooO0oO;

    public bc(Context context, ie ieVar, ie ieVar2) {
        uk0 uk0Var = new uk0();
        h4 h4Var = h4.OooO00o;
        uk0Var.OooO0oO(l7.class, h4Var);
        uk0Var.OooO0oO(s4.class, h4Var);
        k4 k4Var = k4.OooO00o;
        uk0Var.OooO0oO(bp0.class, k4Var);
        uk0Var.OooO0oO(a5.class, k4Var);
        i4 i4Var = i4.OooO00o;
        uk0Var.OooO0oO(be.class, i4Var);
        uk0Var.OooO0oO(t4.class, i4Var);
        g4 g4Var = g4.OooO00o;
        uk0Var.OooO0oO(oO0O000o.class, g4Var);
        uk0Var.OooO0oO(q4.class, g4Var);
        j4 j4Var = j4.OooO00o;
        uk0Var.OooO0oO(ap0.class, j4Var);
        uk0Var.OooO0oO(z4.class, j4Var);
        l4 l4Var = l4.OooO00o;
        uk0Var.OooO0oO(tw0.class, l4Var);
        uk0Var.OooO0oO(c5.class, l4Var);
        uk0Var.OooO0oO = true;
        this.OooO00o = new ay1(uk0Var, 27);
        this.OooO0OO = context;
        this.OooO0O0 = (ConnectivityManager) context.getSystemService("connectivity");
        this.OooO0Oo = OooO0O0(ca.OooO0OO);
        this.OooO0o0 = ieVar2;
        this.OooO0o = ieVar;
        this.OooO0oO = 40000;
    }

    public static URL OooO0O0(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(rj.OooO0OO("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.x4 OooO00o(com.cmaster.cloner.x4 r8) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.bc.OooO00o(com.cmaster.cloner.x4):com.cmaster.cloner.x4");
    }
}

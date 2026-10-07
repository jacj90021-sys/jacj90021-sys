package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class h02 {
    public static final String OooO0o = ep0.OooO("WorkContinuationImpl");
    public final q02 OooO00o;
    public final List OooO0O0;
    public final ArrayList OooO0OO;
    public final ArrayList OooO0Oo = new ArrayList();
    public boolean OooO0o0;

    public h02(q02 q02Var, List list) {
        this.OooO00o = q02Var;
        this.OooO0O0 = list;
        this.OooO0OO = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((mz0) list.get(i)).OooO00o.toString();
            this.OooO0OO.add(string);
            this.OooO0Oo.add(string);
        }
    }

    public static HashSet OooO00o(h02 h02Var) {
        HashSet hashSet = new HashSet();
        h02Var.getClass();
        return hashSet;
    }
}

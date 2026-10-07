package com.cmaster.cloner;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fp1 {
    public final View OooO0O0;
    public final HashMap OooO00o = new HashMap();
    public final ArrayList OooO0OO = new ArrayList();

    public fp1(View view) {
        this.OooO0O0 = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fp1)) {
            return false;
        }
        fp1 fp1Var = (fp1) obj;
        return this.OooO0O0 == fp1Var.OooO0O0 && this.OooO00o.equals(fp1Var.OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode() + (this.OooO0O0.hashCode() * 31);
    }

    public final String toString() {
        String strConcat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.OooO0O0 + "\n").concat("    values:");
        HashMap map = this.OooO00o;
        for (String str : map.keySet()) {
            strConcat = strConcat + "    " + str + ": " + map.get(str) + "\n";
        }
        return strConcat;
    }
}

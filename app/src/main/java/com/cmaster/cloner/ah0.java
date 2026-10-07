package com.cmaster.cloner;

import android.view.View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ah0 {
    public int OooO00o;
    public int OooO0O0;
    public Object OooO0OO;
    public Object OooO0Oo;
    public Serializable OooO0o0;

    public void OooO00o(qz1 qz1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if ((((yy1) it.next()).OooO00o.OooO0OO() & 8) != 0) {
                ((View) this.OooO0Oo).setTranslationY(oO0oO000.OooO0OO(this.OooO0O0, 0, r3.OooO00o.OooO0O0()));
                return;
            }
        }
    }
}

package com.cmaster.cloner;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yx1 extends WeakReference {
    public final jq OooO00o;
    public final int OooO0O0;
    public Object OooO0OO;

    public yx1(rt1 rt1Var, int i, jq jqVar, ReferenceQueue referenceQueue) {
        super(rt1Var, referenceQueue);
        this.OooO0O0 = i;
        this.OooO00o = jqVar;
    }

    public final boolean OooO00o() {
        boolean z;
        Object obj = this.OooO0OO;
        if (obj != null) {
            jq jqVar = this.OooO00o;
            jqVar.getClass();
            q6 q6Var = (q6) obj;
            synchronized (q6Var) {
                try {
                    l51 l51Var = q6Var.OooO0Oo;
                    if (l51Var != null) {
                        synchronized (l51Var) {
                            try {
                                int i = l51Var.OooO0oO;
                                ArrayList arrayList = l51Var.OooO0Oo;
                                if (i == 0) {
                                    arrayList.remove(jqVar);
                                } else {
                                    int iLastIndexOf = arrayList.lastIndexOf(jqVar);
                                    if (iLastIndexOf >= 0) {
                                        l51Var.OooO0o(iLastIndexOf);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
            z = true;
        } else {
            z = false;
        }
        this.OooO0OO = null;
        return z;
    }
}

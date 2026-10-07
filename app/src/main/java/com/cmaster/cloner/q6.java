package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class q6 {
    public transient l51 OooO0Oo;

    public final void OooO0O0(jq jqVar) {
        synchronized (this) {
            try {
                if (this.OooO0Oo == null) {
                    this.OooO0Oo = new l51();
                }
            } finally {
            }
        }
        l51 l51Var = this.OooO0Oo;
        synchronized (l51Var) {
            try {
                int iLastIndexOf = l51Var.OooO0Oo.lastIndexOf(jqVar);
                if (iLastIndexOf < 0 || l51Var.OooO00o(iLastIndexOf)) {
                    l51Var.OooO0Oo.add(jqVar);
                }
            } finally {
            }
        }
    }

    public final void OooO0OO(int i) throws Throwable {
        synchronized (this) {
            try {
                l51 l51Var = this.OooO0Oo;
                if (l51Var == null) {
                    return;
                }
                l51Var.OooO0O0(i, this);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

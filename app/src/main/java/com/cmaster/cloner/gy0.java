package com.cmaster.cloner;

import java.io.Serializable;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gy0 extends r6 implements Serializable {
    public Object OooO0o0;

    public gy0(String str) {
        this.OooO0o0 = str;
    }

    public final void OooO0Oo(Object obj) {
        if (obj != this.OooO0o0) {
            this.OooO0o0 = obj;
            synchronized (this) {
                try {
                    l51 l51Var = this.OooO0Oo;
                    if (l51Var == null) {
                        return;
                    }
                    l51Var.OooO0O0(0, this);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}

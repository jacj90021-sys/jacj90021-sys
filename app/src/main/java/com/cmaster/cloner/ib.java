package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ib {
    public boolean OooO00o;
    public hb OooO0O0;
    public boolean OooO0OO;

    public final void OooO00o(hb hbVar) {
        synchronized (this) {
            while (this.OooO0OO) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.OooO0O0 == hbVar) {
                return;
            }
            this.OooO0O0 = hbVar;
            if (this.OooO00o) {
                hbVar.onCancel();
            }
        }
    }
}

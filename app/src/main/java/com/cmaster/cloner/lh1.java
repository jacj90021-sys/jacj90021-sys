package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lh1 {
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;

    public abstract Object OooO00o();

    public final Object OooO0O0() {
        Object obj;
        switch (this.OooO00o) {
            case 0:
                if (this.OooO0O0 == null) {
                    synchronized (this) {
                        try {
                            if (this.OooO0O0 == null) {
                                this.OooO0O0 = OooO00o();
                            }
                        } finally {
                        }
                    }
                }
                return this.OooO0O0;
            default:
                synchronized (this) {
                    try {
                        if (this.OooO0O0 == null) {
                            this.OooO0O0 = OooO00o();
                        }
                        obj = this.OooO0O0;
                    } finally {
                    }
                }
                return obj;
        }
    }
}

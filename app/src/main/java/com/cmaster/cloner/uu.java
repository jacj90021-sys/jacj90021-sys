package com.cmaster.cloner;

import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uu extends sq2 {
    public final /* synthetic */ sq2 OooO00o;
    public final /* synthetic */ ThreadPoolExecutor OooO0O0;

    public uu(sq2 sq2Var, ThreadPoolExecutor threadPoolExecutor) {
        this.OooO00o = sq2Var;
        this.OooO0O0 = threadPoolExecutor;
    }

    @Override // com.cmaster.cloner.sq2
    public final void OooO00o(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.OooO0O0;
        try {
            this.OooO00o.OooO00o(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.cmaster.cloner.sq2
    public final void OooO0O0(ho1 ho1Var) {
        ThreadPoolExecutor threadPoolExecutor = this.OooO0O0;
        try {
            this.OooO00o.OooO0O0(ho1Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}

package com.cmaster.cloner;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class js implements ks {
    public final ScheduledFuture OooO0Oo;

    public js(ScheduledFuture scheduledFuture) {
        this.OooO0Oo = scheduledFuture;
    }

    @Override // com.cmaster.cloner.ks
    public final void OooO0OO() {
        this.OooO0Oo.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.OooO0Oo + ']';
    }
}

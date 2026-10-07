package com.cmaster.cloner;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jj extends AtomicBoolean implements OutcomeReceiver {
    public final gb OooO0Oo;

    public jj(gb gbVar) {
        super(false);
        this.OooO0Oo = gbVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.OooO0Oo.OooO0Oo(ty2.OooO00o(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.OooO0Oo.OooO0Oo(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}

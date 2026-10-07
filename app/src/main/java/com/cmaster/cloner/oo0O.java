package com.cmaster.cloner;

import android.os.Process;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oo0O implements Runnable {
    public final /* synthetic */ int OooO0Oo;
    public final Runnable OooO0o0;

    public /* synthetic */ oo0O(int i, Runnable runnable) {
        this.OooO0Oo = i;
        this.OooO0o0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        int i = this.OooO0Oo;
        Runnable runnable = this.OooO0o0;
        switch (i) {
            case 0:
                Process.setThreadPriority(10);
                runnable.run();
                break;
            case 1:
                try {
                    runnable.run();
                    break;
                } catch (Exception e) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e);
                    return;
                }
            case 2:
                Deque deque = (Deque) cu0.OooO0o0.get();
                by2.OooO0oo(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                cu0.OooO0o0.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }
}

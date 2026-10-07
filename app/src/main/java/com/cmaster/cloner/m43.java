package com.cmaster.cloner;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class m43 {
    public static Object OooO00o(ac3 ac3Var) throws InterruptedException {
        String name;
        by2.OooO0oO("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && ((name = looperMyLooper.getThread().getName()) == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler")))) {
            qa.OooO0o("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        if (ac3Var.OooO0o0()) {
            return OooO0Oo(ac3Var);
        }
        vk1 vk1Var = new vk1(6);
        Executor executor = am1.OooO0O0;
        ac3Var.OooO0O0(executor, vk1Var);
        ac3Var.OooO00o(executor, vk1Var);
        ac3Var.OooO0O0.OooO0o0(new he2(executor, (yy0) vk1Var));
        ac3Var.OooOO0o();
        ((CountDownLatch) vk1Var.OooO0o0).await();
        return OooO0Oo(ac3Var);
    }

    public static ac3 OooO0O0(Exception exc) {
        ac3 ac3Var = new ac3();
        ac3Var.OooO0oO(exc);
        return ac3Var;
    }

    public static ac3 OooO0OO(Object obj) {
        ac3 ac3Var = new ac3();
        ac3Var.OooO0oo(obj);
        return ac3Var;
    }

    public static Object OooO0Oo(ac3 ac3Var) throws ExecutionException {
        if (ac3Var.OooO0o()) {
            return ac3Var.OooO0Oo();
        }
        if (ac3Var.OooO0Oo) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(ac3Var.OooO0OO());
    }
}

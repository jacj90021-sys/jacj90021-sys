package com.cmaster.cloner;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class c12 {
    public static final String OooO00o = ep0.OooO("WorkerFactory");

    public final ListenableWorker OooO00o(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorker;
        String str2 = OooO00o;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            ep0.OooO0oO().OooO0o(str2, rj.OooO0OO("Invalid class: ", str), th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                listenableWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                ep0.OooO0oO().OooO0o(str2, rj.OooO0OO("Could not instantiate ", str), th2);
            }
        } else {
            listenableWorker = null;
        }
        if (listenableWorker == null || !listenableWorker.isUsed()) {
            return listenableWorker;
        }
        sa.OooO0oo("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        return null;
    }
}

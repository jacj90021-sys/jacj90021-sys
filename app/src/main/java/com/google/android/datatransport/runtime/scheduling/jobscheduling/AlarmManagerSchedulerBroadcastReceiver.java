package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.cmaster.cloner.dr1;
import com.cmaster.cloner.g5;
import com.cmaster.cloner.ip1;
import com.cmaster.cloner.oOOoOOO0;
import com.cmaster.cloner.qa;
import com.cmaster.cloner.s41;
import com.cmaster.cloner.v41;
import com.cmaster.cloner.yn1;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int OooO00o = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        ip1.OooO0O0(context);
        if (queryParameter == null) {
            qa.OooOOO0("Null backendName");
            return;
        }
        s41 s41VarOooO0O0 = v41.OooO0O0(iIntValue);
        byte[] bArrDecode = queryParameter2 != null ? Base64.decode(queryParameter2, 0) : null;
        yn1 yn1Var = ip1.OooO00o().OooO0Oo;
        ((Executor) yn1Var.OooO0oo).execute(new dr1(yn1Var, new g5(queryParameter, bArrDecode, s41VarOooO0O0), i, oOOoOOO0.OooO0o0));
    }
}

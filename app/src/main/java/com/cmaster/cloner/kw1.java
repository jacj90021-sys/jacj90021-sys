package com.cmaster.cloner;

import android.content.Intent;
import android.os.ConditionVariable;
import android.os.IInterface;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class kw1 extends Thread {
    public final /* synthetic */ IInterface OooO0Oo;
    public final /* synthetic */ ConditionVariable OooO0o;
    public final /* synthetic */ Intent OooO0o0;

    public kw1(IInterface iInterface, Intent intent, ConditionVariable conditionVariable) {
        this.OooO0Oo = iInterface;
        this.OooO0o0 = intent;
        this.OooO0o = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable = this.OooO0o;
        try {
            IInterface iInterface = this.OooO0Oo;
            Intent intent = new Intent(this.OooO0o0);
            int iOooO00o = jr1.OooO00o();
            o00OO000 o00oo000 = mb0.OooO00o;
            if (o00oo000 != null) {
                Boolean bool = Boolean.FALSE;
                o00oo000.OooOooo(iInterface, intent, 0, null, null, bool, bool, Integer.valueOf(iOooO00o));
            }
        } catch (Exception unused) {
        } finally {
            conditionVariable.open();
        }
    }
}

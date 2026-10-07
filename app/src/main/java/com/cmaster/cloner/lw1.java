package com.cmaster.cloner;

import android.content.Intent;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class lw1 {
    public static final oO00OOOo OooO0O0;
    public we0 OooO00o;

    static {
        u7.OooO00o(new byte[]{112, 0, 85, -106, -63, -84, -86, 61, 95, 26, 85, -105, -31, -76, -116, 63, 107, 29, 68}, new byte[]{30, 111, 33, -1, -89, -43, -27, 83});
        u7.OooO00o(new byte[]{-35, -33, -110, -110, 22, 124, -57, -64, -44, -48, -107, -113, 52, 104, -57, -51, -43, -22, -120, -117, 50}, new byte[]{-79, -66, -31, -26, 87, 9, -77, -88});
        u7.OooO00o(new byte[]{115, 84, -39, -79, 54, 94, 85, 39, 115, 89, -34, -84, 44, 89, 69, 122, 60, 95, -59, -77, 48, 69, 72}, new byte[]{18, 58, -67, -61, 89, 55, 49, 9});
        OooO0O0 = new oO00OOOo(10);
    }

    public static void OooO() {
        u7.OooO00o(new byte[]{-96, 118, -15}, new byte[]{-13, 47, -94, -32, -122, -58, -83, -65});
        Thread.currentThread();
    }

    public static void OooO00o(Exception exc) {
        String str = d51.OooO00o;
        if (exc.getMessage() == null ? false : exc.getMessage().startsWith(d51.OooO00o)) {
            cx1.OooO0Oo.execute(new oOOoOOO0(7));
            return;
        }
        u7.OooO00o(new byte[]{49, 89, 126}, new byte[]{98, 0, 45, -1, -37, -106, -76, 71});
        Thread.currentThread();
        if (exc instanceof RemoteException) {
            return;
        }
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        sa.OooOO0(exc);
    }

    public static lw1 OooO0O0() {
        return (lw1) OooO0O0.OooO0O0();
    }

    public final zi0 OooO0OO(IBinder iBinder) {
        try {
            return this.OooO00o.o00Ooo(qx1.OooO0oO(), iBinder, qx1.OooO00o());
        } catch (RemoteException e) {
            OooO00o(e);
            return null;
        }
    }

    public final m2 OooO0Oo(int i) {
        try {
            return this.OooO00o.o000O0oo(i, qx1.OooO0oO(), qx1.OooO00o());
        } catch (RemoteException e) {
            OooO00o(e);
            return null;
        }
    }

    public final void OooO0o(int i, String str, String str2) {
        try {
            this.OooO00o.o000Oo0o(-1, i, str, str2);
        } catch (Exception e) {
            OooO00o(e);
        }
    }

    public final boolean OooO0o0(IInterface iInterface, Intent intent, String str, IBinder iBinder, String str2, int i, int i2, int i3, Bundle bundle, IInterface iInterface2) {
        Intent intent2;
        zi0 zi0VarOooO0OO = OooO0OO(iInterface.asBinder());
        if (zi0VarOooO0OO == null || zi0VarOooO0OO.OooO0oo != 2 || (intent2 = zi0VarOooO0OO.OooO0o) == null) {
            return false;
        }
        if (intent != null) {
            intent2.fillIn(intent, zi0VarOooO0OO.OooO0oO);
        }
        intent2.setFlags((i3 & i2) | (intent2.getFlags() & (~i2)));
        OooO0O0().OooOO0(intent2, str, iBinder, str2, i, bundle);
        if (iInterface2 == null) {
            return true;
        }
        ConditionVariable conditionVariable = new ConditionVariable(false);
        new kw1(iInterface2, intent2, conditionVariable).start();
        conditionVariable.block(10000L);
        return true;
    }

    public final boolean OooO0oO(IBinder iBinder, IBinder iBinder2, int i) {
        boolean zO00000oo;
        try {
            zO00000oo = this.OooO00o.o00000oo(iBinder, iBinder2, i);
        } catch (Exception e) {
            OooO00o(e);
            zO00000oo = false;
        }
        if (!zO00000oo) {
            o0O00O0o.OooO00o(iBinder2, -1, null);
            cx1.OooO0O0.execute(new oOOoOOO0(7));
        }
        return zO00000oo;
    }

    public final void OooO0oo(int i, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.OooO00o.o000ooO0(qx1.OooO0oO(), i, str, str2);
        } catch (RemoteException e) {
            OooO00o(e);
        }
    }

    public final int OooOO0(Intent intent, String str, IBinder iBinder, String str2, int i, Bundle bundle) {
        try {
            return this.OooO00o.OooO(qx1.OooO00o(), intent, str, iBinder, str2, i, bundle, qx1.OooO0oO());
        } catch (RemoteException e) {
            OooO00o(e);
            return -92;
        }
    }
}

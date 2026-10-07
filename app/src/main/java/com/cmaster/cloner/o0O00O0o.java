package com.cmaster.cloner;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o0O00O0o {
    public static final IInterface OooO00o;

    static {
        a02 a02Var = o0O00O.OooO0O0;
        OooO00o = a02Var != null ? (IInterface) a02Var.OooO0o0(new Object[0]) : null;
    }

    public static void OooO00o(IBinder iBinder, int i, Intent intent) {
        o00OO000 o00oo000 = e90.OooO0OO;
        if (o00oo000 != null) {
            Object objOooO00o = b8.OooO00o();
            try {
                o00oo000.OooOooo(OooO00o, iBinder, Integer.valueOf(i), intent, 0);
            } catch (Exception unused) {
                u7.OooO00o(new byte[]{-114, 53, 109, 13, 113, 94, -19, -57, -120, 61, 112, 1, 92, 88, -33, -57, -112, 61, 119, 16, 39, 27}, new byte[]{-26, 84, 3, 105, 29, 59, -85, -82});
                Objects.toString(objOooO00o);
                int i2 = fp0.OooO00o;
            } finally {
                b8.OooO0O0(objOooO00o);
            }
        }
    }

    public static int OooO0O0(IBinder iBinder) {
        o00OO000 o00oo000 = e90.OooO0O0;
        if (o00oo000 == null) {
            return -1;
        }
        return ((Integer) o00oo000.OooOooo(OooO00o, iBinder, Boolean.FALSE)).intValue();
    }
}

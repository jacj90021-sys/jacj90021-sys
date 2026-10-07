package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rx2 {
    public static void OooO00o(Context context, Intent intent, int i) {
        ah0 ah0Var = new ah0();
        Intent selector = intent.getSelector();
        if (selector != null) {
            ah0Var.OooO0OO = (Intent) selector.getParcelableExtra(u7.OooO00o(new byte[]{30, 73, -56, -120, -72, 111, 112, 43, 17, 74, -60, -120, -85, 111, 105, 32, 11, 75, -61, -110}, new byte[]{127, 46, -83, -26, -52, 48, 0, 78}));
            ah0Var.OooO0Oo = selector.getStringExtra(u7.OooO00o(new byte[]{91, -127, -109, -47, -26, 83, 111, -45, 84, -126, -97, -47, -11, 83, 119, -39, 73, -110, -87, -49, -7, 107}, new byte[]{58, -26, -10, -65, -110, 12, 31, -74}));
            ah0Var.OooO0o0 = selector.getStringExtra(u7.OooO00o(new byte[]{-116, -102, 125, 111, 28, 100, -100, -59, -125, -103, 113, 111, 15, 100, -115, -48, -99}, new byte[]{-19, -3, 24, 1, 104, 59, -20, -96}));
            ah0Var.OooO00o = selector.getIntExtra(u7.OooO00o(new byte[]{75, 73, -57, 59, 58, -14, -41, -112, 68, 74, -53, 59, 41, -14, -46, -122, 79, 92, -53, 49}, new byte[]{42, 46, -94, 85, 78, -83, -89, -11}), -1);
            ah0Var.OooO0O0 = selector.getIntExtra(u7.OooO00o(new byte[]{27, 99, 12, 86, -86, 94, 13, 68, 20, 96, 0, 86, -71, 94, 27, 77, 27, 99, 26}, new byte[]{122, 4, 105, 56, -34, 1, 125, 33}), 0);
            intent.setExtrasClassLoader(aj0.class.getClassLoader());
            aj0 aj0Var = (aj0) intent.getParcelableExtra(u7.OooO00o(new byte[]{-8, 34, 50, 76, 63, 87, 110, 112, -9, 33, 62, 76, 44, 87, 123, 109, -19, 26, 51, 67, 63, 105}, new byte[]{-103, 69, 87, 34, 75, 8, 30, 21}));
            if (aj0Var != null) {
                Intent intent2 = aj0Var.OooO0o0;
                if (intent2 != null) {
                    ((Intent) ah0Var.OooO0OO).fillIn(intent2, ah0Var.OooO0O0);
                }
                int i2 = aj0Var.OooOO0 & (-196);
                int i3 = aj0Var.OooOO0O & i2;
                Intent intent3 = (Intent) ah0Var.OooO0OO;
                intent3.setFlags(((~i2) & intent3.getFlags()) | i3);
            } else {
                ((Intent) ah0Var.OooO0OO).fillIn(intent, ah0Var.OooO0O0);
            }
        }
        Intent intent4 = (Intent) ah0Var.OooO0OO;
        if (intent4 == null || ah0Var.OooO00o == -1) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                cx1.OooO0o.execute(new oO000o00(intent4, ah0Var));
                return;
            } else {
                if (i != 4) {
                    return;
                }
                pw1 pw1VarO00O0000 = pw1.o00O0000();
                Intent intent5 = (Intent) ah0Var.OooO0OO;
                pw1VarO00O0000.o0ooOoO(null, intent5, intent5.getType(), false, (String) ah0Var.OooO0o0, ah0Var.OooO00o);
                return;
            }
        }
        ComponentName component = intent4.getComponent();
        String str = intent4.getPackage();
        if (component != null) {
            pw1.o00O0000().o00000(ah0Var.OooO00o, intent4, (String) ah0Var.OooO0o0);
            return;
        }
        if (str != null) {
            Iterator it = ox1.o0O0ooO().OooOOoo(null, intent4, null, 0, qx1.OooO0oO()).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = ((ResolveInfo) it.next()).activityInfo;
                if (activityInfo != null) {
                    intent4.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    pw1.o00O0000().o00000(ah0Var.OooO00o, intent4, (String) ah0Var.OooO0o0);
                }
            }
        }
        intent4.setComponent(null);
        if (str == null) {
            str = (String) ah0Var.OooO0o0;
        }
        String strOooO00o = u61.OooO00o(ah0Var.OooO00o, intent4.getAction(), str);
        if (strOooO00o != null) {
            intent4.setAction(strOooO00o);
        }
        intent4.setPackage((String) ah0Var.OooO0Oo);
        context.sendBroadcast(intent4);
    }
}

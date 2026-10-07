package com.cmaster.cloner;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.bumptech.matrix.ui.qrcode.ActivityBarCodeHistory;
import java.util.ArrayList;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v5 {
    public static final u5 OooO0OO = new u5(0);
    public ArrayList OooO00o;
    public o00OOOO0 OooO0O0;

    public static void OooO0O0(Activity activity, String str) {
        ((ClipboardManager) activity.getSystemService(sn2.OooO00o("35OSH6i34wDY\n", "vP/7b8rYgnI=\n"))).setPrimaryClip(ClipData.newPlainText(sn2.OooO00o("eDD8qYHKLPtsMeqqkQ==\n", "CUKfxuWvc4k=\n"), str));
        Toast.makeText(activity, sn2.OooO00o("OiZ3FqE=\n", "eUkHb4FyXQ4=\n") + str + sn2.OooO00o("u4YBHR9cVTn9gBg=\n", "m/V0fnw5Jko=\n"), 0).show();
    }

    public static v5 OooO0OO() {
        return (v5) OooO0OO.OooO0O0();
    }

    public static void OooO0Oo(Activity activity, String str) {
        Intent intent;
        if (str == null || !(str.startsWith(sn2.OooO00o("XdKe8bEl8w==\n", "NabqgYsK3EE=\n")) || str.startsWith(sn2.OooO00o("5ZUrWnWfc5k=\n", "jeFfKgalXLY=\n")))) {
            intent = new Intent(sn2.OooO00o("t27dtSuAW+m/bs2iKp0RprV00Kgqx2mOk1c=\n", "1gC5x0TpP8c=\n"), Uri.parse(sn2.OooO00o("0/nzQMzoqkrM+vAe2L3qAtfoqVPQv6oW3uz1U9ft9Fg=\n", "u42HML/ShWU=\n") + Uri.encode(str)));
        } else {
            intent = new Intent(sn2.OooO00o("OjWJVq9LCHEyNZlBrlZCPjgvhEuuDDoWHgw=\n", "W1vtJMAibF8=\n"), Uri.parse(str));
        }
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public final synchronized void OooO00o(final s5 s5Var) {
        this.OooO00o.removeIf(new Predicate() { // from class: com.cmaster.cloner.t5
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((s5) obj).equals(s5Var);
            }
        });
        this.OooO00o.add(0, s5Var);
        o00OOOO0 o00oooo0 = this.OooO0O0;
        if (o00oooo0 != null) {
            ActivityBarCodeHistory activityBarCodeHistory = (ActivityBarCodeHistory) o00oooo0.OooO0Oo;
            oo00oO oo00oo = (oo00oO) o00oooo0.OooO0o0;
            int i = ActivityBarCodeHistory.Oooo00O;
            activityBarCodeHistory.Oooo000 = OooO0OO().OooO00o;
            activityBarCodeHistory.runOnUiThread(new o00OOOOo(oo00oo, 0));
        }
        synchronized (this) {
            p41.OooO00o(this.OooO00o);
        }
    }
}

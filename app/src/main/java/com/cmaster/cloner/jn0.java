package com.cmaster.cloner;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.TextView;
import com.cmaster.cloner.ui.HomeActivity;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jn0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public jn0(m62 m62Var, Context context) {
        this.OooO0Oo = 5;
        this.OooO0o0 = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o0;
        switch (i2) {
            case 0:
                kn0 kn0Var = (kn0) obj;
                kn0Var.o0ooOOo = i;
                kn0Var.o0ooOO0 = -1;
                dialogInterface.dismiss();
                break;
            case 1:
                HomeActivity homeActivity = ((u70) obj).OooO0o0;
                if (i != -1) {
                    homeActivity.finish();
                    break;
                } else {
                    PackageInfo packageInfoOooO00o = e2.OooO00o();
                    boolean zEquals = (packageInfoOooO00o != null && packageInfoOooO00o.versionCode == 20080) ? TextUtils.equals(sn2.OooO00o("QrLILC0V9zA=\n", "cJzwAh07xgA=\n"), packageInfoOooO00o.versionName) : false;
                    int i3 = 1;
                    u5 u5Var = x41.OooO0O0;
                    if (!zEquals) {
                        String strOooO00o = sn2.OooO00o("kiX0N7yKXyeFL+s3vItROpQ4\n", "8UqZGd/nPlQ=\n");
                        HashSet hashSet = hz.OooO00o;
                        Intent intent = new Intent(sn2.OooO00o("n+4lHzUsfy6X7jUINDE1YZ30KAI0a01Ju9c=\n", "/oBBbVpFGwA=\n"));
                        intent.addFlags(268435456);
                        intent.setData(Uri.parse(sn2.OooO00o("qwfrwpnVEzDpAvzdnchFbPkP/ZQ=\n", "xmaZqfyhKR8=\n").concat(strOooO00o)));
                        intent.setPackage(hz.OooO0O0);
                        if (intent.resolveActivity(homeActivity.getPackageManager()) != null) {
                            homeActivity.startActivity(intent);
                        } else {
                            intent.setPackage(null);
                            intent.setData(Uri.parse(sn2.OooO00o("WtTgTUQzaz5CzPVEGW4rflXM8RNUZik+QdT7T1ImJWFC07tZUn0leF7Tq1RTNA==\n", "MqCUPTcJRBE=\n").concat(strOooO00o)));
                            try {
                                homeActivity.startActivity(intent);
                            } catch (Exception unused) {
                            }
                        }
                        ((x41) u5Var.OooO0O0()).OooO00o.OooO0o0(homeActivity, new u70(homeActivity, i3));
                        break;
                    } else {
                        e2.OooO.OooO00o.getSharedPreferences(sn2.OooO00o("zIKr4YA2\n", "r+3Fh+lRX5w=\n"), 0).edit().putInt(sn2.OooO00o("OQODSC0=\n", "T2bxF13QAhs=\n"), 1).apply();
                        ((x41) u5Var.OooO0O0()).OooO00o.OooOO0o(1);
                        break;
                    }
                }
                break;
            case 2:
                CharSequence text = ((TextView) ((AlertDialog) dialogInterface).findViewById(android.R.id.text1)).getText();
                wu1 wu1Var = (wu1) obj;
                String string = text != null ? text.toString() : null;
                qj0 qj0Var = wu1Var.OooOOO0;
                qj0Var.OooO0Oo(sn2.OooO00o("48NBxqnVzhD1z1rZ5pXCEeM=\n", "hrs1tMj7rWU=\n"), string);
                qj0Var.OooO0OO();
                wu1Var.OooOO0O.OooO0Oo(string);
                break;
            case 3:
                ((AtomicInteger) obj).set(i);
                break;
            case 4:
                ((c62) obj).OooO0O0();
                break;
            default:
                a73 a73Var = ya3.OooOooO.OooO0OO;
                a73.OooOOo(Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"), (Context) obj);
                break;
        }
    }

    public /* synthetic */ jn0(Object obj, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
    }
}

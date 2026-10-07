package com.cmaster.cloner;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class vc implements DialogInterface.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ vc(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.OooO0Oo;
        Object obj = this.OooO0o;
        Object obj2 = this.OooO0o0;
        switch (i2) {
            case 0:
                xc xcVar = (xc) obj2;
                List list = (List) obj;
                HashSet hashSet = xcVar.OooOO0O;
                if (!fn2.OooO0Oo(hashSet)) {
                    Account account = (Account) hashSet.iterator().next();
                    int i3 = xcVar.OooO0oO;
                    IBinder iBinder = xcVar.OooO0o0;
                    if (iBinder != null && i3 >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putString(u7.OooO00o(new byte[]{-60, 109, 61, 8, 115, 23, -115, 30, -48, 118, 61}, new byte[]{-91, 24, 73, 96, 50, 116, -18, 113}), account.name);
                        bundle.putString(u7.OooO00o(new byte[]{-77, 62, 77, -50, -29, 82, 67, -10, -85, 45, 75}, new byte[]{-46, 93, 46, -95, -106, 60, 55, -94}), account.type);
                        String str = xcVar.OooO0o;
                        Intent intentPutExtras = new Intent().putExtras(bundle);
                        o00OO000 o00oo000 = o0OO0oO0.OooOO0O;
                        if (o00oo000 != null) {
                            o00oo000.OooOooo(o0OO0oO0.OooO00o(), iBinder, str, Integer.valueOf(i3), -1, intentPutExtras);
                            break;
                        }
                    }
                } else if (!xcVar.OooOO0) {
                    Toast.makeText(xc.OooO00o(), u7.OooO00o(new byte[]{-43, -39, 88, -13, 103, 102, -55, -55, -19, -38, 82, -31, 113, 35, -120, -60, -91, -44, 94, -26, 125, 108, -121, -118, -28, -41, 82, -28, 113}, new byte[]{-123, -75, 61, -110, 20, 3, -23, -86}), 1).show();
                    break;
                } else {
                    String str2 = ((Account) list.get(0)).type;
                    xc.OooO00o();
                    new oO00O0o0(new Intent()).OooO00o(str2);
                    break;
                }
                break;
            case 1:
                e81 e81Var = (e81) obj2;
                Account account2 = (Account) obj;
                e81Var.getClass();
                vv1 vv1VarOooO00o = vv1.OooO00o();
                vv1VarOooO00o.getClass();
                try {
                    vv1VarOooO00o.OooO00o.ooOO(qx1.OooO0oO(), account2);
                } catch (Exception e) {
                    vv1.OooO0OO(e);
                }
                AlertDialog alertDialog = (AlertDialog) e81Var.OooO0o;
                if (alertDialog != null && alertDialog.isShowing()) {
                    ((AlertDialog) e81Var.OooO0o).dismiss();
                    break;
                }
                break;
            default:
                ho0 ho0Var = (ho0) obj2;
                Activity activity = (Activity) obj;
                String str3 = (String) ho0Var.OooO0O0;
                int i4 = ho0Var.OooO00o;
                if (i4 == 0) {
                    Intent intent = new Intent(u7.OooO00o(new byte[]{109, 105, 100, 39, 32, -16, -6, 27, 101, 105, 116, 48, 33, -19, -80, 84, 111, 115, 105, 58, 33, -73, -56, 124, 73, 80}, new byte[]{12, 7, 0, 85, 79, -103, -98, 53}));
                    intent.addFlags(268435456);
                    intent.setData(Uri.parse(str3));
                    activity.startActivity(intent);
                } else if (i4 == 1 || i4 == 2) {
                    Intent intent2 = new Intent(u7.OooO00o(new byte[]{-101, -70, -29, 10, -3, 63, -89, -91, -109, -70, -13, 29, -4, 34, -19, -22, -103, -96, -18, 23, -4, 120, -107, -62, -65, -125}, new byte[]{-6, -44, -121, 120, -110, 86, -61, -117}));
                    intent2.addFlags(268435456);
                    intent2.setData(Uri.parse(u7.OooO00o(new byte[]{-70, 112, 121, -11, -21, 19, 1, 71, -8, 117, 110, -22, -17, 14, 87, 27, -24, 120, 111, -93}, new byte[]{-41, 17, 11, -98, -114, 103, 59, 104}) + str3));
                    intent2.setPackage(u7.OooO00o(new byte[]{-97, 106, 25, 105, -88, -37, -109, -73, -109, 108, 16, 105, -65, -48, -103, -95, -107, 107, 19}, new byte[]{-4, 5, 116, 71, -55, -75, -9, -59}));
                    if (intent2.resolveActivity(activity.getPackageManager()) != null) {
                        activity.startActivity(intent2);
                    } else {
                        intent2.setPackage(null);
                        intent2.setData(Uri.parse(u7.OooO00o(new byte[]{52, 110, 110, -55, 22, 27, 0, 80, 44, 118, 123, -64, 75, 70, 64, 16, 59, 118, 127, -105, 6, 78, 66, 80, 47, 110, 117, -53, 0, 14, 78, 15, 44, 105, 53, -35, 0, 85, 78, 22, 48, 105, 37, -48, 1, 28}, new byte[]{92, 26, 26, -71, 101, 33, 47, 127}) + str3));
                        try {
                            activity.startActivity(intent2);
                        } catch (Exception unused) {
                        }
                    }
                }
                activity.finishAndRemoveTask();
                break;
        }
    }
}

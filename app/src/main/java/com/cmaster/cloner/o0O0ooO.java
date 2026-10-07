package com.cmaster.cloner;

import android.accounts.Account;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0O0ooO implements View.OnClickListener {
    public final /* synthetic */ int OooO0Oo;
    public final /* synthetic */ Object OooO0o;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o0O0ooO(o00O000 o00o000, String str, int i) {
        this.OooO0Oo = 0;
        this.OooO0o0 = o00o000;
        this.OooO0o = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws NumberFormatException {
        int i = this.OooO0Oo;
        int i2 = 1;
        Object obj = this.OooO0o;
        Object obj2 = this.OooO0o0;
        switch (i) {
            case 0:
                o00O000 o00o000 = (o00O000) obj2;
                Account account = (Account) o00o000.OooO0o.get((String) obj);
                if (account != null) {
                    e81 e81Var = o00o000.OooO0oO;
                    e81Var.getClass();
                    Activity activityOooOO0 = e81.OooOO0();
                    if (activityOooOO0 != null) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(activityOooOO0);
                        builder.setTitle(u7.OooO00o(new byte[]{45, -125, -9, -38, -36, -70, 10, 84, 28, -123, -11, -64, -60, -85}, new byte[]{127, -26, -102, -75, -86, -33, 42, 21}));
                        builder.setMessage(u7.OooO00o(new byte[]{-47, -116, 50, 86, -36, 85, -83, -102, -22, -111, 53, 81, -36, 67, -89, -107, -23, -60, 57, 64, -36, 70, -85, -108, -22, -110, 62, 65, -36, 82, -68, -106, -24, -60, 8, 85, -99, 87, -85, -39}, new byte[]{-123, -28, 91, 37, -4, 52, -50, -7}) + (qx1.OooO0oO() + 1) + u7.OooO00o(new byte[]{22, 113, -117}, new byte[]{56, 123, -127, -81, -76, -120, -90, -60}) + account.name + u7.OooO00o(new byte[]{-15, 122, 78, 30, -126, 49, 29, 100, -107, 87, 99, 81, -107, 116, 74, 106, -103, 28, 114, 81, -125, 126, 74, 121, -98, 3, 99, 30, -123, 116, 74, 98, -113, 80, 118, 23, -125, 116, 24, 43, -119, 21, 122, 30, -127, 112, 6, 37}, new byte[]{-5, 112, 23, 113, -9, 17, 106, 11}));
                        builder.setNegativeButton(u7.OooO00o(new byte[]{99, 121, 73, -52, -47, -49}, new byte[]{49, 60, 4, -125, -121, -118, -59, 13}), new vc(e81Var, account, i2));
                        builder.setNeutralButton(u7.OooO00o(new byte[]{35, -26, -88, -102, 108, 72}, new byte[]{96, -89, -26, -39, 41, 4, -128, 8}), (DialogInterface.OnClickListener) null);
                        e81Var.OooOoO(builder.show());
                        break;
                    }
                }
                break;
            case 1:
                v5.OooO0Oo(((oo00oO) obj2).OooO0o0, ((s5) obj).OooO0Oo);
                break;
            case 2:
                r61 r61Var = r61.OooO00o;
                Context context = ((pr) obj2).OooO0o0;
                r61Var.getClass();
                sn2.OooO00o("ntQ63ixMTg==\n", "/btUqkk0OrU=\n");
                context.getClass();
                SharedPreferences.Editor editorEdit = r61.OooO00o(context).edit();
                editorEdit.putBoolean(r61.OooO0OO, true);
                editorEdit.apply();
                ((oOo0000O) obj).dismiss();
                break;
            default:
                ((y70) obj).onClick(view);
                ((th1) obj2).OooO00o(1);
                break;
        }
    }

    public /* synthetic */ o0O0ooO(Object obj, Object obj2, int i) {
        this.OooO0Oo = i;
        this.OooO0o0 = obj;
        this.OooO0o = obj2;
    }
}

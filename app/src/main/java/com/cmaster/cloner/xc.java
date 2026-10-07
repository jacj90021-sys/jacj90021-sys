package com.cmaster.cloner;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.ArrayMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class xc implements AccountManagerCallback {
    public static final String OooOOO = u7.OooO00o(new byte[]{113, 54, -39, -124, 0, -4, -27, 3, 117, 27, -42, -120, 24, -24, -23, 27, 99}, new byte[]{16, 90, -75, -21, 119, -99, -121, 111});
    public static final String OooOOOO = u7.OooO00o(new byte[]{10, -37, -20, -10, 100, 95, 30, -59, 14, -10, -29, -6, 124, 75, 18, -35, 63, -50, -16, -4, 96}, new byte[]{107, -73, -128, -103, 19, 62, 124, -87});
    public static final String OooOOOo = u7.OooO00o(new byte[]{3, 54, 7, -126, 76, -64, 123, -73, 49, 48, 8, -120, 90, -38, 106}, new byte[]{112, 83, 107, -25, 47, -76, 30, -45});
    public static final String OooOOo0 = u7.OooO00o(new byte[]{43, 58, -120, 1, 77, -20, -48, 31, 38, 48, -107, 54, 90, -3, -44, 36, 57, 58, -119, 16, 86, -31, -59}, new byte[]{79, 95, -5, 98, 63, -123, -96, 107});
    public HashSet OooO;
    public int OooO00o;
    public Intent OooO0O0;
    public AlertDialog OooO0OO;
    public int OooO0Oo;
    public String OooO0o;
    public IBinder OooO0o0;
    public int OooO0oO;
    public HashSet OooO0oo;
    public boolean OooOO0;
    public HashSet OooOO0O;
    public LinkedHashMap OooOO0o;
    public ArrayList OooOOO0;

    public static Activity OooO00o() {
        Object objValueAt;
        l81 l81Var;
        Object objOooO00o = o0OO0oO0.OooO00o();
        l81 l81Var2 = o0OO0oO0.OooO0O0;
        ArrayMap arrayMap = l81Var2 != null ? (ArrayMap) l81Var2.OooO0O0(objOooO00o) : null;
        if (arrayMap == null || arrayMap.isEmpty() || (objValueAt = arrayMap.valueAt(0)) == null || (l81Var = o0OO0.OooO0O0) == null) {
            return null;
        }
        return (Activity) l81Var.OooO0O0(objValueAt);
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable(u7.OooO00o(new byte[]{69, 114, -92, 124, -110, 70}, new byte[]{44, 28, -48, 25, -4, 50, -3, -19}));
            if (intent != null) {
                this.OooO00o = 2;
                intent.setFlags(intent.getFlags() & (-268435457));
                lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                if (this.OooO0Oo < 0) {
                    lw1VarOooO0O0.getClass();
                    return;
                } else {
                    lw1VarOooO0O0.OooOO0(intent, null, null, null, 0, null);
                    return;
                }
            }
        } catch (AuthenticatorException | IOException unused) {
        } catch (OperationCanceledException unused2) {
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
        new Bundle().putString(u7.OooO00o(new byte[]{30, 25, -78, 120, 34, 20, -8, 118, 8, 10, -89, 114}, new byte[]{123, 107, -64, 23, 80, 89, -99, 5}), u7.OooO00o(new byte[]{-6, -68, -17, 109, -13, 101, -13, 42, -14, -93, -24, 108, -24, 38, -15, 49, -10, -96, -6, 34, -10, 44, -28, 45, -65, -67, -8, 112, -9, 32, -30}, new byte[]{-97, -50, -99, 2, -127, 69, -112, 69}));
    }
}

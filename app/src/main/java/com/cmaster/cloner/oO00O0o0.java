package com.cmaster.cloner;

import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.os.Bundle;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class oO00O0o0 implements AccountManagerCallback {
    public static final String OooO0OO = u7.OooO00o(new byte[]{-5, 83, 64, 4, -122, -110, -102, 118, -12, 67, 107, 53, -111, -104, -102, 109, -23}, new byte[]{-102, 55, 36, 69, -27, -15, -11, 3});
    public static final String OooO0Oo = u7.OooO00o(new byte[]{77, -23, -95, 54, 40, 9, -126, 54, 66, -7, -105, 18, 58, 31, -124, 49, 73, -23, -125, 18, 42, 30, -104, 49, 73, -2}, new byte[]{44, -115, -59, 119, 75, 106, -19, 67});
    public static final String OooO0o0 = u7.OooO00o(new byte[]{15, 32, -89, 79, 42, -76, 81, -100, 0, 1, -86, 87, 27}, new byte[]{110, 85, -45, 39, 126, -37, 58, -7});
    public int OooO00o = 0;
    public final Intent OooO0O0;

    public oO00O0o0(Intent intent) {
        this.OooO0O0 = intent;
    }

    public final void OooO00o(String str) {
        String str2 = OooO0OO;
        Intent intent = this.OooO0O0;
        Bundle bundleExtra = intent.getBundleExtra(str2);
        String[] stringArrayExtra = intent.getStringArrayExtra(OooO0Oo);
        String stringExtra = intent.getStringExtra(OooO0o0);
        this.OooO00o = intent.getIntExtra(u7.OooO00o(new byte[]{-57, -21, -120, -95, -97, 125, -40, 20, -54, -25, -116, -89, -124, 76, -39, 56, -61, -6, -126, -86}, new byte[]{-90, -120, -21, -50, -22, 19, -84, 75}), 0);
        intent.getIntExtra(u7.OooO00o(new byte[]{68, -2, 5, -64, -103, -67, 65, 27, 73, -14, 1, -58, -126, -116, 86, 37, 73, -15, 15, -63, -117, -116, 69, 45, 65}, new byte[]{37, -99, 102, -81, -20, -45, 53, 68}), -1);
        intent.getStringExtra(u7.OooO00o(new byte[]{121, 118, -9, -25, 96, 36, 107, -58, 116, 122, -13, -31, 123, 21, 124, -8, 116, 121, -3, -26, 114, 21, 111, -14, 127}, new byte[]{24, 21, -108, -120, 21, 74, 31, -103}));
        intent.getIntExtra(u7.OooO00o(new byte[]{-63, 24, 72, -37, 127, -94, 116, 122, -52, 20, 76, -35, 100, -109, 99, 68, -52, 23, 66, -38, 109, -109, 97, 85, -48, 18, 79}, new byte[]{-96, 123, 43, -76, 10, -52, 0, 37}), -1);
        if (!m63.OooO0O0()) {
            if (str == null) {
                ra.OooOOO(u7.OooO00o(new byte[]{111, -62, 99, 118, 81, 80, -97, -78, 119, -47, 101, 57, 77, 77, -53, -120, 123, -51, 108}, new byte[]{14, -95, 0, 25, 36, 62, -21, -26}));
                return;
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                bundle.putAll(bundleExtra);
            }
            bundle.putString(u7.OooO00o(new byte[]{-80, -2, -101, -58, -45, 94, 41, -105, -80, -13, -108, -43, -37, 82, 3, -90, -68, -11}, new byte[]{-47, -112, -1, -76, -68, 55, 77, -57}), u7.OooO00o(new byte[]{92, 111, 117, 53, -115, -119, -85}, new byte[]{61, 1, 17, 71, -30, -32, -49, 9}));
            new oO0O0OoO(this, str, stringExtra, stringArrayExtra, bundle).OooO0o0();
            return;
        }
        jw1 jw1Var = (jw1) jw1.OooOOo0.OooO0O0();
        int i = this.OooO00o;
        jw1Var.getClass();
        if (str == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{40, -63, 104, -21, 16, 74, -93, 42, 48, -46, 110, -92, 12, 87, -9, 16, 60, -50, 103}, new byte[]{73, -94, 11, -124, 101, 36, -41, 126}));
            return;
        }
        Bundle bundle2 = new Bundle();
        if (bundleExtra != null) {
            bundle2.putAll(bundleExtra);
        }
        bundle2.putString(u7.OooO00o(new byte[]{21, -73, -82, 106, 99, -66, -118, -57, 21, -70, -95, 121, 107, -78, -96, -10, 25, -68}, new byte[]{116, -39, -54, 24, 12, -41, -18, -105}), u7.OooO00o(new byte[]{-90, -114, -19, -45, -59, 64, -10}, new byte[]{-57, -32, -119, -95, -86, 41, -110, -10}));
        new yv1(jw1Var, this, i, str, stringExtra, stringArrayExtra, bundle2).OooO0o0();
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            int i = 0;
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable(u7.OooO00o(new byte[]{64, 105, 39, 48, 7, 35}, new byte[]{41, 7, 83, 85, 105, 87, -89, -19}));
            if (intent != null) {
                intent.setFlags(intent.getFlags() & (-268435457));
                if (m63.OooO0O0()) {
                    cx1.OooO0o.execute(new oO000o00(this, intent, i));
                    return;
                }
                lw1 lw1VarOooO0O0 = lw1.OooO0O0();
                if (this.OooO00o < 0) {
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
        new Bundle().putString(u7.OooO00o(new byte[]{-120, -95, 15, 88, 127, 1, -41, 25, -98, -78, 26, 82}, new byte[]{-19, -45, 125, 55, 13, 76, -78, 106}), u7.OooO00o(new byte[]{124, -113, 71, 125, -69, -101, -109, 13, 116, -112, 64, 124, -96, -40, -111, 22, 112, -109, 82, 50, -66, -46, -124, 10, 57, -114, 80, 96, -65, -34, -126}, new byte[]{25, -3, 53, 18, -55, -69, -16, 98}));
    }
}

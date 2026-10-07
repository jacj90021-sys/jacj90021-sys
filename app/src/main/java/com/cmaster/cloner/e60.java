package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class e60 {
    public static final int OooO00o;
    public static final e60 OooO0O0;

    static {
        AtomicBoolean atomicBoolean = n60.OooO00o;
        OooO00o = 12451000;
        OooO0O0 = new e60();
    }

    public static int OooO00o(Context context) {
        AtomicBoolean atomicBoolean = n60.OooO00o;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public Intent OooO0O0(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && eq2.OooO0O0(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(OooO00o);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(e12.OooO00o(context).OooO0oO(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int OooO0OO(android.content.Context r12, int r13) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.e60.OooO0OO(android.content.Context, int):int");
    }
}

package com.cmaster.cloner;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import java.lang.reflect.InvocationHandler;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class KMO {
    public static Object IQBK(int i, Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
        if (i == 1000) {
            u7.OooO00o = ((Byte) objArr[4]).byteValue();
            Context context = (Context) objArr[0];
            ProviderInfo providerInfo = (ProviderInfo) objArr[1];
            ((Integer) objArr[2]).getClass();
            try {
                e92.OooO00o(context, providerInfo, (InvocationHandler) objArr[3]);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return Integer.valueOf(m63.OooO0OO);
        }
        if (i == 10302) {
            mf1 mf1Var = mf1.OooO0Oo;
            BroadcastReceiver broadcastReceiver = (BroadcastReceiver) objArr[0];
            if (mf1Var.OooO0O0.get(broadcastReceiver.getClass().getName()) != null) {
                ra.OooOO0o();
                return null;
            }
        } else {
            if (i == 10101) {
                mf1.OooO0Oo.OooO0O0((Service) objArr[0]);
                return null;
            }
            if (i == 10102) {
                return Integer.valueOf(mf1.OooO0Oo.OooO0o0((Service) objArr[0], (Intent) objArr[1], ((Integer) objArr[2]).intValue(), ((Integer) objArr[3]).intValue()));
            }
            if (i == 10201) {
                o0O0o000.OooO0oO.OooO0O0((Activity) objArr[0], (Intent) objArr[1]);
                return null;
            }
            if (i == 10202) {
                o0O0o000.OooO0oO.OooO0OO((Activity) objArr[0], ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue(), (Intent) objArr[3]);
                return null;
            }
            switch (i) {
                case 10001:
                    cx1.OooO0o.execute(new n0((Context) objArr[0], (Intent) objArr[1], ((Integer) objArr[2]).intValue(), 7));
                    return Boolean.TRUE;
                case 10002:
                    return mf1.OooO0Oo.OooO00o((Service) objArr[0], (Intent) objArr[1]);
                case 10003:
                    return Boolean.valueOf(mf1.OooO0Oo.OooO0oO((Service) objArr[0], (Intent) objArr[1]));
                case 10004:
                    Uri uri = (Uri) objArr[0];
                    if (m63.OooO00o()) {
                        String str = (String) lr2.OooO0OO(uri).second;
                        Uri.Builder builder = new Uri.Builder();
                        builder.scheme(uri.getScheme());
                        builder.authority(str);
                        builder.encodedPath(uri.getEncodedPath());
                        String queryParameter = uri.getQueryParameter(u7.OooO00o(new byte[]{18, -124, -5, 72, 124, -31, 49, -76, 15, -119, -20, 112, 105, -25, 1, -92, 15, -127, -20, 93, 70, -32, 28, -69, 57, -108, -4, 74, 107, -20}, new byte[]{102, -27, -119, 47, 25, -107, 110, -46}));
                        if (queryParameter != null) {
                            builder.encodedQuery(queryParameter);
                        }
                        builder.fragment(uri.getFragment());
                        return builder.build();
                    }
                    if (!m63.OooO0O0()) {
                        return uri;
                    }
                    Pair pairOooO0OO = lr2.OooO0OO(uri);
                    int iIntValue = ((Integer) pairOooO0OO.first).intValue();
                    ProviderInfo providerInfoO000o0Oo = ox1.o0O0ooO().o000o0Oo(0, iIntValue, null, (String) pairOooO0OO.second);
                    if (providerInfoO000o0Oo != null) {
                        oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
                        String str2 = providerInfoO000o0Oo.packageName;
                        String str3 = providerInfoO000o0Oo.processName;
                        u7.OooO00o(new byte[]{86}, new byte[]{53, -124, -13, 56, -72, -66, -40, 35});
                        b51 b51VarOooO0oo = oo00ooo0OooO0Oo.OooO0oo(iIntValue, str2, str3);
                        if (b51VarOooO0oo != null && b51VarOooO0oo.OooOOoo.OooOO0O != null) {
                            String strOooO0O0 = jx1.OooO0O0(b51VarOooO0oo.OooOOoo.OooOO0, b51VarOooO0oo.OooO);
                            Uri.Builder builderBuildUpon = uri.buildUpon();
                            builderBuildUpon.authority(strOooO0O0);
                            return builderBuildUpon.build();
                        }
                    }
                    break;
                case 10005:
                    return ((ui) e92.OooO0o0.OooO0O0()).call((String) objArr[0], (String) objArr[1], (Bundle) objArr[2]);
                default:
                    switch (i) {
                        case 10105:
                            mf1.OooO0Oo.OooO0OO((Service) objArr[0]);
                            break;
                        case 10106:
                            mf1.OooO0Oo.OooO0Oo((Service) objArr[0], (Intent) objArr[1]);
                            break;
                        case 10107:
                            mf1.OooO0Oo.OooO0o((Service) objArr[0], (Intent) objArr[1]);
                            break;
                    }
                    return null;
            }
        }
        return null;
    }
}

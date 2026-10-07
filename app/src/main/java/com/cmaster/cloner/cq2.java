package com.cmaster.cloner;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cq2 {
    public static t00 OooO00o(Context context) {
        ProviderInfo providerInfo;
        r00 r00Var;
        ApplicationInfo applicationInfo;
        int i = 5;
        vu0 aoVar = Build.VERSION.SDK_INT >= 28 ? new ao(i) : new vu0(i);
        PackageManager packageManager = context.getPackageManager();
        fy2.OooO00o(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            r00Var = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrOooO0oo = aoVar.OooO0oo(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrOooO0oo) {
                    arrayList.add(signature.toByteArray());
                }
                r00Var = new r00(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
        }
        if (r00Var == null) {
            return null;
        }
        return new t00(new s00(context, r00Var));
    }
}

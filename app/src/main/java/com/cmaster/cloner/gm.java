package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.support.customtabs.ICustomTabsService;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class gm {
    public final ICustomTabsService OooO00o;
    public final ComponentName OooO0O0;

    public gm(ICustomTabsService iCustomTabsService, ComponentName componentName) {
        this.OooO00o = iCustomTabsService;
        this.OooO0O0 = componentName;
    }

    public static String OooO00o(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://")), 0);
        if (resolveInfoResolveActivity != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            arrayList = arrayList2;
        }
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = (String) obj;
            intent.setPackage(str2);
            if (packageManager.resolveService(intent, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    public final nm OooO0O0(zl zlVar) {
        ICustomTabsService iCustomTabsService = this.OooO00o;
        fm fmVar = new fm(zlVar);
        try {
            if (iCustomTabsService.newSession(fmVar)) {
                return new nm(iCustomTabsService, fmVar, this.OooO0O0);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }
}

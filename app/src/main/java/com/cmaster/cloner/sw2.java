package com.cmaster.cloner;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sw2 {
    public static Intent OooO00o(oOOO00 oooo00) {
        Intent parentActivityIntent = oooo00.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strOooO0OO = OooO0OO(oooo00, oooo00.getComponentName());
            if (strOooO0OO == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(oooo00, strOooO0OO);
            try {
                return OooO0OO(oooo00, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strOooO0OO + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static Intent OooO0O0(oOOO00 oooo00, ComponentName componentName) {
        String strOooO0OO = OooO0OO(oooo00, componentName);
        if (strOooO0OO == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strOooO0OO);
        return OooO0OO(oooo00, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String OooO0OO(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }
}

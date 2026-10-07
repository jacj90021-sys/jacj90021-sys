package com.cmaster.cloner;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hz {
    public static final HashSet OooO00o;
    public static final String OooO0O0;
    public static final LinkedHashSet OooO0OO;
    public static final String OooO0Oo;

    static {
        sn2.OooO00o("E4nEoZDPRO5Dm8K6kg==\n", "MO6rzvejIcA=\n");
        OooO0O0 = sn2.OooO00o("4/OzkHOjGa7v9bqQZKgTuOnyuQ==\n", "gJzevhLNfdw=\n");
        sn2.OooO00o("AXnqmNiQBPoOc6nX0ZsZ8gtyqdHSjA==\n", "YhaHtr//a50=\n");
        HashSet hashSet = new HashSet(3);
        OooO00o = hashSet;
        LinkedHashSet linkedHashSet = new LinkedHashSet(2);
        HashSet hashSet2 = new HashSet();
        OooO0OO = new LinkedHashSet();
        OooO0Oo = e2.OooO.OooO00o.getPackageName() + sn2.OooO00o("c5HMhgRpenkCi8SBHn9zcA8=\n", "XceF1FA8OzU=\n");
        hashSet2.add(sn2.OooO00o("NSBJCmeo4EcwPUFBZbXhDCIn\n", "Vk8kJAPck2k=\n"));
        hashSet2.add(sn2.OooO00o("93IDS4wCG7PybwsAjh8a+Pl8Fg==\n", "lB1uZeh2aJ0=\n"));
        linkedHashSet.add(sn2.OooO00o("5fwNAQBymKTq9k5OCXmFrO/3TkgKbg==\n", "hpNgL2cd98M=\n"));
        linkedHashSet.add(sn2.OooO00o("zHl9ZDoHBV3Dcz4rMwwYVcZyPi0uDg==\n", "rxYQSl1oajo=\n"));
        hashSet.addAll(linkedHashSet);
        hashSet.add(sn2.OooO00o("cUxubbBeVYF9Smdtp1Vfl3tNZA==\n", "EiMDQ9EwMfM=\n"));
        new HashSet();
    }

    public static void OooO00o(Context context, String str, String str2, Bitmap bitmap, int i) {
        if (d43.OooO00o(context)) {
            Intent intent = new Intent();
            intent.setAction(OooO0Oo);
            intent.setPackage(context.getPackageName());
            intent.putExtra(sn2.OooO00o("a/bzI7z334Jj9uM0veqVyXLs5TD9zvrvQdnQFIzQ+uFP\n", "CpiXUdOeu6w=\n"), str);
            intent.putExtra(sn2.OooO00o("ATQEyOCgcE0JNBTf4b06BhguEtuhnEcmMg==\n", "YFpguo/JFGM=\n"), i);
            String str3 = str + sn2.OooO00o("0g==\n", "ktOgAusb9mU=\n") + i;
            oO0Ooooo oo0ooooo = new oO0Ooooo(5);
            oo0ooooo.OooO0o0 = context;
            oo0ooooo.OooO0o = str3;
            oo0ooooo.OooO0oo = str2;
            PorterDuff.Mode mode = IconCompat.OooOO0O;
            bitmap.getClass();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.OooO0O0 = bitmap;
            oo0ooooo.OooO = iconCompat;
            oo0ooooo.OooO0oO = new Intent[]{intent};
            if (TextUtils.isEmpty((String) oo0ooooo.OooO0oo)) {
                ra.OooOOO("Shortcut must have a non-empty label");
                return;
            }
            Intent[] intentArr = (Intent[]) oo0ooooo.OooO0oO;
            if (intentArr == null || intentArr.length == 0) {
                ra.OooOOO("Shortcut must have an intent");
                return;
            }
            int i2 = Build.VERSION.SDK_INT;
            Intent intentCreateShortcutResultIntent = i2 >= 26 ? ug1.OooO00o(context.getSystemService(ug1.OooO0O0())).createShortcutResultIntent(oo0ooooo.OooO()) : null;
            if (intentCreateShortcutResultIntent == null) {
                intentCreateShortcutResultIntent = new Intent();
            }
            oo0ooooo.OooO0O0(intentCreateShortcutResultIntent);
            IntentSender intentSender = PendingIntent.getBroadcast(context, 0, intentCreateShortcutResultIntent, 201326592).getIntentSender();
            if (i2 >= 26) {
                ug1.OooO00o(context.getSystemService(ug1.OooO0O0())).requestPinShortcut(oo0ooooo.OooO(), intentSender);
                return;
            }
            if (d43.OooO00o(context)) {
                Intent intent2 = new Intent("com.android.launcher.action.INSTALL_SHORTCUT");
                oo0ooooo.OooO0O0(intent2);
                if (intentSender == null) {
                    context.sendBroadcast(intent2);
                } else {
                    context.sendOrderedBroadcast(intent2, null, new g(intentSender, 4), null, -1, null, null);
                }
            }
        }
    }
}

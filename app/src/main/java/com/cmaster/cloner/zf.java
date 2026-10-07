package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zf {
    public final /* synthetic */ oOOO00 OooO0oo;
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();
    public final HashMap OooO0OO = new HashMap();
    public ArrayList OooO0Oo = new ArrayList();
    public final transient HashMap OooO0o0 = new HashMap();
    public final HashMap OooO0o = new HashMap();
    public final Bundle OooO0oO = new Bundle();

    public zf(oOOO00 oooo00) {
        this.OooO0oo = oooo00;
    }

    public final boolean OooO00o(int i, int i2, Intent intent) {
        o0O0oo0o o0o0oo0o;
        String str = (String) this.OooO00o.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        o0O0OOOo o0o0oooo = (o0O0OOOo) this.OooO0o0.get(str);
        if (o0o0oooo == null || (o0o0oo0o = o0o0oooo.OooO00o) == null || !this.OooO0Oo.contains(str)) {
            this.OooO0o.remove(str);
            this.OooO0oO.putParcelable(str, new o0oO0O0o(i2, intent));
            return true;
        }
        o0o0oo0o.OooO0o0(o0o0oooo.OooO0O0.OooO00o(i2, intent));
        this.OooO0Oo.remove(str);
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void OooO0O0(int i, o0O0O0o0 o0o0o0o0, Object obj) throws IntentSender.SendIntentException {
        o0O0O0Oo o0o0o0oo;
        Intent type;
        int i2;
        Bundle bundleExtra;
        int i3 = o0o0o0o0.OooO00o;
        Bundle bundleExtra2 = null;
        oOOO00 oooo00 = this.OooO0oo;
        switch (i3) {
            case 0:
                ((String) obj).getClass();
                o0o0o0oo = null;
                break;
            case 1:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    o0o0o0oo = new o0O0O0Oo(pv.OooO0Oo, 0);
                    break;
                } else {
                    for (String str : strArr) {
                        if (ep2.OooO00o(oooo00, str) != 0) {
                            o0o0o0oo = null;
                            break;
                        }
                    }
                    int iOooO00o = xp0.OooO00o(strArr.length);
                    if (iOooO00o < 16) {
                        iOooO00o = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iOooO00o);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    o0o0o0oo = new o0O0O0Oo(linkedHashMap, 0);
                    break;
                }
            default:
                o0o0o0oo = null;
                break;
        }
        if (o0o0o0oo != null) {
            new Handler(Looper.getMainLooper()).post(new n0(this, i, o0o0o0oo, 2));
            return;
        }
        switch (o0o0o0o0.OooO00o) {
            case 0:
                String str3 = (String) obj;
                str3.getClass();
                type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str3);
                type.getClass();
                break;
            case 1:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                type = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                type.getClass();
                break;
            case 2:
                type = (Intent) obj;
                type.getClass();
                break;
            default:
                cj0 cj0Var = (cj0) obj;
                type = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = cj0Var.OooO0o0;
                if (intent != null && (bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    type.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        cj0Var = new cj0(cj0Var.OooO0Oo, null, cj0Var.OooO0o, cj0Var.OooO0oO);
                    }
                }
                type.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", cj0Var);
                if (k20.Oooo000(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + type);
                    break;
                }
                break;
        }
        if (type.getExtras() != null && type.getExtras().getClassLoader() == null) {
            type.setExtrasClassLoader(oooo00.getClassLoader());
        }
        if (type.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra2 = type.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            type.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle = bundleExtra2;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(type.getAction())) {
            String[] stringArrayExtra = type.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                if (TextUtils.isEmpty(stringArrayExtra[i4])) {
                    ra.OooOOO(rj.OooO0oO(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                    return;
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i4], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i4));
                }
            }
            int size = hashSet.size();
            String[] strArr3 = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i5 = 0;
                for (int i6 = 0; i6 < stringArrayExtra.length; i6++) {
                    if (!hashSet.contains(Integer.valueOf(i6))) {
                        strArr3[i5] = stringArrayExtra[i6];
                        i5++;
                    }
                }
            }
            oooo00.requestPermissions(stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(type.getAction())) {
            oooo00.startActivityForResult(type, i, bundle);
            return;
        }
        cj0 cj0Var2 = (cj0) type.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                oooo00.startIntentSenderForResult(cj0Var2.OooO0Oo, i2, cj0Var2.OooO0o0, cj0Var2.OooO0o, cj0Var2.OooO0oO, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new n0(this, i2, e, 3));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final o0O0OOO0 OooO0OO(String str, o0O0O0o0 o0o0o0o0, o0O0oo0o o0o0oo0o) {
        OooO0Oo(str);
        this.OooO0o0.put(str, new o0O0OOOo(o0o0oo0o, o0o0o0o0));
        HashMap map = this.OooO0o;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            o0o0oo0o.OooO0o0(obj);
        }
        Bundle bundle = this.OooO0oO;
        o0oO0O0o o0oo0o0o = (o0oO0O0o) bundle.getParcelable(str);
        if (o0oo0o0o != null) {
            bundle.remove(str);
            o0o0oo0o.OooO0o0(o0o0o0o0.OooO00o(o0oo0o0o.OooO0Oo, o0oo0o0o.OooO0o0));
        }
        return new o0O0OOO0(this, str, o0o0o0o0, 1);
    }

    public final void OooO0Oo(String str) {
        HashMap map = this.OooO0O0;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        oo0o0Oo oo0o0oo = o61.OooO0Oo;
        int iNextInt = o61.OooO0Oo.OooO00o().nextInt(2147418112);
        while (true) {
            int i = iNextInt + 65536;
            Integer numValueOf = Integer.valueOf(i);
            HashMap map2 = this.OooO00o;
            if (!map2.containsKey(numValueOf)) {
                map2.put(Integer.valueOf(i), str);
                map.put(str, Integer.valueOf(i));
                return;
            } else {
                oo0o0Oo oo0o0oo2 = o61.OooO0Oo;
                iNextInt = o61.OooO0Oo.OooO00o().nextInt(2147418112);
            }
        }
    }

    public final void OooO0o0(String str) {
        Integer num;
        if (!this.OooO0Oo.contains(str) && (num = (Integer) this.OooO0O0.remove(str)) != null) {
            this.OooO00o.remove(num);
        }
        this.OooO0o0.remove(str);
        HashMap map = this.OooO0o;
        if (map.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.OooO0oO;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.OooO0OO;
        oo0OOoo oo0oooo = (oo0OOoo) map2.get(str);
        if (oo0oooo != null) {
            ArrayList arrayList = oo0oooo.OooO0O0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                oo0oooo.OooO00o.OooOOOO((cm0) obj);
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}

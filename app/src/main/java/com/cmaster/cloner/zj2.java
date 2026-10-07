package com.cmaster.cloner;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbfn;
import com.google.android.gms.internal.ads.zzfoc;
import com.google.android.gms.internal.ads.zzfrw;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zj2 {
    public float OooO00o;
    public static final zzfrw OooO0O0 = new zzfrw(Looper.getMainLooper());
    public static final String OooO0OO = oO0Oo0oo.class.getName();
    public static final String OooO0Oo = gj0.class.getName();
    public static final String OooO0o0 = oO00000.class.getName();
    public static final String OooO0o = oO0000O.class.getName();
    public static final String OooO0oO = zzfoc.class.getName();
    public static final String OooO0oo = o0oo0000.class.getName();

    public static final void OooO00o(Context context, String str, Bundle bundle, vh2 vh2Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            e60.OooO0O0.getClass();
            str = e60.OooO00o(context) + ".252530000";
        }
        bundle.putString("js", str);
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            builderAppendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        vh2Var.zza(builderAppendQueryParameter.toString());
    }

    public static final int OooO0O0(Context context, int i) {
        return OooOOO0(context.getResources().getDisplayMetrics(), i);
    }

    public static final String OooO0OO(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
        if (string == null || OooOOO()) {
            string = "emulator";
        }
        return OooO0Oo(string, "MD5");
    }

    public static String OooO0Oo(String str, String str2) throws NoSuchAlgorithmException {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public static boolean OooOO0o(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith((String) zzbfn.zzd.zze());
    }

    public static final boolean OooOOO() {
        boolean zBooleanValue = ((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzlQ)).booleanValue();
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        if (str.contains("generic") || str.contains("emulator")) {
            return true;
        }
        return zBooleanValue && Build.HARDWARE.contains("ranchu");
    }

    public static final int OooOOO0(DisplayMetrics displayMetrics, int i) {
        return (int) TypedValue.applyDimension(1, i, displayMetrics);
    }

    public final JSONArray OooO(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            OooO0o(jSONArray, obj);
        }
        return jSONArray;
    }

    public final void OooO0o(JSONArray jSONArray, Object obj) {
        if (obj instanceof Bundle) {
            jSONArray.put(OooOO0((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONArray.put(OooOO0O((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONArray.put(OooO0o0((Collection) obj));
        } else if (obj instanceof Object[]) {
            jSONArray.put(OooO((Object[]) obj));
        } else {
            jSONArray.put(obj);
        }
    }

    public final JSONArray OooO0o0(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            OooO0o(jSONArray, it.next());
        }
        return jSONArray;
    }

    public final void OooO0oO(JSONObject jSONObject, String str, Object obj) throws JSONException {
        if (((Boolean) u72.OooO0Oo.OooO0OO.zzb(zzbde.zzq)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            jSONObject.put(str, OooOO0((Bundle) obj));
            return;
        }
        if (obj instanceof Map) {
            jSONObject.put(str, OooOO0O((Map) obj));
            return;
        }
        if (obj instanceof Collection) {
            jSONObject.put(String.valueOf(str), OooO0o0((Collection) obj));
            return;
        }
        if (obj instanceof Object[]) {
            jSONObject.put(str, OooO0o0(Arrays.asList((Object[]) obj)));
            return;
        }
        int i = 0;
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            Integer[] numArr = new Integer[length];
            while (i < length) {
                numArr[i] = Integer.valueOf(iArr[i]);
                i++;
            }
            jSONObject.put(str, OooO(numArr));
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length2 = dArr.length;
            Double[] dArr2 = new Double[length2];
            while (i < length2) {
                dArr2[i] = Double.valueOf(dArr[i]);
                i++;
            }
            jSONObject.put(str, OooO(dArr2));
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length3 = jArr.length;
            Long[] lArr = new Long[length3];
            while (i < length3) {
                lArr[i] = Long.valueOf(jArr[i]);
                i++;
            }
            jSONObject.put(str, OooO(lArr));
            return;
        }
        if (!(obj instanceof boolean[])) {
            jSONObject.put(str, obj);
            return;
        }
        boolean[] zArr = (boolean[]) obj;
        int length4 = zArr.length;
        Boolean[] boolArr = new Boolean[length4];
        while (i < length4) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
            i++;
        }
        jSONObject.put(str, OooO(boolArr));
    }

    public final int OooO0oo(Context context, int i) {
        if (this.OooO00o < 0.0f) {
            synchronized (this) {
                try {
                    if (this.OooO00o < 0.0f) {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        if (windowManager == null) {
                            return 0;
                        }
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        DisplayMetrics displayMetrics = new DisplayMetrics();
                        defaultDisplay.getMetrics(displayMetrics);
                        this.OooO00o = displayMetrics.density;
                    }
                } finally {
                }
            }
        }
        return Math.round(i / this.OooO00o);
    }

    public final JSONObject OooOO0(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            OooO0oO(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject OooOO0O(Map map) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                OooO0oO(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e.getMessage())));
        }
    }
}

package com.cmaster.cloner;

import android.content.SharedPreferences;
import java.util.HashSet;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c31 {
    public static final String OooO;
    public static final String OooO0o;
    public static final String OooO0o0;
    public static final String OooO0oO;
    public static final String OooO0oo;
    public static final c31 OooOO0;
    public final s80 OooO00o = new s80();
    public HashSet OooO0O0 = new HashSet();
    public HashSet OooO0OO = new HashSet();
    public final int OooO0Oo;

    public c31() {
        this.OooO0Oo = 0;
        try {
            SharedPreferences sharedPreferences = e92.OooO00o.getSharedPreferences(OooO0o0, 0);
            this.OooO0O0.addAll(sharedPreferences.getStringSet(OooO0o, new HashSet()));
            this.OooO0OO.addAll(sharedPreferences.getStringSet(OooO0oO, new HashSet()));
        } catch (Throwable unused) {
        }
        try {
            this.OooO0Oo = e92.OooO00o.getSharedPreferences(OooO0oo, 0).getInt(OooO, 0);
        } catch (Throwable unused2) {
        }
    }

    public static native void OooO0OO(JSONArray jSONArray, long j);

    public final native void OooO00o(JSONArray jSONArray);

    public final native void OooO0O0(JSONArray jSONArray);

    public final native void OooO0Oo(String str);

    static {
        DexUtils.classesInit0(24);
        OooO0o0 = u7.OooO00o(new byte[]{50, 90, -122, 111, 117, -75, 121, -7, 30, 67, -73, 126, 109, -69, 118, -2, 30, 68, -72, 96, 124}, new byte[]{65, 42, -39, 13, 25, -38, 26, -110});
        OooO0o = u7.OooO00o(new byte[]{71, 59, -28, 52, -15, 14, 4, -120, 107, 34, -43, 37, -23, 0, 11, -113, 107, 59, -48, 49, -18}, new byte[]{52, 75, -69, 86, -99, 97, 103, -29});
        OooO0oO = u7.OooO00o(new byte[]{-90, 25, -123, 12, 56, -18, 91, -60, -118, 6, -86, 11, 58, -34, 72, -60, -78, 26}, new byte[]{-43, 105, -38, 110, 84, -127, 56, -81});
        u7.OooO00o(new byte[]{65, 0, -76, -113, -67, -117, 81, 38, 68, 59, -92, -65, -80, -127, 87, 52}, new byte[]{32, 100, -57, -48, -34, -25, 62, 83});
        OooO0oo = u7.OooO00o(new byte[]{-113, 111, 8, 91, 110, -109, 30, -116, -109, 113, 49, 83, 109, -65, 47, -114, -111, 122}, new byte[]{-4, 31, 87, 58, 10, -32, 65, -17});
        OooO = u7.OooO00o(new byte[]{62, -89, 116, 79, -118, 120, -64, -30, 36, -92, 116, 77, -127, 101, -7, -17, 42}, new byte[]{77, -41, 43, 46, -18, 11, -97, -122});
        OooOO0 = new c31();
    }
}

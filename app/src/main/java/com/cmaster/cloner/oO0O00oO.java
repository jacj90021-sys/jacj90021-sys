package com.cmaster.cloner;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oO0O00oO {
    public static final CopyOnWriteArraySet OooO00o = new CopyOnWriteArraySet();
    public static final Map OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = ly0.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(ly0.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(r80.class.getName(), "okhttp.Http2");
        linkedHashMap.put(em1.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        OooO0O0 = xp0.OooO0OO(linkedHashMap);
    }

    public static void OooO00o(String str, int i, String str2, Throwable th) {
        int iMin;
        String strSubstring = (String) OooO0O0.get(str);
        int i2 = 0;
        if (strSubstring == null) {
            int length = str.length();
            if (23 <= length) {
                length = 23;
            }
            strSubstring = str.substring(0, length);
        }
        if (Log.isLoggable(strSubstring, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length2 = str2.length();
            while (i2 < length2) {
                int iIndexOf = str2.indexOf(10, i2);
                if (iIndexOf == -1) {
                    iIndexOf = length2;
                }
                while (true) {
                    iMin = Math.min(iIndexOf, i2 + 4000);
                    Log.println(i, strSubstring, str2.substring(i2, iMin));
                    if (iMin >= iIndexOf) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}

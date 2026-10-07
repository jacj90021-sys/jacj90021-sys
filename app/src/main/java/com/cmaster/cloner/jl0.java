package com.cmaster.cloner;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jl0 {
    public static final Map OooO00o;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char cCharAt = property.charAt(i);
                if ((cCharAt > 31 || cCharAt == '\t') && cCharAt < 127) {
                    sb.append(cCharAt);
                } else {
                    sb.append('?');
                }
            }
            property = sb.toString();
        }
        HashMap map = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            map.put("User-Agent", Collections.singletonList(new kl0(property)));
        }
        OooO00o = Collections.unmodifiableMap(map);
    }
}

package com.cmaster.cloner;

import android.os.Bundle;
import java.lang.reflect.Array;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a83 {
    public static boolean OooO00o(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    bundle2 = obj2;
                    bundle = obj;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !OooO00o((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (!obj2.getClass().isArray() || length != Array.getLength(obj2)) {
                        return false;
                    }
                    for (int i = 0; i < length; i++) {
                        if (!uw2.OooO00o(Array.get(obj, i), Array.get(obj2, i))) {
                            return false;
                        }
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        return bundle == null && bundle2 == null;
    }
}

package com.cmaster.cloner;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ll0 implements o70 {
    public final Map OooO0O0;
    public volatile Map OooO0OO;

    public ll0(Map map) {
        this.OooO0O0 = Collections.unmodifiableMap(map);
    }

    @Override // com.cmaster.cloner.o70
    public final Map OooO00o() {
        if (this.OooO0OO == null) {
            synchronized (this) {
                try {
                    if (this.OooO0OO == null) {
                        this.OooO0OO = Collections.unmodifiableMap(OooO0O0());
                    }
                } finally {
                }
            }
        }
        return this.OooO0OO;
    }

    public final HashMap OooO0O0() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.OooO0O0.entrySet()) {
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((kl0) list.get(i)).OooO00o;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String string = sb.toString();
            if (!TextUtils.isEmpty(string)) {
                map.put(entry.getKey(), string);
            }
        }
        return map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ll0) {
            return this.OooO0O0.equals(((ll0) obj).OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.OooO0O0 + '}';
    }
}

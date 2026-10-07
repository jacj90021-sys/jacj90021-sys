package com.cmaster.cloner;

import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jz {
    public final String OooO00o;
    public final Map OooO0O0;

    public jz(String str, Map map) {
        this.OooO00o = str;
        this.OooO0O0 = map;
    }

    public static e81 OooO00o(String str) {
        return new e81(str, 15);
    }

    public static jz OooO0O0(String str) {
        return new jz(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jz)) {
            return false;
        }
        jz jzVar = (jz) obj;
        return this.OooO00o.equals(jzVar.OooO00o) && this.OooO0O0.equals(jzVar.OooO0O0);
    }

    public final int hashCode() {
        return this.OooO0O0.hashCode() + (this.OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.OooO00o + ", properties=" + this.OooO0O0.values() + "}";
    }
}

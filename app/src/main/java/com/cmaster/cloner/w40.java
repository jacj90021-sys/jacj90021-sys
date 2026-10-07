package com.cmaster.cloner;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class w40 {
    public final List OooO00o;

    public w40(List list) {
        list.getClass();
        this.OooO00o = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w40)) {
            return false;
        }
        List list = this.OooO00o;
        int size = list.size();
        List list2 = ((w40) obj).OooO00o;
        if (size != list2.size()) {
            return false;
        }
        return new HashSet(list).equals(new HashSet(list2));
    }

    public final int hashCode() {
        return Objects.hash(this.OooO00o);
    }

    public final String toString() {
        return "Topics=" + this.OooO00o;
    }
}

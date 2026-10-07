package com.cmaster.cloner;

import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class sd2 extends uc2 implements Set {
    public transient ld2 OooO0o0;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return v73.OooO00o(this);
    }
}

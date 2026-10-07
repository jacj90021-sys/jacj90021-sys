package com.cmaster.cloner;

import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class rl0 extends g7 {
    public String OooO0o0;

    @Override // com.cmaster.cloner.g7, com.cmaster.cloner.cc
    public final c2 OooOo0o() {
        return new c2(4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rl0.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.OooO0o0, ((rl0) obj).OooO0o0);
    }

    public final int hashCode() {
        return Objects.hash(this.OooO0o0);
    }
}

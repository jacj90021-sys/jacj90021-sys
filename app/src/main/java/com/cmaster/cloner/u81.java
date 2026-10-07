package com.cmaster.cloner;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class u81 implements wp1, ln1, Comparable {
    public static final String OooO0o = u7.OooO00o(new byte[]{-48}, new byte[]{-90, 87, 83, 42, 29, 38, 107, -88});
    public static final ConcurrentHashMap OooO0oO = new ConcurrentHashMap(10000, 0.75f);
    public static final vy OooO0oo = new vy(1);
    public final int OooO0Oo;
    public final wp1 OooO0o0;

    public u81(int i, wp1 wp1Var) {
        if (i < 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{38, -120, 46, 84, -104, -103, -85}, new byte[]{84, -19, 73, 116, -92, -71, -101, 52}));
            throw null;
        }
        if (wp1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{39, 2, 68, -81, -4, 106, -36, 66, 61, 14, 88, -90}, new byte[]{83, 123, 52, -54, -36, 87, -31, 98}));
            throw null;
        }
        this.OooO0Oo = i;
        this.OooO0o0 = wp1Var;
    }

    public static u81 OooO0Oo(int i, wp1 wp1Var) {
        t81 t81Var = (t81) OooO0oo.get();
        t81Var.OooO00o = i;
        t81Var.OooO0O0 = wp1Var;
        ConcurrentHashMap concurrentHashMap = OooO0oO;
        u81 u81Var = (u81) concurrentHashMap.get(t81Var);
        if (u81Var == null) {
            u81Var = new u81(t81Var.OooO00o, t81Var.OooO0O0);
            u81 u81Var2 = (u81) concurrentHashMap.putIfAbsent(u81Var, u81Var);
            if (u81Var2 != null) {
                return u81Var2;
            }
        }
        return u81Var;
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return OooO0oO(true);
    }

    @Override // com.cmaster.cloner.wp1
    public final int OooO0O0() {
        return this.OooO0o0.OooO0O0();
    }

    public final int OooO0OO() {
        return this.OooO0o0.getType().OooO0Oo();
    }

    public final String OooO0o() {
        return OooO0o + this.OooO0Oo;
    }

    public final boolean OooO0o0() {
        int i = this.OooO0o0.getType().OooO0o0;
        return i == 4 || i == 7;
    }

    public final String OooO0oO(boolean z) {
        StringBuilder sb = new StringBuilder(40);
        sb.append(OooO0o());
        sb.append(u7.OooO00o(new byte[]{73}, new byte[]{115, 29, 72, 25, -29, 24, 26, -45}));
        wp1 wp1Var = this.OooO0o0;
        vp1 type = wp1Var.getType();
        sb.append(type);
        if (type != wp1Var) {
            sb.append(u7.OooO00o(new byte[]{-127}, new byte[]{-68, -24, 39, 123, -37, 27, -107, 112}));
            if (z && (wp1Var instanceof ml)) {
                sb.append(((ml) wp1Var).OooO0o());
            } else if (z && (wp1Var instanceof oh)) {
                sb.append(wp1Var.OooO00o());
            } else {
                sb.append(wp1Var);
            }
        }
        return sb.toString();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        u81 u81Var = (u81) obj;
        int i = u81Var.OooO0Oo;
        int i2 = this.OooO0Oo;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        if (this == u81Var) {
            return 0;
        }
        int iCompareTo = this.OooO0o0.getType().OooO0Oo.compareTo(u81Var.OooO0o0.getType().OooO0Oo);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        boolean z = obj instanceof u81;
        wp1 wp1Var = this.OooO0o0;
        int i = this.OooO0Oo;
        if (z) {
            u81 u81Var = (u81) obj;
            return i == u81Var.OooO0Oo && wp1Var.equals(u81Var.OooO0o0);
        }
        if (obj instanceof t81) {
            t81 t81Var = (t81) obj;
            int i2 = t81Var.OooO00o;
            wp1 wp1Var2 = t81Var.OooO0O0;
            if (i == i2 && wp1Var.equals(wp1Var2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.wp1
    public final vp1 getType() {
        return this.OooO0o0.getType();
    }

    public final int hashCode() {
        return (this.OooO0o0.hashCode() * 31) + this.OooO0Oo;
    }

    public final String toString() {
        return OooO0oO(false);
    }
}

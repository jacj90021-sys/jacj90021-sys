package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ci1 implements Cloneable {
    public /* synthetic */ int[] OooO0Oo;
    public /* synthetic */ int OooO0o;
    public /* synthetic */ Object[] OooO0o0;

    public ci1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.OooO0Oo = new int[i4];
        this.OooO0o0 = new Object[i4];
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        ci1 ci1Var = (ci1) objClone;
        ci1Var.OooO0Oo = (int[]) this.OooO0Oo.clone();
        ci1Var.OooO0o0 = (Object[]) this.OooO0o0.clone();
        return ci1Var;
    }

    public final String toString() {
        int i = this.OooO0o;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.OooO0o;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.OooO0Oo[i3]);
            sb.append('=');
            Object obj = this.OooO0o0[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

package com.cmaster.cloner;

import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gp0 implements Cloneable {
    public /* synthetic */ boolean OooO0Oo;
    public /* synthetic */ Object[] OooO0o;
    public /* synthetic */ long[] OooO0o0;
    public /* synthetic */ int OooO0oO;

    public gp0() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.OooO0o0 = new long[i4];
        this.OooO0o = new Object[i4];
    }

    public final void OooO00o() {
        int i = this.OooO0oO;
        Object[] objArr = this.OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.OooO0oO = 0;
        this.OooO0Oo = false;
    }

    public final Object OooO0O0(long j) {
        Object obj;
        int iOooO0O0 = tf0.OooO0O0(this.OooO0o0, this.OooO0oO, j);
        if (iOooO0O0 < 0 || (obj = this.OooO0o[iOooO0O0]) == o62.OooO00o) {
            return null;
        }
        return obj;
    }

    public final long OooO0OO(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.OooO0oO)) {
            sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
            return 0L;
        }
        if (this.OooO0Oo) {
            long[] jArr = this.OooO0o0;
            Object[] objArr = this.OooO0o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != o62.OooO00o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.OooO0Oo = false;
            this.OooO0oO = i3;
        }
        return this.OooO0o0[i];
    }

    public final void OooO0Oo(long j, Object obj) {
        int iOooO0O0 = tf0.OooO0O0(this.OooO0o0, this.OooO0oO, j);
        if (iOooO0O0 >= 0) {
            this.OooO0o[iOooO0O0] = obj;
            return;
        }
        int i = ~iOooO0O0;
        int i2 = this.OooO0oO;
        Object obj2 = o62.OooO00o;
        if (i < i2) {
            Object[] objArr = this.OooO0o;
            if (objArr[i] == obj2) {
                this.OooO0o0[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.OooO0Oo) {
            long[] jArr = this.OooO0o0;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.OooO0o;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.OooO0Oo = false;
                this.OooO0oO = i3;
                i = ~tf0.OooO0O0(this.OooO0o0, i3, j);
            }
        }
        int i5 = this.OooO0oO;
        if (i5 >= this.OooO0o0.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, i9);
            this.OooO0o = Arrays.copyOf(this.OooO0o, i9);
        }
        int i10 = this.OooO0oO - i;
        if (i10 != 0) {
            long[] jArr2 = this.OooO0o0;
            int i11 = i + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.OooO0o;
            o3.OooO0O0(objArr3, i11, objArr3, i, this.OooO0oO);
        }
        this.OooO0o0[i] = j;
        this.OooO0o[i] = obj;
        this.OooO0oO++;
    }

    public final Object OooO0o(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.OooO0oO)) {
            sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        if (this.OooO0Oo) {
            long[] jArr = this.OooO0o0;
            Object[] objArr = this.OooO0o;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != o62.OooO00o) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.OooO0Oo = false;
            this.OooO0oO = i3;
        }
        return this.OooO0o[i];
    }

    public final int OooO0o0() {
        if (this.OooO0Oo) {
            int i = this.OooO0oO;
            long[] jArr = this.OooO0o0;
            Object[] objArr = this.OooO0o;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != o62.OooO00o) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.OooO0Oo = false;
            this.OooO0oO = i2;
        }
        return this.OooO0oO;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        gp0 gp0Var = (gp0) objClone;
        gp0Var.OooO0o0 = (long[]) this.OooO0o0.clone();
        gp0Var.OooO0o = (Object[]) this.OooO0o.clone();
        return gp0Var;
    }

    public final String toString() {
        if (OooO0o0() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0oO * 28);
        sb.append('{');
        int i = this.OooO0oO;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(OooO0OO(i2));
            sb.append('=');
            Object objOooO0o = OooO0o(i2);
            if (objOooO0o != sb) {
                sb.append(objOooO0o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}

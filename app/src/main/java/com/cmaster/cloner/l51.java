package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l51 implements Cloneable {
    public static final vu0 OooO = new vu0(11);
    public long[] OooO0o;
    public int OooO0oO;
    public ArrayList OooO0Oo = new ArrayList();
    public long OooO0o0 = 0;
    public final vu0 OooO0oo = OooO;

    public final boolean OooO00o(int i) {
        int i2;
        if (i < 64) {
            return (this.OooO0o0 & (1 << i)) != 0;
        }
        long[] jArr = this.OooO0o;
        if (jArr != null && (i2 = (i / 64) - 1) < jArr.length) {
            return ((1 << (i % 64)) & jArr[i2]) != 0;
        }
        return false;
    }

    public final synchronized void OooO0O0(int i, q6 q6Var) throws Throwable {
        try {
            try {
                this.OooO0oO++;
                int size = this.OooO0Oo.size();
                int length = this.OooO0o == null ? -1 : r0.length - 1;
                OooO0Oo(q6Var, i, length);
                OooO0OO(q6Var, i, (length + 2) * 64, size, 0L);
                int i2 = this.OooO0oO - 1;
                this.OooO0oO = i2;
                if (i2 == 0) {
                    long[] jArr = this.OooO0o;
                    if (jArr != null) {
                        for (int length2 = jArr.length - 1; length2 >= 0; length2--) {
                            long j = this.OooO0o[length2];
                            if (j != 0) {
                                OooO0o0((length2 + 1) * 64, j);
                                this.OooO0o[length2] = 0;
                            }
                        }
                    }
                    long j2 = this.OooO0o0;
                    if (j2 != 0) {
                        OooO0o0(0, j2);
                        this.OooO0o0 = 0L;
                    }
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(q6 q6Var, int i, int i2, int i3, long j) {
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                Object obj = this.OooO0Oo.get(i2);
                this.OooO0oo.getClass();
                jq jqVar = (jq) obj;
                switch (jqVar.OooO00o) {
                    case 0:
                        kq kqVar = (kq) jqVar.OooO0O0;
                        if (kqVar.OooOOo0 != null) {
                            boolean zOooO0OO = kqVar.OooO0OO();
                            fy0 fy0Var = kqVar.OooO;
                            if (!zOooO0OO) {
                                fy0Var.OooO0Oo(true);
                                break;
                            } else {
                                fy0Var.OooO0Oo(false);
                                break;
                            }
                        } else {
                            break;
                        }
                    default:
                        yx1 yx1Var = (yx1) jqVar.OooO0O0;
                        rt1 rt1Var = (rt1) yx1Var.get();
                        if (rt1Var == null) {
                            yx1Var.OooO00o();
                        }
                        if (rt1Var == null || ((q6) yx1Var.OooO0OO) != q6Var || !rt1Var.OooO0oo(yx1Var.OooO0O0, i, q6Var)) {
                            break;
                        } else {
                            rt1Var.OooO();
                            break;
                        }
                        break;
                }
            }
            j2 <<= 1;
            i2++;
        }
    }

    public final void OooO0Oo(q6 q6Var, int i, int i2) {
        if (i2 < 0) {
            OooO0OO(q6Var, i, 0, Math.min(64, this.OooO0Oo.size()), this.OooO0o0);
            return;
        }
        long j = this.OooO0o[i2];
        int i3 = (i2 + 1) * 64;
        int iMin = Math.min(this.OooO0Oo.size(), i3 + 64);
        OooO0Oo(q6Var, i, i2 - 1);
        OooO0OO(q6Var, i, i3, iMin, j);
    }

    public final void OooO0o(int i) {
        if (i < 64) {
            this.OooO0o0 = (1 << i) | this.OooO0o0;
            return;
        }
        int i2 = (i / 64) - 1;
        long[] jArr = this.OooO0o;
        if (jArr == null) {
            this.OooO0o = new long[this.OooO0Oo.size() / 64];
        } else if (jArr.length <= i2) {
            long[] jArr2 = new long[this.OooO0Oo.size() / 64];
            long[] jArr3 = this.OooO0o;
            System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            this.OooO0o = jArr2;
        }
        long[] jArr4 = this.OooO0o;
        jArr4[i2] = (1 << (i % 64)) | jArr4[i2];
    }

    public final void OooO0o0(int i, long j) {
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.OooO0Oo.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    public final Object clone() {
        l51 l51Var;
        CloneNotSupportedException e;
        synchronized (this) {
            try {
                l51Var = (l51) super.clone();
            } catch (CloneNotSupportedException e2) {
                l51Var = null;
                e = e2;
            }
            try {
                l51Var.OooO0o0 = 0L;
                l51Var.OooO0o = null;
                l51Var.OooO0oO = 0;
                l51Var.OooO0Oo = new ArrayList();
                int size = this.OooO0Oo.size();
                for (int i = 0; i < size; i++) {
                    if (!OooO00o(i)) {
                        l51Var.OooO0Oo.add(this.OooO0Oo.get(i));
                    }
                }
            } catch (CloneNotSupportedException e3) {
                e = e3;
                e.printStackTrace();
                return l51Var;
            }
        }
        return l51Var;
    }
}

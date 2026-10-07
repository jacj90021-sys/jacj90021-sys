package com.cmaster.cloner;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class q43 {
    public static final Object OooO00o(long j, nr0 nr0Var, e31 e31Var) throws Throwable {
        long jConvert;
        Object rfVar;
        Object objOooo0;
        int i = vt.OooO0o;
        int i2 = 0;
        boolean z = j > 0;
        if (z) {
            xt xtVar = xt.NANOSECONDS;
            long jOooO0O0 = oq2.OooO0O0(999999L, xtVar);
            if (vt.OooO0O0(j)) {
                if (vt.OooO0O0(jOooO0O0) && (jOooO0O0 ^ j) < 0) {
                    ra.OooOOO("Summing infinite durations of different signs yields an undefined result.");
                    return null;
                }
            } else if (vt.OooO0O0(jOooO0O0)) {
                j = jOooO0O0;
            } else {
                int i3 = ((int) j) & 1;
                if (i3 == (((int) jOooO0O0) & 1)) {
                    long j2 = (j >> 1) + (jOooO0O0 >> 1);
                    if (i3 == 0) {
                        if (-4611686018426999999L > j2 || j2 >= 4611686018427000000L) {
                            j = oq2.OooO00o(j2 / 1000000);
                        } else {
                            j = j2 << 1;
                            int i4 = wt.OooO00o;
                        }
                    } else if (-4611686018426L > j2 || j2 >= 4611686018427L) {
                        j = oq2.OooO00o(hy2.OooO00o(j2));
                    } else {
                        j = (j2 * 1000000) << 1;
                        int i5 = wt.OooO00o;
                    }
                } else {
                    j = i3 == 1 ? vt.OooO00o(j >> 1, jOooO0O0 >> 1) : vt.OooO00o(jOooO0O0 >> 1, j >> 1);
                }
            }
            int i6 = ((int) j) & 1;
            if (i6 == 1 && !vt.OooO0O0(j)) {
                jConvert = j >> 1;
            } else if (j == vt.OooO0Oo) {
                jConvert = Long.MAX_VALUE;
            } else if (j == vt.OooO0o0) {
                jConvert = Long.MIN_VALUE;
            } else {
                long j3 = j >> 1;
                if (i6 != 0) {
                    xtVar = xt.MILLISECONDS;
                }
                jConvert = TimeUnit.MILLISECONDS.convert(j3, xtVar.OooO0Oo);
            }
        } else {
            if (z) {
                throw new tf();
            }
            jConvert = 0;
        }
        if (jConvert <= 0) {
            throw new fn1("Timed out immediately", null);
        }
        gn1 gn1Var = new gn1(jConvert, e31Var);
        vj vjVar = gn1Var.OooO0oO.OooO0o0;
        vjVar.getClass();
        tj tjVarOooO0oo = vjVar.OooO0oo(oOO0OO.OooO0o0);
        ip ipVar = tjVarOooO0oo instanceof ip ? (ip) tjVarOooO0oo : null;
        if (ipVar == null) {
            ipVar = co.OooO00o;
        }
        ou2.OooO0O0(gn1Var, false, new ms(ipVar.OooO0OO(gn1Var.OooO0oo, gn1Var, gn1Var.OooO0o), i2), 3);
        try {
            zp1.OooO00o(nr0Var);
            rfVar = nr0Var.OooO0oO(gn1Var, gn1Var);
        } catch (Throwable th) {
            rfVar = new rf(false, th);
        }
        Object obj = gk.OooO0Oo;
        if (rfVar == obj || (objOooo0 = gn1Var.Oooo0(rfVar)) == j62.OooO0O0) {
            return obj;
        }
        if (objOooo0 instanceof rf) {
            Throwable th2 = ((rf) objOooo0).OooO00o;
            if (!(th2 instanceof fn1) || ((fn1) th2).OooO0Oo != gn1Var) {
                throw th2;
            }
            if (rfVar instanceof rf) {
                throw ((rf) rfVar).OooO00o;
            }
        } else {
            rfVar = j62.OooO00o(objOooo0);
        }
        return rfVar;
    }
}

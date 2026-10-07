package com.cmaster.cloner;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a22 implements zy0 {
    public final h60 OooO0Oo;
    public final oOO0O0 OooO0o;
    public final int OooO0o0;
    public final long OooO0oO;
    public final long OooO0oo;

    public a22(h60 h60Var, int i, oOO0O0 ooo0o0, long j, long j2) {
        this.OooO0Oo = h60Var;
        this.OooO0o0 = i;
        this.OooO0o = ooo0o0;
        this.OooO0oO = j;
        this.OooO0oo = j2;
    }

    public static hh OooO00o(s12 s12Var, m6 m6Var, int i) {
        hh telemetryConfiguration = m6Var.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.OooO0o0) {
            return null;
        }
        int[] iArr = telemetryConfiguration.OooO0oO;
        int i2 = 0;
        if (iArr != null) {
            while (i2 < iArr.length) {
                if (iArr[i2] != i) {
                    i2++;
                }
            }
            return null;
        }
        int[] iArr2 = telemetryConfiguration.OooO;
        if (iArr2 != null) {
            while (i2 < iArr2.length) {
                if (iArr2[i2] == i) {
                    return null;
                }
                i2++;
            }
        }
        if (s12Var.OooOOOO < telemetryConfiguration.OooO0oo) {
            return telemetryConfiguration;
        }
        return null;
    }

    @Override // com.cmaster.cloner.zy0
    public final void onComplete(xl1 xl1Var) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        if (this.OooO0Oo.OooO00o()) {
            yb1 yb1Var = (yb1) xb1.OooOooO().OooO0o0;
            if (yb1Var == null || yb1Var.OooO0o0) {
                s12 s12Var = (s12) this.OooO0Oo.OooOOO0.get(this.OooO0o);
                if (s12Var != null) {
                    Object obj = s12Var.OooO0o0;
                    if (obj instanceof m6) {
                        m6 m6Var = (m6) obj;
                        int i5 = 0;
                        boolean z = this.OooO0oO > 0;
                        int gCoreServiceId = m6Var.getGCoreServiceId();
                        int i6 = 100;
                        if (yb1Var != null) {
                            z &= yb1Var.OooO0o;
                            int i7 = yb1Var.OooO0oO;
                            int i8 = yb1Var.OooO0oo;
                            i = yb1Var.OooO0Oo;
                            if (m6Var.hasConnectionInfo() && !m6Var.isConnecting()) {
                                hh hhVarOooO00o = OooO00o(s12Var, m6Var, this.OooO0o0);
                                if (hhVarOooO00o == null) {
                                    return;
                                }
                                boolean z2 = hhVarOooO00o.OooO0o && this.OooO0oO > 0;
                                i8 = hhVarOooO00o.OooO0oo;
                                z = z2;
                            }
                            i3 = i7;
                            i2 = i8;
                        } else {
                            i = 0;
                            i2 = 100;
                            i3 = 5000;
                        }
                        h60 h60Var = this.OooO0Oo;
                        int iElapsedRealtime = -1;
                        if (xl1Var.OooO0o()) {
                            i4 = 0;
                        } else if (((ac3) xl1Var).OooO0Oo) {
                            i5 = i6;
                            i4 = -1;
                        } else {
                            Exception excOooO0OO = xl1Var.OooO0OO();
                            if (excOooO0OO instanceof oOO00) {
                                Status status = ((oOO00) excOooO0OO).OooO0Oo;
                                i6 = status.OooO0Oo;
                                gh ghVar = status.OooO0oO;
                                if (ghVar != null) {
                                    i4 = ghVar.OooO0o0;
                                    i5 = i6;
                                }
                                i5 = i6;
                                i4 = -1;
                            } else {
                                i5 = 101;
                                i4 = -1;
                            }
                        }
                        if (z) {
                            long j3 = this.OooO0oO;
                            long j4 = this.OooO0oo;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j4);
                            j2 = jCurrentTimeMillis;
                            j = j3;
                        } else {
                            j = 0;
                            j2 = 0;
                        }
                        b22 b22Var = new b22(new wt0(this.OooO0o0, i5, i4, j, j2, null, null, gCoreServiceId, iElapsedRealtime), i, i3, i2);
                        xi1 xi1Var = h60Var.OooOOOo;
                        xi1Var.sendMessage(xi1Var.obtainMessage(18, b22Var));
                    }
                }
            }
        }
    }
}

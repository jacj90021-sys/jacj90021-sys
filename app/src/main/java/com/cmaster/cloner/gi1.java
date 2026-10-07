package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class gi1 {
    public double OooO;
    public double OooO00o;
    public double OooO0O0;
    public boolean OooO0OO;
    public double OooO0Oo;
    public double OooO0o;
    public double OooO0o0;
    public double OooO0oO;
    public double OooO0oo;
    public final zt OooOO0;

    public gi1() {
        this.OooO00o = Math.sqrt(1500.0d);
        this.OooO0O0 = 0.5d;
        this.OooO0OO = false;
        this.OooO = Double.MAX_VALUE;
        this.OooOO0 = new zt();
    }

    public final void OooO00o(float f) {
        if (f < 0.0f) {
            ra.OooOOO("Damping ratio must be non-negative");
        } else {
            this.OooO0O0 = f;
            this.OooO0OO = false;
        }
    }

    public final void OooO0O0(float f) {
        if (f <= 0.0f) {
            ra.OooOOO("Spring stiffness constant must be positive.");
        } else {
            this.OooO00o = Math.sqrt(f);
            this.OooO0OO = false;
        }
    }

    public final zt OooO0OO(double d, double d2, long j) {
        double dSin;
        double dCos;
        if (!this.OooO0OO) {
            if (this.OooO == Double.MAX_VALUE) {
                qa.OooO0o("Error: Final position of the spring must be set before the animation starts");
                return null;
            }
            double d3 = this.OooO0O0;
            if (d3 > 1.0d) {
                double d4 = this.OooO00o;
                this.OooO0o = (Math.sqrt((d3 * d3) - 1.0d) * d4) + ((-d3) * d4);
                double d5 = this.OooO0O0;
                double d6 = this.OooO00o;
                this.OooO0oO = ((-d5) * d6) - (Math.sqrt((d5 * d5) - 1.0d) * d6);
            } else if (d3 >= 0.0d && d3 < 1.0d) {
                this.OooO0oo = Math.sqrt(1.0d - (d3 * d3)) * this.OooO00o;
            }
            this.OooO0OO = true;
        }
        double d7 = j / 1000.0d;
        double d8 = d - this.OooO;
        double d9 = this.OooO0O0;
        if (d9 > 1.0d) {
            double d10 = this.OooO0oO;
            double d11 = ((d10 * d8) - d2) / (d10 - this.OooO0o);
            double d12 = d8 - d11;
            dSin = (Math.pow(2.718281828459045d, this.OooO0o * d7) * d11) + (Math.pow(2.718281828459045d, d10 * d7) * d12);
            double d13 = this.OooO0oO;
            double dPow = Math.pow(2.718281828459045d, d13 * d7) * d12 * d13;
            double d14 = this.OooO0o;
            dCos = (Math.pow(2.718281828459045d, d14 * d7) * d11 * d14) + dPow;
        } else if (d9 == 1.0d) {
            double d15 = this.OooO00o;
            double d16 = (d15 * d8) + d2;
            double d17 = (d16 * d7) + d8;
            double dPow2 = Math.pow(2.718281828459045d, (-d15) * d7) * d17;
            double dPow3 = Math.pow(2.718281828459045d, (-this.OooO00o) * d7) * d17;
            double d18 = -this.OooO00o;
            dCos = (Math.pow(2.718281828459045d, d18 * d7) * d16) + (dPow3 * d18);
            dSin = dPow2;
        } else {
            double d19 = 1.0d / this.OooO0oo;
            double d20 = this.OooO00o;
            double d21 = ((d9 * d20 * d8) + d2) * d19;
            dSin = ((Math.sin(this.OooO0oo * d7) * d21) + (Math.cos(this.OooO0oo * d7) * d8)) * Math.pow(2.718281828459045d, (-d9) * d20 * d7);
            double d22 = this.OooO00o;
            double d23 = this.OooO0O0;
            double d24 = (-d22) * dSin * d23;
            double dPow4 = Math.pow(2.718281828459045d, (-d23) * d22 * d7);
            double d25 = this.OooO0oo;
            double dSin2 = Math.sin(d25 * d7) * (-d25) * d8;
            double d26 = this.OooO0oo;
            dCos = (((Math.cos(d26 * d7) * d21 * d26) + dSin2) * dPow4) + d24;
        }
        float f = (float) (dSin + this.OooO);
        zt ztVar = this.OooOO0;
        ztVar.OooO00o = f;
        ztVar.OooO0O0 = (float) dCos;
        return ztVar;
    }

    public gi1(float f) {
        this.OooO00o = Math.sqrt(1500.0d);
        this.OooO0O0 = 0.5d;
        this.OooO0OO = false;
        this.OooOO0 = new zt();
        this.OooO = f;
    }
}

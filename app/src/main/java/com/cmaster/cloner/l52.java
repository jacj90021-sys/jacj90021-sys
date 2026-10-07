package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class l52 implements xr1 {
    public final /* synthetic */ int OooO00o;
    public boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public jz OooO0Oo;
    public final ay0 OooO0o0;

    public /* synthetic */ l52(ay0 ay0Var, int i) {
        this.OooO00o = i;
        this.OooO0o0 = ay0Var;
    }

    @Override // com.cmaster.cloner.xr1
    public final xr1 OooO0OO(String str) {
        int i = this.OooO00o;
        ay0 ay0Var = this.OooO0o0;
        switch (i) {
            case 0:
                if (this.OooO0O0) {
                    throw new ew("Cannot encode a second value in the ValueEncoderContext");
                }
                this.OooO0O0 = true;
                ((u42) ay0Var).OooO0OO(this.OooO0Oo, str, this.OooO0OO);
                return this;
            default:
                if (this.OooO0O0) {
                    throw new ew("Cannot encode a second value in the ValueEncoderContext");
                }
                this.OooO0O0 = true;
                ((pk2) ay0Var).OooO0OO(this.OooO0Oo, str, this.OooO0OO);
                return this;
        }
    }

    @Override // com.cmaster.cloner.xr1
    public final xr1 OooO0Oo(boolean z) {
        int i = this.OooO00o;
        ay0 ay0Var = this.OooO0o0;
        switch (i) {
            case 0:
                if (this.OooO0O0) {
                    throw new ew("Cannot encode a second value in the ValueEncoderContext");
                }
                this.OooO0O0 = true;
                ((u42) ay0Var).OooO0Oo(this.OooO0Oo, z ? 1 : 0, this.OooO0OO);
                return this;
            default:
                if (this.OooO0O0) {
                    throw new ew("Cannot encode a second value in the ValueEncoderContext");
                }
                this.OooO0O0 = true;
                ((pk2) ay0Var).OooO0Oo(this.OooO0Oo, z ? 1 : 0, this.OooO0OO);
                return this;
        }
    }
}

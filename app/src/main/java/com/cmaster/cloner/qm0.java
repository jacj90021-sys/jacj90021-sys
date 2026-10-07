package com.cmaster.cloner;

import android.view.View;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class qm0 {
    public pu OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public boolean OooO0Oo;
    public boolean OooO0o0;

    public qm0() {
        OooO0OO();
    }

    public final void OooO00o() {
        boolean z = this.OooO0Oo;
        pu puVar = this.OooO00o;
        this.OooO0OO = z ? puVar.OooO() : puVar.OooOOO0();
    }

    public final void OooO0O0(View view, int i) {
        pu puVar = this.OooO00o;
        int iOooOOO = Integer.MIN_VALUE == puVar.OooO00o ? 0 : puVar.OooOOO() - puVar.OooO00o;
        if (iOooOOO >= 0) {
            boolean z = this.OooO0Oo;
            pu puVar2 = this.OooO00o;
            if (z) {
                int iOooO0Oo = puVar2.OooO0Oo(view);
                pu puVar3 = this.OooO00o;
                this.OooO0OO = (Integer.MIN_VALUE != puVar3.OooO00o ? puVar3.OooOOO() - puVar3.OooO00o : 0) + iOooO0Oo;
            } else {
                this.OooO0OO = puVar2.OooO0oO(view);
            }
            this.OooO0O0 = i;
            return;
        }
        this.OooO0O0 = i;
        boolean z2 = this.OooO0Oo;
        pu puVar4 = this.OooO00o;
        if (!z2) {
            int iOooO0oO = puVar4.OooO0oO(view);
            int iOooOOO0 = iOooO0oO - this.OooO00o.OooOOO0();
            this.OooO0OO = iOooO0oO;
            if (iOooOOO0 > 0) {
                int iOooO = (this.OooO00o.OooO() - Math.min(0, (this.OooO00o.OooO() - iOooOOO) - this.OooO00o.OooO0Oo(view))) - (this.OooO00o.OooO0o0(view) + iOooO0oO);
                if (iOooO < 0) {
                    this.OooO0OO -= Math.min(iOooOOO0, -iOooO);
                    return;
                }
                return;
            }
            return;
        }
        int iOooO2 = (puVar4.OooO() - iOooOOO) - this.OooO00o.OooO0Oo(view);
        this.OooO0OO = this.OooO00o.OooO() - iOooO2;
        if (iOooO2 > 0) {
            int iOooO0o0 = this.OooO0OO - this.OooO00o.OooO0o0(view);
            int iOooOOO02 = this.OooO00o.OooOOO0();
            int iMin = iOooO0o0 - (Math.min(this.OooO00o.OooO0oO(view) - iOooOOO02, 0) + iOooOOO02);
            if (iMin < 0) {
                this.OooO0OO = Math.min(iOooO2, -iMin) + this.OooO0OO;
            }
        }
    }

    public final void OooO0OO() {
        this.OooO0O0 = -1;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = false;
        this.OooO0o0 = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.OooO0O0 + ", mCoordinate=" + this.OooO0OO + ", mLayoutFromEnd=" + this.OooO0Oo + ", mValid=" + this.OooO0o0 + '}';
    }
}

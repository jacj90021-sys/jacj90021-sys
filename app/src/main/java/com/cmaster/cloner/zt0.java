package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class zt0 extends he1 {
    public static final p12 OooOO0 = new p12(5);
    public int OooO;
    public final ArrayList OooO0o;
    public final HashMap OooO0oO;
    public final yt0 OooO0oo;

    public zt0(String str, nq nqVar, int i, yt0 yt0Var) {
        super(str, nqVar, i);
        this.OooO0o = new ArrayList(100);
        this.OooO0oO = new HashMap(100);
        this.OooO0oo = yt0Var;
        this.OooO = -1;
    }

    @Override // com.cmaster.cloner.he1
    public final int OooO00o(pj0 pj0Var) {
        return ((ky0) pj0Var).OooO0o();
    }

    @Override // com.cmaster.cloner.he1
    public final Collection OooO0Oo() {
        return this.OooO0o;
    }

    @Override // com.cmaster.cloner.he1
    public final void OooO0o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0o;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((ky0) arrayList.get(i)).OooO00o(this.OooO0O0);
                i++;
            }
        }
    }

    @Override // com.cmaster.cloner.he1
    public final int OooOO0() {
        OooO0oO();
        return this.OooO;
    }

    @Override // com.cmaster.cloner.he1
    public final void OooOO0o(q9 q9Var) {
        boolean zOooO0Oo = q9Var.OooO0Oo();
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        boolean z = true;
        int iOooO0OO = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ky0 ky0Var = (ky0) obj;
            if (zOooO0Oo) {
                if (z) {
                    z = false;
                } else {
                    q9Var.OooO0O0(0, "\n");
                }
            }
            int i2 = ky0Var.OooO0Oo - 1;
            int i3 = (~i2) & (iOooO0OO + i2);
            if (iOooO0OO != i3) {
                q9Var.OooOOOO(i3 - iOooO0OO);
                iOooO0OO = i3;
            }
            ky0Var.OooO0Oo(this.OooO0O0, q9Var);
            iOooO0OO += ky0Var.OooO0OO();
        }
        if (iOooO0OO == this.OooO) {
            return;
        }
        ra.OooOOO0(u7.OooO00o(new byte[]{-36, 116, -80, -1, 47, -65, -96, -115, -38, 123, -95, -81, 55, -94, -13, -109, -46, 117, -89, -25}, new byte[]{-77, 1, -60, -113, 90, -53, -128, -2}));
    }

    public final synchronized ky0 OooOOO(ky0 ky0Var) {
        OooO0oo();
        ky0 ky0Var2 = (ky0) this.OooO0oO.get(ky0Var);
        if (ky0Var2 != null) {
            return ky0Var2;
        }
        OooOOO0(ky0Var);
        this.OooO0oO.put(ky0Var, ky0Var);
        return ky0Var;
    }

    public final void OooOOO0(ky0 ky0Var) {
        OooO0oo();
        try {
            if (ky0Var.OooO0Oo > this.OooO0OO) {
                throw new IllegalArgumentException(u7.OooO00o(new byte[]{-85, 24, -53, 19, 4, -72, -91, -45, -85, 20, -60, 25, 73, -95, -80, -62, -81, 86, -55, 16, 0, -81, -86, -54, -89, 24, -36}, new byte[]{-62, 118, -88, 124, 105, -56, -60, -89}));
            }
            this.OooO0o.add(ky0Var);
        } catch (NullPointerException unused) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-10, -70, -95, 117, -72, 63, -30, -20, -15, -69, -88, 116}, new byte[]{-97, -50, -60, 24, -104, 2, -33, -52}));
        }
    }

    public final void OooOOOO() {
        OooO0oO();
        int iOrdinal = this.OooO0oo.ordinal();
        ArrayList arrayList = this.OooO0o;
        if (iOrdinal == 1) {
            Collections.sort(arrayList, OooOO0);
        } else if (iOrdinal == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iOooO0OO = 0;
        for (int i = 0; i < size; i++) {
            ky0 ky0Var = (ky0) arrayList.get(i);
            try {
                int iOooO0oo = ky0Var.OooO0oo(this, iOooO0OO);
                if (iOooO0oo < iOooO0OO) {
                    throw new RuntimeException(u7.OooO00o(new byte[]{-95, 74, 8, 15, 48, 14, -90, 53, -94, 70, 10, 82, 106, 14, -92, 60, -80, 80, 3, 14, 99, 72, -71, 43, -29}, new byte[]{-61, 37, 111, 122, 67, 46, -42, 89}) + ky0Var);
                }
                iOooO0OO = ky0Var.OooO0OO() + iOooO0oo;
            } catch (RuntimeException e) {
                throw dx.OooO0O0(u7.OooO00o(new byte[]{-34, 24, 101, -72, -29, -76, 22, 18, -48, 70, 39, -82, -24, -76, 20, 16, -48}, new byte[]{-16, 54, 75, -49, -117, -35, 122, 119}) + ky0Var, e);
            }
        }
        this.OooO = iOooO0OO;
    }
}

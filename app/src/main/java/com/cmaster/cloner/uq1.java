package com.cmaster.cloner;

import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class uq1 extends ky0 {
    public final ArrayList OooO;
    public final wj0 OooO0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public uq1(wj0 wj0Var, ArrayList arrayList) {
        int iOooOO0o = OooOO0o(arrayList);
        ky0 ky0Var = (ky0) arrayList.get(0);
        super(iOooOO0o, OooOO0o(arrayList) + (ky0Var.OooO0OO() * arrayList.size()));
        if (wj0Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{17, 100, 126, 7, -61, 96, 122, 113, 88, 45, 38, 74, -7, 108, 102, 120}, new byte[]{120, 16, 27, 106, -105, 25, 10, 20}));
            throw null;
        }
        this.OooO = arrayList;
        this.OooO0oo = wj0Var;
    }

    public static int OooOO0o(ArrayList arrayList) {
        try {
            return Math.max(4, ((ky0) arrayList.get(0)).OooO0Oo);
        } catch (IndexOutOfBoundsException unused) {
            ra.OooOOO(u7.OooO00o(new byte[]{-99, 84, 119, -39, -94, 107, 87, -75, -114, 69, 58, -99, -15, 120, 25, -4, -60}, new byte[]{-12, 32, 18, -76, -47, 69, 36, -36}));
            return 0;
        } catch (NullPointerException unused2) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-52, -37, -63, 84, 93, 83, -3, -19, -123, -63, -47, 85, 66}, new byte[]{-91, -81, -92, 57, 46, 115, -64, -48}));
            return 0;
        }
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooO(zt0 zt0Var, int i) {
        int iOooO0oo = i + this.OooO0Oo;
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ky0 ky0Var = (ky0) obj;
            int iOooO0OO = ky0Var.OooO0OO();
            int i5 = ky0Var.OooO0Oo;
            if (z) {
                z = false;
                i2 = iOooO0OO;
                i3 = i5;
            } else if (iOooO0OO != i2) {
                sa.OooO0oO(u7.OooO00o(new byte[]{27, -11, 22, 124, -11, -48, -80, -66, 23, -95, 30, 120, -90, -50, -72, -80, 17, -23}, new byte[]{114, -127, 115, 17, -43, -93, -39, -60}));
                return;
            } else if (i5 != i3) {
                sa.OooO0oO(u7.OooO00o(new byte[]{-109, 88, -106, -86, 69, 9, 19, -29, -99, 66, -98, -94, 11, 28, 95, -25, -109, 95, -98, -90, 17, 11, 23}, new byte[]{-6, 44, -13, -57, 101, 104, 127, -118}));
                return;
            }
            iOooO0oo = ky0Var.OooO0oo(zt0Var, iOooO0oo) + iOooO0OO;
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ky0) obj).OooO00o(nqVar);
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return this.OooO0oo;
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        ArrayList arrayList = this.OooO;
        int size = arrayList.size();
        int i = 0;
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0O0(0, OooO0oO() + " " + this.OooO0oo.OooO0o);
            rj.OooOO0O(size, u7.OooO00o(new byte[]{-20, 113, -78, -91, -94, -85, -1, 11}, new byte[]{-52, 81, -63, -52, -40, -50, -59, 43}), q9Var, 4);
        }
        q9Var.OooOO0O(size);
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            ((ky0) obj).OooO0Oo(nqVar, q9Var);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(uq1.class.getName());
        sb.append(this.OooO);
        return sb.toString();
    }
}

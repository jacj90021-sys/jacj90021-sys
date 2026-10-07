package com.cmaster.cloner;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class jl extends il {
    public final p51 OooO0o;
    public p51 OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jl(com.cmaster.cloner.nl r7, com.cmaster.cloner.kl r8) {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.jl.<init>(com.cmaster.cloner.nl, com.cmaster.cloner.kl):void");
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        il ilVar = (il) ohVar;
        int iCompareTo = this.OooO0Oo.compareTo(ilVar.OooO0Oo);
        if (iCompareTo == 0) {
            iCompareTo = this.OooO0o0.OooO0Oo.compareTo(ilVar.OooO0o0.OooO0Oo);
        }
        return iCompareTo != 0 ? iCompareTo : this.OooO0o.compareTo(((jl) ohVar).OooO0o);
    }

    public final int OooO0o(boolean z) {
        p51 p51Var = this.OooO0o;
        if (!z) {
            if (this.OooO0oO == null) {
                vp1 vp1Var = this.OooO0Oo.OooO0Oo;
                p51Var.getClass();
                String str = u7.OooO00o(new byte[]{-21}, new byte[]{-61, -94, 34, 115, 8, -10, -45, -96}) + vp1Var.OooO0Oo + p51Var.OooO0Oo.substring(1);
                Object[] objArr = p51Var.OooO0o.OooO0o0;
                int length = objArr.length;
                bj1 bj1Var = new bj1(length + 1);
                bj1Var.OooO0o(0, vp1Var);
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    bj1Var.OooO0o(i2, objArr[i]);
                    i = i2;
                }
                bj1Var.OooO0Oo = false;
                p51 p51Var2 = new p51(str, p51Var.OooO0o0, bj1Var);
                p51 p51Var3 = (p51) p51.OooO0oo.putIfAbsent(str, p51Var2);
                if (p51Var3 != null) {
                    p51Var2 = p51Var3;
                }
                this.OooO0oO = p51Var2;
            }
            p51Var = this.OooO0oO;
        }
        bj1 bj1Var2 = p51Var.OooO0o;
        int length2 = bj1Var2.OooO0o0.length;
        int iOooO0Oo = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            iOooO0Oo += ((vp1) bj1Var2.OooO0o0(i3)).OooO0Oo();
        }
        return iOooO0Oo;
    }

    @Override // com.cmaster.cloner.oh
    public final String OooO0o0() {
        return u7.OooO00o(new byte[]{11, 95, -79, 17, 47, 17}, new byte[]{102, 58, -59, 121, 64, 117, -114, -45});
    }

    @Override // com.cmaster.cloner.wp1
    public final vp1 getType() {
        return this.OooO0o.OooO0o0;
    }
}

package com.cmaster.cloner;

import com.google.android.gms.internal.ads.zzbcj;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nl extends eq1 {
    public static final nl OooO;
    public static final ConcurrentHashMap OooO0o = new ConcurrentHashMap(zzbcj.zzq.zzf, 0.75f);
    public static final nl OooO0oO;
    public static final nl OooO0oo;
    public final vp1 OooO0Oo;
    public ml OooO0o0;

    static {
        nl nlVar = new nl(vp1.OooOo);
        OooO0oO = nlVar;
        nl nlVar2 = new nl(vp1.OooOoOO);
        nl nlVar3 = new nl(vp1.OooOoo0);
        nl nlVar4 = new nl(vp1.OooOoo);
        nl nlVar5 = new nl(vp1.OooOooO);
        nl nlVar6 = new nl(vp1.OooOooo);
        nl nlVar7 = new nl(vp1.Oooo00O);
        nl nlVar8 = new nl(vp1.Oooo000);
        nl nlVar9 = new nl(vp1.Oooo00o);
        nl nlVar10 = new nl(vp1.Oooo0);
        nl nlVar11 = new nl(vp1.Oooo0O0);
        nl nlVar12 = new nl(vp1.Oooo0OO);
        nl nlVar13 = new nl(vp1.Oooo0o0);
        nl nlVar14 = new nl(vp1.Oooo0o);
        nl nlVar15 = new nl(vp1.Oooo0oO);
        nl nlVar16 = new nl(vp1.Oooo);
        nl nlVar17 = new nl(vp1.Oooo0oo);
        nl nlVar18 = new nl(vp1.OoooO0);
        nl nlVar19 = new nl(vp1.OooOo0O);
        OooO0oo = nlVar19;
        OooO = new nl(vp1.OooOo0o);
        OooO0oO(nlVar);
        OooO0oO(nlVar2);
        OooO0oO(nlVar3);
        OooO0oO(nlVar4);
        OooO0oO(nlVar5);
        OooO0oO(nlVar6);
        OooO0oO(nlVar7);
        OooO0oO(nlVar8);
        OooO0oO(nlVar9);
        OooO0oO(nlVar10);
        OooO0oO(nlVar11);
        OooO0oO(nlVar12);
        OooO0oO(nlVar13);
        OooO0oO(nlVar14);
        OooO0oO(nlVar15);
        OooO0oO(nlVar16);
        OooO0oO(nlVar17);
        OooO0oO(nlVar18);
        OooO0oO(nlVar19);
    }

    public nl(vp1 vp1Var) {
        if (vp1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{66, -103, 39, -38, 97, -108, -126, 35, 88, -107, 59, -45}, new byte[]{54, -32, 87, -65, 65, -87, -65, 3}));
            throw null;
        }
        if (vp1Var == vp1.OooOOoo) {
            sa.OooO0oO(u7.OooO00o(new byte[]{0, -3, -108, -97, 84, -93, 22, 51, 7, -1, -5, -95, 105, -36, 54, 9, 63, -109, -87, -83, 106, -114, 61, 21, 46, -35, -81, -87, 120, -112, 61}, new byte[]{75, -77, -37, -56, 26, -4, 88, 102}));
            throw null;
        }
        this.OooO0Oo = vp1Var;
        this.OooO0o0 = null;
    }

    public static void OooO0oO(nl nlVar) {
        if (OooO0o.putIfAbsent(nlVar.OooO0Oo, nlVar) == null) {
            return;
        }
        qa.OooO0OO(u7.OooO00o(new byte[]{-15, -42, 24, 96, -105, -11, -56, -115, -44, -126, 30, 96, -41, -20, -46, -127, -60, -126, 3, 99, -38}, new byte[]{-80, -94, 108, 5, -6, -123, -68, -24}), nlVar);
    }

    @Override // com.cmaster.cloner.ln1
    public final String OooO00o() {
        return this.OooO0Oo.OooO00o();
    }

    @Override // com.cmaster.cloner.oh
    public final int OooO0Oo(oh ohVar) {
        return this.OooO0Oo.OooO0Oo.compareTo(((nl) ohVar).OooO0Oo.OooO0Oo);
    }

    public final ml OooO0o() {
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new ml(this.OooO0Oo.OooO0Oo);
        }
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.oh
    public final String OooO0o0() {
        return u7.OooO00o(new byte[]{-46, 13, 60, -23}, new byte[]{-90, 116, 76, -116, -77, -113, -40, -8});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nl) {
            return this.OooO0Oo == ((nl) obj).OooO0Oo;
        }
        return false;
    }

    @Override // com.cmaster.cloner.wp1
    public final vp1 getType() {
        return vp1.OooOo0;
    }

    public final int hashCode() {
        return this.OooO0Oo.OooO0Oo.hashCode();
    }

    public final String toString() {
        return u7.OooO00o(new byte[]{-106, 103, 119, 31, -1}, new byte[]{-30, 30, 7, 122, -124, 74, 90, 49}) + this.OooO0Oo.OooO00o() + '}';
    }
}

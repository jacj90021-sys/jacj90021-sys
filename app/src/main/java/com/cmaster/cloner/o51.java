package com.cmaster.cloner;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o51 extends tq1 {
    public final /* synthetic */ int OooO0o;
    public final Object OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(nq nqVar, int i) {
        super(u7.OooO00o(new byte[]{-66, -59, 4, 45, -21, 113, -73, -125, -67}, new byte[]{-50, -73, 107, 89, -124, 46, -34, -25}), nqVar, 4);
        this.OooO0o = i;
        switch (i) {
            case 1:
                super(u7.OooO00o(new byte[]{-16, 94, 121, 43, 108, -57, 38, -12, -25, 89}, new byte[]{-125, 42, 11, 66, 2, -96, 121, -99}), nqVar, 4);
                this.OooO0oO = new TreeMap();
                break;
            case 2:
                super(u7.OooO00o(new byte[]{76, 71, 123, 97, -34, 100, 93, -86}, new byte[]{56, 62, 11, 4, -127, 13, 57, -39}), nqVar, 4);
                this.OooO0oO = new TreeMap();
                break;
            case 3:
                super(null, nqVar, 4);
                l70 l70Var = new l70();
                l70Var.OooO0oO(0);
                this.OooO0oO = Collections.singletonList(l70Var);
                break;
            default:
                this.OooO0oO = new TreeMap();
                break;
        }
    }

    private final void OooOo00() {
    }

    @Override // com.cmaster.cloner.he1
    public final Collection OooO0Oo() {
        switch (this.OooO0o) {
            case 0:
                return ((TreeMap) this.OooO0oO).values();
            case 1:
                return ((TreeMap) this.OooO0oO).values();
            case 2:
                return ((TreeMap) this.OooO0oO).values();
            default:
                return (List) this.OooO0oO;
        }
    }

    public int OooOOO(ml mlVar) {
        if (mlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-40, -42, 54, 51, 126, 37, 79, 28, -106, -126, 42, 47, 124, 46}, new byte[]{-85, -94, 68, 90, 16, 66, 111, 33}));
            return 0;
        }
        OooO0oO();
        mj1 mj1Var = (mj1) ((TreeMap) this.OooO0oO).get(mlVar);
        if (mj1Var != null) {
            return mj1Var.OooO0o0();
        }
        ra.OooOOO(u7.OooO00o(new byte[]{-88, 15, 112, 112, -6, -80, 112, 65, -94}, new byte[]{-58, 96, 4, 80, -100, -33, 5, 47}));
        return 0;
    }

    @Override // com.cmaster.cloner.tq1
    public final void OooOOO0() {
        int i = this.OooO0o;
        Object obj = this.OooO0oO;
        int i2 = 0;
        switch (i) {
            case 0:
                Iterator it = ((TreeMap) obj).values().iterator();
                while (it.hasNext()) {
                    ((n51) it.next()).OooO0oO(i2);
                    i2++;
                }
                break;
            case 1:
                Iterator it2 = ((TreeMap) obj).values().iterator();
                while (it2.hasNext()) {
                    ((mj1) it2.next()).OooO0oO(i2);
                    i2++;
                }
                break;
            case 2:
                Iterator it3 = ((TreeMap) obj).values().iterator();
                while (it3.hasNext()) {
                    ((yp1) it3.next()).OooO0oO(i2);
                    i2++;
                }
                break;
        }
    }

    public int OooOOOO(nl nlVar) {
        if (nlVar != null) {
            return OooOOOo(nlVar.OooO0Oo);
        }
        qa.OooOOO0(u7.OooO00o(new byte[]{-68, -108, -120, -127, -68, -105, 43, -70, -90, -104, -108, -120}, new byte[]{-56, -19, -8, -28, -100, -86, 22, -102}));
        return 0;
    }

    public int OooOOOo(vp1 vp1Var) {
        if (vp1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-98, -60, 48, 88, 23, 75, -35, -34, -124, -56, 44, 81}, new byte[]{-22, -67, 64, 61, 55, 118, -32, -2}));
            return 0;
        }
        OooO0oO();
        yp1 yp1Var = (yp1) ((TreeMap) this.OooO0oO).get(vp1Var);
        if (yp1Var != null) {
            return yp1Var.OooO0o0();
        }
        ra.OooO0OO(u7.OooO00o(new byte[]{40, -7, -115, 81, 31, -54, 55, 69, 34, -84, -39}, new byte[]{70, -106, -7, 113, 121, -91, 66, 43}), vp1Var);
        return 0;
    }

    public synchronized void OooOOo(nl nlVar) {
        if (nlVar == null) {
            throw new NullPointerException(u7.OooO00o(new byte[]{95, -127, 13, 64, -102, 103, 29, 51, 69, -115, 17, 73}, new byte[]{43, -8, 125, 37, -70, 90, 32, 19}));
        }
        OooO0oo();
        vp1 vp1Var = nlVar.OooO0Oo;
        if (((yp1) ((TreeMap) this.OooO0oO).get(vp1Var)) == null) {
            ((TreeMap) this.OooO0oO).put(vp1Var, new yp1(nlVar));
        }
    }

    public void OooOOo0(ml mlVar) {
        mj1 mj1Var = new mj1(mlVar);
        synchronized (this) {
            OooO0oo();
            if (((mj1) ((TreeMap) this.OooO0oO).get(mlVar)) != null) {
                return;
            }
            ((TreeMap) this.OooO0oO).put(mlVar, mj1Var);
        }
    }

    public synchronized void OooOOoo(vp1 vp1Var) {
        if (vp1Var == null) {
            throw new NullPointerException(u7.OooO00o(new byte[]{-6, -70, -6, -4, -63, 69, 38, 33, -32, -74, -26, -11}, new byte[]{-114, -61, -118, -103, -31, 120, 27, 1}));
        }
        OooO0oo();
        if (((yp1) ((TreeMap) this.OooO0oO).get(vp1Var)) == null) {
            ((TreeMap) this.OooO0oO).put(vp1Var, new yp1(new nl(vp1Var)));
        }
    }
}

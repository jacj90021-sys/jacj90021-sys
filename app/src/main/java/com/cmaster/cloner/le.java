package com.cmaster.cloner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class le extends ky0 {
    public final ho1 OooO;
    public final jl OooO0oo;
    public xb OooOO0;
    public final boolean OooOO0O;
    public final aq1 OooOO0o;

    public le(jl jlVar, ho1 ho1Var, boolean z, aq1 aq1Var) {
        super(4, -1);
        if (jlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{92, 3, -65, 41, -68, -118, 4, 62, 91, 10, -75}, new byte[]{46, 102, -39, 9, -127, -73, 36, 80}));
            throw null;
        }
        if (ho1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{49, -98, -22, 81, -106, -42, 104, 120, 60, -124, -30, 88}, new byte[]{82, -15, -114, 52, -74, -21, 85, 88}));
            throw null;
        }
        if (aq1Var == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-100, 120, -123, -120, 99, -46, 66, -3, -101, 100, -41, -38, 41, -127, 96, -31, -124, 124}, new byte[]{-24, 16, -9, -25, 20, -95, 14, -108}));
            throw null;
        }
        this.OooO0oo = jlVar;
        this.OooO = ho1Var;
        this.OooOO0O = z;
        this.OooOO0o = aq1Var;
        this.OooOO0 = null;
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooO(zt0 zt0Var, int i) {
        TreeMap treeMap;
        int iOooOO0O;
        nq nqVar = zt0Var.OooO0O0;
        ay1 ay1Var = new ay1(nqVar, 13);
        ho1 ho1Var = this.OooO;
        ArrayList arrayList = ((b01) ho1Var.OooO0o0).OooO0O0;
        int size = arrayList.size();
        int length = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zm zmVar = (zm) obj;
            if (zmVar instanceof bl) {
                bl blVar = (bl) zmVar;
                oh ohVar = blVar.OooO0o0;
                int iOooOO0O2 = ay1Var.OooOO0O(ohVar);
                if (iOooOO0O2 >= 0) {
                    blVar.OooOOOO(iOooOO0O2);
                }
                if ((ohVar instanceof il) && (iOooOO0O = ay1Var.OooOO0O(((il) ohVar).OooO0Oo)) >= 0) {
                    blVar.OooOOO(iOooOO0O);
                }
            }
        }
        xb xbVar = this.OooOO0;
        if (xbVar != null) {
            xbVar.OooO0oo();
            o51 o51Var = nqVar.OooO0o;
            int length2 = ((zb) xbVar.OooO0oO).OooO0o0.length;
            xbVar.OooO = new TreeMap();
            int i3 = 0;
            while (true) {
                treeMap = (TreeMap) xbVar.OooO;
                if (i3 >= length2) {
                    break;
                }
                treeMap.put(((yb) ((zb) xbVar.OooO0oO).OooO0o0(i3)).OooO0o, null);
                i3++;
            }
            if (treeMap.size() > 65535) {
                sa.OooO0oO(u7.OooO00o(new byte[]{39, 18, -93, 44, -29, -124, -48, 94, 115, 30, -83, 120, -19, -115, -98, 79, 50, 19, -88, 96, -21, -105, -51}, new byte[]{83, 125, -52, 12, -114, -27, -66, 39}));
                return;
            }
            q9 q9Var = new q9();
            xbVar.OooO0o0 = q9Var.OooOOO(((TreeMap) xbVar.OooO).size());
            for (Map.Entry entry : ((TreeMap) xbVar.OooO).entrySet()) {
                wb wbVar = (wb) entry.getKey();
                Object[] objArr = wbVar.OooO0o0;
                int length3 = objArr.length;
                int length4 = objArr.length;
                boolean zEquals = length4 == 0 ? false : ((vb) wbVar.OooO0o0(length4 - 1)).OooO0Oo.equals(nl.OooO0oO);
                entry.setValue(Integer.valueOf(q9Var.OooO0OO));
                if (zEquals) {
                    q9Var.OooOOO0(-(length3 - 1));
                    length3--;
                } else {
                    q9Var.OooOOO0(length3);
                }
                for (int i4 = 0; i4 < length3; i4++) {
                    vb vbVar = (vb) wbVar.OooO0o0(i4);
                    q9Var.OooOOO(o51Var.OooOOOO(vbVar.OooO0Oo));
                    q9Var.OooOOO(vbVar.OooO0o0);
                }
                if (zEquals) {
                    q9Var.OooOOO(((vb) wbVar.OooO0o0(length3)).OooO0o0);
                }
            }
            int i5 = q9Var.OooO0OO;
            byte[] bArr = new byte[i5];
            System.arraycopy(q9Var.OooO0O0, 0, bArr, 0, i5);
            xbVar.OooO0oo = bArr;
            xb xbVar2 = this.OooOO0;
            xbVar2.OooO0oo();
            length = (((zb) xbVar2.OooO0oO).OooO0o0.length * 8) + ((byte[]) xbVar2.OooO0oo).length;
        }
        ho1Var.OooOOoo();
        int iOooO = ((an) ho1Var.OooO0oo).OooO();
        if ((iOooO & 1) != 0) {
            iOooO++;
        }
        OooOO0((iOooO * 2) + 16 + length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        zt0 zt0Var = nqVar.OooOO0o;
        o51 o51Var = nqVar.OooO0o;
        ho1 ho1Var = this.OooO;
        ho1Var.getClass();
        ((b01) ho1Var.OooO0o0).getClass();
        j7 j7Var = (j7) ((hx2) ((hx2) ho1Var.OooO0o).OooO0o0).OooO0o0;
        int length = j7Var.OooO0o0.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (((h00) ((i7) j7Var.OooO0o0(i2)).OooO0O0.OooO().OooO0Oo()).OooO0o0.length != 0) {
                hx2 hx2Var = (hx2) ho1Var.OooO0o;
                hx2Var.getClass();
                HashSet hashSet = new HashSet(20);
                j7 j7Var2 = (j7) ((hx2) hx2Var.OooO0o0).OooO0o0;
                int length2 = j7Var2.OooO0o0.length;
                for (int i3 = 0; i3 < length2; i3++) {
                    aq1 aq1VarOooO0Oo = ((i7) j7Var2.OooO0o0(i3)).OooO0O0.OooO().OooO0Oo();
                    int length3 = ((h00) aq1VarOooO0Oo).OooO0o0.length;
                    for (int i4 = 0; i4 < length3; i4++) {
                        hashSet.add(aq1VarOooO0Oo.getType(i4));
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o51Var.OooOOoo((vp1) it.next());
                }
                this.OooOO0 = new xb(ho1Var);
            } else {
                i2++;
            }
        }
        b01 b01Var = (b01) ho1Var.OooO0o0;
        b01Var.getClass();
        HashSet hashSet2 = new HashSet(20);
        ArrayList arrayList = b01Var.OooO0O0;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zm zmVar = (zm) obj;
            if (zmVar instanceof bl) {
                hashSet2.add(((bl) zmVar).OooO0o0);
            } else if (zmVar instanceof mo0) {
                throw null;
            }
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            nqVar.OooO0O0((oh) it2.next());
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOo0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) throws IOException {
        int length;
        boolean z;
        jl jlVar;
        int i;
        int i2;
        String string;
        jl jlVar2;
        boolean zOooO0Oo = q9Var.OooO0Oo();
        ho1 ho1Var = this.OooO;
        ho1Var.OooOOoo();
        int i3 = ((an) ho1Var.OooO0oo).OooO0o;
        ho1Var.OooOOoo();
        an anVar = (an) ho1Var.OooO0oo;
        int length2 = anVar.OooO0o0.length;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            zm zmVar = (zm) anVar.OooO0o0(i4);
            if (zmVar instanceof bl) {
                oh ohVar = ((bl) zmVar).OooO0o0;
                int iOooO0o = ohVar instanceof jl ? ((jl) ohVar).OooO0o(zmVar.OooO0O0.OooO0O0 == 113) : 0;
                if (iOooO0o > i5) {
                    i5 = iOooO0o;
                }
            }
            i4++;
        }
        boolean z2 = this.OooOO0O;
        jl jlVar3 = this.OooO0oo;
        int iOooO0o2 = jlVar3.OooO0o(z2);
        ho1Var.OooOOoo();
        int iOooO = ((an) ho1Var.OooO0oo).OooO();
        boolean z3 = (iOooO & 1) != 0;
        xb xbVar = this.OooOO0;
        if (xbVar == null) {
            length = 0;
        } else {
            xbVar.OooO0oo();
            length = ((zb) xbVar.OooO0oO).OooO0o0.length;
        }
        if (zOooO0Oo) {
            q9Var.OooO0O0(0, OooO0oO() + ' ' + jlVar3.OooO00o());
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{5, 57, 28, -68, 85, 23, -42, 48, 64, 107, 29, -122, 65, 23, -33, 33, 31, 57}, new byte[]{37, 25, 110, -39, 50, 126, -91, 68}).concat(js2.OooO0O0(i3)));
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{59, -7, 84, 26, 49, 19, -39, 107, 97, -68, 7, 84, 98, 108, -118, 34, 59, -7}, new byte[]{27, -39, 61, 116, 66, 76, -86, 2}).concat(js2.OooO0O0(iOooO0o2)));
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{-43, 30, -117, -4, 50, 112, -64, 85, -100, 68, -127, -77, 102, 35, -65, 6, -43, 30}, new byte[]{-11, 62, -28, -119, 70, 3, -97, 38}).concat(js2.OooO0O0(i5)));
            q9Var.OooO0O0(2, u7.OooO00o(new byte[]{101, 108, -118, -115, 110, -54, -58, -46, 54, 37, -124, -102, 61, -113, -107, -83, 101, 108}, new byte[]{69, 76, -2, -1, 7, -81, -75, -115}).concat(js2.OooO0O0(length)));
            rj.OooOO0O(0, u7.OooO00o(new byte[]{52, 12, -111, 70, -31, -11, -9, 106, 123, 74, -109, 25, -93, -96, -80, 21, 52, 12}, new byte[]{20, 44, -11, 35, -125, -128, -112, 53}), q9Var, 4);
            rj.OooOO0O(iOooO, u7.OooO00o(new byte[]{-50, 3, -62, 87, -80, 37, -73, -53, -99, 74, -47, 92, -7, 107, -28, -76, -50, 3}, new byte[]{-18, 35, -85, 57, -61, 75, -60, -108}), q9Var, 4);
            aq1 aq1Var = this.OooOO0o;
            h00 h00Var = (h00) aq1Var;
            if (h00Var.OooO0o0.length != 0) {
                StringBuilder sb = new StringBuilder();
                z = zOooO0Oo;
                sb.append(u7.OooO00o(new byte[]{123, -1, 58, 12, 37, 83, -73, 106, 123}, new byte[]{91, -33, 78, 100, 87, 60, -64, 25}));
                int length3 = h00Var.OooO0o0.length;
                if (length3 == 0) {
                    string = u7.OooO00o(new byte[]{60, -29, 118, -68, -113, -8, 99}, new byte[]{0, -122, 27, -52, -5, -127, 93, -84});
                    jlVar = jlVar3;
                } else {
                    StringBuilder sb2 = new StringBuilder(100);
                    int i6 = 0;
                    while (i6 < length3) {
                        int i7 = length3;
                        if (i6 != 0) {
                            jlVar2 = jlVar3;
                            sb2.append(u7.OooO00o(new byte[]{97, 24}, new byte[]{77, 56, 49, 92, -13, -78, 114, -96}));
                        } else {
                            jlVar2 = jlVar3;
                        }
                        sb2.append(aq1Var.getType(i6).OooO00o());
                        i6++;
                        length3 = i7;
                        jlVar3 = jlVar2;
                    }
                    jlVar = jlVar3;
                    string = sb2.toString();
                }
                sb.append(string);
                i = 0;
                q9Var.OooO0O0(0, sb.toString());
            } else {
                z = zOooO0Oo;
                jlVar = jlVar3;
                i = 0;
            }
        } else {
            z = zOooO0Oo;
            jlVar = jlVar3;
            i = 0;
        }
        q9Var.OooOO0o(i3);
        q9Var.OooOO0o(iOooO0o2);
        q9Var.OooOO0o(i5);
        q9Var.OooOO0o(length);
        q9Var.OooOO0O(i);
        q9Var.OooOO0O(iOooO);
        ho1Var.OooOOoo();
        try {
            ((an) ho1Var.OooO0oo).OooOO0(q9Var);
            if (this.OooOO0 != null) {
                if (z3) {
                    if (z) {
                        q9Var.OooO0O0(2, u7.OooO00o(new byte[]{26, -51, 78, 13, -1, 9, -42, -79, 93, -41, 30, 92}, new byte[]{58, -19, 62, 108, -101, 109, -65, -33}));
                    }
                    q9Var.OooOO0o(0);
                }
                xb xbVar2 = this.OooOO0;
                xbVar2.OooO0oo();
                if (q9Var.OooO0Oo()) {
                    xbVar2.OooO0oo();
                    int length4 = ((zb) xbVar2.OooO0oO).OooO0o0.length;
                    q9Var.OooO0O0(0, "  ".concat(u7.OooO00o(new byte[]{13, 61, 0, -119, -71, 26}, new byte[]{121, 79, 105, -20, -54, 32, 46, -112})));
                    for (int i8 = 0; i8 < length4; i8++) {
                        yb ybVar = (yb) ((zb) xbVar2.OooO0oO).OooO0o0(i8);
                        wb wbVar = ybVar.OooO0o;
                        StringBuilder sb3 = new StringBuilder("    ");
                        sb3.append(u7.OooO00o(new byte[]{114, -57, 63, -9}, new byte[]{6, -75, 70, -41, 106, 85, -109, 24}));
                        int i9 = ybVar.OooO0Oo;
                        sb3.append(i9 == ((char) i9) ? js2.OooO0O0(i9) : js2.OooO0OO(i9));
                        sb3.append(u7.OooO00o(new byte[]{-95, -76}, new byte[]{-113, -102, 109, 55, 54, 92, -27, 113}));
                        int i10 = ybVar.OooO0o0;
                        sb3.append(i10 == ((char) i10) ? js2.OooO0O0(i10) : js2.OooO0OO(i10));
                        String string2 = sb3.toString();
                        String strOooOO0 = wbVar.OooOO0("    ", "");
                        q9Var.OooO0O0(6, string2);
                        q9Var.OooO0O0(2, strOooOO0);
                    }
                    i2 = 0;
                    q9Var.OooO0O0(0, "  ".concat(u7.OooO00o(new byte[]{-21, -47, -87, 98, 111, -125, -42, -16, -71}, new byte[]{-125, -80, -57, 6, 3, -26, -92, -125})));
                    q9Var.OooO0O0(xbVar2.OooO0o0, "    " + u7.OooO00o(new byte[]{-60, 64, 37, 9, 16, -15}, new byte[]{-73, 41, 95, 108, 42, -47, 83, -24}) + js2.OooO0O0(((TreeMap) xbVar2.OooO).size()));
                    wb wbVar2 = null;
                    int i11 = 0;
                    for (Map.Entry entry : ((TreeMap) xbVar2.OooO).entrySet()) {
                        wb wbVar3 = (wb) entry.getKey();
                        int iIntValue = ((Integer) entry.getValue()).intValue();
                        if (wbVar2 != null) {
                            xb.OooO0OO(wbVar2, i11, iIntValue - i11, "    ", q9Var);
                        }
                        i11 = iIntValue;
                        wbVar2 = wbVar3;
                    }
                    xb.OooO0OO(wbVar2, i11, ((byte[]) xbVar2.OooO0oo).length - i11, "    ", q9Var);
                } else {
                    i2 = 0;
                }
                int length5 = ((zb) xbVar2.OooO0oO).OooO0o0.length;
                for (int i12 = i2; i12 < length5; i12++) {
                    yb ybVar2 = (yb) ((zb) xbVar2.OooO0oO).OooO0o0(i12);
                    int i13 = ybVar2.OooO0Oo;
                    int i14 = ybVar2.OooO0o0;
                    int i15 = i14 - i13;
                    if (i15 >= 65536) {
                        throw new UnsupportedOperationException(u7.OooO00o(new byte[]{-119, 21, -27, 97, 15, 75, 120, 25, -120, 31, -14, 96, 21, 4, 115, 65, -103, 27, -20, 115, 25, 81, 61}, new byte[]{-21, 122, -126, 20, 124, 107, 29, 97}) + js2.OooO0OO(i13) + u7.OooO00o(new byte[]{116, -51}, new byte[]{90, -29, 101, 71, -85, 110, -105, -12}) + js2.OooO0OO(i14));
                    }
                    q9Var.OooOO0O(i13);
                    q9Var.OooOO0o(i15);
                    q9Var.OooOO0o(((Integer) ((TreeMap) xbVar2.OooO).get(ybVar2.OooO0o)).intValue());
                }
                q9Var.OooO((byte[]) xbVar2.OooO0oo);
            }
        } catch (RuntimeException e) {
            throw dx.OooO0O0(u7.OooO00o(new byte[]{51, 53, -2, -113, -20, 100, 27, 115, 61, 108, -94, -111, -16, 100, 25, 113, 61, 114, -66, -117, -16, 127, 2, 117, 105, 114, -65, -106, -9, 45, 17, 121, 111, 59}, new byte[]{29, 27, -48, -8, -124, 13, 119, 22}).concat(jlVar.OooO00o()), e);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{3, 67, 125, 125, -107, 101, 116, 127, 59}, new byte[]{64, 44, 25, 24, -36, 17, 17, 18}));
        sb.append(this.OooO0oo.OooO00o());
        return rj.OooO0oo(new byte[]{-126}, new byte[]{-1, 30, -102, -48, 33, 12, -93, -36}, sb);
    }
}

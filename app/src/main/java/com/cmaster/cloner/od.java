package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class od extends ky0 {
    public final ArrayList OooO;
    public final nl OooO0oo;
    public final HashMap OooOO0;
    public final ArrayList OooOO0O;
    public final ArrayList OooOO0o;
    public tk OooOOO;
    public final ArrayList OooOOO0;
    public byte[] OooOOOO;

    public od(nl nlVar) {
        super(1, -1);
        if (nlVar == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{-16, -75, -61, -108, -83, 27, 80, -67, -9, -3, -105, -38, -50, 25, 68, -94, -24}, new byte[]{-124, -35, -86, -25, -18, 119, 49, -50}));
            throw null;
        }
        this.OooO0oo = nlVar;
        this.OooO = new ArrayList(20);
        this.OooOO0 = new HashMap(40);
        this.OooOO0O = new ArrayList(20);
        this.OooOO0o = new ArrayList(20);
        this.OooOOO0 = new ArrayList(20);
        this.OooOOO = null;
    }

    public static void OooOO0o(nq nqVar, q9 q9Var, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0O0(0, "  " + str + u7.OooO00o(new byte[]{46}, new byte[]{20, -67, -70, -3, -77, 124, -60, -3}));
        }
        int iOooO0OO = 0;
        for (int i = 0; i < size; i++) {
            iOooO0OO = ((vv) arrayList.get(i)).OooO0OO(nqVar, q9Var, iOooO0OO, i);
        }
    }

    public static void OooOOO(q9 q9Var, String str, int i) {
        if (q9Var.OooO0Oo()) {
            q9Var.OooO0OO(String.format(u7.OooO00o(new byte[]{-121, 39, 76, 10, -51, 43, 101, 125, -126, 55, 81, 95}, new byte[]{-89, 7, 105, 39, -1, 26, 22, 93}), str.concat(u7.OooO00o(new byte[]{104, 27, -17, -65, -70, -8}, new byte[]{55, 104, -122, -59, -33, -62, -67, -39})), Integer.valueOf(i)));
        }
        q9Var.OooOOO(i);
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooO(zt0 zt0Var, int i) {
        q9 q9Var = new q9();
        OooOOO0(zt0Var.OooO0O0, q9Var);
        int i2 = q9Var.OooO0OO;
        byte[] bArr = new byte[i2];
        System.arraycopy(q9Var.OooO0O0, 0, bArr, 0, i2);
        this.OooOOOO = bArr;
        OooOO0(i2);
    }

    @Override // com.cmaster.cloner.pj0
    public final void OooO00o(nq nqVar) {
        ArrayList arrayList = this.OooO;
        int i = 0;
        if (!arrayList.isEmpty()) {
            OooOOOO();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                uv uvVar = (uv) obj;
                uvVar.getClass();
                nqVar.OooO0oo.OooOOOO(uvVar.OooO0o0);
            }
        }
        ArrayList arrayList2 = this.OooOO0O;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            int size2 = arrayList2.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                uv uvVar2 = (uv) obj2;
                uvVar2.getClass();
                nqVar.OooO0oo.OooOOOO(uvVar2.OooO0o0);
            }
        }
        ArrayList arrayList3 = this.OooOO0o;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList3.get(i4);
                i4++;
                wv wvVar = (wv) obj3;
                wvVar.getClass();
                vt0 vt0Var = nqVar.OooO;
                zt0 zt0Var = nqVar.OooO00o;
                vt0Var.OooOOOO(wvVar.OooO0o0);
                le leVar = wvVar.OooO0o;
                if (leVar != null) {
                    zt0Var.OooOOO0(leVar);
                }
            }
        }
        ArrayList arrayList4 = this.OooOOO0;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        int size4 = arrayList4.size();
        while (i < size4) {
            Object obj4 = arrayList4.get(i);
            i++;
            wv wvVar2 = (wv) obj4;
            wvVar2.getClass();
            vt0 vt0Var2 = nqVar.OooO;
            zt0 zt0Var2 = nqVar.OooO00o;
            vt0Var2.OooOOOO(wvVar2.OooO0o0);
            le leVar2 = wvVar2.OooO0o;
            if (leVar2 != null) {
                zt0Var2.OooOOO0(leVar2);
            }
        }
    }

    @Override // com.cmaster.cloner.pj0
    public final wj0 OooO0O0() {
        return wj0.OooOo00;
    }

    @Override // com.cmaster.cloner.ky0
    public final void OooOO0O(nq nqVar, q9 q9Var) {
        if (q9Var.OooO0Oo()) {
            OooOOO0(nqVar, q9Var);
        } else {
            q9Var.OooO(this.OooOOOO);
        }
    }

    public final void OooOOO0(nq nqVar, q9 q9Var) {
        boolean zOooO0Oo = q9Var.OooO0Oo();
        if (zOooO0Oo) {
            q9Var.OooO0O0(0, OooO0oO() + u7.OooO00o(new byte[]{-60, 20, -60, 87, 63, -45, -56, -114, -123, 3, -55, 22, 42, -49, -102, -54}, new byte[]{-28, 119, -88, 54, 76, -96, -24, -22}) + this.OooO0oo.OooO0Oo.OooO00o());
        }
        String strOooO00o = u7.OooO00o(new byte[]{-84, 32, 114, -58, -68, 124, -122, -120, -74, 49, 127, -42, -90}, new byte[]{-33, 84, 19, -78, -43, 31, -39, -18});
        ArrayList arrayList = this.OooO;
        OooOOO(q9Var, strOooO00o, arrayList.size());
        String strOooO00o2 = u7.OooO00o(new byte[]{86, 11, 33, -91, -68, -27, 25, 19, 96, 3, 59, -76, -79, -17, 9}, new byte[]{63, 101, 82, -47, -35, -117, 122, 118});
        ArrayList arrayList2 = this.OooOO0O;
        OooOOO(q9Var, strOooO00o2, arrayList2.size());
        String strOooO00o3 = u7.OooO00o(new byte[]{-18, 89, -45, -50, 111, -11, -92, 87, -17, 68, -55, -60, 104, -14}, new byte[]{-118, 48, -95, -85, 12, -127, -5, 58});
        ArrayList arrayList3 = this.OooOO0o;
        OooOOO(q9Var, strOooO00o3, arrayList3.size());
        String strOooO00o4 = u7.OooO00o(new byte[]{99, 123, 79, -68, -95, -53, 33, -112, 120, 119, 73, -96, -69, -50, 62}, new byte[]{21, 18, 61, -56, -44, -86, 77, -49});
        ArrayList arrayList4 = this.OooOOO0;
        OooOOO(q9Var, strOooO00o4, arrayList4.size());
        OooOO0o(nqVar, q9Var, u7.OooO00o(new byte[]{-50, -45, -80, -6, 12, 120, 24, -78, -44, -62, -67, -22, 22}, new byte[]{-67, -89, -47, -114, 101, 27, 71, -44}), arrayList);
        OooOO0o(nqVar, q9Var, u7.OooO00o(new byte[]{71, 121, 81, -16, 101, -45, -20, 91, 113, 113, 75, -31, 104, -39, -4}, new byte[]{46, 23, 34, -124, 4, -67, -113, 62}), arrayList2);
        OooOO0o(nqVar, q9Var, u7.OooO00o(new byte[]{73, -101, 60, 126, 84, -127, 86, 94, 72, -122, 38, 116, 83, -122}, new byte[]{45, -14, 78, 27, 55, -11, 9, 51}), arrayList3);
        OooOO0o(nqVar, q9Var, u7.OooO00o(new byte[]{-75, 31, 88, 35, 125, -80, 24, 105, -82, 19, 94, 63, 103, -75, 7}, new byte[]{-61, 118, 42, 87, 8, -47, 116, 54}), arrayList4);
        if (zOooO0Oo) {
            q9Var.OooO0o();
        }
    }

    public final tk OooOOOO() {
        HashMap map;
        tk tkVar;
        oh ohVar;
        if (this.OooOOO == null) {
            ArrayList arrayList = this.OooO;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.OooOO0;
                    if (size <= 0) {
                        break;
                    }
                    oh ohVar2 = (oh) map.get((uv) arrayList.get(size - 1));
                    if (ohVar2 instanceof gl) {
                        if (((gl) ohVar2).OooO0oo() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (ohVar2 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    tkVar = null;
                } else {
                    sk skVar = new sk(size);
                    for (int i = 0; i < size; i++) {
                        uv uvVar = (uv) arrayList.get(i);
                        oh ohVar3 = (oh) map.get(uvVar);
                        if (ohVar3 == null) {
                            vp1 type = uvVar.OooO0o0.getType();
                            switch (type.OooO0o0) {
                                case 1:
                                    ohVar = uk.OooO0o0;
                                    break;
                                case 2:
                                    ohVar = vk.OooO0o0;
                                    break;
                                case 3:
                                    ohVar = wk.OooO0o0;
                                    break;
                                case 4:
                                    ohVar = xk.OooO0o0;
                                    break;
                                case 5:
                                    ohVar = zk.OooO0o0;
                                    break;
                                case 6:
                                    ohVar = cl.OooO0o;
                                    break;
                                case 7:
                                    ohVar = hl.OooO0o0;
                                    break;
                                case 8:
                                    ohVar = ll.OooO0o0;
                                    break;
                                case 9:
                                    ohVar = dl.OooO0Oo;
                                    break;
                                default:
                                    throw new UnsupportedOperationException(u7.OooO00o(new byte[]{-82, 9, 22, 50, 51, 96, 116, -19, -90, 9, 68, 104, 34, 107, 107, -88, -6, 70}, new byte[]{-64, 102, 54, 72, 86, 18, 27, -51}) + type.OooO00o());
                            }
                            ohVar3 = ohVar;
                        }
                        skVar.OooO0o(i, ohVar3);
                    }
                    skVar.OooO0Oo = false;
                    tkVar = new tk(skVar);
                }
                this.OooOOO = tkVar;
            }
        }
        return this.OooOOO;
    }

    public final boolean OooOOOo() {
        return this.OooO.isEmpty() && this.OooOO0O.isEmpty() && this.OooOO0o.isEmpty() && this.OooOOO0.isEmpty();
    }
}

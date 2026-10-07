package com.cmaster.cloner;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tp0 implements Map, Serializable {
    public static final tp0 OooOOo0;
    public int OooO;
    public Object[] OooO0Oo;
    public int[] OooO0o;
    public Object[] OooO0o0;
    public int[] OooO0oO;
    public int OooO0oo;
    public int OooOO0;
    public int OooOO0O;
    public int OooOO0o;
    public vp0 OooOOO;
    public up0 OooOOO0;
    public up0 OooOOOO;
    public boolean OooOOOo;

    static {
        tp0 tp0Var = new tp0(0);
        tp0Var.OooOOOo = true;
        OooOOo0 = tp0Var;
    }

    public tp0(int i) {
        if (i < 0) {
            ra.OooOOO("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.OooO0Oo = objArr;
        this.OooO0o0 = null;
        this.OooO0o = iArr;
        this.OooO0oO = new int[iHighestOneBit];
        this.OooO0oo = 2;
        this.OooO = 0;
        this.OooOO0 = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    public final int OooO(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.OooOO0;
    }

    public final int OooO00o(Object obj) {
        OooO0OO();
        while (true) {
            int iOooO = OooO(obj);
            int i = this.OooO0oo * 2;
            int length = this.OooO0oO.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.OooO0oO;
                int i3 = iArr[iOooO];
                if (i3 <= 0) {
                    int i4 = this.OooO;
                    Object[] objArr = this.OooO0Oo;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.OooO = i5;
                        objArr[i4] = obj;
                        this.OooO0o[i4] = iOooO;
                        iArr[iOooO] = i5;
                        this.OooOO0o++;
                        this.OooOO0O++;
                        if (i2 > this.OooO0oo) {
                            this.OooO0oo = i2;
                        }
                        return i4;
                    }
                    OooO0o(1);
                } else {
                    if (ij0.OooO00o(this.OooO0Oo[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        OooOO0(this.OooO0oO.length * 2);
                        break;
                    }
                    iOooO = iOooO == 0 ? this.OooO0oO.length - 1 : iOooO - 1;
                }
            }
        }
    }

    public final tp0 OooO0O0() {
        OooO0OO();
        this.OooOOOo = true;
        if (this.OooOO0o > 0) {
            return this;
        }
        tp0 tp0Var = OooOOo0;
        tp0Var.getClass();
        return tp0Var;
    }

    public final void OooO0OO() {
        if (this.OooOOOo) {
            throw new UnsupportedOperationException();
        }
    }

    public final void OooO0Oo(boolean z) {
        int i;
        Object[] objArr = this.OooO0o0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.OooO;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.OooO0o;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.OooO0Oo;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.OooO0oO[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        lv2.OooO0O0(this.OooO0Oo, i3, i);
        if (objArr != null) {
            lv2.OooO0O0(objArr, i3, this.OooO);
        }
        this.OooO = i3;
    }

    public final void OooO0o(int i) {
        Object[] objArr = this.OooO0Oo;
        int length = objArr.length;
        int i2 = this.OooO;
        int i3 = length - i2;
        int i4 = i2 - this.OooOO0o;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            OooO0Oo(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.OooO0Oo = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.OooO0o0;
            this.OooO0o0 = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.OooO0o = Arrays.copyOf(this.OooO0o, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.OooO0oO.length) {
                OooOO0(iHighestOneBit);
            }
        }
    }

    public final boolean OooO0o0(Collection collection) {
        boolean zOooO00o;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iOooO0oO = OooO0oO(entry.getKey());
                    if (iOooO0oO < 0) {
                        zOooO00o = false;
                    } else {
                        Object[] objArr = this.OooO0o0;
                        objArr.getClass();
                        zOooO00o = ij0.OooO00o(objArr[iOooO0oO], entry.getValue());
                    }
                    if (!zOooO00o) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public final int OooO0oO(Object obj) {
        int iOooO = OooO(obj);
        int i = this.OooO0oo;
        while (true) {
            int i2 = this.OooO0oO[iOooO];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (ij0.OooO00o(this.OooO0Oo[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iOooO = iOooO == 0 ? this.OooO0oO.length - 1 : iOooO - 1;
        }
    }

    public final int OooO0oo(Object obj) {
        int i = this.OooO;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.OooO0o[i] >= 0) {
                Object[] objArr = this.OooO0o0;
                objArr.getClass();
                if (ij0.OooO00o(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.OooO0o[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0(int r6) {
        /*
            r5 = this;
            int r0 = r5.OooOO0O
            int r0 = r0 + 1
            r5.OooOO0O = r0
            int r0 = r5.OooO
            int r1 = r5.OooOO0o
            r2 = 0
            if (r0 <= r1) goto L10
            r5.OooO0Oo(r2)
        L10:
            int[] r0 = new int[r6]
            r5.OooO0oO = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.OooOO0 = r6
        L1c:
            int r6 = r5.OooO
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.OooO0Oo
            r0 = r0[r2]
            int r0 = r5.OooO(r0)
            int r1 = r5.OooO0oo
        L2c:
            int[] r3 = r5.OooO0oO
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.OooO0o
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            com.cmaster.cloner.qa.OooO0o(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tp0.OooOO0(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x0022->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0O(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.OooO0Oo
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.OooO0o0
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.OooO0o
            r0 = r0[r12]
            int r1 = r11.OooO0oo
            int r1 = r1 * 2
            int[] r2 = r11.OooO0oO
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.OooO0oO
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.OooO0oo
            int[] r6 = r11.OooO0oO
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.OooO0Oo
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.OooO(r6)
            int r6 = r6 - r0
            int[] r9 = r11.OooO0oO
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.OooO0o
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.OooO0oO
            r0[r1] = r7
        L68:
            int[] r0 = r11.OooO0o
            r0[r12] = r7
            int r12 = r11.OooOO0o
            int r12 = r12 + r7
            r11.OooOO0o = r12
            int r12 = r11.OooOO0O
            int r12 = r12 + 1
            r11.OooOO0O = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.tp0.OooOO0O(int):void");
    }

    @Override // java.util.Map
    public final void clear() {
        OooO0OO();
        int i = this.OooO - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.OooO0o;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.OooO0oO[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        lv2.OooO0O0(this.OooO0Oo, 0, this.OooO);
        Object[] objArr = this.OooO0o0;
        if (objArr != null) {
            lv2.OooO0O0(objArr, 0, this.OooO);
        }
        this.OooOO0o = 0;
        this.OooO = 0;
        this.OooOO0O++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return OooO0oO(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return OooO0oo(obj) >= 0;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        up0 up0Var = this.OooOOOO;
        if (up0Var != null) {
            return up0Var;
        }
        up0 up0Var2 = new up0(this, 0);
        this.OooOOOO = up0Var2;
        return up0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.OooOO0o == map.size() && OooO0o0(map.entrySet());
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iOooO0oO = OooO0oO(obj);
        if (iOooO0oO < 0) {
            return null;
        }
        Object[] objArr = this.OooO0o0;
        objArr.getClass();
        return objArr[iOooO0oO];
    }

    @Override // java.util.Map
    public final int hashCode() {
        qp0 qp0Var = new qp0(this, 0);
        int i = 0;
        while (qp0Var.hasNext()) {
            int i2 = qp0Var.OooO0Oo;
            tp0 tp0Var = (tp0) qp0Var.OooO0oO;
            if (i2 >= tp0Var.OooO) {
                sa.OooOO0O();
                return 0;
            }
            qp0Var.OooO0Oo = i2 + 1;
            qp0Var.OooO0o0 = i2;
            Object obj = tp0Var.OooO0Oo[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = tp0Var.OooO0o0;
            objArr.getClass();
            Object obj2 = objArr[qp0Var.OooO0o0];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            qp0Var.OooO0o0();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.OooOO0o == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        up0 up0Var = this.OooOOO0;
        if (up0Var != null) {
            return up0Var;
        }
        up0 up0Var2 = new up0(this, 1);
        this.OooOOO0 = up0Var2;
        return up0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        OooO0OO();
        int iOooO00o = OooO00o(obj);
        Object[] objArr = this.OooO0o0;
        if (objArr == null) {
            int length = this.OooO0Oo.length;
            if (length < 0) {
                ra.OooOOO("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.OooO0o0 = objArr;
        }
        if (iOooO00o >= 0) {
            objArr[iOooO00o] = obj2;
            return null;
        }
        int i = (-iOooO00o) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        OooO0OO();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        OooO0o(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iOooO00o = OooO00o(entry.getKey());
            Object[] objArr = this.OooO0o0;
            if (objArr == null) {
                int length = this.OooO0Oo.length;
                if (length < 0) {
                    ra.OooOOO("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.OooO0o0 = objArr;
                }
            }
            if (iOooO00o >= 0) {
                objArr[iOooO00o] = entry.getValue();
            } else {
                int i = (-iOooO00o) - 1;
                if (!ij0.OooO00o(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        OooO0OO();
        int iOooO0oO = OooO0oO(obj);
        if (iOooO0oO < 0) {
            return null;
        }
        Object[] objArr = this.OooO0o0;
        objArr.getClass();
        Object obj2 = objArr[iOooO0oO];
        OooOO0O(iOooO0oO);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.OooOO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.OooOO0o * 3) + 2);
        sb.append("{");
        int i = 0;
        qp0 qp0Var = new qp0(this, 0);
        while (qp0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = qp0Var.OooO0Oo;
            tp0 tp0Var = (tp0) qp0Var.OooO0oO;
            if (i2 >= tp0Var.OooO) {
                sa.OooOO0O();
                return null;
            }
            qp0Var.OooO0Oo = i2 + 1;
            qp0Var.OooO0o0 = i2;
            Object obj = tp0Var.OooO0Oo[i2];
            if (obj == tp0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = tp0Var.OooO0o0;
            objArr.getClass();
            Object obj2 = objArr[qp0Var.OooO0o0];
            if (obj2 == tp0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            qp0Var.OooO0o0();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        vp0 vp0Var = this.OooOOO;
        if (vp0Var != null) {
            return vp0Var;
        }
        vp0 vp0Var2 = new vp0(this);
        this.OooOOO = vp0Var2;
        return vp0Var2;
    }

    public tp0() {
        this(8);
    }
}

package com.cmaster.cloner;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fc2 extends AbstractMap implements Serializable {
    public static final Object OooOOO0 = new Object();
    public transient int OooO;
    public transient Object OooO0Oo;
    public transient Object[] OooO0o;
    public transient int[] OooO0o0;
    public transient Object[] OooO0oO;
    public transient int OooO0oo = Math.min(Math.max(12, 1), 1073741823);
    public transient qb2 OooOO0;
    public transient qb2 OooOO0O;
    public transient ba2 OooOO0o;

    public final int OooO(int i, int i2, int i3, int i4) {
        int i5 = i2 - 1;
        Object objOooO0OO = k73.OooO0OO(i2);
        if (i4 != 0) {
            k73.OooO0Oo(objOooO0OO, i3 & i5, i4 + 1);
        }
        Object obj = this.OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooO00o = OooO00o();
        for (int i6 = 0; i6 <= i; i6++) {
            int iOooO0O0 = k73.OooO0O0(obj, i6);
            while (iOooO0O0 != 0) {
                int i7 = iOooO0O0 - 1;
                int i8 = iArrOooO00o[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iOooO0O02 = k73.OooO0O0(objOooO0OO, i10);
                k73.OooO0Oo(objOooO0OO, i10, iOooO0O0);
                iArrOooO00o[i7] = ((~i5) & i9) | (iOooO0O02 & i5);
                iOooO0O0 = i8 & i;
            }
        }
        this.OooO0Oo = objOooO0OO;
        this.OooO0oo = ((32 - Integer.numberOfLeadingZeros(i5)) & 31) | (this.OooO0oo & (-32));
        return i5;
    }

    public final int[] OooO00o() {
        int[] iArr = this.OooO0o0;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] OooO0O0() {
        Object[] objArr = this.OooO0o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] OooO0OO() {
        Object[] objArr = this.OooO0oO;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Map OooO0Oo() {
        Object obj = this.OooO0Oo;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final boolean OooO0o() {
        return this.OooO0Oo == null;
    }

    public final void OooO0o0(int i, int i2) {
        Object obj = this.OooO0Oo;
        Objects.requireNonNull(obj);
        int[] iArrOooO00o = OooO00o();
        Object[] objArrOooO0O0 = OooO0O0();
        Object[] objArrOooO0OO = OooO0OO();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrOooO0O0[i] = null;
            objArrOooO0OO[i] = null;
            iArrOooO00o[i] = 0;
            return;
        }
        int i4 = i + 1;
        Object obj2 = objArrOooO0O0[i3];
        objArrOooO0O0[i] = obj2;
        objArrOooO0OO[i] = objArrOooO0OO[i3];
        objArrOooO0O0[i3] = null;
        objArrOooO0OO[i3] = null;
        iArrOooO00o[i] = iArrOooO00o[i3];
        iArrOooO00o[i3] = 0;
        int iOooO00o = m73.OooO00o(obj2) & i2;
        int iOooO0O0 = k73.OooO0O0(obj, iOooO00o);
        if (iOooO0O0 == size) {
            k73.OooO0Oo(obj, iOooO00o, i4);
            return;
        }
        while (true) {
            int i5 = iOooO0O0 - 1;
            int i6 = iArrOooO00o[i5];
            int i7 = i6 & i2;
            if (i7 == size) {
                iArrOooO00o[i5] = ((~i2) & i6) | (i4 & i2);
                return;
            }
            iOooO0O0 = i7;
        }
    }

    public final int OooO0oO() {
        return (1 << (this.OooO0oo & 31)) - 1;
    }

    public final int OooO0oo(Object obj) {
        if (OooO0o()) {
            return -1;
        }
        int iOooO00o = m73.OooO00o(obj);
        int iOooO0oO = OooO0oO();
        Object obj2 = this.OooO0Oo;
        Objects.requireNonNull(obj2);
        int iOooO0O0 = k73.OooO0O0(obj2, iOooO00o & iOooO0oO);
        if (iOooO0O0 != 0) {
            int i = ~iOooO0oO;
            int i2 = iOooO00o & i;
            do {
                int i3 = iOooO0O0 - 1;
                int i4 = OooO00o()[i3];
                if ((i4 & i) == i2 && e73.OooO00o(obj, OooO0O0()[i3])) {
                    return i3;
                }
                iOooO0O0 = i4 & iOooO0oO;
            } while (iOooO0O0 != 0);
        }
        return -1;
    }

    public final Object OooOO0(Object obj) {
        if (!OooO0o()) {
            int iOooO0oO = OooO0oO();
            Object obj2 = this.OooO0Oo;
            Objects.requireNonNull(obj2);
            int iOooO00o = k73.OooO00o(obj, null, iOooO0oO, obj2, OooO00o(), OooO0O0(), null);
            if (iOooO00o != -1) {
                Object obj3 = OooO0OO()[iOooO00o];
                OooO0o0(iOooO00o, iOooO0oO);
                this.OooO--;
                this.OooO0oo += 32;
                return obj3;
            }
        }
        return OooOOO0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (OooO0o()) {
            return;
        }
        this.OooO0oo += 32;
        Map mapOooO0Oo = OooO0Oo();
        if (mapOooO0Oo != null) {
            this.OooO0oo = Math.min(Math.max(size(), 3), 1073741823);
            mapOooO0Oo.clear();
            this.OooO0Oo = null;
            this.OooO = 0;
            return;
        }
        Arrays.fill(OooO0O0(), 0, this.OooO, (Object) null);
        Arrays.fill(OooO0OO(), 0, this.OooO, (Object) null);
        Object obj = this.OooO0Oo;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(OooO00o(), 0, this.OooO, 0);
        this.OooO = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapOooO0Oo = OooO0Oo();
        return mapOooO0Oo != null ? mapOooO0Oo.containsKey(obj) : OooO0oo(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapOooO0Oo = OooO0Oo();
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.containsValue(obj);
        }
        for (int i = 0; i < this.OooO; i++) {
            if (e73.OooO00o(obj, OooO0OO()[i])) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        qb2 qb2Var = this.OooOO0O;
        if (qb2Var != null) {
            return qb2Var;
        }
        qb2 qb2Var2 = new qb2(0, this);
        this.OooOO0O = qb2Var2;
        return qb2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapOooO0Oo = OooO0Oo();
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.get(obj);
        }
        int iOooO0oo = OooO0oo(obj);
        if (iOooO0oo == -1) {
            return null;
        }
        return OooO0OO()[iOooO0oo];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        qb2 qb2Var = this.OooOO0;
        if (qb2Var != null) {
            return qb2Var;
        }
        qb2 qb2Var2 = new qb2(1, this);
        this.OooOO0 = qb2Var2;
        return qb2Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i;
        int i2 = 32;
        if (OooO0o()) {
            f73.OooO0OO("Arrays already allocated", OooO0o());
            int i3 = this.OooO0oo;
            int iMax = Math.max(i3 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.OooO0Oo = k73.OooO0OO(iMax2);
            this.OooO0oo = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.OooO0oo & (-32));
            this.OooO0o0 = new int[i3];
            this.OooO0o = new Object[i3];
            this.OooO0oO = new Object[i3];
        }
        Map mapOooO0Oo = OooO0Oo();
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.put(obj, obj2);
        }
        int[] iArrOooO00o = OooO00o();
        Object[] objArrOooO0O0 = OooO0O0();
        Object[] objArrOooO0OO = OooO0OO();
        int i4 = this.OooO;
        int i5 = i4 + 1;
        int iOooO00o = m73.OooO00o(obj);
        int iOooO0oO = OooO0oO();
        int i6 = iOooO00o & iOooO0oO;
        Object obj3 = this.OooO0Oo;
        Objects.requireNonNull(obj3);
        int iOooO0O0 = k73.OooO0O0(obj3, i6);
        if (iOooO0O0 == 0) {
            if (i5 > iOooO0oO) {
                iOooO0oO = OooO(iOooO0oO, (iOooO0oO + 1) * (iOooO0oO < 32 ? 4 : 2), iOooO00o, i4);
            } else {
                Object obj4 = this.OooO0Oo;
                Objects.requireNonNull(obj4);
                k73.OooO0Oo(obj4, i6, i5);
            }
            i = 1;
        } else {
            int i7 = ~iOooO0oO;
            int i8 = iOooO00o & i7;
            int i9 = 0;
            while (true) {
                int i10 = iOooO0O0 - 1;
                int i11 = iArrOooO00o[i10];
                i = 1;
                int i12 = i11 & i7;
                int i13 = i2;
                if (i12 == i8 && e73.OooO00o(obj, objArrOooO0O0[i10])) {
                    Object obj5 = objArrOooO0OO[i10];
                    objArrOooO0OO[i10] = obj2;
                    return obj5;
                }
                int i14 = i11 & iOooO0oO;
                int i15 = i9 + 1;
                if (i14 != 0) {
                    i9 = i15;
                    iOooO0O0 = i14;
                    i2 = i13;
                } else {
                    if (i15 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(OooO0oO() + 1, 1.0f);
                        int i16 = isEmpty() ? -1 : 0;
                        while (i16 >= 0) {
                            linkedHashMap.put(OooO0O0()[i16], OooO0OO()[i16]);
                            int i17 = i16 + 1;
                            i16 = i17 < this.OooO ? i17 : -1;
                        }
                        this.OooO0Oo = linkedHashMap;
                        this.OooO0o0 = null;
                        this.OooO0o = null;
                        this.OooO0oO = null;
                        this.OooO0oo += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i5 > iOooO0oO) {
                        iOooO0oO = OooO(iOooO0oO, (iOooO0oO + 1) * (iOooO0oO < i13 ? 4 : 2), iOooO00o, i4);
                    } else {
                        iArrOooO00o[i10] = (i5 & iOooO0oO) | i12;
                    }
                }
            }
        }
        int length = OooO00o().length;
        if (i5 > length) {
            int i18 = i;
            int iMin = Math.min(1073741823, (Math.max(i18, length >>> 1) + length) | i18);
            if (iMin != length) {
                this.OooO0o0 = Arrays.copyOf(OooO00o(), iMin);
                this.OooO0o = Arrays.copyOf(OooO0O0(), iMin);
                this.OooO0oO = Arrays.copyOf(OooO0OO(), iMin);
            }
        }
        OooO00o()[i4] = (~iOooO0oO) & iOooO00o;
        OooO0O0()[i4] = obj;
        OooO0OO()[i4] = obj2;
        this.OooO = i5;
        this.OooO0oo += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapOooO0Oo = OooO0Oo();
        if (mapOooO0Oo != null) {
            return mapOooO0Oo.remove(obj);
        }
        Object objOooOO0 = OooOO0(obj);
        if (objOooOO0 == OooOOO0) {
            return null;
        }
        return objOooOO0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapOooO0Oo = OooO0Oo();
        return mapOooO0Oo != null ? mapOooO0Oo.size() : this.OooO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ba2 ba2Var = this.OooOO0o;
        if (ba2Var != null) {
            return ba2Var;
        }
        ba2 ba2Var2 = new ba2(this, 1);
        this.OooOO0o = ba2Var2;
        return ba2Var2;
    }
}

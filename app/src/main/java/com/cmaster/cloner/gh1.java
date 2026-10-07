package com.cmaster.cloner;

import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class gh1 {
    public int[] OooO0Oo;
    public int OooO0o;
    public Object[] OooO0o0;

    public gh1(int i) {
        this.OooO0Oo = i == 0 ? tf0.OooO00o : new int[i];
        this.OooO0o0 = i == 0 ? tf0.OooO0O0 : new Object[i << 1];
    }

    public Object OooO(int i, Object obj) {
        if (i < 0 || i >= this.OooO0o) {
            sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.OooO0o0;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int OooO00o(Object obj) {
        int i = this.OooO0o * 2;
        Object[] objArr = this.OooO0o0;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final void OooO0O0(int i) {
        int i2 = this.OooO0o;
        int[] iArr = this.OooO0Oo;
        if (iArr.length < i) {
            this.OooO0Oo = Arrays.copyOf(iArr, i);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, i * 2);
        }
        if (this.OooO0o == i2) {
            return;
        }
        sa.OooO0O0();
    }

    public final int OooO0OO(int i, Object obj) {
        int i2 = this.OooO0o;
        if (i2 == 0) {
            return -1;
        }
        int iOooO00o = tf0.OooO00o(this.OooO0Oo, i2, i);
        if (iOooO00o < 0 || ij0.OooO00o(obj, this.OooO0o0[iOooO00o << 1])) {
            return iOooO00o;
        }
        int i3 = iOooO00o + 1;
        while (i3 < i2 && this.OooO0Oo[i3] == i) {
            if (ij0.OooO00o(obj, this.OooO0o0[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iOooO00o - 1; i4 >= 0 && this.OooO0Oo[i4] == i; i4--) {
            if (ij0.OooO00o(obj, this.OooO0o0[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int OooO0Oo(Object obj) {
        return obj == null ? OooO0o0() : OooO0OO(obj.hashCode(), obj);
    }

    public final Object OooO0o(int i) {
        if (i >= 0 && i < this.OooO0o) {
            return this.OooO0o0[i << 1];
        }
        sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final int OooO0o0() {
        int i = this.OooO0o;
        if (i == 0) {
            return -1;
        }
        int iOooO00o = tf0.OooO00o(this.OooO0Oo, i, 0);
        if (iOooO00o < 0 || this.OooO0o0[iOooO00o << 1] == null) {
            return iOooO00o;
        }
        int i2 = iOooO00o + 1;
        while (i2 < i && this.OooO0Oo[i2] == 0) {
            if (this.OooO0o0[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iOooO00o - 1; i3 >= 0 && this.OooO0Oo[i3] == 0; i3--) {
            if (this.OooO0o0[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public void OooO0oO(gh1 gh1Var) {
        gh1Var.getClass();
        int i = gh1Var.OooO0o;
        OooO0O0(this.OooO0o + i);
        if (this.OooO0o != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gh1Var.OooO0o(i2), gh1Var.OooOO0(i2));
            }
        } else if (i > 0) {
            o3.OooO00o(0, 0, i, gh1Var.OooO0Oo, this.OooO0Oo);
            o3.OooO0O0(gh1Var.OooO0o0, 0, this.OooO0o0, 0, i << 1);
            this.OooO0o = i;
        }
    }

    public Object OooO0oo(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.OooO0o)) {
            sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.OooO0o0;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.OooO0Oo;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                o3.OooO00o(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.OooO0o0;
                o3.OooO0O0(objArr2, i3, objArr2, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.OooO0o0;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.OooO0Oo = Arrays.copyOf(iArr, i7);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, i7 << 1);
            if (i2 != this.OooO0o) {
                sa.OooO0O0();
                return null;
            }
            if (i > 0) {
                o3.OooO00o(0, 0, i, iArr, this.OooO0Oo);
                o3.OooO0O0(objArr, 0, this.OooO0o0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                o3.OooO00o(i, i8, i2, iArr, this.OooO0Oo);
                o3.OooO0O0(objArr, i3, this.OooO0o0, i8 << 1, i2 << 1);
            }
        }
        if (i2 == this.OooO0o) {
            this.OooO0o = i4;
            return obj;
        }
        sa.OooO0O0();
        return null;
    }

    public final Object OooOO0(int i) {
        if (i >= 0 && i < this.OooO0o) {
            return this.OooO0o0[(i << 1) + 1];
        }
        sa.OooO0OO(px0.OooOOO(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public void clear() {
        if (this.OooO0o > 0) {
            this.OooO0Oo = tf0.OooO00o;
            this.OooO0o0 = tf0.OooO0O0;
            this.OooO0o = 0;
        }
        if (this.OooO0o <= 0) {
            return;
        }
        sa.OooO0O0();
    }

    public boolean containsKey(Object obj) {
        return OooO0Oo(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return OooO00o(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof gh1) {
                int i = this.OooO0o;
                if (i != ((gh1) obj).OooO0o) {
                    return false;
                }
                gh1 gh1Var = (gh1) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objOooO0o = OooO0o(i2);
                    Object objOooOO0 = OooOO0(i2);
                    Object obj2 = gh1Var.get(objOooO0o);
                    if (objOooOO0 == null) {
                        if (obj2 != null || !gh1Var.containsKey(objOooO0o)) {
                            return false;
                        }
                    } else if (!objOooOO0.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.OooO0o != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.OooO0o;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objOooO0o2 = OooO0o(i4);
                Object objOooOO02 = OooOO0(i4);
                Object obj3 = ((Map) obj).get(objOooO0o2);
                if (objOooOO02 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objOooO0o2)) {
                        return false;
                    }
                } else if (!objOooOO02.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iOooO0Oo = OooO0Oo(obj);
        if (iOooO0Oo >= 0) {
            return this.OooO0o0[(iOooO0Oo << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iOooO0Oo = OooO0Oo(obj);
        return iOooO0Oo >= 0 ? this.OooO0o0[(iOooO0Oo << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.OooO0Oo;
        Object[] objArr = this.OooO0o0;
        int i = this.OooO0o;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.OooO0o <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.OooO0o;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iOooO0OO = obj != null ? OooO0OO(iHashCode, obj) : OooO0o0();
        if (iOooO0OO >= 0) {
            int i2 = (iOooO0OO << 1) + 1;
            Object[] objArr = this.OooO0o0;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iOooO0OO;
        int[] iArr = this.OooO0Oo;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.OooO0Oo = Arrays.copyOf(iArr, i4);
            this.OooO0o0 = Arrays.copyOf(this.OooO0o0, i4 << 1);
            if (i != this.OooO0o) {
                sa.OooO0O0();
                return null;
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.OooO0Oo;
            int i5 = i3 + 1;
            o3.OooO00o(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.OooO0o0;
            o3.OooO0O0(objArr2, i5 << 1, objArr2, i3 << 1, this.OooO0o << 1);
        }
        int i6 = this.OooO0o;
        if (i == i6) {
            int[] iArr3 = this.OooO0Oo;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.OooO0o0;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.OooO0o = i6 + 1;
                return null;
            }
        }
        sa.OooO0O0();
        return null;
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iOooO0Oo = OooO0Oo(obj);
        if (iOooO0Oo < 0 || !ij0.OooO00o(obj2, OooOO0(iOooO0Oo))) {
            return false;
        }
        OooO0oo(iOooO0Oo);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iOooO0Oo = OooO0Oo(obj);
        if (iOooO0Oo < 0 || !ij0.OooO00o(obj2, OooOO0(iOooO0Oo))) {
            return false;
        }
        OooO(iOooO0Oo, obj3);
        return true;
    }

    public final int size() {
        return this.OooO0o;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.OooO0o * 28);
        sb.append('{');
        int i = this.OooO0o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objOooO0o = OooO0o(i2);
            if (objOooO0o != sb) {
                sb.append(objOooO0o);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objOooOO0 = OooOO0(i2);
            if (objOooOO0 != sb) {
                sb.append(objOooOO0);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iOooO0Oo = OooO0Oo(obj);
        if (iOooO0Oo >= 0) {
            return OooO0oo(iOooO0Oo);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iOooO0Oo = OooO0Oo(obj);
        if (iOooO0Oo >= 0) {
            return OooO(iOooO0Oo, obj2);
        }
        return null;
    }

    public gh1(gh1 gh1Var) {
        this(0);
        if (gh1Var != null) {
            OooO0oO(gh1Var);
        }
    }
}

package com.cmaster.cloner;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cf2 extends m32 implements Set {
    public transient bf2 OooO0oO;

    public static cf2 OooO0o(int i, Object... objArr) {
        if (i == 0) {
            return mf2.OooOOO;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new nf2(obj);
        }
        int iOooO0o0 = OooO0o0(i);
        Object[] objArr2 = new Object[iOooO0o0];
        int i2 = iOooO0o0 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                qa.OooOOO0(px0.OooOOO(i5, "at index "));
                return null;
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (Integer.rotateLeft((int) (iHashCode * (-862048943)), 15) * 461845907);
            while (true) {
                int i6 = iRotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (!obj3.equals(obj2)) {
                    iRotateLeft++;
                }
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new nf2(obj4);
        }
        if (OooO0o0(i4) < iOooO0o0 / 2) {
            return OooO0o(i4, objArr);
        }
        if (i4 < 3) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new mf2(objArr, i3, objArr2, i2, i4);
    }

    public static int OooO0o0(int i) {
        int iMax = Math.max(i, 2);
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (iHighestOneBit * 0.7d < iMax);
            return iHighestOneBit;
        }
        if (iMax < 1073741824) {
            return 1073741824;
        }
        ra.OooOOO("collection too large");
        return 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cf2) && (this instanceof mf2) && (((cf2) obj) instanceof mf2) && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public abstract int hashCode();
}

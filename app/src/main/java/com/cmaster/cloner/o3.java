package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class o3 {
    public static void OooO00o(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        iArr.getClass();
        iArr2.getClass();
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void OooO0O0(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        objArr.getClass();
        objArr2.getClass();
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static /* synthetic */ void OooO0OO(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        OooO0O0(objArr, 0, objArr2, i, i2);
    }

    public static Object[] OooO0Oo(Object[] objArr, int i, int i2) {
        objArr.getClass();
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public static ArrayList OooO0o0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}

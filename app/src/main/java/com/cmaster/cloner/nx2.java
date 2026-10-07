package com.cmaster.cloner;

import android.content.pm.Signature;
import android.util.ArraySet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nx2 {
    public static int OooO00o(Signature[] signatureArr, Signature[] signatureArr2) {
        if (signatureArr == null) {
            return signatureArr2 == null ? 1 : -1;
        }
        if (signatureArr2 == null) {
            return -2;
        }
        if (signatureArr.length != signatureArr2.length) {
            return -3;
        }
        if (signatureArr.length == 1) {
            return signatureArr[0].equals(signatureArr2[0]) ? 0 : -3;
        }
        ArraySet arraySet = new ArraySet();
        for (Signature signature : signatureArr) {
            arraySet.add(signature);
        }
        ArraySet arraySet2 = new ArraySet();
        for (Signature signature2 : signatureArr2) {
            arraySet2.add(signature2);
        }
        return arraySet.equals(arraySet2) ? 0 : -3;
    }
}

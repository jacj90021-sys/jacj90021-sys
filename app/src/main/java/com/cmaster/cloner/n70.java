package com.cmaster.cloner;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class n70 {
    public final String[] OooO00o;

    static {
        DexUtils.classesInit0(32);
    }

    public n70(xb1 xb1Var) {
        ArrayList arrayList = (ArrayList) xb1Var.OooO0o0;
        this.OooO00o = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static native n70 OooO00o(List list);

    public final native boolean equals(Object obj);

    public final native int hashCode();

    public final native String toString();

    public n70(String[] strArr) {
        this.OooO00o = strArr;
    }
}

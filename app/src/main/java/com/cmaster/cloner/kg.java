package com.cmaster.cloner;

import android.content.Intent;
import android.content.IntentFilter;
import android.util.ArrayMap;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kg extends yi0 {
    public final ArrayMap OooOO0 = new ArrayMap();
    public int OooOO0O;

    static {
        DexUtils.classesInit0(26);
    }

    public static native void OooOOOo(kg kgVar, z01 z01Var, String str, ArrayList arrayList);

    public static native void OooOOo0(kg kgVar, z01 z01Var);

    @Override // com.cmaster.cloner.yi0
    public final native boolean OooO0OO(IntentFilter intentFilter, ArrayList arrayList);

    @Override // com.cmaster.cloner.yi0
    public final native boolean OooO0o(String str, IntentFilter intentFilter);

    @Override // com.cmaster.cloner.yi0
    public final /* bridge */ /* synthetic */ void OooO0o0(PrintWriter printWriter, IntentFilter intentFilter) {
    }

    @Override // com.cmaster.cloner.yi0
    public final native IntentFilter[] OooO0oO(int i);

    @Override // com.cmaster.cloner.yi0
    public final native Object OooO0oo(IntentFilter intentFilter, int i, int i2);

    @Override // com.cmaster.cloner.yi0
    public final native void OooOOO(ArrayList arrayList);

    public final native ArrayList OooOOo(Intent intent, String str, int i, ArrayList arrayList, int i2);
}

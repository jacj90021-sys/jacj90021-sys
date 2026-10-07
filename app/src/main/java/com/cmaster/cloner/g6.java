package com.cmaster.cloner;

import android.content.pm.PackageManager;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class g6 {
    public final boolean OooO00o;
    public final String OooO0O0;
    public final int OooO0OO;
    public int OooO0Oo;
    public String OooO0o;
    public String OooO0o0;
    public final o01 OooOO0O;
    public final PackageManager OooOO0o;
    public boolean OooO0oO = false;
    public boolean OooO0oo = false;
    public String[] OooO = null;
    public ir1 OooOO0 = null;

    static {
        DexUtils.classesInit0(80);
    }

    public g6(o01 o01Var, int i, String str, int i2) {
        this.OooO00o = (i & 32) != 0;
        this.OooO0O0 = str;
        this.OooO0OO = i2;
        this.OooOO0O = o01Var;
        this.OooOO0o = p80.OooO0OO.OooO00o;
    }

    public final native i10 OooO00o(String str, ParcelFileDescriptor[] parcelFileDescriptorArr, String str2);
}

package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;

/* loaded from: classes.dex */
public final class kx1 implements Parcelable {
    public static final Parcelable.Creator<kx1> CREATOR;
    public final boolean OooO;
    public final Object OooO0Oo;
    public final String OooO0o;
    public final String OooO0o0;
    public final boolean OooO0oO;
    public final boolean OooO0oo;
    public final boolean OooOO0;
    public final Context OooOO0O;
    public final PackageManager OooOO0o;
    public boolean OooOOO;
    public String OooOOO0;
    public final boolean OooOOOO;
    public ApplicationInfo OooOOOo;

    public kx1(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, Context context, String str3) {
        this.OooO0o0 = str;
        this.OooO0o = str2;
        this.OooO0oO = z;
        this.OooO0oo = z2;
        this.OooOOO0 = str3;
        this.OooOO0O = context;
        this.OooOO0o = context.getPackageManager();
        boolean zOooO00o = tr1.OooO00o();
        this.OooOOOO = zOooO00o;
        if (z4 && z3) {
            this.OooO = zOooO00o;
            this.OooOO0 = !zOooO00o;
        } else {
            this.OooO = z3;
            this.OooOO0 = z4;
        }
        File file = new File(str2);
        file = z ? new File(file.getParent()) : file;
        a02 a02Var = fw0.OooO0O0;
        Object objOooO0o0 = a02Var != null ? a02Var.OooO0o0(file) : null;
        this.OooO0Oo = objOooO0o0;
        l81 l81Var = fw0.OooO0OO;
        this.OooOOO = l81Var != null ? l81Var.OooO0OO(objOooO0o0) : false;
    }

    public static native String OooO0O0(Object obj, String[] strArr);

    public final native void OooO00o(ir1 ir1Var, String str, boolean z);

    public final native String OooO0OO(boolean z);

    public final native boolean OooO0Oo(String str);

    @Override // android.os.Parcelable
    public final native int describeContents();

    @Override // android.os.Parcelable
    public final native void writeToParcel(Parcel parcel, int i);

    static {
        DexUtils.classesInit0(1);
        CREATOR = new b41(12);
    }

    public kx1(Parcel parcel) {
        this.OooO0o0 = parcel.readString();
        this.OooO0o = parcel.readString();
        this.OooO0oO = parcel.readByte() != 0;
        this.OooO0oo = parcel.readByte() != 0;
        this.OooO = parcel.readByte() != 0;
        this.OooOO0 = parcel.readByte() != 0;
        this.OooOOO0 = parcel.readString();
    }
}

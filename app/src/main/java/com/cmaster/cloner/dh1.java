package com.cmaster.cloner;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class dh1 implements Parcelable.Creator {
    public final /* synthetic */ xb1 OooO00o;

    static {
        DexUtils.classesInit0(51);
    }

    public dh1(xb1 xb1Var) {
        this.OooO00o = xb1Var;
    }

    @Override // android.os.Parcelable.Creator
    public final native Object createFromParcel(Parcel parcel);

    @Override // android.os.Parcelable.Creator
    public final native Object[] newArray(int i);
}

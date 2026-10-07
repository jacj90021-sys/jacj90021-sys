package com.cmaster.cloner;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class a91 extends Binder implements dd0 {
    public final fj OooO0Oo;

    static {
        DexUtils.classesInit0(64);
    }

    public a91() {
        attachInterface(this, u7.OooO00o(new byte[]{-105, 20, 21, -8, -91, -21, -60, -1, -128, 30, 10, -8, -91, -22, -54, -30, -111, 9, 86, -123, -107, -45, -11, -54, -65, 61, 42, -104, -112, -44, -23, -43, -83, 44}, new byte[]{-12, 123, 120, -42, -58, -122, -91, -116}));
        this.OooO0Oo = new fj();
    }

    public static native void o0000o0O(dd0 dd0Var, w90 w90Var);

    @Override // android.os.IInterface
    public final native IBinder asBinder();

    @Override // android.os.Binder
    public final native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // com.cmaster.cloner.dd0
    public final native void send(int i, Bundle bundle);
}

package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class ic0 extends Binder implements jc0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    static {
        DexUtils.classesInit0(37);
    }

    @Override // android.os.IInterface
    public final native IBinder asBinder();

    @Override // android.os.Binder
    public final native boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2);
}

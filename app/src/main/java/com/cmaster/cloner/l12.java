package com.cmaster.cloner;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l12 implements IInterface {
    public final /* synthetic */ int OooO0Oo;
    public final String OooO0o;
    public final IBinder OooO0o0;

    public /* synthetic */ l12(int i, IBinder iBinder, String str) {
        this.OooO0Oo = i;
        this.OooO0o0 = iBinder;
        this.OooO0o = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.OooO0Oo;
        return this.OooO0o0;
    }

    public Parcel o00() {
        int i = this.OooO0Oo;
        String str = this.OooO0o;
        switch (i) {
            case 1:
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken(str);
                return parcelObtain;
            default:
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken(str);
                return parcelObtain2;
        }
    }

    public void o0000o0O(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.OooO0o0.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public Parcel o000oooo(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.OooO0o0.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public Parcel o00O0000(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.OooO0o0.transact(i, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void o0O0ooO(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.OooO0o0.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }
}

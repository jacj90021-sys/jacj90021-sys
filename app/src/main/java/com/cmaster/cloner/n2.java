package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n2 extends Binder implements IInterface {
    public v2 OooO0Oo;
    public Binder OooO0o0;

    static {
        u7.OooO00o(new byte[]{38, 24, 90, -95, -75, -91, -74, -46, 38, 6, 78, -3, -109, -115, -94, -116, 43, 31, 93, -78, -82, -91, -67, -110, 19, 30, 76, -74, -69, -88}, new byte[]{71, 118, 62, -45, -38, -52, -46, -4});
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.OooO0o0;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            if (this.OooO0Oo.OooO(this.OooO0o0, i, parcel, parcel2, i2)) {
                return false;
            }
            return this.OooO0o0.transact(i, parcel, parcel2, i2);
        } catch (Throwable th) {
            sa.OooOO0(th);
            return false;
        }
    }
}

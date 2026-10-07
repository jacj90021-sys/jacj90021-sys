package com.cmaster.cloner;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class vs2 extends q12 implements IInterface {
    public final int OooO0o0;

    public vs2(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        by2.OooO0O0(bArr.length == 25);
        this.OooO0o0 = Arrays.hashCode(bArr);
    }

    public static byte[] o00O0000(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof vs2)) {
            try {
                vs2 vs2Var = (vs2) obj;
                if (vs2Var.OooO0o0 == this.OooO0o0) {
                    return Arrays.equals(o0O0ooO(), (byte[]) ey0.o0O0ooO(new ey0(vs2Var.o0O0ooO())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0o0;
    }

    @Override // com.cmaster.cloner.q12
    public final boolean o00(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ey0 ey0Var = new ey0(o0O0ooO());
            parcel2.writeNoException();
            eb2.OooO0OO(parcel2, ey0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.OooO0o0);
        return true;
    }

    public abstract byte[] o0O0ooO();
}

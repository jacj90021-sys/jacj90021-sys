package com.cmaster.cloner;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class jo0 extends wz {
    public static final String OooOOO0 = u7.OooO00o(new byte[]{-45, 121, -47, -40, -63}, new byte[]{-23, 63, -104, -108, -124, 78, 8, 45});
    public static final char[] OooOOO = e92.OooO00o.getPackageName().toCharArray();

    public final void OooO() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeCharArray(OooOOO);
            parcelObtain.writeInt(OooO0oO());
            OooOO0(parcelObtain);
            OooO0o(OooOOO0, parcelObtain.marshall(), this.OooOO0o.getName());
        } catch (Exception unused) {
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.cmaster.cloner.dq1
    public final void OooO0Oo(String str, byte[] bArr, String str2) {
        if (TextUtils.equals(str, OooOOO0)) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            try {
                Arrays.equals(parcelObtain.createCharArray(), OooOOO);
                OooO0oo(parcelObtain.readInt(), parcelObtain);
            } finally {
                parcelObtain.recycle();
            }
        }
    }

    public int OooO0oO() {
        return 0;
    }

    public abstract void OooO0oo(int i, Parcel parcel);

    public abstract void OooOO0(Parcel parcel);
}

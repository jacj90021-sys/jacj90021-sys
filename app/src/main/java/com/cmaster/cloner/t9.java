package com.cmaster.cloner;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t9 implements ia1 {
    public final /* synthetic */ int OooO00o;
    public final us OooO0O0;

    public /* synthetic */ t9(us usVar, int i) {
        this.OooO00o = i;
        this.OooO0O0 = usVar;
    }

    @Override // com.cmaster.cloner.ia1
    public final fa1 OooO00o(Object obj, int i, int i2, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                us usVar = this.OooO0O0;
                return usVar.OooO00o(new a02((ByteBuffer) obj, usVar.OooO0Oo, usVar.OooO0OO, 10), i, i2, xz0Var, us.OooOO0);
            default:
                us usVar2 = this.OooO0O0;
                return usVar2.OooO00o(new a02((ParcelFileDescriptor) obj, usVar2.OooO0Oo, usVar2.OooO0OO), i, i2, xz0Var, us.OooOO0);
        }
    }

    @Override // com.cmaster.cloner.ia1
    public final boolean OooO0O0(Object obj, xz0 xz0Var) {
        switch (this.OooO00o) {
            case 0:
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
        }
    }
}

package com.cmaster.cloner;

import android.os.Parcel;
import android.text.TextUtils;
import java.io.File;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Random;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ax1 extends wz {
    public volatile o80 OooOOO;
    public final LinkedHashMap OooOOO0;
    public final /* synthetic */ bx1 OooOOOO;
    public static final String OooOOOo = u7.OooO00o(new byte[]{47, -35, -82, -79, -16}, new byte[]{21, -108, -6, -12, -67, 122, 110, 49});
    public static final String OooOOo0 = u7.OooO00o(new byte[]{30, 114, -116, 18, -10}, new byte[]{36, 63, -55, 70, -73, 94, 127, 48});
    public static final String OooOOo = u7.OooO00o(new byte[]{117}, new byte[]{86, 5, 86, 101, 8, -5, 104, -55});

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax1(bx1 bx1Var) {
        super(new File(dx1.OooO0O0(), u7.OooO00o(new byte[]{73, -85, 84, 3, -102}, new byte[]{45, -40, 122, 103, -8, 123, -35, -99})));
        this.OooOOOO = bx1Var;
        this.OooOOO0 = new LinkedHashMap();
    }

    public static String OooO0oO(int i, String str) {
        if (str == null) {
            str = OooOOo;
        }
        return px0.OooOOOo(new byte[]{-56}, new byte[]{-120, 88, 64, -74, -36, -88, -13, -79}, rj.OooOO0(str), i);
    }

    public final void OooO(String str, int i, aq aqVar) {
        String strOooO0oO = OooO0oO(i, str);
        Parcel parcelObtain = Parcel.obtain();
        try {
            aqVar.writeToParcel(parcelObtain, 0);
            OooO0o(OooOOOo, parcelObtain.marshall(), strOooO0oO);
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // com.cmaster.cloner.dq1
    public final void OooO0Oo(String str, byte[] bArr, String str2) {
        Parcel parcelObtain;
        if (TextUtils.equals(str, OooOOOo)) {
            parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            try {
                aq aqVarCreateFromParcel = aq.CREATOR.createFromParcel(parcelObtain);
                if (aqVarCreateFromParcel != null) {
                    this.OooOOO0.put(str2, aqVarCreateFromParcel);
                }
                return;
            } finally {
            }
        }
        if (TextUtils.equals(str, OooOOo0)) {
            parcelObtain = Parcel.obtain();
            parcelObtain.unmarshall(bArr, 0, bArr.length);
            parcelObtain.setDataPosition(0);
            try {
                o80 o80VarCreateFromParcel = o80.CREATOR.createFromParcel(parcelObtain);
                if (o80VarCreateFromParcel != null) {
                    this.OooOOO = o80VarCreateFromParcel;
                }
            } finally {
            }
        }
    }

    public final ko0 OooO0oo(int i, String str, String str2) {
        ko0 ko0Var = (ko0) this.OooOOO0.get(OooO0oO(i, str));
        if (ko0Var != null) {
            return ko0Var;
        }
        zp zpVar = this.OooOOOO.OooO0o0;
        zpVar.getClass();
        aq aqVar = new aq();
        StringBuilder sb = new StringBuilder();
        sb.append(zpVar.OooO0O0.OooO0o);
        int i2 = 1;
        rj.OooOOo0(new byte[]{-92}, new byte[]{-28, 56, 78, -88, -11, -40, 113, 88}, sb, str2);
        rj.OooOOo0(new byte[]{-47}, new byte[]{-111, 9, 51, 117, 105, -72, 2, 42}, sb, str);
        Random random = new Random(px0.OooOOOo(new byte[]{97}, new byte[]{33, -80, 33, -114, -107, -113, -30, -54}, sb, i).hashCode());
        String strOooO00o = u7.OooO00o(new byte[]{110, 72, 20, -100, 10, 34, 84, -20, 105, 68, 24, -100, 30, 53, 77, -31, 127, 66}, new byte[]{28, 39, 108, -78, 122, 80, 59, -120});
        String strOooO0O0 = zpVar.OooO0O0(random, 14, true);
        HashSet hashSet = zpVar.OooO00o;
        hashSet.remove(strOooO0O0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < strOooO0O0.length()) {
            int numericValue = Character.getNumericValue(strOooO0O0.charAt((strOooO0O0.length() - i2) - i3));
            if (i3 % 2 == 0 && (numericValue = numericValue * 2) > 9) {
                numericValue -= 9;
            }
            i4 += numericValue;
            i3++;
            i2 = 1;
        }
        String str3 = strOooO0O0 + ((10 - (i4 % 10)) % 10);
        hashSet.add(str3);
        aqVar.OooO0o0(strOooO00o, str3);
        aqVar.OooO0o0(u7.OooO00o(new byte[]{64, 113, -127, 90, 78, -39, 50, -80, 71, 125, -115, 90, 95, -59, 57, -90, 93, 119, -99}, new byte[]{50, 30, -7, 116, 62, -85, 93, -44}), zpVar.OooO0O0(random, 16, false));
        aqVar.OooO0o0(u7.OooO00o(new byte[]{-10, 81, -108, -120, 121, 59, 118, -34, -15, 93, -104, -120, 126, 32, 127, -45}, new byte[]{-124, 62, -20, -90, 9, 73, 25, -70}), zpVar.OooO00o(random));
        aqVar.OooO0o0(u7.OooO00o(new byte[]{-111, -50, -50, -67, 108, -34, 66, 40, -106, -62, -62, -67, 126, -64, 88, 41, -105, -50, -39, -25, 116}, new byte[]{-29, -95, -74, -109, 28, -84, 45, 76}), zpVar.OooO00o(random));
        aqVar.OooO0o0(u7.OooO00o(new byte[]{75, 121, 27, -57, 78, 13, 29, 71, 76, 117, 23, -57, 87, 28, 17, 124, 74, 115, 17, -128, 95, 19}, new byte[]{57, 22, 99, -23, 62, 127, 114, 35}), zpVar.OooO0O0(random, 20, true));
        aqVar.OooO0o0(u7.OooO00o(new byte[]{-53, 92, 27, -30, 27, -51, -102, 74, -52, 80, 23, -30, 24, -38, -121, 71, -40, 95}, new byte[]{-71, 51, 99, -52, 107, -65, -11, 46}), zpVar.OooO0O0(random, 20, true));
        aqVar.OooO0o0(u7.OooO00o(new byte[]{-111, 83, -98, 2, -58, 91, 41, 39, -106, 95, -110, 2, -59, 76, 35, 39}, new byte[]{-29, 60, -26, 44, -74, 41, 70, 67}), str2);
        aqVar.OooO0o0(u7.OooO00o(new byte[]{-91, 73, -31, 56, -121, -49}, new byte[]{-64, 39, -128, 90, -21, -86, 23, 48}), u7.OooO00o(new byte[]{-126}, new byte[]{-77, -122, 86, -9, 82, 117, -110, -69}));
        OooO(str, i, aqVar);
        return aqVar;
    }
}

package com.cmaster.cloner;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class b41 implements Parcelable.Creator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ b41(int i) {
        this.OooO00o = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [com.cmaster.cloner.we0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [com.cmaster.cloner.ef0] */
    /* JADX WARN: Type inference failed for: r5v28, types: [com.cmaster.cloner.ze0] */
    /* JADX WARN: Type inference failed for: r5v36, types: [com.cmaster.cloner.bf0] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.cmaster.cloner.hf0] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ff0 ff0Var;
        ue0 ue0Var;
        cf0 cf0Var;
        xe0 xe0Var;
        af0 af0Var;
        te0 te0Var = null;
        String strOooO0Oo = null;
        String strOooO0Oo2 = null;
        Account account = null;
        gh ghVar = null;
        w22 w22Var = null;
        ArrayList arrayListOooO0o = null;
        ArrayList arrayListOooO0oo = null;
        Intent intent = null;
        PendingIntent pendingIntent = null;
        ArrayList arrayListOooO0oo2 = null;
        boolean zOooOO0 = false;
        int iOooOO0o = 0;
        int iOooOO0o2 = 0;
        int iOooOO0o3 = 0;
        int iOooOO0o4 = 0;
        int iOooOO0o5 = 0;
        int iOooOO0o6 = 0;
        int iOooOO0o7 = 0;
        switch (this.OooO00o) {
            case 0:
                return new c41(parcel);
            case 1:
                return new k41(parcel);
            case 2:
                return new q81(parcel);
            case 3:
                return new le1(parcel);
            case 4:
                ff1 ff1Var = new ff1();
                ff1Var.OooO0Oo = parcel.readStrongBinder();
                IBinder strongBinder = parcel.readStrongBinder();
                int i = gf0.OooO0Oo;
                if (strongBinder == null) {
                    ff0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(u7.OooO00o(new byte[]{-85, -22, 62, 92, -56, -11, 18, 73, -68, -32, 33, 92, -56, -12, 28, 84, -83, -9, 125, 56, -14, -43, 52, 126, -103, -52, 16, 51, -24, -33, 35, 126, -126, -41, 30}, new byte[]{-56, -123, 83, 114, -85, -104, 115, 58}));
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof hf0)) {
                        ff0 ff0Var2 = new ff0();
                        ff0Var2.OooO0Oo = strongBinder;
                        ff0Var = ff0Var2;
                    } else {
                        ff0Var = (hf0) iInterfaceQueryLocalInterface;
                    }
                }
                ff1Var.OooO0o0 = ff0Var;
                IBinder strongBinder2 = parcel.readStrongBinder();
                int i2 = ve0.OooO0Oo;
                if (strongBinder2 == null) {
                    ue0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(u7.OooO00o(new byte[]{-3, -51, -93, -56, 26, 71, -38, -25, -22, -57, -68, -56, 26, 70, -44, -6, -5, -48, -32, -92, 47, 102, -8, -39, -46, -8, -125, -86, 46, 99, -30, -34, -48, -23, -122, -76}, new byte[]{-98, -94, -50, -26, 121, 42, -69, -108}));
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof we0)) {
                        ue0 ue0Var2 = new ue0();
                        ue0Var2.OooO0Oo = strongBinder2;
                        ue0Var = ue0Var2;
                    } else {
                        ue0Var = (we0) iInterfaceQueryLocalInterface2;
                    }
                }
                ff1Var.OooO0o = ue0Var;
                IBinder strongBinder3 = parcel.readStrongBinder();
                int i3 = df0.OooO0Oo;
                if (strongBinder3 == null) {
                    cf0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface(u7.OooO00o(new byte[]{82, -104, 70, 75, 37, 81, 91, -61, 69, -110, 89, 75, 37, 80, 85, -34, 84, -123, 5, 43, 11, 112, 115, -29, 121, -91, 125, 39, 11, 119, 123, -4, 121}, new byte[]{49, -9, 43, 101, 70, 60, 58, -80}));
                    if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof ef0)) {
                        cf0 cf0Var2 = new cf0();
                        cf0Var2.OooO0Oo = strongBinder3;
                        cf0Var = cf0Var2;
                    } else {
                        cf0Var = (ef0) iInterfaceQueryLocalInterface3;
                    }
                }
                ff1Var.OooO0oO = cf0Var;
                IBinder strongBinder4 = parcel.readStrongBinder();
                int i4 = ye0.OooO0Oo;
                if (strongBinder4 == null) {
                    xe0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface(u7.OooO00o(new byte[]{-72, 13, -122, -75, -9, -58, 95, -90, -81, 7, -103, -75, -9, -57, 81, -69, -66, 16, -59, -52, -45, -1, 102, -111, -110, 56, -72, -62, -60, -27, 102, -116, -103, 40, -67}, new byte[]{-37, 98, -21, -101, -108, -85, 62, -43}));
                    if (iInterfaceQueryLocalInterface4 == null || !(iInterfaceQueryLocalInterface4 instanceof ze0)) {
                        xe0 xe0Var2 = new xe0();
                        xe0Var2.OooO0Oo = strongBinder4;
                        xe0Var = xe0Var2;
                    } else {
                        xe0Var = (ze0) iInterfaceQueryLocalInterface4;
                    }
                }
                ff1Var.OooO0oo = xe0Var;
                IBinder strongBinder5 = parcel.readStrongBinder();
                int i5 = bx1.OooO0oO;
                if (strongBinder5 == null) {
                    af0Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface(u7.OooO00o(new byte[]{-35, 2, 87, -64, 54, 112, 24, 91, -54, 8, 72, -64, 54, 113, 22, 70, -37, 31, 20, -73, 1, 89, 47, 114, -22, 46, 126, -88, 3, 91, 46, 110, -26, 39, 108, -90, 23, 74}, new byte[]{-66, 109, 58, -18, 85, 29, 121, 40}));
                    if (iInterfaceQueryLocalInterface5 == null || !(iInterfaceQueryLocalInterface5 instanceof bf0)) {
                        af0 af0Var2 = new af0();
                        af0Var2.OooO0Oo = strongBinder5;
                        af0Var = af0Var2;
                    } else {
                        af0Var = (bf0) iInterfaceQueryLocalInterface5;
                    }
                }
                ff1Var.OooO = af0Var;
                IBinder strongBinder6 = parcel.readStrongBinder();
                int i6 = se0.OooO0Oo;
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface(u7.OooO00o(new byte[]{28, -25, 59, -77, -86, -1, 52, 61, 11, -19, 36, -77, -86, -2, 58, 32, 26, -6, 120, -53, -111, -33, 12, 26, 59, -46, 15, -37, -109, -54, 24, 24, 58, -59, 6}, new byte[]{127, -120, 86, -99, -55, -110, 85, 78}));
                    if (iInterfaceQueryLocalInterface6 == null || !(iInterfaceQueryLocalInterface6 instanceof te0)) {
                        re0 re0Var = new re0();
                        re0Var.OooO0Oo = strongBinder6;
                        te0Var = re0Var;
                    } else {
                        te0Var = (te0) iInterfaceQueryLocalInterface6;
                    }
                }
                ff1Var.OooOO0 = te0Var;
                return ff1Var;
            case 5:
                return new nf1(parcel);
            case 6:
                ji1 ji1Var = new ji1();
                ji1Var.OooO0Oo = parcel.readInt();
                ji1Var.OooO0o0 = parcel.readInt();
                ji1Var.OooO0oO = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    ji1Var.OooO0o = iArr;
                    parcel.readIntArray(iArr);
                }
                return ji1Var;
            case 7:
                ki1 ki1Var = new ki1();
                ki1Var.OooO0Oo = parcel.readInt();
                ki1Var.OooO0o0 = parcel.readInt();
                int i8 = parcel.readInt();
                ki1Var.OooO0o = i8;
                if (i8 > 0) {
                    int[] iArr2 = new int[i8];
                    ki1Var.OooO0oO = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i9 = parcel.readInt();
                ki1Var.OooO0oo = i9;
                if (i9 > 0) {
                    int[] iArr3 = new int[i9];
                    ki1Var.OooO = iArr3;
                    parcel.readIntArray(iArr3);
                }
                ki1Var.OooOO0O = parcel.readInt() == 1;
                ki1Var.OooOO0o = parcel.readInt() == 1;
                ki1Var.OooOOO0 = parcel.readInt() == 1;
                ki1Var.OooOO0 = parcel.readArrayList(ji1.class.getClassLoader());
                return ki1Var;
            case 8:
                cj1 cj1Var = new cj1();
                cj1Var.OooO0Oo = parcel.readParcelable(cj1.class.getClassLoader());
                cj1Var.OooO0o0 = parcel.readInt();
                cj1Var.OooO0o = parcel.readInt();
                return cj1Var;
            case 9:
                return new up1(parcel);
            case 10:
                return new ir1(parcel);
            case 11:
                kr1 kr1Var = new kr1();
                kr1Var.OooO0Oo = parcel.readInt();
                kr1Var.OooO0o = parcel.readString();
                kr1Var.OooO0oO = parcel.readString();
                kr1Var.OooO0oo = parcel.readInt();
                kr1Var.OooO0o0 = parcel.readInt();
                kr1Var.OooO = parcel.readLong();
                return kr1Var;
            case 12:
                return new kx1(parcel);
            case 13:
                return new px1(parcel);
            case 14:
                return new tx1(parcel);
            case 15:
                int iOooOOOo = l33.OooOOOo(parcel);
                int iOooOO0o8 = 0;
                while (parcel.dataPosition() < iOooOOOo) {
                    int i10 = parcel.readInt();
                    char c = (char) i10;
                    if (c == 1) {
                        zOooOO0 = l33.OooOO0(i10, parcel);
                    } else if (c != 2) {
                        l33.OooOOOO(i10, parcel);
                    } else {
                        iOooOO0o8 = l33.OooOO0o(i10, parcel);
                    }
                }
                l33.OooO(iOooOOOo, parcel);
                return new mu0(zOooOO0, iOooOO0o8);
            case 16:
                int iOooOOOo2 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo2) {
                    int i11 = parcel.readInt();
                    char c2 = (char) i11;
                    if (c2 == 1) {
                        iOooOO0o7 = l33.OooOO0o(i11, parcel);
                    } else if (c2 != 2) {
                        l33.OooOOOO(i11, parcel);
                    } else {
                        arrayListOooO0oo2 = l33.OooO0oo(parcel, i11, wt0.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo2, parcel);
                return new gm1(iOooOO0o7, arrayListOooO0oo2);
            case 17:
                int iOooOOOo3 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo3) {
                    int i12 = parcel.readInt();
                    if (((char) i12) != 1) {
                        l33.OooOOOO(i12, parcel);
                    } else {
                        pendingIntent = (PendingIntent) l33.OooO0OO(parcel, i12, PendingIntent.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo3, parcel);
                return new nu0(pendingIntent);
            case 18:
                int iOooOOOo4 = l33.OooOOOo(parcel);
                int iOooOO0o9 = 0;
                while (parcel.dataPosition() < iOooOOOo4) {
                    int i13 = parcel.readInt();
                    char c3 = (char) i13;
                    if (c3 == 1) {
                        iOooOO0o6 = l33.OooOO0o(i13, parcel);
                    } else if (c3 == 2) {
                        iOooOO0o9 = l33.OooOO0o(i13, parcel);
                    } else if (c3 != 3) {
                        l33.OooOOOO(i13, parcel);
                    } else {
                        intent = (Intent) l33.OooO0OO(parcel, i13, Intent.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo4, parcel);
                return new n12(iOooOO0o6, iOooOO0o9, intent);
            case 19:
                int iOooOOOo5 = l33.OooOOOo(parcel);
                long jOooOOO0 = 0;
                String strOooO0Oo3 = null;
                String strOooO0Oo4 = null;
                String strOooO0Oo5 = null;
                String strOooO0Oo6 = null;
                Uri uri = null;
                String strOooO0Oo7 = null;
                String strOooO0Oo8 = null;
                ArrayList arrayListOooO0oo3 = null;
                String strOooO0Oo9 = null;
                String strOooO0Oo10 = null;
                int iOooOO0o10 = 0;
                while (parcel.dataPosition() < iOooOOOo5) {
                    int i14 = parcel.readInt();
                    switch ((char) i14) {
                        case 1:
                            iOooOO0o10 = l33.OooOO0o(i14, parcel);
                            break;
                        case 2:
                            strOooO0Oo3 = l33.OooO0Oo(i14, parcel);
                            break;
                        case 3:
                            strOooO0Oo4 = l33.OooO0Oo(i14, parcel);
                            break;
                        case 4:
                            strOooO0Oo5 = l33.OooO0Oo(i14, parcel);
                            break;
                        case 5:
                            strOooO0Oo6 = l33.OooO0Oo(i14, parcel);
                            break;
                        case 6:
                            uri = (Uri) l33.OooO0OO(parcel, i14, Uri.CREATOR);
                            break;
                        case 7:
                            strOooO0Oo7 = l33.OooO0Oo(i14, parcel);
                            break;
                        case '\b':
                            jOooOOO0 = l33.OooOOO0(i14, parcel);
                            break;
                        case '\t':
                            strOooO0Oo8 = l33.OooO0Oo(i14, parcel);
                            break;
                        case '\n':
                            arrayListOooO0oo3 = l33.OooO0oo(parcel, i14, Scope.CREATOR);
                            break;
                        case 11:
                            strOooO0Oo9 = l33.OooO0Oo(i14, parcel);
                            break;
                        case '\f':
                            strOooO0Oo10 = l33.OooO0Oo(i14, parcel);
                            break;
                        default:
                            l33.OooOOOO(i14, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo5, parcel);
                return new GoogleSignInAccount(iOooOO0o10, strOooO0Oo3, strOooO0Oo4, strOooO0Oo5, strOooO0Oo6, uri, strOooO0Oo7, jOooOOO0, strOooO0Oo8, arrayListOooO0oo3, strOooO0Oo9, strOooO0Oo10);
            case 20:
                int iOooOOOo6 = l33.OooOOOo(parcel);
                String strOooO0Oo11 = null;
                boolean zOooOO02 = false;
                String strOooO0Oo12 = null;
                while (parcel.dataPosition() < iOooOOOo6) {
                    int i15 = parcel.readInt();
                    char c4 = (char) i15;
                    if (c4 == 1) {
                        arrayListOooO0oo = l33.OooO0oo(parcel, i15, iz.CREATOR);
                    } else if (c4 == 2) {
                        zOooOO02 = l33.OooOO0(i15, parcel);
                    } else if (c4 == 3) {
                        strOooO0Oo11 = l33.OooO0Oo(i15, parcel);
                    } else if (c4 != 4) {
                        l33.OooOOOO(i15, parcel);
                    } else {
                        strOooO0Oo12 = l33.OooO0Oo(i15, parcel);
                    }
                }
                l33.OooO(iOooOOOo6, parcel);
                return new oOO0(arrayListOooO0oo, zOooOO02, strOooO0Oo11, strOooO0Oo12);
            case zzbcj.zzt.zzm /* 21 */:
                int iOooOOOo7 = l33.OooOOOo(parcel);
                boolean zOooOO03 = false;
                while (parcel.dataPosition() < iOooOOOo7) {
                    int i16 = parcel.readInt();
                    char c5 = (char) i16;
                    if (c5 == 1) {
                        iOooOO0o5 = l33.OooOO0o(i16, parcel);
                    } else if (c5 != 2) {
                        l33.OooOOOO(i16, parcel);
                    } else {
                        zOooOO03 = l33.OooOO0(i16, parcel);
                    }
                }
                l33.OooO(iOooOOOo7, parcel);
                return new ou0(iOooOO0o5, zOooOO03);
            case 22:
                int iOooOOOo8 = l33.OooOOOo(parcel);
                String strOooO0Oo13 = null;
                while (parcel.dataPosition() < iOooOOOo8) {
                    int i17 = parcel.readInt();
                    char c6 = (char) i17;
                    if (c6 == 1) {
                        arrayListOooO0o = l33.OooO0o(i17, parcel);
                    } else if (c6 != 2) {
                        l33.OooOOOO(i17, parcel);
                    } else {
                        strOooO0Oo13 = l33.OooO0Oo(i17, parcel);
                    }
                }
                l33.OooO(iOooOOOo8, parcel);
                return new m22(arrayListOooO0o, strOooO0Oo13);
            case 23:
                int iOooOOOo9 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo9) {
                    int i18 = parcel.readInt();
                    char c7 = (char) i18;
                    if (c7 == 1) {
                        iOooOO0o4 = l33.OooOO0o(i18, parcel);
                    } else if (c7 != 2) {
                        l33.OooOOOO(i18, parcel);
                    } else {
                        w22Var = (w22) l33.OooO0OO(parcel, i18, w22.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo9, parcel);
                return new q22(iOooOO0o4, w22Var);
            case 24:
                int iOooOOOo10 = l33.OooOOOo(parcel);
                x22 x22Var = null;
                while (parcel.dataPosition() < iOooOOOo10) {
                    int i19 = parcel.readInt();
                    char c8 = (char) i19;
                    if (c8 == 1) {
                        iOooOO0o3 = l33.OooOO0o(i19, parcel);
                    } else if (c8 == 2) {
                        ghVar = (gh) l33.OooO0OO(parcel, i19, gh.CREATOR);
                    } else if (c8 != 3) {
                        l33.OooOOOO(i19, parcel);
                    } else {
                        x22Var = (x22) l33.OooO0OO(parcel, i19, x22.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo10, parcel);
                return new r22(iOooOO0o3, ghVar, x22Var);
            case 25:
                int iOooOOOo11 = l33.OooOOOo(parcel);
                int iOooOO0o11 = -1;
                long jOooOOO02 = 0;
                long jOooOOO03 = 0;
                String strOooO0Oo14 = null;
                String strOooO0Oo15 = null;
                int iOooOO0o12 = 0;
                int iOooOO0o13 = 0;
                int iOooOO0o14 = 0;
                int iOooOO0o15 = 0;
                while (parcel.dataPosition() < iOooOOOo11) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            iOooOO0o12 = l33.OooOO0o(i20, parcel);
                            break;
                        case 2:
                            iOooOO0o13 = l33.OooOO0o(i20, parcel);
                            break;
                        case 3:
                            iOooOO0o14 = l33.OooOO0o(i20, parcel);
                            break;
                        case 4:
                            jOooOOO02 = l33.OooOOO0(i20, parcel);
                            break;
                        case 5:
                            jOooOOO03 = l33.OooOOO0(i20, parcel);
                            break;
                        case 6:
                            strOooO0Oo14 = l33.OooO0Oo(i20, parcel);
                            break;
                        case 7:
                            strOooO0Oo15 = l33.OooO0Oo(i20, parcel);
                            break;
                        case '\b':
                            iOooOO0o15 = l33.OooOO0o(i20, parcel);
                            break;
                        case '\t':
                            iOooOO0o11 = l33.OooOO0o(i20, parcel);
                            break;
                        default:
                            l33.OooOOOO(i20, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo11, parcel);
                return new wt0(iOooOO0o12, iOooOO0o13, iOooOO0o14, jOooOOO02, jOooOOO03, strOooO0Oo14, strOooO0Oo15, iOooOO0o15, iOooOO0o11);
            case 26:
                int iOooOOOo12 = l33.OooOOOo(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iOooOO0o16 = 0;
                while (parcel.dataPosition() < iOooOOOo12) {
                    int i21 = parcel.readInt();
                    char c9 = (char) i21;
                    if (c9 == 1) {
                        iOooOO0o2 = l33.OooOO0o(i21, parcel);
                    } else if (c9 == 2) {
                        account = (Account) l33.OooO0OO(parcel, i21, Account.CREATOR);
                    } else if (c9 == 3) {
                        iOooOO0o16 = l33.OooOO0o(i21, parcel);
                    } else if (c9 != 4) {
                        l33.OooOOOO(i21, parcel);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) l33.OooO0OO(parcel, i21, GoogleSignInAccount.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo12, parcel);
                return new w22(iOooOO0o2, account, iOooOO0o16, googleSignInAccount);
            case 27:
                int iOooOOOo13 = l33.OooOOOo(parcel);
                IBinder iBinderOooOO0O = null;
                gh ghVar2 = null;
                int iOooOO0o17 = 0;
                boolean zOooOO04 = false;
                boolean zOooOO05 = false;
                while (parcel.dataPosition() < iOooOOOo13) {
                    int i22 = parcel.readInt();
                    char c10 = (char) i22;
                    if (c10 == 1) {
                        iOooOO0o17 = l33.OooOO0o(i22, parcel);
                    } else if (c10 == 2) {
                        iBinderOooOO0O = l33.OooOO0O(i22, parcel);
                    } else if (c10 == 3) {
                        ghVar2 = (gh) l33.OooO0OO(parcel, i22, gh.CREATOR);
                    } else if (c10 == 4) {
                        zOooOO04 = l33.OooOO0(i22, parcel);
                    } else if (c10 != 5) {
                        l33.OooOOOO(i22, parcel);
                    } else {
                        zOooOO05 = l33.OooOO0(i22, parcel);
                    }
                }
                l33.OooO(iOooOOOo13, parcel);
                return new x22(iOooOO0o17, iBinderOooOO0O, ghVar2, zOooOO04, zOooOO05);
            case 28:
                int iOooOOOo14 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo14) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 1) {
                        iOooOO0o = l33.OooOO0o(i23, parcel);
                    } else if (c11 != 2) {
                        l33.OooOOOO(i23, parcel);
                    } else {
                        strOooO0Oo2 = l33.OooO0Oo(i23, parcel);
                    }
                }
                l33.OooO(iOooOOOo14, parcel);
                return new Scope(iOooOO0o, strOooO0Oo2);
            default:
                int iOooOOOo15 = l33.OooOOOo(parcel);
                String strOooO0Oo16 = null;
                int iOooOO0o18 = 0;
                String strOooO0Oo17 = null;
                while (parcel.dataPosition() < iOooOOOo15) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 2) {
                        iOooOO0o18 = l33.OooOO0o(i24, parcel);
                    } else if (c12 == 3) {
                        strOooO0Oo = l33.OooO0Oo(i24, parcel);
                    } else if (c12 == 4) {
                        strOooO0Oo16 = l33.OooO0Oo(i24, parcel);
                    } else if (c12 != 5) {
                        l33.OooOOOO(i24, parcel);
                    } else {
                        strOooO0Oo17 = l33.OooO0Oo(i24, parcel);
                    }
                }
                l33.OooO(iOooOOOo15, parcel);
                a13 a13Var = new a13();
                a13Var.OooO0Oo = iOooOO0o18;
                a13Var.OooO0o0 = strOooO0Oo;
                a13Var.OooO0o = strOooO0Oo16;
                a13Var.OooO0oO = strOooO0Oo17;
                return a13Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new c41[i];
            case 1:
                return new k41[i];
            case 2:
                return new q81[i];
            case 3:
                return new le1[i];
            case 4:
                return new ff1[i];
            case 5:
                return new nf1[i];
            case 6:
                return new ji1[i];
            case 7:
                return new ki1[i];
            case 8:
                return new cj1[i];
            case 9:
                return new up1[i];
            case 10:
                return new ir1[i];
            case 11:
                return new kr1[i];
            case 12:
                return new kx1[i];
            case 13:
                return new px1[i];
            case 14:
                return new tx1[i];
            case 15:
                return new mu0[i];
            case 16:
                return new gm1[i];
            case 17:
                return new nu0[i];
            case 18:
                return new n12[i];
            case 19:
                return new GoogleSignInAccount[i];
            case 20:
                return new oOO0[i];
            case zzbcj.zzt.zzm /* 21 */:
                return new ou0[i];
            case 22:
                return new m22[i];
            case 23:
                return new q22[i];
            case 24:
                return new r22[i];
            case 25:
                return new wt0[i];
            case 26:
                return new w22[i];
            case 27:
                return new x22[i];
            case 28:
                return new Scope[i];
            default:
                return new a13[i];
        }
    }
}

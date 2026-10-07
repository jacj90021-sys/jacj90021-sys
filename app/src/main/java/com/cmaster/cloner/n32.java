package com.cmaster.cloner;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class n32 implements Parcelable.Creator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ n32(int i) {
        this.OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        String strOooO0Oo = null;
        Bundle bundleOooO00o = null;
        IBinder iBinderOooOO0O = null;
        String[] strArrOooO0o0 = null;
        String strOooO0Oo2 = null;
        String strOooO0Oo3 = null;
        String strOooO0Oo4 = null;
        String strOooO0Oo5 = null;
        String strOooO0Oo6 = null;
        String strOooO0Oo7 = null;
        String strOooO0Oo8 = null;
        String strOooO0Oo9 = null;
        String strOooO0Oo10 = null;
        PendingIntent pendingIntent = null;
        String strOooO0Oo11 = null;
        String strOooO0Oo12 = null;
        String strOooO0Oo13 = null;
        String strOooO0Oo14 = null;
        int iOooOO0o = 0;
        boolean zOooOO0 = false;
        int iOooOO0o2 = 0;
        boolean zOooOO02 = false;
        int iOooOO0o3 = 0;
        int iOooOO0o4 = 0;
        int iOooOO0o5 = 0;
        int iOooOO0o6 = 0;
        int iOooOO0o7 = 0;
        boolean zOooOO03 = false;
        int iOooOO0o8 = 0;
        int iOooOO0o9 = 0;
        int iOooOO0o10 = 0;
        int iOooOO0o11 = 0;
        int iOooOO0o12 = 0;
        switch (this.OooO00o) {
            case 0:
                int iOooOOOo = l33.OooOOOo(parcel);
                double d = 0.0d;
                double d2 = 0.0d;
                while (parcel.dataPosition() < iOooOOOo) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 2) {
                        l33.OooOOo0(parcel, i, 8);
                        d = parcel.readDouble();
                    } else if (c != 3) {
                        l33.OooOOOO(i, parcel);
                    } else {
                        l33.OooOOo0(parcel, i, 8);
                        d2 = parcel.readDouble();
                    }
                }
                l33.OooO(iOooOOOo, parcel);
                n23 n23Var = new n23();
                n23Var.OooO0Oo = d;
                n23Var.OooO0o0 = d2;
                return n23Var;
            case 1:
                int iOooOOOo2 = l33.OooOOOo(parcel);
                String strOooO0Oo15 = null;
                String strOooO0Oo16 = null;
                String strOooO0Oo17 = null;
                String strOooO0Oo18 = null;
                String strOooO0Oo19 = null;
                String strOooO0Oo20 = null;
                while (parcel.dataPosition() < iOooOOOo2) {
                    int i2 = parcel.readInt();
                    switch ((char) i2) {
                        case 2:
                            strOooO0Oo = l33.OooO0Oo(i2, parcel);
                            break;
                        case 3:
                            strOooO0Oo15 = l33.OooO0Oo(i2, parcel);
                            break;
                        case 4:
                            strOooO0Oo16 = l33.OooO0Oo(i2, parcel);
                            break;
                        case 5:
                            strOooO0Oo17 = l33.OooO0Oo(i2, parcel);
                            break;
                        case 6:
                            strOooO0Oo18 = l33.OooO0Oo(i2, parcel);
                            break;
                        case 7:
                            strOooO0Oo19 = l33.OooO0Oo(i2, parcel);
                            break;
                        case '\b':
                            strOooO0Oo20 = l33.OooO0Oo(i2, parcel);
                            break;
                        default:
                            l33.OooOOOO(i2, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo2, parcel);
                t33 t33Var = new t33();
                t33Var.OooO0Oo = strOooO0Oo;
                t33Var.OooO0o0 = strOooO0Oo15;
                t33Var.OooO0o = strOooO0Oo16;
                t33Var.OooO0oO = strOooO0Oo17;
                t33Var.OooO0oo = strOooO0Oo18;
                t33Var.OooO = strOooO0Oo19;
                t33Var.OooOO0 = strOooO0Oo20;
                return t33Var;
            case 2:
                int iOooOOOo3 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo3) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 2) {
                        iOooOO0o = l33.OooOO0o(i3, parcel);
                    } else if (c2 != 3) {
                        l33.OooOOOO(i3, parcel);
                    } else {
                        strOooO0Oo14 = l33.OooO0Oo(i3, parcel);
                    }
                }
                l33.OooO(iOooOOOo3, parcel);
                b53 b53Var = new b53();
                b53Var.OooO0Oo = iOooOO0o;
                b53Var.OooO0o0 = strOooO0Oo14;
                return b53Var;
            case 3:
                int iOooOOOo4 = l33.OooOOOo(parcel);
                String strOooO0Oo21 = null;
                while (parcel.dataPosition() < iOooOOOo4) {
                    int i4 = parcel.readInt();
                    char c3 = (char) i4;
                    if (c3 == 2) {
                        strOooO0Oo13 = l33.OooO0Oo(i4, parcel);
                    } else if (c3 != 3) {
                        l33.OooOOOO(i4, parcel);
                    } else {
                        strOooO0Oo21 = l33.OooO0Oo(i4, parcel);
                    }
                }
                l33.OooO(iOooOOOo4, parcel);
                b63 b63Var = new b63();
                b63Var.OooO0Oo = strOooO0Oo13;
                b63Var.OooO0o0 = strOooO0Oo21;
                return b63Var;
            case 4:
                int iOooOOOo5 = l33.OooOOOo(parcel);
                String strOooO0Oo22 = null;
                while (parcel.dataPosition() < iOooOOOo5) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 2) {
                        strOooO0Oo12 = l33.OooO0Oo(i5, parcel);
                    } else if (c4 != 3) {
                        l33.OooOOOO(i5, parcel);
                    } else {
                        strOooO0Oo22 = l33.OooO0Oo(i5, parcel);
                    }
                }
                l33.OooO(iOooOOOo5, parcel);
                c73 c73Var = new c73();
                c73Var.OooO0Oo = strOooO0Oo12;
                c73Var.OooO0o0 = strOooO0Oo22;
                return c73Var;
            case 5:
                int iOooOOOo6 = l33.OooOOOo(parcel);
                String strOooO0Oo23 = null;
                while (parcel.dataPosition() < iOooOOOo6) {
                    int i6 = parcel.readInt();
                    char c5 = (char) i6;
                    if (c5 == 2) {
                        strOooO0Oo11 = l33.OooO0Oo(i6, parcel);
                    } else if (c5 == 3) {
                        strOooO0Oo23 = l33.OooO0Oo(i6, parcel);
                    } else if (c5 != 4) {
                        l33.OooOOOO(i6, parcel);
                    } else {
                        iOooOO0o12 = l33.OooOO0o(i6, parcel);
                    }
                }
                l33.OooO(iOooOOOo6, parcel);
                m83 m83Var = new m83();
                m83Var.OooO0Oo = strOooO0Oo11;
                m83Var.OooO0o0 = strOooO0Oo23;
                m83Var.OooO0o = iOooOO0o12;
                return m83Var;
            case 6:
                int iOooOOOo7 = l33.OooOOOo(parcel);
                boolean zOooOO04 = false;
                while (parcel.dataPosition() < iOooOOOo7) {
                    int i7 = parcel.readInt();
                    char c6 = (char) i7;
                    if (c6 == 2) {
                        iOooOO0o11 = l33.OooOO0o(i7, parcel);
                    } else if (c6 != 3) {
                        l33.OooOOOO(i7, parcel);
                    } else {
                        zOooOO04 = l33.OooOO0(i7, parcel);
                    }
                }
                l33.OooO(iOooOOOo7, parcel);
                l42 l42Var = new l42();
                l42Var.OooO0Oo = iOooOO0o11;
                l42Var.OooO0o0 = zOooOO04;
                return l42Var;
            case 7:
                int iOooOOOo8 = l33.OooOOOo(parcel);
                int iOooOO0o13 = 0;
                int iOooOO0o14 = 0;
                int iOooOO0o15 = 0;
                boolean zOooOO05 = false;
                boolean zOooOO06 = false;
                while (parcel.dataPosition() < iOooOOOo8) {
                    int i8 = parcel.readInt();
                    char c7 = (char) i8;
                    if (c7 == 1) {
                        iOooOO0o13 = l33.OooOO0o(i8, parcel);
                    } else if (c7 == 2) {
                        zOooOO05 = l33.OooOO0(i8, parcel);
                    } else if (c7 == 3) {
                        zOooOO06 = l33.OooOO0(i8, parcel);
                    } else if (c7 == 4) {
                        iOooOO0o14 = l33.OooOO0o(i8, parcel);
                    } else if (c7 != 5) {
                        l33.OooOOOO(i8, parcel);
                    } else {
                        iOooOO0o15 = l33.OooOO0o(i8, parcel);
                    }
                }
                l33.OooO(iOooOOOo8, parcel);
                return new yb1(iOooOO0o13, iOooOO0o14, iOooOO0o15, zOooOO05, zOooOO06);
            case 8:
                int iOooOOOo9 = l33.OooOOOo(parcel);
                int iOooOO0o16 = 0;
                int iOooOO0o17 = 0;
                int iOooOO0o18 = 0;
                int iOooOO0o19 = 0;
                long jOooOOO0 = 0;
                while (parcel.dataPosition() < iOooOOOo9) {
                    int i9 = parcel.readInt();
                    char c8 = (char) i9;
                    if (c8 == 2) {
                        iOooOO0o16 = l33.OooOO0o(i9, parcel);
                    } else if (c8 == 3) {
                        iOooOO0o17 = l33.OooOO0o(i9, parcel);
                    } else if (c8 == 4) {
                        iOooOO0o18 = l33.OooOO0o(i9, parcel);
                    } else if (c8 == 5) {
                        jOooOOO0 = l33.OooOOO0(i9, parcel);
                    } else if (c8 != 6) {
                        l33.OooOOOO(i9, parcel);
                    } else {
                        iOooOO0o19 = l33.OooOO0o(i9, parcel);
                    }
                }
                l33.OooO(iOooOOOo9, parcel);
                return new i52(iOooOO0o16, iOooOO0o17, iOooOO0o18, jOooOOO0, iOooOO0o19);
            case 9:
                int iOooOOOo10 = l33.OooOOOo(parcel);
                String strOooO0Oo24 = null;
                int iOooOO0o20 = 0;
                while (parcel.dataPosition() < iOooOOOo10) {
                    int i10 = parcel.readInt();
                    char c9 = (char) i10;
                    if (c9 == 1) {
                        iOooOO0o10 = l33.OooOO0o(i10, parcel);
                    } else if (c9 == 2) {
                        iOooOO0o20 = l33.OooOO0o(i10, parcel);
                    } else if (c9 == 3) {
                        pendingIntent = (PendingIntent) l33.OooO0OO(parcel, i10, PendingIntent.CREATOR);
                    } else if (c9 != 4) {
                        l33.OooOOOO(i10, parcel);
                    } else {
                        strOooO0Oo24 = l33.OooO0Oo(i10, parcel);
                    }
                }
                l33.OooO(iOooOOOo10, parcel);
                return new gh(iOooOO0o10, iOooOO0o20, pendingIntent, strOooO0Oo24);
            case 10:
                int iOooOOOo11 = l33.OooOOOo(parcel);
                PendingIntent pendingIntent2 = null;
                int iOooOO0o21 = 0;
                gh ghVar = null;
                while (parcel.dataPosition() < iOooOOOo11) {
                    int i11 = parcel.readInt();
                    char c10 = (char) i11;
                    if (c10 == 1) {
                        iOooOO0o21 = l33.OooOO0o(i11, parcel);
                    } else if (c10 == 2) {
                        strOooO0Oo10 = l33.OooO0Oo(i11, parcel);
                    } else if (c10 == 3) {
                        pendingIntent2 = (PendingIntent) l33.OooO0OO(parcel, i11, PendingIntent.CREATOR);
                    } else if (c10 != 4) {
                        l33.OooOOOO(i11, parcel);
                    } else {
                        ghVar = (gh) l33.OooO0OO(parcel, i11, gh.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo11, parcel);
                return new Status(iOooOO0o21, strOooO0Oo10, pendingIntent2, ghVar);
            case 11:
                int iOooOOOo12 = l33.OooOOOo(parcel);
                String strOooO0Oo25 = null;
                String strOooO0Oo26 = null;
                while (parcel.dataPosition() < iOooOOOo12) {
                    int i12 = parcel.readInt();
                    char c11 = (char) i12;
                    if (c11 == 1) {
                        strOooO0Oo9 = l33.OooO0Oo(i12, parcel);
                    } else if (c11 == 2) {
                        strOooO0Oo25 = l33.OooO0Oo(i12, parcel);
                    } else if (c11 != 3) {
                        l33.OooOOOO(i12, parcel);
                    } else {
                        strOooO0Oo26 = l33.OooO0Oo(i12, parcel);
                    }
                }
                l33.OooO(iOooOOOo12, parcel);
                return new f32(strOooO0Oo9, strOooO0Oo25, strOooO0Oo26);
            case 12:
                int iOooOOOo13 = l33.OooOOOo(parcel);
                String strOooO0Oo27 = null;
                String strOooO0Oo28 = null;
                String strOooO0Oo29 = null;
                String strOooO0Oo30 = null;
                String strOooO0Oo31 = null;
                String strOooO0Oo32 = null;
                String strOooO0Oo33 = null;
                Intent intent = null;
                IBinder iBinderOooOO0O2 = null;
                boolean zOooOO07 = false;
                while (parcel.dataPosition() < iOooOOOo13) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            strOooO0Oo27 = l33.OooO0Oo(i13, parcel);
                            break;
                        case 3:
                            strOooO0Oo28 = l33.OooO0Oo(i13, parcel);
                            break;
                        case 4:
                            strOooO0Oo29 = l33.OooO0Oo(i13, parcel);
                            break;
                        case 5:
                            strOooO0Oo30 = l33.OooO0Oo(i13, parcel);
                            break;
                        case 6:
                            strOooO0Oo31 = l33.OooO0Oo(i13, parcel);
                            break;
                        case 7:
                            strOooO0Oo32 = l33.OooO0Oo(i13, parcel);
                            break;
                        case '\b':
                            strOooO0Oo33 = l33.OooO0Oo(i13, parcel);
                            break;
                        case '\t':
                            intent = (Intent) l33.OooO0OO(parcel, i13, Intent.CREATOR);
                            break;
                        case '\n':
                            iBinderOooOO0O2 = l33.OooOO0O(i13, parcel);
                            break;
                        case 11:
                            zOooOO07 = l33.OooOO0(i13, parcel);
                            break;
                        default:
                            l33.OooOOOO(i13, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo13, parcel);
                return new ib2(strOooO0Oo27, strOooO0Oo28, strOooO0Oo29, strOooO0Oo30, strOooO0Oo31, strOooO0Oo32, strOooO0Oo33, intent, iBinderOooOO0O2, zOooOO07);
            case 13:
                int iOooOOOo14 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo14) {
                    int i14 = parcel.readInt();
                    char c12 = (char) i14;
                    if (c12 == 1) {
                        strOooO0Oo8 = l33.OooO0Oo(i14, parcel);
                    } else if (c12 != 2) {
                        l33.OooOOOO(i14, parcel);
                    } else {
                        iOooOO0o9 = l33.OooOO0o(i14, parcel);
                    }
                }
                l33.OooO(iOooOOOo14, parcel);
                return new m72(strOooO0Oo8, iOooOO0o9);
            case 14:
                int iOooOOOo15 = l33.OooOOOo(parcel);
                long jOooOOO02 = -1;
                while (parcel.dataPosition() < iOooOOOo15) {
                    int i15 = parcel.readInt();
                    char c13 = (char) i15;
                    if (c13 == 1) {
                        strOooO0Oo7 = l33.OooO0Oo(i15, parcel);
                    } else if (c13 == 2) {
                        iOooOO0o8 = l33.OooOO0o(i15, parcel);
                    } else if (c13 != 3) {
                        l33.OooOOOO(i15, parcel);
                    } else {
                        jOooOOO02 = l33.OooOOO0(i15, parcel);
                    }
                }
                l33.OooO(iOooOOOo15, parcel);
                return new iz(iOooOO0o8, jOooOOO02, strOooO0Oo7);
            case 15:
                int iOooOOOo16 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo16) {
                    int i16 = parcel.readInt();
                    if (((char) i16) != 1) {
                        l33.OooOOOO(i16, parcel);
                    } else {
                        zOooOO03 = l33.OooOO0(i16, parcel);
                    }
                }
                l33.OooO(iOooOOOo16, parcel);
                return new oO00000o(zOooOO03);
            case 16:
                int iOooOOOo17 = l33.OooOOOo(parcel);
                String strOooO0Oo34 = null;
                while (parcel.dataPosition() < iOooOOOo17) {
                    int i17 = parcel.readInt();
                    char c14 = (char) i17;
                    if (c14 == 1) {
                        strOooO0Oo6 = l33.OooO0Oo(i17, parcel);
                    } else if (c14 != 2) {
                        l33.OooOOOO(i17, parcel);
                    } else {
                        strOooO0Oo34 = l33.OooO0Oo(i17, parcel);
                    }
                }
                l33.OooO(iOooOOOo17, parcel);
                return new hb2(strOooO0Oo6, strOooO0Oo34);
            case 17:
                int iOooOOOo18 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo18) {
                    int i18 = parcel.readInt();
                    char c15 = (char) i18;
                    if (c15 == 1) {
                        strOooO0Oo5 = l33.OooO0Oo(i18, parcel);
                    } else if (c15 != 2) {
                        l33.OooOOOO(i18, parcel);
                    } else {
                        iOooOO0o7 = l33.OooOO0o(i18, parcel);
                    }
                }
                l33.OooO(iOooOOOo18, parcel);
                return new ab2(strOooO0Oo5, iOooOO0o7);
            case 18:
                int iOooOOOo19 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo19) {
                    int i19 = parcel.readInt();
                    if (((char) i19) != 2) {
                        l33.OooOOOO(i19, parcel);
                    } else {
                        iOooOO0o6 = l33.OooOO0o(i19, parcel);
                    }
                }
                l33.OooO(iOooOOOo19, parcel);
                return new oi2(iOooOO0o6);
            case 19:
                int iOooOOOo20 = l33.OooOOOo(parcel);
                String strOooO0Oo35 = null;
                String strOooO0Oo36 = null;
                th2 th2Var = null;
                IBinder iBinderOooOO0O3 = null;
                int iOooOO0o22 = 0;
                while (parcel.dataPosition() < iOooOOOo20) {
                    int i20 = parcel.readInt();
                    char c16 = (char) i20;
                    if (c16 == 1) {
                        iOooOO0o22 = l33.OooOO0o(i20, parcel);
                    } else if (c16 == 2) {
                        strOooO0Oo35 = l33.OooO0Oo(i20, parcel);
                    } else if (c16 == 3) {
                        strOooO0Oo36 = l33.OooO0Oo(i20, parcel);
                    } else if (c16 == 4) {
                        th2Var = (th2) l33.OooO0OO(parcel, i20, th2.CREATOR);
                    } else if (c16 != 5) {
                        l33.OooOOOO(i20, parcel);
                    } else {
                        iBinderOooOO0O3 = l33.OooOO0O(i20, parcel);
                    }
                }
                l33.OooO(iOooOOOo20, parcel);
                return new th2(iOooOO0o22, strOooO0Oo35, strOooO0Oo36, th2Var, iBinderOooOO0O3);
            case 20:
                int iOooOOOo21 = l33.OooOOOo(parcel);
                int iOooOO0o23 = 0;
                while (parcel.dataPosition() < iOooOOOo21) {
                    int i21 = parcel.readInt();
                    char c17 = (char) i21;
                    if (c17 == 1) {
                        iOooOO0o5 = l33.OooOO0o(i21, parcel);
                    } else if (c17 == 2) {
                        iOooOO0o23 = l33.OooOO0o(i21, parcel);
                    } else if (c17 != 3) {
                        l33.OooOOOO(i21, parcel);
                    } else {
                        strOooO0Oo4 = l33.OooO0Oo(i21, parcel);
                    }
                }
                l33.OooO(iOooOOOo21, parcel);
                return new kk2(iOooOO0o5, iOooOO0o23, strOooO0Oo4);
            case zzbcj.zzt.zzm /* 21 */:
                int iOooOOOo22 = l33.OooOOOo(parcel);
                kz2 kz2Var = null;
                int iOooOO0o24 = 0;
                while (parcel.dataPosition() < iOooOOOo22) {
                    int i22 = parcel.readInt();
                    char c18 = (char) i22;
                    if (c18 == 1) {
                        strOooO0Oo3 = l33.OooO0Oo(i22, parcel);
                    } else if (c18 == 2) {
                        iOooOO0o4 = l33.OooOO0o(i22, parcel);
                    } else if (c18 == 3) {
                        kz2Var = (kz2) l33.OooO0OO(parcel, i22, kz2.CREATOR);
                    } else if (c18 != 4) {
                        l33.OooOOOO(i22, parcel);
                    } else {
                        iOooOO0o24 = l33.OooOO0o(i22, parcel);
                    }
                }
                l33.OooO(iOooOOOo22, parcel);
                return new wl2(strOooO0Oo3, iOooOO0o4, kz2Var, iOooOO0o24);
            case 22:
                int iOooOOOo23 = l33.OooOOOo(parcel);
                int iOooOO0o25 = 0;
                while (parcel.dataPosition() < iOooOOOo23) {
                    int i23 = parcel.readInt();
                    char c19 = (char) i23;
                    if (c19 == 1) {
                        iOooOO0o3 = l33.OooOO0o(i23, parcel);
                    } else if (c19 != 2) {
                        l33.OooOOOO(i23, parcel);
                    } else {
                        iOooOO0o25 = l33.OooOO0o(i23, parcel);
                    }
                }
                l33.OooO(iOooOOOo23, parcel);
                return new bm2(iOooOO0o3, iOooOO0o25);
            case 23:
                int iOooOOOo24 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo24) {
                    int i24 = parcel.readInt();
                    if (((char) i24) != 15) {
                        l33.OooOOOO(i24, parcel);
                    } else {
                        strOooO0Oo2 = l33.OooO0Oo(i24, parcel);
                    }
                }
                l33.OooO(iOooOOOo24, parcel);
                return new fm2(strOooO0Oo2);
            case 24:
                int iOooOOOo25 = l33.OooOOOo(parcel);
                boolean zOooOO08 = false;
                boolean zOooOO09 = false;
                while (parcel.dataPosition() < iOooOOOo25) {
                    int i25 = parcel.readInt();
                    char c20 = (char) i25;
                    if (c20 == 2) {
                        zOooOO02 = l33.OooOO0(i25, parcel);
                    } else if (c20 == 3) {
                        zOooOO08 = l33.OooOO0(i25, parcel);
                    } else if (c20 != 4) {
                        l33.OooOOOO(i25, parcel);
                    } else {
                        zOooOO09 = l33.OooOO0(i25, parcel);
                    }
                }
                l33.OooO(iOooOOOo25, parcel);
                return new wm2(zOooOO02, zOooOO08, zOooOO09);
            case 25:
                int iOooOOOo26 = l33.OooOOOo(parcel);
                while (parcel.dataPosition() < iOooOOOo26) {
                    int i26 = parcel.readInt();
                    char c21 = (char) i26;
                    if (c21 == 2) {
                        iOooOO0o2 = l33.OooOO0o(i26, parcel);
                    } else if (c21 != 3) {
                        l33.OooOOOO(i26, parcel);
                    } else {
                        strArrOooO0o0 = l33.OooO0o0(i26, parcel);
                    }
                }
                l33.OooO(iOooOOOo26, parcel);
                vq2 vq2Var = new vq2();
                vq2Var.OooO0Oo = iOooOO0o2;
                vq2Var.OooO0o0 = strArrOooO0o0;
                return vq2Var;
            case 26:
                int iOooOOOo27 = l33.OooOOOo(parcel);
                IBinder iBinderOooOO0O4 = null;
                while (parcel.dataPosition() < iOooOOOo27) {
                    int i27 = parcel.readInt();
                    char c22 = (char) i27;
                    if (c22 == 1) {
                        zOooOO0 = l33.OooOO0(i27, parcel);
                    } else if (c22 == 2) {
                        iBinderOooOO0O = l33.OooOO0O(i27, parcel);
                    } else if (c22 != 3) {
                        l33.OooOOOO(i27, parcel);
                    } else {
                        iBinderOooOO0O4 = l33.OooOO0O(i27, parcel);
                    }
                }
                l33.OooO(iOooOOOo27, parcel);
                return new v51(zOooOO0, iBinderOooOO0O, iBinderOooOO0O4);
            case 27:
                int iOooOOOo28 = l33.OooOOOo(parcel);
                iz[] izVarArr = null;
                int iOooOO0o26 = 0;
                hh hhVar = null;
                while (parcel.dataPosition() < iOooOOOo28) {
                    int i28 = parcel.readInt();
                    char c23 = (char) i28;
                    if (c23 == 1) {
                        bundleOooO00o = l33.OooO00o(i28, parcel);
                    } else if (c23 == 2) {
                        izVarArr = (iz[]) l33.OooO0oO(parcel, i28, iz.CREATOR);
                    } else if (c23 == 3) {
                        iOooOO0o26 = l33.OooOO0o(i28, parcel);
                    } else if (c23 != 4) {
                        l33.OooOOOO(i28, parcel);
                    } else {
                        hhVar = (hh) l33.OooO0OO(parcel, i28, hh.CREATOR);
                    }
                }
                l33.OooO(iOooOOOo28, parcel);
                cv2 cv2Var = new cv2();
                cv2Var.OooO0Oo = bundleOooO00o;
                cv2Var.OooO0o0 = izVarArr;
                cv2Var.OooO0o = iOooOO0o26;
                cv2Var.OooO0oO = hhVar;
                return cv2Var;
            case 28:
                int iOooOOOo29 = l33.OooOOOo(parcel);
                yb1 yb1Var = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean zOooOO010 = false;
                boolean zOooOO011 = false;
                int iOooOO0o27 = 0;
                while (parcel.dataPosition() < iOooOOOo29) {
                    int i29 = parcel.readInt();
                    switch ((char) i29) {
                        case 1:
                            yb1Var = (yb1) l33.OooO0OO(parcel, i29, yb1.CREATOR);
                            break;
                        case 2:
                            zOooOO010 = l33.OooOO0(i29, parcel);
                            break;
                        case 3:
                            zOooOO011 = l33.OooOO0(i29, parcel);
                            break;
                        case 4:
                            int iOooOOO = l33.OooOOO(i29, parcel);
                            int iDataPosition = parcel.dataPosition();
                            if (iOooOOO != 0) {
                                int[] iArrCreateIntArray = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition + iOooOOO);
                                iArr = iArrCreateIntArray;
                                break;
                            } else {
                                iArr = null;
                                break;
                            }
                        case 5:
                            iOooOO0o27 = l33.OooOO0o(i29, parcel);
                            break;
                        case 6:
                            int iOooOOO2 = l33.OooOOO(i29, parcel);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iOooOOO2 != 0) {
                                int[] iArrCreateIntArray2 = parcel.createIntArray();
                                parcel.setDataPosition(iDataPosition2 + iOooOOO2);
                                iArr2 = iArrCreateIntArray2;
                                break;
                            } else {
                                iArr2 = null;
                                break;
                            }
                        default:
                            l33.OooOOOO(i29, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo29, parcel);
                return new hh(yb1Var, zOooOO010, zOooOO011, iArr, iOooOO0o27, iArr2);
            default:
                int iOooOOOo30 = l33.OooOOOo(parcel);
                float f = 0.0f;
                String strOooO0Oo37 = null;
                boolean zOooOO012 = false;
                boolean zOooOO013 = false;
                boolean zOooOO014 = false;
                int iOooOO0o28 = 0;
                boolean zOooOO015 = false;
                boolean zOooOO016 = false;
                boolean zOooOO017 = false;
                while (parcel.dataPosition() < iOooOOOo30) {
                    int i30 = parcel.readInt();
                    switch ((char) i30) {
                        case 2:
                            zOooOO012 = l33.OooOO0(i30, parcel);
                            break;
                        case 3:
                            zOooOO013 = l33.OooOO0(i30, parcel);
                            break;
                        case 4:
                            strOooO0Oo37 = l33.OooO0Oo(i30, parcel);
                            break;
                        case 5:
                            zOooOO014 = l33.OooOO0(i30, parcel);
                            break;
                        case 6:
                            l33.OooOOo0(parcel, i30, 4);
                            f = parcel.readFloat();
                            break;
                        case 7:
                            iOooOO0o28 = l33.OooOO0o(i30, parcel);
                            break;
                        case '\b':
                            zOooOO015 = l33.OooOO0(i30, parcel);
                            break;
                        case '\t':
                            zOooOO016 = l33.OooOO0(i30, parcel);
                            break;
                        case '\n':
                            zOooOO017 = l33.OooOO0(i30, parcel);
                            break;
                        default:
                            l33.OooOOOO(i30, parcel);
                            break;
                    }
                }
                l33.OooO(iOooOOOo30, parcel);
                return new kx2(zOooOO012, zOooOO013, strOooO0Oo37, zOooOO014, f, iOooOO0o28, zOooOO015, zOooOO016, zOooOO017);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new n23[i];
            case 1:
                return new t33[i];
            case 2:
                return new b53[i];
            case 3:
                return new b63[i];
            case 4:
                return new c73[i];
            case 5:
                return new m83[i];
            case 6:
                return new l42[i];
            case 7:
                return new yb1[i];
            case 8:
                return new i52[i];
            case 9:
                return new gh[i];
            case 10:
                return new Status[i];
            case 11:
                return new f32[i];
            case 12:
                return new ib2[i];
            case 13:
                return new m72[i];
            case 14:
                return new iz[i];
            case 15:
                return new oO00000o[i];
            case 16:
                return new hb2[i];
            case 17:
                return new ab2[i];
            case 18:
                return new oi2[i];
            case 19:
                return new th2[i];
            case 20:
                return new kk2[i];
            case zzbcj.zzt.zzm /* 21 */:
                return new wl2[i];
            case 22:
                return new bm2[i];
            case 23:
                return new fm2[i];
            case 24:
                return new wm2[i];
            case 25:
                return new vq2[i];
            case 26:
                return new v51[i];
            case 27:
                return new cv2[i];
            case 28:
                return new hh[i];
            default:
                return new kx2[i];
        }
    }
}

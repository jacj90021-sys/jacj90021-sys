package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.cmaster.cloner.ns1;
import com.cmaster.cloner.os1;
import com.cmaster.cloner.ra;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(ns1 ns1Var) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.OooO00o = -1;
        iconCompat.OooO0OO = null;
        iconCompat.OooO0Oo = null;
        iconCompat.OooO0o0 = 0;
        iconCompat.OooO0o = 0;
        iconCompat.OooO0oO = null;
        iconCompat.OooO0oo = IconCompat.OooOO0O;
        iconCompat.OooO = null;
        iconCompat.OooO00o = !ns1Var.OooO0o0(1) ? -1 : ((os1) ns1Var).OooO0o0.readInt();
        byte[] bArr = iconCompat.OooO0OO;
        if (ns1Var.OooO0o0(2)) {
            Parcel parcel = ((os1) ns1Var).OooO0o0;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.OooO0OO = bArr;
        iconCompat.OooO0Oo = ns1Var.OooO0o(iconCompat.OooO0Oo, 3);
        int i2 = iconCompat.OooO0o0;
        if (ns1Var.OooO0o0(4)) {
            i2 = ((os1) ns1Var).OooO0o0.readInt();
        }
        iconCompat.OooO0o0 = i2;
        int i3 = iconCompat.OooO0o;
        if (ns1Var.OooO0o0(5)) {
            i3 = ((os1) ns1Var).OooO0o0.readInt();
        }
        iconCompat.OooO0o = i3;
        iconCompat.OooO0oO = (ColorStateList) ns1Var.OooO0o(iconCompat.OooO0oO, 6);
        String string = iconCompat.OooO;
        if (ns1Var.OooO0o0(7)) {
            string = ((os1) ns1Var).OooO0o0.readString();
        }
        iconCompat.OooO = string;
        String string2 = iconCompat.OooOO0;
        if (ns1Var.OooO0o0(8)) {
            string2 = ((os1) ns1Var).OooO0o0.readString();
        }
        iconCompat.OooOO0 = string2;
        iconCompat.OooO0oo = PorterDuff.Mode.valueOf(iconCompat.OooO);
        switch (iconCompat.OooO00o) {
            case -1:
                Parcelable parcelable = iconCompat.OooO0Oo;
                if (parcelable != null) {
                    iconCompat.OooO0O0 = parcelable;
                    return iconCompat;
                }
                ra.OooOOO("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.OooO0Oo;
                if (parcelable2 != null) {
                    iconCompat.OooO0O0 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.OooO0OO;
                iconCompat.OooO0O0 = bArr3;
                iconCompat.OooO00o = 3;
                iconCompat.OooO0o0 = 0;
                iconCompat.OooO0o = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.OooO0OO, Charset.forName("UTF-16"));
                iconCompat.OooO0O0 = str;
                if (iconCompat.OooO00o == 2 && iconCompat.OooOO0 == null) {
                    iconCompat.OooOO0 = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.OooO0O0 = iconCompat.OooO0OO;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, ns1 ns1Var) {
        ns1Var.getClass();
        iconCompat.OooO = iconCompat.OooO0oo.name();
        switch (iconCompat.OooO00o) {
            case -1:
                iconCompat.OooO0Oo = (Parcelable) iconCompat.OooO0O0;
                break;
            case 1:
            case 5:
                iconCompat.OooO0Oo = (Parcelable) iconCompat.OooO0O0;
                break;
            case 2:
                iconCompat.OooO0OO = ((String) iconCompat.OooO0O0).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.OooO0OO = (byte[]) iconCompat.OooO0O0;
                break;
            case 4:
            case 6:
                iconCompat.OooO0OO = iconCompat.OooO0O0.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.OooO00o;
        if (-1 != i) {
            ns1Var.OooO0oo(1);
            ((os1) ns1Var).OooO0o0.writeInt(i);
        }
        byte[] bArr = iconCompat.OooO0OO;
        if (bArr != null) {
            ns1Var.OooO0oo(2);
            Parcel parcel = ((os1) ns1Var).OooO0o0;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.OooO0Oo;
        if (parcelable != null) {
            ns1Var.OooO0oo(3);
            ((os1) ns1Var).OooO0o0.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.OooO0o0;
        if (i2 != 0) {
            ns1Var.OooO0oo(4);
            ((os1) ns1Var).OooO0o0.writeInt(i2);
        }
        int i3 = iconCompat.OooO0o;
        if (i3 != 0) {
            ns1Var.OooO0oo(5);
            ((os1) ns1Var).OooO0o0.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.OooO0oO;
        if (colorStateList != null) {
            ns1Var.OooO0oo(6);
            ((os1) ns1Var).OooO0o0.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.OooO;
        if (str != null) {
            ns1Var.OooO0oo(7);
            ((os1) ns1Var).OooO0o0.writeString(str);
        }
        String str2 = iconCompat.OooOO0;
        if (str2 != null) {
            ns1Var.OooO0oo(8);
            ((os1) ns1Var).OooO0o0.writeString(str2);
        }
    }
}

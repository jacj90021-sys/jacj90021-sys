package com.cmaster.cloner;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class PAM {
    public static native void CAXY(String str, String str2, int i);

    public static int EOEH(Object obj, int i, Parcel parcel, Parcel parcel2, int i2) {
        x7 x7Var;
        if (!(obj instanceof IBinder)) {
            ThreadLocal threadLocal = b8.OooO00o;
            return 0;
        }
        if (b8.OooO00o.get() == null) {
            y7 y7Var = b8.OooO0Oo;
            IBinder iBinder = (IBinder) obj;
            y7Var.getClass();
            int iDataSize = parcel.dataSize();
            int i3 = a8.OooO00o;
            if (iDataSize >= i3) {
                parcel.setDataPosition(i3);
                String string = parcel.readString();
                parcel.setDataPosition(0);
                if (string != null && (x7Var = (x7) y7Var.OooO00o.get(string)) != null) {
                    return x7Var.OooO(iBinder, i, parcel, parcel2, i2) ? 1 : 0;
                }
            }
        }
        return 0;
    }

    public static Parcel GFJR() {
        return qx1.OooO0oo();
    }

    public static int GMDD(int i) {
        String strO000OO00;
        int callingPid = Binder.getCallingPid();
        lw1 lw1VarOooO0O0 = lw1.OooO0O0();
        lw1VarOooO0O0.getClass();
        try {
            strO000OO00 = lw1VarOooO0O0.OooO00o.o000OO00(callingPid);
        } catch (Exception e) {
            lw1.OooO00o(e);
            strO000OO00 = null;
        }
        if (TextUtils.isEmpty(strO000OO00)) {
            return i;
        }
        HashSet hashSet = i21.OooO00o;
        if (i21.OooO0Oo(qx1.OooO00o(), strO000OO00)) {
            return 99992;
        }
        return i;
    }

    public static native String GOAR(String str);

    public static native String JMXEH(String str);

    public static native void LDCE(Object[] objArr);

    public static native void MAS();

    public static native int OMZJQ(String str, String str2);

    public static native void OVXLA();

    public static boolean PAMK(Object obj) {
        ThreadLocal threadLocal = b8.OooO0O0;
        if (obj == null) {
            threadLocal.remove();
            return false;
        }
        threadLocal.set(obj);
        return false;
    }

    public static native void SW();

    public static native long UBSR(Binder binder, Binder binder2);

    public static native void VSP(Object[] objArr, int[] iArr, int[] iArr2, String str, Parcel parcel);

    public static native boolean WAFXO(Object obj, int i, Parcel parcel, Parcel parcel2, int i2);

    public static native void YYHK(String str, String str2, String str3, int i);

    public static void YYKLD(Parcel parcel) {
        if (parcel != null) {
            parcel.recycle();
        }
    }
}

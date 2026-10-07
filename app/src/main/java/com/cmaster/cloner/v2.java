package com.cmaster.cloner;

import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Pair;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class v2 extends x7 {
    public static final v2 OooOO0o;
    public final o0 OooOO0O;

    static {
        Class cls;
        OooOO0o = (Build.VERSION.SDK_INT < 26 || (cls = u90.OooO00o) == null) ? new v2(v90.OooO00o, w2.OooO00o) : new v2(v90.OooO00o, cls);
    }

    public v2(Class cls, Class cls2) {
        super(cls, cls2);
        this.OooOO0O = o0.OooO0oO;
    }

    @Override // com.cmaster.cloner.x7
    public final boolean OooO(IBinder iBinder, int i, Parcel parcel, Parcel parcel2, int i2) {
        st0 st0Var = (st0) this.OooO0o.get(i);
        if (st0Var == null) {
            return false;
        }
        ThreadLocal threadLocal = st0.OooO0OO;
        st0 st0Var2 = (st0) threadLocal.get();
        threadLocal.set(st0Var);
        try {
            boolean zOooO00o = this.OooO0oo.OooO00o(iBinder, i, parcel, parcel2, i2);
            threadLocal.set(st0Var2);
            return zOooO00o;
        } catch (Throwable th) {
            st0.OooO0OO.set(st0Var2);
            throw th;
        }
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        if (yn2.OooO0O0()) {
            OooO0O0(u7.OooO00o(new byte[]{-65, 25, 71, -65, 21, -59, 24, -15, -104, 8, 78, -76, 2, -47, 23, -32, -91, 21, 65}, new byte[]{-52, 122, 47, -38, 113, -80, 116, -108}), new u2(this, 1));
        }
        int i = 0;
        if (!yn2.OooO0OO()) {
            OooO0O0(u7.OooO00o(new byte[]{-29, 85, 105, 63, -66, -54, 60, 91, -36, 87, 116, 52, -71, -41, 17, 93, -28, 95, 119, 51, -82, -58}, new byte[]{-112, 54, 1, 90, -38, -65, 80, 62}), new u2(this, i));
            OooO0O0(u7.OooO00o(new byte[]{0, 5, 69, -128, 125, 42, 111, -103, 33, 3, 65, -124, 108, 49, 96, -108, 50, 5, 89, -116, 111, 54, 119, -123}, new byte[]{115, 102, 45, -27, 25, 95, 3, -4}), new u2(this, i));
        }
        OooO0O0(u7.OooO00o(new byte[]{97, -6, 12, 120, 19, 43, -26, 46, 64, -4, 3, 116, 4, 42, -17, 57, 119, -3, 54, 120, 20, 59, -29, 61, 119, -21}, new byte[]{18, -103, 100, 29, 119, 94, -118, 75}), new t2(2));
        OooO0O0(u7.OooO00o(new byte[]{88, 24, 112, -37, -48, 76, 61, 7, 108, 16, 96, -64, -48, 95, 59, 45, 78, 30, 98, -49, -46, 89, 45, 27}, new byte[]{60, 113, 3, -85, -79, 56, 94, 111}), new t2(i));
        OooO0O0(u7.OooO00o(new byte[]{35, 23, -120, -21, 9, -102, 116, 8, 35, 12, -103, -20, 27, -77, 69, 8, 59, 17, -104, -25, 29, -77, 66, 5, 33, 17, -113, -22, 60, -105, 86, 19, 56, 11}, new byte[]{77, 120, -4, -126, 111, -29, 55, 103}), new t2(1));
        pl0 pl0Var = pl0.OooO0O0;
        pl0Var.getClass();
        String strOooO00o = u7.OooO00o(new byte[]{83, -68, -78, 103, 57, 103, 55, 66, 114, -70, -87, 119, 48, 119, 26, 68, 84, -74, -84, 107, 41, 107}, new byte[]{32, -33, -38, 2, 93, 18, 91, 39});
        wd0 wd0Var = pl0Var.OooO00o;
        OooO0O0(strOooO00o, wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{-118, 80, 46, 68, 98, 47, -86, -75, -87, 82, 51, 82, 99, 27, -91, -92, -112, 69, 47, 85, 127}, new byte[]{-7, 51, 70, 33, 6, 90, -58, -48}), wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{5, -88, 72, 42, 62, -93, 48, 126, 37, -65, 79, 63, 27, -75, 40, 114, 0, -94, 84, 54}, new byte[]{118, -53, 32, 79, 90, -42, 92, 27}), wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{-45, 49, 39, 31, -98, 69, 116, 46, -13, 55, 33, 30, -88, 85, 107, 62, -52, 38}, new byte[]{-96, 82, 79, 122, -6, 48, 24, 75}), wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{32, 85, 14, 42, 54, 41, -104, 126, 4, 95, 8, 43, 61, 43, -94, 114, 32, 95, 4, 38, 62, 53, -128, 98}, new byte[]{83, 54, 102, 79, 82, 92, -12, 27}), wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{14, 117, -75, -115, -115, 118, -24, -12, 57, 115, -82, -100, -101, 108, -3, -48, 30, 98, -76, -98, -128, 119, -3}, new byte[]{125, 22, -35, -24, -23, 3, -124, -111}), wd0Var);
        OooO0O0(u7.OooO00o(new byte[]{25, -45, 87, 127, 123, -65, -95, 38, 56, -43, 83, 123, 106, -92, -82, 43, 43, -45, 75, 115, 105, -93, -71, 58}, new byte[]{106, -80, 63, 26, 31, -54, -51, 67}), wd0Var);
    }

    @Override // com.cmaster.cloner.x7
    public final z7 OooO0o() {
        return new s2(this, wq.OooO00o);
    }

    @Override // com.cmaster.cloner.x7
    public final Pair OooO0o0(Class cls) {
        return yn2.OooO0O0() ? super.OooO0o0(cls) : a8.OooO00o(this.OooO0Oo, true);
    }

    @Override // com.cmaster.cloner.x7
    public final IInterface OooO0oO(IBinder iBinder) {
        return (IInterface) o0OO0oO0.OooO0OO();
    }
}

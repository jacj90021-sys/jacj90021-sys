package com.cmaster.cloner;

import android.content.AttributionSource;
import android.os.Parcelable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sy extends ef1 {
    public final /* synthetic */ int OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy(int i) {
        super(u7.OooO00o(new byte[]{-108, -104, 9, 94, -54, -56, 101, 37, -108, -122, 29, 2, -60, -47, 113, 120, -112, -105, 31, 79, -51, -113, 96, 98, -111, -102, 67, 101, -28, -47, 113, 88, -112, -105, 31, 79, -51, -20, 96, 101, -108, -111, 8, 94}, new byte[]{-11, -10, 109, 44, -91, -95, 1, 11}));
        this.OooOO0O = i;
        switch (i) {
            case 2:
                super(u7.OooO00o(new byte[]{-51, -91, 98, -34, -123, 93, 11, -87, -33, -82, 101, -39, -104, 93, 27, -2, -126, -94, 104, -40, -104, 65, 28, -18, -61, -91, 98, -55, -98, 81, 12, -13, -59, -92, 104, -126, -93, 125, 1, -13, -34, -66, 117, -59, -123, 90, 43, -30, -40, -82, 101, -40, -125, 91, 1, -44, -55, -71, 112, -59, -119, 81}, new byte[]{-84, -53, 6, -84, -22, 52, 111, -121}));
                break;
            case 3:
                super(u7.OooO00o(new byte[]{36, -28, -58, 95, -96, -69, 100, 48, 43, -20, -63, 3, -122, -100, 102, 125, 4, -18, -61, 93, -69, -73, 114}, new byte[]{69, -118, -94, 45, -49, -46, 0, 30}));
                break;
            case 4:
                super(u7.OooO00o(new byte[]{-72, 110, -26, -115, 101, -17, 18, 89, -73, 101, -10, -47, 100, -11, 18, 89, -112, 78, -15, -101, 71, -25, 24, 22, -66, 101, -16}, new byte[]{-39, 0, -126, -1, 10, -122, 118, 119}));
                break;
            case 5:
                super(u7.OooO00o(new byte[]{-108, 36, 11, -22, -48, 21, 44, 32, -125, 35, 10, -17, -111, 53, 27, 107, -101, 57, 6, -20, -42, 10, 45, 77, -102, 36, 27, -3, -47, 8, 24, 124, -102, 62, 10, -5, -53, 21, 39, 96, -72, 43, 1, -7, -40, 25, 58}, new byte[]{-11, 74, 111, -104, -65, 124, 72, 14}));
                break;
            default:
                break;
        }
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public void OooO00o(yq yqVar) throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, SecurityException, IllegalArgumentException {
        switch (this.OooOO0O) {
            case 0:
                if (yqVar.OooO0o0.getReturnType() != String.class) {
                    t43.OooO0OO(yqVar);
                    break;
                } else {
                    yqVar.OooO0oo("");
                    break;
                }
            case 1:
                t43.OooO0Oo(yqVar.OooO0o, true);
                int iOooO00o = 0;
                int iOooO00o2 = fn2.OooO00o(yqVar.OooO0o, Parcelable.class, 0);
                if (iOooO00o2 >= 0) {
                    Parcelable parcelable = (Parcelable) yqVar.OooO0o[iOooO00o2];
                    try {
                        Method declaredMethod = parcelable.getClass().getDeclaredMethod(u7.OooO00o(new byte[]{-13, -31, -97, -119, 20, 109, 41, 118, -26, -59, -97, -66, 7, 104, 39, 102, -32, -19, -124, -92, 38, 110, 48, 97, -9, -31}, new byte[]{-108, -124, -21, -54, 117, 1, 69, 19}), null);
                        declaredMethod.setAccessible(true);
                        Parcelable parcelable2 = (Parcelable) declaredMethod.invoke(parcelable, null);
                        if (parcelable2 != null) {
                            AttributionSource attributionSourceOooO = t8.OooO(f2.OooO00o.OooO0O0(parcelable2));
                            if (attributionSourceOooO != null) {
                                t43.OooO00o(new Object[]{attributionSourceOooO}, true);
                            }
                            l81 l81Var = f2.OooO0OO;
                            if (l81Var != null) {
                                iOooO00o = l81Var.OooO00o(parcelable2);
                            }
                            if (iOooO00o == -1) {
                                int i = qx1.OooO0o;
                                if (l81Var != null) {
                                    l81Var.OooO0oO(i, parcelable2);
                                }
                            }
                            f2.OooO0O0.OooO0oo(parcelable2, qx1.OooO0Oo());
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        Field declaredField = parcelable.getClass().getDeclaredField(u7.OooO00o(new byte[]{-7, -64, -50, -62, -78, 10, -18, 14, -11, -9, -60, -47, -78, 10, -44, 63, -7, -15}, new byte[]{-108, -108, -81, -80, -43, 111, -102, 94}));
                        declaredField.setAccessible(true);
                        declaredField.set(parcelable, qx1.OooO0Oo());
                    } catch (Exception unused2) {
                    }
                }
                yqVar.OooO00o();
                break;
            case 2:
                t43.OooO0OO(yqVar);
                break;
            case 3:
                t43.OooO0Oo(yqVar.OooO0o, true);
                break;
            case 4:
            default:
                super.OooO00o(yqVar);
                break;
            case 5:
                t43.OooO0Oo(yqVar.OooO0o, true);
                yqVar.OooO00o();
                break;
        }
    }

    @Override // com.cmaster.cloner.i80
    public boolean OooO0OO() {
        switch (this.OooOO0O) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
            default:
                return super.OooO0OO();
            case 5:
                return true;
        }
    }

    @Override // com.cmaster.cloner.i80
    public void OooO0Oo() {
        switch (this.OooOO0O) {
            case 2:
                OooO0O0(u7.OooO00o(new byte[]{-57, 28, -65, 102, 14, -50, 100, 101, -27, 25, -73, 89, 24, -50, 115, 107}, new byte[]{-90, 120, -37, 53, 122, -81, 16, 0}), new ya0(2));
                OooO0O0(u7.OooO00o(new byte[]{-123, -115, -12, -84, 16, -85, -7}, new byte[]{-31, -28, -121, -51, 114, -57, -100, 0}), new ya0(3));
                OooO0O0(u7.OooO00o(new byte[]{-3, -101, -87, 88, 61, 3}, new byte[]{-104, -11, -56, 58, 81, 102, -113, 49}), new ya0(4));
                break;
            case 4:
                OooO0O0(u7.OooO00o(new byte[]{-70, -55, -98, -97, 77, -112, 59}, new byte[]{-39, -90, -16, -15, 40, -13, 79, 103}), new t2(false, 4));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sy(String str) {
        super(str);
        this.OooOO0O = 0;
    }
}

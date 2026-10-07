package com.cmaster.cloner;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pd0 extends ef1 {
    public static final String OooOO0O;
    public static final String OooOO0o;
    public static final String OooOOO;
    public static final String OooOOO0;
    public static final String OooOOOO;

    static {
        u7.OooO00o(new byte[]{-30, 121, 80, 37, -106, 15, -12, -91, -32, 120, 90, 35, -100, 8, -28, -91, -13, 122, 26, 30, -86, 14, -1, -7, -9, 116, 65, 35, -86, 3, -30, -3, -22, 116, 81}, new byte[]{-125, 23, 52, 87, -7, 102, -112, -117});
        OooOO0O = u7.OooO00o(new byte[]{-60, -67, 44, -2, 83, -87, 37}, new byte[]{-25, -3, 108, -35, 19, -23, 6, -105});
        OooOO0o = u7.OooO00o(new byte[]{-109, 51, 91, -101, -6, -92, -99, -33, -30, 41, 83, -100, -32, -78, -108, -42, -17}, new byte[]{-67, 101, 18, -55, -82, -15, -36, -109});
        OooOOO0 = u7.OooO00o(new byte[]{-93, -41, 49, 33, 40, 43, 89, -38, -113, -38, 38, 39, 46, 41, 115, -57, -66, -53, 59, 61, 40}, new byte[]{-48, -65, 94, 83, 92, 72, 44, -82});
        OooOOO = u7.OooO00o(new byte[]{22, 0, -120, -17, 21, 122, -15, 123, 58, 13, -97, -23, 19, 120, -37, 110, 6, 28, -114, -21, 8, 109, -3}, new byte[]{101, 104, -25, -99, 97, 25, -124, 15});
        OooOOOO = u7.OooO00o(new byte[]{93, -74, 45, -119, 125, 7, 21, 31, 113, -69, 58, -113, 123, 5, 63, 8, 79, -86, 39, -100, 102, 22, 9, 14, 93}, new byte[]{46, -34, 66, -5, 9, 100, 96, 107});
    }

    public pd0() {
        super(u7.OooO00o(new byte[]{-74, -55, 11, 120, 4, -113, 74, 108, -76, -56, 1, 126, 14, -120, 90, 108, -89, -54, 65, 67, 56, -114, 65, 48, -93, -60, 26, 126, 56, -125, 92, 52, -66, -60, 10}, new byte[]{-41, -89, 111, 10, 107, -26, 46, 66}));
    }

    public static ShortcutInfo OooOO0(pd0 pd0Var, ShortcutInfo shortcutInfo) {
        Bitmap bitmapOooO00o;
        l81 l81Var = vg1.OooO00o;
        Icon icon = l81Var != null ? (Icon) l81Var.OooO0O0(shortcutInfo) : null;
        Application application = o0OO00o0.OooOOo0.OooO0oO;
        Context applicationContext = application != null ? application.getApplicationContext() : null;
        try {
            if (icon != null) {
                bitmapOooO00o = iq2.OooO00o(icon.loadDrawable(applicationContext));
            } else {
                Integer num = qx1.OooO00o;
                bitmapOooO00o = iq2.OooO00o(applicationContext.getApplicationInfo().loadIcon(e92.OooO00o.getPackageManager()));
            }
        } catch (Exception unused) {
            bitmapOooO00o = null;
        }
        if (bitmapOooO00o == null) {
            return null;
        }
        String strOooO00o = qx1.OooO00o();
        int iOooO0oO = qx1.OooO0oO();
        Intent intent = new Intent();
        intent.addCategory(u7.OooO00o(new byte[]{81, -111, -105, 82, 28, -52, -90, 81, 89, -111, -121, 69, 29, -47, -20, 28, 81, -117, -106, 71, 28, -41, -69, 81, 116, -70, -75, 97, 38, -23, -106}, new byte[]{48, -1, -13, 32, 115, -91, -62, 127}));
        intent.setAction(qx1.OooO0Oo() + OooOO0o);
        intent.setPackage(qx1.OooO0Oo());
        Intent intent2 = shortcutInfo.getIntent();
        if (intent2 != null) {
            intent.putExtra(OooOOO0, intent2.toUri(0));
        }
        intent.putExtra(u7.OooO00o(new byte[]{56, 28, 17, -31, 31, -26, -46, -34, 48, 28, 1, -10, 30, -5, -104, -107, 33, 6, 7, -14, 94, -38, -27, -75, 11}, new byte[]{89, 114, 117, -109, 112, -113, -74, -16}), iOooO0oO);
        intent.putExtra(u7.OooO00o(new byte[]{-85, 42, -123, 62, 36, -82, -72, 31, -93, 42, -107, 41, 37, -77, -14, 84, -78, 48, -109, 45, 101, -105, -99, 114, -127, 5, -90, 9, 20, -119, -99, 124, -113}, new byte[]{-54, 68, -31, 76, 75, -57, -36, 49}), strOooO00o);
        ComponentName activity = shortcutInfo.getActivity();
        if (activity != null) {
            intent.putExtra(OooOOO, activity.flattenToString());
        }
        Set<String> categories = intent.getCategories();
        if (categories != null && !categories.isEmpty()) {
            String strOooO00o2 = u7.OooO00o(new byte[]{58}, new byte[]{22, 10, 23, -18, 11, -93, -44, -55});
            StringBuilder sb = new StringBuilder();
            Iterator<T> it = categories.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) strOooO00o2);
                }
            }
            intent.putExtra(OooOOOO, sb.toString());
        }
        String str = qx1.OooO00o() + u7.OooO00o(new byte[]{-53}, new byte[]{-108, -97, -11, 47, -83, -87, -43, 34}) + qx1.OooO0oO() + OooOO0O + shortcutInfo.getId();
        lu.OooOO0O();
        ShortcutInfo.Builder builderOooOo0O = lu.OooOo0O(e92.OooO00o, str);
        builderOooOo0O.setIcon(Icon.createWithBitmap(bitmapOooO00o));
        builderOooOo0O.setIntent(intent);
        if (shortcutInfo.getLongLabel() != null) {
            builderOooOo0O.setLongLabel(shortcutInfo.getLongLabel());
        }
        if (shortcutInfo.getShortLabel() != null) {
            builderOooOo0O.setShortLabel(shortcutInfo.getShortLabel());
        }
        return builderOooOo0O.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooOO0O(com.cmaster.cloner.pd0 r14, com.cmaster.cloner.yq r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pd0.OooOO0O(com.cmaster.cloner.pd0, com.cmaster.cloner.yq):void");
    }

    public static Object OooOO0o() {
        return m21.OooO0OO(new ArrayList());
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        String strOooO00o = u7.OooO00o(new byte[]{115, 30, -127, 1, -12, -42, -39, -16, 122, 18, -101, 52, -46, -38, -44, -11, 87, 20, -128, 61, -27}, new byte[]{20, 123, -11, 83, -111, -69, -72, -103});
        int i = 25;
        OooO0O0(strOooO00o, new f90(strOooO00o, i));
        String strOooO00o2 = u7.OooO00o(new byte[]{-80, 51, -99, 19, -103, -87, -82, 17, -66, 59, -128, 53, -86, -72, -72, 56, -93, 2, -128, 44, -99}, new byte[]{-41, 86, -23, 65, -8, -35, -53, 93});
        OooO0O0(strOooO00o2, new f90(strOooO00o2, i));
        String strOooO00o3 = u7.OooO00o(new byte[]{106, -61, -35, 96, -123, -122, 36, -81, 108, -34, -19, 64, -117, -116, 36, -111, 100, -55, -57, 90}, new byte[]{13, -90, -87, 41, -26, -23, 74, -30});
        OooO0O0(strOooO00o3, new f90(strOooO00o3, i));
        String strOooO00o4 = u7.OooO00o(new byte[]{73, -103, -54, -27, 34, -118, 115, 111, 65, -114, -54, -53, 54, -122, 99, 104, 91, -110, -54, -8, 38, -128, 97, 100, 90, -107, -56, -63, 55, -117}, new byte[]{46, -4, -66, -88, 67, -14, 32, 7});
        OooO0O0(strOooO00o4, new f90(strOooO00o4, i));
        String strOooO00o5 = u7.OooO00o(new byte[]{-21, -48, 74, -19, 26, -102, -28, -10, -10, -57, 78, -31, 29, -102, -30, -19, -4, -47}, new byte[]{-103, -75, 58, -126, 104, -18, -73, -98});
        OooO0O0(strOooO00o5, new f90(strOooO00o5, i));
        String strOooO00o6 = u7.OooO00o(new byte[]{99, 72, -45, -33, 18, -30, 117, -99, 109, 82, -5, -64, 12, -49, 127, -118, 101, 80, -9}, new byte[]{12, 38, -110, -81, 98, -114, 28, -2});
        OooO0O0(strOooO00o6, new f90(strOooO00o6, i));
        String strOooO00o7 = u7.OooO00o(new byte[]{-102, -127, 43, 50, -26, -47, 93, 111, -111, -107, 44, 41, -31, -51, 91, 75, -105, -110, 53, 8, -3, -51, 70, 116, -100}, new byte[]{-14, -32, 88, 97, -114, -66, 47, 27});
        OooO0O0(strOooO00o7, new f90(strOooO00o7, i));
        String strOooO00o8 = u7.OooO00o(new byte[]{-9, 101, -105, -113, 124, 121, 2, -32, -53, 101, -106, -69, 113, 108, 3}, new byte[]{-97, 4, -28, -36, 20, 24, 112, -123});
        OooO0O0(strOooO00o8, new f90(strOooO00o8, i));
        String strOooO00o9 = u7.OooO00o(new byte[]{-30, -44, -71, -100, -9, -41, 50, 124, -47, -48, -65, -88, -6, -62, 51}, new byte[]{-123, -79, -51, -49, -97, -74, 64, 25});
        OooO0O0(strOooO00o9, new f90(strOooO00o9, i));
        int i2 = 26;
        OooO0O0(u7.OooO00o(new byte[]{43, -15, 10, 102, 86, -64, -103, -83, 39, -15, 27, 100, 87, -47, -104, -96, 59, -10, 3, 115, 107, -53, -66, -96, 38, -9}, new byte[]{72, -125, 111, 7, 34, -91, -54, -59}), new nd0(this, new Intent()));
        String strOooO00o10 = u7.OooO00o(new byte[]{-80, -18, -52, -90, 59, -47, 62, 76, -72, -23, -5, -118, 45, -51, 43, 66, -92, -2, -37}, new byte[]{-47, -118, -88, -30, 66, -65, 95, 33});
        Boolean bool = Boolean.FALSE;
        OooO0O0(strOooO00o10, new nd0(this, bool));
        OooO0O0(u7.OooO00o(new byte[]{-82, 74, 62, -121, 5, -13, 123, -47, -76, 76, 25, -85, 19, -17, 110, -33, -88, 91, 57}, new byte[]{-35, 47, 74, -61, 124, -99, 26, -68}), new nd0(this, bool));
        OooO0O0(u7.OooO00o(new byte[]{126, -74, -71, 51, 92, 19, 109, 119, 99, -86, -87, 8, 112, 5, 113, 98, 109, -74, -66}, new byte[]{14, -61, -54, 91, 24, 106, 3, 22}), new nd0(this, (Object) null));
        OooO0O0(u7.OooO00o(new byte[]{-13, 8, -115, -88, 26, -8, -98, 113, -3, 14, -86, -124, 12, -28, -117, 127, -31, 25, -118}, new byte[]{-108, 109, -7, -20, 99, -106, -1, 28}), new nd0(this, OooOO0o()));
        OooO0O0(u7.OooO00o(new byte[]{78, -86, 111, -96, 57, -46, -20, -34, 76, -68, 111, -66, 48, -45, -9, -52, 74, -70, 111, -98}, new byte[]{41, -49, 27, -19, 88, -68, -123, -72}), new nd0(this, OooOO0o()));
        OooO0O0(u7.OooO00o(new byte[]{121, -82, -38, -92, 96, -45, -72, -89, 103, -113, -50, -91, 119, -37, -112, -88, 88, -93, -40, -71, 98, -43, -116, -65, 120}, new byte[]{11, -53, -73, -53, 22, -74, -7, -53}), new nd0(this, (Object) null));
        OooO0O0(u7.OooO00o(new byte[]{-46, -84, 47, -106, 60, -55, -109, -66, -50, -88, 47, -112, 41, -1, -65, -88, -46, -67, 33, -116, 62, -33}, new byte[]{-96, -55, 66, -7, 74, -84, -41, -57}), new nd0(this, (Object) null));
        if (yn2.OooO0O0()) {
            int i3 = 2;
            OooO0O0(u7.OooO00o(new byte[]{-96, 104, 59, -43, 60, -37, -15, 123, -69, 99, 25, -56, 54, -38, -15, 72, -89, 121}, new byte[]{-46, 13, 74, -96, 89, -88, -123, 43}), new sb0(this, i3));
            OooO0O0(u7.OooO00o(new byte[]{19, 24, -96, -126, 20, 0, -90, 87, 9, 26, -80, -128, 21, 17, -122}, new byte[]{102, 104, -60, -29, 96, 101, -11, 63}), new sb0(this, i3));
            OooO0O0(u7.OooO00o(new byte[]{113, 119, 24, 72, 8, -22, 46, 119, 114, 65, 4, 119, 19, -16, 35, 103, 98, 97}, new byte[]{22, 18, 108, 24, 97, -124, 64, 18}), new sb0(this, 2));
            OooO0O0(u7.OooO00o(new byte[]{-86, 122, -14, 5, -111, 29, 35, 14, -82, 106, -14, 37}, new byte[]{-51, 31, -122, 86, -7, 114, 81, 122}), new od0(this));
            boolean z = false;
            OooO0O0(u7.OooO00o(new byte[]{29, 105, 126, 63, 70, 20, -64, -83, 17, 111, 127, 42, 71, 13, -47, -115}, new byte[]{121, 0, 13, 94, 36, 120, -91, -2}), new f90(z, i2));
            OooO0O0(u7.OooO00o(new byte[]{98, -52, -18, -126, -14, -35, 95, -81, 104, -48, -5, -125, -21, -52, 127}, new byte[]{7, -94, -113, -32, -98, -72, 12, -57}), new f90(z, i2));
            OooO0O0(u7.OooO00o(new byte[]{79, 83, -41, -24, 75, -121, -37, 99, 83, 81, -10, -18, 75, -121, -13, 95, 85, 89, -56, -13, 94, -105, -29, 127}, new byte[]{61, 54, -70, -121, 61, -30, -105, 12}), new f90(false, i2));
            return;
        }
        OooO0O0(u7.OooO00o(new byte[]{-39, 87, 9, -37, -104, -29, -86, 34, -62, 92, 43, -58, -110, -30, -86, 17, -34, 70}, new byte[]{-85, 50, 120, -82, -3, -112, -34, 114}), new nd0(this, bool));
        OooO0O0(u7.OooO00o(new byte[]{47, 49, 99, 82, -104, 63, -120, -123, 53, 51, 115, 80, -103, 46, -88}, new byte[]{90, 65, 7, 51, -20, 90, -37, -19}), new nd0(this, bool));
        OooO0O0(u7.OooO00o(new byte[]{68, 76, 75, -59, -71, -71, 119, -113, 71, 122, 87, -6, -94, -93, 122, -97, 87, 90}, new byte[]{35, 41, 63, -107, -48, -41, 25, -22}), new nd0(this, OooOO0o()));
        String strOooO00o11 = u7.OooO00o(new byte[]{48, 78, 118, 66, -60, -16, -30, -52, 60, 72, 119, 87, -59, -23, -13, -20}, new byte[]{84, 39, 5, 35, -90, -100, -121, -97});
        OooO0O0(strOooO00o11, new f90(strOooO00o11, i));
        String strOooO00o12 = u7.OooO00o(new byte[]{19, 101, 121, -86, 19, -79, -77, 89, 25, 121, 108, -85, 10, -96, -109}, new byte[]{118, 11, 24, -56, 127, -44, -32, 49});
        OooO0O0(strOooO00o12, new f90(strOooO00o12, i));
        String strOooO00o13 = u7.OooO00o(new byte[]{50, 64, 49, 12, -44, -66, -63, 46, 46, 66, 16, 10, -44, -66, -23, 18, 40, 74, 46, 23, -63, -82, -7, 50}, new byte[]{64, 37, 92, 99, -94, -37, -115, 65});
        OooO0O0(strOooO00o13, new f90(strOooO00o13, i));
    }
}

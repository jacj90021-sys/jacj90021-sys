package com.cmaster.cloner;

import android.app.Notification;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ec0 extends ef1 {
    public static ox0 OooOO0O;

    static {
        u7.OooO00o(new byte[]{22, -43, -123, 116, -46, -62, 100, 50, 22, -53, -111, 40, -12, -27, 111, 104, 30, -35, -120, 101, -36, -33, 105, 115, 25, -10, -128, 104, -36, -52, 101, 110}, new byte[]{119, -69, -31, 6, -67, -85, 0, 28});
    }

    public ec0() {
        super(u7.OooO00o(new byte[]{109, 105, 53, 42, -10, -27, 13, 48, 109, 119, 33, 118, -48, -62, 6, 106, 101, 97, 56, 59, -8, -8, 0, 113, 98, 74, 48, 54, -8, -21, 12, 108}, new byte[]{12, 7, 81, 88, -103, -116, 105, 30}));
    }

    public static void OooOO0(Notification notification) {
        boolean zEquals;
        Bundle bundle;
        Bundle bundle2;
        if (Build.VERSION.SDK_INT >= 31) {
            Class clsOooOooO = t8.OooOooO();
            if (notification == null || (bundle2 = notification.extras) == null) {
                zEquals = false;
            } else {
                try {
                    zEquals = Objects.equals(bundle2.getString(u7.OooO00o(new byte[]{-127, 102, -29, 122, -22, 94, -10, -88, -108, 109, -22, 120, -23, 86, -26, -29}, new byte[]{-32, 8, -121, 8, -123, 55, -110, -122})), clsOooOooO.getName());
                } catch (Exception unused) {
                }
            }
            if (zEquals) {
                Integer num = qx1.OooO00o;
                Context context = e92.OooO00o;
                if (context == null || context.checkCallingPermission(u7.OooO00o(new byte[]{-5, 31, 109, 79, -25, 11, -87, -128, -22, 20, 123, 80, -31, 17, -66, -57, -11, 31, 39, 104, -37, 39, -110, -24, -49, 61, 69, 98, -37, 33, -97, -21, -33, 63, 86, 116, -58, 54, -120, -32, -50}, new byte[]{-102, 113, 9, 61, -120, 98, -51, -82})) != -1 || notification == null || (bundle = notification.extras) == null) {
                    return;
                }
                try {
                    bundle.remove(u7.OooO00o(new byte[]{29, -9, -127, 38, -46, -29, 120, -32, 8, -4, -120, 36, -47, -21, 104, -85}, new byte[]{124, -103, -27, 84, -67, -118, 28, -50}));
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r2 == java.lang.Integer.parseInt(r7[1])) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooOO0O(java.lang.Object r9, boolean r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            android.app.NotificationChannel r9 = com.cmaster.cloner.c60.OooO0O0(r9)
            java.lang.String r0 = com.cmaster.cloner.c60.OooOoO(r9)
            java.lang.String r1 = com.cmaster.cloner.qx1.OooO00o()
            int r2 = com.cmaster.cloner.qx1.OooO0oO()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r10 == 0) goto L2e
            java.lang.String[] r0 = OooOOo0(r0)
            if (r0 == 0) goto L58
            r6 = r0[r3]
            r7 = r0[r4]
            boolean r7 = android.text.TextUtils.equals(r7, r1)
            if (r7 == 0) goto L58
            r0 = r0[r5]
            int r0 = java.lang.Integer.parseInt(r0)
            if (r2 == r0) goto L32
            goto L58
        L2e:
            java.lang.String r6 = OooOOO0(r2, r0, r1)
        L32:
            boolean r0 = com.cmaster.cloner.yn2.OooO0o0()
            if (r0 == 0) goto L64
            java.lang.String r0 = com.cmaster.cloner.o000OO.OooOooO(r9)
            if (r0 == 0) goto L64
            if (r10 == 0) goto L59
            java.lang.String[] r7 = OooOOo0(r0)
            if (r7 == 0) goto L5d
            r0 = r7[r3]
            r8 = r7[r4]
            boolean r1 = android.text.TextUtils.equals(r8, r1)
            if (r1 == 0) goto L58
            r1 = r7[r5]
            int r1 = java.lang.Integer.parseInt(r1)
            if (r2 == r1) goto L5d
        L58:
            return r5
        L59:
            java.lang.String r0 = OooOOO0(r2, r0, r1)
        L5d:
            java.lang.String r1 = com.cmaster.cloner.o000OO.OooOOo(r9)
            com.cmaster.cloner.o000OO.OooOo0O(r9, r0, r1)
        L64:
            boolean r0 = com.cmaster.cloner.yn2.OooO0O0()
            if (r0 == 0) goto L9c
            java.lang.String r0 = com.cmaster.cloner.c60.OooOO0o(r9)
            if (r0 == 0) goto L9c
            java.lang.String r1 = com.cmaster.cloner.qx1.OooO00o()
            int r2 = com.cmaster.cloner.qx1.OooO0oO()
            if (r10 == 0) goto L93
            java.lang.String[] r10 = OooOOo0(r0)
            if (r10 == 0) goto L97
            r7 = r10[r4]
            boolean r1 = android.text.TextUtils.equals(r7, r1)
            if (r1 == 0) goto L97
            r1 = r10[r5]
            int r1 = java.lang.Integer.parseInt(r1)
            if (r2 != r1) goto L97
            r0 = r10[r3]
            goto L97
        L93:
            java.lang.String r0 = OooOOO0(r2, r0, r1)
        L97:
            com.cmaster.cloner.l81 r10 = com.cmaster.cloner.hx0.OooO0O0
            r10.OooO0oo(r9, r0)
        L9c:
            com.cmaster.cloner.l81 r10 = com.cmaster.cloner.hx0.OooO00o
            r10.OooO0oo(r9, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.ec0.OooOO0O(java.lang.Object, boolean):boolean");
    }

    public static boolean OooOO0o(Object obj, boolean z) throws IllegalAccessException, IllegalArgumentException {
        if (yn2.OooO0O0()) {
            if (c60.OooOoOO(obj)) {
                return OooOO0O(obj, z);
            }
            if (c60.OooOoo(obj)) {
                NotificationChannelGroup notificationChannelGroupOooO0Oo = c60.OooO0Oo(obj);
                String id = notificationChannelGroupOooO0Oo.getId();
                String strOooO00o = qx1.OooO00o();
                int iOooO0oO = qx1.OooO0oO();
                if (z) {
                    String[] strArrOooOOo0 = OooOOo0(id);
                    if (strArrOooOOo0 != null) {
                        id = strArrOooOOo0[2];
                        if (!TextUtils.equals(strArrOooOOo0[0], strOooO00o) || iOooO0oO != Integer.parseInt(strArrOooOOo0[1])) {
                            return true;
                        }
                    }
                } else {
                    id = OooOOO0(iOooO0oO, id, strOooO00o);
                }
                gx0.OooO00o.OooO0oo(notificationChannelGroupOooO0Oo, id);
                List channels = notificationChannelGroupOooO0Oo.getChannels();
                if (!fn2.OooO0Oo(channels)) {
                    Iterator it = channels.iterator();
                    while (it.hasNext()) {
                        OooOO0O(c60.OooO0O0(it.next()), z);
                    }
                }
            } else if (obj instanceof Notification) {
                OooOOO(obj);
            }
        }
        return false;
    }

    public static void OooOOO(Object obj) throws IllegalAccessException, IllegalArgumentException {
        Notification notification = (Notification) obj;
        String channelId = notification.getChannelId();
        if (channelId == null) {
            if (!yn2.OooO0O0() || qx1.OooO0O0() < 26) {
                return;
            }
            vx0.OooO00o.OooO0oo(notification, u7.OooO00o(new byte[]{115, 11, 84, -67, -80, 97, -120, 76, 105, 18, 84, -70, -67, 102, -121, 87, 96, 10, 84, -80, -79}, new byte[]{5, 102, 11, -39, -43, 7, -23, 57}));
            return;
        }
        vx0.OooO00o.OooO0oo(notification, OooOOO0(qx1.OooO0oO(), channelId, qx1.OooO00o()));
        if (yn2.OooO0o()) {
            notification.flags |= 16;
        }
    }

    public static String OooOOO0(int i, String str, String str2) {
        String strOooOOOo = px0.OooOOOo(new byte[]{-12, 93, -65}, new byte[]{-85, 126, -32, 103, 18, -4, -7, 44}, rj.OooOO0(str2), i);
        if (str == null) {
            return strOooOOOo;
        }
        if (str.startsWith(strOooOOOo)) {
            return str;
        }
        StringBuilder sbOooOO0 = rj.OooOO0(strOooOOOo);
        sbOooOO0.append(u7.OooO00o(new byte[]{-21, 103, -47}, new byte[]{-76, 68, -114, -93, -50, -49, 28, 49}));
        sbOooOO0.append(str);
        return sbOooOO0.toString();
    }

    public static void OooOOOO(Notification notification, String str, int i) throws IllegalAccessException, IllegalArgumentException {
        String channelId = notification.getChannelId();
        if (channelId == null) {
            if (!yn2.OooO0O0() || qx1.OooO0O0() < 26) {
                return;
            }
            vx0.OooO00o.OooO0oo(notification, u7.OooO00o(new byte[]{55, 78, 85, 68, -88, -48, 77, 107, 45, 87, 85, 67, -91, -41, 66, 112, 36, 79, 85, 73, -87}, new byte[]{65, 35, 10, 32, -51, -74, 44, 30}));
            return;
        }
        vx0.OooO00o.OooO0oo(notification, OooOOO0(i, channelId, str));
        if (yn2.OooO0o()) {
            notification.flags |= 16;
        }
    }

    public static void OooOOOo(Object obj, boolean z) {
        if (obj != null) {
            Class cls = m21.OooO00o;
            if (cls != null && cls.isInstance(obj)) {
                List listOooO00o = m21.OooO00o(obj);
                if (fn2.OooO0Oo(listOooO00o)) {
                    return;
                }
                Iterator it = listOooO00o.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        it.remove();
                    } else if (OooOO0o(next, z)) {
                        it.remove();
                    }
                }
                return;
            }
        } else {
            Class cls2 = m21.OooO00o;
        }
        OooOO0o(obj, z);
    }

    public static String[] OooOOo0(String str) {
        if (str != null && str.contains(u7.OooO00o(new byte[]{-14, 91, -38}, new byte[]{-83, 120, -123, -64, -121, 34, 61, 88}))) {
            String[] strArrSplit = str.split(u7.OooO00o(new byte[]{-70, -103, -62}, new byte[]{-27, -70, -99, 120, -94, -70, 63, -69}));
            if (strArrSplit.length >= 3) {
                return strArrSplit;
            }
        }
        return null;
    }

    @Override // com.cmaster.cloner.x7, com.cmaster.cloner.jo1
    public final void OooO00o(yq yqVar) {
        t43.OooO0Oo(yqVar.OooO0o, true);
        Object[] objArr = yqVar.OooO0o;
        if (objArr != null) {
            for (Object obj : objArr) {
                OooOOOo(obj, false);
            }
        }
        yqVar.OooO00o();
        if (yqVar.OooO != null) {
            t43.OooO0OO(yqVar);
        } else {
            OooOOOo(yqVar.OooO0oO(), true);
        }
    }

    @Override // com.cmaster.cloner.i80
    public final boolean OooO0OO() {
        return true;
    }

    @Override // com.cmaster.cloner.i80
    public final void OooO0Oo() {
        OooO0O0(u7.OooO00o(new byte[]{-81, 17, -86, 107, -11, -118, 48, -25, -91, 3, -112, 109, -18, -115, 26, -25, -75, 22, -127, 106, -28, -111, 23, -19, -91, 7, -105, 119, -58, -111, 55, -32, -78, 7, -128}, new byte[]{-58, 98, -28, 4, -127, -29, 86, -114}), new ya0(18));
        OooO0O0(u7.OooO00o(new byte[]{-84, -45, 100, -30, -98, 60, -34, 96, -73, -40, 113, -37, -110, 60, -34, 71, -80, -45, 103}, new byte[]{-34, -74, 21, -105, -5, 79, -86, 34}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{-71, 24, -42, -80, -91, 70, 10, -70, -91, 31, -50, -85, -92, 121, 23, -100, -65, 24, -55, -96, -78}, new byte[]{-53, 125, -89, -59, -64, 53, 126, -17}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{-107, 8, -104, 62, 126, -112, -37, 111, -114, 3, -115, 27, 105, -116, -39, 68, -125, 8, -101}, new byte[]{-25, 109, -23, 75, 27, -29, -81, 45}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{42, 7, -112, -92, 101, 122, -69, -128, 54, 0, -120, -65, 100, 89, -67, -70, 46, 11, -123, -76, 114}, new byte[]{88, 98, -31, -47, 0, 9, -49, -43}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{39, -37, -7, -17, 37, 20, 38, -16, 25, -41, -19, -14, 51, 14, 38, -16}, new byte[]{85, -66, -98, -122, 86, 96, 67, -126}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{78, 67, -96, 45, -16, -67, -82, -63, 94, 95, -98, 33, -28, -96, -72, -37, 94, 95}, new byte[]{59, 45, -46, 72, -105, -44, -35, -75}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{126, 6, -127, -66, 20, 5, -115, -10, 105, 14, -119, -76, 18, 8, -73, -16, 114, 9, -87, -81, 30, 4, -113, -16, 110, 19, -118, -77, 20, 27}, new byte[]{29, 103, -17, -35, 113, 105, -61, -103}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{-54, 88, -121, 36, -88, -19, 63, -106, -35, 80, -113, 46, -82, -32, 5, -112, -58, 87, -102, 1, -65, -18, 28, -75, -64, 74, -99, 34, -93, -28, 3}, new byte[]{-87, 57, -23, 71, -51, -127, 113, -7}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{32, -97, -77, 28, -9, -72, -49, -15, 39, -104, -70, 26, -18, -68, -11, -9, 60, -97, -119, 29, -7, -76, -19, -35, 60, -97, -88, 22, -11, -87, -57, -20, 60, -100, -112, 26, -2, -87, -28, -16, 54, -125}, new byte[]{83, -15, -36, 115, -115, -35, -127, -98}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{19, -94, -93, 77, -88, 7, 86, 71, 20, -91, -86, 75, -79, 3, 108, 65, 15, -94, -103, 76, -90, 11, 116, 110, 18, -93, -95, 110, -69, 17, 108, 77, 14, -87, -66}, new byte[]{96, -52, -52, 34, -46, 98, 24, 40}), new nd0((Object) null, 1));
        OooO0O0(u7.OooO00o(new byte[]{-123, 10, 89, 17, -37, -70, -19, -20, -107, 6, 83, 29, -52, -66, -41, -22, -114, 1, 118, 28, -50, -79, -51, -26, -115}, new byte[]{-31, 111, 53, 116, -81, -33, -93, -125}), new ya0(this, 16));
        OooO0O0(u7.OooO00o(new byte[]{126, 59, 71, -103, -99, 113, 108, 97, 112, 61, 82, -93, -101, 106, 107, 68, 113, 63, 93, -71, -105, 105}, new byte[]{25, 94, 51, -41, -14, 5, 5, 7}), new ya0(this, 16));
        OooO0O0(u7.OooO00o(new byte[]{82, 43, 127, -43, 73, -89, 31, 11, 83, 44, 117, -45, 73, -83, 37, 13, 72, 43, 80, -46, 75, -94, 63, 1, 75}, new byte[]{39, 69, 19, -70, 42, -52, 81, 100}), new ya0(this, 16));
        OooO0O0(u7.OooO00o(new byte[]{55, 48, 17, 119, -31, 16, -68, -108, 39, 60, 27, 123, -10, 20, -122, -110, 60, 59, 62, 122, -12, 27, -100, -98, 63, 18, 15, 125, -32, 5}, new byte[]{83, 85, 125, 18, -107, 117, -14, -5}), new ya0(this, 16));
        OooO0O0(u7.OooO00o(new byte[]{78, -10, -81, -115, 55, -72, 13, -35, 64, -16, -70, -73, 49, -93, 10, -8, 65, -14, -75, -83, 61, -96, 35, -55, 70, -26, -85}, new byte[]{41, -109, -37, -61, 88, -52, 100, -69}), new ya0(this, 16));
        OooO0O0(u7.OooO00o(new byte[]{-79, -127, -91, 57, -24, 96, 67, 90, -65, -121, -80, 3, -18, 123, 68, 127, -66, -123, -65, 25, -30, 120, 109, 78, -71, -111, -95, 49, -24, 102, 122, 93, -75, -113, -80, 16, -30}, new byte[]{-42, -28, -47, 119, -121, 20, 42, 60}), new dc0(this, 0));
        OooO0O0(u7.OooO00o(new byte[]{90, -56, 53, -117, 61, 104, 43, 91, 92, -39, 36, -65, 28, 119, 42, 94, 91, -60, 34, -70, 38, 113, 49, 89, 126, -59, 32, -75, 60, 125, 50, 112, 79, -62, 52, -85, 20, 119, 44, 103, 92, -50, 42, -70, 53, 125}, new byte[]{61, -83, 65, -37, 82, 24, 94, 55}), new dc0(this, 2));
        OooO0O0(u7.OooO00o(new byte[]{-35, 98, -74, 83, -84, 127, -101, 32, -56, 116, -93, 100, -86, 126, -125, 11, -43, 115, -85, 118, -86, 114, -116, 49, -45, 104, -84, 83, -85, 112, -125, 43, -33, 107}, new byte[]{-70, 7, -62, 16, -61, 17, -19, 69}), new dc0(this, 3));
        OooO0O0(u7.OooO00o(new byte[]{-50, 79, -104, -121, -96, 47, 1, 69, -64, 73, -115, -67, -90, 52, 6, 96, -63, 75, -126, -89, -86, 55, 46, 76, -37, 122, -115, -86, -92, 58, 15, 70}, new byte[]{-87, 42, -20, -55, -49, 91, 104, 35}), new dc0(this, 2));
        OooO0O0(u7.OooO00o(new byte[]{82, -68, -107, -14, 33, -86, -124, 36, 88, -90, -115, -31, 45, -68, -128, 30, 94, -67, -118, -48, 45, -85, -119, 62, 86, -75}, new byte[]{55, -46, -28, -121, 68, -33, -31, 106}), new ya0(this, 17));
        OooO0O0(u7.OooO00o(new byte[]{-20, -86, -84, -124, -78, -101, 105, -64, -26, -80, -76, -105, -66, -115, 109, -6, -32, -85, -77, -90, -66, -102, 100, -38, -24, -93, -115, -125, -66, -127, 126, -25, -3, -67}, new byte[]{-119, -60, -35, -15, -41, -18, 12, -114}), new ya0(this, 17));
        if (u7.OooO00o(new byte[]{-83, 121, -124, -110, -35, 103, 40}, new byte[]{-34, 24, -23, -31, -88, 9, 79, -23}).equalsIgnoreCase(Build.BRAND)) {
            OooO0O0(u7.OooO00o(new byte[]{78, -49, -10, 82, 82, 52, 29, -88, 79, -58, -30, 105, 88, 53, 17, -117, 66, -62, -26, 83, 94, 46, 22}, new byte[]{43, -95, -121, 39, 55, 65, 120, -19}), new nd0((Object) null, 1));
            OooO0O0(u7.OooO00o(new byte[]{-72, 12, 104, 41, -67, 109, 1, 56, -83, 12, 75, 41, -65, 97, 34, 53, -87, 8, 113, 47, -92, 102}, new byte[]{-54, 105, 5, 70, -53, 8, 68, 92}), new nd0((Object) null, 1));
        }
    }
}

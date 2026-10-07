package com.cmaster.cloner;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0oOo0O0 {
    public static final /* synthetic */ int OooOo0 = 0;
    public boolean OooO;
    public final o0O0o0 OooO00o;
    public final o0O0o0 OooO0O0;
    public o0O00OOO OooO0OO;
    public o0O00OOO OooO0Oo;
    public Bundle OooO0o;
    public Intent OooO0o0;
    public boolean OooO0oO;
    public boolean OooO0oo;
    public int OooOO0;
    public o0O00OOO OooOO0O;
    public int OooOO0o;
    public dm1 OooOOO;
    public o0O00OOO OooOOO0;
    public boolean OooOOOO;
    public dm1 OooOOOo;
    public final o0O000O OooOOo;
    public final o0O0o00O OooOOo0;
    public boolean OooOOoo;
    public int OooOo00;

    static {
        u7.OooO00o(new byte[]{-5, -97}, new byte[]{-70, -46, -116, -64, -62, -52, 117, -44});
    }

    public o0oOo0O0(o0O0o0 o0o0o0, o0O0o0 o0o0o02) {
        this.OooO0O0 = o0o0o0;
        this.OooO00o = o0o0o02;
        o0O0o00O o0o0o00o = o0o0o0.OooO0O0;
        this.OooOOo0 = o0o0o00o;
        this.OooOOo = o0o0o00o.OooO00o;
    }

    public final void OooO00o(dm1 dm1Var) {
        if (this.OooOOoo || dm1Var == null) {
            return;
        }
        this.OooOOoo = true;
        try {
            ((ActivityManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{27, 85, 119, -78, -35, -41, -56, 89}, new byte[]{122, 54, 3, -37, -85, -66, -68, 32}))).moveTaskToFront(dm1Var.OooO0o, 0);
        } catch (Exception unused) {
        }
    }

    public final void OooO0O0() {
        dm1 dm1Var = this.OooOOOo;
        if (dm1Var == null || this.OooOOoo) {
            return;
        }
        u7.OooO00o(new byte[]{5, -92, 34, -37, -68, 51, -47, -121, 5, -90, 52, -38}, new byte[]{119, -63, 81, -82, -47, 86, -123, -26});
        OooO00o(dm1Var);
    }

    public final void OooO0OO() {
        o0O0o00O o0o0o00o = this.OooO0O0.OooO0O0;
        o0O00OOO o0o00oooOooOO0O = o0o0o00o.OooOO0O();
        dm1 dm1VarOooO0O0 = o0o00oooOooOO0O != null ? o0o00oooOooOO0O.OooOOO : o0o0o00o.OooO0O0(this.OooO0OO);
        this.OooO0OO.OooO(dm1VarOooO0O0);
        if (o0o00oooOooOO0O.OooOOO != null) {
            u7.OooO00o(new byte[]{6, 32, -34, 66, -90, -3, -52, -23, 51, 43, -54, 127, -87, -23, -13}, new byte[]{103, 68, -70, 43, -56, -102, -104, -122});
            OooO00o(dm1VarOooO0O0);
        }
    }

    public final int OooO0Oo(b51 b51Var, Intent intent, String str, ActivityInfo activityInfo, ResolveInfo resolveInfo, o0O00OOO o0o00ooo, String str2, int i, int i2, String str3, Bundle bundle, o0O00OOO[] o0o00oooArr, int i3, int i4) {
        ActivityInfo activityInfo2;
        dm1 dm1Var;
        String str4;
        o0O00OOO o0o00ooo2;
        int i5;
        dm1 dm1Var2;
        o0O0o00O o0o0o00o;
        ActivityInfo activityInfo3;
        IBinder iBinder;
        ActivityInfo activityInfo4;
        int i6;
        String str5 = str3;
        int i7 = b51Var != null ? b51Var.OooO0Oo.uid : i2;
        this.OooOo00 = 0;
        if (resolveInfo == null) {
            Uri data = intent.getData();
            int iOooO0oO = qx1.OooO0oO();
            String strOooO0Oo = qx1.OooO0Oo();
            if (data != null && u7.OooO00o(new byte[]{87, -31, 39, 44, 46, -115, -43}, new byte[]{39, -128, 68, 71, 79, -22, -80, 99}).equals(data.getScheme())) {
                String schemeSpecificPart = data.getSchemeSpecificPart();
                String action = intent.getAction();
                if (schemeSpecificPart != null && mx1.OooO0oO().OooOO0o(iOooO0oO, schemeSpecificPart) && !TextUtils.equals(action, u7.OooO00o(new byte[]{13, -112, 105, -4, 90, 53, -110, -7, 5, -112, 121, -21, 91, 40, -40, -74, 15, -118, 100, -31, 91, 114, -93, -103, 37, -80, 94, -38, 116, 16, -70, -120, 60, -65, 78, -59, 116, 27, -77}, new byte[]{108, -2, 13, -114, 53, 92, -10, -41}))) {
                    intent.setData(data.buildUpon().encodedOpaquePart(strOooO0Oo).build());
                }
            }
            lr2.OooO00o(iOooO0oO, intent, strOooO0Oo);
            Uri uriOooO0O0 = lr2.OooO0O0(iOooO0oO, intent.getData(), strOooO0Oo);
            if (uriOooO0O0 != null) {
                intent.setDataAndType(uriOooO0O0, intent.getType());
            }
            ResolveInfo resolveInfoResolveActivity = p80.OooO0OO.OooO00o.resolveActivity(intent, 0);
            if (resolveInfoResolveActivity == null) {
                resolveInfoResolveActivity = null;
            }
            List list = s21.OooO0Oo;
            List list2 = s21.OooO0O0;
            if (eu2.OooO00o(intent)) {
                if (ox1.o0O0ooO().oo00o(i4, str5)) {
                    String[] stringArrayExtra = intent.getStringArrayExtra(u7.OooO00o(new byte[]{-63, -25, -113, 59, -77, -19, -89, 8, -61, -26, -123, 61, -71, -22, -73, 8, -48, -28, -59, 44, -92, -16, -79, 71, -114, -37, -82, 24, -119, -63, -112, 114, -1, -39, -82, 27, -111, -51, -112, 117, -23, -58, -91, 26, -125, -54, -126, 107, -27, -38}, new byte[]{-96, -119, -21, 73, -36, -124, -61, 38}));
                    if (!fn2.OooO0o0(stringArrayExtra)) {
                        ArrayList arrayList = new ArrayList(Arrays.asList(stringArrayExtra));
                        Iterator it = arrayList.iterator();
                        boolean z = false;
                        while (it.hasNext()) {
                            if (list2.contains((String) it.next())) {
                                it.remove();
                                z = true;
                            }
                        }
                        if (z) {
                            arrayList.addAll(list);
                            String[] strArr = new String[arrayList.size()];
                            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                                strArr[i8] = (String) arrayList.get(i8);
                            }
                            intent.putExtra(u7.OooO00o(new byte[]{2, -22, 117, -127, 20, 108, 27, 25, 0, -21, 127, -121, 30, 107, 11, 25, 19, -23, 63, -106, 3, 113, 13, 86, 77, -42, 84, -94, 46, 64, 44, 99, 60, -44, 84, -95, 54, 76, 44, 100, 42, -53, 95, -96, 36, 75, 62, 122, 38, -41}, new byte[]{99, -124, 17, -13, 123, 5, 127, 55}), strArr);
                        }
                    }
                } else {
                    ox1 ox1VarO0O0ooO = ox1.o0O0ooO();
                    if (Build.VERSION.SDK_INT < 33) {
                        ox1VarO0O0ooO.getClass();
                    } else {
                        ApplicationInfo applicationInfoO0000oO0 = ox1VarO0O0ooO.o0000oO0(0, i4, null, str5);
                        if (applicationInfoO0000oO0 != null) {
                            int i9 = applicationInfoO0000oO0.targetSdkVersion;
                            int i10 = ox1VarO0O0ooO.OooO0o.getApplicationInfo().targetSdkVersion;
                            if (i9 >= 33 && i10 < 33 && i10 >= 30) {
                                String[] stringArrayExtra2 = intent.getStringArrayExtra(u7.OooO00o(new byte[]{-53, 19, -19, -85, 21, 94, -110, -104, -55, 18, -25, -83, 31, 89, -126, -104, -38, 16, -89, -68, 2, 67, -124, -41, -124, 47, -52, -120, 47, 114, -91, -30, -11, 45, -52, -117, 55, 126, -91, -27, -29, 50, -57, -118, 37, 121, -73, -5, -17, 46}, new byte[]{-86, 125, -119, -39, 122, 55, -10, -74}));
                                if (!fn2.OooO0o0(stringArrayExtra2)) {
                                    ArrayList arrayList2 = new ArrayList(Arrays.asList(stringArrayExtra2));
                                    Iterator it2 = arrayList2.iterator();
                                    boolean z2 = false;
                                    while (it2.hasNext()) {
                                        if (list.contains((String) it2.next())) {
                                            it2.remove();
                                            z2 = true;
                                        }
                                    }
                                    if (z2) {
                                        arrayList2.addAll(list2);
                                        String[] strArr2 = new String[arrayList2.size()];
                                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                            strArr2[i11] = (String) arrayList2.get(i11);
                                        }
                                        intent.putExtra(u7.OooO00o(new byte[]{-15, -117, 44, -79, -108, -102, 57, -15, -13, -118, 38, -73, -98, -99, 41, -15, -32, -120, 102, -90, -125, -121, 47, -66, -66, -73, 13, -110, -82, -74, 14, -117, -49, -75, 13, -111, -74, -70, 14, -116, -39, -86, 6, -112, -92, -67, 28, -110, -43, -74}, new byte[]{-112, -27, 72, -61, -5, -13, 93, -33}), strArr2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (eu2.OooO00o(intent)) {
                String[] stringArrayExtra3 = intent.getStringArrayExtra(u7.OooO00o(new byte[]{-77, -52, 88, -123, -78, -108, 20, -88, -79, -51, 82, -125, -72, -109, 4, -88, -94, -49, 18, -110, -91, -119, 2, -25, -4, -16, 121, -90, -120, -72, 35, -46, -115, -14, 121, -91, -112, -76, 35, -43, -101, -19, 114, -92, -126, -77, 49, -53, -105, -15}, new byte[]{-46, -94, 60, -9, -35, -3, 112, -122}));
                if (!fn2.OooO0o0(stringArrayExtra3)) {
                    HashSet hashSet = new HashSet(Arrays.asList(stringArrayExtra3));
                    boolean zContains = hashSet.contains(u7.OooO00o(new byte[]{126, 122, -37, -78, -121, 22, -81, 22, 111, 113, -51, -83, -127, 12, -72, 81, 112, 122, -111, -109, -83, 49, -113, 103, 76, 89, -20}, new byte[]{31, 20, -65, -64, -24, 127, -53, 56}));
                    if (hashSet.contains(u7.OooO00o(new byte[]{5, 87, -30, -70, 39, -94, -20, 60, 20, 92, -12, -91, 33, -72, -5, 123, 11, 87, -88, -102, 13, -118, -52, 77, 55, 116, -43}, new byte[]{100, 57, -122, -56, 72, -53, -120, 18})) ^ zContains) {
                        if (zContains) {
                            hashSet.add(u7.OooO00o(new byte[]{118, -71, -104, -56, 12, 12, 118, 37, 103, -78, -114, -41, 10, 22, 97, 98, 120, -71, -46, -24, 38, 36, 86, 84, 68, -102, -81}, new byte[]{23, -41, -4, -70, 99, 101, 18, 11}));
                        } else {
                            hashSet.add(u7.OooO00o(new byte[]{-97, 33, 72, 110, 78, -124, -15, -86, -114, 42, 94, 113, 72, -98, -26, -19, -111, 33, 2, 79, 100, -93, -47, -37, -83, 2, 127}, new byte[]{-2, 79, 44, 28, 33, -19, -107, -124}));
                        }
                        intent.putExtra(u7.OooO00o(new byte[]{-115, 46, -94, 86, 40, 7, -37, 104, -113, 47, -88, 80, 34, 0, -53, 104, -100, 45, -24, 65, 63, 26, -51, 39, -62, 18, -125, 117, 18, 43, -20, 18, -77, 16, -125, 118, 10, 39, -20, 21, -91, 15, -120, 119, 24, 32, -2, 11, -87, 19}, new byte[]{-20, 64, -58, 36, 71, 110, -65, 70}), (String[]) hashSet.toArray(new String[0]));
                    }
                }
            }
            if (resolveInfoResolveActivity == null || (activityInfo4 = resolveInfoResolveActivity.activityInfo) == null || !activityInfo4.exported) {
                activityInfo3 = activityInfo;
            } else {
                qx1.OooO0Oo();
                Uri data2 = intent.getData();
                if (data2 == null) {
                    i6 = 8;
                } else {
                    i6 = 8;
                    if (TextUtils.equals(data2.getScheme(), u7.OooO00o(new byte[]{116, 3, 119, 28, 11}, new byte[]{28, 119, 3, 108, 120, -73, 17, 82}))) {
                        data2.getAuthority();
                    }
                }
                byte[] bArr = new byte[i6];
                // fill-array-data instruction
                bArr[0] = -37;
                bArr[1] = -50;
                bArr[2] = -28;
                bArr[3] = 113;
                bArr[4] = 127;
                bArr[5] = 67;
                bArr[6] = -51;
                bArr[7] = -34;
                u7.OooO00o(new byte[]{-10, -29, -55, 92, 82, 110, -32, -13, -10, -29, -55, 92, 82, 110, -32, -13, -10}, bArr);
                Objects.toString(intent.getData());
                int i12 = fp0.OooO00o;
                activityInfo3 = resolveInfoResolveActivity.activityInfo;
                o0O0o0.OooO0O0(intent, resolveInfoResolveActivity);
            }
            if (b51Var != null) {
                if (o0o00ooo == null) {
                    iBinder = null;
                } else {
                    try {
                        iBinder = o0o00ooo.OooOoOO;
                    } catch (Throwable unused) {
                        return -96;
                    }
                }
                b51Var.OooOOoo.OooOO0O.o000Oo0O(o0O000.OooO0OO(intent, str, iBinder, str2, i, bundle).OooO0O0());
                return 0;
            }
            activityInfo2 = activityInfo3;
        } else {
            activityInfo2 = activityInfo;
        }
        o0O00OOO o0o00ooo3 = (o0o00ooo == null || i < 0 || o0o00ooo.OooO00o()) ? null : o0o00ooo;
        if ((intent.getFlags() & 33554432) == 0 || o0o00ooo == null) {
            dm1Var = null;
            str4 = str2;
            o0o00ooo2 = o0o00ooo3;
            i5 = i;
        } else {
            if (i >= 0) {
                return -93;
            }
            this.OooOo00 |= 33554432;
            o0O00OOO o0o00ooo4 = o0o00ooo.OooOOOO;
            if (o0o00ooo4 != null && ((dm1Var2 = o0o00ooo4.OooOOO) == null || (o0o0o00o = dm1Var2.OooO0o0) == null || o0o0o00o.OooO0o0(o0o00ooo4) == null)) {
                o0o00ooo4 = null;
            }
            str4 = o0o00ooo.OooOOOo;
            int i13 = o0o00ooo.OooOOo;
            dm1Var = null;
            o0o00ooo.OooOOOO = null;
            if (o0o00ooo.OooO0o == i7) {
                str5 = o0o00ooo.OooO0oO;
            }
            o0o00ooo2 = o0o00ooo4;
            i5 = i13;
        }
        int i14 = intent.getComponent() == null ? -92 : 0;
        if (i14 == 0 && activityInfo2 == null) {
            i14 = -91;
        }
        if (i14 == 0) {
            dm1 dm1Var3 = dm1Var;
            o0O00OOO o0o00ooo5 = new o0O00OOO(b51Var, i7, str5, intent, str, activityInfo2, o0o00ooo2, str4, str2, i5, i, bundle, i4);
            o0o00oooArr[0] = o0o00ooo5;
            return OooO0o(o0o00ooo5, o0o00ooo, bundle, i3 != -1 ? this.OooOOo0.OooOO0(i3) : dm1Var3);
        }
        if (o0o00ooo2 != null) {
            o0O000O o0o000o = this.OooOOo;
            IBinder iBinder2 = o0o00ooo == null ? dm1Var : o0o00ooo.OooOoOO;
            o0o000o.getClass();
            o0O000O.OoooOOo(b51Var, intent, str, iBinder2, str4, i5, bundle);
        }
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooO0o(com.cmaster.cloner.o0O00OOO r26, com.cmaster.cloner.o0O00OOO r27, android.os.Bundle r28, com.cmaster.cloner.dm1 r29) {
        /*
            Method dump skipped, instructions count: 2446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o0oOo0O0.OooO0o(com.cmaster.cloner.o0O00OOO, com.cmaster.cloner.o0O00OOO, android.os.Bundle, com.cmaster.cloner.dm1):int");
    }

    public final int OooO0o0(b51 b51Var, int i, String str, Intent intent, String str2, IBinder iBinder, String str3, int i2, Bundle bundle, int i3, int i4) throws Throwable {
        ResolveInfo resolveInfoO000O0;
        int i5;
        o0O0o0 o0o0o0;
        int iOooO0Oo = 0;
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{85, 118, 109, -82, 2, 123, -39, -5, 112, 109, 104, -69, 86, 112, -50, -5, 51, 111, 96, -72, 81, 122, -40, -88, 122, 113, 33, -126, 76, 107, -39, -26, 103}, new byte[]{19, 31, 1, -53, 34, 31, -68, -120}));
            return 0;
        }
        intent.getComponent();
        new Intent(intent);
        Intent intent2 = new Intent(intent);
        try {
            resolveInfoO000O0 = ox1.o0O0ooO().o000O0(null, intent2, str2, 66560, i4);
        } catch (Exception unused) {
            resolveInfoO000O0 = null;
        }
        ActivityInfo activityInfoOooO0O0 = o0O0o0.OooO0O0(intent2, resolveInfoO000O0);
        Binder.getCallingPid();
        int callingUid = Binder.getCallingUid();
        if (i >= 0) {
            i5 = i;
        } else {
            if (b51Var != null) {
                callingUid = -1;
            }
            i5 = callingUid;
        }
        o0O00OOO[] o0o00oooArr = new o0O00OOO[1];
        o0O0o0 o0o0o02 = this.OooO00o;
        synchronized (o0o0o02) {
            try {
                try {
                    this.OooO0O0.OooO0O0.OooO0oO();
                    o0o0o0 = o0o0o02;
                    try {
                        iOooO0Oo = OooO0Oo(b51Var, intent2, str2, activityInfoOooO0O0, resolveInfoO000O0, o0O00OOO.OooO0oo(iBinder), str3, i2, i5, str, bundle, o0o00oooArr, i3, i4);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        u7.OooO00o(new byte[]{95, 86, -79, 86, -64, -67, 97, -6, 7, 21, -1, 19, -51, -30, 104, -18, 1, 23, -24, 91}, new byte[]{114, 123, -100, 123, -19, -112, 13, -101});
                        int i6 = fp0.OooO00o;
                        return iOooO0Oo;
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                o0o0o0 = o0o0o02;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
            u7.OooO00o(new byte[]{95, 86, -79, 86, -64, -67, 97, -6, 7, 21, -1, 19, -51, -30, 104, -18, 1, 23, -24, 91}, new byte[]{114, 123, -100, 123, -19, -112, 13, -101});
            int i62 = fp0.OooO00o;
            return iOooO0Oo;
        }
        throw th;
    }
}

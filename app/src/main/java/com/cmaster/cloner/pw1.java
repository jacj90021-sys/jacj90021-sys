package com.cmaster.cloner;

import android.app.ActivityManager;
import android.app.Notification;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.NetworkRequest;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pw1 extends ve0 {
    public static final int OooOOo = Process.myPid();
    public static final int OooOOoo = Process.myUid();
    public static final oO00OOOo OooOo00 = new oO00OOOo(11);
    public o0o0Oo OooO;
    public oO00OOo0 OooO0o;
    public Context OooO0o0;
    public ox1 OooO0oO;
    public sx1 OooO0oo;
    public oOo00o0o OooOO0;
    public HandlerThread OooOO0O;
    public oOO0OO OooOO0o;
    public final HashMap OooOOO;
    public ho1 OooOOO0;
    public im2 OooOOOO;
    public o0O0o0 OooOOOo;
    public int OooOOo0;

    public pw1() {
        attachInterface(this, u7.OooO00o(new byte[]{-43, 61, -4, -117, 73, -102, -53, 92, -62, 55, -29, -117, 73, -101, -59, 65, -45, 32, -65, -25, 124, -69, -23, 98, -6, 8, -36, -23, 125, -66, -13, 101, -8, 25, -39, -9}, new byte[]{-74, 82, -111, -91, 42, -9, -86, 47}));
        new HashMap();
        this.OooOOO = new HashMap();
        new nw1();
    }

    public static pw1 o00O0000() {
        return (pw1) OooOo00.OooO0O0();
    }

    public static String o00O000o(zi0 zi0Var, String str) {
        int length;
        int length2;
        String str2;
        Intent intent = zi0Var.OooO0o;
        if (intent == null) {
            return null;
        }
        if (zi0Var.OooOO0o != null && (str2 = zi0Var.OooOO0O) == str && (str2 == null || str2.equals(str))) {
            return zi0Var.OooOO0o;
        }
        zi0Var.OooOO0O = str;
        StringBuilder sb = new StringBuilder(128);
        if (str != null) {
            sb.append(str);
        }
        if (intent.getAction() != null) {
            sb.append(intent.getAction());
        } else if (intent.getComponent() != null) {
            ComponentName component = intent.getComponent();
            String packageName = component.getPackageName();
            String className = component.getClassName();
            sb.append(packageName);
            sb.append('/');
            if (className.startsWith(packageName) && (length2 = className.length()) > (length = packageName.length()) && className.charAt(length) == '.') {
                sb.append((CharSequence) className, length, length2);
            } else {
                sb.append(className);
            }
        } else {
            sb.append(u7.OooO00o(new byte[]{-119}, new byte[]{-74, 50, -18, -38, -34, -37, -78, -111}));
        }
        String string = sb.toString();
        zi0Var.OooOO0o = string;
        return string;
    }

    @Override // com.cmaster.cloner.we0
    public final int OooO(String str, Intent intent, String str2, IBinder iBinder, String str3, int i, Bundle bundle, int i2) {
        o0O0o0 o0o0o0 = this.OooOOOo;
        int callingUid = Binder.getCallingUid();
        int callingPid = Binder.getCallingPid();
        o0o0o0.getClass();
        return o0o0o0.OooO0Oo.OooO0o0(oO00OOo0.OooO0Oo().OooO0o0(callingPid), callingUid, str, intent, str2, iBinder, str3, i, bundle, -1, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    @Override // com.cmaster.cloner.we0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.cmaster.cloner.vi OooO0OO(int r10, java.lang.String r11, java.lang.String r12) {
        /*
            r9 = this;
            com.cmaster.cloner.im2 r9 = r9.OooOOOO
            r9.getClass()
            com.cmaster.cloner.ox1 r9 = com.cmaster.cloner.ox1.o0O0ooO()
            r0 = 1024(0x400, float:1.435E-42)
            android.content.pm.ProviderInfo r2 = r9.o000o0Oo(r0, r10, r11, r12)
            r9 = 0
            if (r2 == 0) goto L40
            com.cmaster.cloner.oO00OOo0 r11 = com.cmaster.cloner.oO00OOo0.OooO0Oo()
            java.lang.String r12 = r2.packageName
            java.lang.String r0 = r2.processName
            com.cmaster.cloner.b51 r4 = r11.OooO00o(r10, r12, r0)
            if (r4 == 0) goto L74
            com.cmaster.cloner.oO00Oo0 r11 = r4.OooOOoo
            com.cmaster.cloner.w90 r11 = r11.OooOO0O
            boolean r12 = com.cmaster.cloner.oO00OOO.OooO0Oo(r11)
            if (r12 != 0) goto L33
            com.cmaster.cloner.oO00Oo0 r11 = r4.OooOOoo
            com.cmaster.cloner.oO00OOO r11 = r11.OooO0o
            r11.OooO0o0()
            r5 = r9
            goto L34
        L33:
            r5 = r11
        L34:
            com.cmaster.cloner.vi r1 = new com.cmaster.cloner.vi
            com.cmaster.cloner.oO00Oo0 r9 = r4.OooOOoo
            java.lang.String r3 = r9.OooO0Oo
            r7 = 0
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
        L40:
            r6 = r10
            com.cmaster.cloner.p80 r10 = com.cmaster.cloner.p80.OooO0OO
            android.content.pm.PackageManager r1 = r10.OooO00o
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r12, r0)
            if (r0 != 0) goto L4d
        L4b:
            r3 = r9
            goto L67
        L4d:
            com.cmaster.cloner.v03 r10 = r10.OooO0O0
            r10.getClass()
            android.content.pm.ApplicationInfo r10 = r0.applicationInfo
            if (r10 == 0) goto L60
            java.lang.String r1 = r10.packageName
            boolean r11 = android.text.TextUtils.equals(r11, r1)
            if (r11 == 0) goto L60
            r10 = 0
            goto L64
        L60:
            boolean r10 = com.cmaster.cloner.i21.OooO0oO(r10)
        L64:
            if (r10 == 0) goto L4b
            r3 = r0
        L67:
            if (r3 == 0) goto L74
            com.cmaster.cloner.vi r2 = new com.cmaster.cloner.vi
            r8 = 1
            r5 = 0
            r7 = r6
            r6 = 0
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        L74:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pw1.OooO0OO(int, java.lang.String, java.lang.String):com.cmaster.cloner.vi");
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooO0oO(IBinder iBinder, int i) {
        this.OooOOOo.getClass();
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooOo(IBinder iBinder) {
        synchronized (this.OooOOOo.OooO0OO) {
            try {
                if (iBinder instanceof o0O00OOO) {
                    if (!(((o0O00OOO) iBinder).OooO0Oo >= 3)) {
                        o0O00OOO o0o00ooo = (o0O00OOO) iBinder;
                        if (o0o00ooo.OooO0Oo == 2) {
                            o0o00ooo.OooO0Oo();
                        }
                    }
                }
            } finally {
            }
        }
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final int OooOo0o(w90 w90Var, Intent intent, String str, int i) {
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{75, -61, -87, 34, -88, 64, -26, -16, 110, -40, -84, 55, -4, 75, -15, -16, 45, -38, -92, 52, -5, 65, -25, -93, 100, -60, -27, 14, -26, 80, -26, -19, 121}, new byte[]{13, -86, -59, 71, -120, 36, -125, -125}));
            return 0;
        }
        synchronized (this) {
            try {
                int iOooOo0O = this.OooO.OooOo0O(w90Var, intent, str, i);
                if (iOooOo0O == 0) {
                    ResolveInfo resolveInfoO000OoOo = this.OooO0oO.o000OoOo(null, intent, intent.getType(), 512, i);
                    if ((resolveInfoO000OoOo != null ? resolveInfoO000OoOo.serviceInfo : null) == null) {
                        return -2;
                    }
                }
                return iOooOo0O;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooOoO0(IBinder iBinder, IBinder iBinder2, Intent intent, IBinder iBinder3) {
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{-62, -61, -5, -76, 111, 59, 85, 15, -25, -40, -2, -95, 59, 48, 66, 15, -92, -38, -10, -94, 60, 58, 84, 92, -19, -60, -73, -104, 33, 43, 85, 18, -16}, new byte[]{-124, -86, -105, -47, 79, 95, 48, 124}));
            return false;
        }
        if (!(iBinder instanceof kf1)) {
            return false;
        }
        synchronized (this) {
            this.OooO.OooOO0O((kf1) iBinder, iBinder2, intent, iBinder3);
        }
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder Oooo(int i, IBinder iBinder, String str, String str2) {
        oO00Oo0 oo00oo0;
        oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
        oo00ooo0OooO0Oo.getClass();
        synchronized (oO00OOo0.OooO0o0) {
            try {
                Iterator it = oo00ooo0OooO0Oo.OooO0OO.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        oo00oo0 = null;
                        break;
                    }
                    oo00oo0 = (oO00Oo0) it.next();
                    if (!TextUtils.equals(str, ((b51) oo00ooo0OooO0Oo.OooO0OO.get(oo00oo0)).OooO) || !TextUtils.equals(str2, oo00oo0.OooO0o0)) {
                    }
                }
            } finally {
            }
        }
        if (oo00oo0 == null) {
            return null;
        }
        synchronized (oO00OOo0.OooO0o0) {
            b51 b51Var = (b51) oo00ooo0OooO0Oo.OooO0OO.get(oo00oo0);
            if (b51Var == null) {
                return null;
            }
            try {
                oo00ooo0OooO0Oo.OooO0O0.put(i, b51Var);
                oo00oo0.OooO00o(i, iBinder, b51Var.OooOO0);
                oo00oo0.OooOO0O.o000o0O0(new p2(b51Var, oo00oo0.OooOO0));
                oo00oo0.OooO.open();
                cx1.OooO0o.execute(new o00OOO00(b51Var, 3));
                return oo00oo0;
            } catch (RemoteException e) {
                u7.OooO00o(new byte[]{-65, 95, 103, 88, 27, -51, -79, -114, -117, 106, 99, 107, 84, -35, -96, -100, -118}, new byte[]{-7, 30, 51, 25, 59, -66, -59, -17});
                int i2 = fp0.OooO00o;
                throw new RuntimeException(e);
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void Oooo000(IBinder iBinder, int i, int i2, int i3) {
        synchronized (this) {
            try {
                if (!(iBinder instanceof kf1)) {
                    u7.OooO00o(new byte[]{-112, 12, 91, 87, -61, -83, -123, -10, -116, 7, 76, 100, -46, -85, -125, -57, -105, 0, 71, 70, -112, -18, -87, -36, -107, 8, 69, 72, -50, -18, -109, -41, -111, 31, 64, 66, -49, -18, -108, -35, -120, 12, 71, 28}, new byte[]{-29, 105, 41, 33, -86, -50, -32, -78});
                    Objects.toString(iBinder);
                    int i4 = fp0.OooO00o;
                    throw new IllegalArgumentException(u7.OooO00o(new byte[]{44, -51, 5, -29, -102, 32, -70, -44, 22, -58, 1, -12, -97, 42, -69, -44, 17, -52, 24, -25, -104}, new byte[]{101, -93, 115, -126, -10, 73, -34, -12}));
                }
                this.OooO.OooOOo0((kf1) iBinder, i, i2, i3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #2 {, blocks: (B:15:0x0042, B:16:0x004b, B:18:0x004e, B:48:0x00bf, B:21:0x0058, B:23:0x005e, B:25:0x006a, B:27:0x0077, B:32:0x008a, B:37:0x009a, B:39:0x00b0, B:44:0x00b7, B:49:0x00c6, B:50:0x00db, B:51:0x00dc), top: B:68:0x0042, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b0 A[SYNTHETIC] */
    @Override // com.cmaster.cloner.we0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OoooO0(java.lang.String r32, android.content.Intent[] r33, java.lang.String[] r34, android.os.IBinder r35, android.os.Bundle r36, int r37) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.pw1.OoooO0(java.lang.String, android.content.Intent[], java.lang.String[], android.os.IBinder, android.os.Bundle, int):int");
    }

    @Override // com.cmaster.cloner.we0
    public final int OoooOOO(String str, int i, int i2, String str2, String str3, int i3) {
        if (str == null || u7.OooO00o(new byte[]{-89, -111, -25, -128, 6, 85, -90, 116, -74, -102, -15, -97, 0, 79, -79, 51, -87, -111, -83, -77, 42, 127, -115, 15, -120, -85, -36, -65, 40, 114, -125, 29, -125, -83}, new byte[]{-58, -1, -125, -14, 105, 60, -62, 90}).equals(str)) {
            return 0;
        }
        if (u7.OooO00o(new byte[]{10, 110, -36, 109, -69, -96, -67, 19, 27, 101, -54, 114, -67, -70, -86, 84, 4, 110, -106, 86, -102, -99, -100, 111, 42, 67, -20, 64, -107, -118, -117, 114, 56, 83, -25, 74, -121, -116, -117, 110}, new byte[]{107, 0, -72, 31, -44, -55, -39, 61}).equals(str) || u7.OooO00o(new byte[]{90, 40, -15, 110, 7, 103, 92, 56, 75, 35, -25, 113, 1, 125, 75, 127, 84, 40, -69, 85, 38, 90, 125, 68, 122, 5, -63, 67, 41, 77, 106, 89, 104, 21, -54, 73, 59, 75, 106, 69, 100, 0, -64, 80, 36}, new byte[]{59, 70, -107, 28, 104, 14, 56, 22}).equals(str)) {
            return -1;
        }
        if (i2 == 0) {
            return 0;
        }
        return oO00OOo0.OooO0Oo().OooO0o0(i) == null ? this.OooO0o0.checkPermission(str, i, i2) : this.OooO0oO.o0000o0O(str, i3, str2, str3);
    }

    @Override // com.cmaster.cloner.we0
    public final void OoooOoo(String str, String str2, long j, String str3, int i, byte[] bArr) {
        ka.OooO0O0().getClass();
        ka.OooO0Oo(str, str2, j, str3, i, bArr);
    }

    @Override // com.cmaster.cloner.we0
    public final boolean OooooOO(IBinder iBinder, int i) {
        synchronized (this.OooOOOo.OooO0O0.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oO = o0O00OOO.OooO0oO(iBinder);
                if (o0o00oooOooO0oO != null) {
                    o0o00oooOooO0oO.OooOOO.OooOOO0();
                    if (ah1.OooO0o0 == null) {
                        synchronized (ah1.class) {
                            if (ah1.OooO0o0 == null) {
                                ah1 ah1Var = new ah1(0);
                                cx1.OooO0o.execute(ah1Var);
                                ah1.OooO0o0 = ah1Var;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
        return true;
    }

    public final void o00(int i, int i2, String str) {
        if (i2 == -1 && str == null) {
            u7.OooO00o(new byte[]{-111, -43, -45, -29, 43, 29, -82, 2, -96, -41, -40, -28, 44, 73, -89, 29, -14, -43, -47, -88, 127, 77, -70, 2, -79, -47, -50, -73, 58, 78, -24, 2, -76, -108, -36, -88, 51, 29, -67, 30, -73, -58, -50, -24, 127, 73, -96, 12, -90, -108, -44, -73, 127, 84, -90, 30, -77, -38, -40, -27}, new byte[]{-46, -76, -67, -60, 95, 61, -56, 109});
            int i3 = fp0.OooO00o;
        }
        if (i < 0 && str != null) {
            i = this.OooO0oO.o00O00OO(i2, str);
        }
        if (str != null) {
            u7.OooO00o(new byte[]{29, -101, 58, 23, 44, 107, 127, -12, 52, -124, 56, 29, 39, 44, 44}, new byte[]{91, -12, 72, 116, 73, 75, 12, -128});
            u7.OooO00o(new byte[]{9, -125, -110, 56, 26, -76, 83}, new byte[]{41, -30, -30, 72, 115, -48, 110, -14});
            u7.OooO00o(new byte[]{64, -1, 115, 20, -125, 15}, new byte[]{96, -118, 0, 113, -15, 50, 81, 71});
            u7.OooO00o(new byte[]{-29, 106}, new byte[]{-39, 74, -48, 64, 90, 36, -75, -115});
            int i4 = fp0.OooO00o;
        } else {
            u7.OooO00o(new byte[]{11, 124, -48, 35, 24, -127, 69, -97, 34, 99, -46, 41, 19, -58, 22, -98}, new byte[]{77, 19, -94, 64, 125, -95, 54, -21});
            u7.OooO00o(new byte[]{-74, -90}, new byte[]{-116, -122, -30, -65, 127, -8, 32, 15});
            int i5 = fp0.OooO00o;
        }
        oO00OOo0 oo00ooo0 = this.OooO0o;
        oo00ooo0.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (oO00OOo0.OooO0o0) {
            try {
                Iterator it = oo00ooo0.OooO0OO.keySet().iterator();
                while (it.hasNext()) {
                    b51 b51Var = (b51) oo00ooo0.OooO0OO.get((oO00Oo0) it.next());
                    if (str == null) {
                        if (i2 == -1 || b51Var.OooO0o0 == i2) {
                            if (i >= 0 || b51Var.OooO0oO == i) {
                                arrayList.add(b51Var);
                            }
                        }
                    } else if (i2 == -1 || b51Var.OooO0o0 == i2) {
                        if (b51Var.OooO0o.contains(str)) {
                            if (i >= 0) {
                            }
                            arrayList.add(b51Var);
                        }
                    }
                }
            } finally {
            }
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            b51 b51Var2 = (b51) obj;
            synchronized (this.OooOOOo.OooO0O0.OooO0OO) {
                try {
                    HashSet hashSet = new HashSet();
                    Iterator it2 = b51Var2.OooOOOo.iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((o0O00OOO) it2.next()).OooOOO);
                    }
                    Iterator it3 = hashSet.iterator();
                    while (it3.hasNext()) {
                        ((dm1) it3.next()).OooO0o0();
                    }
                } finally {
                }
            }
        }
        int size2 = arrayList.size();
        while (i6 < size2) {
            Object obj2 = arrayList.get(i6);
            i6++;
            b51 b51Var3 = (b51) obj2;
            if (str == null) {
                u7.OooO00o(new byte[]{-7, 24, 2, 47, -101, 70, 127, -28, -8, 76}, new byte[]{-118, 108, 109, 95, -69, 51, 12, -127});
            } else {
                u7.OooO00o(new byte[]{-114, 96, 23, 95, 57}, new byte[]{-3, 20, 120, 47, 25, 90, 119, -72});
            }
            b51Var3.getClass();
            u7.OooO00o(new byte[]{-3, 30, -124, 49, 54, -71, 100, 125}, new byte[]{-74, 119, -24, 93, 95, -41, 3, 93});
            b51Var3.toString();
            u7.OooO00o(new byte[]{-61, -117, -45, 105, 4, -38, 6, -108, -49}, new byte[]{-17, -85, -95, 12, 101, -87, 105, -6});
            int i8 = fp0.OooO00o;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(b51Var3.OooOOOo);
            while (!arrayList2.isEmpty()) {
            }
            if (b51Var3.OooOOOo.isEmpty()) {
                oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
                oO00Oo0 oo00oo0 = b51Var3.OooOOoo;
                oo00ooo0OooO0Oo.getClass();
                synchronized (oO00OOo0.OooO0o0) {
                    oo00oo0.OooOOO.OooO0OO(oo00oo0);
                }
            }
            b51Var3.OooOOO = true;
        }
    }

    @Override // com.cmaster.cloner.we0
    public final String o0000(IBinder iBinder, int i) {
        String str;
        synchronized (this.OooOOOo.OooO0O0.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oo = o0O00OOO.OooO0oo(iBinder);
                o0O00OOO o0o00ooo = o0o00oooOooO0oo == null ? null : o0o00oooOooO0oo.OooOOOO;
                str = o0o00ooo != null ? o0o00ooo.OooO0o0.packageName : null;
            } finally {
            }
        }
        return str;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o00000(int i, Intent intent, String str) {
        ActivityInfo activityInfoO000000o = this.OooO0oO.o000000o(null, intent.getComponent(), 0, i);
        if (activityInfoO000000o != null) {
            oO00OOo0 oo00ooo0 = this.OooO0o;
            String str2 = activityInfoO000000o.applicationInfo.packageName;
            String str3 = activityInfoO000000o.processName;
            u7.OooO00o(new byte[]{116}, new byte[]{22, -25, 43, -18, -33, -122, 63, -4});
            b51 b51VarOooO0oo = oo00ooo0.OooO0oo(i, str2, str3);
            if (b51VarOooO0oo == null || b51VarOooO0oo.OooOOoo.OooOO0O == null) {
                u7.OooO00o(new byte[]{-34, 82, 55, 34, -83, 61, -44, -96, -28, 28, 58, 33, -76, 54, -105, -68, -85, 93, 38, 48, -31}, new byte[]{-117, 60, 86, 64, -63, 88, -12, -44});
                String str4 = activityInfoO000000o.applicationInfo.packageName;
                u7.OooO00o(new byte[]{-52}, new byte[]{-29, 9, 53, 116, 97, 39, 33, 103});
                int i2 = activityInfoO000000o.applicationInfo.uid;
                u7.OooO00o(new byte[]{76, -78, 20, 80, -108, 76, -56, -116, 13, -80, 24, 67, -57, 90, -13, -115, 24, -79, 21, 86, -108}, new byte[]{108, -44, 123, 34, -76, 46, -70, -29});
                intent.toString();
                u7.OooO00o(new byte[]{-38, 54, -80, -18, 20, 10, -10, -116, -109, 54, -87, -17, 91, 11, -14, -101}, new byte[]{-32, 22, -64, -100, 123, 105, -109, -1});
                int i3 = fp0.OooO00o;
                return false;
            }
            try {
                b51VarOooO0oo.OooOOoo.OooOO0O.OooOOO0(intent, activityInfoO000000o);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000000O(IBinder iBinder, int i) {
        this.OooOOOo.getClass();
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final int o00000O(int i) {
        b51 b51VarOooO0o0 = this.OooO0o.OooO0o0(i);
        if (b51VarOooO0o0 == null) {
            return -1;
        }
        return b51VarOooO0o0.OooO0o0;
    }

    @Override // com.cmaster.cloner.we0
    public final void o00000O0(ComponentName componentName, IBinder iBinder, int i, Notification notification, int i2, int i3, int i4) {
        synchronized (this) {
            try {
                o0o0Oo o0o0oo = this.OooO;
                o0o0oo.getClass();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    kf1 kf1Var = (kf1) o0o0oo.OooO0oo(i4).OooO00o.get(componentName);
                    if (kf1Var != iBinder) {
                        kf1Var = null;
                    }
                    if (kf1Var != null) {
                        o0o0oo.OooOOoo(kf1Var, i, notification, i2);
                    }
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder o00000OO(int i, String str) {
        if (!yn2.OooO0Oo()) {
            return new Binder();
        }
        StringBuilder sb = new StringBuilder();
        rj.OooOOo0(new byte[]{125, 63, -7, -121, 21, 63, 93, -60, 94, 51, -17, -27}, new byte[]{40, 86, -99, -56, 119, 76, 56, -74}, sb, str);
        sb.append(u7.OooO00o(new byte[]{81}, new byte[]{124, 77, 1, -101, -41, 95, -122, -49}));
        sb.append(UUID.randomUUID().toString());
        return fq1.OooO0oO(sb.toString());
    }

    @Override // com.cmaster.cloner.we0
    public final NetworkRequest o00000Oo(String str, final IBinder iBinder, final Messenger messenger, int i) {
        final NetworkRequest networkRequest = null;
        if (Build.VERSION.SDK_INT >= 26) {
            int i2 = sw1.OooO0oo;
            final sw1 sw1Var = rw1.OooO00o;
            Handler handler = sw1Var.OooO00o;
            if (sw1Var.OooO0o0 != null) {
                if (sw1Var.OooO0Oo != null) {
                    NetworkRequest[] networkRequestArr = new NetworkRequest[1];
                    ConditionVariable conditionVariable = new ConditionVariable();
                    handler.post(new l1(sw1Var, networkRequestArr, conditionVariable, 12));
                    conditionVariable.block();
                    networkRequest = networkRequestArr[0];
                }
                handler.post(new Runnable() { // from class: com.cmaster.cloner.qw1
                    @Override // java.lang.Runnable
                    public final void run() throws RemoteException {
                        sw1 sw1Var2 = sw1Var;
                        Messenger messenger2 = messenger;
                        NetworkRequest networkRequest2 = networkRequest;
                        IBinder iBinder2 = iBinder;
                        sw1Var2.getClass();
                        uw0 uw0Var = new uw0(messenger2, networkRequest2, iBinder2);
                        if (sw1Var2.OooO0O0 != null) {
                            try {
                                Message messageObtain = Message.obtain(sw1Var2.OooO0O0);
                                messageObtain.getData().putParcelable("NetworkRequest", networkRequest2);
                                messenger2.send(messageObtain);
                            } catch (RemoteException unused) {
                            }
                        }
                        sw1Var2.OooO0o.register(uw0Var);
                    }
                });
            }
        }
        return networkRequest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.cmaster.cloner.dd0] */
    @Override // com.cmaster.cloner.we0
    public final void o00000oO(IBinder iBinder, IBinder iBinder2) {
        cd0 cd0Var;
        if (iBinder2 == null) {
            cd0Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder2.queryLocalInterface(u7.OooO00o(new byte[]{-107, 4, 21, -108, -11, 44, 50, 25, -126, 14, 10, -108, -11, 45, 60, 4, -109, 25, 86, -23, -59, 20, 3, 44, -67, 45, 42, -12, -64, 19, 31, 51, -81, 60}, new byte[]{-10, 107, 120, -70, -106, 65, 83, 106}));
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof dd0)) {
                cd0 cd0Var2 = new cd0();
                cd0Var2.OooO0Oo = iBinder2;
                cd0Var = cd0Var2;
            } else {
                cd0Var = (dd0) iInterfaceQueryLocalInterface;
            }
        }
        if (!(iBinder instanceof b51)) {
            a91.o0000o0O(cd0Var, null);
            return;
        }
        b51 b51Var = (b51) iBinder;
        oO00OO0O oo00oo0oOooO0o0 = b51Var.OooOOoo.OooO0o.OooO0o0();
        ow1 ow1Var = new ow1(cd0Var, b51Var);
        oo00oo0oOooO0o0.getClass();
        synchronized (oO00OOo0.OooO0o0) {
            try {
                if (oo00oo0oOooO0o0.OooO0O0()) {
                    a91.o0000o0O(cd0Var, b51Var.OooOOoo.OooOO0O);
                } else {
                    oo00oo0oOooO0o0.OooO0OO.add(ow1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o00000oo(IBinder iBinder, IBinder iBinder2, int i) {
        o0O0o0 o0o0o0 = this.OooOOOo;
        o0o0o0.getClass();
        if (iBinder instanceof o0O00OOO) {
            o0O00OOO o0o00ooo = (o0O00OOO) iBinder;
            if (o0o00ooo.OooO0Oo >= 3) {
                return false;
            }
            if (oO00OOo0.OooO0Oo().OooO0o0(Binder.getCallingPid()) != null) {
                o0O0o00O o0o0o00o = o0o0o0.OooO0O0;
                o0o0o00o.getClass();
                dm1 dm1Var = o0o00ooo.OooOOO;
                if (dm1Var.OooO0Oo == 1) {
                    ActivityManager.AppTask appTaskOooO00o = k43.OooO00o(i);
                    if (appTaskOooO00o == null) {
                        dm1Var.OooO0o0();
                        return false;
                    }
                    l81 l81Var = o0O00oO0.OooO00o;
                    if (l81Var != null) {
                    }
                    dm1Var.OooOo00 = appTaskOooO00o;
                    dm1Var.OooO0o = i;
                    dm1Var.OooOo0.open();
                    dm1Var.OooO0O0(2);
                }
                o0o00ooo.OooOoOO = iBinder2;
                o0o00ooo.OooO0O0(2);
                WeakHashMap weakHashMap = o0O00OOO.OooOooO;
                synchronized (weakHashMap) {
                    weakHashMap.put(iBinder2, new WeakReference(o0o00ooo));
                }
                o0o00ooo.OooOoo.open();
                synchronized (o0o0o00o.OooO0OO) {
                    try {
                        o0o0o00o.OooO0oO();
                        o0O00OOO o0o00oooOooO0o0 = o0o0o00o.OooO0o0(o0o00ooo);
                        return (o0o00oooOooO0o0 != null ? o0o00oooOooO0o0.OooOOO : null) != null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o0000O0O(IBinder iBinder, int i) {
        o0O0o00O o0o0o00o = this.OooOOOo.OooO0O0;
        synchronized (o0o0o00o.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oO = o0O00OOO.OooO0oO(iBinder);
                if (o0o00oooOooO0oO != null) {
                    if (o0o00oooOooO0oO.OooO0Oo >= 3) {
                        o0o00oooOooO0oO.OooO0O0(4);
                    }
                    o0o00oooOooO0oO.OooO0O0(5);
                    o0o00oooOooO0oO.OooOOO.OooOOOO.remove(o0o00oooOooO0oO);
                    if (o0o00oooOooO0oO.OooOOO.OooO0oo()) {
                        o0o0o00o.OooO0O0.remove(o0o00oooOooO0oO.OooOOO);
                    }
                }
                o0o0o00o.OooO0oO();
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000OOo(int i) {
        b51 b51VarOooO0o0 = this.OooO0o.OooO0o0(i);
        if (b51VarOooO0o0 == null) {
            return -1;
        }
        return b51VarOooO0o0.OooO0oO;
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000OoO(IBinder iBinder, boolean z, int i) {
        o0O00OOO o0o00ooo;
        synchronized (this.OooOOOo.OooO0O0.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oo = o0O00OOO.OooO0oo(iBinder);
                if (o0o00oooOooO0oo == null) {
                    return -1;
                }
                if (z) {
                    ArrayList arrayList = o0o00oooOooO0oo.OooOOO.OooOOOO;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            o0o00ooo = null;
                            break;
                        }
                        o0o00ooo = (o0O00OOO) arrayList.get(i2);
                        if (!o0o00ooo.OooO00o()) {
                            break;
                        }
                        i2++;
                    }
                    if (o0o00ooo != o0o00oooOooO0oo) {
                        return -1;
                    }
                }
                return o0o00oooOooO0oo.OooOOO.OooO0o;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void o0000o0O(int i) {
        this.OooOOo0 += i;
    }

    @Override // com.cmaster.cloner.we0
    public final int o0000oOO(String str, int i, Intent intent, String str2, Bundle bundle, int i2) {
        o0O0o0 o0o0o0 = this.OooOOOo;
        o0o0o0.getClass();
        return o0o0o0.OooO0Oo.OooO0o0(oO00OOo0.OooO0Oo().OooO0o0(Binder.getCallingPid()), Binder.getCallingUid(), str, intent, str2, null, null, -1, bundle, i, i2);
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o0000ooO(IBinder iBinder) {
        return iBinder instanceof kf1;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000O0O(NetworkRequest networkRequest) {
        boolean z;
        int i = sw1.OooO0oo;
        sw1 sw1Var = rw1.OooO00o;
        synchronized (sw1Var.OooO0o) {
            try {
                int iBeginBroadcast = sw1Var.OooO0o.beginBroadcast();
                z = false;
                while (true) {
                    RemoteCallbackList remoteCallbackList = sw1Var.OooO0o;
                    if (iBeginBroadcast > 0) {
                        iBeginBroadcast--;
                        uw0 uw0Var = (uw0) remoteCallbackList.getBroadcastItem(iBeginBroadcast);
                        if (uw0Var.OooO0o0.equals(networkRequest)) {
                            sw1Var.OooO0o.unregister(uw0Var);
                            z = true;
                        }
                    } else {
                        remoteCallbackList.finishBroadcast();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.cmaster.cloner.we0
    public final ArrayList o000O0o0(String str, int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it.next();
            b51 b51VarOooO0o0 = this.OooO0o.OooO0o0(runningAppProcessInfo.pid);
            b51 b51VarOooO0o02 = this.OooO0o.OooO0o0(Binder.getCallingPid());
            if (b51VarOooO0o0 != null) {
                HashSet hashSet = b51VarOooO0o0.OooO0o;
                if (b51VarOooO0o02 != null && i == b51VarOooO0o0.OooO0o0 && (b51VarOooO0o02.OooO0oO == b51VarOooO0o0.OooO0oO || i21.OooO0OO(str))) {
                    runningAppProcessInfo.processName = b51VarOooO0o0.OooOO0O;
                    runningAppProcessInfo.importanceReasonCode = 0;
                    runningAppProcessInfo.importanceReasonPid = 0;
                    runningAppProcessInfo.importanceReasonComponent = null;
                    if (!fn2.OooO0Oo(hashSet)) {
                        runningAppProcessInfo.pkgList = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    }
                    arrayList.add(runningAppProcessInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // com.cmaster.cloner.we0
    public final m2 o000O0oo(int i, int i2, String str) {
        o0O0o00O o0o0o00o = this.OooOOOo.OooO0O0;
        synchronized (o0o0o00o.OooO0OO) {
            try {
                for (int size = o0o0o00o.OooO0O0.size() - 1; size >= 0; size--) {
                    dm1 dm1Var = (dm1) o0o0o00o.OooO0O0.get(size);
                    if (dm1Var != null && dm1Var.OooOOO0 == i2 && i == dm1Var.OooO0o) {
                        if (str != null) {
                            ArrayList arrayList = dm1Var.OooOOOO;
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj = arrayList.get(i3);
                                i3++;
                                if (((o0O00OOO) obj).OooOO0O.equals(str)) {
                                }
                            }
                            return null;
                        }
                        return o0O0o00O.OooO00o(dm1Var);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final String o000OO00(int i) {
        return o0O0ooO(i);
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000Oo00(IBinder iBinder, int i, Intent intent, int i2, int i3) {
        o0O0o0 o0o0o0 = this.OooOOOo;
        o0o0o0.getClass();
        oO00OOo0.OooO0Oo().OooO0o0(Binder.getCallingPid());
        o0O0o00O o0o0o00o = o0o0o0.OooO0O0;
        synchronized (o0o0o00o.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oO = o0O00OOO.OooO0oO(iBinder);
                if (o0o00oooOooO0oO == null) {
                    return false;
                }
                dm1 dm1Var = o0o00oooOooO0oO.OooOOO;
                o0o00oooOooO0oO.OooO0o(i, intent);
                if (o0o00oooOooO0oO.OooOOO.OooO0oo()) {
                    dm1Var.OooO0o0();
                    o0o0o00o.OooO0O0.remove(o0o00oooOooO0oO.OooOOO);
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o000Oo0o(int i, int i2, String str, String str2) {
        if (str == null) {
            return;
        }
        Message messageObtainMessage = this.OooOO0.obtainMessage(103);
        messageObtainMessage.arg1 = i;
        messageObtainMessage.arg2 = i2;
        Bundle bundle = new Bundle();
        bundle.putString(u7.OooO00o(new byte[]{-50, 21, -27}, new byte[]{-66, 126, -126, 50, -76, -80, -99, -119}), str);
        bundle.putString(u7.OooO00o(new byte[]{-88, 106, -79, 46, -35, 93}, new byte[]{-38, 15, -48, 93, -78, 51, -99, -123}), str2);
        messageObtainMessage.obj = bundle;
        this.OooOO0.sendMessage(messageObtainMessage);
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000OoOO(IBinder iBinder, int i) {
        boolean zOooOoO0;
        synchronized (this) {
            zOooOoO0 = this.OooO.OooOoO0(iBinder);
        }
        return zOooOoO0;
    }

    @Override // com.cmaster.cloner.we0
    public final String o000Ooo0(IBinder iBinder, String str) {
        if (iBinder == null) {
            return null;
        }
        synchronized (this.OooOOO) {
            try {
                zi0 zi0Var = (zi0) this.OooOOO.get(iBinder);
                if (zi0Var == null) {
                    return null;
                }
                return o00O000o(zi0Var, str);
            } finally {
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final void o000Oooo(IBinder iBinder, int i) {
        o0O0o0 o0o0o0 = this.OooOOOo;
        if (!(iBinder instanceof o0O00OOO)) {
            o0o0o0.getClass();
            return;
        }
        o0O0o00O o0o0o00o = o0o0o0.OooO0O0;
        o0O00OOO o0o00ooo = (o0O00OOO) iBinder;
        if (i == 0) {
            o0o0o00o.getClass();
            return;
        }
        synchronized (o0o0o00o.OooO0OO) {
            o0o00ooo.OooOOO.OooOOOO.remove(o0o00ooo);
            o0o00ooo.OooO0O0(4);
        }
    }

    @Override // com.cmaster.cloner.we0
    public final int o000o00O(w90 w90Var, IBinder iBinder, Intent intent, String str, IBinder iBinder2, int i, String str2, String str3, int i2) {
        int iOooO0O0;
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{-13, -76, -98, -83, 19, -23, 5, 69, -42, -81, -101, -72, 71, -30, 18, 69, -107, -83, -109, -69, 64, -24, 4, 22, -36, -77, -46, -127, 93, -7, 5, 88, -63}, new byte[]{-75, -35, -14, -56, 51, -115, 96, 54}));
            return 0;
        }
        if (str3 == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-109, -45, -114, 110, -108, 65, -65, -96, -111, -47, -119, 99, -102, 74, -8, -109, -111, -36, -116, 109, -119, 15, -70, -107, -48, -36, -105, 110, -111}, new byte[]{-16, -78, -30, 2, -3, 47, -40, -16}));
            return 0;
        }
        if (str2 != null) {
            for (int i3 = 0; i3 < str2.length(); i3++) {
                char cCharAt = str2.charAt(i3);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '.'))) {
                    ra.OooOOO(u7.OooO00o(new byte[]{72, -103, 14, 80, -69, 62, 57, 76, 104, -101, 17, 65, -67, 49, 54, 9, 79, -108, 15, 80}, new byte[]{1, -11, 98, 53, -36, 95, 85, 108}));
                    return 0;
                }
            }
        }
        ResolveInfo resolveInfoO000OoOo = this.OooO0oO.o000OoOo(null, intent, intent.getType(), 0, i2);
        if ((resolveInfoO000OoOo != null ? resolveInfoO000OoOo.serviceInfo : null) == null) {
            return -2;
        }
        synchronized (this) {
            try {
                try {
                    iOooO0O0 = this.OooO.OooO0O0(w90Var, intent, str, iBinder2, i, str2, str3, i2);
                } catch (Throwable unused) {
                    int i4 = fp0.OooO00o;
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iOooO0O0;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0OO(ComponentName componentName, IBinder iBinder, int i, int i2) {
        boolean zOooOo0o;
        synchronized (this) {
            try {
                try {
                    zOooOo0o = this.OooO.OooOo0o(componentName, iBinder, i, i2);
                } catch (Exception e) {
                    if (e instanceof NullPointerException) {
                        lw1.OooO();
                        return false;
                    }
                    hs2.OooO00o(e);
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zOooOo0o;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0o0(String str, zi0 zi0Var, int i) {
        if (zi0Var == null || zi0Var.OooO0o0 == null) {
            return false;
        }
        synchronized (this.OooOOO) {
            try {
                zi0 zi0Var2 = (zi0) this.OooOOO.get(zi0Var.OooO0o0);
                if (zi0Var2 == null) {
                    this.OooOOO.put(zi0Var.OooO0o0, zi0Var);
                } else {
                    zi0Var2.OooO0Oo = zi0Var.OooO0Oo;
                    zi0Var2.OooO0o0 = zi0Var.OooO0o0;
                    zi0Var2.OooO0o = zi0Var.OooO0o;
                    zi0Var2.OooO0oO = zi0Var.OooO0oO;
                    zi0Var2.OooO0oo = zi0Var.OooO0oo;
                    zi0Var2.OooO = zi0Var.OooO;
                    zi0Var2.OooOO0 = zi0Var.OooOO0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // com.cmaster.cloner.we0
    public final boolean o000o0oO(int i, int i2) {
        o0O0o00O o0o0o00o = this.OooOOOo.OooO0O0;
        synchronized (o0o0o00o.OooO0OO) {
            try {
                dm1 dm1VarOooOO0 = o0o0o00o.OooOO0(i);
                if (dm1VarOooOO0 == null) {
                    return false;
                }
                dm1VarOooOO0.OooO0o0();
                return false;
            } finally {
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ComponentName o000oo0(IBinder iBinder, int i) {
        ComponentName component;
        synchronized (this.OooOOOo.OooO0O0.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oo = o0O00OOO.OooO0oo(iBinder);
                o0O00OOO o0o00ooo = o0o00oooOooO0oo == null ? null : o0o00oooOooO0oo.OooOOOO;
                component = o0o00ooo != null ? o0o00ooo.OooO0oo.getComponent() : null;
            } finally {
            }
        }
        return component;
    }

    @Override // com.cmaster.cloner.we0
    public final String o000oo0O(int i, int i2, String str) {
        sx1 sx1Var = this.OooO0oo;
        SparseArray[] sparseArrayArr = sx1Var.OooO0o0;
        if (i2 >= sparseArrayArr.length || i < 0) {
            return null;
        }
        SparseArray sparseArray = sparseArrayArr[i2];
        HashMap map = (HashMap) sparseArray.get(i);
        if (map == null) {
            synchronized (sx1.class) {
                sx1Var.OooO0OO(i);
            }
            map = (HashMap) sparseArray.get(i);
        }
        String str2 = (String) map.get(str);
        if (str2 == null) {
            if (i2 == 1) {
                return Settings.Secure.getString(sx1Var.OooO0o, str);
            }
            if (i2 == 2) {
                return Settings.Global.getString(sx1Var.OooO0o, str);
            }
            if (i2 == 3 && yn2.OooO0Oo() && vf1.OooO0o0.contains(str.split(u7.OooO00o(new byte[]{16}, new byte[]{63, 24, -41, -55, -16, 96, 11, 98}))[0])) {
                ContentResolver contentResolver = sx1Var.OooO0o;
                o00OO000 o00oo000 = wf1.OooO00o;
                return (String) (o00oo000 != null ? o00oo000.OooOooo(contentResolver, str) : null);
            }
        }
        return str2;
    }

    @Override // com.cmaster.cloner.we0
    public final void o000ooO0(int i, int i2, String str, String str2) {
        sx1 sx1Var = this.OooO0oo;
        SparseArray[] sparseArrayArr = sx1Var.OooO0o0;
        if (i2 >= sparseArrayArr.length || i < 0) {
            return;
        }
        SparseArray sparseArray = sparseArrayArr[i2];
        synchronized (sx1.class) {
            try {
                if (sparseArray.get(i) == null) {
                    sx1Var.OooO0OO(i);
                }
                HashMap map = (HashMap) sparseArray.get(i);
                if (!TextUtils.equals((CharSequence) map.get(str), str2)) {
                    map.put(str, str2);
                    if (sx1Var.OooO0oO == null) {
                        HandlerThread handlerThread = new HandlerThread(u7.OooO00o(new byte[]{-6, -22, -128, 121, -17, 38, 87, 91, -2}, new byte[]{-115, -103, -27, 13, -101, 79, 57, 60}));
                        sx1Var.OooO0oO = handlerThread;
                        handlerThread.start();
                        sx1Var.OooO0oo = new oOo00o0o(sx1Var, sx1Var.OooO0oO.getLooper(), 6);
                    }
                    sx1Var.OooO0oo.removeMessages(1);
                    oOo00o0o ooo00o0o = sx1Var.OooO0oo;
                    ooo00o0o.sendMessageDelayed(ooo00o0o.obtainMessage(1, i, 0), 5000L);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.cmaster.cloner.we0
    public final ArrayList o000ooo(int i, int i2, String str, int i3) {
        ArrayList arrayListOooO0oO;
        synchronized (this) {
            arrayListOooO0oO = this.OooO.OooO0oO(i, i3, str);
        }
        return arrayListOooO0oO;
    }

    public final void o000oooo(IBinder iBinder) {
        o0O0o00O o0o0o00o = this.OooOOOo.OooO0O0;
        synchronized (o0o0o00o.OooO0OO) {
            try {
                o0O00OOO o0o00oooOooO0oO = o0O00OOO.OooO0oO(iBinder);
                if (o0o00oooOooO0oO == null) {
                    return;
                }
                String str = o0o00oooOooO0oO.OooOOO0;
                for (int iIndexOf = o0o00oooOooO0oO.OooOOO.OooOOOO.indexOf(o0o00oooOooO0oO); iIndexOf >= 0; iIndexOf--) {
                    o0O00OOO o0o00ooo = (o0O00OOO) o0o00oooOooO0oO.OooOOO.OooOOOO.get(iIndexOf);
                    if (!o0o00ooo.OooOOO0.equals(str)) {
                        break;
                    }
                    o0o00ooo.OooO0O0(3);
                }
                synchronized (o0o0o00o.OooO0OO) {
                    try {
                        int size = o0o0o00o.OooO0O0.size();
                        while (true) {
                            int i = size - 1;
                            if (size > 0) {
                                ((dm1) o0o0o00o.OooO0O0.get(i)).OooO0o();
                                size = i;
                            }
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void o00O00(Context context) {
        this.OooO0o0 = context;
        this.OooO0o = oO00OOo0.OooO0Oo();
        this.OooOOOO = new im2();
        this.OooOOOo = new o0O0o0(this);
        this.OooO0oO = ox1.o0O0ooO();
        this.OooO0oo = sx1.OooO;
        this.OooO = new o0o0Oo(this);
        HandlerThread handlerThread = new HandlerThread("pw1", -2);
        this.OooOO0O = handlerThread;
        handlerThread.start();
        this.OooOO0 = new oOo00o0o(this, this.OooOO0O.getLooper(), 4);
        this.OooOO0o = new oOO0OO();
        this.OooOOO0 = new ho1(this.OooO0o0);
        if (yn2.OooO0Oo()) {
            String str = u7.OooO00o(new byte[]{-60, -121, -126, 57, -31, -100, 52, -26, -50, -126, -61}, new byte[]{-89, -26, -18, 85, -120, -14, 83, -109}) + this.OooO0o0.getPackageName();
            s40 s40Var = new s40();
            s40Var.OooO0o0 = str;
            s40Var.start();
        }
    }

    public final b51 o00O000(w90 w90Var) {
        oO00OOo0 oo00ooo0 = this.OooO0o;
        oo00ooo0.getClass();
        synchronized (oO00OOo0.OooO0o0) {
            for (int i = 0; i < oo00ooo0.OooO0O0.size(); i++) {
                try {
                    b51 b51Var = (b51) oo00ooo0.OooO0O0.valueAt(i);
                    w90 w90Var2 = b51Var.OooOOoo.OooOO0O;
                    if (w90Var2 != null && w90Var2.asBinder() == w90Var.asBinder()) {
                        return b51Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        }
    }

    public final int o00O00O(int i, String str) {
        try {
            if (c31.OooOO0.OooO0OO.contains(str)) {
                return -96;
            }
            ActivityInfo activityInfoO00O00O = this.OooO0oO.o00O00O(i, str);
            if (activityInfoO00O00O == null) {
                return 102;
            }
            Intent intentOOO00O = this.OooO0oO.oOO00O(i, str);
            intentOOO00O.addFlags(268435456);
            intentOOO00O.setComponent(new ComponentName(activityInfoO00O00O.packageName, activityInfoO00O00O.name));
            return OooO(u7.OooO00o(new byte[]{123, 102, 68, 87, -45, -15, -27}, new byte[]{26, 8, 32, 37, -68, -104, -127, -22}), intentOOO00O, null, null, null, -1, null, i);
        } catch (Exception e) {
            e.printStackTrace();
            return -96;
        }
    }

    @Override // com.cmaster.cloner.we0
    public final zi0 o00Ooo(int i, IBinder iBinder, String str) {
        zi0 zi0Var;
        synchronized (this.OooOOO) {
            zi0Var = (zi0) this.OooOOO.get(iBinder);
        }
        return zi0Var;
    }

    @Override // com.cmaster.cloner.we0
    public final IBinder o00o0O(Intent intent, String str, String str2, int i) {
        IBinder iBinder = null;
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{-78, 50, -27, -14, -119, 80, 2, -81, -105, 41, -32, -25, -35, 91, 21, -81, -44, 43, -24, -28, -38, 81, 3, -4, -99, 53, -87, -34, -57, 64, 2, -78, -128}, new byte[]{-12, 91, -119, -105, -87, 52, 103, -36}));
            return null;
        }
        if (str2 == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{63, -44, 19, 32, 39, 100, -116, 22, 61, -42, 20, 45, 41, 111, -53, 37, 61, -37, 17, 35, 58, 42, -119, 35, 124, -37, 10, 32, 34}, new byte[]{92, -75, 127, 76, 78, 10, -21, 70}));
            return null;
        }
        synchronized (this) {
            o0o0Oo o0o0oo = this.OooO;
            o0o0oo.getClass();
            Binder.getCallingPid();
            Binder.getCallingUid();
            ay1 ay1VarOooOOOO = o0o0oo.OooOOOO(intent, null, str, str2, i, false, false);
            if (ay1VarOooOOOO != null) {
                kf1 kf1Var = (kf1) ay1VarOooOOOO.OooO0o0;
                ui0 ui0Var = (ui0) kf1Var.OooOOOO.get(kf1Var.OooO0oo);
                if (ui0Var != null) {
                    iBinder = ui0Var.OooO0oO;
                }
            }
        }
        return iBinder;
    }

    @Override // com.cmaster.cloner.we0
    public final void o00oO0O(IBinder iBinder, IBinder iBinder2, Intent intent, boolean z) {
        if (intent != null && intent.hasFileDescriptors()) {
            ra.OooOOO(u7.OooO00o(new byte[]{14, 8, 62, 90, 42, 61, -70, 64, 43, 19, 59, 79, 126, 54, -83, 64, 104, 17, 51, 76, 121, 60, -69, 19, 33, 15, 114, 118, 100, 45, -70, 93, 60}, new byte[]{72, 97, 82, 63, 10, 89, -33, 51}));
        } else {
            synchronized (this) {
                this.OooO.OooOo((kf1) iBinder, iBinder2, intent);
            }
        }
    }

    public final w90 o00oOoo(int i) {
        b51 b51VarOooO0o0 = this.OooO0o.OooO0o0(i);
        if (b51VarOooO0o0 == null) {
            return null;
        }
        return b51VarOooO0o0.OooOOoo.OooOO0O;
    }

    public final String o0O0ooO(int i) {
        b51 b51VarOooO0o0 = this.OooO0o.OooO0o0(i);
        if (b51VarOooO0o0 == null) {
            return null;
        }
        return b51VarOooO0o0.OooOO0;
    }

    @Override // com.cmaster.cloner.we0
    public final ComponentName o0ooOoO(w90 w90Var, Intent intent, String str, boolean z, String str2, int i) {
        ComponentName componentNameOooOo0;
        u7.OooO00o(new byte[]{106, -12, -68, -109, 124, -9, -4, -126, 52, -115, -13, -63, 121, -22, -2, -107, 122, -2}, new byte[]{64, -34, -106, -77, 15, -125, -99, -16});
        Objects.toString(intent);
        u7.OooO00o(new byte[]{58, 10, -120, -19, 89, 79}, new byte[]{26, 126, -15, -99, 60, 114, 5, 31});
        u7.OooO00o(new byte[]{83, 74, 127, 85}, new byte[]{115, 44, 24, 104, 32, -102, -26, 99});
        int i2 = fp0.OooO00o;
        synchronized (this) {
            int callingPid = Binder.getCallingPid();
            Binder.getCallingUid();
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    componentNameOooOo0 = this.OooO.OooOo0(w90Var, intent, str, callingPid, str2, i);
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                } catch (Exception e) {
                    u7.OooO00o(new byte[]{112, 79, -38}, new byte[]{35, 22, -119, 55, -4, -7, -54, 72});
                    Thread.currentThread();
                    oO00OOOo oo00oooo = lw1.OooO0O0;
                    throw e;
                }
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
        return componentNameOooOo0;
    }
}

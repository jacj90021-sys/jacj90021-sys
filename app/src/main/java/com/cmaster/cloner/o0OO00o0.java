package com.cmaster.cloner;

import android.app.Application;
import android.content.pm.ProviderInfo;
import android.os.Binder;
import android.os.Build;
import android.os.ConditionVariable;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0OO00o0 {
    public static final o0OO00o0 OooOOo0 = new o0OO00o0();
    public final o0OO000o OooO0o0;
    public Application OooO0oO;
    public Object OooO0oo;
    public Object OooOO0O;
    public Binder OooOO0o;
    public List OooOOO;
    public Object OooOOO0;
    public volatile IBinder OooOOOO;
    public final ConditionVariable OooO00o = new ConditionVariable();
    public final HashMap OooO0O0 = new HashMap();
    public final o0O0oo00 OooO0OO = new o0O0oo00(this);
    public final o0OO000o OooO0Oo = new o0OO000o(this, Looper.getMainLooper(), 0);
    public final ConditionVariable OooO0o = new ConditionVariable(false);
    public final ArrayMap OooO = new ArrayMap();
    public final HashMap OooOO0 = new HashMap();
    public final ConditionVariable OooOOOo = new ConditionVariable();

    public o0OO00o0() {
        HandlerThread handlerThread = new HandlerThread(u7.OooO00o(new byte[]{76, 81, -16, -42, -53, 115, -10, -17, 94, 95, -26}, new byte[]{59, 62, -126, -67, -26, 7, -98, -99}));
        handlerThread.start();
        this.OooO0o0 = new o0OO000o(this, handlerThread.getLooper(), 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05fc A[Catch: Exception -> 0x0611, TryCatch #6 {Exception -> 0x0611, blocks: (B:278:0x05bb, B:281:0x05c2, B:283:0x05c6, B:285:0x05ce, B:287:0x05d4, B:289:0x05da, B:292:0x05e4, B:294:0x05ec, B:296:0x05f2, B:300:0x05fc, B:302:0x0600, B:304:0x0606, B:306:0x060a), top: B:358:0x05bb }] */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0600 A[Catch: Exception -> 0x0611, TryCatch #6 {Exception -> 0x0611, blocks: (B:278:0x05bb, B:281:0x05c2, B:283:0x05c6, B:285:0x05ce, B:287:0x05d4, B:289:0x05da, B:292:0x05e4, B:294:0x05ec, B:296:0x05f2, B:300:0x05fc, B:302:0x0600, B:304:0x0606, B:306:0x060a), top: B:358:0x05bb }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x060a A[Catch: Exception -> 0x0611, TRY_LEAVE, TryCatch #6 {Exception -> 0x0611, blocks: (B:278:0x05bb, B:281:0x05c2, B:283:0x05c6, B:285:0x05ce, B:287:0x05d4, B:289:0x05da, B:292:0x05e4, B:294:0x05ec, B:296:0x05f2, B:300:0x05fc, B:302:0x0600, B:304:0x0606, B:306:0x060a), top: B:358:0x05bb }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO00o(com.cmaster.cloner.o0OO00o0 r31, com.cmaster.cloner.p2 r32) {
        /*
            Method dump skipped, instructions count: 2156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o0OO00o0.OooO00o(com.cmaster.cloner.o0OO00o0, com.cmaster.cloner.p2):void");
    }

    public static void OooO0OO(String str) throws IllegalAccessException, IllegalArgumentException {
        l81 l81Var;
        Object objOooO00o;
        Object objOooO00o2;
        if (yn2.OooO0o0()) {
            n81 n81Var = t21.OooO0O0;
            if (n81Var == null || (objOooO00o2 = n81Var.OooO00o()) == null) {
                a02 a02Var = t21.OooO00o;
                if (a02Var != null) {
                    a02Var.OooO0o0(new Object[0]);
                }
            } else {
                o00OO000 o00oo000 = m51.OooO0O0;
                if (o00oo000 != null) {
                    o00oo000.OooOooo(objOooO00o2, new Object[0]);
                }
            }
            n81 n81Var2 = w01.OooO0o;
            if (n81Var2 == null || (objOooO00o = n81Var2.OooO00o()) == null) {
                a02 a02Var2 = w01.OooO00o;
                if (a02Var2 != null) {
                    a02Var2.OooO0o0(new Object[0]);
                }
            } else {
                o00OO000 o00oo0002 = m51.OooO0O0;
                if (o00oo0002 != null) {
                    o00oo0002.OooOooo(objOooO00o, new Object[0]);
                }
            }
        }
        if (yn2.OooO0o()) {
            String strOooO00o = u7.OooO00o(new byte[]{16, -67, 117, 62, -101, -17, -110, -104, 10, -14, 101, 47, -115, -60, -100, -112, 44, -81, 115, 36, -120, -43, -117, -45, 18, -65, 117, 57, -117, -34, -115, -114, 44, -72, 119, 34, -97}, new byte[]{115, -36, 22, 86, -2, -80, -7, -3});
            a02 a02Var3 = m51.OooO00o;
            if (a02Var3 != null) {
                a02Var3.OooO0o0(strOooO00o);
            }
        }
        if (qx1.OooOO0O == null) {
            qx1.OooOO0O = zw1.OooO00o().OooO0O0();
        }
        aq aqVar = qx1.OooOO0O;
        aqVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(aqVar.OooO0o0);
        u7.OooO00o(new byte[]{51, 102, -73, 124, -83, 6, 97, 127, 45, 112, -73, 95, -95, 61, 118, 67, 36, 102, -79, 78, -75, 77}, new byte[]{84, 3, -61, 58, -52, 109, 4, 44});
        linkedHashMap.toString();
        int i = fp0.OooO00o;
        if (aqVar.OooO0Oo.getString(u7.OooO00o(new byte[]{-75, 74, 83, -35, -72, 44, 11, 117, -98, 103, 127, -7}, new byte[]{-48, 36, 50, -65, -44, 73, 84, 49}), aq.OooO0oO).equals(aq.OooO0o) && !linkedHashMap.isEmpty()) {
            if (!linkedHashMap.isEmpty()) {
                for (String str2 : linkedHashMap.keySet()) {
                    String str3 = (String) linkedHashMap.get(str2);
                    int i2 = d02.OooO00o;
                    PAM.OMZJQ(str2, str3);
                    switch (str2.hashCode()) {
                        case -1511488506:
                            if (str2.equals(u7.OooO00o(new byte[]{58, -71, 112, 125, -81, -79, -2, 29, 43, -94, 112, 105, -72, -88, -13, 11, 45}, new byte[]{72, -42, 94, 13, -35, -34, -102, 104}))) {
                                m9.OooO0o0.OooO0Oo(str3);
                                break;
                            } else {
                                break;
                            }
                        case -50237481:
                            if (str2.equals(u7.OooO00o(new byte[]{105, 20, -100, 35, 29, -4, -82, -33, 120, 15, -100, 49, 29, -14, -92, -50}, new byte[]{27, 123, -78, 83, 111, -109, -54, -86}))) {
                                m9.OooO0O0.OooO0Oo(str3);
                                break;
                            } else {
                                break;
                            }
                        case -41899021:
                            if (str2.equals(u7.OooO00o(new byte[]{-63, -16, 111, -14, -117, -39, 73, -55, -99, -7, 40, -2, -103, -43, 87, -35, -63, -10, 47, -28}, new byte[]{-77, -97, 65, -112, -2, -80, 37, -83}))) {
                                m9.OooO0o.OooO0Oo(str3);
                                break;
                            } else {
                                break;
                            }
                        case -40165511:
                            if (str2.equals(u7.OooO00o(new byte[]{-90, -92, -44, -20, 70, -95, 16, 82, -73, -65, -44, -15, 91, -86, 17, 75}, new byte[]{-44, -53, -6, -100, 52, -50, 116, 39}))) {
                                m9.OooO0OO.OooO0Oo(str3);
                                break;
                            } else {
                                break;
                            }
                        case 137268283:
                            if (str2.equals(u7.OooO00o(new byte[]{-14, 99, -26, -98, -80, 2, 124, 77, -29, 120, -26, -128, -93, 0, 125}, new byte[]{-128, 12, -56, -18, -62, 109, 24, 56}))) {
                                m9.OooO0Oo.OooO0Oo(str3);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } else if (i21.OooO0OO(str) && Build.VERSION.SDK_INT >= 29 && yn2.OooO()) {
            m9.OooO0O0.OooO0Oo(u7.OooO00o(new byte[]{120, -126, 52, -20, -85, 16}, new byte[]{48, -41, 117, -69, -18, 89, 100, -106}));
            m9.OooO0OO.OooO0Oo(u7.OooO00o(new byte[]{-52, -33, 36, -118, 34, -109, -59, 4}, new byte[]{-124, -110, 101, -89, 99, -33, -11, 52}));
            m9.OooO0Oo.OooO0Oo(u7.OooO00o(new byte[]{-42, -2, -84, -106, 23, -113, 114, -30}, new byte[]{-98, -77, -19, -69, 86, -61, 66, -46}));
            m9.OooO0o0.OooO0Oo(u7.OooO00o(new byte[]{4, -26, 15, -5, -21}, new byte[]{76, -79, 71, -74, -86, 104, 85, 56}));
            m9.OooO0o.OooO0Oo(u7.OooO00o(new byte[]{38, 46, 56, -16, -7, 49, 117, 17, 35, 58, 84, -26, -16, 72, 106, 118, 38, 44, 49, -22, -3, 66}, new byte[]{110, 123, 121, -89, -68, 120, 90, 89}) + Build.VERSION.RELEASE + '/' + Build.ID + '/' + Build.VERSION.INCREMENTAL + ':' + Build.TYPE + '/' + Build.TAGS);
        }
        n81 n81Var3 = m9.OooO00o;
        if (n81Var3 != null) {
            try {
                n81Var3.OooO00o.setBoolean(null, false);
            } catch (Exception unused) {
            }
        }
        Object objOooO00o3 = o0OO0oO0.OooO00o();
        if (objOooO00o3 == null || (l81Var = o0OO0oO0.OooO0o) == null) {
            return;
        }
        l81Var.OooO0oo(objOooO00o3, null);
    }

    public final synchronized void OooO0O0() {
        o0 o0Var;
        if (this.OooOOOO != null) {
            return;
        }
        ProviderInfo providerInfo = (ProviderInfo) e92.OooO0OO.OooO0o0;
        try {
            try {
                this.OooOOOO = ((lw1) lw1.OooO0O0.OooO0O0()).OooO00o.Oooo(Process.myPid(), this.OooO0OO, providerInfo.packageName, providerInfo.processName);
                o0Var = o0.OooO0oO;
            } catch (RemoteException e) {
                e.printStackTrace();
                o0Var = o0.OooO0oO;
            }
            o0Var.OooO0oo(this.OooOOOO);
        } finally {
        }
    }
}

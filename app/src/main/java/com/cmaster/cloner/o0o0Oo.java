package com.cmaster.cloner;

import android.app.ActivityManager;
import android.app.IServiceConnection;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Binder;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.TransactionTooLargeException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class o0o0Oo {
    public final pw1 OooO00o;
    public final SparseArray OooO0O0 = new SparseArray();
    public final ArrayList OooO0OO = new ArrayList();
    public final ArrayList OooO0Oo = new ArrayList();
    public final ArrayList OooO0o0 = new ArrayList();
    public final ArrayMap OooO0o = new ArrayMap();
    public final int OooO0oO = 8;

    static {
        u7.OooO00o(new byte[]{-110, -126}, new byte[]{-45, -47, 26, -72, -111, 26, -24, 57});
        u7.OooO00o(new byte[]{78, 22}, new byte[]{15, 69, 100, -106, 72, -5, 100, -101});
        u7.OooO00o(new byte[]{-50, -6}, new byte[]{-113, -87, -70, -81, -17, 95, 51, 47});
    }

    public o0o0Oo(pw1 pw1Var) {
        this.OooO00o = pw1Var;
    }

    public static ActivityManager.RunningServiceInfo OooOO0(kf1 kf1Var) {
        ActivityManager.RunningServiceInfo runningServiceInfo = new ActivityManager.RunningServiceInfo();
        ComponentName componentName = kf1Var.OooO0o0;
        ArrayMap arrayMap = kf1Var.OooOOOo;
        runningServiceInfo.service = componentName;
        b51 b51Var = kf1Var.OooOOo0;
        if (b51Var != null) {
            runningServiceInfo.pid = b51Var.OooOO0o;
        }
        runningServiceInfo.uid = kf1Var.OooOO0.uid;
        runningServiceInfo.process = kf1Var.OooOOO0;
        runningServiceInfo.activeSince = kf1Var.OooOOO;
        runningServiceInfo.started = kf1Var.OooOo0;
        runningServiceInfo.clientCount = arrayMap.size();
        runningServiceInfo.lastActivityTime = kf1Var.OooOOo;
        if (kf1Var.OooOo0) {
            runningServiceInfo.flags |= 1;
        }
        for (int size = arrayMap.size() - 1; size >= 0; size--) {
            ArrayList arrayList = (ArrayList) arrayMap.valueAt(size);
            for (int i = 0; i < arrayList.size(); i++) {
                ((fh) arrayList.get(i)).getClass();
            }
        }
        return runningServiceInfo;
    }

    public final void OooO(b51 b51Var) {
        ArraySet arraySet = b51Var.OooOOo;
        for (int size = arraySet.size() - 1; size >= 0; size--) {
            OooOOO0((fh) arraySet.valueAt(size));
        }
        arraySet.clear();
        ArraySet arraySet2 = b51Var.OooOOo0;
        for (int size2 = arraySet2.size() - 1; size2 >= 0; size2--) {
            kf1 kf1Var = (kf1) arraySet2.valueAt(size2);
            b51 b51Var2 = kf1Var.OooOOo0;
            if (b51Var2 != b51Var && b51Var2 != null) {
                arraySet2.remove(kf1Var);
            }
            kf1Var.OooOOo0 = null;
            kf1Var.OooOo0O = 0;
            this.OooO0o0.remove(kf1Var);
            for (int size3 = kf1Var.OooOOOO.size() - 1; size3 >= 0; size3--) {
                ui0 ui0Var = (ui0) kf1Var.OooOOOO.valueAt(size3);
                ui0Var.OooO0oO = null;
                ui0Var.OooOO0 = false;
                ui0Var.OooO = false;
                ui0Var.OooO0oo = false;
                for (int size4 = ui0Var.OooO0o.size() - 1; size4 >= 0; size4--) {
                    if (((b51) ui0Var.OooO0o.keyAt(size4)).OooOOoo.OooOO0O != null) {
                        ooooO0O0 ooooo0o0 = (ooooO0O0) ui0Var.OooO0o.valueAt(size4);
                        for (int size5 = ooooo0o0.OooO0Oo.size() - 1; size5 >= 0 && (((fh) ooooo0o0.OooO0Oo.valueAt(size5)).OooO0OO & 49) != 1; size5--) {
                        }
                    }
                }
            }
        }
        o00OOO0O o00ooo0oOooO0oo = OooO0oo(b51Var.OooO0o0);
        for (int size6 = arraySet2.size() - 1; size6 >= 0; size6--) {
            kf1 kf1Var2 = (kf1) arraySet2.valueAt(size6);
            arraySet2.remove(kf1Var2);
            kf1 kf1Var3 = (kf1) o00ooo0oOooO0oo.OooO00o.get(kf1Var2.OooO0o);
            if (kf1Var3 == kf1Var2) {
                OooO0Oo(kf1Var2);
            } else if (kf1Var3 != null) {
                u7.OooO00o(new byte[]{-59, 107, -16, -64, -118, 121, -69, 0}, new byte[]{-106, 14, -126, -74, -29, 26, -34, 32});
                u7.OooO00o(new byte[]{106, -84, 70, 30, 107, 42, 76, -5, 47, -74, 91, 30}, new byte[]{74, -59, 40, 62, 27, 88, 35, -104});
                b51Var.toString();
                u7.OooO00o(new byte[]{-91, -119, 4, 25, -86, -88, 26, 44, -32, -57, 10, 30, -86, -78, 21, 97, -24, -122, 27, 87, -86}, new byte[]{-123, -25, 107, 109, -118, -37, 123, 65});
                int i = fp0.OooO00o;
            }
        }
        arraySet2.clear();
        for (int size7 = this.OooO0Oo.size() - 1; size7 >= 0; size7--) {
            kf1 kf1Var4 = (kf1) this.OooO0Oo.get(size7);
            if (kf1Var4.OooOOO0.equals(b51Var.OooOO0O) && kf1Var4.OooO.applicationInfo.uid == b51Var.OooO0Oo.uid) {
                this.OooO0Oo.remove(size7);
            }
        }
        for (int size8 = this.OooO0OO.size() - 1; size8 >= 0; size8--) {
            kf1 kf1Var5 = (kf1) this.OooO0OO.get(size8);
            if (kf1Var5.OooOOO0.equals(b51Var.OooOO0O) && kf1Var5.OooO.applicationInfo.uid == b51Var.OooO0Oo.uid) {
                this.OooO0OO.remove(size8);
            }
        }
        int size9 = this.OooO0o0.size();
        while (size9 > 0) {
            size9--;
            if (((kf1) this.OooO0o0.get(size9)).OooOOo0 == b51Var) {
                this.OooO0o0.remove(size9);
            }
        }
    }

    public final void OooO00o(b51 b51Var, String str) {
        kf1 kf1Var;
        ArrayList arrayList = this.OooO0OO;
        if (arrayList.size() > 0) {
            kf1 kf1Var2 = null;
            int i = 0;
            while (i < arrayList.size()) {
                try {
                    kf1Var = (kf1) arrayList.get(i);
                } catch (RemoteException unused) {
                }
                try {
                    if (b51Var.OooO0o0 == kf1Var.OooOO0O && str.equals(kf1Var.OooOOO0)) {
                        arrayList.remove(i);
                        i--;
                        b51Var.OooO0o.add(kf1Var.OooOO0.packageName);
                        OooOO0o(kf1Var, b51Var);
                        if (!(kf1Var.OooOo0 || kf1Var.OooO0O0())) {
                            OooO0Oo(kf1Var);
                        }
                    }
                    i++;
                    kf1Var2 = kf1Var;
                } catch (RemoteException unused2) {
                    kf1Var2 = kf1Var;
                    u7.OooO00o(new byte[]{-81, -114, -46, -3, -34, 111, 97, 44, -124, -42, -40, -10, -114, 117, 109, 52, -54, -105, -63, -24, -62, 114, 107, 34, -98, -97, -34, -10, -114, 108, 96, 38, -124, -42, -62, -20, -49, 105, 124, 42, -124, -111, -111, -21, -53, 105, 126, 42, -119, -109, -111}, new byte[]{-22, -10, -79, -104, -82, 27, 8, 67});
                    String str2 = kf1Var2.OooO0oO;
                    int i2 = fp0.OooO00o;
                    return;
                }
            }
        }
        ArrayList arrayList2 = this.OooO0Oo;
        if (arrayList2.size() > 0) {
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                kf1 kf1Var3 = (kf1) arrayList2.get(i3);
                if (b51Var.OooO0oo == kf1Var3.OooOO0.uid && str.equals(kf1Var3.OooOOO0)) {
                    pw1 pw1Var = this.OooO00o;
                    pw1Var.OooOO0.removeCallbacks(null);
                    pw1Var.OooOO0.post(null);
                }
            }
        }
    }

    public final int OooO0O0(w90 w90Var, Intent intent, String str, IBinder iBinder, int i, String str2, String str3, int i2) {
        ArrayMap arrayMap = this.OooO0o;
        IServiceConnection iServiceConnectionAsInterface = IServiceConnection.Stub.asInterface(iBinder);
        b51 b51VarO00O000 = this.OooO00o.o00O000(w90Var);
        if (b51VarO00O000 == null) {
            d51.OooO00o(u7.OooO00o(new byte[]{4, 6, -94, -4, -43, -79, -109, 88, 62, 72, -91, -9, -41, -80, -109, 77, 33, 24, -29, -8, -42, -90, -109, 79, 48, 4, -81, -5, -53, -12}, new byte[]{81, 104, -61, -98, -71, -44, -77, 44}) + w90Var + u7.OooO00o(new byte[]{56, 36, -29, 72, 79, -102}, new byte[]{24, 12, -109, 33, 43, -89, 125, -8}) + Binder.getCallingPid() + u7.OooO00o(new byte[]{46, -30, 13, 84, 68, -26, 62, 54, 110, -84, 30, 85, 79, -17, 62, 39, 98, -80, 12, 85, 66, -19, 62}, new byte[]{7, -62, 122, 60, 33, -120, 30, 84}) + intent);
            throw null;
        }
        boolean z = (Integer.MIN_VALUE & i) != 0;
        Binder.getCallingPid();
        Binder.getCallingUid();
        ay1 ay1VarOooOOOO = OooOOOO(intent, str2, str, str3, i2, true, z);
        if (ay1VarOooOOOO == null) {
            return 0;
        }
        kf1 kf1Var = (kf1) ay1VarOooOOOO.OooO0o0;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        int i3 = i & 1;
        if (i3 != 0) {
            try {
                kf1Var.OooOOo = SystemClock.uptimeMillis();
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
        Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent);
        ArrayMap arrayMap2 = kf1Var.OooOOOO;
        ui0 ui0Var = (ui0) arrayMap2.get(filterComparison);
        if (ui0Var == null) {
            ui0Var = new ui0(kf1Var, filterComparison);
            arrayMap2.put(filterComparison, ui0Var);
        }
        ArrayMap arrayMap3 = ui0Var.OooO0o;
        ooooO0O0 ooooo0o0 = (ooooO0O0) arrayMap3.get(b51VarO00O000);
        if (ooooo0o0 == null) {
            ooooo0o0 = new ooooO0O0(kf1Var, ui0Var, b51VarO00O000);
            arrayMap3.put(b51VarO00O000, ooooo0o0);
        }
        ui0 ui0Var2 = ooooo0o0.OooO0O0;
        fh fhVar = new fh(ooooo0o0, iServiceConnectionAsInterface, i);
        IBinder iBinderAsBinder = iServiceConnectionAsInterface.asBinder();
        ArrayMap arrayMap4 = kf1Var.OooOOOo;
        ArrayList arrayList = (ArrayList) arrayMap4.get(iBinderAsBinder);
        if (arrayList == null) {
            arrayList = new ArrayList();
            arrayMap4.put(iBinderAsBinder, arrayList);
        }
        arrayList.add(fhVar);
        ooooo0o0.OooO0Oo.add(fhVar);
        ooooo0o0.OooO0OO.OooOOo.add(fhVar);
        ArrayList arrayList2 = (ArrayList) arrayMap.get(iBinderAsBinder);
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
            arrayMap.put(iBinderAsBinder, arrayList2);
        }
        arrayList2.add(fhVar);
        if (i3 != 0) {
            kf1Var.OooOOo = SystemClock.uptimeMillis();
            intent.getFlags();
            if (OooO0o0(kf1Var) != null) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return 0;
            }
        }
        if (kf1Var.OooOOo0 != null && ui0Var2.OooO) {
            try {
                hd0.OooO00o(iServiceConnectionAsInterface, kf1Var.OooO0o0, ui0Var2.OooO0oO, false);
            } catch (Exception unused) {
            }
            if (ooooo0o0.OooO0O0.OooO0o.size() == 1) {
                ui0 ui0Var3 = ooooo0o0.OooO0O0;
                if (ui0Var3.OooOO0O) {
                    OooOOO(kf1Var, ui0Var3, true);
                }
            }
        } else if (!ui0Var2.OooO0oo) {
            OooOOO(kf1Var, ui0Var2, false);
        }
        Binder.restoreCallingIdentity(jClearCallingIdentity);
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0OO(com.cmaster.cloner.kf1 r2, boolean r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r2.OooOo0
            if (r0 == 0) goto L5
            goto Ld
        L5:
            if (r3 != 0) goto Lb
            boolean r4 = r2.OooO0O0()
        Lb:
            if (r4 == 0) goto Lf
        Ld:
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            if (r3 == 0) goto L13
            goto L1b
        L13:
            java.util.ArrayList r3 = r1.OooO0OO
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L1c
        L1b:
            return
        L1c:
            r1.OooO0Oo(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.o0o0Oo.OooO0OO(com.cmaster.cloner.kf1, boolean, boolean):void");
    }

    public final void OooO0Oo(kf1 kf1Var) {
        ArrayMap arrayMap = kf1Var.OooOOOo;
        int size = arrayMap.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            ArrayList arrayList = (ArrayList) arrayMap.valueAt(size);
            for (int i = 0; i < arrayList.size(); i++) {
                fh fhVar = (fh) arrayList.get(i);
                fhVar.OooO0o0 = true;
                try {
                    hd0.OooO00o(fhVar.OooO0O0, kf1Var.OooO0o0, null, true);
                } catch (Exception unused) {
                }
            }
            size--;
        }
        b51 b51Var = kf1Var.OooOOo0;
        if (b51Var != null && b51Var.OooOOoo.OooOO0O != null) {
            for (int size2 = kf1Var.OooOOOO.size() - 1; size2 >= 0; size2--) {
                ui0 ui0Var = (ui0) kf1Var.OooOOOO.valueAt(size2);
                if (ui0Var.OooOO0) {
                    try {
                        ui0Var.OooOO0 = false;
                        ui0Var.OooO0oo = false;
                        kf1Var.OooOOo0.OooOOoo.OooOO0O.o000oOoo(kf1Var, ui0Var, ui0Var.OooO0o0.getIntent());
                    } catch (Exception unused2) {
                        OooOOo(kf1Var, true, true);
                    }
                }
            }
        }
        o00OOO0O o00ooo0oOooO0oo = OooO0oo(kf1Var.OooOO0O);
        kf1 kf1Var2 = (kf1) o00ooo0oOooO0oo.OooO00o.remove(kf1Var.OooO0o);
        if (kf1Var2 != null && kf1Var2 != kf1Var) {
            o00ooo0oOooO0oo.OooO00o.put(kf1Var.OooO0o, kf1Var2);
            throw new IllegalStateException(u7.OooO00o(new byte[]{64, -101, 106, -16, -44, -18, 111, -96, 34, -115, 108, -23, -35, -89}, new byte[]{2, -23, 3, -98, -77, -121, 1, -57}) + kf1Var + u7.OooO00o(new byte[]{-80, -125, 77, -21, -41, 50, -77, -112, -27, -128, 84, -13, -114, 115, -94, -111, -2, -113, 81, -15, -112, 115}, new byte[]{-112, -31, 56, -97, -9, 83, -48, -28}) + kf1Var2);
        }
        o00ooo0oOooO0oo.OooO0O0.remove(kf1Var.OooO0oo);
        for (int size3 = this.OooO0OO.size() - 1; size3 >= 0; size3--) {
            if (this.OooO0OO.get(size3) == kf1Var) {
                this.OooO0OO.remove(size3);
            }
        }
        OooO0o(kf1Var);
        kf1Var.OooOo0o = false;
        kf1Var.OooOo = 0;
        kf1Var.OooOoO0 = null;
        kf1Var.OooOoOO.clear();
        o00ooo0oOooO0oo.OooO0OO.remove(kf1Var);
        b51 b51Var2 = kf1Var.OooOOo0;
        if (b51Var2 != null) {
            b51Var2.OooOOo0.remove(kf1Var);
            if (kf1Var.OooOOo0.OooOOoo.OooOO0O != null) {
                try {
                    this.OooO0o0.add(kf1Var);
                    kf1Var.OooOOo0.OooOOoo.OooOO0O.OooOoOO(kf1Var);
                } catch (Exception unused3) {
                    u7.OooO00o(new byte[]{-18, 83, 11, 100, 56, 11, -58, -93, -59, 11, 31, 105, 45, 17, -113, -88, -50, 88, 28, 115, 39, 6, -58, -94, -52, 11, 27, 100, 58, 9, -58, -81, -50, 11}, new byte[]{-85, 43, 104, 1, 72, 127, -81, -52});
                    int i2 = fp0.OooO00o;
                    OooOOo(kf1Var, true, true);
                }
            }
        }
        if (kf1Var.OooOOOO.size() > 0) {
            kf1Var.OooOOOO.clear();
        }
    }

    public final void OooO0o(kf1 kf1Var) {
        if (kf1Var.OooOo != 0) {
            ArrayMap arrayMap = OooO0oo(kf1Var.OooOO0O).OooO00o;
            for (int size = arrayMap.size() - 1; size >= 0; size--) {
                kf1 kf1Var2 = (kf1) arrayMap.valueAt(size);
                if (kf1Var2 != kf1Var && kf1Var2.OooOo == kf1Var.OooOo && kf1Var2.OooOO0o.equals(kf1Var.OooOO0o)) {
                    return;
                }
            }
            final int i = kf1Var.OooOo;
            final Notification notification = kf1Var.OooOoO0;
            kf1Var.OooO0Oo.OooOO0.post(new Runnable(i, notification) { // from class: com.cmaster.cloner.if1
                public final /* synthetic */ int OooO0Oo;

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = this.OooO0Oo;
                    Integer num = qx1.OooO00o;
                    try {
                        ((NotificationManager) e92.OooO00o.getSystemService(u7.OooO00o(new byte[]{-42, 91, 59, -60, 100, 64, -77, -44, -52, 93, 32, -61}, new byte[]{-72, 52, 79, -83, 2, 41, -48, -75}))).cancel(i2);
                    } catch (RuntimeException unused) {
                        u7.OooO00o(new byte[]{15, 48, 33, -124, -40, 127, 86, -52, 36, 33, 54, -121, -61, 49, 82, -115, 36, 45, 39, -126, -52, 54, 86, -52, 62, 43, 60, -123, -118, 57, 90, -33, 106, 49, 54, -103, -36, 54, 86, -56}, new byte[]{74, 66, 83, -21, -86, 95, 53, -83});
                        int i3 = fp0.OooO00o;
                    }
                }
            });
        }
    }

    public final String OooO0o0(kf1 kf1Var) throws TransactionTooLargeException {
        b51 b51VarOooO00o;
        b51 b51Var = kf1Var.OooOOo0;
        if (b51Var != null && b51Var.OooOOoo.OooOO0O != null) {
            OooOOOo(kf1Var);
            return null;
        }
        if (!this.OooO0Oo.contains(kf1Var)) {
            this.OooO0Oo.remove(kf1Var);
            boolean z = (kf1Var.OooO.flags & 2) != 0;
            String str = kf1Var.OooOOO0;
            if (z) {
                b51VarOooO00o = null;
            } else {
                pw1 pw1Var = this.OooO00o;
                String str2 = kf1Var.OooOO0o;
                int i = kf1Var.OooOO0O;
                oO00OOo0 oo00ooo0 = pw1Var.OooO0o;
                oo00ooo0.getClass();
                c21 c21VarO00O00Oo = ox1.o0O0ooO().o00O00Oo(str2);
                if (c21VarO00O00Oo == null) {
                    if (b51VarOooO00o != null && b51VarOooO00o.OooOOoo.OooOO0O != null) {
                        try {
                            b51VarOooO00o.OooO0o.add(kf1Var.OooOO0.packageName);
                            OooOO0o(kf1Var, b51VarOooO00o);
                            return null;
                        } catch (TransactionTooLargeException e) {
                            throw e;
                        } catch (RemoteException unused) {
                        }
                    }
                } else {
                    synchronized (oO00OOo0.OooO0o0) {
                        try {
                            oO00Oo0 oo00oo0OooO0O0 = oo00ooo0.OooO0O0(i, c21VarO00O00Oo.OooOOoo.OooO0O0(), str, str2);
                            b51VarOooO00o = oo00oo0OooO0O0 == null ? null : (b51) oo00ooo0.OooO0OO.get(oo00oo0OooO0O0);
                        } finally {
                        }
                    }
                    if (b51VarOooO00o != null) {
                        b51VarOooO00o.OooO0o.add(kf1Var.OooOO0.packageName);
                        OooOO0o(kf1Var, b51VarOooO00o);
                        return null;
                    }
                }
            }
            if (b51VarOooO00o == null) {
                oO00OOo0 oo00ooo0OooO0Oo = oO00OOo0.OooO0Oo();
                String str3 = kf1Var.OooOO0o;
                String str4 = kf1Var.OooOOO0;
                int i2 = kf1Var.OooOO0O;
                u7.OooO00o(new byte[]{34, -65, 38, -60, 73, -55, 115, -88, 37, -65, 57, -61, 77, -7, 79, -108, 35, -90, 42, -50}, new byte[]{64, -51, 79, -86, 46, -100, 3, -5});
                b51VarOooO00o = oo00ooo0OooO0Oo.OooO00o(i2, str3, str4);
                if (b51VarOooO00o == null) {
                    String str5 = u7.OooO00o(new byte[]{118, -109, -106, -104, 111, 127, 24, 79, 76, -35, -101, -101, 118, 116, 91, 83, 3, -100, -121, -118, 35}, new byte[]{35, -3, -9, -6, 3, 26, 56, 59}) + kf1Var.OooOO0.packageName + u7.OooO00o(new byte[]{27}, new byte[]{52, 40, -93, -105, -63, -21, -25, 58}) + kf1Var.OooOO0O + u7.OooO00o(new byte[]{78, -2, 38, -59, 109, 70, -35, -61, 24, -15, 42, -46, 109}, new byte[]{110, -104, 73, -73, 77, 53, -72, -79}) + kf1Var.OooO0oo.getIntent() + u7.OooO00o(new byte[]{-40, 32, 58, -16, -20, -32, -52, -46, -111, 32, 35, -15, -93, -31, -56, -59}, new byte[]{-30, 0, 74, -126, -125, -125, -87, -95});
                    OooO0Oo(kf1Var);
                    return str5;
                }
            }
            if (!this.OooO0OO.contains(kf1Var)) {
                this.OooO0OO.add(kf1Var);
                if (b51VarOooO00o != null) {
                    b51VarOooO00o.OooOOoo.OooO0o.OooO0o0();
                }
            }
        }
        return null;
    }

    public final ArrayList OooO0oO(int i, int i2, String str) {
        ArrayList arrayList = this.OooO0Oo;
        ArrayList arrayList2 = new ArrayList();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayMap arrayMap = OooO0oo(i2).OooO00o;
            for (int i3 = 0; i3 < arrayMap.size() && arrayList2.size() < i; i3++) {
                kf1 kf1Var = (kf1) arrayMap.valueAt(i3);
                if (kf1Var.OooOOo0 != null && kf1Var.OooOO0O == i2 && TextUtils.equals(str, kf1Var.OooOO0o)) {
                    arrayList2.add(OooOO0(kf1Var));
                }
            }
            for (int i4 = 0; i4 < arrayList.size() && arrayList2.size() < i; i4++) {
                kf1 kf1Var2 = (kf1) arrayList.get(i4);
                if (kf1Var2.OooOOo0 != null && kf1Var2.OooOO0O == i2 && TextUtils.equals(str, kf1Var2.OooOO0o)) {
                    arrayList2.add(OooOO0(kf1Var2));
                }
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return arrayList2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final o00OOO0O OooO0oo(int i) {
        SparseArray sparseArray = this.OooO0O0;
        o00OOO0O o00ooo0o = (o00OOO0O) sparseArray.get(i);
        if (o00ooo0o != null) {
            return o00ooo0o;
        }
        o00OOO0O o00ooo0o2 = new o00OOO0O(this, this.OooO00o.OooOO0.getLooper());
        sparseArray.put(i, o00ooo0o2);
        return o00ooo0o2;
    }

    public final void OooOO0O(kf1 kf1Var, IBinder iBinder, Intent intent, IBinder iBinder2) {
        Intent.FilterComparison filterComparison;
        ui0 ui0Var;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        if (kf1Var != null) {
            try {
                if (intent != null) {
                    filterComparison = new Intent.FilterComparison(intent);
                    ui0Var = (ui0) kf1Var.OooOOOO.get(filterComparison);
                } else if (iBinder instanceof ui0) {
                    ui0Var = (ui0) iBinder;
                    filterComparison = ui0Var.OooO0o0;
                } else {
                    filterComparison = null;
                    ui0Var = null;
                }
                if (ui0Var != null && !ui0Var.OooO) {
                    ui0Var.OooO0oO = iBinder2;
                    ui0Var.OooO0oo = true;
                    ui0Var.OooO = true;
                    ArrayMap arrayMap = kf1Var.OooOOOo;
                    for (int size = arrayMap.size() - 1; size >= 0; size--) {
                        ArrayList arrayList = (ArrayList) arrayMap.valueAt(size);
                        for (int i = 0; i < arrayList.size(); i++) {
                            fh fhVar = (fh) arrayList.get(i);
                            if (filterComparison.equals(fhVar.OooO00o.OooO0O0.OooO0o0)) {
                                try {
                                    hd0.OooO00o(fhVar.OooO0O0, kf1Var.OooO0o0, iBinder2, false);
                                } catch (Exception unused) {
                                    u7.OooO00o(new byte[]{15, -1, 33, 12, -5, -111, -10, 89, 58, -5, 38, 4, -25, -115, -12, 89, 58, -5, 58, 22, -25, -128, -10, 89}, new byte[]{73, -98, 72, 96, -114, -29, -109, 121});
                                    u7.OooO00o(new byte[]{-71, -54, -107, 66, -117, -121, 109, 90, -4, -35, -114, 11, -121, -122, 35}, new byte[]{-103, -66, -6, 98, -24, -24, 3, 52});
                                    Objects.toString(fhVar.OooO0O0.asBinder());
                                    u7.OooO00o(new byte[]{-87, 65, -70, 78, -53}, new byte[]{-119, 105, -45, 32, -21, 119, 58, 32});
                                    String str = fhVar.OooO00o.OooO0OO.OooOO0O;
                                    u7.OooO00o(new byte[]{-34}, new byte[]{-9, 15, 102, -14, 102, 101, 95, -75});
                                    int i2 = fp0.OooO00o;
                                }
                            }
                        }
                    }
                }
                OooOOo(kf1Var, this.OooO0o0.contains(kf1Var), false);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
        Binder.restoreCallingIdentity(jClearCallingIdentity);
    }

    public final void OooOO0o(kf1 kf1Var, b51 b51Var) throws RemoteException {
        if (b51Var.OooOOoo.OooOO0O == null) {
            qa.OooO0O0();
            return;
        }
        kf1Var.OooOOo0 = b51Var;
        boolean zAdd = b51Var.OooOOo0.add(kf1Var);
        try {
            try {
                b51Var.OooOOoo.OooOO0O.o000O0o(kf1Var, kf1Var.OooO, 11);
                for (int size = kf1Var.OooOOOO.size() - 1; size >= 0 && OooOOO(kf1Var, (ui0) kf1Var.OooOOOO.valueAt(size), false); size--) {
                }
                OooOOOo(kf1Var);
            } catch (DeadObjectException e) {
                throw e;
            }
        } catch (Throwable th) {
            boolean zContains = this.OooO0o0.contains(kf1Var);
            OooOOo(kf1Var, zContains, zContains);
            if (zAdd) {
                b51Var.OooOOo0.remove(kf1Var);
                kf1Var.OooOOo0 = null;
            }
            throw th;
        }
    }

    public final boolean OooOOO(kf1 kf1Var, ui0 ui0Var, boolean z) throws TransactionTooLargeException {
        kf1 kf1Var2;
        b51 b51Var = kf1Var.OooOOo0;
        if (b51Var == null || b51Var.OooOOoo.OooOO0O == null) {
            return false;
        }
        if ((ui0Var.OooO0oo && !z) || ui0Var.OooO0o.size() <= 0) {
            return true;
        }
        try {
            kf1Var2 = kf1Var;
            try {
                kf1Var.OooOOo0.OooOOoo.OooOO0O.OoooooO(kf1Var2, ui0Var, ui0Var.OooO0o0.getIntent(), z, 11);
                if (!z) {
                    ui0Var.OooO0oo = true;
                }
                ui0Var.OooOO0 = true;
                ui0Var.OooOO0O = false;
                return true;
            } catch (TransactionTooLargeException e) {
                e = e;
                TransactionTooLargeException transactionTooLargeException = e;
                boolean zContains = this.OooO0o0.contains(kf1Var2);
                OooOOo(kf1Var2, zContains, zContains);
                throw transactionTooLargeException;
            } catch (RemoteException unused) {
                boolean zContains2 = this.OooO0o0.contains(kf1Var2);
                OooOOo(kf1Var2, zContains2, zContains2);
                return false;
            }
        } catch (TransactionTooLargeException e2) {
            e = e2;
            kf1Var2 = kf1Var;
        } catch (RemoteException unused2) {
            kf1Var2 = kf1Var;
        }
    }

    public final void OooOOO0(fh fhVar) {
        IBinder iBinderAsBinder = fhVar.OooO0O0.asBinder();
        ooooO0O0 ooooo0o0 = fhVar.OooO00o;
        kf1 kf1Var = ooooo0o0.OooO00o;
        ArrayList arrayList = (ArrayList) kf1Var.OooOOOo.get(iBinderAsBinder);
        if (arrayList != null) {
            arrayList.remove(fhVar);
            if (arrayList.size() == 0) {
                kf1Var.OooOOOo.remove(iBinderAsBinder);
            }
        }
        ooooo0o0.OooO0Oo.remove(fhVar);
        b51 b51Var = ooooo0o0.OooO0OO;
        if (b51Var != null) {
            b51Var.OooOOo.remove(fhVar);
        }
        ArrayList arrayList2 = (ArrayList) this.OooO0o.get(iBinderAsBinder);
        if (arrayList2 != null) {
            arrayList2.remove(fhVar);
            if (arrayList2.size() == 0) {
                this.OooO0o.remove(iBinderAsBinder);
            }
        }
        if (ooooo0o0.OooO0Oo.size() == 0) {
            ooooo0o0.OooO0O0.OooO0o.remove(ooooo0o0.OooO0OO);
        }
        if (fhVar.OooO0o0) {
            return;
        }
        b51 b51Var2 = kf1Var.OooOOo0;
        if (b51Var2 != null && b51Var2.OooOOoo.OooOO0O != null && ooooo0o0.OooO0O0.OooO0o.size() == 0) {
            ui0 ui0Var = ooooo0o0.OooO0O0;
            if (ui0Var.OooOO0) {
                try {
                    ui0Var.OooOO0 = false;
                    ui0Var.OooOO0O = false;
                    w90 w90Var = kf1Var.OooOOo0.OooOOoo.OooOO0O;
                    ui0 ui0Var2 = ooooo0o0.OooO0O0;
                    w90Var.o000oOoo(kf1Var, ui0Var2, ui0Var2.OooO0o0.getIntent());
                } catch (Exception unused) {
                    OooOOo(kf1Var, true, true);
                }
            }
        }
        this.OooO0OO.remove(kf1Var);
        if ((fhVar.OooO0OO & 1) != 0) {
            OooO0OO(kf1Var, true, kf1Var.OooO0O0());
        }
    }

    public final ay1 OooOOOO(Intent intent, String str, String str2, String str3, int i, boolean z, boolean z2) {
        ComponentName componentName;
        ComponentName componentName2;
        o00OOO0O o00ooo0oOooO0oo = OooO0oo(i);
        ArrayMap arrayMap = o00ooo0oOooO0oo.OooO0O0;
        ArrayMap arrayMap2 = o00ooo0oOooO0oo.OooO00o;
        if (str == null) {
            componentName = intent.getComponent();
        } else {
            ComponentName component = intent.getComponent();
            if (component == null) {
                StringBuilder sb = new StringBuilder();
                rj.OooOOo0(new byte[]{-87, 2, 90, -82, 36, -88, -115, 96, -113, 67, 87, -4, 35, -4, -105, 126, -54, 10, 90, -6, 36, -23, -106, 112, -113, 67, 90, -24, 61, -19, -40, 52}, new byte[]{-22, 99, 52, -119, 80, -120, -8, 19}, sb, str);
                ra.OooOOO(rj.OooO0oo(new byte[]{58, -70, 61, 113, -9, -23, -55, -113, 105, -70, 47, 96, -13, -24, -59, -109, 105, -70, 41, 119, -18, -15, -55, -108, 120, -12, 62, 56, -22, -17, -122, -77, 115, -18, 47, 118, -9}, new byte[]{29, -102, 74, 24, -125, -127, -90, -6}, sb));
                return null;
            }
            componentName = new ComponentName(component.getPackageName(), component.getClassName() + u7.OooO00o(new byte[]{-10}, new byte[]{-52, -104, -34, -64, -110, 63, 0, -32}) + str);
        }
        kf1 kf1Var = componentName != null ? (kf1) arrayMap2.get(componentName) : null;
        if (kf1Var == null && !z2 && str == null) {
            kf1Var = (kf1) arrayMap.get(new Intent.FilterComparison(intent));
        }
        if (kf1Var != null && (kf1Var.OooO.flags & 4) != 0 && !str3.equals(kf1Var.OooOO0o)) {
            kf1Var = null;
        }
        if (kf1Var == null) {
            ResolveInfo resolveInfoO000OoOo = ox1.o0O0ooO().o000OoOo(null, intent, str2, 0, i);
            ServiceInfo serviceInfo = resolveInfoO000OoOo != null ? resolveInfoO000OoOo.serviceInfo : null;
            if (serviceInfo == null) {
                u7.OooO00o(new byte[]{-61, -29, 100, -62, -38, 28, 29, -81, -7, -83, 118, -44, -41, 11, 73, -5, -27, -24, 119, -42, -33, 26, 88, -5}, new byte[]{-106, -115, 5, -96, -74, 121, 61, -37});
                Objects.toString(intent);
                u7.OooO00o(new byte[]{62, -18, -81}, new byte[]{30, -69, -110, -58, -107, -25, -21, 78});
                u7.OooO00o(new byte[]{-16, -101, -8, 59, 110, -120, 53, -115, -65, -43, -14}, new byte[]{-54, -69, -106, 84, 26, -88, 83, -30});
                int i2 = fp0.OooO00o;
                return null;
            }
            if (str != null && (serviceInfo.flags & 2) == 0) {
                StringBuilder sb2 = new StringBuilder();
                rj.OooOOo0(new byte[]{-22, 3, -82, -116, 39, 84, -111, 44, -52, 66, -87, -59, 32, 0, -123, 49, -54, 7, -32, -59, 50, 25, -127, 127, -114}, new byte[]{-87, 98, -64, -85, 83, 116, -28, 95}, sb2, str);
                sb2.append(u7.OooO00o(new byte[]{9, -105, -127, 102, -11, -27, 16, -32, 65, -39, -37, 102, -14, -30, 92, -17, 90, -46, -110, 47, -14, -24, 66, -8, 71, -44, -109, 47, -90}, new byte[]{46, -73, -10, 15, -127, -115, 48, -114}));
                sb2.append(serviceInfo.name);
                ra.OooOOO(rj.OooO0oo(new byte[]{50}, new byte[]{21, 111, 8, 122, 103, 21, 18, 30}, sb2));
                return null;
            }
            ComponentName componentName3 = new ComponentName(serviceInfo.applicationInfo.packageName, serviceInfo.name);
            if (componentName == null) {
                componentName = componentName3;
            }
            String str4 = serviceInfo.applicationInfo.packageName;
            int i3 = serviceInfo.flags;
            if ((i3 & 4) != 0) {
                if (!z2) {
                    throw new SecurityException(u7.OooO00o(new byte[]{123, 42, 14, 125, -59, 36, 38, -120, 124, 49, 14, 120, -42, 62, 45, -103, 107, 53, 9, 122, -33, 65, 12, -71, 72, 22, 41, 75, -1, 5, 94, -70, 86, 17, 96}, new byte[]{57, 99, 64, 57, -102, 97, 126, -36}) + componentName);
                }
                if (!serviceInfo.exported) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(u7.OooO00o(new byte[]{-29, 122, 55, -40, -111, -3, -125, 66, -28, 97, 55, -35, -126, -25, -120, 83, -13, 101, 48, -33, -117, -104, -67, 119, -56, 95, 28, -8, -30, -104}, new byte[]{-95, 51, 121, -100, -50, -72, -37, 22}));
                    sb3.append(componentName3);
                    throw new SecurityException(rj.OooO0oo(new byte[]{-88, 112, -106, -73, -53, -73, -117, -32, -19, 97, -107, -8, -41, -84, -102, -92}, new byte[]{-120, 25, -27, -105, -91, -40, -1, -64}, sb3));
                }
                if ((i3 & 2) == 0) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(u7.OooO00o(new byte[]{22, 31, -111, -31, -72, 1, 10, -48, 17, 4, -111, -28, -85, 27, 1, -63, 6, 0, -106, -26, -94, 100, 52, -27, 61, 58, -70, -63, -53, 100}, new byte[]{84, 86, -33, -91, -25, 68, 82, -124}));
                    sb4.append(componentName3);
                    throw new SecurityException(rj.OooO0oo(new byte[]{12, -128, -21, 114, -112, 22, 5, -122, 77, -121, -72, 59, -115, 22, 29, -57, 88, -116, -4, 2, -116, 22, 18, -61, 95, -102}, new byte[]{44, -23, -104, 82, -2, 121, 113, -90}, sb4));
                }
                ApplicationInfo applicationInfoO0000oO0 = ox1.o0O0ooO().o0000oO0(0, i, null, str3);
                if (applicationInfoO0000oO0 == null) {
                    throw new SecurityException(u7.OooO00o(new byte[]{-85, 102, -62, -38, -82, -92, 73, 73, -84, 125, -62, -33, -67, -66, 66, 88, -69, 121, -59, -35, -76, -63, 119, 124, -128, 67, -23, -6, -35, -63, 114, 114, -100, 67, -24, -66, -97, -114, 101, 61, -101, 74, -1, -15, -99, -105, 116, 61, -118, 67, -27, -5, -97, -107, 49, 109, -120, 76, -25, -1, -106, -124, 49}, new byte[]{-23, 47, -116, -98, -15, -31, 17, 29}) + str3);
                }
                ServiceInfo serviceInfo2 = new ServiceInfo(serviceInfo);
                ApplicationInfo applicationInfo = new ApplicationInfo(serviceInfo2.applicationInfo);
                serviceInfo2.applicationInfo = applicationInfo;
                applicationInfo.packageName = applicationInfoO0000oO0.packageName;
                applicationInfo.uid = applicationInfoO0000oO0.uid;
                ComponentName componentName4 = new ComponentName(applicationInfoO0000oO0.packageName, componentName.getClassName());
                ComponentName componentName5 = new ComponentName(applicationInfoO0000oO0.packageName, str == null ? componentName3.getClassName() : componentName3.getClassName() + u7.OooO00o(new byte[]{-99}, new byte[]{-89, -66, -91, -90, 94, 27, -105, -76}) + str);
                intent.setComponent(componentName4);
                componentName2 = componentName4;
                serviceInfo = serviceInfo2;
                componentName3 = componentName5;
            } else {
                if (z2) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(u7.OooO00o(new byte[]{43, -81, 127, 63, 29, 34, -69, 57, 44, -76, 127, 58, 14, 56, -80, 40, 59, -80, 120, 56, 7, 71, -123, 12, 0, -118, 84, 31, 110, 71}, new byte[]{105, -26, 49, 123, 66, 103, -29, 109}));
                    sb5.append(componentName);
                    throw new SecurityException(rj.OooO0oo(new byte[]{-13, 49, -118, -77, -48, 104, 63, 101, -78, 54, -39, -10, -58, 115, 46, 55, -67, 57, -107, -64, -37, 117, 61, 44, -80, 61}, new byte[]{-45, 88, -7, -109, -66, 7, 75, 69}, sb5));
                }
                componentName2 = componentName;
            }
            kf1 kf1Var2 = (kf1) arrayMap2.get(componentName2);
            if (kf1Var2 == null && z) {
                Intent.FilterComparison filterComparison = new Intent.FilterComparison(intent.cloneFilter());
                ServiceInfo serviceInfo3 = serviceInfo;
                kf1Var = new kf1(this.OooO00o, componentName3, componentName2, filterComparison, serviceInfo3, i);
                arrayMap2.put(componentName2, kf1Var);
                arrayMap.put(filterComparison, kf1Var);
                ArrayList arrayList = this.OooO0OO;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    kf1 kf1Var3 = (kf1) arrayList.get(size);
                    if (kf1Var3.OooO.applicationInfo.uid == serviceInfo3.applicationInfo.uid && kf1Var3.OooO0o.equals(componentName2)) {
                        arrayList.remove(size);
                    }
                }
            } else {
                kf1Var = kf1Var2;
            }
        }
        if (kf1Var != null) {
            return new ay1(kf1Var, 3);
        }
        return null;
    }

    public final void OooOOOo(kf1 kf1Var) throws TransactionTooLargeException {
        int i;
        int size = kf1Var.OooOoOO.size();
        if (size == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (kf1Var.OooOoOO.size() <= 0) {
                break;
            }
            jf1 jf1Var = (jf1) kf1Var.OooOoOO.remove(0);
            if (jf1Var.OooO0OO != null || size <= 1) {
                SystemClock.uptimeMillis();
                kf1Var.OooOoO.add(jf1Var);
                int i2 = jf1Var.OooO0Oo + 1;
                jf1Var.OooO0Oo = i2;
                i = i2 > 1 ? 2 : 0;
                if (jf1Var.OooO0o0 > 0) {
                    i |= 1;
                }
                arrayList.add(new nf1(jf1Var.OooO0O0, i, jf1Var.OooO0OO));
            }
        }
        try {
            kf1Var.OooOOo0.OooOOoo.OooOO0O.o0Oo0oo(kf1Var, new ArrayList(arrayList));
            e = null;
        } catch (TransactionTooLargeException e) {
            e = e;
        } catch (RemoteException e2) {
            e = e2;
        } catch (Exception e3) {
            e = e3;
        }
        if (e != null) {
            boolean zContains = this.OooO0o0.contains(kf1Var);
            while (i < arrayList.size()) {
                OooOOo(kf1Var, zContains, zContains);
                i++;
            }
            if (e instanceof TransactionTooLargeException) {
                throw ((TransactionTooLargeException) e);
            }
        }
    }

    public final void OooOOo(kf1 kf1Var, boolean z, boolean z2) {
        u7.OooO00o(new byte[]{-45, 103, 94, 107, 96, -103, 15, -11, -49, 30, 58, 14, 103, -125, 21, -7, -95, 28, 66}, new byte[]{-17, 91, 98, 75, 36, -42, 65, -80});
        String str = kf1Var.OooO0oO;
        int i = fp0.OooO00o;
        int i2 = kf1Var.OooOo0O - 1;
        kf1Var.OooOo0O = i2;
        if (i2 <= 0) {
            if (kf1Var.OooOOo0 != null && z) {
                this.OooO0o0.remove(kf1Var);
                kf1Var.OooOOOO.clear();
            }
            if (z2) {
                b51 b51Var = kf1Var.OooOOo0;
                if (b51Var != null) {
                    b51Var.OooOOo0.remove(kf1Var);
                }
                kf1Var.OooOOo0 = null;
            }
        }
    }

    public final void OooOOo0(kf1 kf1Var, int i, int i2, int i3) {
        boolean zContains = this.OooO0o0.contains(kf1Var);
        if (kf1Var != null) {
            if (i == 1) {
                if (i3 == 0 || i3 == 1) {
                    kf1Var.OooO00o(i2, false, true);
                } else {
                    if (i3 == 2) {
                        kf1Var.OooO00o(i2, false, true);
                    } else if (i3 != 3) {
                        if (i3 != 1000) {
                            ra.OooOOO(px0.OooOOOo(new byte[]{34, 51, -43, -56, -118, -89, -91, -94, 4, 56, -52, -48, -116, -77, -82, -94, 4, 41, -33, -44, -111, -16, -71, -25, 4, 40, -46, -46, -33, -16}, new byte[]{119, 93, -66, -90, -27, -48, -53, -126}, new StringBuilder(), i3));
                            return;
                        }
                        kf1Var.OooO00o(i2, true, true);
                    }
                    jf1 jf1VarOooO00o = kf1Var.OooO00o(i2, false, false);
                    if (jf1VarOooO00o != null) {
                        jf1VarOooO00o.OooO0Oo = 0;
                        jf1VarOooO00o.OooO0o0++;
                    }
                }
            } else if (i == 2 && zContains && kf1Var.OooOo0O != 1) {
                kf1Var.OooOo0O = 1;
            }
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            OooOOo(kf1Var, zContains, zContains);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void OooOOoo(kf1 kf1Var, int i, Notification notification, int i2) {
        if (i == 0) {
            if (kf1Var.OooOo0o) {
                kf1Var.OooOo0o = false;
            }
            if ((i2 & 1) != 0) {
                OooO0o(kf1Var);
                kf1Var.OooOo = 0;
                kf1Var.OooOoO0 = null;
                return;
            } else {
                if (kf1Var.OooOO0.targetSdkVersion < 21 || (i2 & 2) == 0) {
                    return;
                }
                kf1Var.OooOo = 0;
                kf1Var.OooOoO0 = null;
                return;
            }
        }
        if (kf1Var.OooOo != i) {
            OooO0o(kf1Var);
            kf1Var.OooOo = i;
        }
        if (yn2.OooO0o()) {
            Class clsOooOooO = t8.OooOooO();
            o00OO000 o00oo000 = vx0.OooO0OO;
            if (o00oo000 != null ? ((Boolean) o00oo000.OooOooo(notification, clsOooOooO)).booleanValue() : false) {
                int i3 = notification.flags;
            }
        }
        kf1Var.OooOoO0 = notification;
        if (!kf1Var.OooOo0o) {
            kf1Var.OooOo0o = true;
        }
        kf1Var.OooO0Oo.OooOO0.post(new o00OOOOo(kf1Var, 13));
        o00OOO0O o00ooo0oOooO0oo = OooO0oo(kf1Var.OooOO0O);
        if (o00ooo0oOooO0oo.OooO0Oo.remove(kf1Var)) {
            o00ooo0oOooO0oo.OooO00o();
        }
        o00ooo0oOooO0oo.OooO0OO.remove(kf1Var);
    }

    public final void OooOo(kf1 kf1Var, IBinder iBinder, Intent intent) {
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        if (kf1Var != null) {
            try {
                ui0 ui0Var = intent != null ? (ui0) kf1Var.OooOOOO.get(new Intent.FilterComparison(intent)) : iBinder instanceof ui0 ? (ui0) iBinder : null;
                boolean zContains = this.OooO0o0.contains(kf1Var);
                if (ui0Var != null) {
                    if (ui0Var.OooO0o.size() <= 0 || zContains) {
                        ui0Var.OooOO0O = true;
                    } else {
                        try {
                            OooOOO(kf1Var, ui0Var, true);
                        } catch (TransactionTooLargeException unused) {
                        }
                    }
                }
                OooOOo(kf1Var, zContains, false);
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
        Binder.restoreCallingIdentity(jClearCallingIdentity);
    }

    public final ComponentName OooOo0(w90 w90Var, Intent intent, String str, int i, String str2, int i2) {
        if (w90Var != null && this.OooO00o.o00O000(w90Var) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(u7.OooO00o(new byte[]{110, -78, -121, -62, -63, -108, -127, -83, 84, -4, -128, -55, -61, -107, -127, -72, 75, -84, -58, -58, -62, -125, -127, -70, 90, -80, -118, -59, -33, -47}, new byte[]{59, -36, -26, -96, -83, -15, -95, -39}));
            sb.append(w90Var);
            rj.OooOOOo(new byte[]{39, 52, 61, -101, -65, -14}, new byte[]{7, 28, 77, -14, -37, -49, -115, 49}, sb, i);
            sb.append(u7.OooO00o(new byte[]{95, 62, -73, 87, -28, 122, -7, -7, 2, 127, -78, 75, -24, 122, -66, -86, 5, 123, -78, 73, -24, 119, -68, -86}, new byte[]{118, 30, -64, 63, -127, 20, -39, -118}));
            sb.append(intent);
            d51.OooO00o(sb.toString());
            throw null;
        }
        ay1 ay1VarOooOOOO = OooOOOO(intent, null, str, str2, i2, true, false);
        if (ay1VarOooOOOO == null) {
            return null;
        }
        kf1 kf1Var = (kf1) ay1VarOooOOOO.OooO0o0;
        kf1Var.OooOOo = SystemClock.uptimeMillis();
        kf1Var.OooOo0 = true;
        ArrayList arrayList = kf1Var.OooOoOO;
        int i3 = kf1Var.OooOo00 + 1;
        kf1Var.OooOo00 = i3;
        if (i3 < 1) {
            kf1Var.OooOo00 = 1;
        }
        arrayList.add(new jf1(kf1Var, kf1Var.OooOo00, intent));
        return OooOo00(OooO0oo(kf1Var.OooOO0O), intent, kf1Var);
    }

    public final ComponentName OooOo00(o00OOO0O o00ooo0o, Intent intent, kf1 kf1Var) {
        ArrayList arrayList = o00ooo0o.OooO0Oo;
        intent.getFlags();
        String strOooO0o0 = OooO0o0(kf1Var);
        if (strOooO0o0 != null) {
            return new ComponentName(u7.OooO00o(new byte[]{-11, -56}, new byte[]{-44, -23, -114, -122, -77, -112, 26, -34}), strOooO0o0);
        }
        if (kf1Var.OooOo0) {
            boolean z = arrayList.size() == 0;
            arrayList.add(kf1Var);
            long jUptimeMillis = SystemClock.uptimeMillis();
            this.OooO00o.OooOO0o.getClass();
            kf1Var.OooOOoo = jUptimeMillis + 15000;
            if (z) {
                o00ooo0o.OooO00o();
            }
        } else {
            if (arrayList.remove(kf1Var)) {
                o00ooo0o.OooO00o();
            }
            o00ooo0o.OooO0OO.remove(kf1Var);
        }
        return kf1Var.OooO0o0;
    }

    public final int OooOo0O(w90 w90Var, Intent intent, String str, int i) {
        b51 b51VarO00O000 = this.OooO00o.o00O000(w90Var);
        if (w90Var != null && b51VarO00O000 == null) {
            d51.OooO00o(u7.OooO00o(new byte[]{2, -19, -25, 103, 72, 114, 46, -128, 56, -93, -32, 108, 74, 115, 46, -107, 39, -13, -90, 99, 75, 101, 46, -105, 54, -17, -22, 96, 86, 55}, new byte[]{87, -125, -122, 5, 36, 23, 14, -12}) + w90Var + u7.OooO00o(new byte[]{17, -70, -28, -67, -2, -123}, new byte[]{49, -110, -108, -44, -102, -72, -118, -104}) + Binder.getCallingPid() + u7.OooO00o(new byte[]{-5, -75, 92, 124, 37, 20, -20, 64, -90, -6, 91, 100, 41, 20, -85, 19, -95, -16, 89, 98, 41, 25, -87, 19}, new byte[]{-46, -107, 43, 20, 64, 122, -52, 51}) + intent);
            throw null;
        }
        Binder.getCallingPid();
        Binder.getCallingUid();
        ay1 ay1VarOooOOOO = OooOOOO(intent, null, str, null, i, false, false);
        if (ay1VarOooOOOO == null) {
            return 0;
        }
        kf1 kf1Var = (kf1) ay1VarOooOOOO.OooO0o0;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            kf1Var.OooOo0 = false;
            OooO0OO(kf1Var, false, false);
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return 1;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final boolean OooOo0o(ComponentName componentName, IBinder iBinder, int i, int i2) {
        kf1 kf1Var = (kf1) OooO0oo(i2).OooO00o.get(componentName);
        if (kf1Var != iBinder) {
            kf1Var = null;
        }
        if (kf1Var != null) {
            ArrayList arrayList = kf1Var.OooOoO;
            if (i >= 0) {
                jf1 jf1VarOooO00o = kf1Var.OooO00o(i, false, false);
                if (jf1VarOooO00o != null) {
                    while (arrayList.size() > 0 && ((jf1) arrayList.remove(0)) != jf1VarOooO00o) {
                    }
                }
                if (kf1Var.OooOo00 == i) {
                    arrayList.size();
                }
            }
            kf1Var.OooOo0 = false;
            OooO0OO(kf1Var, false, false);
            return true;
        }
        return false;
    }

    public final boolean OooOoO0(IBinder iBinder) {
        ArrayList arrayList = (ArrayList) this.OooO0o.get(IServiceConnection.Stub.asInterface(iBinder).asBinder());
        if (arrayList == null) {
            return false;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        while (arrayList.size() > 0) {
            try {
                fh fhVar = (fh) arrayList.get(0);
                OooOOO0(fhVar);
                if (arrayList.size() > 0 && arrayList.get(0) == fhVar) {
                    arrayList.remove(0);
                }
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
        }
        Binder.restoreCallingIdentity(jClearCallingIdentity);
        return true;
    }
}

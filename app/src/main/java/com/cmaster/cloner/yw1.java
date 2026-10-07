package com.cmaster.cloner;

import android.accounts.Account;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.SyncStatusInfo;
import android.content.pm.ProviderInfo;
import android.database.IContentObserver;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Binder;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class yw1 extends ye0 {
    public static final String OooOO0o = u7.OooO00o(new byte[]{54, -26, -122, -46, -72, 25, 60, -10, 16, -5, -98, -49, -66, 18}, new byte[]{117, -119, -24, -90, -35, 119, 72, -91});
    public static final oO00OOOo OooOOO0 = new oO00OOOo(13);
    public final HandlerThread OooO;
    public final ww1 OooO0o;
    public Context OooO0o0;
    public vk1 OooO0oO;
    public final Object OooO0oo;
    public boolean OooOO0;
    public final SparseArray OooOO0O;

    public yw1() {
        attachInterface(this, u7.OooO00o(new byte[]{44, 21, 93, -80, -2, -42, -85, -101, 59, 31, 66, -80, -2, -41, -91, -122, 42, 8, 30, -55, -38, -17, -110, -84, 6, 32, 99, -57, -51, -11, -110, -79, 13, 48, 102}, new byte[]{79, 122, 48, -98, -99, -69, -54, -24}));
        this.OooO0o = new ww1("");
        this.OooO0oO = null;
        this.OooO0oo = new Object();
        new xw1(this);
        this.OooO = new HandlerThread(u7.OooO00o(new byte[]{3, 56, -72, 4, 97, -95, -38, -14, 37, 37, -96, 25, 103, -86}, new byte[]{64, 87, -42, 112, 4, -49, -82, -95}));
        this.OooOO0 = false;
        this.OooOO0O = new SparseArray();
        new g(this, 5);
    }

    @Override // com.cmaster.cloner.ze0
    public final void Oooo0OO(Uri uri, IBinder iBinder, boolean z, int i, int i2) {
        IContentObserver iContentObserverAsInterface = IContentObserver.Stub.asInterface(iBinder);
        if (uri == null) {
            qa.OooOOO0(u7.OooO00o(new byte[]{51, -120, 115, 87, -73, -105, -124, -61, 70, -108, 117, 3, -6, -128, -110, -105, 8, -113, 118, 27}, new byte[]{102, -6, 26, 119, -38, -30, -9, -73}));
            return;
        }
        t53.OooO00o();
        Binder.getCallingPid();
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            ArrayList arrayList = new ArrayList();
            synchronized (this.OooO0o) {
                this.OooO0o.OooO0OO(uri, 0, iContentObserverAsInterface, z, i, i2, arrayList);
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                uw1 uw1Var = (uw1) arrayList.get(i3);
                try {
                    uw1Var.OooO0O0.onChange(uw1Var.OooO0OO, uri, i2);
                } catch (RemoteException unused) {
                    synchronized (this.OooO0o) {
                        try {
                            Log.w(OooOO0o, u7.OooO00o(new byte[]{73, 35, 38, -9, 21, 59, -27, 89, 110, 40, 115, -10, 19, 104, -28, 78, 121, 41, 33, -75, 81, 105, -28, 81, 96, 58, 58, -9, 22}, new byte[]{15, 76, 83, -103, 113, 27, -127, 60}));
                            IBinder iBinderAsBinder = uw1Var.OooO0O0.asBinder();
                            ArrayList arrayList2 = uw1Var.OooO00o.OooO0OO;
                            int size2 = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                if (((vw1) arrayList2.get(i4)).OooO0Oo.asBinder() == iBinderAsBinder) {
                                    arrayList2.remove(i4);
                                    i4--;
                                    size2--;
                                }
                                i4++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            if ((i & 1) != 0 && o00O000o() != null) {
                uri.getAuthority();
            }
            synchronized (this.OooOO0O) {
                ProviderInfo providerInfoO000o0Oo = ox1.o0O0ooO().o000o0Oo(0, i2, null, uri.getAuthority());
                o00O00O(i2, uri, providerInfoO000o0Oo != null ? providerInfoO000o0Oo.packageName : null);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final ArrayMap o00(int i, String str) {
        SparseArray sparseArray = this.OooOO0O;
        ArrayMap arrayMap = (ArrayMap) sparseArray.get(i);
        if (arrayMap == null) {
            arrayMap = new ArrayMap();
            sparseArray.put(i, arrayMap);
        }
        ArrayMap arrayMap2 = (ArrayMap) arrayMap.get(str);
        if (arrayMap2 != null) {
            return arrayMap2;
        }
        ArrayMap arrayMap3 = new ArrayMap();
        arrayMap.put(str, arrayMap3);
        return arrayMap3;
    }

    public final void o0000o0O(Account account, String str, long j) {
        if (account == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-91, 39, 98, 44, 93, -38, 71, 60, -119, 49, 114, 55, 8, -38, 92, 104, -60, 38, 100, 99, 70, -63, 95, 112}, new byte[]{-28, 68, 1, 67, 40, -76, 51, 28}));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO(u7.OooO00o(new byte[]{120, 98, -35, 31, -72, 62, -60, -35, 64, 55, -60, 2, -92, 56, -115, -57, 86, 99, -119, 21, -78, 108, -56, -60, 73, 99, -48, 89}, new byte[]{57, 23, -87, 119, -41, 76, -83, -87}));
            return;
        }
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{17, -3, -88, 55, 102, -76, -78, 54, 0, -10, -66, 40, 96, -82, -91, 113, 31, -3, -30, 18, 91, -108, -126, 93, 47, -64, -107, 11, 74, -126, -123, 93, 36, -57, -123, 11, 78, -114}, new byte[]{112, -109, -52, 69, 9, -35, -42, 24}), u7.OooO00o(new byte[]{-13, -99, 31, 66, 48, 47, -106, -20, -18, -127, 86, 93, 59, 125, -113, -22, -67, -123, 77, 91, 33, 56, -37, -15, -11, -105, 31, 65, 44, 51, -104, -91, -18, -105, 75, 70, 60, 51, -100, -10}, new byte[]{-99, -14, 63, 50, 85, 93, -5, -123}));
        t53.OooO0O0();
        if (j < JobInfo.getMinPeriodMillis() / 1000) {
            u7.OooO00o(new byte[]{-127, -107, -117, 44, 95, -25, 75, 5, -73, -48, -118, 54, 86, -8, 31, 6, -95, -107, -117, 44, 95, -6, 92, 25, -13, -97, -100, 121}, new byte[]{-45, -16, -6, 89, 58, -108, 63, 96});
            u7.OooO00o(new byte[]{-54, -9, -58, -46, 30, 103, 49, 26, -54, -26, -58, -40, 31, 110, 117, 27, -123, -15, -51, -43, 20, 109, 117, 28, -102, -92, -41, -34, 81}, new byte[]{-22, -124, -93, -79, 113, 9, 85, 105});
            u7.OooO00o(new byte[]{70, 84}, new byte[]{53, 122, -69, 39, 106, 37, -13, 2});
            int i = fp0.OooO00o;
        }
        String str2 = zk1.OooOOO;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            o00O000o().getClass();
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.cmaster.cloner.ze0
    public final void o000OOo0(IBinder iBinder) {
        if (iBinder == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-128, -87, -66, 22, -58, -91, 65, -121, -7, -74, -86, 69, -40, -16, 83, -45, -81, -89, -89, 95, -49, -16, 93}, new byte[]{-39, -58, -53, 54, -85, -48, 50, -13}));
            return;
        }
        IContentObserver iContentObserverAsInterface = IContentObserver.Stub.asInterface(iBinder);
        if (iContentObserverAsInterface == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-45, 34, -97, -58, 31, 96, 11, -84, -86, 61, -117, -107, 1, 53, 25, -8, -4, 44, -122, -113, 22, 53, 23}, new byte[]{-118, 77, -22, -26, 114, 21, 120, -40}));
            return;
        }
        synchronized (this.OooO0o) {
            this.OooO0o.OooO0Oo(iContentObserverAsInterface);
        }
    }

    @Override // com.cmaster.cloner.ze0
    public final void o000ooOO(Uri uri, boolean z, IBinder iBinder, int i) {
        if (iBinder == null || uri == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-19, 107, 66, -109, -126, 22, 35, -53, -108, 116, 86, -64, -100, 67, 49, -97, -62, 101, 91, -38, -117, 67, 37, -51, -35, 36, 86, -35, -117, 67, 63, -35, -57, 97, 69, -59, -118, 17}, new byte[]{-76, 4, 55, -77, -17, 99, 80, -65}));
            return;
        }
        IContentObserver iContentObserverAsInterface = IContentObserver.Stub.asInterface(iBinder);
        if (iContentObserverAsInterface == null) {
            ra.OooOOO(u7.OooO00o(new byte[]{-57, -15, 81, 25, -110, -23, 80, -40, -66, -18, 69, 74, -116, -68, 66, -116, -24, -1, 72, 80, -101, -68, 86, -34, -9, -66, 69, 87, -101, -68, 76, -50, -19, -5, 86, 79, -102, -18}, new byte[]{-98, -98, 36, 57, -1, -100, 35, -84}));
            return;
        }
        t53.OooO00o();
        Binder.getCallingPid();
        synchronized (this.OooO0o) {
            ww1 ww1Var = this.OooO0o;
            ww1Var.OooO00o(uri, 0, iContentObserverAsInterface, z, ww1Var, i);
        }
    }

    public final void o000oooo(String str, ComponentName componentName) {
        if (str != null && str.length() == 0) {
            ra.OooOOO(u7.OooO00o(new byte[]{-22, -80, -13, -32, -54, -84, 92, 93, -46, -27, -22, -3, -42, -86, 21, 75, -50, -27, -23, -25, -53, -13, 80, 68, -37, -79, -2}, new byte[]{-85, -59, -121, -120, -91, -34, 53, 41}));
            return;
        }
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        if (componentName != null) {
            u7.OooO00o(new byte[]{-60, -77, 100, -108, -41, 115, -70, -127, -45, -3, 107, -116, -34, 63, -6}, new byte[]{-89, -35, 5, -7, -78, 83, -44, -18});
            int i = fp0.OooO00o;
        } else {
            try {
                if (o00O000o() != null) {
                    u7.OooO00o(new byte[]{-111, -73, -72}, new byte[]{-48, -25, -15, 70, -108, -106, 106, -110});
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public final SyncStatusInfo o00O00(int i, Account account, String str) {
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO(u7.OooO00o(new byte[]{10, -97, -106, 58, -112, -35, -17, 3, 50, -54, -113, 39, -116, -37, -90, 25, 36, -98, -62, 48, -102, -113, -29, 26, 59, -98, -101}, new byte[]{75, -22, -30, 82, -1, -81, -122, 119}));
            return null;
        }
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{88, -114, -21, -12, 5, -95, 22, 121, 73, -123, -3, -21, 3, -69, 1, 62, 86, -114, -95, -44, 47, -119, 54, 8, 106, -71, -63, -59, 53, -101, 38, 22, 109, -77}, new byte[]{57, -32, -113, -122, 106, -56, 114, 87}), u7.OooO00o(new byte[]{-6, 92, 96, -21, -55, 98, 89, -15, -25, 64, 41, -12, -62, 48, 64, -9, -76, 65, 37, -6, -56, 48, 64, -16, -15, 19, 51, -30, -62, 115, 20, -21, -32, 82, 52, -24}, new byte[]{-108, 51, 64, -101, -84, 16, 52, -104}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            vk1 vk1VarO00O000o = o00O000o();
            if (vk1VarO00O000o == null) {
                return null;
            }
            if (account == null || str == null) {
                throw new IllegalArgumentException(u7.OooO00o(new byte[]{51, 72, 19, 73, 89, -111, 85, 69, 18, 29, 19, 68, 23, -111, 20, 90, 10, 92, 20, 72, 10, -46, 67, 64, 10, 85, 64, 75, 24, -98, 93, 77, 94, 92, 21, 73, 17, -99, 70, 64, 10, 68}, new byte[]{126, 61, 96, 61, 121, -14, 52, 41}));
            }
            return ((zk1) vk1VarO00O000o.OooO0o0).OooO0o0(new o00Oo00(account, str, i, 5));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean o00O000(int i, Account account, String str) {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{43, 72, 29, -125, -15, -110, -22, 116, 58, 67, 11, -100, -9, -120, -3, 51, 37, 72, 87, -93, -37, -70, -54, 5, 25, 127, 55, -78, -63, -88, -53, 14, 30, 111, 55, -74, -51}, new byte[]{74, 38, 121, -15, -98, -5, -114, 90}), u7.OooO00o(new byte[]{17, -18, 94, -122, 37, -100, 45, -128, 12, -14, 23, -103, 46, -50, 52, -122, 95, -13, 27, -105, 36, -50, 52, -127, 26, -95, 13, -113, 46, -115, 96, -102, 26, -11, 10, -97, 46, -119, 51}, new byte[]{127, -127, 126, -10, 64, -18, 64, -23}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            vk1 vk1VarO00O000o = o00O000o();
            if (vk1VarO00O000o != null) {
                return ((zk1) vk1VarO00O000o.OooO0o0).OooO0o(i, account, str);
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return false;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final ArrayList o00O0000(int i) {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-60, -110, -110, 65, 74, 65, -102, 20, -43, -103, -124, 94, 76, 91, -115, 83, -54, -110, -40, 97, 96, 105, -70, 101, -10, -91, -72, 112, 122, 123, -86, 123, -15, -81}, new byte[]{-91, -4, -10, 51, 37, 40, -2, 58}), u7.OooO00o(new byte[]{108, -88, 44, 6, -87, -72, -77, 108, 113, -76, 101, 25, -94, -22, -86, 106, 34, -75, 105, 23, -88, -22, -86, 109, 103, -25, 127, 15, -94, -87, -2, 118, 118, -90, 120, 5}, new byte[]{2, -57, 12, 118, -52, -54, -34, 5}));
        boolean z = this.OooO0o0.checkCallingOrSelfPermission(u7.OooO00o(new byte[]{-127, -86, 81, -42, 105, -94, -102, -35, -112, -95, 71, -55, 111, -72, -115, -102, -113, -86, 27, -29, 67, -97, -95, -78, -93, -121, 122, -15, 72, -97, -83}, new byte[]{-32, -60, 53, -92, 6, -53, -2, -13})) == 0;
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            return ((zk1) o00O000o().OooO0o0).OooO0O0(i, z);
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final vk1 o00O000o() {
        vk1 vk1Var;
        synchronized (this.OooO0oo) {
            try {
            } catch (SQLiteException e) {
                Log.e(OooOO0o, u7.OooO00o(new byte[]{51, -123, -119, -32, 52, 85, -115, 54, 21, -123, -109, -94, 96, 38, -105, 42, 19, -87, -122, -87, 33, 18, -117, 54}, new byte[]{112, -28, -25, -57, 64, 117, -18, 68}), e);
            }
            if (this.OooO0oO == null) {
                this.OooO0oO = new vk1(this.OooO0o0);
                vk1Var = this.OooO0oO;
            } else {
                vk1Var = this.OooO0oO;
            }
        }
        return vk1Var;
    }

    public final void o00O00O(int i, Uri uri, String str) {
        ArrayMap arrayMap;
        ArrayMap arrayMap2 = (ArrayMap) this.OooOO0O.get(i);
        if (arrayMap2 == null || (arrayMap = (ArrayMap) arrayMap2.get(str)) == null) {
            return;
        }
        if (uri == null) {
            arrayMap.clear();
            return;
        }
        int i2 = 0;
        while (i2 < arrayMap.size()) {
            Object obj = ((Pair) arrayMap.keyAt(i2)).second;
            if (obj == null || !((Uri) obj).toString().startsWith(uri.toString())) {
                i2++;
            } else {
                arrayMap.removeAt(i2);
            }
        }
    }

    public final void o00O00OO(int i, boolean z) {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-13, -104, -43, -59, 105, 32, -83, -103, -30, -109, -61, -38, 111, 58, -70, -34, -3, -104, -97, -32, 84, 0, -99, -14, -51, -91, -24, -7, 69, 22, -102, -14, -58, -94, -8, -7, 65, 26}, new byte[]{-110, -10, -79, -73, 6, 73, -55, -73}), u7.OooO00o(new byte[]{-96, 26, 90, -70, 127, 80, 114, -33, -67, 6, 19, -91, 116, 2, 107, -39, -18, 2, 8, -93, 110, 71, 63, -62, -90, 16, 90, -71, 99, 76, 124, -106, -67, 16, 14, -66, 115, 76, 120, -59}, new byte[]{-50, 117, 122, -54, 26, 34, 31, -74}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            vk1 vk1VarO00O000o = o00O000o();
            if (vk1VarO00O000o != null) {
                ((zk1) vk1VarO00O000o.OooO0o0).OooOOo0(i, z);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final void o00O00Oo(int i, Account account, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            ra.OooOOO(u7.OooO00o(new byte[]{36, 4, -8, 109, 16, -66, 36, 106, 28, 81, -31, 112, 12, -72, 109, 124, 0, 81, -30, 106, 17, -31, 40, 115, 21, 5, -11}, new byte[]{101, 113, -116, 5, 127, -52, 77, 30}));
            return;
        }
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-98, 93, 31, 36, 89, -85, -51, -113, -113, 86, 9, 59, 95, -79, -38, -56, -112, 93, 85, 1, 100, -117, -3, -28, -96, 96, 34, 24, 117, -99, -6, -28, -85, 103, 50, 24, 113, -111}, new byte[]{-1, 51, 123, 86, 54, -62, -87, -95}), u7.OooO00o(new byte[]{-92, 35, 100, -26, 115, 102, 53, -49, -71, 63, 45, -7, 120, 52, 44, -55, -22, 59, 54, -1, 98, 113, 120, -46, -94, 41, 100, -27, 111, 122, 59, -122, -71, 41, 48, -30, 127, 122, 63, -43}, new byte[]{-54, 76, 68, -106, 22, 20, 88, -90}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            vk1 vk1VarO00O000o = o00O000o();
            if (vk1VarO00O000o != null) {
                ((zk1) vk1VarO00O000o.OooO0o0).OooOOo(i, account, str, z);
            }
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final boolean o00oOoo(int i) {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-62, 39, -44, -28, 126, -89, 55, 62, -45, 44, -62, -5, 120, -67, 32, 121, -52, 39, -98, -60, 84, -113, 23, 79, -16, 16, -2, -43, 78, -99, 22, 68, -9, 0, -2, -47, 66}, new byte[]{-93, 73, -80, -106, 17, -50, 83, 16}), u7.OooO00o(new byte[]{-109, 49, -119, -42, 15, -48, 123, -89, -114, 45, -64, -55, 4, -126, 98, -95, -35, 44, -52, -57, 14, -126, 98, -90, -104, 126, -38, -33, 4, -63, 54, -67, -104, 42, -35, -49, 4, -59, 101}, new byte[]{-3, 94, -87, -90, 106, -94, 22, -50}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            vk1 vk1VarO00O000o = o00O000o();
            boolean zBooleanValue = false;
            if (vk1VarO00O000o == null) {
                return false;
            }
            zk1 zk1Var = (zk1) vk1VarO00O000o.OooO0o0;
            synchronized (zk1Var.OooO00o) {
                Boolean bool = (Boolean) zk1Var.OooOOO0.get(i);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            }
            return zBooleanValue;
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    public final int o0O0ooO() {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{120, 24, -102, -117, 104, 18, -52, -122, 105, 19, -116, -108, 110, 8, -37, -63, 118, 24, -48, -85, 66, 58, -20, -9, 74, 47, -80, -70, 88, 40, -19, -4, 77, 63, -80, -66, 84}, new byte[]{25, 118, -2, -7, 7, 123, -88, -88}), u7.OooO00o(new byte[]{31, 72, 18, 1, 67, -56, 40, -99, 2, 84, 91, 30, 72, -102, 49, -101, 81, 85, 87, 16, 66, -102, 49, -100, 20, 7, 65, 8, 72, -39, 101, -121, 20, 83, 70, 24, 72, -35, 54}, new byte[]{113, 39, 50, 113, 38, -70, 69, -12}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        try {
            if (o00O000o() != null) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return 0;
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            return -1;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
            throw th;
        }
    }

    public final boolean oOO00O(int i, Account account, String str) {
        this.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-84, -23, 101, -4, 108, -122, -28, -50, -67, -30, 115, -29, 106, -100, -13, -119, -94, -23, 47, -36, 70, -82, -60, -65, -98, -34, 79, -51, 92, -68, -44, -95, -103, -44}, new byte[]{-51, -121, 1, -114, 3, -17, -128, -32}), u7.OooO00o(new byte[]{41, 37, 18, -74, -80, -107, -75, -106, 52, 57, 91, -87, -69, -57, -84, -112, 103, 56, 87, -89, -79, -57, -84, -105, 34, 106, 65, -65, -69, -124, -8, -116, 51, 43, 70, -75}, new byte[]{71, 74, 50, -58, -43, -25, -40, -1}));
        long jClearCallingIdentity = Binder.clearCallingIdentity();
        vk1 vk1VarO00O000o = o00O000o();
        if (vk1VarO00O000o == null) {
            return false;
        }
        try {
            if (account == null || str == null) {
                throw new IllegalArgumentException(u7.OooO00o(new byte[]{-76, -50, 46, -104, 81, 50, -6, -30, -100, -43, 44, -111, 82, 41, -9, -74, -124, -128, 43, -119, 88, 56, -9, -92, -108, -59, 60}, new byte[]{-3, -96, 88, -7, 61, 91, -98, -62}));
            }
            return ((zk1) vk1VarO00O000o.OooO0o0).OooO0oo(new o00Oo00(account, str, i, 5));
        } finally {
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
    }

    @Override // com.cmaster.cloner.ye0, android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        try {
            return super.onTransact(i, parcel, parcel2, i2);
        } catch (RuntimeException e) {
            if (!(e instanceof SecurityException)) {
                u7.OooO00o(new byte[]{56, -84, -4, 61, -120, 56, 8, 3, 40, -90, -32, 63, -124, 53, 25, 3, 56, -79, -13, 58, -123}, new byte[]{123, -61, -110, 73, -19, 86, 124, 35});
                int i3 = fp0.OooO00o;
            }
            throw e;
        }
    }
}

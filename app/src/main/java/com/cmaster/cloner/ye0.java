package com.cmaster.cloner;

import android.accounts.Account;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ISyncStatusObserver;
import android.content.SyncAdapterType;
import android.content.SyncStatusInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Pair;
import com.google.android.gms.internal.ads.zzbcj;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ye0 extends Binder implements ze0 {
    public static final /* synthetic */ int OooO0Oo = 0;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str;
        Bundle bundle;
        String strOooO00o = u7.OooO00o(new byte[]{-15, 124, -89, 79, 55, 9, 1, -114, -26, 118, -72, 79, 55, 8, 15, -109, -9, 97, -28, 54, 19, 48, 56, -71, -37, 73, -103, 56, 4, 42, 56, -92, -48, 89, -100}, new byte[]{-110, 19, -54, 97, 84, 100, 96, -3});
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(strOooO00o);
        }
        if (i == 1598968902) {
            parcel2.writeString(strOooO00o);
            return true;
        }
        int i3 = 0;
        switch (i) {
            case 1:
                ((yw1) this).o000OOo0(parcel.readStrongBinder());
                parcel2.writeNoException();
                return true;
            case 2:
                Uri uri = (Uri) kt2.OooO00o(parcel, Uri.CREATOR);
                boolean z = parcel.readInt() != 0;
                IBinder strongBinder = parcel.readStrongBinder();
                int i4 = parcel.readInt();
                parcel.readInt();
                ((yw1) this).o000ooOO(uri, z, strongBinder, i4);
                parcel2.writeNoException();
                return true;
            case 3:
                Uri uri2 = (Uri) kt2.OooO00o(parcel, Uri.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                boolean z2 = parcel.readInt() != 0;
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readInt();
                ((yw1) this).Oooo0OO(uri2, strongBinder2, z2, i5, i6);
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.readString();
                yw1 yw1Var = (yw1) this;
                ContentResolver.validateSyncExtrasBundle((Bundle) kt2.OooO00o(parcel, Bundle.CREATOR));
                t53.OooO0O0();
                t53.OooO00o();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    yw1Var.o00O000o();
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    parcel2.writeNoException();
                    return true;
                } finally {
                }
            case 5:
                t53.OooO0O0();
                parcel2.writeNoException();
                return true;
            case 6:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                ComponentName componentName = (ComponentName) kt2.OooO00o(parcel, ComponentName.CREATOR);
                t53.OooO0O0();
                ((yw1) this).o000oooo(string, componentName);
                parcel2.writeNoException();
                return true;
            case 8:
                String string2 = parcel.readString();
                ComponentName componentName2 = (ComponentName) kt2.OooO00o(parcel, ComponentName.CREATOR);
                parcel.readInt();
                ((yw1) this).o000oooo(string2, componentName2);
                parcel2.writeNoException();
                return true;
            case 9:
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zO00O000 = ((yw1) this).o00O000(t53.OooO0O0(), (Account) kt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO00O000 ? 1 : 0);
                return true;
            case 11:
                boolean zO00O0002 = ((yw1) this).o00O000(parcel.readInt(), (Account) kt2.OooO00o(parcel, Account.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(zO00O0002 ? 1 : 0);
                return true;
            case 12:
                ((yw1) this).o00O00Oo(t53.OooO0O0(), (Account) kt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 13:
                ((yw1) this).o00O00Oo(parcel.readInt(), (Account) kt2.OooO00o(parcel, Account.CREATOR), parcel.readString(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 14:
                Account account = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string3 = parcel.readString();
                yw1 yw1Var2 = (yw1) this;
                if (account == null) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-113, -9, -7, 23, 79, 101, -75, -10, -93, -31, -23, 12, 26, 101, -82, -94, -18, -10, -1, 88, 84, 126, -83, -70}, new byte[]{-50, -108, -102, 120, 58, 11, -63, -42}));
                    return false;
                }
                if (TextUtils.isEmpty(string3)) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-92, -8, 3, 52, 51, -100, -107, 22, -100, -83, 26, 41, 47, -102, -36, 12, -118, -7, 87, 62, 57, -50, -103, 15, -107, -7, 14}, new byte[]{-27, -115, 119, 92, 92, -18, -4, 98}));
                    return false;
                }
                yw1Var2.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{44, -1, -68, 67, -65, -106, 112, -128, 61, -12, -86, 92, -71, -116, 103, -57, 34, -1, -10, 99, -107, -66, 80, -15, 30, -56, -106, 114, -113, -84, 81, -6, 25, -40, -106, 118, -125}, new byte[]{77, -111, -40, 49, -48, -1, 20, -82}), u7.OooO00o(new byte[]{49, 14, -115, -23, 12, 85, 59, -62, 44, 18, -60, -10, 7, 7, 34, -60, 127, 19, -56, -8, 13, 7, 34, -61, 58, 65, -34, -32, 7, 68, 118, -40, 58, 21, -39, -16, 7, 64, 37}, new byte[]{95, 97, -83, -103, 105, 39, 86, -85}));
                t53.OooO0O0();
                long jClearCallingIdentity2 = Binder.clearCallingIdentity();
                try {
                    yw1Var2.o00O000o().getClass();
                    ArrayList arrayList = new ArrayList();
                    Binder.restoreCallingIdentity(jClearCallingIdentity2);
                    parcel2.writeNoException();
                    kt2.OooO0O0(parcel2, arrayList);
                    return true;
                } finally {
                }
            case 15:
                Account account2 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string4 = parcel.readString();
                ((yw1) this).o0000o0O(account2, string4, parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 16:
                Account account3 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string5 = parcel.readString();
                yw1 yw1Var3 = (yw1) this;
                if (account3 == null) {
                    ra.OooOOO(u7.OooO00o(new byte[]{91, -86, -57, 39, -62, 29, -30, -124, 119, -68, -41, 60, -105, 29, -7, -48, 58, -85, -63, 104, -39, 6, -6, -56}, new byte[]{26, -55, -92, 72, -73, 115, -106, -92}));
                    return false;
                }
                if (TextUtils.isEmpty(string5)) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-62, 67, -32, 48, -21, -95, 31, -24, -6, 22, -7, 45, -9, -89, 86, -14, -20, 66, -76, 58, -31, -13, 19, -15, -13, 66, -19}, new byte[]{-125, 54, -108, 88, -124, -45, 118, -100}));
                    return false;
                }
                yw1Var3.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-85, 11, -74, -59, 51, -29, -94, -13, -70, 0, -96, -38, 53, -7, -75, -76, -91, 11, -4, -32, 14, -61, -110, -104, -107, 54, -117, -7, 31, -43, -107, -104, -98, 49, -101, -7, 27, -39}, new byte[]{-54, 101, -46, -73, 92, -118, -58, -35}), u7.OooO00o(new byte[]{121, -57, -73, 31, -123, 62, 11, 47, 100, -37, -2, 0, -114, 108, 18, 41, 55, -33, -27, 6, -108, 41, 70, 50, 127, -51, -73, 28, -103, 34, 5, 102, 100, -51, -29, 27, -119, 34, 1, 53}, new byte[]{23, -88, -105, 111, -32, 76, 102, 70}));
                t53.OooO00o();
                t53.OooO0O0();
                long jClearCallingIdentity3 = Binder.clearCallingIdentity();
                try {
                    vk1 vk1VarO00O000o = yw1Var3.o00O000o();
                    u7.OooO00o(new byte[]{5, -105, -113, 36, 83, 46, -60, -93, 5, -101, -115, 47, 76, 40, -57, -65, 25, -111, -54, 98, 5, 41, -19, -26, 2, -101, -122, 118}, new byte[]{119, -14, -30, 75, 37, 75, -108, -58});
                    vk1VarO00O000o.getClass();
                    Binder.restoreCallingIdentity(jClearCallingIdentity3);
                    parcel2.writeNoException();
                    return true;
                } finally {
                }
            case 17:
                parcel.readString();
                t53.OooO0O0();
                int iO0O0ooO = ((yw1) this).o0O0ooO();
                parcel2.writeNoException();
                parcel2.writeInt(iO0O0ooO);
                return true;
            case 18:
                parcel.readString();
                parcel.readInt();
                int iO0O0ooO2 = ((yw1) this).o0O0ooO();
                parcel2.writeNoException();
                parcel2.writeInt(iO0O0ooO2);
                return true;
            case 19:
                Account account4 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string6 = parcel.readString();
                int i7 = parcel.readInt();
                yw1 yw1Var4 = (yw1) this;
                if (TextUtils.isEmpty(string6)) {
                    ra.OooOOO(u7.OooO00o(new byte[]{-14, 114, 62, 13, 121, 51, 9, 97, -54, 39, 39, 16, 101, 53, 64, 123, -36, 115, 106, 7, 115, 97, 5, 120, -61, 115, 51}, new byte[]{-77, 7, 74, 101, 22, 65, 96, 21}));
                    return false;
                }
                yw1Var4.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-94, 15, -112, 93, 114, 30, -108, -65, -77, 4, -122, 66, 116, 4, -125, -8, -84, 15, -38, 120, 79, 62, -92, -44, -100, 50, -83, 97, 94, 40, -93, -44, -105, 53, -67, 97, 90, 36}, new byte[]{-61, 97, -12, 47, 29, 119, -16, -111}), u7.OooO00o(new byte[]{20, 95, 4, -26, -36, 11, -4, -55, 9, 67, 77, -7, -41, 89, -27, -49, 90, 71, 86, -1, -51, 28, -79, -44, 18, 85, 4, -27, -64, 23, -14, -128, 9, 85, 80, -30, -48, 23, -10, -45}, new byte[]{122, 48, 36, -106, -71, 121, -111, -96}));
                if (i7 > 0) {
                    i3 = 1;
                } else if (i7 != 0) {
                    i3 = -2;
                }
                int iOooO0O0 = t53.OooO0O0();
                long jClearCallingIdentity4 = Binder.clearCallingIdentity();
                try {
                    vk1 vk1VarO00O000o2 = yw1Var4.o00O000o();
                    if (vk1VarO00O000o2 != null) {
                        ((zk1) vk1VarO00O000o2.OooO0o0).OooOOOo(iOooO0O0, i3, account4, string6);
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity4);
                    parcel2.writeNoException();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            case 20:
                ((yw1) this).o00O00OO(t53.OooO0O0(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case zzbcj.zzt.zzm /* 21 */:
                ((yw1) this).o00O00OO(parcel.readInt(), parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zO00oOoo = ((yw1) this).o00oOoo(t53.OooO0O0());
                parcel2.writeNoException();
                parcel2.writeInt(zO00oOoo ? 1 : 0);
                return true;
            case 23:
                boolean zO00oOoo2 = ((yw1) this).o00oOoo(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(zO00oOoo2 ? 1 : 0);
                return true;
            case 24:
                ArrayList arrayListO00O0000 = ((yw1) this).o00O0000(t53.OooO0O0());
                parcel2.writeNoException();
                kt2.OooO0O0(parcel2, arrayListO00O0000);
                return true;
            case 25:
                ArrayList arrayListO00O00002 = ((yw1) this).o00O0000(parcel.readInt());
                parcel2.writeNoException();
                kt2.OooO0O0(parcel2, arrayListO00O00002);
                return true;
            case 26:
                yw1 yw1Var5 = (yw1) this;
                t53.OooO0O0();
                long jClearCallingIdentity5 = Binder.clearCallingIdentity();
                try {
                    yw1Var5.o00O000o().getClass();
                    SyncAdapterType[] syncAdapterTypeArr = new SyncAdapterType[0];
                    Binder.restoreCallingIdentity(jClearCallingIdentity5);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(syncAdapterTypeArr, 1);
                    return true;
                } finally {
                }
            case 27:
                parcel.readInt();
                yw1 yw1Var6 = (yw1) this;
                long jClearCallingIdentity6 = Binder.clearCallingIdentity();
                try {
                    yw1Var6.o00O000o().getClass();
                    SyncAdapterType[] syncAdapterTypeArr2 = new SyncAdapterType[0];
                    Binder.restoreCallingIdentity(jClearCallingIdentity6);
                    parcel2.writeNoException();
                    parcel2.writeTypedArray(syncAdapterTypeArr2, 1);
                    return true;
                } finally {
                }
            case 28:
                parcel.readString();
                parcel.readInt();
                yw1 yw1Var7 = (yw1) this;
                long jClearCallingIdentity7 = Binder.clearCallingIdentity();
                try {
                    yw1Var7.o00O000o().getClass();
                    String[] strArr = new String[0];
                    Binder.restoreCallingIdentity(jClearCallingIdentity7);
                    parcel2.writeNoException();
                    parcel2.writeStringArray(strArr);
                    return true;
                } finally {
                }
            case 29:
                Account account5 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string7 = parcel.readString();
                yw1 yw1Var8 = (yw1) this;
                yw1Var8.OooO0o0.enforceCallingOrSelfPermission(u7.OooO00o(new byte[]{-117, -15, 36, 82, 93, -52, -121, 86, -102, -6, 50, 77, 91, -42, -112, 17, -123, -15, 110, 114, 119, -28, -89, 39, -71, -58, 14, 99, 109, -10, -73, 57, -66, -52}, new byte[]{-22, -97, 64, 32, 50, -91, -29, 120}), u7.OooO00o(new byte[]{-85, -86, 127, 92, -64, 23, -49, -39, -74, -74, 54, 67, -53, 69, -42, -33, -27, -73, 58, 77, -63, 69, -42, -40, -96, -27, 44, 85, -53, 6, -126, -61, -79, -92, 43, 95}, new byte[]{-59, -59, 95, 44, -91, 101, -94, -80}));
                int iOooO0O02 = t53.OooO0O0();
                long jClearCallingIdentity8 = Binder.clearCallingIdentity();
                try {
                    vk1 vk1VarO00O000o3 = yw1Var8.o00O000o();
                    int iOooO0oO = vk1VarO00O000o3 != null ? ((zk1) vk1VarO00O000o3.OooO0o0).OooO0oO(new o00Oo00(account5, string7, iOooO0O02, 5)) : 0;
                    parcel2.writeNoException();
                    parcel2.writeInt(iOooO0oO);
                    return true;
                } finally {
                }
            case 30:
                Account account6 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string8 = parcel.readString();
                SyncStatusInfo syncStatusInfoO00O00 = ((yw1) this).o00O00(t53.OooO0O0(), account6, string8);
                parcel2.writeNoException();
                kt2.OooO0OO(parcel2, syncStatusInfoO00O00, 1);
                return true;
            case 31:
                Account account7 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string9 = parcel.readString();
                SyncStatusInfo syncStatusInfoO00O002 = ((yw1) this).o00O00(parcel.readInt(), account7, string9);
                parcel2.writeNoException();
                kt2.OooO0OO(parcel2, syncStatusInfoO00O002, 1);
                return true;
            case 32:
                Account account8 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string10 = parcel.readString();
                boolean zOOO00O = ((yw1) this).oOO00O(t53.OooO0O0(), account8, string10);
                parcel2.writeNoException();
                parcel2.writeInt(zOOO00O ? 1 : 0);
                return true;
            case 33:
                Account account9 = (Account) kt2.OooO00o(parcel, Account.CREATOR);
                String string11 = parcel.readString();
                boolean zOOO00O2 = ((yw1) this).oOO00O(parcel.readInt(), account9, string11);
                parcel2.writeNoException();
                parcel2.writeInt(zOOO00O2 ? 1 : 0);
                return true;
            case 34:
                int i8 = parcel.readInt();
                yw1 yw1Var9 = (yw1) this;
                ISyncStatusObserver iSyncStatusObserverAsInterface = ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder());
                long jClearCallingIdentity9 = Binder.clearCallingIdentity();
                try {
                    vk1 vk1VarO00O000o4 = yw1Var9.o00O000o();
                    if (vk1VarO00O000o4 != null && iSyncStatusObserverAsInterface != null) {
                        zk1 zk1Var = (zk1) vk1VarO00O000o4.OooO0o0;
                        synchronized (zk1Var.OooO00o) {
                            zk1Var.OooO0o0.register(iSyncStatusObserverAsInterface, Integer.valueOf(i8));
                        }
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity9);
                    parcel2.writeNoException();
                    return true;
                } finally {
                }
            case 35:
                yw1 yw1Var10 = (yw1) this;
                ISyncStatusObserver iSyncStatusObserverAsInterface2 = ISyncStatusObserver.Stub.asInterface(parcel.readStrongBinder());
                long jClearCallingIdentity10 = Binder.clearCallingIdentity();
                try {
                    vk1 vk1VarO00O000o5 = yw1Var10.o00O000o();
                    if (vk1VarO00O000o5 != null && iSyncStatusObserverAsInterface2 != null) {
                        zk1 zk1Var2 = (zk1) vk1VarO00O000o5.OooO0o0;
                        synchronized (zk1Var2.OooO00o) {
                            zk1Var2.OooO0o0.unregister(iSyncStatusObserverAsInterface2);
                        }
                    }
                    Binder.restoreCallingIdentity(jClearCallingIdentity10);
                    parcel2.writeNoException();
                    return true;
                } finally {
                }
            case 36:
                String string12 = parcel.readString();
                Uri uri3 = (Uri) kt2.OooO00o(parcel, Uri.CREATOR);
                Bundle bundle2 = (Bundle) kt2.OooO00o(parcel, Bundle.CREATOR);
                int i9 = parcel.readInt();
                yw1 yw1Var11 = (yw1) this;
                ((AppOpsManager) yw1Var11.OooO0o0.getSystemService(AppOpsManager.class)).checkPackage(t53.OooO00o(), string12);
                ProviderInfo providerInfoO000o0Oo = ox1.o0O0ooO().o000o0Oo(0, i9, null, uri3.getAuthority());
                str = providerInfoO000o0Oo != null ? providerInfoO000o0Oo.packageName : null;
                Pair pairCreate = Pair.create(string12, uri3);
                synchronized (yw1Var11.OooOO0O) {
                    try {
                        ArrayMap arrayMapO00 = yw1Var11.o00(i9, str);
                        if (bundle2 != null) {
                            arrayMapO00.put(pairCreate, bundle2);
                        } else {
                            arrayMapO00.remove(pairCreate);
                        }
                    } finally {
                    }
                }
                parcel2.writeNoException();
                return true;
            case 37:
                String string13 = parcel.readString();
                Uri uri4 = (Uri) kt2.OooO00o(parcel, Uri.CREATOR);
                int i10 = parcel.readInt();
                yw1 yw1Var12 = (yw1) this;
                ((AppOpsManager) yw1Var12.OooO0o0.getSystemService(AppOpsManager.class)).checkPackage(t53.OooO00o(), string13);
                ProviderInfo providerInfoO000o0Oo2 = ox1.o0O0ooO().o000o0Oo(0, i10, null, uri4.getAuthority());
                str = providerInfoO000o0Oo2 != null ? providerInfoO000o0Oo2.packageName : null;
                Pair pairCreate2 = Pair.create(string13, uri4);
                synchronized (yw1Var12.OooOO0O) {
                    bundle = (Bundle) yw1Var12.o00(i10, str).get(pairCreate2);
                }
                parcel2.writeNoException();
                kt2.OooO0OO(parcel2, bundle, 1);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}

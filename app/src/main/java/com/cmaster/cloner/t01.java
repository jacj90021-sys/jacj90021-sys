package com.cmaster.cloner;

import android.content.Context;
import android.content.IntentSender;
import android.content.pm.Checksum;
import android.content.pm.DataLoaderParamsParcel;
import android.content.pm.IPackageInstallerSession;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.SparseIntArray;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class t01 extends IPackageInstallerSession.Stub {
    public static final String Oooo;
    public static final String Oooo0O0;
    public static final String Oooo0OO;
    public static final String Oooo0o;
    public static final String Oooo0o0;
    public static final String Oooo0oO;
    public static final String Oooo0oo;
    public static final String OoooO;
    public static final String OoooO0;
    public static final String OoooO00;
    public static final String OoooO0O;
    public static final String OoooOO0;
    public static final String OoooOOO;
    public static final String OoooOOo;
    public static final String OoooOo0;
    public static final String OoooOoO;
    public static final String OoooOoo;
    public static final String Ooooo00;
    public static final String Ooooo0o;
    public static final String OooooO0;
    public static final String OooooOO;
    public static final String OooooOo;
    public static final String Oooooo;
    public static final String Oooooo0;
    public static final String OoooooO;
    public static final String Ooooooo;
    public static final String o000oOoO;
    public static final String o00O0O;
    public static final String o00Oo0;
    public static final String o00Ooo;
    public static final String o00o0O;
    public static final int[] o00ooo;
    public static final String o0OoOo0;
    public static final r01 oo000o;
    public static final String ooOO;
    public final int OooO;
    public final xb1 OooO0Oo;
    public final Handler OooO0o;
    public final Context OooO0o0;
    public final ox1 OooO0oO;
    public final int OooO0oo;
    public final int OooOO0;
    public final PackageInstaller.SessionParams OooOO0O;
    public final String OooOO0o;
    public final boolean OooOOO0;
    public int OooOOOO;
    public final o01 OooOOOo;
    public final long OooOOo;
    public final long OooOOo0;
    public final File OooOOoo;
    public boolean OooOoO;
    public boolean OooOoo;
    public k01 OooOooO;
    public File Oooo000;
    public String Oooo00O;
    public File Oooo00o;
    public final SparseIntArray OooOOO = new SparseIntArray();
    public final AtomicInteger OooOo00 = new AtomicInteger();
    public final Object OooOo0 = new Object();
    public float OooOo0O = 0.0f;
    public float OooOo0o = 0.0f;
    public float OooOo = 0.0f;
    public float OooOoO0 = -1.0f;
    public boolean OooOoOO = false;
    public boolean OooOoo0 = false;
    public final ArrayList OooOooo = new ArrayList();
    public final ArrayList Oooo0 = new ArrayList();

    public t01(xb1 xb1Var, Context context, ox1 ox1Var, o01 o01Var, Looper looper, int i, int i2, String str, int i3, PackageInstaller.SessionParams sessionParams, long j, File file, boolean z, boolean z2, int[] iArr, int i4) {
        this.OooOOO0 = false;
        this.OooOOOO = -1;
        this.OooOoO = false;
        this.OooOoo = false;
        c50 c50Var = new c50(this, 1);
        this.OooO0Oo = xb1Var;
        this.OooO0o0 = context;
        this.OooO0o = new Handler(looper, c50Var);
        this.OooO0oO = ox1Var;
        this.OooOO0o = str;
        this.OooO0oo = i;
        this.OooO = i2;
        this.OooOO0 = i3;
        this.OooOO0O = sessionParams;
        l81 l81Var = m01.OooO0o;
        this.Oooo00O = l81Var != null ? (String) l81Var.OooO0O0(sessionParams) : null;
        this.OooOOO0 = m01.OooO00o(sessionParams);
        this.OooOOoo = file;
        this.OooOOOo = o01Var;
        this.OooOOo = j;
        this.OooOOo0 = j;
        if (iArr != null) {
            for (int i5 : iArr) {
                this.OooOOO.put(i5, 0);
            }
        }
        this.OooOOOO = i4;
        this.OooOoO = z;
        this.OooOoo = z2;
    }

    public static native void o0000o0O(t01 t01Var);

    public static native boolean o00O00o(String str);

    public static native t01 o00O0O0O(XmlPullParser xmlPullParser, xb1 xb1Var, Context context, ox1 ox1Var, Looper looper, File file, o01 o01Var);

    public static native String o00O0OO(PackageManager packageManager, File file);

    public static native void o00O0OOo(ParcelFileDescriptor[] parcelFileDescriptorArr, File file);

    public static native File o0O0ooO(File file, int i);

    public final native void abandon();

    public final native void addChildSessionId(int i);

    public final native void addClientProgress(float f);

    public final native void addFile(int i, String str, long j, byte[] bArr, byte[] bArr2);

    public final native void close();

    public final native void commit(IntentSender intentSender);

    public final native void commit(IntentSender intentSender, boolean z);

    public final native List fetchPackageNames();

    public final native ParcelFileDescriptor getAppMetadataFd();

    public final native int[] getChildSessionIds();

    public final native DataLoaderParamsParcel getDataLoaderParams();

    public final native int getInstallFlags();

    public final native String[] getNames();

    public final native int getParentSessionId();

    public final native boolean isApplicationEnabledSettingPersistent();

    public final native boolean isMultiPackage();

    public final native boolean isRequestUpdateOwnership();

    public final native boolean isStaged();

    public final native void o00(String str);

    public final native void o000oooo(String str);

    public final native ParcelFileDescriptor o00O0(String str);

    public final native void o00O00();

    public final native void o00O000(boolean z);

    public final native void o00O0000(String str);

    public final native void o00O000o(String str);

    public final native void o00O00O(int i, String str);

    public final native ArrayList o00O00OO();

    public final native File o00O00Oo();

    public final native void o00O00o0();

    public final native void o00O00oO(IntentSender intentSender);

    public final native ParcelFileDescriptor o00O0O0(String str, long j, long j2);

    public final native ParcelFileDescriptor o00O0O00(String str);

    public final native File o00O0O0o();

    public final native void o00O0OO0(int i);

    public final native void o00O0OOO(gz gzVar, File file);

    public final native void o00oOoo();

    public final native PackageInstaller.SessionInfo oOO00O(boolean z);

    public final native void oo00o();

    public final native void oo0o0O0(boolean z);

    public final native ParcelFileDescriptor openRead(String str);

    public final native ParcelFileDescriptor openWrite(String str, long j, long j2);

    public final native ParcelFileDescriptor openWriteAppMetadata();

    public final native void removeAppMetadata();

    public final native void removeChildSessionId(int i);

    public final native void removeFile(int i, String str);

    public final native void removeSplit(String str);

    public final native void setChecksums(String str, Checksum[] checksumArr, byte[] bArr);

    public final native void setClientProgress(float f);

    public final native String toString();

    static {
        DexUtils.classesInit0(15);
        u7.OooO00o(new byte[]{-92, 5, -17, -60, 69, 93, 94, -126, -102, 23, -8, -50, 72, 86, 94, -71}, new byte[]{-12, 100, -116, -81, 36, 58, 59, -53});
        Oooo0O0 = u7.OooO00o(new byte[]{-48, -85, -27, -1, 10, 63, -64, -78}, new byte[]{-2, -39, -128, -110, 101, 73, -91, -42});
        Oooo0OO = u7.OooO00o(new byte[]{56, 4, -20}, new byte[]{22, 96, -127, -28, -113, 55, 47, 103});
        u7.OooO00o(new byte[]{-18, -54, -99, 94, -36, -78, -78, 10, -95}, new byte[]{-64, -89, -8, 42, -67, -42, -45, 126});
        Oooo0o0 = u7.OooO00o(new byte[]{19, 25, 123, 76, -115, -62, 96}, new byte[]{96, 124, 8, 63, -28, -83, 14, -64});
        Oooo0o = u7.OooO00o(new byte[]{-58, 21, -55, 96, 24, 84, 2, -103, -42, 20, -49, 98}, new byte[]{-91, 125, -96, 12, 124, 7, 103, -22});
        Oooo0oO = u7.OooO00o(new byte[]{35, 55, 104, 69, -8, 67, -72, -83, 54, 48, 103, 95, -27, 75, -71, -83, 52, 32, 123, 70, -27, 85, -81, -23, 43, 43}, new byte[]{68, 69, 9, 43, -116, 38, -36, -128});
        Oooo0oo = u7.OooO00o(new byte[]{116, 75, -11, 6, 55, 44, -33, -38, 119, 70, -8, 95, 32, 37, -59, -35, 113, 74, -1, 6, 55, 36, -101, -39, 102, 81, -15, 27, 33, 51, -33, -58, 109}, new byte[]{3, 35, -100, 114, 82, 64, -74, -87});
        Oooo = u7.OooO00o(new byte[]{49, 117, 6, 117, -96, 96, -127, -52, 38}, new byte[]{66, 16, 117, 6, -55, 15, -17, -123});
        OoooO00 = u7.OooO00o(new byte[]{35, -73, 114, 105, 59, -79}, new byte[]{86, -60, 23, 27, 114, -43, -71, -87});
        OoooO0 = u7.OooO00o(new byte[]{12, 83, 110, -60, 50, -75, -97, 74, 23, 109, 124, -45, 56, -72, -108, 74, 43, 92, 112, -43}, new byte[]{101, 61, 29, -80, 83, -39, -13, 47});
        OoooO0O = u7.OooO00o(new byte[]{25, -66, -20, -8, 122, 56, -101, -41, 2, -123, -10, -24}, new byte[]{112, -48, -97, -116, 27, 84, -9, -78});
        OoooO = u7.OooO00o(new byte[]{-103, -8, 18, -2, -79, -25, -73, -77, -109, -26, 27, -10, -74}, new byte[]{-6, -118, 119, -97, -59, -126, -45, -2});
        OoooOO0 = u7.OooO00o(new byte[]{43, 43, -30, -19, -64, 127, -16, -54, 55, 55, -22, -27, -57}, new byte[]{94, 91, -122, -116, -76, 26, -108, -121});
        o000oOoO = u7.OooO00o(new byte[]{-107, 23, 102, 48, 101, 115, 45, -112, -110, 19, 114, 38, 72, 117, 49}, new byte[]{-26, 114, 21, 67, 12, 28, 67, -61});
        u7.OooO00o(new byte[]{-102, 67, -70, -9, -105, 13, -113, 47, -99, 71, -82, -31, -67, 11, -123}, new byte[]{-23, 38, -55, -124, -2, 98, -31, 124});
        OoooOOO = u7.OooO00o(new byte[]{9, 1, -54, 23, -68, -114, -102, -39}, new byte[]{121, 115, -81, 103, -35, -4, -1, -67});
        OoooOOo = u7.OooO00o(new byte[]{-127, 93, 36, 88, 63, 107, 21, 88, -122}, new byte[]{-30, 50, 73, 53, 86, 31, 97, 61});
        OoooOo0 = u7.OooO00o(new byte[]{-111, -96, 110, 32, 32, -107}, new byte[]{-30, -59, 15, 76, 69, -15, -15, 72});
        OoooOoO = u7.OooO00o(new byte[]{-88, -42, 18, 27, -79, 80, 47, -96, -82, -62, 25, 10}, new byte[]{-59, -93, 126, 111, -40, 0, 78, -61});
        OoooOoo = u7.OooO00o(new byte[]{17, -42, 70, 127, -5, 59, 111, 13, 18, -60, 93, 117, -5, 6, 88}, new byte[]{97, -73, 52, 26, -107, 79, 60, 104});
        Ooooo00 = u7.OooO00o(new byte[]{108, 9, -21, 104, -63, 101, -56, -55, 108, 14, -29, 96, -54}, new byte[]{31, 125, -118, 15, -92, 1, -101, -84});
        u7.OooO00o(new byte[]{-66, 20, 105, -46, -65, -36, -56}, new byte[]{-41, 103, 59, -73, -34, -72, -79, -69});
        u7.OooO00o(new byte[]{-49, 52, 15, 70, -24, 36, 104, 88}, new byte[]{-90, 71, 73, 39, -127, 72, 13, 60});
        u7.OooO00o(new byte[]{-91, -112, -108, -99, -108, -86, -33, -55, -88}, new byte[]{-52, -29, -43, -19, -28, -58, -74, -84});
        u7.OooO00o(new byte[]{-53, 123, 17, 35, -60, -90, -17, -55, -53}, new byte[]{-82, 9, 99, 76, -74, -27, -128, -83});
        u7.OooO00o(new byte[]{11, -56, -69, -31, -44, -73, -72, -9, 29, -37, -82, -21}, new byte[]{110, -70, -55, -114, -90, -6, -35, -124});
        Ooooo0o = u7.OooO00o(new byte[]{-63, 20, -54, 83}, new byte[]{-84, 123, -82, 54, -2, 63, 110, 11});
        OooooO0 = u7.OooO00o(new byte[]{-60, -64, -30, 27, -50, 5, -122, 79, -63, -49, -10, 28}, new byte[]{-83, -82, -111, 111, -81, 105, -22, 9});
        OooooOO = u7.OooO00o(new byte[]{-124, 124, 61, -62, -118, 6, 93, -121, -126, 113, 47, -62, -126, 5, 95}, new byte[]{-19, 18, 78, -74, -21, 106, 49, -53});
        OooooOo = u7.OooO00o(new byte[]{-14, -81, 65, 118, 124, 25, 85, 43, -14}, new byte[]{-127, -58, 59, 19, 62, 96, 33, 78});
        Oooooo0 = u7.OooO00o(new byte[]{-64, -90, 58, -30, -72, -33, -84, 106, -58, -77, 4, -45, -76, -39}, new byte[]{-95, -42, 74, -78, -39, -68, -57, 11});
        Oooooo = u7.OooO00o(new byte[]{53, -47, 74, 49, 86, 8, 100}, new byte[]{84, -95, 58, 120, 53, 103, 10, 89});
        OoooooO = u7.OooO00o(new byte[]{-52, 90, 44, -26, -85, 90, -104, -34}, new byte[]{-83, 42, 92, -86, -54, 56, -3, -78});
        Ooooooo = u7.OooO00o(new byte[]{-37, 108, 85, 99, -14, 97, -7, -5, -35, 112, 91, 81, -23, 102}, new byte[]{-76, 30, 60, 4, -101, 15, -104, -113});
        o0OoOo0 = u7.OooO00o(new byte[]{82, -17, -27, -96, -95, 77, 112, 97, 84, -13, -21, -110, -95, 71}, new byte[]{61, -99, -116, -57, -56, 35, 17, 21});
        ooOO = u7.OooO00o(new byte[]{110, 36, -56, 67, -119, 93, 40, -35, 73, 51, -57}, new byte[]{28, 65, -82, 38, -5, 47, 77, -81});
        o00O0O = u7.OooO00o(new byte[]{-119, -126, -100, -93, 84, 29, -87, -100, -127, -124, -112}, new byte[]{-24, -32, -11, -20, 34, 120, -37, -18});
        o00Oo0 = u7.OooO00o(new byte[]{-6, 46, -25, -93, -108, 70, -123, -99, -27, 37}, new byte[]{-116, 65, -117, -42, -7, 35, -48, -24});
        o00Ooo = u7.OooO00o(new byte[]{-126, -117, -120, -11}, new byte[]{-20, -22, -27, -112, -10, 113, 81, 9});
        o00o0O = u7.OooO00o(new byte[]{16, -75, -35, -123, 38, -14, -42, -37, 24, -88, -63, -97}, new byte[]{121, -37, -82, -15, 71, -98, -70, -119});
        o00ooo = new int[0];
        oo000o = new r01();
    }
}

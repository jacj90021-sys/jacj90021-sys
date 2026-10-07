package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class fu {
    public static Boolean OooO0Oo = null;
    public static boolean OooO0o = false;
    public static String OooO0o0 = null;
    public static int OooO0oO = -1;
    public static Boolean OooO0oo;
    public static a53 OooOO0o;
    public static z53 OooOOO0;
    public final Context OooO00o;
    public static final ThreadLocal OooO = new ThreadLocal();
    public static final vy OooOO0 = new vy(2);
    public static final v03 OooOO0O = new v03();
    public static final oOO0OO OooO0O0 = new oOO0OO();
    public static final s60 OooO0OO = new s60();

    public fu(Context context) {
        this.OooO00o = context;
    }

    public static int OooO00o(Context context, String str) {
        try {
            Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = clsLoadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_VERSION");
            if (uw2.OooO00o(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091 A[Catch: all -> 0x0085, TRY_LEAVE, TryCatch #4 {all -> 0x0085, blocks: (B:7:0x004b, B:11:0x007f, B:18:0x008b, B:21:0x0091, B:24:0x00a9, B:102:0x0211, B:103:0x021b, B:106:0x021e, B:107:0x021f, B:108:0x0226, B:125:0x028a, B:126:0x029b, B:109:0x0227, B:111:0x0245, B:113:0x0252, B:123:0x0282, B:124:0x0289, B:127:0x029c, B:128:0x02c8), top: B:147:0x004b, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.cmaster.cloner.fu OooO0OO(android.content.Context r22, com.cmaster.cloner.eu r23, java.lang.String r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.fu.OooO0OO(android.content.Context, com.cmaster.cloner.eu, java.lang.String):com.cmaster.cloner.fu");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0191 A[Catch: all -> 0x00eb, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x00eb, blocks: (B:3:0x0002, B:63:0x00e0, B:65:0x00e6, B:72:0x010a, B:102:0x0191, B:110:0x01a4, B:128:0x0223, B:129:0x0226, B:123:0x021b, B:70:0x00ef, B:131:0x0228, B:4:0x0003, B:7:0x000a, B:8:0x0026, B:61:0x00dd, B:21:0x004a, B:44:0x00a0, B:47:0x00a3, B:54:0x00bb, B:62:0x00df, B:60:0x00c1), top: B:139:0x0002, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af A[Catch: all -> 0x0037, TryCatch #8 {, blocks: (B:9:0x0027, B:11:0x0033, B:51:0x00b8, B:16:0x003c, B:18:0x0043, B:20:0x0049, B:25:0x004f, B:27:0x0053, B:30:0x005c, B:32:0x0064, B:35:0x006b, B:42:0x0097, B:43:0x009f, B:38:0x0072, B:40:0x0078, B:41:0x0089, B:46:0x00a2, B:49:0x00a5, B:50:0x00af, B:17:0x003f), top: B:141:0x0027, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO0Oo(android.content.Context r11, java.lang.String r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.fu.OooO0Oo(android.content.Context, java.lang.String, boolean):int");
    }

    public static void OooO0o(ClassLoader classLoader) throws bu {
        try {
            z53 z53Var = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                z53Var = iInterfaceQueryLocalInterface instanceof z53 ? (z53) iInterfaceQueryLocalInterface : new z53(1, iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
            }
            OooOOO0 = z53Var;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            throw new bu("Failed to instantiate dynamite loader", e);
        }
    }

    public static int OooO0o0(Context context, String str, boolean z, boolean z2) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z3;
        try {
            try {
                boolean z4 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartTime", String.valueOf(((Long) OooOO0.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z5 = false;
                            int i = cursorQuery.getInt(0);
                            if (i > 0) {
                                synchronized (fu.class) {
                                    try {
                                        OooO0o0 = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            OooO0oO = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z3 = cursorQuery.getInt(columnIndex2) != 0;
                                            OooO0o = z3;
                                        } else {
                                            z3 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                f13 f13Var = (f13) OooO.get();
                                if (f13Var == null || f13Var.OooO00o != null) {
                                    z4 = false;
                                } else {
                                    f13Var.OooO00o = cursorQuery;
                                }
                                cursor = z4 ? null : cursorQuery;
                                z5 = z3;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z2 && z5) {
                                throw new bu("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i;
                        }
                    } catch (Exception e) {
                        exc = e;
                        if (exc instanceof bu) {
                            throw exc;
                        }
                        throw new bu("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new bu("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e2) {
                exc = e2;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static boolean OooO0oO(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(OooO0oo)) {
            return true;
        }
        boolean z = false;
        if (OooO0oo == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (e60.OooO0O0.OooO0OO(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            OooO0oo = Boolean.valueOf(z);
            if (z && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                OooO0o = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public static a53 OooO0oo(Context context) {
        a53 a53Var;
        synchronized (fu.class) {
            a53 a53Var2 = OooOO0o;
            if (a53Var2 != null) {
                return a53Var2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    a53Var = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    a53Var = iInterfaceQueryLocalInterface instanceof a53 ? (a53) iInterfaceQueryLocalInterface : new a53(1, iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
                }
                if (a53Var != null) {
                    OooOO0o = a53Var;
                    return a53Var;
                }
            } catch (Exception e) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e.getMessage());
            }
            return null;
        }
    }

    public final IBinder OooO0O0(String str) throws bu {
        try {
            return (IBinder) this.OooO00o.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new bu("Failed to instantiate module class: ".concat(str), e);
        }
    }
}

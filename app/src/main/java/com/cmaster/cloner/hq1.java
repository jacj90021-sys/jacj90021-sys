package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class hq1 extends f53 {
    public static Class OooO00o;
    public static Constructor OooO0O0;
    public static Method OooO0OO;
    public static Method OooO0Oo;
    public static boolean OooO0o0;

    public static boolean OooO0o(Object obj, String str, int i, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        OooO0oO();
        try {
            return ((Boolean) OooO0OO.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            sa.OooOO0(e);
            return false;
        }
    }

    public static void OooO0oO() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (OooO0o0) {
            return;
        }
        OooO0o0 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        OooO0O0 = constructor;
        OooO00o = cls;
        OooO0OO = method2;
        OooO0Oo = method;
    }

    @Override // com.cmaster.cloner.f53
    public Typeface OooO00o(Context context, z00 z00Var, Resources resources, int i) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        OooO0oO();
        try {
            Object objNewInstance = OooO0O0.newInstance(null);
            for (a10 a10Var : z00Var.OooO00o) {
                File fileOooO0OO = g53.OooO0OO(context);
                if (fileOooO0OO == null) {
                    return null;
                }
                try {
                    if (!g53.OooO00o(fileOooO0OO, resources, a10Var.OooO0o)) {
                        return null;
                    }
                    if (!OooO0o(objNewInstance, fileOooO0OO.getPath(), a10Var.OooO0O0, a10Var.OooO0OO)) {
                        return null;
                    }
                    fileOooO0OO.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileOooO0OO.delete();
                }
            }
            OooO0oO();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) OooO00o, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) OooO0Oo.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                sa.OooOO0(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            sa.OooOO0(e2);
            return null;
        }
    }

    @Override // com.cmaster.cloner.f53
    public Typeface OooO0O0(Context context, c10[] c10VarArr, int i) throws IOException {
        Typeface typefaceCreateFromFile;
        String str;
        if (c10VarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(f53.OooO0o0(c10VarArr, i).OooO00o, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile2 = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile2;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        File fileOooO0OO = g53.OooO0OO(context);
                        if (fileOooO0OO == null) {
                            typefaceCreateFromFile = null;
                        } else {
                            try {
                                if (g53.OooO0O0(fileOooO0OO, fileInputStream)) {
                                    typefaceCreateFromFile = Typeface.createFromFile(fileOooO0OO.getPath());
                                    fileOooO0OO.delete();
                                }
                            } catch (RuntimeException unused2) {
                            } catch (Throwable th) {
                                fileOooO0OO.delete();
                                throw th;
                            }
                            fileOooO0OO.delete();
                            typefaceCreateFromFile = null;
                        }
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused3) {
            }
        }
        return null;
    }
}

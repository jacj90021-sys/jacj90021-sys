package com.cmaster.cloner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class iq1 extends f53 {
    public static final Class OooO00o;
    public static final Constructor OooO0O0;
    public static final Method OooO0OO;
    public static final Method OooO0Oo;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        OooO0O0 = constructor;
        OooO00o = cls;
        OooO0OO = method2;
        OooO0Oo = method;
    }

    public static boolean OooO0o(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) OooO0OO.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface OooO0oO(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) OooO00o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) OooO0Oo.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO00o(Context context, z00 z00Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        FileInputStream fileInputStream;
        try {
            objNewInstance = OooO0O0.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (a10 a10Var : z00Var.OooO00o) {
                int i2 = a10Var.OooO0o;
                File fileOooO0OO = g53.OooO0OO(context);
                if (fileOooO0OO != null) {
                    try {
                        if (g53.OooO00o(fileOooO0OO, resources, i2)) {
                            try {
                                fileInputStream = new FileInputStream(fileOooO0OO);
                            } catch (IOException unused2) {
                                map = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                if (map != null && OooO0o(objNewInstance, map, a10Var.OooO0o0, a10Var.OooO0O0, a10Var.OooO0OO)) {
                                }
                            } finally {
                            }
                        }
                    } finally {
                        fileOooO0OO.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return OooO0oO(objNewInstance);
        }
        return null;
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO0O0(Context context, c10[] c10VarArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = OooO0O0.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i2 = 0;
            gh1 gh1Var = new gh1(0);
            int length = c10VarArr.length;
            while (true) {
                if (i2 < length) {
                    c10 c10Var = c10VarArr[i2];
                    Uri uri = c10Var.OooO00o;
                    ByteBuffer byteBufferOooO0Oo = (ByteBuffer) gh1Var.get(uri);
                    if (byteBufferOooO0Oo == null) {
                        byteBufferOooO0Oo = g53.OooO0Oo(uri, context);
                        gh1Var.put(uri, byteBufferOooO0Oo);
                    }
                    if (byteBufferOooO0Oo == null || !OooO0o(objNewInstance, byteBufferOooO0Oo, c10Var.OooO0O0, c10Var.OooO0OO, c10Var.OooO0Oo)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface typefaceOooO0oO = OooO0oO(objNewInstance);
                    if (typefaceOooO0oO != null) {
                        return Typeface.create(typefaceOooO0oO, i);
                    }
                }
            }
        }
        return null;
    }
}

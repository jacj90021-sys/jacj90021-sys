package com.cmaster.cloner;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class jq1 extends hq1 {
    public final Method OooO;
    public final Class OooO0o;
    public final Constructor OooO0oO;
    public final Method OooO0oo;
    public final Method OooOO0;
    public final Method OooOO0O;
    public final Method OooOO0o;

    public jq1() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodOooOO0o;
        Constructor<?> constructor;
        Method methodOooOO0O;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodOooOO0O = OooOO0O(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodOooOO0o = OooOO0o(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodOooOO0o = null;
            constructor = null;
            methodOooOO0O = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.OooO0o = cls;
        this.OooO0oO = constructor;
        this.OooO0oo = methodOooOO0O;
        this.OooO = method;
        this.OooOO0 = method2;
        this.OooOO0O = method3;
        this.OooOO0o = methodOooOO0o;
    }

    public static Method OooOO0O(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Typeface OooO(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.OooO0o, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.OooOO0o.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // com.cmaster.cloner.hq1, com.cmaster.cloner.f53
    public final Typeface OooO00o(Context context, z00 z00Var, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.OooO0oo;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.OooO00o(context, z00Var, resources, i);
        }
        try {
            objNewInstance = this.OooO0oO.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            a10[] a10VarArr = z00Var.OooO00o;
            int length = a10VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    a10 a10Var = a10VarArr[i2];
                    String str = a10Var.OooO00o;
                    int i3 = a10Var.OooO0o0;
                    int i4 = a10Var.OooO0O0;
                    boolean z = a10Var.OooO0OO;
                    FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(a10Var.OooO0Oo);
                    jq1 jq1Var = this;
                    Context context2 = context;
                    if (jq1Var.OooO0oo(context2, objNewInstance, str, i3, i4, z ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                        i2++;
                        this = jq1Var;
                        context = context2;
                    } else {
                        try {
                            jq1Var.OooOO0O.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    jq1 jq1Var2 = this;
                    if (jq1Var2.OooOO0(objNewInstance)) {
                        return jq1Var2.OooO(objNewInstance);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.cmaster.cloner.hq1, com.cmaster.cloner.f53
    public final Typeface OooO0O0(Context context, c10[] c10VarArr, int i) throws IllegalAccessException, InstantiationException, IOException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Typeface typefaceOooO;
        boolean zBooleanValue;
        if (c10VarArr.length >= 1) {
            Method method = this.OooO0oo;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (c10 c10Var : c10VarArr) {
                        if (c10Var.OooO0o == 0) {
                            Uri uri = c10Var.OooO00o;
                            if (!map.containsKey(uri)) {
                                map.put(uri, g53.OooO0Oo(uri, context));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.OooO0oO.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = c10VarArr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.OooOO0O;
                            if (i2 < length) {
                                c10 c10Var2 = c10VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(c10Var2.OooO00o);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.OooO.invoke(objNewInstance, byteBuffer, Integer.valueOf(c10Var2.OooO0O0), null, Integer.valueOf(c10Var2.OooO0OO), Integer.valueOf(c10Var2.OooO0Oo ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (OooOO0(objNewInstance) && (typefaceOooO = OooO(objNewInstance)) != null) {
                                return Typeface.create(typefaceOooO, i);
                            }
                        }
                    }
                } else {
                    c10 c10VarOooO0o0 = f53.OooO0o0(c10VarArr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(c10VarOooO0o0.OooO00o, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(c10VarOooO0o0.OooO0OO).setItalic(c10VarOooO0o0.OooO0Oo).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // com.cmaster.cloner.f53
    public final Typeface OooO0Oo(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.OooO0oo;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.OooO0Oo(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.OooO0oO.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!OooO0oo(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.OooOO0O.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (OooOO0(objNewInstance)) {
                return OooO(objNewInstance);
            }
        }
        return null;
    }

    public final boolean OooO0oo(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.OooO0oo.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean OooOO0(Object obj) {
        try {
            return ((Boolean) this.OooOO0.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method OooOO0o(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}

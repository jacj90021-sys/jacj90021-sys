package com.cmaster.cloner;

import android.hardware.Camera;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Parcel;
import dalvik.system.DexFile;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class se1 {
    public static final int OooO;
    public static final Method OooO00o;
    public static final int OooO0O0;
    public static final int OooO0OO;
    public static final Method OooO0Oo;
    public static final int OooO0o;
    public static final int OooO0o0;
    public static final Method OooO0oO;
    public static final int OooO0oo;
    public static final Method OooOO0;
    public static final int OooOO0O;
    public static final int OooOO0o;
    public static final int OooOOO;
    public static final Method OooOOO0;
    public static final int OooOOOO;
    public static final Method OooOOOo;
    public static final int OooOOo;
    public static final int OooOOo0;
    public static final Method OooOOoo;
    public static final int OooOo;
    public static final int OooOo0;
    public static final int OooOo00;
    public static final Method OooOo0O;
    public static final int OooOo0o;
    public static final int OooOoO;
    public static final Method OooOoO0;
    public static final int OooOoOO;
    public static final int OooOoo;
    public static final Method OooOoo0;
    public static final int OooOooO;

    static {
        Method[] declaredMethods;
        Method[] declaredMethods2;
        Class<?>[] parameterTypes;
        int i;
        Method[] declaredMethods3 = Camera.class.getDeclaredMethods();
        if (declaredMethods3 != null) {
            int length = declaredMethods3.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                Method method = declaredMethods3[i2];
                if (Modifier.isNative(method.getModifiers()) && u7.OooO00o(new byte[]{55, -95, -85, -42, 11, -19, 49, 90, 60, -76, -86, -49}, new byte[]{89, -64, -33, -65, 125, -120, 110, 41}).equals(method.getName())) {
                    OooO00o = method;
                    break;
                }
                i2++;
            }
        }
        Method method2 = OooO00o;
        if (method2 != null && (parameterTypes = method2.getParameterTypes()) != null) {
            OooO0O0 = 2;
            int i3 = 0;
            while (true) {
                i = -1;
                if (i3 >= parameterTypes.length) {
                    i3 = -1;
                    break;
                } else if (parameterTypes[i3].equals(Parcel.class)) {
                    break;
                } else {
                    i3++;
                }
            }
            OooO0OO = i3;
            if (i3 == -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= parameterTypes.length) {
                        break;
                    }
                    if (parameterTypes[i4].equals(String.class)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
                OooO0OO = i;
                OooO0O0 = 1;
            }
        }
        Method[] declaredMethods4 = DexFile.class.getDeclaredMethods();
        int length2 = declaredMethods4.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            Method method3 = declaredMethods4[i5];
            if (Modifier.isNative(method3.getModifiers()) && u7.OooO00o(new byte[]{-42, -22, -80, 65, -3, -70, -20, 113, -48, -10, -80, 97, -40, -85, -3, 65, -36}, new byte[]{-71, -102, -43, 47, -71, -33, -108, 55}).equals(method3.getName())) {
                OooO0Oo = method3;
                break;
            }
            i5++;
        }
        OooO0o0 = 1;
        OooO0o = OooO0Oo.getParameterTypes().length;
        for (Method method4 : AudioRecord.class.getDeclaredMethods()) {
            if (Modifier.isNative(method4.getModifiers())) {
                if (u7.OooO00o(new byte[]{-5, 91, 75, -13, -99, 114, -59, -24, -16, 78, 74, -22}, new byte[]{-107, 58, 63, -102, -21, 23, -102, -101}).equals(method4.getName())) {
                    OooO0oO = method4;
                }
                if (u7.OooO00o(new byte[]{-26, -28, 18, -66, -10, 36, 124, -87, -32, -32, 5, -68, -33, 49, 70, -72, -27, -20, 21, -92, -23, 46, 77}, new byte[]{-120, -123, 102, -41, -128, 65, 35, -54}).equals(method4.getName())) {
                    OooOO0 = method4;
                }
            }
        }
        Class<?>[] parameterTypes2 = OooO0oO.getParameterTypes();
        if (parameterTypes2 != null && parameterTypes2.length >= 9) {
            Class<?> cls = parameterTypes2[8];
            if (cls == String.class) {
                OooO0oo = 1;
            } else if (cls == Parcel.class) {
                OooO0oo = 2;
            } else {
                OooO0oo = yn2.OooO0o() ? 2 : 1;
            }
        }
        OooO = parameterTypes2.length;
        OooOO0O = 1;
        Method method5 = OooOO0;
        if (method5 != null) {
            OooOO0o = method5.getParameterTypes().length;
        }
        for (Method method6 : MediaRecorder.class.getDeclaredMethods()) {
            if (Modifier.isNative(method6.getModifiers()) && u7.OooO00o(new byte[]{-127, 3, 61, 113, -32, -74, -25, 12, -118, 22, 60, 104}, new byte[]{-17, 98, 73, 24, -106, -45, -72, 127}).equals(method6.getName())) {
                OooOOO0 = method6;
            }
        }
        Class<?>[] parameterTypes3 = OooOOO0.getParameterTypes();
        if (parameterTypes3 != null) {
            if (parameterTypes3.length >= 2) {
                Class<?> cls2 = parameterTypes3[2];
                if (cls2 == String.class) {
                    OooOOO = 1;
                } else if (cls2 == Parcel.class) {
                    OooOOO = 2;
                } else {
                    OooOOO = yn2.OooO0o() ? 2 : 1;
                }
            }
            OooOOOO = parameterTypes3.length;
        }
        Method[] declaredMethods5 = MediaPlayer.class.getDeclaredMethods();
        if (declaredMethods5 != null && declaredMethods5.length != 0) {
            int length3 = declaredMethods5.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length3) {
                    break;
                }
                Method method7 = declaredMethods5[i6];
                if (Modifier.isNative(method7.getModifiers()) && u7.OooO00o(new byte[]{16, -66, 90, 5, 26, -4, -76, 54, 27, -85, 91, 28}, new byte[]{126, -33, 46, 108, 108, -103, -21, 69}).equals(method7.getName())) {
                    OooOOOo = method7;
                    break;
                }
                i6++;
            }
            Method method8 = OooOOOo;
            if (method8 != null) {
                Class<?>[] parameterTypes4 = method8.getParameterTypes();
                if (parameterTypes4 != null && parameterTypes4.length > 1) {
                    Class<?> cls3 = parameterTypes4[1];
                    if (cls3 == String.class) {
                        OooOOo0 = 1;
                    } else if (cls3 == Parcel.class) {
                        OooOOo0 = 2;
                    } else {
                        OooOOo0 = yn2.OooO0o() ? 2 : 1;
                    }
                }
                OooOOo = parameterTypes4.length;
            }
        }
        Class cls4 = ml1.OooO00o;
        if (cls4 == null) {
            cls4 = null;
        }
        if (cls4 != null && (declaredMethods2 = cls4.getDeclaredMethods()) != null && declaredMethods2.length != 0) {
            for (Method method9 : declaredMethods2) {
                if (Modifier.isNative(method9.getModifiers()) && u7.OooO00o(new byte[]{71, 115, -115, -76, 60, -75, 127, -101, 76, 115, -115, -72}, new byte[]{41, 18, -7, -35, 74, -48, 60, -23}).equals(method9.getName())) {
                    OooOOoo = method9;
                }
            }
            OooOo00 = 1;
            OooOo0 = OooOOoo.getParameterTypes().length;
        }
        Class cls5 = ll1.OooO00o;
        Class cls6 = cls5 != null ? cls5 : null;
        if (cls6 != null && (declaredMethods = cls6.getDeclaredMethods()) != null && declaredMethods.length != 0) {
            for (Method method10 : declaredMethods) {
                if (Modifier.isNative(method10.getModifiers()) && u7.OooO00o(new byte[]{-108, -18, -101, -70, -35, 50, -17, 76, -109, -5, -83, -78, -40, 50, -29, 84, -97, -31, -101, -126, -34, 50, -45, 71}, new byte[]{-6, -113, -17, -45, -85, 87, -90, 34}).equals(method10.getName())) {
                    OooOo0O = method10;
                }
            }
            OooOo0o = 1;
            OooOo = OooOo0O.getParameterTypes().length;
        }
        Method[] declaredMethods6 = SoundPool.class.getDeclaredMethods();
        if (declaredMethods6 != null && declaredMethods6.length != 0) {
            for (Method method11 : declaredMethods6) {
                if (Modifier.isNative(method11.getModifiers()) && u7.OooO00o(new byte[]{125, -96, 96, -109, 5, -63, -58, -91, 118, -75, 97, -118}, new byte[]{19, -63, 20, -6, 115, -92, -103, -42}).equals(method11.getName())) {
                    OooOoO0 = method11;
                }
            }
            OooOoO = 1;
            OooOoOO = OooOoO0.getParameterTypes().length;
        }
        Method[] declaredMethods7 = AudioTrack.class.getDeclaredMethods();
        if (declaredMethods7 == null || declaredMethods7.length == 0) {
            return;
        }
        for (Method method12 : declaredMethods7) {
            if (Modifier.isNative(method12.getModifiers()) && u7.OooO00o(new byte[]{-102, 91, 116, -41, 35, -11, -41, -16, -111, 78, 117, -50}, new byte[]{-12, 58, 0, -66, 85, -112, -120, -125}).equals(method12.getName())) {
                OooOoo0 = method12;
            }
        }
        OooOoo = 1;
        OooOooO = OooOoo0.getParameterTypes().length;
    }
}

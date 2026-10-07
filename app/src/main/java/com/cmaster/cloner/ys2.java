package com.cmaster.cloner;

import android.content.pm.ProviderInfo;
import android.hardware.Camera;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Parcel;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ys2 {
    public static void OooO00o() throws SecurityException {
        Class cls;
        Class cls2;
        Class cls3;
        int i;
        Class cls4;
        String strConcat;
        if (o0O.OooO0O0 == null) {
            OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{84, -118, 90, -45, 98, -89, 82, 109, 100, -101, 87, -41, 114, -73, 109, 109, 85, -97, 91, -43, 99}, new byte[]{39, -23, 50, -74, 6, -46, 62, 8}));
        }
        if (o0O.OooO0OO == null) {
            OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{85, -77, 10, -97, -119, 61, -120, 10, 100, -71, 12, -98, -66, 45, -106, 25, 79, -77, 7}, new byte[]{38, -48, 98, -6, -19, 72, -28, 111}));
        }
        if (o0O.OooO0o == null) {
            OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{-117, -78, -95, -58, -14, 56, -11, 23, -83, -65, -85, -54, -8, 41, -54, 23, -118, -89, -96, -64, -13}, new byte[]{-8, -47, -55, -93, -106, 77, -103, 114}));
        }
        if (yn2.OooO0O0()) {
            if (of1.OooO00o == null) {
                Class cls5 = o0O.OooO00o;
                Constructor<?> constructor = null;
                for (Constructor<?> constructor2 : cls5.getDeclaredConstructors()) {
                    if (constructor2.getParameterTypes().length != 0) {
                        constructor = constructor2;
                    }
                }
                if (constructor != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(cls5.getName());
                    sb.append(u7.OooO00o(new byte[]{124, 123, -103, -4, 77, -126}, new byte[]{95, 18, -9, -107, 57, -81, -125, -105}));
                    StringBuilder sb2 = new StringBuilder("(");
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    for (Class<?> cls6 : parameterTypes) {
                        sb2.append(OooO0O0(cls6));
                    }
                    sb2.append(')');
                    sb2.append(u7.OooO00o(new byte[]{83}, new byte[]{5, 78, -121, -59, 52, -39, -101, -128}));
                    sb.append(sb2.toString());
                    strConcat = sb.toString();
                } else {
                    strConcat = cls5.getName().concat(u7.OooO00o(new byte[]{-75, 102, 49, -102, 63, -64, -45, -74, -30, 47, 57, -100, 62, -125, -39}, new byte[]{-106, 15, 95, -13, 75, -19, -67, -39}));
                }
                Exception exc = new Exception(strConcat);
                exc.setStackTrace(new StackTraceElement[0]);
                ka kaVarOooO0O0 = ka.OooO0O0();
                Integer num = qx1.OooO00o;
                String str = ((ProviderInfo) e92.OooO0OO.OooO0o0).processName;
                String strOooO0Oo = qx1.OooO0Oo();
                String strOooO0Oo2 = qx1.OooO0Oo();
                Parcel parcelObtain = Parcel.obtain();
                try {
                    kk.OooO0O0(parcelObtain, exc, null, 60);
                    byte[] bArrMarshall = parcelObtain.marshall();
                    parcelObtain.recycle();
                    kaVarOooO0O0.getClass();
                    ka.OooO0Oo(str, strOooO0Oo, -1L, strOooO0Oo2, -1, bArrMarshall);
                } catch (Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
            if (o0O.OooO == null) {
                OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{106, 16, -38, 1, 44, 49, -33, 97, 74, 22, -64, 18, 33, 39, -42, 69, 107, 20, -63}, new byte[]{25, 115, -78, 100, 72, 68, -77, 4}));
            }
        } else if (o0O.OooO0oo == null) {
            OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{-50, -1, 116, -47, 50, 34, 90, -27, -18, -7, 110, -62, 63, 52, 83, -63, -49, -5, 111}, new byte[]{-67, -100, 28, -76, 86, 87, 54, -128}));
        }
        if (o0O.OooOO0 == null) {
            OooO0OO(o0O.OooO00o, u7.OooO00o(new byte[]{-81, 72, 52, 69, 119, 20, 118, 28, -113, 95, 51, 80, 64, 4, 104, 15, -75, 72, 57}, new byte[]{-36, 43, 92, 32, 19, 97, 26, 121}));
        }
        Method[] methodArr = {se1.OooO00o, se1.OooO0Oo, se1.OooO0oO, se1.OooOO0, se1.OooOOO0, se1.OooOOOo, se1.OooOOoo, se1.OooOo0O, se1.OooOoO0, se1.OooOoo0};
        Method method = methodArr[0];
        Class cls7 = Integer.TYPE;
        if (method != null) {
            String strOooO00o = u7.OooO00o(new byte[]{37, -79, 28, -83, -73, -18, 92, -12, 46, -92, 29, -76}, new byte[]{75, -48, 104, -60, -63, -117, 3, -121});
            Class cls8 = Boolean.TYPE;
            o00OO000 o00oo000Oooo00o = o00OO000.Oooo00o(Camera.class, strOooO00o, Object.class, cls7, String.class, cls8, cls8);
            if (o00oo000Oooo00o == null) {
                o00oo000Oooo00o = o00OO000.Oooo00o(Camera.class, u7.OooO00o(new byte[]{51, 80, 70, -38, -81, -12, 2, -94, 56, 69, 71, -61}, new byte[]{93, 49, 50, -77, -39, -111, 93, -47}), Object.class, cls7, String.class);
            }
            if (o00oo000Oooo00o == null) {
                o00oo000Oooo00o = o00OO000.Oooo00o(Camera.class, u7.OooO00o(new byte[]{57, 33, 21, 89, -61, -122, -21, 102, 50, 52, 20, 64}, new byte[]{87, 64, 97, 48, -75, -29, -76, 21}), Object.class, cls7, cls7, String.class);
            }
            if (o00oo000Oooo00o == null) {
                OooO0OO(Camera.class, u7.OooO00o(new byte[]{-61, -21, -9, 70, -64, -115, 47, -16, -56, -2, -10, 95}, new byte[]{-83, -118, -125, 47, -74, -24, 112, -125}));
            }
        }
        if (methodArr[2] != null) {
            String strOooO00o2 = u7.OooO00o(new byte[]{-1, 70, -27, 7, -114, 97, -115, 29, -12, 83, -28, 30}, new byte[]{-111, 39, -111, 110, -8, 4, -46, 110});
            Class cls9 = Long.TYPE;
            cls = String.class;
            cls2 = Object.class;
            o00OO000 o00oo000Oooo00o2 = o00OO000.Oooo00o(AudioRecord.class, strOooO00o2, Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, int[].class, Parcel.class, cls9, cls7, cls7);
            if (o00oo000Oooo00o2 == null) {
                cls4 = AudioRecord.class;
                o00oo000Oooo00o2 = o00OO000.Oooo00o(cls4, u7.OooO00o(new byte[]{-107, 29, -6, -52, -41, 97, -48, 82, -98, 8, -5, -43}, new byte[]{-5, 124, -114, -91, -95, 4, -113, 33}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, int[].class, Parcel.class, cls9, cls7);
            } else {
                cls4 = AudioRecord.class;
            }
            if (o00oo000Oooo00o2 == null) {
                o00oo000Oooo00o2 = o00OO000.Oooo00o(cls4, u7.OooO00o(new byte[]{118, 87, -15, -44, 42, -113, 86, 18, 125, 66, -16, -51}, new byte[]{24, 54, -123, -67, 92, -22, 9, 97}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, int[].class, String.class, cls9);
            }
            if (o00oo000Oooo00o2 == null) {
                OooO0OO(cls4, u7.OooO00o(new byte[]{11, -55, -86, -9, -116, 23, -88, -47, 0, -36, -85, -18}, new byte[]{101, -88, -34, -98, -6, 114, -9, -94}));
            }
        } else {
            cls = String.class;
            cls2 = Object.class;
        }
        if (methodArr[4] != null) {
            cls3 = cls2;
            o00OO000 o00oo000Oooo00o3 = o00OO000.Oooo00o(MediaRecorder.class, u7.OooO00o(new byte[]{112, -8, -1, 108, 118, 120, 34, 5, 123, -19, -2, 117}, new byte[]{30, -103, -117, 5, 0, 29, 125, 118}), cls3, cls, Parcel.class);
            if (o00oo000Oooo00o3 == null) {
                o00oo000Oooo00o3 = o00OO000.Oooo00o(MediaRecorder.class, u7.OooO00o(new byte[]{-54, -56, -120, 57, -79, -79, -100, 68, -63, -35, -119, 32}, new byte[]{-92, -87, -4, 80, -57, -44, -61, 55}), cls3, cls, cls);
            }
            if (o00oo000Oooo00o3 == null) {
                OooO0OO(MediaRecorder.class, u7.OooO00o(new byte[]{102, -68, 45, 35, 28, -105, -54, 121, 109, -87, 44, 58}, new byte[]{8, -35, 89, 74, 106, -14, -107, 10}));
            }
        } else {
            cls3 = cls2;
        }
        if (methodArr[5] != null) {
            i = 8;
            o00OO000 o00oo000Oooo00o4 = o00OO000.Oooo00o(MediaPlayer.class, u7.OooO00o(new byte[]{26, -14, -83, -4, 96, 75, 4, 97, 17, -25, -84, -27}, new byte[]{116, -109, -39, -107, 22, 46, 91, 18}), cls3, Parcel.class, cls7);
            if (o00oo000Oooo00o4 == null) {
                o00oo000Oooo00o4 = o00OO000.Oooo00o(MediaPlayer.class, u7.OooO00o(new byte[]{14, 3, 107, 42, 75, 93, -72, -26, 5, 22, 106, 51}, new byte[]{96, 98, 31, 67, 61, 56, -25, -107}), cls3, Parcel.class);
            }
            if (o00oo000Oooo00o4 == null) {
                o00oo000Oooo00o4 = o00OO000.Oooo00o(MediaPlayer.class, u7.OooO00o(new byte[]{49, -72, 46, 65, -103, 54, 21, 71, 58, -83, 47, 88}, new byte[]{95, -39, 90, 40, -17, 83, 74, 52}), cls3);
            }
            if (o00oo000Oooo00o4 == null) {
                OooO0OO(MediaPlayer.class, u7.OooO00o(new byte[]{91, 82, 23, 79, 76, 12, -60, -21, 80, 71, 22, 86}, new byte[]{53, 51, 99, 38, 58, 105, -101, -104}));
            }
        } else {
            i = 8;
        }
        if (methodArr[i] != null) {
            byte[] bArr = new byte[i];
            // fill-array-data instruction
            bArr[0] = -21;
            bArr[1] = -86;
            bArr[2] = 26;
            bArr[3] = -50;
            bArr[4] = 39;
            bArr[5] = 121;
            bArr[6] = 4;
            bArr[7] = -34;
            if (o00OO000.Oooo00o(SoundPool.class, u7.OooO00o(new byte[]{-123, -53, 110, -89, 81, 28, 91, -83, -114, -34, 111, -66}, bArr), cls7, cls3, cls) == null) {
                byte[] bArr2 = new byte[i];
                // fill-array-data instruction
                bArr2[0] = 68;
                bArr2[1] = 62;
                bArr2[2] = -107;
                bArr2[3] = -100;
                bArr2[4] = 113;
                bArr2[5] = -114;
                bArr2[6] = -79;
                bArr2[7] = -21;
                OooO0OO(SoundPool.class, u7.OooO00o(new byte[]{42, 95, -31, -11, 7, -21, -18, -104, 33, 74, -32, -20}, bArr2));
            }
        }
        if (methodArr[9] != null) {
            String strOooO00o3 = u7.OooO00o(new byte[]{-11, -19, 93, 117, -114, -108, 37, 46, -2, -8, 92, 108}, new byte[]{-101, -116, 41, 28, -8, -15, 122, 93});
            Class cls10 = Long.TYPE;
            Class cls11 = Boolean.TYPE;
            o00OO000 o00oo000Oooo00o5 = o00OO000.Oooo00o(AudioTrack.class, strOooO00o3, Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, cls7, int[].class, Parcel.class, cls10, cls11, cls7, Object.class, String.class);
            if (o00oo000Oooo00o5 == null) {
                o00oo000Oooo00o5 = o00OO000.Oooo00o(AudioTrack.class, u7.OooO00o(new byte[]{-51, 103, -14, -78, -115, 45, -78, 8, -58, 114, -13, -85}, new byte[]{-93, 6, -122, -37, -5, 72, -19, 123}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, cls7, int[].class, cls10, cls11, cls7, Object.class, String.class);
            }
            if (o00oo000Oooo00o5 == null) {
                o00oo000Oooo00o5 = o00OO000.Oooo00o(AudioTrack.class, u7.OooO00o(new byte[]{124, -21, -76, 88, 16, -87, -72, -111, 119, -2, -75, 65}, new byte[]{18, -118, -64, 49, 102, -52, -25, -30}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, cls7, int[].class, cls10, cls11, cls7, Object.class);
            }
            if (o00oo000Oooo00o5 == null) {
                o00oo000Oooo00o5 = o00OO000.Oooo00o(AudioTrack.class, u7.OooO00o(new byte[]{89, 78, 15, -27, 68, 76, -48, 125, 82, 91, 14, -4}, new byte[]{55, 47, 123, -116, 50, 41, -113, 14}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, cls7, int[].class, cls10, cls11);
            }
            if (o00oo000Oooo00o5 == null) {
                o00oo000Oooo00o5 = o00OO000.Oooo00o(AudioTrack.class, u7.OooO00o(new byte[]{6, 51, -94, -18, -125, 56, 6, -99, 13, 38, -93, -9}, new byte[]{104, 82, -42, -121, -11, 93, 89, -18}), Object.class, Object.class, int[].class, cls7, cls7, cls7, cls7, cls7, int[].class, cls10);
            }
            if (o00oo000Oooo00o5 == null) {
                OooO0OO(AudioTrack.class, u7.OooO00o(new byte[]{79, 89, -78, 90, 46, -122, 79, 90, 68, 76, -77, 67}, new byte[]{33, 56, -58, 51, 88, -29, 16, 41}));
            }
        }
        for (int i2 = 0; i2 < 10; i2++) {
        }
    }

    public static String OooO0O0(Class cls) {
        if (cls.isPrimitive()) {
            if (cls == Boolean.TYPE) {
                return u7.OooO00o(new byte[]{-95}, new byte[]{-5, 23, 5, 58, 121, 90, -27, -76});
            }
            if (cls == Byte.TYPE) {
                return u7.OooO00o(new byte[]{-2}, new byte[]{-68, 18, -96, -79, -50, 76, -123, 78});
            }
            if (cls == Character.TYPE) {
                return u7.OooO00o(new byte[]{101}, new byte[]{38, -27, 20, -49, 96, -69, -58, 70});
            }
            if (cls == Short.TYPE) {
                return u7.OooO00o(new byte[]{-23}, new byte[]{-70, -99, 77, 1, -28, 114, 127, -37});
            }
            if (cls == Integer.TYPE) {
                return u7.OooO00o(new byte[]{60}, new byte[]{117, 112, -54, 110, 61, 86, -24, 54});
            }
            if (cls == Long.TYPE) {
                return u7.OooO00o(new byte[]{-20}, new byte[]{-90, -17, -2, 4, -127, -41, 56, 61});
            }
            if (cls == Float.TYPE) {
                return u7.OooO00o(new byte[]{84}, new byte[]{18, 122, -46, 84, 73, -6, 49, -36});
            }
            if (cls == Double.TYPE) {
                return u7.OooO00o(new byte[]{73}, new byte[]{13, -32, -109, 38, -44, 86, 93, 35});
            }
        } else if (cls == Void.TYPE) {
            return u7.OooO00o(new byte[]{59}, new byte[]{109, -30, -30, 55, -32, -107, 108, -66});
        }
        StringBuilder sb = new StringBuilder();
        sb.append(u7.OooO00o(new byte[]{56}, new byte[]{116, -3, -61, 54, -38, 95, 116, 42}));
        sb.append(cls.getName().replace('.', '/'));
        return rj.OooO0oo(new byte[]{-82}, new byte[]{-107, -100, -49, -20, -125, 83, 94, 96}, sb);
    }

    public static void OooO0OO(Class cls, String str) throws SecurityException {
        String strOooO0oo;
        Method method = null;
        for (Method method2 : cls.getDeclaredMethods()) {
            if (TextUtils.equals(str, method2.getName())) {
                method = method2;
            }
        }
        if (method != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            rj.OooOOo0(new byte[]{-24}, new byte[]{-53, 80, -34, -119, -76, 23, -42, 86}, sb, str);
            sb.append(u7.OooO00o(new byte[]{26}, new byte[]{55, 19, 35, 61, -19, -1, 59, -76}));
            StringBuilder sb2 = new StringBuilder("(");
            for (Class<?> cls2 : method.getParameterTypes()) {
                sb2.append(OooO0O0(cls2));
            }
            sb2.append(')');
            sb2.append(OooO0O0(method.getReturnType()));
            sb.append(sb2.toString());
            strOooO0oo = sb.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            rj.OooOOo0(new byte[]{84}, new byte[]{119, 54, -62, 126, -79, 113, -123, 4}, sb3, str);
            strOooO0oo = rj.OooO0oo(new byte[]{103, 90, -48, 56, -73, 54, -112, 64, 36, 80}, new byte[]{74, 52, -65, 76, -105, 80, -1, 53}, sb3);
        }
        Exception exc = new Exception(strOooO0oo);
        exc.setStackTrace(new StackTraceElement[0]);
        ka kaVarOooO0O0 = ka.OooO0O0();
        Integer num = qx1.OooO00o;
        String str2 = ((ProviderInfo) e92.OooO0OO.OooO0o0).processName;
        String strOooO0Oo = qx1.OooO0Oo();
        String strOooO0Oo2 = qx1.OooO0Oo();
        Parcel parcelObtain = Parcel.obtain();
        try {
            kk.OooO0O0(parcelObtain, exc, null, 60);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            kaVarOooO0O0.getClass();
            ka.OooO0Oo(str2, strOooO0Oo, -1L, strOooO0Oo2, -1, bArrMarshall);
        } catch (Throwable th) {
            parcelObtain.recycle();
            throw th;
        }
    }
}

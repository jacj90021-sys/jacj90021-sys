package com.cmaster.cloner;

import android.os.IBinder;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Pair;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class a8 {
    public static final int OooO00o;
    public static final String OooO0O0 = u7.OooO00o(new byte[]{35, 119, -48, 1, 114, -96, -49, 49, 62, 106, -33, 16}, new byte[]{119, 37, -111, 79, 33, -31, -116, 101});
    public static final String OooO0OO = u7.OooO00o(new byte[]{-98, -80, 91, -57, -51, 69, 16, -79, -107, -83, 70, -56}, new byte[]{-63, -28, 9, -122, -125, 22, 81, -14});

    static {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeString("");
        long jDataPosition = parcelObtain.dataPosition();
        parcelObtain.setDataPosition(0);
        parcelObtain.writeInterfaceToken("");
        parcelObtain.recycle();
        OooO00o = (int) (parcelObtain.dataPosition() - jDataPosition);
    }

    public static Pair OooO00o(Class cls, boolean z) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        String string;
        Object obj;
        if (cls == null) {
            return null;
        }
        if (!z) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(u7.OooO00o(new byte[]{64, -67, -81, 3, -114, -92, -111, 101, 64, -83, -125}, new byte[]{33, -50, -26, 109, -6, -63, -29, 3}), IBinder.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, null);
            } catch (Throwable unused) {
            }
        }
        Field[] declaredFields = cls.getDeclaredFields();
        HashMap map = new HashMap(declaredFields.length);
        HashMap map2 = new HashMap(declaredFields.length);
        for (Field field : declaredFields) {
            field.setAccessible(true);
            if (Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    obj = field.get(null);
                } catch (Exception unused2) {
                }
                int iIntValue = obj instanceof Integer ? ((Integer) obj).intValue() : -1;
                if (iIntValue != -1) {
                    if (name.startsWith(OooO0O0)) {
                        string = name.substring(12);
                    } else {
                        String str = OooO0OO;
                        if (name.endsWith(str)) {
                            StringBuilder sb = new StringBuilder();
                            int i = 0;
                            char c = 0;
                            while (i < name.indexOf(str)) {
                                char cCharAt = name.charAt(i);
                                if (i > 0 && c == '_') {
                                    sb.append(cCharAt);
                                } else if (Character.isUpperCase(cCharAt)) {
                                    sb.append(Character.toLowerCase(cCharAt));
                                }
                                i++;
                                c = cCharAt;
                            }
                            string = sb.toString();
                        } else {
                            string = null;
                        }
                    }
                    if (!TextUtils.isEmpty(string)) {
                        map.put(Integer.valueOf(iIntValue), string);
                        map2.put(string, Integer.valueOf(iIntValue));
                    }
                }
            }
        }
        return Pair.create(map2, map);
    }
}

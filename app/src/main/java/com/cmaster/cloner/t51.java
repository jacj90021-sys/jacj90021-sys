package com.cmaster.cloner;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarOutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class t51 {
    public static final HashMap OooO0o;
    public static final HashMap OooO0oO;
    public static final HashMap OooO0oo;
    public final LinkedHashMap OooO00o;
    public bn OooO0O0;
    public String OooO0OO;
    public static final String OooO0Oo = u7.OooO00o(new byte[]{-37, -75, 99, -42, -96, 28, 92, -65, -102, -104}, new byte[]{-1, -22, 60, -66, -63, 114, 56, -45});
    public static final String OooO0o0 = u7.OooO00o(new byte[]{-120, 33, 22, -86, 84, -38, -34, 89, -56, 63, 59, -75, 80, -41}, new byte[]{-84, 126, 73, -57, 49, -82, -74, 54});

    static {
        HashMap map = new HashMap();
        OooO0o = map;
        Class cls = Boolean.TYPE;
        Class<Boolean> cls2 = Boolean.class;
        map.put(cls, cls2);
        Class cls3 = Integer.TYPE;
        Class<Integer> cls4 = Integer.class;
        map.put(cls3, cls4);
        Class cls5 = Byte.TYPE;
        Class<Byte> cls6 = Byte.class;
        map.put(cls5, cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7, Long.class);
        Class cls8 = Short.TYPE;
        map.put(cls8, Short.class);
        Class cls9 = Float.TYPE;
        map.put(cls9, Float.class);
        Class cls10 = Double.TYPE;
        map.put(cls10, Double.class);
        Class cls11 = Character.TYPE;
        Class<Character> cls12 = Character.class;
        map.put(cls11, cls12);
        OooO0oO = new HashMap();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class<Character> cls13 = cls12;
            xp1 xp1VarOooO00o = xp1.OooO00o((Class) entry.getKey());
            Iterator it2 = it;
            xp1 xp1VarOooO00o2 = xp1.OooO00o((Class) entry.getValue());
            OooO0oO.put(xp1VarOooO00o, xp1VarOooO00o2.OooO0OO(xp1VarOooO00o2, u7.OooO00o(new byte[]{33, -105, 105, -116, -105, 41, 14}, new byte[]{87, -10, 5, -7, -14, 102, 104, -17}), xp1VarOooO00o));
            cls2 = cls2;
            it = it2;
            cls12 = cls13;
            cls4 = cls4;
            cls6 = cls6;
        }
        Class<Character> cls14 = cls12;
        HashMap map2 = new HashMap();
        map2.put(cls, xp1.OooO00o(cls2).OooO0OO(xp1.OooO0Oo, u7.OooO00o(new byte[]{46, -107, 25, 18, 10, 59, 42, 109, 45, -106, 3, 27}, new byte[]{76, -6, 118, 126, 111, 90, 68, 59}), new xp1[0]));
        map2.put(cls3, xp1.OooO00o(cls4).OooO0OO(xp1.OooO, u7.OooO00o(new byte[]{104, -83, -93, -74, -106, -62, 95, -48}, new byte[]{1, -61, -41, -32, -9, -82, 42, -75}), new xp1[0]));
        map2.put(cls5, xp1.OooO00o(cls6).OooO0OO(xp1.OooO0o0, u7.OooO00o(new byte[]{87, -45, -95, -17, 123, -85, -38, -97, 80}, new byte[]{53, -86, -43, -118, 45, -54, -74, -22}), new xp1[0]));
        map2.put(cls7, xp1.OooO00o(Long.class).OooO0OO(xp1.OooOO0, u7.OooO00o(new byte[]{72, 101, -23, 80, -96, 4, 5, -103, 65}, new byte[]{36, 10, -121, 55, -10, 101, 105, -20}), new xp1[0]));
        map2.put(cls8, xp1.OooO00o(Short.class).OooO0OO(xp1.OooOO0O, u7.OooO00o(new byte[]{-112, 83, -38, 64, -87, 40, -63, -1, -106, 94}, new byte[]{-29, 59, -75, 50, -35, 126, -96, -109}), new xp1[0]));
        map2.put(cls9, xp1.OooO00o(Float.class).OooO0OO(xp1.OooO0oo, u7.OooO00o(new byte[]{-77, -33, -126, 13, -45, -102, 95, 106, -96, -42}, new byte[]{-43, -77, -19, 108, -89, -52, 62, 6}), new xp1[0]));
        map2.put(cls10, xp1.OooO00o(Double.class).OooO0OO(xp1.OooO0oO, u7.OooO00o(new byte[]{-8, -110, 24, 29, 102, -55, 115, -6, -16, -120, 8}, new byte[]{-100, -3, 109, 127, 10, -84, 37, -101}), new xp1[0]));
        map2.put(cls11, xp1.OooO00o(cls14).OooO0OO(xp1.OooO0o, u7.OooO00o(new byte[]{51, 87, -26, -42, 40, 19, -83, -9, 53}, new byte[]{80, 63, -121, -92, 126, 114, -63, -126}), new xp1[0]));
        OooO0oo = map2;
    }

    public t51(LinkedHashMap linkedHashMap) {
        this.OooO00o = linkedHashMap;
    }

    public static ArrayList OooO0OO(Class cls, Class cls2) throws SecurityException {
        ArrayList arrayList = new ArrayList(Arrays.asList(cls.getDeclaredMethods()));
        for (Method method : cls2.getDeclaredMethods()) {
            if (Modifier.isAbstract(method.getModifiers())) {
                arrayList.add(method);
            }
        }
        return arrayList;
    }

    public static void OooO0Oo(Object obj, rq rqVar) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        try {
            Field declaredField = obj.getClass().getDeclaredField(OooO0Oo);
            declaredField.setAccessible(true);
            declaredField.set(obj, rqVar);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (NoSuchFieldException e2) {
            throw new IllegalArgumentException(u7.OooO00o(new byte[]{-78, 94, 90, 9, -9, -84, -28, -126, -112, 88, 74, 9, -26, -2, -3, -101, -123, 17, 71, 71, -27, -8, -13, -115, -97, 84}, new byte[]{-4, 49, 46, 41, -106, -116, -110, -29}), e2);
        }
    }

    public static void OooO0o0(rp1 rp1Var, Method method, co0 co0Var, co0 co0Var2) {
        tt0 tt0VarOooO0O0 = xp1.OooO00o(AbstractMethodError.class).OooO0O0(xp1.OooOOO);
        rp1Var.OooOOO(co0Var, u7.OooO00o(new byte[]{54}, new byte[]{17, -63, 45, -2, 10, 1, -6, 126}) + method + u7.OooO00o(new byte[]{-33, 58, -121, -89, 115, 55, 79, -105, -40, 120, -127, -26, 126, 56, 76, -113, -99, 126}, new byte[]{-8, 26, -28, -58, 29, 89, 32, -29}));
        co0[] co0VarArr = {co0Var};
        if (co0Var2 == null) {
            qa.OooOO0();
            return;
        }
        rp1Var.OooO0o0(new zm1(ec1.o000O0oo, (zh1) rp1Var.OooO0oo, v81.OooO0o, (bj1) rp1Var.OooOO0, tt0VarOooO0O0.OooO00o.OooO0OO), null);
        rp1Var.OooOOOO(co0Var2, true);
        rp1Var.OooOO0o(new bc1(52, p51.OooO0Oo(tt0VarOooO0O0.OooO00o(true)).OooO0OO(), bj1.OooOOO0), tt0VarOooO0O0, null, co0Var2, co0VarArr);
        rp1Var.OooO0o0(new an1(ec1.o0000o, (zh1) rp1Var.OooO0oo, v81.OooO(co0Var2.OooO00o()), (bj1) rp1Var.OooOO0), null);
    }

    public final o0O000O OooO00o() throws SecurityException {
        co0 co0VarOooOOOo;
        co0 co0VarOooOOOo2;
        Class<?>[] clsArr;
        xp1 xp1Var;
        xp1 xp1Var2;
        co0 co0Var;
        co0[] co0VarArr;
        tt0 tt0VarOooO0OO;
        bc1 bc1Var;
        bc1 bc1Var2;
        bc1 bc1Var3;
        bc1 bc1Var4;
        u81 u81Var;
        bc1 bc1Var5;
        Method method;
        rp1 rp1Var;
        bc1 bc1Var6;
        int iOooO0OO;
        int i;
        Iterator it;
        t51 t51Var = this;
        byte b = 13;
        o0O000O o0o000o = new o0O000O(13);
        Iterator it2 = t51Var.OooO00o.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Class cls = (Class) entry.getValue();
            bn bnVar = t51Var.OooO0O0;
            String strOooO00o = bnVar == null ? ((Class) entry.getKey()).getName().replace(u7.OooO00o(new byte[]{59}, new byte[]{21, 118, -112, -55, 87, -66, -118, -111}), u7.OooO00o(new byte[]{-58}, new byte[]{-23, 76, 19, 122, 63, 51, -91, -109})) + t51Var.OooO0OO : bnVar.OooO00o((Class) entry.getKey());
            StringBuilder sb = new StringBuilder();
            rj.OooOOo0(new byte[]{b}, new byte[]{65, -90, 98, 0, 96, 109, 115, -34}, sb, strOooO00o);
            String strOooO0oo = rj.OooO0oo(new byte[]{67}, new byte[]{120, -125, 56, -128, 30, -85, 3, 92}, sb);
            xp1 xp1Var3 = new xp1(strOooO0oo, vp1.OooO0oO(strOooO0oo));
            xp1 xp1VarOooO00o = xp1.OooO00o(cls);
            xp1 xp1VarOooO00o2 = xp1.OooO00o(InvocationHandler.class);
            xp1 xp1VarOooO00o3 = xp1.OooO00o(Method[].class);
            String str = OooO0Oo;
            o0o000o.OooO(new kz(xp1Var3, xp1VarOooO00o2, str), 2);
            String str2 = OooO0o0;
            o0o000o.OooO(new kz(xp1Var3, xp1VarOooO00o3, str2), 10);
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i2 = 0;
            while (i2 < length) {
                Constructor<?> constructor = declaredConstructors[i2];
                if (constructor.getModifiers() == 16) {
                    i = i2;
                    it = it2;
                } else {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length2 = parameterTypes.length;
                    xp1[] xp1VarArr = new xp1[length2];
                    i = i2;
                    it = it2;
                    for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                        xp1VarArr[i3] = xp1.OooO00o(parameterTypes[i3]);
                    }
                    rp1 rp1VarOooO0oo = o0o000o.OooO0oo(xp1Var3.OooO0O0(xp1VarArr));
                    co0 co0VarOooOO0 = rp1VarOooO0oo.OooOO0(xp1Var3);
                    co0[] co0VarArr2 = new co0[length2];
                    int i4 = 0;
                    while (i4 < length2) {
                        co0[] co0VarArr3 = co0VarArr2;
                        co0VarArr3[i4] = rp1VarOooO0oo.OooO(i4, xp1VarArr[i4]);
                        i4++;
                        co0VarArr2 = co0VarArr3;
                    }
                    co0[] co0VarArr4 = co0VarArr2;
                    tt0 tt0VarOooO0O0 = xp1VarOooO00o.OooO0O0(xp1VarArr);
                    p51 p51VarOooO0Oo = p51.OooO0Oo(tt0VarOooO0O0.OooO00o(true));
                    bc1 bc1Var7 = ec1.OooO00o;
                    rp1VarOooO0oo.OooOO0o(new bc1(52, p51VarOooO0Oo.OooO0OO(), bj1.OooOOO0), tt0VarOooO0O0, null, co0VarOooOO0, co0VarArr4);
                    rp1VarOooO0oo.OooOOoo();
                }
                i2 = i + 1;
                it2 = it;
            }
            Iterator it3 = it2;
            ArrayList arrayListOooO0OO = OooO0OO((Class) entry.getKey(), (Class) entry.getValue());
            xp1 xp1VarOooO00o4 = xp1.OooO00o(InvocationHandler.class);
            xp1 xp1VarOooO00o5 = xp1.OooO00o(Method[].class);
            if (xp1VarOooO00o4 == null) {
                throw null;
            }
            kl klVar = new kl(new ml(str), new ml(xp1VarOooO00o4.OooO00o));
            nl nlVar = xp1Var3.OooO0OO;
            yk ykVar = new yk(nlVar, klVar);
            if (xp1VarOooO00o5 == null) {
                throw null;
            }
            yk ykVar2 = new yk(nlVar, new kl(new ml(str2), new ml(xp1VarOooO00o5.OooO00o)));
            xp1 xp1VarOooO00o6 = xp1.OooO00o(Method.class);
            xp1 xp1VarOooO00o7 = xp1.OooO00o(Object[].class);
            xp1 xp1Var4 = xp1.OooOOO0;
            tt0 tt0VarOooO0OO2 = xp1VarOooO00o4.OooO0OO(xp1Var4, u7.OooO00o(new byte[]{42, -17, 36, -95, -27, 46}, new byte[]{67, -127, 82, -50, -114, 75, -112, 4}), xp1Var4, xp1VarOooO00o6, xp1VarOooO00o7);
            int i5 = 0;
            while (i5 < arrayListOooO0OO.size()) {
                Method method2 = (Method) arrayListOooO0OO.get(i5);
                String name = method2.getName();
                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                ArrayList arrayList = arrayListOooO0OO;
                int length3 = parameterTypes2.length;
                yk ykVar3 = ykVar;
                xp1[] xp1VarArr2 = new xp1[length3];
                yk ykVar4 = ykVar2;
                for (int i6 = 0; i6 < length3; i6++) {
                    xp1VarArr2[i6] = xp1.OooO00o(parameterTypes2[i6]);
                }
                Class<?> returnType = method2.getReturnType();
                int i7 = i5;
                xp1 xp1VarOooO00o8 = xp1.OooO00o(returnType);
                String str3 = strOooO00o;
                tt0 tt0VarOooO0OO3 = xp1Var3.OooO0OO(xp1VarOooO00o8, name, xp1VarArr2);
                xp1 xp1VarOooO00o9 = xp1.OooO00o(AbstractMethodError.class);
                rp1 rp1VarOooO0oo2 = o0o000o.OooO0oo(tt0VarOooO0OO3);
                o0O000O o0o000o2 = o0o000o;
                co0 co0VarOooOO02 = rp1VarOooO0oo2.OooOO0(xp1Var3);
                xp1 xp1Var5 = xp1Var3;
                bj1 bj1Var = (bj1) rp1VarOooO0oo2.OooOO0;
                tt0 tt0Var = tt0VarOooO0OO2;
                zh1 zh1Var = (zh1) rp1VarOooO0oo2.OooO0oo;
                co0 co0VarOooOOOo3 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o4);
                int i8 = length3;
                xp1 xp1Var6 = co0VarOooOOOo3.OooO0O0;
                xp1 xp1Var7 = xp1.OooOOO0;
                co0 co0VarOooOOOo4 = rp1VarOooO0oo2.OooOOOo(xp1Var7);
                xp1 xp1Var8 = xp1.OooO;
                co0 co0VarOooOOOo5 = rp1VarOooO0oo2.OooOOOo(xp1Var8);
                co0 co0VarOooOOOo6 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o7);
                xp1 xp1Var9 = xp1VarOooO00o7;
                xp1 xp1Var10 = co0VarOooOOOo6.OooO0O0;
                co0 co0VarOooOOOo7 = rp1VarOooO0oo2.OooOOOo(xp1Var8);
                co0 co0VarOooOOOo8 = rp1VarOooO0oo2.OooOOOo(xp1Var7);
                co0 co0VarOooOOOo9 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o8);
                co0 co0VarOooOOOo10 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o5);
                xp1 xp1Var11 = xp1VarOooO00o5;
                co0 co0VarOooOOOo11 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o6);
                co0 co0VarOooOOOo12 = rp1VarOooO0oo2.OooOOOo(xp1Var8);
                xp1 xp1Var12 = xp1VarOooO00o6;
                Class cls2 = (Class) OooO0o.get(returnType);
                co0 co0VarOooOOOo13 = cls2 != null ? rp1VarOooO0oo2.OooOOOo(xp1.OooO00o(cls2)) : null;
                co0 co0VarOooOOOo14 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o4);
                xp1 xp1Var13 = xp1VarOooO00o4;
                if ((method2.getModifiers() & 1024) == 0) {
                    co0[] co0VarArr5 = new co0[parameterTypes2.length];
                    co0 co0VarOooOOOo15 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o8);
                    clsArr = parameterTypes2;
                    xp1Var = xp1VarOooO00o;
                    xp1Var2 = xp1VarOooO00o9;
                    tt0VarOooO0OO = xp1VarOooO00o.OooO0OO(xp1VarOooO00o8, name, xp1VarArr2);
                    co0Var = co0VarOooOOOo15;
                    co0VarOooOOOo2 = null;
                    co0VarArr = co0VarArr5;
                    co0VarOooOOOo = null;
                } else {
                    co0VarOooOOOo = rp1VarOooO0oo2.OooOOOo(xp1.OooOOO);
                    co0VarOooOOOo2 = rp1VarOooO0oo2.OooOOOo(xp1VarOooO00o9);
                    clsArr = parameterTypes2;
                    xp1Var = xp1VarOooO00o;
                    xp1Var2 = xp1VarOooO00o9;
                    co0Var = null;
                    co0VarArr = null;
                    tt0VarOooO0OO = null;
                }
                rp1VarOooO0oo2.OooOOO(co0VarOooOOOo12, Integer.valueOf(i7));
                vp1 vp1Var = co0VarOooOOOo10.OooO0O0.OooO0O0;
                bc1 bc1Var8 = ec1.OooO00o;
                switch (vp1Var.OooO0o0) {
                    case 1:
                        bc1Var = ec1.o000o0Oo;
                        break;
                    case 2:
                        bc1Var = ec1.o000o0o0;
                        break;
                    case 3:
                        bc1Var = ec1.o000o0o;
                        break;
                    case 4:
                        bc1Var = ec1.o000o0O;
                        break;
                    case 5:
                        bc1Var = ec1.o000o0O0;
                        break;
                    case 6:
                        bc1Var = ec1.o000o00o;
                        break;
                    case 7:
                        bc1Var = ec1.oooo00o;
                        break;
                    case 8:
                        bc1Var = ec1.o000o0oO;
                        break;
                    case 9:
                        bc1Var = ec1.o000o0OO;
                        break;
                    default:
                        ec1.OooO00o(vp1Var);
                        throw null;
                }
                rp1VarOooO0oo2.OooO0o0(new zm1(bc1Var, (zh1) rp1VarOooO0oo2.OooO0oo, v81.OooO0o, (bj1) rp1VarOooO0oo2.OooOO0, ykVar4), null);
                rp1VarOooO0oo2.OooOOOO(co0VarOooOOOo10, true);
                vp1 vp1Var2 = co0VarOooOOOo11.OooO0O0.OooO0O0;
                switch (vp1Var2.OooO0o0) {
                    case 1:
                        bc1Var2 = ec1.o000OoO;
                        break;
                    case 2:
                        bc1Var2 = ec1.o000O0o;
                        break;
                    case 3:
                        bc1Var2 = ec1.o000Ooo;
                        break;
                    case 4:
                        bc1Var2 = ec1.o000;
                        break;
                    case 5:
                        bc1Var2 = ec1.o0000ooO;
                        break;
                    case 6:
                        bc1Var2 = ec1.o0000oOo;
                        break;
                    case 7:
                        bc1Var2 = ec1.o0000oo0;
                        break;
                    case 8:
                        bc1Var2 = ec1.o000O0O;
                        break;
                    case 9:
                        bc1Var2 = ec1.o000O000;
                        break;
                    default:
                        ec1.OooO00o(vp1Var2);
                        throw null;
                }
                rp1VarOooO0oo2.OooO0o0(new an1(bc1Var2, zh1Var, v81.OooOO0(co0VarOooOOOo10.OooO00o(), co0VarOooOOOo12.OooO00o()), bj1Var), null);
                rp1VarOooO0oo2.OooOOOO(co0VarOooOOOo11, true);
                rp1VarOooO0oo2.OooOOO(co0VarOooOOOo7, Integer.valueOf(i8));
                vp1 vp1Var3 = xp1Var10.OooO0O0;
                vp1Var3.getClass();
                switch (vp1Var3.OooO0o0().OooO0o0) {
                    case 1:
                        bc1Var3 = ec1.o000OOO;
                        break;
                    case 2:
                        bc1Var3 = ec1.o000OOo0;
                        break;
                    case 3:
                        bc1Var3 = ec1.o000OOoO;
                        break;
                    case 4:
                        bc1Var3 = ec1.o000OO0o;
                        break;
                    case 5:
                        bc1Var3 = ec1.o0OoO0o;
                        break;
                    case 6:
                        bc1Var3 = ec1.o000O;
                        break;
                    case 7:
                        bc1Var3 = ec1.o000OO00;
                        break;
                    case 8:
                        bc1Var3 = ec1.o000Oo00;
                        break;
                    case 9:
                        bc1Var3 = new bc1(41, vp1Var3, bj1.OooO0oO, ex.OooO0Oo, u7.OooO00o(new byte[]{-84, 12, -60, -125, 39, 26, -29, -10, -69, 68, -36, -52, 44, 13, -14, -29}, new byte[]{-62, 105, -77, -82, 70, 104, -111, -105}));
                        break;
                    default:
                        ec1.OooO00o(vp1Var3);
                        throw null;
                }
                rp1VarOooO0oo2.OooO0o0(new zm1(bc1Var3, (zh1) rp1VarOooO0oo2.OooO0oo, v81.OooO(co0VarOooOOOo7.OooO00o()), (bj1) rp1VarOooO0oo2.OooOO0, xp1Var10.OooO0OO), null);
                rp1VarOooO0oo2.OooOOOO(co0VarOooOOOo6, true);
                vp1 vp1Var4 = xp1Var6.OooO0O0;
                switch (vp1Var4.OooO0o0) {
                    case 1:
                        bc1Var4 = ec1.o000Oooo;
                        break;
                    case 2:
                        bc1Var4 = ec1.o000o000;
                        break;
                    case 3:
                        bc1Var4 = ec1.o000o00;
                        break;
                    case 4:
                        bc1Var4 = ec1.o000Ooo0;
                        break;
                    case 5:
                        bc1Var4 = ec1.o000OoOo;
                        break;
                    case 6:
                        bc1Var4 = ec1.o000Oo;
                        break;
                    case 7:
                        bc1Var4 = ec1.o000OoOO;
                        break;
                    case 8:
                        bc1Var4 = ec1.o000o00O;
                        break;
                    case 9:
                        bc1Var4 = ec1.o000OooO;
                        break;
                    default:
                        ec1.OooO00o(vp1Var4);
                        throw null;
                }
                rp1VarOooO0oo2.OooO0o0(new zm1(bc1Var4, (zh1) rp1VarOooO0oo2.OooO0oo, v81.OooO(co0VarOooOO02.OooO00o()), (bj1) rp1VarOooO0oo2.OooOO0, ykVar3), null);
                rp1VarOooO0oo2.OooOOOO(co0VarOooOOOo3, true);
                rp1VarOooO0oo2.OooOOO(co0VarOooOOOo14, null);
                dl0 dl0Var = new dl0();
                gf gfVar = lf.OooO0Oo;
                rp1VarOooO0oo2.OooO0o(dl0Var);
                bj1 bj1VarOooOO0 = bj1.OooOO0(co0VarOooOOOo14.OooO0O0.OooO0O0, xp1Var6.OooO0O0);
                gfVar.getClass();
                bc1 bc1Var9 = ec1.OooOOoo;
                bc1 bc1Var10 = ec1.OooOoO0;
                bc1 bc1Var11 = ec1.OooOoOO;
                bc1 bc1Var12 = ec1.Oooo00O;
                int length4 = bj1VarOooOO0.OooO0o0.length;
                if (length4 != 1) {
                    if (length4 == 2 && (iOooO0OO = bj1VarOooOO0.getType(0).OooO0OO()) == bj1VarOooOO0.getType(1).OooO0OO()) {
                        if (iOooO0OO == 6) {
                            bc1Var5 = bc1Var11;
                        } else if (iOooO0OO == 9 && bc1Var12 != null) {
                            bc1Var5 = bc1Var12;
                        }
                        u81Var = null;
                    }
                    ec1.OooO0O0(bj1VarOooOO0);
                    throw null;
                }
                int iOooO0OO2 = bj1VarOooOO0.getType(0).OooO0OO();
                if (iOooO0OO2 == 6) {
                    u81Var = null;
                    bc1Var5 = bc1Var9;
                } else {
                    if (iOooO0OO2 != 9 || bc1Var10 == null) {
                        ec1.OooO0O0(bj1VarOooOO0);
                        throw null;
                    }
                    bc1Var5 = bc1Var10;
                    u81Var = null;
                }
                co0 co0Var2 = co0VarOooOOOo;
                rp1VarOooO0oo2.OooO0o0(new y21(bc1Var5, zh1Var, u81Var, v81.OooOO0(co0VarOooOOOo14.OooO00o(), co0VarOooOOOo3.OooO00o())), dl0Var);
                int i9 = 0;
                while (true) {
                    int i10 = i8;
                    if (i9 < i10) {
                        co0 co0Var3 = co0VarOooOOOo5;
                        rp1VarOooO0oo2.OooOOO(co0Var3, Integer.valueOf(i9));
                        co0 co0VarOooO = rp1VarOooO0oo2.OooO(i9, xp1VarArr2[i9]);
                        int i11 = i9;
                        tt0 tt0Var2 = (tt0) OooO0oO.get(co0VarOooO.OooO0O0);
                        if (tt0Var2 == null) {
                            i8 = i10;
                            rp1Var = rp1VarOooO0oo2;
                        } else {
                            co0[] co0VarArr6 = {co0VarOooO};
                            p51 p51VarOooO0Oo2 = p51.OooO0Oo(tt0Var2.OooO00o(true));
                            bc1 bc1Var13 = ec1.OooO00o;
                            i8 = i10;
                            rp1 rp1Var2 = rp1VarOooO0oo2;
                            rp1Var2.OooOO0o(new bc1(49, p51VarOooO0Oo2.OooO0OO(), bj1.OooOOO0), tt0Var2, co0VarOooOOOo8, null, co0VarArr6);
                            rp1Var = rp1Var2;
                            co0VarOooO = co0VarOooOOOo8;
                        }
                        vp1 vp1Var5 = co0VarOooO.OooO0O0.OooO0O0;
                        bc1 bc1Var14 = ec1.OooO00o;
                        switch (vp1Var5.OooO0o0) {
                            case 1:
                                bc1Var6 = ec1.o000OO0O;
                                break;
                            case 2:
                                bc1Var6 = ec1.o000O0O0;
                                break;
                            case 3:
                                bc1Var6 = ec1.o000O0o0;
                                break;
                            case 4:
                                bc1Var6 = ec1.o000O0;
                                break;
                            case 5:
                                bc1Var6 = ec1.o000O00O;
                                break;
                            case 6:
                                bc1Var6 = ec1.o000Oo0;
                                break;
                            case 7:
                                bc1Var6 = ec1.o000O00;
                                break;
                            case 8:
                                bc1Var6 = ec1.o000O0oO;
                                break;
                            case 9:
                                bc1Var6 = ec1.o000O0Oo;
                                break;
                            default:
                                ec1.OooO00o(vp1Var5);
                                throw null;
                        }
                        u81 u81VarOooO00o = co0VarOooO.OooO00o();
                        u81 u81VarOooO00o2 = co0VarOooOOOo6.OooO00o();
                        co0VarOooOOOo5 = co0Var3;
                        u81 u81VarOooO00o3 = co0VarOooOOOo5.OooO00o();
                        co0 co0Var4 = co0VarOooOOOo2;
                        v81 v81Var = new v81(3);
                        v81Var.OooO0o(0, u81VarOooO00o);
                        v81Var.OooO0o(1, u81VarOooO00o2);
                        v81Var.OooO0o(2, u81VarOooO00o3);
                        rp1Var.OooO0o0(new an1(bc1Var6, zh1Var, v81Var, bj1Var), null);
                        rp1VarOooO0oo2 = rp1Var;
                        i9 = i11 + 1;
                        co0VarOooOOOo2 = co0Var4;
                        co0Var = co0Var;
                    } else {
                        co0 co0Var5 = co0Var;
                        rp1 rp1Var3 = rp1VarOooO0oo2;
                        co0 co0Var6 = co0VarOooOOOo2;
                        co0[] co0VarArr7 = {co0VarOooOO02, co0VarOooOOOo11, co0VarOooOOOo6};
                        p51 p51VarOooO0Oo3 = p51.OooO0Oo(tt0Var.OooO00o(true));
                        bc1 bc1Var15 = ec1.OooO00o;
                        bj1 bj1VarOooO0OO = p51VarOooO0Oo3.OooO0OO();
                        bj1 bj1Var2 = bj1.OooOOO0;
                        rp1Var3.OooOO0o(new bc1(53, bj1VarOooO0OO, bj1Var2), tt0Var, co0VarOooOOOo4, co0VarOooOOOo3, co0VarArr7);
                        HashMap map = OooO0oo;
                        boolean zContainsKey = map.containsKey(returnType);
                        Class cls3 = Void.TYPE;
                        if (zContainsKey) {
                            co0 co0Var7 = co0VarOooOOOo13;
                            rp1Var3.OooO0oO(co0Var7, co0VarOooOOOo4);
                            tt0 tt0Var3 = (tt0) map.get(returnType);
                            rp1Var3.OooOO0o(new bc1(50, p51.OooO0Oo(tt0Var3.OooO00o(true)).OooO0OO(), bj1Var2), tt0Var3, co0VarOooOOOo9, co0Var7, new co0[0]);
                            rp1Var3.OooOOo(co0VarOooOOOo9);
                        } else if (cls3.equals(returnType)) {
                            rp1Var3.OooOOoo();
                        } else {
                            rp1Var3.OooO0oO(co0VarOooOOOo9, co0VarOooOOOo4);
                            rp1Var3.OooOOo(co0VarOooOOOo9);
                        }
                        rp1Var3.OooO0o(dl0Var);
                        if (dl0Var.OooO0OO) {
                            qa.OooO0o(u7.OooO00o(new byte[]{56, 5, 10, 64, 66, 122, -21, 16, 52, 8, 10, 78, 70, 122}, new byte[]{89, 105, 120, 37, 35, 30, -110, 48}));
                            return null;
                        }
                        dl0Var.OooO0OO = true;
                        if (((dl0) rp1Var3.OooO0Oo) != null) {
                            rp1Var3.OooO0o(dl0Var);
                            rp1Var3.OooO0o0(new y21(ec1.OooOOo, zh1Var, null, v81.OooO0o), dl0Var);
                        }
                        rp1Var3.OooO0Oo = dl0Var;
                        if ((method2.getModifiers() & 1024) == 0) {
                            for (int i12 = 0; i12 < co0VarArr.length; i12++) {
                                co0VarArr[i12] = rp1Var3.OooO(i12, xp1VarArr2[i12]);
                            }
                            if (cls3.equals(returnType)) {
                                rp1Var3.OooOOO0(tt0VarOooO0OO, null, co0VarOooOO02, co0VarArr);
                                rp1Var3.OooOOoo();
                            } else {
                                rp1Var3.OooOOO0(tt0VarOooO0OO, co0Var5, co0VarOooOO02, co0VarArr);
                                rp1Var3.OooOOo(co0Var5);
                            }
                            method = method2;
                        } else {
                            method = method2;
                            OooO0o0(rp1Var3, method, co0Var2, co0Var6);
                        }
                        rp1 rp1VarOooO0oo3 = o0o000o2.OooO0oo(xp1Var5.OooO0OO(xp1VarOooO00o8, u7.OooO00o(new byte[]{-101, 31, -105, 6, 71, 32}, new byte[]{-24, 106, -25, 99, 53, 4, -97, 76}) + method.getName() + u7.OooO00o(new byte[]{-6}, new byte[]{-34, 99, 72, -78, 94, 115, 83, 8}) + method.getReturnType().getName().replace('.', '_').replace('[', '_').replace(';', '_'), xp1VarArr2));
                        if ((method.getModifiers() & 1024) == 0) {
                            co0 co0VarOooOO03 = rp1VarOooO0oo3.OooOO0(xp1Var5);
                            int length5 = clsArr.length;
                            co0[] co0VarArr8 = new co0[length5];
                            for (int i13 = 0; i13 < length5; i13++) {
                                co0VarArr8[i13] = rp1VarOooO0oo3.OooO(i13, xp1VarArr2[i13]);
                            }
                            if (cls3.equals(returnType)) {
                                rp1VarOooO0oo3.OooOOO0(tt0VarOooO0OO, null, co0VarOooOO03, co0VarArr8);
                                rp1VarOooO0oo3.OooOOoo();
                            } else {
                                co0 co0VarOooOOOo16 = rp1VarOooO0oo3.OooOOOo(xp1VarOooO00o8);
                                rp1VarOooO0oo3.OooOOO0(tt0VarOooO0OO, co0VarOooOOOo16, co0VarOooOO03, co0VarArr8);
                                rp1VarOooO0oo3.OooOOo(co0VarOooOOOo16);
                            }
                        } else {
                            OooO0o0(rp1VarOooO0oo3, method, rp1VarOooO0oo3.OooOOOo(xp1.OooOOO), rp1VarOooO0oo3.OooOOOo(xp1Var2));
                        }
                        i5 = i7 + 1;
                        tt0VarOooO0OO2 = tt0Var;
                        xp1Var3 = xp1Var5;
                        o0o000o = o0o000o2;
                        arrayListOooO0OO = arrayList;
                        ykVar = ykVar3;
                        strOooO00o = str3;
                        xp1VarOooO00o7 = xp1Var9;
                        xp1VarOooO00o5 = xp1Var11;
                        xp1VarOooO00o6 = xp1Var12;
                        xp1VarOooO00o4 = xp1Var13;
                        xp1VarOooO00o = xp1Var;
                        ykVar2 = ykVar4;
                    }
                }
            }
            o0O000O o0o000o3 = o0o000o;
            xp1 xp1Var14 = xp1VarOooO00o;
            xp1 xp1Var15 = xp1Var3;
            String strConcat = strOooO00o.concat(u7.OooO00o(new byte[]{-19, -107, -6, -50, 13, -112, 69, 93, -90, -106}, new byte[]{-61, -14, -97, -96, 104, -30, 36, 41}));
            xp1[] xp1VarArr3 = new xp1[0];
            uq uqVarOooo0 = o0o000o3.Oooo0(xp1Var15);
            if (uqVarOooo0.OooO0O0) {
                qa.OooO0OO(u7.OooO00o(new byte[]{9, 101, 3, 30, 73, -89, 37, -57, 12, 108, 18, 23, 73, -79, 57, -125, 82, 41}, new byte[]{104, 9, 113, 123, 40, -61, 92, -25}), xp1Var15);
                return null;
            }
            uqVarOooo0.OooO0O0 = true;
            uqVarOooo0.OooO0OO = 1;
            uqVarOooo0.OooO0Oo = xp1Var14;
            uqVarOooo0.OooO0o0 = strConcat;
            uqVarOooo0.OooO0o = new bq1(xp1VarArr3);
            t51Var = this;
            o0o000o = o0o000o3;
            it2 = it3;
            b = 13;
        }
        return o0o000o;
    }

    public final void OooO0O0(File file) throws IOException {
        if (file.exists()) {
            return;
        }
        byte[] bArrOooOoO = OooO00o().OooOoO();
        file.createNewFile();
        JarOutputStream jarOutputStream = new JarOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        try {
            JarEntry jarEntry = new JarEntry(u7.OooO00o(new byte[]{84, 21, -33, -103, 50, 13, 50, -93, 83, 28, -58}, new byte[]{55, 121, -66, -22, 65, 104, 65, -115}));
            jarEntry.setSize(bArrOooOoO.length);
            jarOutputStream.putNextEntry(jarEntry);
            try {
                jarOutputStream.write(bArrOooOoO);
            } finally {
                jarOutputStream.closeEntry();
            }
        } finally {
            jarOutputStream.close();
        }
    }
}

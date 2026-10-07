package com.cmaster.cloner;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pq {
    public static final oO00OOOo OooO0O0 = new oO00OOOo(3);
    public lq OooO00o;

    public static void OooO0OO(MessageDigest messageDigest, Class cls, Class cls2) throws SecurityException {
        Method[] declaredMethods = cls.getDeclaredMethods();
        messageDigest.update(cls.getName().getBytes());
        for (Method method : declaredMethods) {
            messageDigest.update(method.getName().getBytes());
            for (Class<?> cls3 : method.getParameterTypes()) {
                messageDigest.update(cls3.getName().getBytes());
            }
            messageDigest.update(method.getReturnType().getName().getBytes());
        }
        messageDigest.update(cls2.getName().getBytes());
        for (Method method2 : cls2.getDeclaredMethods()) {
            if (Modifier.isAbstract(method2.getModifiers())) {
                messageDigest.update(method2.getName().getBytes());
                for (Class<?> cls4 : method2.getParameterTypes()) {
                    messageDigest.update(cls4.getName().getBytes());
                }
                messageDigest.update(method2.getReturnType().getName().getBytes());
            }
        }
    }

    public final synchronized void OooO00o() {
        try {
            if (this.OooO00o != null) {
                return;
            }
            System.currentTimeMillis();
            y7 y7Var = y7.OooO0o0;
            y7Var.OooO0O0();
            ConcurrentHashMap concurrentHashMap = y7Var.OooO00o;
            LinkedHashMap linkedHashMap = new LinkedHashMap(concurrentHashMap.size());
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(u7.OooO00o(new byte[]{102, -13, -86}, new byte[]{43, -73, -97, -35, -122, 35, -39, -18}));
                messageDigest.update(Build.VERSION.SDK_INT >= 26 ? (byte) 1 : (byte) 0);
                messageDigest.update((u7.OooO00o(new byte[]{-52, 9, -96, -15, -42, -36, 112, -76, -103, 90, -12, -90, -16, -21, 65, -105}, new byte[]{-88, 107, -62, -112, -75, -71, 17, -43}) + y7.OooO0Oo + Build.FINGERPRINT + 2).getBytes());
                for (x7 x7Var : concurrentHashMap.values()) {
                    Class cls = x7Var.OooO0OO;
                    if (cls != null) {
                        linkedHashMap.put(x7Var.OooO0Oo, cls);
                        OooO0OO(messageDigest, x7Var.OooO0Oo, x7Var.OooO0OO);
                    }
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(String.format(u7.OooO00o(new byte[]{124, 106, -43, -25}, new byte[]{89, 90, -25, -97, 110, 104, -38, -29}), Byte.valueOf(b)));
                }
                lq lqVar = new lq(sb.toString());
                this.OooO00o = lqVar;
                File file = lqVar.OooO00o;
                if (file.exists()) {
                    if (file.canWrite()) {
                        file.setWritable(false);
                    }
                    return;
                }
                zz.OooO0oo(this.OooO00o.OooO0O0);
                OooO0O0(linkedHashMap);
                if (file.exists() && file.canWrite()) {
                    file.setWritable(false);
                }
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        } finally {
        }
    }

    public final void OooO0O0(LinkedHashMap linkedHashMap) {
        System.currentTimeMillis();
        String name = this.OooO00o.OooO0OO.getName();
        File file = this.OooO00o.OooO00o;
        bn bnVar = y7.OooO0o0.OooO0O0;
        file.getParentFile().mkdirs();
        String parent = file.getParent();
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        File file2 = new File(parent, rj.OooO0oo(new byte[]{12, -27, 34, -47}, new byte[]{34, -111, 79, -95, 90, 105, -73, -17}, sb));
        if (file2.exists()) {
            file2.delete();
        }
        try {
            t51 t51Var = new t51(linkedHashMap);
            t51Var.OooO0OO = u7.OooO00o(new byte[]{30, -74, 49, -113, -74}, new byte[]{82, -39, 82, -18, -38, -109, -65, -84});
            t51Var.OooO0O0 = bnVar;
            if (Build.VERSION.SDK_INT >= 26) {
                byte[] bArrOooOoO = t51Var.OooO00o().OooOoO();
                byte[] bytes = name.getBytes(StandardCharsets.UTF_8);
                int i = lq.OooO0Oo;
                int length = bArrOooOoO.length;
                int length2 = bytes.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    if (i3 >= length2) {
                        i3 = 0;
                    }
                    bArrOooOoO[i2] = (byte) (bArrOooOoO[i2] ^ bytes[i3]);
                    i2++;
                    i3++;
                }
                zz.OooOOO(file2, bArrOooOoO);
            } else {
                t51Var.OooO0O0(file2);
            }
            file2.renameTo(file);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final byte[] OooO0Oo() throws IOException {
        OooO00o();
        File file = this.OooO00o.OooO00o;
        String str = zz.OooO00o;
        FileInputStream fileInputStream = new FileInputStream(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    zz.OooO0O0(fileInputStream);
                    zz.OooO0O0(byteArrayOutputStream);
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            zz.OooO0O0(fileInputStream);
            zz.OooO0O0(byteArrayOutputStream);
            throw th;
        }
    }
}

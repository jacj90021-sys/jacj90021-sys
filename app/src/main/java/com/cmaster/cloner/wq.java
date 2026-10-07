package com.cmaster.cloner;

import android.os.Build;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class wq {
    public static final BaseDexClassLoader OooO00o;

    static {
        pe peVar;
        new ConcurrentHashMap();
        File file = qx1.OooO0o0.OooO00o;
        pe peVar2 = null;
        BaseDexClassLoader baseDexClassLoaderOooOO0o = null;
        if (!file.exists()) {
            synchronized (wq.class) {
                try {
                    try {
                        peVar = new pe(e92.OooO0o);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Exception e) {
                    e = e;
                }
                try {
                    byte[] bArrOooo00o = ((rx1) rx1.OooO0o.OooO0O0()).OooO0o0.Oooo00o();
                    file.getParentFile().mkdirs();
                    File file2 = new File(file.getParentFile(), file.getName() + u7.OooO00o(new byte[]{124, -116, -109, 61}, new byte[]{82, -8, -2, 77, -70, 99, 38, 30}));
                    zz.OooOOO(file2, bArrOooo00o);
                    file2.renameTo(file);
                    peVar.close();
                    zz.OooO0O0(peVar);
                } catch (Exception e2) {
                    e = e2;
                    throw new RuntimeException(e);
                } catch (Throwable th2) {
                    th = th2;
                    peVar2 = peVar;
                    zz.OooO0O0(peVar2);
                    throw th;
                }
            }
        }
        if (file.canWrite()) {
            file.setWritable(false);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                ByteBuffer byteBufferOooOO0O = zz.OooOO0O(file, qx1.OooO0o0.OooO0OO.getName().getBytes(StandardCharsets.UTF_8));
                byteBufferOooOO0O.position(0);
                o0000O0.OooOOO0();
                baseDexClassLoaderOooOO0o = o0000O0.OooOO0o(byteBufferOooOO0O, wq.class.getClassLoader());
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        } else {
            baseDexClassLoaderOooOO0o = new DexClassLoader(file.getAbsolutePath(), file.getParent(), file.getParent(), e92.OooO00o.getClassLoader().getParent());
        }
        OooO00o = baseDexClassLoaderOooOO0o;
    }
}

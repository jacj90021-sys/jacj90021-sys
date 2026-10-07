package com.cmaster.cloner;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class a51 {
    public static final HashMap OooO0o0 = new HashMap();
    public final boolean OooO00o;
    public final File OooO0O0;
    public final Lock OooO0OO;
    public FileChannel OooO0Oo;

    public a51(File file, String str, boolean z) {
        Lock lock;
        this.OooO00o = z;
        this.OooO0O0 = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = OooO0o0;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO0OO = lock;
    }

    public final void OooO00o(boolean z) throws IOException {
        this.OooO0OO.lock();
        if (z) {
            File file = this.OooO0O0;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.OooO0Oo = channel;
            } catch (IOException e) {
                this.OooO0Oo = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void OooO0O0() throws IOException {
        try {
            FileChannel fileChannel = this.OooO0Oo;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.OooO0OO.unlock();
    }
}

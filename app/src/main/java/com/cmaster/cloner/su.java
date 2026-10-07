package com.cmaster.cloner;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class su {
    public static final Object OooOO0 = new Object();
    public static volatile su OooOO0O;
    public final eo OooO;
    public final ReentrantReadWriteLock OooO00o;
    public final m3 OooO0O0;
    public volatile int OooO0OO;
    public final Handler OooO0Oo;
    public final ru OooO0o;
    public final ou OooO0o0;
    public final je OooO0oO;
    public final int OooO0oo;

    public su(t00 t00Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.OooO00o = reentrantReadWriteLock;
        this.OooO0OO = 3;
        ru ruVar = (ru) t00Var.OooO0O0;
        this.OooO0o = ruVar;
        int i = t00Var.OooO00o;
        this.OooO0oo = i;
        this.OooO = (eo) t00Var.OooO0OO;
        this.OooO0Oo = new Handler(Looper.getMainLooper());
        this.OooO0O0 = new m3(0);
        this.OooO0oO = new je(6);
        ou ouVar = new ou(this);
        this.OooO0o0 = ouVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.OooO0OO = 0;
            } catch (Throwable th) {
                this.OooO00o.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (OooO0O0() == 0) {
            try {
                ruVar.OooO0Oo(new nu(ouVar));
            } catch (Throwable th2) {
                OooO0Oo(th2);
            }
        }
    }

    public static su OooO00o() {
        su suVar;
        synchronized (OooOO0) {
            try {
                suVar = OooOO0O;
                if (!(suVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return suVar;
    }

    public final int OooO0O0() {
        this.OooO00o.readLock().lock();
        try {
            return this.OooO0OO;
        } finally {
            this.OooO00o.readLock().unlock();
        }
    }

    public final void OooO0OO() {
        if (!(this.OooO0oo == 1)) {
            qa.OooO0o("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
            return;
        }
        if (OooO0O0() == 1) {
            return;
        }
        this.OooO00o.writeLock().lock();
        try {
            if (this.OooO0OO == 0) {
                return;
            }
            this.OooO0OO = 0;
            this.OooO00o.writeLock().unlock();
            ou ouVar = this.OooO0o0;
            su suVar = ouVar.OooO00o;
            try {
                suVar.OooO0o.OooO0Oo(new nu(ouVar));
            } catch (Throwable th) {
                suVar.OooO0Oo(th);
            }
        } finally {
            this.OooO00o.writeLock().unlock();
        }
    }

    public final void OooO0Oo(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.OooO00o.writeLock().lock();
        try {
            this.OooO0OO = 2;
            arrayList.addAll(this.OooO0O0);
            this.OooO0O0.clear();
            this.OooO00o.writeLock().unlock();
            this.OooO0Oo.post(new oa(arrayList, this.OooO0OO, th));
        } catch (Throwable th2) {
            this.OooO00o.writeLock().unlock();
            throw th2;
        }
    }

    public final void OooO0o(qu quVar) {
        fy2.OooO00o(quVar, "initCallback cannot be null");
        this.OooO00o.writeLock().lock();
        try {
            if (this.OooO0OO == 1 || this.OooO0OO == 2) {
                this.OooO0Oo.post(new oa(Arrays.asList(quVar), this.OooO0OO, (Throwable) null));
            } else {
                this.OooO0O0.add(quVar);
            }
            this.OooO00o.writeLock().unlock();
        } catch (Throwable th) {
            this.OooO00o.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096 A[Catch: all -> 0x0079, TryCatch #2 {all -> 0x0079, blocks: (B:35:0x0051, B:38:0x0056, B:40:0x005a, B:42:0x0067, B:49:0x0086, B:51:0x0090, B:53:0x0093, B:55:0x0096, B:57:0x00a6, B:58:0x00a9), top: B:107:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8 A[Catch: all -> 0x00ef, TRY_ENTER, TryCatch #3 {all -> 0x00ef, blocks: (B:62:0x00b8, B:65:0x00c0, B:68:0x00c8, B:47:0x007c), top: B:109:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence OooO0o0(java.lang.CharSequence r12, int r13, int r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.su.OooO0o0(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }
}

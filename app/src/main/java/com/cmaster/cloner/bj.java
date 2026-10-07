package com.cmaster.cloner;

import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class bj implements r50 {
    public final Object OooO0Oo;
    public volatile Object OooO0o0;

    public bj() {
        this.OooO0Oo = new CopyOnWriteArraySet();
    }

    public sr OooO00o() {
        if (((sr) this.OooO0o0) == null) {
            synchronized (this) {
                try {
                    if (((sr) this.OooO0o0) == null) {
                        File cacheDir = ((hg) ((xb1) this.OooO0Oo).OooO0o0).OooO0o0.getCacheDir();
                        bs bsVar = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            bsVar = new bs(file);
                        }
                        this.OooO0o0 = bsVar;
                    }
                    if (((sr) this.OooO0o0) == null) {
                        this.OooO0o0 = new v03();
                    }
                } finally {
                }
            }
        }
        return (sr) this.OooO0o0;
    }

    @Override // com.cmaster.cloner.r50
    public Object get() {
        if (this.OooO0o0 == null) {
            synchronized (this) {
                try {
                    if (this.OooO0o0 == null) {
                        Object obj = ((r50) this.OooO0Oo).get();
                        zx2.OooO0OO(obj, "Argument must not be null");
                        this.OooO0o0 = obj;
                    }
                } finally {
                }
            }
        }
        return this.OooO0o0;
    }

    public /* synthetic */ bj(Object obj) {
        this.OooO0Oo = obj;
    }
}

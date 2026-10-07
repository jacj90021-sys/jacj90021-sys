package com.cmaster.cloner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nz implements md1 {
    public final File OooO0Oo;
    public boolean OooO0o;
    public final FileOutputStream OooO0o0;

    public nz(File file) {
        this.OooO0Oo = file;
        this.OooO0o0 = new FileOutputStream(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.OooO0o) {
            this.OooO0o0.close();
            this.OooO0o = true;
        }
        this.OooO0Oo.delete();
    }
}

package com.cmaster.cloner;

import android.util.Log;
import java.io.Writer;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class dp0 extends Writer {
    public final StringBuilder OooO0o0 = new StringBuilder(128);
    public final String OooO0Oo = "FragmentManager";

    public final void OooO0OO() {
        StringBuilder sb = this.OooO0o0;
        if (sb.length() > 0) {
            Log.d(this.OooO0Oo, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        OooO0OO();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        OooO0OO();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                OooO0OO();
            } else {
                this.OooO0o0.append(c);
            }
        }
    }
}

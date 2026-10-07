package com.cmaster.cloner;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class px extends MediaDataSource {
    public long OooO0Oo;
    public final /* synthetic */ ux OooO0o0;

    public px(ux uxVar) {
        this.OooO0o0 = uxVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        ux uxVar = this.OooO0o0;
        DataInputStream dataInputStream = uxVar.OooO0Oo;
        if (i2 == 0) {
            return 0;
        }
        if (j >= 0) {
            try {
                long j2 = this.OooO0Oo;
                if (j2 != j) {
                    if (j2 < 0 || j < j2 + dataInputStream.available()) {
                        uxVar.OooO0o(j);
                        this.OooO0Oo = j;
                    }
                }
                if (i2 > dataInputStream.available()) {
                    i2 = dataInputStream.available();
                }
                int i3 = uxVar.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.OooO0Oo += i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.OooO0Oo = -1L;
            return -1;
        }
        return -1;
    }
}

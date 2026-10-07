package com.cmaster.cloner;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class ux extends qx {
    public ux(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.OooO0Oo.mark(Integer.MAX_VALUE);
        } else {
            ra.OooOOO("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void OooO0o(long j) throws IOException {
        int i = this.OooO0o;
        if (i > j) {
            this.OooO0o = 0;
            this.OooO0Oo.reset();
        } else {
            j -= i;
        }
        OooO0OO((int) j);
    }

    public ux(byte[] bArr) {
        super(bArr);
        this.OooO0Oo.mark(Integer.MAX_VALUE);
    }
}

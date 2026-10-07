package com.cmaster.cloner;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class iu2 {
    public static void OooO00o(FileDescriptor fileDescriptor, byte[] bArr, int i) throws IOException, ErrnoException {
        fn2.OooO0oO(bArr.length, i);
        if (i == 0) {
            return;
        }
        int i2 = 0;
        while (i > 0) {
            try {
                int iWrite = Os.write(fileDescriptor, bArr, i2, i);
                i -= iWrite;
                i2 += iWrite;
            } catch (ErrnoException e) {
                throw e.rethrowAsIOException();
            }
        }
    }
}

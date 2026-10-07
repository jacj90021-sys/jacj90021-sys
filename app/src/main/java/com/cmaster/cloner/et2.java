package com.cmaster.cloner;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class et2 {
    public static void OooO00o(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long OooO0O0(InputStream inputStream, OutputStream outputStream, boolean z) throws IOException {
        byte[] bArr = new byte[1024];
        long j = 0;
        while (true) {
            try {
                int i = inputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                j += i;
                outputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                if (z) {
                    OooO00o(inputStream);
                    OooO00o(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            OooO00o(inputStream);
            OooO00o(outputStream);
        }
        return j;
    }
}

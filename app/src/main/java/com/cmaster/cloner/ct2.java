package com.cmaster.cloner;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ct2 {
    public static void OooO00o(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooO0O0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8024];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}

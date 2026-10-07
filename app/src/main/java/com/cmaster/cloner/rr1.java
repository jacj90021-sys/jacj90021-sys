package com.cmaster.cloner;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class rr1 {
    public static final Charset OooO00o = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void OooO00o(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("not a readable directory: " + file);
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                OooO00o(file2);
            }
            if (!file2.delete()) {
                throw new IOException("failed to delete file: " + file2);
            }
        }
    }
}

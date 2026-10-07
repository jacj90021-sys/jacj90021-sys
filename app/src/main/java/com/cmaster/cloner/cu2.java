package com.cmaster.cloner;

import android.net.Uri;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class cu2 {
    public static void OooO00o(Uri uri, File file) throws IOException {
        InputStream inputStreamOpenStream;
        InputStream fileInputStream;
        String scheme = uri.getScheme();
        if (TextUtils.equals(scheme, sn2.OooO00o("xW/g/GKmRg==\n", "pgCOiAfIMqA=\n"))) {
            inputStreamOpenStream = new FileInputStream(e2.OooO.OooO00o.getContentResolver().openFileDescriptor(uri, sn2.OooO00o("ag==\n", "GKEo5TgOwgk=\n")).getFileDescriptor());
        } else if (TextUtils.equals(scheme, sn2.OooO00o("DogKag==\n", "aOFmDyEl2fg=\n"))) {
            String path = uri.getPath();
            if (path == null) {
                throw new FileNotFoundException(uri.toString());
            }
            if (path.startsWith(sn2.OooO00o("58qoc9NUI0CXyrVkxE8=\n", "yKvGF6E7SiQ=\n"))) {
                fileInputStream = e2.OooO.OooO00o.getAssets().open(path.replace(sn2.OooO00o("VMM1i9DBOG8kwyicx9p+\n", "e6Jb76KuUQs=\n"), ""));
            } else {
                File file2 = new File(path);
                if (!file2.canRead()) {
                    throw new FileNotFoundException(sn2.OooO00o("oTBujCyjtOfv\n", "z18arF7G1YM=\n").concat(path));
                }
                if (file2.renameTo(file)) {
                    return;
                } else {
                    fileInputStream = new FileInputStream(file2);
                }
            }
            inputStreamOpenStream = fileInputStream;
        } else {
            inputStreamOpenStream = new URL(uri.toString()).openStream();
        }
        if (inputStreamOpenStream == null) {
            throw new FileNotFoundException(uri.toString());
        }
        file.getParentFile().mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStreamOpenStream);
        oOO0O0O0.OooO0O0(bufferedInputStream, fileOutputStream);
        bufferedInputStream.close();
        fileOutputStream.close();
    }
}

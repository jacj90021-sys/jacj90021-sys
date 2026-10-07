package com.cmaster.cloner;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class oOO0O0O0 {
    public static final int[] OooO00o = {android.R.attr.name, android.R.attr.tint, android.R.attr.height, android.R.attr.width, android.R.attr.alpha, android.R.attr.autoMirrored, android.R.attr.tintMode, android.R.attr.viewportWidth, android.R.attr.viewportHeight};
    public static final int[] OooO0O0 = {android.R.attr.name, android.R.attr.pivotX, android.R.attr.pivotY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.translateX, android.R.attr.translateY};
    public static final int[] OooO0OO = {android.R.attr.name, android.R.attr.fillColor, android.R.attr.pathData, android.R.attr.strokeColor, android.R.attr.strokeWidth, android.R.attr.trimPathStart, android.R.attr.trimPathEnd, android.R.attr.trimPathOffset, android.R.attr.strokeLineCap, android.R.attr.strokeLineJoin, android.R.attr.strokeMiterLimit, android.R.attr.strokeAlpha, android.R.attr.fillAlpha, android.R.attr.fillType};
    public static final int[] OooO0Oo = {android.R.attr.name, android.R.attr.pathData, android.R.attr.fillType};
    public static final int[] OooO0o0 = {android.R.attr.drawable};
    public static final int[] OooO0o = {android.R.attr.name, android.R.attr.animation};

    public static void OooO00o(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooO0O0(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static void OooO0OO(ApplicationInfo applicationInfo, File file) {
        try {
            file.getParentFile().mkdirs();
            FileInputStream fileInputStream = new FileInputStream(applicationInfo.sourceDir);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    OooO0O0(fileInputStream, fileOutputStream);
                    fileOutputStream.close();
                    fileInputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void OooO0Oo(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    fileOutputStream.write(bArr, 0, i);
                }
            }
        } finally {
            OooO00o(inputStream);
            OooO00o(fileOutputStream);
        }
    }

    public static void OooO0o(File file, String str, File file2) throws Throwable {
        ZipFile zipFile = null;
        try {
            ZipFile zipFile2 = new ZipFile(file);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                String canonicalPath = file2.getCanonicalPath();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    if (zipEntryNextElement.getName().startsWith(str) && !zipEntryNextElement.isDirectory()) {
                        File file3 = new File(file2, zipEntryNextElement.getName());
                        if (!file3.getCanonicalPath().startsWith(canonicalPath)) {
                            throw new IOException(qn2.OooO00o("93MjS6GQ9UOkZiFKu9k=\n", "hBZAPtP5gTo=\n") + zipEntryNextElement.getName());
                        }
                        file3.getParentFile().mkdirs();
                        OooO0Oo(zipFile2.getInputStream(zipEntryNextElement), new FileOutputStream(file3));
                    }
                }
                try {
                    zipFile2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
                if (zipFile != null) {
                    try {
                        zipFile.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void OooO0o0(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.isFile() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    OooO0o0(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static boolean OooO0oO(Context context) {
        return !qn2.OooO00o("ICn47mJfgh03I+fuYl6MACY0\n", "Q0aVwAEy424=\n").equals(context.getPackageName());
    }
}

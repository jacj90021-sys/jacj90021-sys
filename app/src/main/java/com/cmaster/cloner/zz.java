package com.cmaster.cloner;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.StandardCharsets;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class zz {
    public static final String OooO00o = u7.OooO00o(new byte[]{25, -14, 121, -68}, new byte[]{55, -109, 9, -41, -94, -51, -96, 8});

    public static boolean OooO(String str) {
        String strOooO00o;
        if (str != null) {
            if (TextUtils.isEmpty(str) || u7.OooO00o(new byte[]{45}, new byte[]{3, 47, -45, 103, 89, -78, -56, 127}).equals(str) || u7.OooO00o(new byte[]{-62, 28}, new byte[]{-20, 50, -16, -76, -56, 57, -30, 22}).equals(str)) {
                strOooO00o = u7.OooO00o(new byte[]{13, -68, 30, 27, -68, -70, 125, -110, 12}, new byte[]{37, -43, 112, 109, -35, -42, 20, -10});
            } else {
                StringBuilder sb = new StringBuilder(str.length());
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt == 0 || cCharAt == '/') {
                        sb.append('_');
                    } else {
                        sb.append(cCharAt);
                    }
                }
                byte[] bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
                if (bytes.length > 255) {
                    while (bytes.length > 252) {
                        sb.deleteCharAt(sb.length() / 2);
                        bytes = sb.toString().getBytes(StandardCharsets.UTF_8);
                    }
                    sb.insert(sb.length() / 2, u7.OooO00o(new byte[]{-123, 1, -102}, new byte[]{-85, 47, -76, 3, 59, 26, -24, 127}));
                }
                strOooO00o = sb.toString();
            }
            if (str.equals(strOooO00o)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(File file, String str) throws Throwable {
        File[] fileArrListFiles = {file};
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                fileArrListFiles = file.listFiles(new xz());
            }
            for (File file2 : fileArrListFiles) {
                ZipFile zipFile = null;
                try {
                    ZipFile zipFile2 = new ZipFile(file2);
                    try {
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile2.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (name.startsWith(u7.OooO00o(new byte[]{-52, 89, 87, -50}, new byte[]{-96, 48, 53, -31, 16, -1, -50, 101})) && !zipEntryNextElement.isDirectory() && name.endsWith(str)) {
                                OooO0O0(zipFile2);
                                return true;
                            }
                        }
                        OooO0O0(zipFile2);
                    } catch (Exception unused) {
                        zipFile = zipFile2;
                        OooO0O0(zipFile);
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        OooO0O0(zipFile);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return false;
    }

    public static void OooO0O0(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void OooO0OO(File file, File file2) throws Throwable {
        File[] fileArrListFiles;
        if (file != null) {
            try {
                if (file2.isDirectory()) {
                    File parentFile = file2.getParentFile();
                    File file3 = new File(parentFile, u7.OooO00o(new byte[]{45, 10, 23, -61, 63, -128, 36, -2, 71, 0, 10}, new byte[]{3, 105, 120, -77, 70, -44, 73, -114}));
                    File file4 = new File(parentFile, u7.OooO00o(new byte[]{-77, -124, -124, 60, 120, 88, -33, -4, -16, -128, -95, 39, 109}, new byte[]{-99, -16, -27, 78, 31, 61, -85, -88}));
                    if (file3.exists()) {
                        OooO0o(file3);
                    }
                    if (file4.exists()) {
                        OooO0o(file4);
                    }
                    file3.mkdirs();
                    if (file3.exists()) {
                        OooO0Oo(file, file3);
                        fileArrListFiles = file3.listFiles(new yz(0));
                    } else {
                        fileArrListFiles = null;
                    }
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        if (!file2.renameTo(file4)) {
                            OooO0o(file3);
                        } else {
                            if (file3.renameTo(file2)) {
                                OooO0o(file4);
                                return;
                            }
                            file4.renameTo(file2);
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            OooO0Oo(file, file2);
        }
    }

    public static void OooO0Oo(File file, File file2) throws Throwable {
        if (file != null) {
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    if (file2.isDirectory()) {
                        file2 = new File(file2, file.getName());
                    }
                    OooO0o0(file, file2);
                    return;
                }
                return;
            }
            File[] fileArrListFiles = file.listFiles(new yz(1));
            if (fileArrListFiles != null) {
                for (File file3 : fileArrListFiles) {
                    if (file3.isFile()) {
                        OooO0o0(file3, new File(file2.isDirectory() ? file2 : file2.getParentFile(), file3.getName()));
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053 A[LOOP:0: B:16:0x0051->B:17:0x0053, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int OooO0o(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 0
            if (r0 == 0) goto L63
            if (r6 == 0) goto L31
            java.lang.String r0 = r6.getParent()     // Catch: java.lang.Exception -> L46
            if (r0 != 0) goto L11
            r2 = r6
            goto L22
        L11:
            java.io.File r0 = r6.getParentFile()     // Catch: java.lang.Exception -> L46
            java.io.File r0 = r0.getCanonicalFile()     // Catch: java.lang.Exception -> L46
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = r6.getName()     // Catch: java.lang.Exception -> L46
            r2.<init>(r0, r3)     // Catch: java.lang.Exception -> L46
        L22:
            java.io.File r0 = r2.getCanonicalFile()     // Catch: java.lang.Exception -> L46
            java.io.File r2 = r2.getAbsoluteFile()     // Catch: java.lang.Exception -> L46
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Exception -> L46
            r0 = r0 ^ 1
            goto L47
        L31:
            r0 = 21
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L46
            r0 = {x006c: FILL_ARRAY_DATA , data: [-19, -11, -18, -76, -46, -128, 57, -96, -33, -68, -20, -66, -122, -51, 46, -74, -117, -14, -9, -67, -98} // fill-array     // Catch: java.lang.Exception -> L46
            r2 = 8
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L46
            r2 = {x007c: FILL_ARRAY_DATA , data: [-85, -100, -126, -47, -14, -19, 76, -45} // fill-array     // Catch: java.lang.Exception -> L46
            java.lang.String r0 = com.cmaster.cloner.u7.OooO00o(r0, r2)     // Catch: java.lang.Exception -> L46
            com.cmaster.cloner.qa.OooOOO0(r0)     // Catch: java.lang.Exception -> L46
        L46:
            r0 = r1
        L47:
            if (r0 != 0) goto L63
            java.lang.String[] r0 = r6.list()
            if (r0 == 0) goto L63
            int r2 = r0.length
            r3 = r1
        L51:
            if (r1 >= r2) goto L62
            r4 = r0[r1]
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r4)
            int r4 = OooO0o(r5)
            int r3 = r3 + r4
            int r1 = r1 + 1
            goto L51
        L62:
            r1 = r3
        L63:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L6b
            int r1 = r1 + 1
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.zz.OooO0o(java.io.File):int");
    }

    public static void OooO0o0(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    FileChannel channel = fileInputStream2.getChannel();
                    FileChannel channel2 = fileOutputStream.getChannel();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
                    while (true) {
                        byteBufferAllocate.clear();
                        if (channel.read(byteBufferAllocate) == -1) {
                            OooO0O0(fileInputStream2);
                            OooO0O0(fileOutputStream);
                            return;
                        } else {
                            byteBufferAllocate.limit(byteBufferAllocate.position());
                            byteBufferAllocate.position(0);
                            channel2.write(byteBufferAllocate);
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    OooO0O0(fileInputStream);
                    OooO0O0(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void OooO0oO(String str) {
        OooO0o(new File(str));
    }

    public static void OooO0oo(File file) {
        File[] fileArrListFiles;
        try {
            if (!file.isFile() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    OooO0oo(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static void OooOO0(File file, boolean z) {
        if (!file.exists()) {
            file.mkdirs();
        }
        if (z) {
            file.setExecutable(true, false);
        }
    }

    public static ByteBuffer OooOO0O(File file, byte[] bArr) throws Throwable {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((int) file.length());
        int length = bArr.length;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr2 = new byte[4096];
                int i = 0;
                while (true) {
                    int i2 = fileInputStream2.read(bArr2);
                    if (i2 == -1) {
                        OooO0O0(fileInputStream2);
                        return byteBufferAllocateDirect;
                    }
                    for (int i3 = 0; i3 < i2; i3++) {
                        if (i >= length) {
                            i = 0;
                        }
                        bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i]);
                        i++;
                    }
                    byteBufferAllocateDirect.put(bArr2, 0, i2);
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                OooO0O0(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static boolean OooOO0o(File file, File file2) {
        if (file2.isDirectory() && file.isDirectory()) {
            File file3 = new File(file2.getParentFile(), u7.OooO00o(new byte[]{126, 45, -79, 66, 75, 21, 39, 20, 61, 41, -108, 89, 94, 66}, new byte[]{80, 89, -48, 48, 44, 112, 83, 64}));
            if (file2.renameTo(file3)) {
                if (file.renameTo(file2)) {
                    OooO0o(file3);
                    return true;
                }
                file3.renameTo(file2);
                return false;
            }
            OooO0o(file);
        }
        return false;
    }

    public static void OooOOO(File file, byte[] bArr) throws Throwable {
        Throwable th;
        FileChannel channel;
        ReadableByteChannel readableByteChannelNewChannel;
        FileOutputStream fileOutputStream = null;
        try {
            readableByteChannelNewChannel = Channels.newChannel(new ByteArrayInputStream(bArr));
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    channel = fileOutputStream2.getChannel();
                    try {
                        channel.transferFrom(readableByteChannelNewChannel, 0L, bArr.length);
                        fileOutputStream2.close();
                        if (readableByteChannelNewChannel != null) {
                            readableByteChannelNewChannel.close();
                        }
                        channel.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (readableByteChannelNewChannel != null) {
                            readableByteChannelNewChannel.close();
                        }
                        if (channel == null) {
                            throw th;
                        }
                        channel.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    channel = null;
                }
            } catch (Throwable th4) {
                th = th4;
                channel = null;
            }
        } catch (Throwable th5) {
            th = th5;
            channel = null;
            readableByteChannelNewChannel = null;
        }
    }

    public static void OooOOO0(File file, InputStream inputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr, 0, 1024);
            if (i == -1) {
                bufferedOutputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, i);
        }
    }
}

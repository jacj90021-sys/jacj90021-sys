package com.cmaster.cloner;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class pe implements Closeable {
    public final /* synthetic */ int OooO0Oo = 0;
    public Object OooO0o;
    public Object OooO0o0;

    public pe(File file) throws InterruptedException, IOException {
        file.getParentFile().mkdirs();
        this.OooO0o0 = new FileOutputStream(file);
        int i = 0;
        FileLock fileLockLock = null;
        Exception e = null;
        while (i < 3) {
            i++;
            try {
                fileLockLock = ((FileOutputStream) this.OooO0o0).getChannel().lock();
                if (fileLockLock != null) {
                    break;
                }
            } catch (Exception e2) {
                e = e2;
                u7.OooO00o(new byte[]{115, -89, 93, 28, -51, -66, 47, -43, 123, -95, 66, 117, -9, -80, 50, -4, 117, -90, 9, 51, -62, -79, 44, -4, 112, -30, 93, 60, -50, -67, 122, -88, 36}, new byte[]{20, -62, 41, 85, -93, -40, 64, -103});
                int i2 = fp0.OooO00o;
            }
            try {
                Thread.sleep(10L);
            } catch (Exception unused) {
                u7.OooO00o(new byte[]{-124, 109, 23, -108, 98, -37, -65, 67, -116, 107, 8, -3, 88, -43, -94, 106, -126, 108, 67, -82, 96, -40, -75, 127, -61, 109, 27, -66, 105, -51, -92, 102, -116, 102}, new byte[]{-29, 8, 99, -35, 12, -67, -48, 15});
                int i3 = fp0.OooO00o;
            }
        }
        if (fileLockLock != null) {
            this.OooO0o = fileLockLock;
            return;
        }
        throw new IOException(u7.OooO00o(new byte[]{-71, 16, -21, -68, -3, 36, -102, 98, -107, 26, -32, -89, -20, 63, -43, 73, -41, 63, -20, -69, -3, 26, -43, 68, -122, 49, -32, -69, -24, 51, -56, 7, -127, 22, -26, -68, -72, 48, -45, 75, -120, 89, -29, -74, -15, 58, -33, 67, -41, 89}, new byte[]{-19, 121, -123, -41, -104, 86, -70, 39}) + file.getAbsolutePath(), e);
    }

    public static void OooO0OO(File file, String str, LinkedHashMap linkedHashMap) {
        if (file.isFile()) {
            sa.OooO0Oo(file, " is directory");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        if (fileArrListFiles.length == 0) {
            linkedHashMap.put(str, new vz(file, str));
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                StringBuilder sbOooOO0 = rj.OooOO0(str);
                sbOooOO0.append(file2.getName());
                String string = sbOooOO0.toString();
                linkedHashMap.put(string, new vz(file2, string));
            } else {
                StringBuilder sbOooOO02 = rj.OooOO0(str);
                sbOooOO02.append(file2.getName());
                sbOooOO02.append("/");
                OooO0OO(file2, sbOooOO02.toString(), linkedHashMap);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.OooO0Oo) {
            case 0:
                ArrayList arrayList = (ArrayList) this.OooO0o;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    try {
                        ((Closeable) obj).close();
                    } catch (Exception unused) {
                    }
                }
                return;
            default:
                FileOutputStream fileOutputStream = (FileOutputStream) this.OooO0o0;
                try {
                    FileLock fileLock = (FileLock) this.OooO0o;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    if (fileOutputStream != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                }
        }
    }

    public /* synthetic */ pe() {
    }
}

package com.cmaster.cloner;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipFile;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class i12 extends gv0 {
    public final File OooOOOO;
    public final File OooOOOo;
    public final File OooOOo0;

    public i12(Context context, String str) {
        this.OooOOOO = new File(context.getFilesDir().getParentFile(), str.concat("/data/"));
        this.OooOOOo = new File(context.getExternalFilesDir(null).getParentFile(), str);
        this.OooOOo0 = new File(context.getExternalMediaDirs()[0], str);
    }

    public final void OooOOO0(File file) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<ZipArchiveEntry> entries = zipFile.getEntries();
            BufferedOutputStream bufferedOutputStream2 = null;
            Exception e = null;
            while (entries.hasMoreElements()) {
                ZipArchiveEntry zipArchiveEntryNextElement = entries.nextElement();
                BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipArchiveEntryNextElement));
                File file2 = zipArchiveEntryNextElement.getName().startsWith("internal/") ? new File(this.OooOOOO, zipArchiveEntryNextElement.getName().replace("internal/", "")) : zipArchiveEntryNextElement.getName().startsWith("external/") ? new File(this.OooOOOo, zipArchiveEntryNextElement.getName().replace("external/", "")) : zipArchiveEntryNextElement.getName().startsWith("media/") ? new File(this.OooOOo0, zipArchiveEntryNextElement.getName().replace("media/", "")) : null;
                if (file2 != null) {
                    if (zipArchiveEntryNextElement.isDirectory()) {
                        file2.mkdirs();
                        file2.setLastModified(zipArchiveEntryNextElement.getTime());
                    } else {
                        try {
                            file2.getParentFile().mkdirs();
                        } catch (Exception e2) {
                            e = e2;
                            bufferedOutputStream = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (file2.isDirectory()) {
                            file2.mkdirs();
                            ct2.OooO00o(bufferedInputStream);
                        } else {
                            boolean zCanWrite = file2.canWrite();
                            if (zCanWrite) {
                                file2.setWritable(true);
                            }
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                            try {
                                ct2.OooO0O0(bufferedInputStream, bufferedOutputStream);
                                bufferedOutputStream.close();
                                file2.setLastModified(zipArchiveEntryNextElement.getTime());
                                if (zCanWrite) {
                                    file2.setReadOnly();
                                }
                            } catch (Exception e3) {
                                e = e3;
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedOutputStream2 = bufferedOutputStream;
                                ct2.OooO00o(bufferedInputStream);
                                ct2.OooO00o(bufferedOutputStream2);
                                throw th;
                            }
                            ct2.OooO00o(bufferedInputStream);
                            ct2.OooO00o(bufferedOutputStream);
                            bufferedInputStream.close();
                        }
                    }
                }
            }
            zipFile.close();
            if (e == null) {
                OooOO0(wa1.OooO0o0(file));
            } else {
                OooOO0(wa1.OooO0OO(e));
            }
        } catch (IOException e4) {
            e4.printStackTrace();
            OooOO0(wa1.OooO0OO(e4));
        }
    }
}

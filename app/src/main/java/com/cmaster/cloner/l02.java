package com.cmaster.cloner;

import android.content.Context;
import java.io.File;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class l02 {
    public static final String OooO00o = ep0.OooO("WrkDbPathHelper");
    public static final String[] OooO0O0 = {"-journal", "-shm", "-wal"};

    public static void OooO00o(Context context) {
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            String str = OooO00o;
            ep0.OooO0oO().OooO0Oo(str, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap map = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            map.put(databasePath, file);
            for (String str2 : OooO0O0) {
                map.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : map.keySet()) {
                File file3 = (File) map.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        ep0.OooO0oO().OooOOO(str, String.format("Over-writing contents of %s", file3), new Throwable[0]);
                    }
                    ep0.OooO0oO().OooO0Oo(str, file2.renameTo(file3) ? String.format("Migrated %s to %s", file2, file3) : String.format("Renaming %s to %s failed", file2, file3), new Throwable[0]);
                }
            }
        }
    }
}

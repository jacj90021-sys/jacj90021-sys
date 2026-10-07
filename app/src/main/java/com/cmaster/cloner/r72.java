package com.cmaster.cloner;

import android.content.pm.PackageInfo;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class r72 {
    public static final je OooO00o = new je(11);

    public static void OooO00o(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void OooO0O0(android.content.Context r18, java.util.concurrent.Executor r19, com.cmaster.cloner.h51 r20, boolean r21) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 741
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cmaster.cloner.r72.OooO0O0(android.content.Context, java.util.concurrent.Executor, com.cmaster.cloner.h51, boolean):void");
    }
}

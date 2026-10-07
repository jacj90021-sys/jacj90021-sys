package com.cmaster.cloner;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class pr2 {
    public static void OooO00o(File[] fileArr) {
        ArrayList arrayList = new ArrayList(fileArr.length);
        arrayList.add(fileArr[0].getCanonicalPath());
        for (int i = 1; i < fileArr.length; i++) {
            try {
                arrayList.add(fileArr[i].getParentFile().getCanonicalPath());
            } catch (Throwable unused) {
            }
        }
    }

    public static void OooO0O0(File[] fileArr) {
        ArrayList arrayList = new ArrayList(fileArr.length);
        arrayList.add(fileArr[0].getCanonicalPath());
        for (int i = 1; i < fileArr.length; i++) {
            try {
                arrayList.add(fileArr[i].getCanonicalPath());
            } catch (Throwable unused) {
            }
        }
    }
}

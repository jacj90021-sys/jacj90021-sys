package com.cmaster.cloner;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class xx {
    public static void OooO00o(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor OooO0O0(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long OooO0OO(FileDescriptor fileDescriptor, long j, int i) {
        return Os.lseek(fileDescriptor, j, i);
    }
}

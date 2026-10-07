package com.cmaster.cloner;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes.dex */
public final class r01 implements FileFilter {
    static {
        DexUtils.classesInit0(17);
    }

    @Override // java.io.FileFilter
    public final native boolean accept(File file);
}

package com.cmaster.cloner;

import java.io.File;

/* loaded from: classes.dex */
public final class a21 {
    public final long OooO00o;
    public final long OooO0O0;
    public final String OooO0OO;

    static {
        DexUtils.classesInit0(40);
    }

    public a21(String str) {
        this.OooO00o = 0L;
        this.OooO0O0 = 0L;
        this.OooO0OO = str;
        File file = new File(str);
        if (file.exists()) {
            this.OooO00o = file.lastModified();
            this.OooO0O0 = file.length();
        }
    }

    public final native boolean equals(Object obj);

    public final native int hashCode();
}

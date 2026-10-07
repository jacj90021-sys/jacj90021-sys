package com.cmaster.cloner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class ak {
    public static final List OooO00o;

    static {
        try {
            Iterator it = Arrays.asList(new oO0O00O()).iterator();
            it.getClass();
            OooO00o = we1.OooO00o(new ph(new xe1(it)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

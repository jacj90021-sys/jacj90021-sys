package com.cmaster.cloner;

import android.os.BadParcelableException;
import android.os.NetworkOnMainThreadException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class hs2 {
    public static void OooO00o(Exception exc) {
        lw1.OooO();
        if (exc instanceof SecurityException) {
            throw ((SecurityException) exc);
        }
        if (exc instanceof BadParcelableException) {
            throw ((BadParcelableException) exc);
        }
        if (exc instanceof IllegalArgumentException) {
            throw ((IllegalArgumentException) exc);
        }
        if (exc instanceof NullPointerException) {
            throw ((NullPointerException) exc);
        }
        if (exc instanceof IllegalStateException) {
            throw ((IllegalStateException) exc);
        }
        if (exc instanceof NetworkOnMainThreadException) {
            throw ((NetworkOnMainThreadException) exc);
        }
        if (!(exc instanceof UnsupportedOperationException)) {
            throw new IllegalStateException(exc);
        }
        throw ((UnsupportedOperationException) exc);
    }
}

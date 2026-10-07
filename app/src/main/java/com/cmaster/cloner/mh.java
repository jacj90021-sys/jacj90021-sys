package com.cmaster.cloner;

import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class mh {
    public static void OooO00o() {
        Conscrypt.Version version = Conscrypt.version();
        if (version == null) {
            return;
        }
        if (version.major() != 2) {
            version.major();
        } else if (version.minor() != 1) {
            version.minor();
        } else {
            version.patch();
        }
    }
}

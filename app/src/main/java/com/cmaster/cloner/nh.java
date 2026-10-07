package com.cmaster.cloner;

import org.conscrypt.Conscrypt;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class nh implements vh1 {
    public static final /* synthetic */ int OooO00o = 0;

    static {
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, mh.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                mh.OooO00o();
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
    }
}

package com.cmaster.cloner;

import android.os.Bundle;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class w33 {
    public static final Bundle OooO00o(Bundle bundle, String str) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        ra.OooOOO(px0.OooOOOO("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }
}

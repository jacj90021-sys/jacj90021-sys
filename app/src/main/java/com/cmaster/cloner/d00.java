package com.cmaster.cloner;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class d00 extends m8 {
    public static final byte[] OooO0O0 = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(zk0.OooO00o);

    @Override // com.cmaster.cloner.zk0
    public final void OooO00o(MessageDigest messageDigest) {
        messageDigest.update(OooO0O0);
    }

    @Override // com.cmaster.cloner.m8
    public final Bitmap OooO0OO(k8 k8Var, Bitmap bitmap, int i, int i2) {
        return po1.OooO0O0(k8Var, bitmap, i, i2);
    }

    @Override // com.cmaster.cloner.zk0
    public final boolean equals(Object obj) {
        return obj instanceof d00;
    }

    @Override // com.cmaster.cloner.zk0
    public final int hashCode() {
        return 1572326941;
    }
}

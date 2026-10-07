package com.cmaster.cloner;

import android.util.Log;
import java.io.IOException;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class hm2 extends Exception {
    public final int OooO0Oo;

    public hm2(int i, String str) {
        super(str);
        this.OooO0Oo = i;
    }

    public final i10 OooO00o() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new i10(this.OooO0Oo, 0, super.getMessage());
    }

    public hm2(int i, IOException iOException, String str) {
        super(str, iOException);
        this.OooO0Oo = i;
    }
}

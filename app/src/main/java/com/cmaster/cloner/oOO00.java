package com.cmaster.cloner;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public class oOO00 extends Exception {
    public final Status OooO0Oo;

    /* JADX WARN: Illegal instructions before constructor call */
    public oOO00(Status status) {
        int i = status.OooO0Oo;
        String str = status.OooO0o0;
        super(i + ": " + (str == null ? "" : str));
        this.OooO0Oo = status;
    }
}

package com.cmaster.cloner;

import android.net.Uri;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class c10 {
    public final Uri OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final boolean OooO0Oo;
    public final int OooO0o;
    public final String OooO0o0;

    public c10(String str, String str2) {
        this.OooO00o = new Uri.Builder().scheme("systemfont").authority(str).build();
        this.OooO0O0 = 0;
        this.OooO0OO = 400;
        this.OooO0Oo = false;
        this.OooO0o0 = str2;
        this.OooO0o = 0;
    }

    public c10(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.OooO00o = uri;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = z;
        this.OooO0o0 = null;
        this.OooO0o = i3;
    }
}

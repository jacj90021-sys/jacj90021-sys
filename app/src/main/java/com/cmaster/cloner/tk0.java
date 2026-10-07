package com.cmaster.cloner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class tk0 implements wr1 {
    public static final SimpleDateFormat OooO00o;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        OooO00o = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // com.cmaster.cloner.yv
    public final void OooO00o(Object obj, Object obj2) {
        ((xr1) obj2).OooO0OO(OooO00o.format((Date) obj));
    }
}

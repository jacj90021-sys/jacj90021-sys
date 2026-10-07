package com.cmaster.cloner;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class sr0 implements iu0 {
    public final /* synthetic */ int OooO00o;
    public final Context OooO0O0;

    public sr0(Context context, int i) {
        this.OooO00o = i;
        switch (i) {
            case 1:
                this.OooO0O0 = context.getApplicationContext();
                break;
            case 2:
                this.OooO0O0 = context.getApplicationContext();
                break;
            default:
                this.OooO0O0 = context;
                break;
        }
    }

    @Override // com.cmaster.cloner.iu0
    public final boolean OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                return ew2.OooO00o((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return ew2.OooO00o(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return ew2.OooO00o(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        Long l;
        int i3 = this.OooO00o;
        Context context = this.OooO0O0;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new hu0(new by0(uri), new rr0(context, uri, 0));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new hu0(new by0(uri2), sz.OooO0O0(context, uri2, new bn1(context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) xz0Var.OooO0OO(vs1.OooO0Oo)) == null || l.longValue() != -1) {
                    return null;
                }
                return new hu0(new by0(uri3), sz.OooO0O0(context, uri3, new cn1(context.getContentResolver())));
        }
    }
}

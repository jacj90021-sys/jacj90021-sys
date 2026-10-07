package com.cmaster.cloner;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class nj1 implements iu0 {
    public final /* synthetic */ int OooO00o;
    public final iu0 OooO0O0;

    public /* synthetic */ nj1(iu0 iu0Var, int i) {
        this.OooO00o = i;
        this.OooO0O0 = iu0Var;
    }

    @Override // com.cmaster.cloner.iu0
    public final /* bridge */ /* synthetic */ boolean OooO00o(Object obj) {
        switch (this.OooO00o) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // com.cmaster.cloner.iu0
    public final hu0 OooO0O0(Object obj, int i, int i2, xz0 xz0Var) {
        Uri uriFromFile;
        int i3 = this.OooO00o;
        iu0 iu0Var = this.OooO0O0;
        switch (i3) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null || !iu0Var.OooO00o(uriFromFile)) {
                    return null;
                }
                return iu0Var.OooO0O0(uriFromFile, i, i2, xz0Var);
            default:
                return iu0Var.OooO0O0(new s50((URL) obj), i, i2, xz0Var);
        }
    }
}

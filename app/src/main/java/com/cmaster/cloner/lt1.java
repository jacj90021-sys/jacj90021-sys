package com.cmaster.cloner;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public abstract class lt1 {
    public static String[] OooO00o(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static ri OooO0O0(View view, ri riVar) {
        ContentInfo contentInfoOooOo0 = riVar.OooO00o.OooOo0();
        Objects.requireNonNull(contentInfoOooOo0);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoOooOo0);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoOooOo0 ? riVar : new ri(new o00OO000(contentInfoPerformReceiveContent));
    }
}
